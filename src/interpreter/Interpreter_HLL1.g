tree grammar Interpreter_HLL1;

options {
   	backtrack=true;
    tokenVocab=HLL1; // use the vocabulary from the parser
    ASTLabelType=CommonTree; // what kind of trees are we walking?
}

@header {
	package interpreter;
	import interpreter.tree.*;
	import interpreter.tree.nodes.*;
	import interpreter.tree.types.*;
	import java.util.Set;
}

@members {
 	Scope currentScope = null;
 	Enums enums = null;
 	MTypeDeclarationNode mtypes = null;
 	MessagePassing messagePassing = null;
 	int processId;
 	int numberOfProcesses;
  
	public Interpreter_HLL1(CommonTreeNodeStream nds, Scope sc, Enums en, MessagePassing mp, int id, int numOfP) {
		super(nds);
		currentScope = sc;
		enums = en;
		messagePassing = mp;
		processId = id;
		numberOfProcesses = numOfP;
		mtypes = new MTypeDeclarationNode(currentScope);
	}
}

algorithm returns [HLL1Node n]
	@after {
		$n.mtypes(mtypes);
	}:
	declarationBlock initialBlock receiveBlock? stepBlock
	{$n = new HLL1Node($declarationBlock.n, $initialBlock.n, $receiveBlock.n, $stepBlock.n);} ;

declarationBlock returns [Node n]
	@init {
	  DeclBlockNode declN = new DeclBlockNode();
	  $n = declN;
	}:
	^(VARIABLES_BLOCK (declaration {declN.addDeclaration($declaration.n);})*) ;

initialBlock returns [Node n]
	@init {
	  InitialBlockNode initN = new InitialBlockNode();
	  $n = initN;
	}:
	^(INIT_BLOCK (initialization {initN.addInitialization($initialization.n);})*);

receiveBlock returns [Node n]
	@init {
	  ReceiveBlockNode recN = new ReceiveBlockNode();
	  $n = recN;
	}:
	^(RECEIVE_BLOCK (received {recN.addReceiveNode($received.n);})*) ;

stepBlock returns [Node n]
	@init {
	  Scope stepScope = new Scope(currentScope);
	  currentScope = stepScope;
	  StepBlockNode step = new StepBlockNode();
	  $n = step;
	}
	@after {
	  currentScope = currentScope.parent();
	}:
	^(STEP_BLOCK (s=statement {step.addStatement($s.n);})*) ;

// declaration
declaration returns [Node n]
	:	a=variableDeclaration 	{$n = $a.n;}
	|	a=enumDeclaration		{$n = $a.n;}
	|	a=setDeclaration 		{$n = $a.n;} ;
	
variableDeclaration returns [Node n]:
	^(VARIABLE_DECLARATION type Identifier) {$n = new DeclarationNode($Identifier.text, $type.t, currentScope);} ;
	
setDeclaration returns [Node n]:
	^(SET_DECLARATION Identifier) {$n = new DeclarationNode($Identifier.text, new SetType(), currentScope);} ;
	
enumDeclaration returns [Node n]:
	^(ENUM_DECLARATION Identifier enumBody) {$enumBody.n.addTypeId($Identifier.text); $n = $enumBody.n;} ;

enumBody returns [EnumDeclarationNode n]
	@init{
		EnumDeclarationNode en = new EnumDeclarationNode(currentScope, enums);
		$n = en;	
	}:
	(Identifier {en.addElement($Identifier.text);})* ;

type returns [Type t]
	:	PrimitiveType 		{$t = new Type($PrimitiveType.text);}
	|	Identifier 			{$t = new Type($Identifier.text, enums);}	; // enum type


// initialization
initialization returns [Node n]
	:	variableInit 		{$n = $variableInit.n;}
	|	statement 			{$n = $statement.n;}	;
	
variableInit returns [Node n]:
	^(VARIABLE_INIT Identifier variableValue) {$n = new AssignmentNode($Identifier.text, $variableValue.n, currentScope);} ;
	
variableValue returns [Node n]
	:	PROC_COUNT			{$n = new AtomNode(numberOfProcesses);}
	|	PROC_ID				{$n = new AtomNode(processId);}
	|	detValue 					  {$n = $detValue.n;}
	|	a=nondetValue b=access_invocation {$a.n.setLambdaExpr($b.e);$n = $a.n;} ;
	
