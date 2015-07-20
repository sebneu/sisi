grammar HLL1;

options {
   	backtrack=true;
   	memoize=true;
	output=AST;
	ASTLabelType=CommonTree;
}

tokens
{
	VARIABLES_BLOCK;
	INIT_BLOCK;
	RECEIVE_BLOCK;
	STEP_BLOCK;
    ARGUMENTS;
    ASSIGNMENT;
    BLOCK;
    ELSE;
    EXPRESSION;
    CONDITIONAL_EXPRESSION;
    LOCAL_VARIABLE;
    ID;
    IF;
    PRIMARY;
    UNARY_EXPRESSION;
    VARIABLE_DECLARATION;
    VARIABLE_INIT;
    NONDET_INIT;
    NONDET_RANGE_INIT;
    SET_DECLARATION;
    ENUM_DECLARATION;
    PRIMITIVE_TYPE;
    FOR;
    FOR_CONTROL;
    FOREACH;
    FOREACH_CONTROL;
    SEND;
    RECEIVE;   
    INVOCATION;  
    CONTAINS_INVOCATION;
    SIZE_INVOCATION;
    INSERT_INVOCATION;
    REMOVE_INVOCATION;
    ACCESS_INVOCATION;
    FILTER_INVOCATION;
    LAMBDA_EXPRESSION;
    SET_INVOCATION;
    DISTINCT_PROCESSES;
    ALL;
    HALT;
    SIGNATUR;
    PROC_COUNT;
    PROC_ID;
}

@header {package interpreter;}
@lexer::header {package interpreter;}

algorithm_toString:
	algorithm {System.out.println(
                $algorithm.tree==null?"null":$algorithm.tree.toStringTree());} ;
algorithm:
	declarationBlock initialBlock receiveBlock? stepBlock ;
	
// Declaration ////////////////////////
declarationBlock:
	('Variables' | 'variables' | 'VARIABLES') ':'? declaration* -> ^(VARIABLES_BLOCK declaration*);
	
declaration
	:	variableDeclaration ';'!
	|	enumDeclaration ';'!
	|	setDeclaration ';'!
	;
	
variableDeclaration:
	type Identifier -> ^(VARIABLE_DECLARATION type Identifier) ;
	
setDeclaration:
	'Set' Identifier -> ^(SET_DECLARATION Identifier);
	
enumDeclaration
	:	'enum'   Identifier enumBody
	-> ^(ENUM_DECLARATION Identifier enumBody);
	
enumBody
	:	'{'! (enumMemberDeclarations ','!?)?   '}'! ;
	
enumMemberDeclarations
	:	enumMemberDeclaration (','! enumMemberDeclaration)* ;
    
enumMemberDeclaration
	:    Identifier ;
///////////////////////////////////////

// Initialization /////////////////////
initialBlock:
	('Init' | 'init' | 'INIT' |'Initialisation' | 'Initialization' | 'initialisation' |'initialization' | 'INITIALISATION' | 'INITIALIZATION') ':'? initialization* -> ^(INIT_BLOCK initialization*) ;
	
initialization
	:	variableInit ';'!
	|	statement
	//|	setInit ';'
	;
	
variableInit:
	Identifier '=' variableValue -> ^(VARIABLE_INIT Identifier variableValue) ;
	
	
variableValue
	:	('ProcCount' | 'PROC_COUNT') 	-> PROC_COUNT
	|	('ProcId' | 'PROC_ID') 			-> PROC_ID 
	|	detValue
	|	'['! nondetValue ']'! '.'! access_invocation  ;
	
nondetValue
	:	detValue (',' detValue)* -> ^(NONDET_INIT detValue+)
	| 	(	detValue '..' detValue
		| 	detValue '...' detValue
		) -> ^(NONDET_RANGE_INIT detValue detValue ); 
	
detValue
	:	literal
	|	Identifier ;
	
//////////////////////////////////////