nondetValue returns [NondetInitNode n]
	@init {
	  NondetInitNode ndin = new NondetInitNode();
	  $n = ndin;
	}
	:	^(NONDET_INIT (detValue {ndin.addNondetValue($detValue.n);})+)
	| 	^(NONDET_RANGE_INIT a=detValue b=detValue {ndin.addNondetRange($a.n, $b.n); }) ;
	
detValue returns [Node n]
	:	literal 		{$n = $literal.n;}
	|	Identifier 		{$n = new IdentifierNode($Identifier.text, currentScope);} ;

// receive
received returns [Node n]
	@init {
	  Scope recScope = new Scope(currentScope);
	  currentScope = recScope;
	}
	@after {
	  currentScope = currentScope.parent();
	}:
	^(RECEIVE a=receive_tuple_signatur b=sender c=statement) {$b.n.initialize($a.n, $c.n, mtypes); $n = $b.n;} ;

sender returns [ReceiveNode n]
	:	^(DISTINCT_PROCESSES a=expression)	{$n = new ReceiveFromDistinctProcessesNode($a.n, messagePassing, processId, currentScope);}
	|	Identifier							{$n = new ReceiveFromAnyNode($Identifier.text, messagePassing, processId, currentScope);} ;
	
expression returns [Node n]
    :	assignment 									{$n = $assignment.n;}
	|   ^('and' a=expression b=expression)  		{$n = new AndNode($a.n, $b.n);}
    |   ^('or' a=expression b=expression)   		{$n = new OrNode($a.n, $b.n);}
	|	^('==' a=expression b=expression) 			{$n = new EqNode($a.n, $b.n);}
    |   ^('!=' a=expression b=expression)		 	{$n = new NEqNode($a.n, $b.n);}
    |   ^('<' a=expression b=expression)  			{$n = new LTNode($a.n, $b.n);}
    |   ^('>' a=expression b=expression)  			{$n = new GTNode($a.n, $b.n);}
    |   ^('<=' a=expression b=expression) 			{$n = new LTEqNode($a.n, $b.n);}
    |   ^('>=' a=expression b=expression) 			{$n = new GTEqNode($a.n, $b.n);}
    |   ^('+' a=expression b=expression) 			{$n = new AddNode($a.n, $b.n);}
    |   ^('-' a=expression b=expression) 			{$n = new SubtractNode($a.n, $b.n);}
    |   ^('*' a=expression b=expression) 			{$n = new MultNode($a.n, $b.n);}
    |   ^('/' a=expression b=expression) 			{$n = new DivNode($a.n, $b.n);}
    |   ^('%' a=expression b=expression) 			{$n = new ModNode($a.n, $b.n);}
    |	^(UNARY_EXPRESSION '+' a=expression) 		{$n = new UnaryPlusNode($a.n);}
    |	^(UNARY_EXPRESSION '-' a=expression) 		{$n = new UnaryMinusNode($a.n);}
    |	^(UNARY_EXPRESSION '!' a=expression) 		{$n = new NegateNode($a.n);}
    |	^(UNARY_EXPRESSION Identifier '++') 		{$n = new PostIncrementNode($Identifier.text, currentScope);}
    |	^(UNARY_EXPRESSION Identifier '--') 		{$n = new PostDecrementNode($Identifier.text, currentScope);}
    |	a=expression_set_invocation					{$n = $a.n;}
	|	a=operational_set_invocation				{$n = $a.n;}
    |	^(UNARY_EXPRESSION '++' Identifier) 		{$n = new PreIncrementNode($Identifier.text, currentScope);}
    |	^(UNARY_EXPRESSION '--' Identifier) 		{$n = new PreDecrementNode($Identifier.text, currentScope);}
    |	^(PRIMARY primary) 							{$n = $primary.n;} ;
    
expression_set_invocation returns [Node n]
	:	Identifier expression_invocation		{$expression_invocation.n.set($Identifier.text); $n = $expression_invocation.n;}
	|	a=filter_expression_invocation			{$n = $a.n;} ;
	
expression_invocation returns [BoolExpressionOnSetNode n]
	:	^(CONTAINS_INVOCATION setArgument)	 {$n = new ContainedInSetNode($setArgument.n, currentScope);}
	|	SIZE_INVOCATION 					 {$n = new SizeOfSetNode(currentScope);};
	
operational_set_invocation returns [Node n]
	:	Identifier a=operational_invocation		{$a.n.set($Identifier.text); $n = $a.n;} ;
	
set_invocation returns [SetNode n]
	:	^(SET_INVOCATION Identifier)			{$n = new IdentifierSet($Identifier.text, currentScope); }
	|	^(SET_INVOCATION filter_set_invocation) {$n = $filter_set_invocation.n; } ;
	
filter_expression_invocation returns [Node n]:
	a=filter_set_invocation b=expression_invocation {$n = new OperationOnFilteredSetNode($a.n, $b.n);} ;
	
filter_set_invocation returns [FilterSet n]:
	Identifier a=filter_invocation 				{$n = new FilterSet($Identifier.text, $a.e, currentScope);}  ;

filter_invocation returns [LambdaExpr e]:
	^(FILTER_INVOCATION a=lambda_expression ) 	{$e = $a.e;}  ;

operational_invocation returns [OperationOnSetNode n]
	:	^(INSERT_INVOCATION setArgument) {$n = new InsertInSetNode($setArgument.n, currentScope);}
	|	^(REMOVE_INVOCATION setArgument) {$n = new RemoveFromSetNode($setArgument.n, currentScope);} ;

access_set_invocation returns [AccessSet n]:
	Identifier a=access_invocation {$n = new AccessSet($Identifier.text, $a.e, currentScope);} ;

access_invocation returns [LambdaExpr e]
	:	ACCESS_INVOCATION {$e = new LambdaExpr();} 
	|	^(ACCESS_INVOCATION a=lambda_expression) {$e = $a.e;} ;

    
lambda_expression returns [LambdaExpr e]
	@init {
	  Scope lambdaScope = new Scope(currentScope);
	  currentScope = lambdaScope;
	}
	@after {
	  currentScope = currentScope.parent();
	}:
	^(LAMBDA_EXPRESSION a=tuple_signatur b=expression ) {$e = new LambdaExpr($a.n, $b.n, currentScope);} ;

tuple_signatur returns [TupleSignatur n]
	@init {
		TupleSignatur tn = new TupleSignatur();
		n = tn;
	}
	:	Identifier				{tn.addIdentifier($Identifier.text);}
	|	^(SIGNATUR (Identifier 	{tn.addIdentifier($Identifier.text);})+) ;

receive_tuple_signatur returns [ReceiveTupleSignatur n]
	@init {
		ReceiveTupleSignatur tn = new ReceiveTupleSignatur();
		n = tn;
	}
	:	Identifier				{tn.addMType($Identifier.text);}
	|	^(SIGNATUR (a=Identifier {tn.addMType($a.text);}) (b=Identifier {tn.addIdentifier($b.text);})*) ;


assignment returns [Node n]
	:	^('=' Identifier a=expression)
				{$n = new AssignmentNode($Identifier.text, $a.n, currentScope);}
	|	^('+=' Identifier a=expression) 
				{$n = new AssignmentNode($Identifier.text, new AddNode(new IdentifierNode($Identifier.text, currentScope), $a.n), currentScope);}
	|	^('-=' Identifier a=expression) 
				{$n = new AssignmentNode($Identifier.text, new SubtractNode(new IdentifierNode($Identifier.text, currentScope), $a.n), currentScope);}
	|	^('*=' Identifier a=expression) 
				{$n = new AssignmentNode($Identifier.text, new MultNode(new IdentifierNode($Identifier.text, currentScope), $a.n), currentScope);}
	|	^('/=' Identifier a=expression)
				{$n = new AssignmentNode($Identifier.text, new DivNode(new IdentifierNode($Identifier.text, currentScope), $a.n), currentScope);} 
	|	^('%=' Identifier a=expression)
				{$n = new AssignmentNode($Identifier.text, new ModNode(new IdentifierNode($Identifier.text, currentScope), $a.n), currentScope);} ;
	