// Receive ///////////////////////////
receiveBlock:
	('Receive' | 'receive' | 'RECEIVE') ':'? received* -> ^(RECEIVE_BLOCK received*) ;
//////////////////////////////////////

// Step //////////////////////////////
stepBlock:
	('Step' | 'step' | 'STEP') ':'? statement* -> ^(STEP_BLOCK statement*) ;
//////////////////////////////////////
	
// Statement //////////////////////////////
    
statement
    :	block
    |	'halt' ';' -> HALT
    |	sendTo ';'!
    |   if_statement
    |	for_statement
    |	local_variable
    |   ';'!
    |   expression ';'!
    ;
    
block:	
	'{' statement_list? '}' 
	 -> ^(BLOCK statement_list?);
    	
statement_list:
    statement+ ;
    
if_statement:
    'if' expression 'then' statement else_statement? 
    -> ^(IF expression statement else_statement?) ;
    
else_statement:
    'else' statement
	-> ^(ELSE statement) ;
    
for_statement
	:   'for' '(' forControl ')' statement -> ^(FOR forControl statement)
	|	'foreach' foreachControl statement -> ^(FOREACH foreachControl statement)
	;
    
forControl
	:	//forInit? ';' expression? ';' expression? -> ^(FOR_CONTROL forInit? expression? expression?) |
		(	forInit '..' expression
		|	forInit '...' expression
		)	-> ^(FOR_CONTROL forInit expression) ;

forInit:
	Identifier ('='^ expression)? ;
	
local_variable:
	'let' tuple_signatur_list '=' access_set_invocation -> ^(LOCAL_VARIABLE tuple_signatur_list access_set_invocation);
	
foreachControl:
	anonymous_function_signature 'in' set_invocation -> ^(FOREACH_CONTROL anonymous_function_signature  set_invocation) ;
////////////////////////////////////

// Sets ////////////////////////////
set_invocation
	:	Identifier -> ^(SET_INVOCATION Identifier)
	|	filter_set_invocation -> ^(SET_INVOCATION filter_set_invocation) ;

expression_set_invocation
	:	Identifier '.'! expression_invocation
	|	filter_expression_invocation ;
	
expression_invocation
	:	'contains' '(' setArgument ')' -> ^(CONTAINS_INVOCATION setArgument)
	|	'size' -> ^(SIZE_INVOCATION);
	
operational_set_invocation
	:	Identifier '.'! operational_invocation ;
	
operational_invocation
	:	'insert' '(' setArgument ')' -> ^(INSERT_INVOCATION setArgument)
	|	'remove' '(' setArgument ')' -> ^(REMOVE_INVOCATION setArgument) ;

access_set_invocation:
	Identifier '.'! access_invocation ;
	
access_invocation
	:	'some' '(' ')' -> ACCESS_INVOCATION
	|	'some' '(' lambda_expression ')' -> ^(ACCESS_INVOCATION lambda_expression) ;
	
filter_set_invocation:
	Identifier '.'! filter_invocation  ;
	
filter_expression_invocation:
	filter_set_invocation '.'! expression_invocation ;

filter_invocation:
	'filter' '(' lambda_expression ')' -> ^(FILTER_INVOCATION lambda_expression )  ;
	
lambda_expression:
	anonymous_function_signature ':' anonymous_function_body
	-> ^(LAMBDA_EXPRESSION anonymous_function_signature anonymous_function_body );
	
anonymous_function_signature
	:	Identifier
	|	tuple_signatur ;
	
receive_anonymous_function_signature
	:	Identifier
	|	receive_tuple_signatur ;
	
tuple_signatur
	:	'<'! tuple_signatur_list '>'! ;
	
receive_tuple_signatur
	:	'<'! receive_tuple_signatur_list '>'! ;
	
tuple_signatur_list
	:	Identifier (',' Identifier)*
	->  ^(SIGNATUR Identifier+) ;
	
receive_tuple_signatur_list
	:	Identifier (',' Identifier)*
	->  ^(SIGNATUR Identifier+) ;
	