setArgument returns [TupleNode n]
	:	primary 	{$n = new TupleNode($primary.n);}
	|	tuple 		{$n = $tuple.n;} ;

tuple returns [TupleNode n]
	@init {
	  TupleNode tn = new TupleNode();
	  n = tn;
	}:
	^(ARGUMENTS (primary {tn.addTupleObject($primary.n);})+) ;
	
primary returns [Node n]
	:	Identifier 		{$n = new IdentifierNode($Identifier.text, currentScope);}
	|	literal 		{$n = $literal.n;} ;
	
literal returns [Node n]
	:	BooleanLiteral 	{$n = new AtomNode(Boolean.parseBoolean($BooleanLiteral.text));}
	|	IntegerLiteral 	{$n = new AtomNode(Integer.parseInt($IntegerLiteral.text));} ;
    
// step
statement returns [Node n]
    :	block 				{$n = $block.n;}
    |	HALT				{$n = new HaltNode();}
    |	sendTo				{$n = $sendTo.n;}
    |   if_statement 		{$n = $if_statement.n;}
    |	for_statement 		{$n = $for_statement.n;}
    |	local_variable		{$n = $local_variable.n;}
    |   expression  		{$n = $expression.n;} ;
    
block returns [Node n]:	
	^(BLOCK (statement_list {$n = $statement_list.n;})?);
    	
statement_list returns [Node n]
	@init {
	  BlockNode bn = new BlockNode();
	  n = bn;
	  Scope local = new Scope(currentScope);
	  currentScope = local;
	}
	@after {
	  currentScope = currentScope.parent();
	}:
    (statement {bn.addStatement($statement.n);})+ ;
    
if_statement returns [Node n]:
    ^(IF expression statement else_statement?)
	{$n = new IfNode($expression.n, $statement.n, $else_statement.n);} ;
    
else_statement returns [Node n]:
    ^(ELSE statement) {$n = $statement.n;};
    
for_statement returns [Node n]
	@init {
	  Scope forScope = new Scope(currentScope);
	  currentScope = forScope;
	}
	@after {
	  currentScope = currentScope.parent();
	}
	:   ^(FOR forControl statement) 			{$forControl.n.addBlock($statement.n, currentScope);$n = $forControl.n;}
	|	^(FOREACH foreachControl statement)		{$foreachControl.n.addBlock($statement.n, currentScope);$n = $foreachControl.n;}
	;
    
forControl returns [ForNode n]
	:	//^(FOR_CONTROL forInit? a=expression? b=expression?) {$forInit.n.addStopExpr($a.n);$forInit.n.addUpdateExpr($b.n);$n = $forInit.n;}	|	
	^(FOR_CONTROL forInit a=expression) {$forInit.n.addStopExpr($a.n);$n = $forInit.n;} ;

forInit returns [ForNode n]
	:	^('=' Identifier a=expression) 	{$n = new ForNode($Identifier.text, $a.n);}
	|	Identifier 						{$n = new ForNode($Identifier.text);};
	
local_variable returns [Node n]:
	^(LOCAL_VARIABLE a=tuple_signatur b=access_set_invocation)	{$n = new LocalVariableNode($a.n, $b.n, currentScope);} ;
	
foreachControl returns [ForEachNode n]:
	^(FOREACH_CONTROL a=tuple_signatur  b=set_invocation) {$n = new ForEachNode($a.n, $b.n);} ;
	
sendTo returns [Node n]
	@init {
	  SendNode sn = new SendNode(messagePassing, processId);
	  n = sn;
	}
	:	^(SEND sendTuple ALL)			{sn.sendToAll($sendTuple.n);}
	|	^(SEND sendTuple a=expression)	{sn.sendTo($sendTuple.n, $a.n);} ;
	
sendTuple returns [SendTupleNode n]
	@init {
	  SendTupleNode tn = new SendTupleNode();
	  n = tn;
	}:
	^(ARGUMENTS (a=mtype {tn.addMType($a.n);}) (b=primary {tn.addTupleObject($b.n);})*) ;
	
mtype returns [MTypeNode n]:
	Identifier {$n = new MTypeNode($Identifier.text, mtypes, currentScope);} ;