anonymous_function_body:
	expression;
	
setArgument
	:	argument
	|	tuple ;
////////////////////////////////////

// Expressions /////////////////////
expression
	:	conditional_or_expression
    |	assignment
    ;

assignment:
	Identifier assignment_operator^ expression;
		
unary_expression
	:	'+'   primary_expression -> ^(UNARY_EXPRESSION '+' primary_expression) 
    |	'-'   primary_expression -> ^(UNARY_EXPRESSION '-' primary_expression)
    |	'!'   primary_expression -> ^(UNARY_EXPRESSION '!' primary_expression)
    |	pre_increment_expression
    |	pre_decrement_expression
    |	Identifier '++' -> ^(UNARY_EXPRESSION Identifier '++')
    |	Identifier '--' -> ^(UNARY_EXPRESSION Identifier '--')
    |	primary_expression ;

primary_expression
	:	expression_set_invocation
	|	operational_set_invocation
    |	paren_expression 
    |	primary -> ^(PRIMARY primary) ;
    
primary
	:	Identifier
	|	literal
	;
    
paren_expression:
	'('!   expression   ')'! ;

assignment_operator:
    '=' | '+=' | '-=' | '*=' | '/=' | '%=' ;
    
pre_increment_expression:
	'++' Identifier -> ^(UNARY_EXPRESSION '++' Identifier);
    
pre_decrement_expression:
	'--' Identifier -> ^(UNARY_EXPRESSION '--' Identifier);
    
variable_reference:
	expression ;
    
multiplicative_expression:
    unary_expression (('*'^|'/'^|'%'^)   unary_expression)* ;
    
additive_expression:
    multiplicative_expression (('+'^|'-'^)   multiplicative_expression)* ;
    
relational_expression:
	additive_expression (('<'^|'>'^|'<='^|'>='^) additive_expression)* ;
    
equality_expression:
    relational_expression  (('=='^|'!='^)   relational_expression)* ;
    
conditional_and_expression:
    equality_expression   ('and'^   equality_expression)* ;
    
conditional_or_expression:
    conditional_and_expression  ('or'^   conditional_and_expression)* ;
    
//conditional_expression:
//    conditional_or_expression ('?'^ expression ':'^ expression)? ;
///////////////////////////////////////
	
	
// messages ///////////////////////////
message
	:	sendTo
	|	received
	;
	
sendTo:	
	'send' sendTuple 'to' receiver -> ^(SEND sendTuple receiver);
	
received
	:	'on receive' receive_anonymous_function_signature 'from' sender ':' statement -> ^(RECEIVE receive_anonymous_function_signature sender statement);
	
	
receiver
	:	'all' -> ^(ALL)
	|	pID
	;
	
sender
	:	expression 'distinct processes' -> ^(DISTINCT_PROCESSES expression)
	|	pID
	;
	
pID	:
		Identifier ;

tuple
	:	'<'! tuple_list '>'! ;
	
tuple_list
	:	argument (',' argument)*
	->  ^(ARGUMENTS argument+) ;
	
argument
	:    argument_name ;
	
argument_name
	:    primary ;
	
sendTuple
	:	'<'! send_tuple_list '>'! ;
	
send_tuple_list
	:	mtype (',' argument)*
	->  ^(ARGUMENTS mtype argument*) ;
////////////////////////////////////

literal
	:	BooleanLiteral
	|	IntegerLiteral
	;
	
type
	:	PrimitiveType
	|	enumType
	;
	
mtype:
	Identifier;
	
enumType:
	Identifier;
	
PrimitiveType
    :   'boolean'
    |   'int'
    |	'mtype'
    ;
    
BooleanLiteral
	:	'TRUE'
	|	'FALSE'
	;
	
IntegerLiteral
	: ('0' | '1'..'9' '0'..'9'*) ;
    
Identifier
    :   ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
	    | '\t'
	    | '\r'
	    | '\n'
	    )+ {$channel=HIDDEN;}
    ;