// $ANTLR 3.5 interpreter/Interpreter_HLL1.g 2013-06-12 17:22:07

	package interpreter;
	import interpreter.tree.*;
	import interpreter.tree.nodes.*;
	import interpreter.tree.types.*;
	import java.util.Set;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class Interpreter_HLL1 extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACCESS_INVOCATION", "ALL", "ARGUMENTS", 
		"ASSIGNMENT", "BLOCK", "BooleanLiteral", "COMMENT", "CONDITIONAL_EXPRESSION", 
		"CONTAINS_INVOCATION", "DISTINCT_PROCESSES", "ELSE", "ENUM_DECLARATION", 
		"EXPRESSION", "FILTER_INVOCATION", "FOR", "FOREACH", "FOREACH_CONTROL", 
		"FOR_CONTROL", "HALT", "ID", "IF", "INIT_BLOCK", "INSERT_INVOCATION", 
		"INVOCATION", "Identifier", "IntegerLiteral", "LAMBDA_EXPRESSION", "LOCAL_VARIABLE", 
		"NONDET_INIT", "NONDET_RANGE_INIT", "PRIMARY", "PRIMITIVE_TYPE", "PROC_COUNT", 
		"PROC_ID", "PrimitiveType", "RECEIVE", "RECEIVE_BLOCK", "REMOVE_INVOCATION", 
		"SEND", "SET_DECLARATION", "SET_INVOCATION", "SIGNATUR", "SIZE_INVOCATION", 
		"STEP_BLOCK", "UNARY_EXPRESSION", "VARIABLES_BLOCK", "VARIABLE_DECLARATION", 
		"VARIABLE_INIT", "WS", "'!'", "'!='", "'%'", "'%='", "'('", "')'", "'*'", 
		"'*='", "'+'", "'++'", "'+='", "','", "'-'", "'--'", "'-='", "'.'", "'..'", 
		"'...'", "'/'", "'/='", "':'", "';'", "'<'", "'<='", "'='", "'=='", "'>'", 
		"'>='", "'INIT'", "'INITIALISATION'", "'INITIALIZATION'", "'Init'", "'Initialisation'", 
		"'Initialization'", "'PROC_COUNT'", "'PROC_ID'", "'ProcCount'", "'ProcId'", 
		"'RECEIVE'", "'Receive'", "'STEP'", "'Set'", "'Step'", "'VARIABLES'", 
		"'Variables'", "'['", "']'", "'all'", "'and'", "'contains'", "'distinct processes'", 
		"'else'", "'enum'", "'filter'", "'for'", "'foreach'", "'from'", "'halt'", 
		"'if'", "'in'", "'init'", "'initialisation'", "'initialization'", "'insert'", 
		"'let'", "'on receive'", "'or'", "'receive'", "'remove'", "'send'", "'size'", 
		"'some'", "'step'", "'then'", "'to'", "'variables'", "'{'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int T__73=73;
	public static final int T__74=74;
	public static final int T__75=75;
	public static final int T__76=76;
	public static final int T__77=77;
	public static final int T__78=78;
	public static final int T__79=79;
	public static final int T__80=80;
	public static final int T__81=81;
	public static final int T__82=82;
	public static final int T__83=83;
	public static final int T__84=84;
	public static final int T__85=85;
	public static final int T__86=86;
	public static final int T__87=87;
	public static final int T__88=88;
	public static final int T__89=89;
	public static final int T__90=90;
	public static final int T__91=91;
	public static final int T__92=92;
	public static final int T__93=93;
	public static final int T__94=94;
	public static final int T__95=95;
	public static final int T__96=96;
	public static final int T__97=97;
	public static final int T__98=98;
	public static final int T__99=99;
	public static final int T__100=100;
	public static final int T__101=101;
	public static final int T__102=102;
	public static final int T__103=103;
	public static final int T__104=104;
	public static final int T__105=105;
	public static final int T__106=106;
	public static final int T__107=107;
	public static final int T__108=108;
	public static final int T__109=109;
	public static final int T__110=110;
	public static final int T__111=111;
	public static final int T__112=112;
	public static final int T__113=113;
	public static final int T__114=114;
	public static final int T__115=115;
	public static final int T__116=116;
	public static final int T__117=117;
	public static final int T__118=118;
	public static final int T__119=119;
	public static final int T__120=120;
	public static final int T__121=121;
	public static final int T__122=122;
	public static final int T__123=123;
	public static final int T__124=124;
	public static final int T__125=125;
	public static final int T__126=126;
	public static final int T__127=127;
	public static final int T__128=128;
	public static final int T__129=129;
	public static final int T__130=130;
	public static final int ACCESS_INVOCATION=4;
	public static final int ALL=5;
	public static final int ARGUMENTS=6;
	public static final int ASSIGNMENT=7;
	public static final int BLOCK=8;
	public static final int BooleanLiteral=9;
	public static final int COMMENT=10;
	public static final int CONDITIONAL_EXPRESSION=11;
	public static final int CONTAINS_INVOCATION=12;
	public static final int DISTINCT_PROCESSES=13;
	public static final int ELSE=14;
	public static final int ENUM_DECLARATION=15;
	public static final int EXPRESSION=16;
	public static final int FILTER_INVOCATION=17;
	public static final int FOR=18;
	public static final int FOREACH=19;
	public static final int FOREACH_CONTROL=20;
	public static final int FOR_CONTROL=21;
	public static final int HALT=22;
	public static final int ID=23;
	public static final int IF=24;
	public static final int INIT_BLOCK=25;
	public static final int INSERT_INVOCATION=26;
	public static final int INVOCATION=27;
	public static final int Identifier=28;
	public static final int IntegerLiteral=29;
	public static final int LAMBDA_EXPRESSION=30;
	public static final int LOCAL_VARIABLE=31;
	public static final int NONDET_INIT=32;
	public static final int NONDET_RANGE_INIT=33;
	public static final int PRIMARY=34;
	public static final int PRIMITIVE_TYPE=35;
	public static final int PROC_COUNT=36;
	public static final int PROC_ID=37;
	public static final int PrimitiveType=38;
	public static final int RECEIVE=39;
	public static final int RECEIVE_BLOCK=40;
	public static final int REMOVE_INVOCATION=41;
	public static final int SEND=42;
	public static final int SET_DECLARATION=43;
	public static final int SET_INVOCATION=44;
	public static final int SIGNATUR=45;
	public static final int SIZE_INVOCATION=46;
	public static final int STEP_BLOCK=47;
	public static final int UNARY_EXPRESSION=48;
	public static final int VARIABLES_BLOCK=49;
	public static final int VARIABLE_DECLARATION=50;
	public static final int VARIABLE_INIT=51;
	public static final int WS=52;

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public Interpreter_HLL1(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public Interpreter_HLL1(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return Interpreter_HLL1.tokenNames; }
	@Override public String getGrammarFileName() { return "interpreter/Interpreter_HLL1.g"; }


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



	// $ANTLR start "algorithm"
	// interpreter/Interpreter_HLL1.g:36:1: algorithm returns [HLL1Node n] : declarationBlock initialBlock ( receiveBlock )? stepBlock ;
	public final HLL1Node algorithm() throws RecognitionException {
		HLL1Node n = null;


		Node declarationBlock1 =null;
		Node initialBlock2 =null;
		Node receiveBlock3 =null;
		Node stepBlock4 =null;

		try {
			// interpreter/Interpreter_HLL1.g:39:3: ( declarationBlock initialBlock ( receiveBlock )? stepBlock )
			// interpreter/Interpreter_HLL1.g:40:2: declarationBlock initialBlock ( receiveBlock )? stepBlock
			{
			pushFollow(FOLLOW_declarationBlock_in_algorithm68);
			declarationBlock1=declarationBlock();
			state._fsp--;
			if (state.failed) return n;
			pushFollow(FOLLOW_initialBlock_in_algorithm70);
			initialBlock2=initialBlock();
			state._fsp--;
			if (state.failed) return n;
			// interpreter/Interpreter_HLL1.g:40:32: ( receiveBlock )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==RECEIVE_BLOCK) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// interpreter/Interpreter_HLL1.g:40:32: receiveBlock
					{
					pushFollow(FOLLOW_receiveBlock_in_algorithm72);
					receiveBlock3=receiveBlock();
					state._fsp--;
					if (state.failed) return n;
					}
					break;

			}

			pushFollow(FOLLOW_stepBlock_in_algorithm75);
			stepBlock4=stepBlock();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = new HLL1Node(declarationBlock1, initialBlock2, receiveBlock3, stepBlock4);}
			}

			if ( state.backtracking==0 ) {
					n.mtypes(mtypes);
				}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "algorithm"



	// $ANTLR start "declarationBlock"
	// interpreter/Interpreter_HLL1.g:43:1: declarationBlock returns [Node n] : ^( VARIABLES_BLOCK ( declaration )* ) ;
	public final Node declarationBlock() throws RecognitionException {
		Node n = null;


		Node declaration5 =null;


			  DeclBlockNode declN = new DeclBlockNode();
			  n = declN;
			
		try {
			// interpreter/Interpreter_HLL1.g:47:3: ( ^( VARIABLES_BLOCK ( declaration )* ) )
			// interpreter/Interpreter_HLL1.g:48:2: ^( VARIABLES_BLOCK ( declaration )* )
			{
			match(input,VARIABLES_BLOCK,FOLLOW_VARIABLES_BLOCK_in_declarationBlock98); if (state.failed) return n;
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); if (state.failed) return n;
				// interpreter/Interpreter_HLL1.g:48:20: ( declaration )*
				loop2:
				while (true) {
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==ENUM_DECLARATION||LA2_0==SET_DECLARATION||LA2_0==VARIABLE_DECLARATION) ) {
						alt2=1;
					}

					switch (alt2) {
					case 1 :
						// interpreter/Interpreter_HLL1.g:48:21: declaration
						{
						pushFollow(FOLLOW_declaration_in_declarationBlock101);
						declaration5=declaration();
						state._fsp--;
						if (state.failed) return n;
						if ( state.backtracking==0 ) {declN.addDeclaration(declaration5);}
						}
						break;

					default :
						break loop2;
					}
				}

				match(input, Token.UP, null); if (state.failed) return n;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "declarationBlock"



	// $ANTLR start "initialBlock"
	// interpreter/Interpreter_HLL1.g:50:1: initialBlock returns [Node n] : ^( INIT_BLOCK ( initialization )* ) ;
	public final Node initialBlock() throws RecognitionException {
		Node n = null;


		Node initialization6 =null;


			  InitialBlockNode initN = new InitialBlockNode();
			  n = initN;
			
		try {
			// interpreter/Interpreter_HLL1.g:54:3: ( ^( INIT_BLOCK ( initialization )* ) )
			// interpreter/Interpreter_HLL1.g:55:2: ^( INIT_BLOCK ( initialization )* )
			{
			match(input,INIT_BLOCK,FOLLOW_INIT_BLOCK_in_initialBlock126); if (state.failed) return n;
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); if (state.failed) return n;
				// interpreter/Interpreter_HLL1.g:55:15: ( initialization )*
				loop3:
				while (true) {
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==BLOCK||(LA3_0 >= FOR && LA3_0 <= FOREACH)||LA3_0==HALT||LA3_0==IF||LA3_0==Identifier||LA3_0==LOCAL_VARIABLE||LA3_0==PRIMARY||LA3_0==SEND||LA3_0==UNARY_EXPRESSION||LA3_0==VARIABLE_INIT||(LA3_0 >= 54 && LA3_0 <= 56)||(LA3_0 >= 59 && LA3_0 <= 61)||LA3_0==63||LA3_0==65||LA3_0==67||(LA3_0 >= 71 && LA3_0 <= 72)||(LA3_0 >= 75 && LA3_0 <= 80)||LA3_0==101||LA3_0==119) ) {
						alt3=1;
					}

					switch (alt3) {
					case 1 :
						// interpreter/Interpreter_HLL1.g:55:16: initialization
						{
						pushFollow(FOLLOW_initialization_in_initialBlock129);
						initialization6=initialization();
						state._fsp--;
						if (state.failed) return n;
						if ( state.backtracking==0 ) {initN.addInitialization(initialization6);}
						}
						break;

					default :
						break loop3;
					}
				}

				match(input, Token.UP, null); if (state.failed) return n;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "initialBlock"



	// $ANTLR start "receiveBlock"
	// interpreter/Interpreter_HLL1.g:57:1: receiveBlock returns [Node n] : ^( RECEIVE_BLOCK ( received )* ) ;
	public final Node receiveBlock() throws RecognitionException {
		Node n = null;


		Node received7 =null;


			  ReceiveBlockNode recN = new ReceiveBlockNode();
			  n = recN;
			
		try {
			// interpreter/Interpreter_HLL1.g:61:3: ( ^( RECEIVE_BLOCK ( received )* ) )
			// interpreter/Interpreter_HLL1.g:62:2: ^( RECEIVE_BLOCK ( received )* )
			{
			match(input,RECEIVE_BLOCK,FOLLOW_RECEIVE_BLOCK_in_receiveBlock153); if (state.failed) return n;
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); if (state.failed) return n;
				// interpreter/Interpreter_HLL1.g:62:18: ( received )*
				loop4:
				while (true) {
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==RECEIVE) ) {
						alt4=1;
					}

					switch (alt4) {
					case 1 :
						// interpreter/Interpreter_HLL1.g:62:19: received
						{
						pushFollow(FOLLOW_received_in_receiveBlock156);
						received7=received();
						state._fsp--;
						if (state.failed) return n;
						if ( state.backtracking==0 ) {recN.addReceiveNode(received7);}
						}
						break;

					default :
						break loop4;
					}
				}

				match(input, Token.UP, null); if (state.failed) return n;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "receiveBlock"



	// $ANTLR start "stepBlock"
	// interpreter/Interpreter_HLL1.g:64:1: stepBlock returns [Node n] : ^( STEP_BLOCK (s= statement )* ) ;
	public final Node stepBlock() throws RecognitionException {
		Node n = null;


		Node s =null;


			  Scope stepScope = new Scope(currentScope);
			  currentScope = stepScope;
			  StepBlockNode step = new StepBlockNode();
			  n = step;
			
		try {
			// interpreter/Interpreter_HLL1.g:73:3: ( ^( STEP_BLOCK (s= statement )* ) )
			// interpreter/Interpreter_HLL1.g:74:2: ^( STEP_BLOCK (s= statement )* )
			{
			match(input,STEP_BLOCK,FOLLOW_STEP_BLOCK_in_stepBlock187); if (state.failed) return n;
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); if (state.failed) return n;
				// interpreter/Interpreter_HLL1.g:74:15: (s= statement )*
				loop5:
				while (true) {
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==BLOCK||(LA5_0 >= FOR && LA5_0 <= FOREACH)||LA5_0==HALT||LA5_0==IF||LA5_0==Identifier||LA5_0==LOCAL_VARIABLE||LA5_0==PRIMARY||LA5_0==SEND||LA5_0==UNARY_EXPRESSION||(LA5_0 >= 54 && LA5_0 <= 56)||(LA5_0 >= 59 && LA5_0 <= 61)||LA5_0==63||LA5_0==65||LA5_0==67||(LA5_0 >= 71 && LA5_0 <= 72)||(LA5_0 >= 75 && LA5_0 <= 80)||LA5_0==101||LA5_0==119) ) {
						alt5=1;
					}

					switch (alt5) {
					case 1 :
						// interpreter/Interpreter_HLL1.g:74:16: s= statement
						{
						pushFollow(FOLLOW_statement_in_stepBlock192);
						s=statement();
						state._fsp--;
						if (state.failed) return n;
						if ( state.backtracking==0 ) {step.addStatement(s);}
						}
						break;

					default :
						break loop5;
					}
				}

				match(input, Token.UP, null); if (state.failed) return n;
			}

			}

			if ( state.backtracking==0 ) {
				  currentScope = currentScope.parent();
				}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "stepBlock"



	// $ANTLR start "declaration"
	// interpreter/Interpreter_HLL1.g:77:1: declaration returns [Node n] : (a= variableDeclaration |a= enumDeclaration |a= setDeclaration );
	public final Node declaration() throws RecognitionException {
		Node n = null;


		Node a =null;

		try {
			// interpreter/Interpreter_HLL1.g:78:2: (a= variableDeclaration |a= enumDeclaration |a= setDeclaration )
			int alt6=3;
			switch ( input.LA(1) ) {
			case VARIABLE_DECLARATION:
				{
				alt6=1;
				}
				break;
			case ENUM_DECLARATION:
				{
				alt6=2;
				}
				break;
			case SET_DECLARATION:
				{
				alt6=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// interpreter/Interpreter_HLL1.g:78:4: a= variableDeclaration
					{
					pushFollow(FOLLOW_variableDeclaration_in_declaration214);
					a=variableDeclaration();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) {n = a;}
					}
					break;
				case 2 :
					// interpreter/Interpreter_HLL1.g:79:4: a= enumDeclaration
					{
					pushFollow(FOLLOW_enumDeclaration_in_declaration224);
					a=enumDeclaration();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) {n = a;}
					}
					break;
				case 3 :
					// interpreter/Interpreter_HLL1.g:80:4: a= setDeclaration
					{
					pushFollow(FOLLOW_setDeclaration_in_declaration234);
					a=setDeclaration();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) {n = a;}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "declaration"



	// $ANTLR start "variableDeclaration"
	// interpreter/Interpreter_HLL1.g:82:1: variableDeclaration returns [Node n] : ^( VARIABLE_DECLARATION type Identifier ) ;
	public final Node variableDeclaration() throws RecognitionException {
		Node n = null;


		CommonTree Identifier8=null;
		Type type9 =null;

		try {
			// interpreter/Interpreter_HLL1.g:82:37: ( ^( VARIABLE_DECLARATION type Identifier ) )
			// interpreter/Interpreter_HLL1.g:83:2: ^( VARIABLE_DECLARATION type Identifier )
			{
			match(input,VARIABLE_DECLARATION,FOLLOW_VARIABLE_DECLARATION_in_variableDeclaration253); if (state.failed) return n;
			match(input, Token.DOWN, null); if (state.failed) return n;
			pushFollow(FOLLOW_type_in_variableDeclaration255);
			type9=type();
			state._fsp--;
			if (state.failed) return n;
			Identifier8=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_variableDeclaration257); if (state.failed) return n;
			match(input, Token.UP, null); if (state.failed) return n;

			if ( state.backtracking==0 ) {n = new DeclarationNode((Identifier8!=null?Identifier8.getText():null), type9, currentScope);}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "variableDeclaration"



	// $ANTLR start "setDeclaration"
	// interpreter/Interpreter_HLL1.g:85:1: setDeclaration returns [Node n] : ^( SET_DECLARATION Identifier ) ;
	public final Node setDeclaration() throws RecognitionException {
		Node n = null;


		CommonTree Identifier10=null;

		try {
			// interpreter/Interpreter_HLL1.g:85:32: ( ^( SET_DECLARATION Identifier ) )
			// interpreter/Interpreter_HLL1.g:86:2: ^( SET_DECLARATION Identifier )
			{
			match(input,SET_DECLARATION,FOLLOW_SET_DECLARATION_in_setDeclaration275); if (state.failed) return n;
			match(input, Token.DOWN, null); if (state.failed) return n;
			Identifier10=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_setDeclaration277); if (state.failed) return n;
			match(input, Token.UP, null); if (state.failed) return n;

			if ( state.backtracking==0 ) {n = new DeclarationNode((Identifier10!=null?Identifier10.getText():null), new SetType(), currentScope);}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "setDeclaration"



	// $ANTLR start "enumDeclaration"
	// interpreter/Interpreter_HLL1.g:88:1: enumDeclaration returns [Node n] : ^( ENUM_DECLARATION Identifier enumBody ) ;
	public final Node enumDeclaration() throws RecognitionException {
		Node n = null;


		CommonTree Identifier12=null;
		EnumDeclarationNode enumBody11 =null;

		try {
			// interpreter/Interpreter_HLL1.g:88:33: ( ^( ENUM_DECLARATION Identifier enumBody ) )
			// interpreter/Interpreter_HLL1.g:89:2: ^( ENUM_DECLARATION Identifier enumBody )
			{
			match(input,ENUM_DECLARATION,FOLLOW_ENUM_DECLARATION_in_enumDeclaration295); if (state.failed) return n;
			match(input, Token.DOWN, null); if (state.failed) return n;
			Identifier12=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_enumDeclaration297); if (state.failed) return n;
			pushFollow(FOLLOW_enumBody_in_enumDeclaration299);
			enumBody11=enumBody();
			state._fsp--;
			if (state.failed) return n;
			match(input, Token.UP, null); if (state.failed) return n;

			if ( state.backtracking==0 ) {enumBody11.addTypeId((Identifier12!=null?Identifier12.getText():null)); n = enumBody11;}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "enumDeclaration"



	// $ANTLR start "enumBody"
	// interpreter/Interpreter_HLL1.g:91:1: enumBody returns [EnumDeclarationNode n] : ( Identifier )* ;
	public final EnumDeclarationNode enumBody() throws RecognitionException {
		EnumDeclarationNode n = null;


		CommonTree Identifier13=null;


				EnumDeclarationNode en = new EnumDeclarationNode(currentScope, enums);
				n = en;	
			
		try {
			// interpreter/Interpreter_HLL1.g:95:3: ( ( Identifier )* )
			// interpreter/Interpreter_HLL1.g:96:2: ( Identifier )*
			{
			// interpreter/Interpreter_HLL1.g:96:2: ( Identifier )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==Identifier) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// interpreter/Interpreter_HLL1.g:96:3: Identifier
					{
					Identifier13=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_enumBody321); if (state.failed) return n;
					if ( state.backtracking==0 ) {en.addElement((Identifier13!=null?Identifier13.getText():null));}
					}
					break;

				default :
					break loop7;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "enumBody"



	// $ANTLR start "type"
	// interpreter/Interpreter_HLL1.g:98:1: type returns [Type t] : ( PrimitiveType | Identifier );
	public final Type type() throws RecognitionException {
		Type t = null;


		CommonTree PrimitiveType14=null;
		CommonTree Identifier15=null;

		try {
			// interpreter/Interpreter_HLL1.g:99:2: ( PrimitiveType | Identifier )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==PrimitiveType) ) {
				alt8=1;
			}
			else if ( (LA8_0==Identifier) ) {
				alt8=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return t;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// interpreter/Interpreter_HLL1.g:99:4: PrimitiveType
					{
					PrimitiveType14=(CommonTree)match(input,PrimitiveType,FOLLOW_PrimitiveType_in_type339); if (state.failed) return t;
					if ( state.backtracking==0 ) {t = new Type((PrimitiveType14!=null?PrimitiveType14.getText():null));}
					}
					break;
				case 2 :
					// interpreter/Interpreter_HLL1.g:100:4: Identifier
					{
					Identifier15=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_type348); if (state.failed) return t;
					if ( state.backtracking==0 ) {t = new Type((Identifier15!=null?Identifier15.getText():null), enums);}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return t;
	}
	// $ANTLR end "type"



	// $ANTLR start "initialization"
	// interpreter/Interpreter_HLL1.g:104:1: initialization returns [Node n] : ( variableInit | statement );
	public final Node initialization() throws RecognitionException {
		Node n = null;


		Node variableInit16 =null;
		Node statement17 =null;

		try {
			// interpreter/Interpreter_HLL1.g:105:2: ( variableInit | statement )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==VARIABLE_INIT) ) {
				alt9=1;
			}
			else if ( (LA9_0==BLOCK||(LA9_0 >= FOR && LA9_0 <= FOREACH)||LA9_0==HALT||LA9_0==IF||LA9_0==Identifier||LA9_0==LOCAL_VARIABLE||LA9_0==PRIMARY||LA9_0==SEND||LA9_0==UNARY_EXPRESSION||(LA9_0 >= 54 && LA9_0 <= 56)||(LA9_0 >= 59 && LA9_0 <= 61)||LA9_0==63||LA9_0==65||LA9_0==67||(LA9_0 >= 71 && LA9_0 <= 72)||(LA9_0 >= 75 && LA9_0 <= 80)||LA9_0==101||LA9_0==119) ) {
				alt9=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// interpreter/Interpreter_HLL1.g:105:4: variableInit
					{
					pushFollow(FOLLOW_variableInit_in_initialization370);
					variableInit16=variableInit();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) {n = variableInit16;}
					}
					break;
				case 2 :
					// interpreter/Interpreter_HLL1.g:106:4: statement
					{
					pushFollow(FOLLOW_statement_in_initialization379);
					statement17=statement();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) {n = statement17;}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "initialization"



	// $ANTLR start "variableInit"
	// interpreter/Interpreter_HLL1.g:108:1: variableInit returns [Node n] : ^( VARIABLE_INIT Identifier variableValue ) ;
	public final Node variableInit() throws RecognitionException {
		Node n = null;


		CommonTree Identifier18=null;
		Node variableValue19 =null;

		try {
			// interpreter/Interpreter_HLL1.g:108:30: ( ^( VARIABLE_INIT Identifier variableValue ) )
			// interpreter/Interpreter_HLL1.g:109:2: ^( VARIABLE_INIT Identifier variableValue )
			{
			match(input,VARIABLE_INIT,FOLLOW_VARIABLE_INIT_in_variableInit399); if (state.failed) return n;
			match(input, Token.DOWN, null); if (state.failed) return n;
			Identifier18=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_variableInit401); if (state.failed) return n;
			pushFollow(FOLLOW_variableValue_in_variableInit403);
			variableValue19=variableValue();
			state._fsp--;
			if (state.failed) return n;
			match(input, Token.UP, null); if (state.failed) return n;

			if ( state.backtracking==0 ) {n = new AssignmentNode((Identifier18!=null?Identifier18.getText():null), variableValue19, currentScope);}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "variableInit"



	// $ANTLR start "variableValue"
	// interpreter/Interpreter_HLL1.g:111:1: variableValue returns [Node n] : ( PROC_COUNT | PROC_ID | detValue |a= nondetValue b= access_invocation );
	public final Node variableValue() throws RecognitionException {
		Node n = null;


		NondetInitNode a =null;
		LambdaExpr b =null;
		Node detValue20 =null;

		try {
			// interpreter/Interpreter_HLL1.g:112:2: ( PROC_COUNT | PROC_ID | detValue |a= nondetValue b= access_invocation )
			int alt10=4;
			switch ( input.LA(1) ) {
			case PROC_COUNT:
				{
				alt10=1;
				}
				break;
			case PROC_ID:
				{
				alt10=2;
				}
				break;
			case BooleanLiteral:
			case Identifier:
			case IntegerLiteral:
				{
				alt10=3;
				}
				break;
			case NONDET_INIT:
			case NONDET_RANGE_INIT:
				{
				alt10=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// interpreter/Interpreter_HLL1.g:112:4: PROC_COUNT
					{
					match(input,PROC_COUNT,FOLLOW_PROC_COUNT_in_variableValue421); if (state.failed) return n;
					if ( state.backtracking==0 ) {n = new AtomNode(numberOfProcesses);}
					}
					break;
				case 2 :
					// interpreter/Interpreter_HLL1.g:113:4: PROC_ID
					{
					match(input,PROC_ID,FOLLOW_PROC_ID_in_variableValue430); if (state.failed) return n;
					if ( state.backtracking==0 ) {n = new AtomNode(processId);}
					}
					break;
				case 3 :
					// interpreter/Interpreter_HLL1.g:114:4: detValue
					{
					pushFollow(FOLLOW_detValue_in_variableValue440);
					detValue20=detValue();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) {n = detValue20;}
					}
					break;
				case 4 :
					// interpreter/Interpreter_HLL1.g:115:4: a= nondetValue b= access_invocation
					{
					pushFollow(FOLLOW_nondetValue_in_variableValue456);
					a=nondetValue();
					state._fsp--;
					if (state.failed) return n;
					pushFollow(FOLLOW_access_invocation_in_variableValue460);
					b=access_invocation();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) {a.setLambdaExpr(b);n = a;}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "variableValue"



	// $ANTLR start "nondetValue"
	// interpreter/Interpreter_HLL1.g:117:1: nondetValue returns [NondetInitNode n] : ( ^( NONDET_INIT ( detValue )+ ) | ^( NONDET_RANGE_INIT a= detValue b= detValue ) );
	public final NondetInitNode nondetValue() throws RecognitionException {
		NondetInitNode n = null;


		Node a =null;
		Node b =null;
		Node detValue21 =null;


			  NondetInitNode ndin = new NondetInitNode();
			  n = ndin;
			
		try {
			// interpreter/Interpreter_HLL1.g:122:2: ( ^( NONDET_INIT ( detValue )+ ) | ^( NONDET_RANGE_INIT a= detValue b= detValue ) )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==NONDET_INIT) ) {
				alt12=1;
			}
			else if ( (LA12_0==NONDET_RANGE_INIT) ) {
				alt12=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// interpreter/Interpreter_HLL1.g:122:4: ^( NONDET_INIT ( detValue )+ )
					{
					match(input,NONDET_INIT,FOLLOW_NONDET_INIT_in_nondetValue484); if (state.failed) return n;
					match(input, Token.DOWN, null); if (state.failed) return n;
					// interpreter/Interpreter_HLL1.g:122:18: ( detValue )+
					int cnt11=0;
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0==BooleanLiteral||(LA11_0 >= Identifier && LA11_0 <= IntegerLiteral)) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// interpreter/Interpreter_HLL1.g:122:19: detValue
							{
							pushFollow(FOLLOW_detValue_in_nondetValue487);
							detValue21=detValue();
							state._fsp--;
							if (state.failed) return n;
							if ( state.backtracking==0 ) {ndin.addNondetValue(detValue21);}
							}
							break;

						default :
							if ( cnt11 >= 1 ) break loop11;
							if (state.backtracking>0) {state.failed=true; return n;}
							EarlyExitException eee = new EarlyExitException(11, input);
							throw eee;
						}
						cnt11++;
					}

					match(input, Token.UP, null); if (state.failed) return n;

					}
					break;
				case 2 :
					// interpreter/Interpreter_HLL1.g:123:5: ^( NONDET_RANGE_INIT a= detValue b= detValue )
					{
					match(input,NONDET_RANGE_INIT,FOLLOW_NONDET_RANGE_INIT_in_nondetValue499); if (state.failed) return n;
					match(input, Token.DOWN, null); if (state.failed) return n;
					pushFollow(FOLLOW_detValue_in_nondetValue503);
					a=detValue();
					state._fsp--;
					if (state.failed) return n;
					pushFollow(FOLLOW_detValue_in_nondetValue507);
					b=detValue();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) {ndin.addNondetRange(a, b); }
					match(input, Token.UP, null); if (state.failed) return n;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "nondetValue"



	// $ANTLR start "detValue"
	// interpreter/Interpreter_HLL1.g:125:1: detValue returns [Node n] : ( literal | Identifier );
	public final Node detValue() throws RecognitionException {
		Node n = null;


		CommonTree Identifier23=null;
		Node literal22 =null;

		try {
			// interpreter/Interpreter_HLL1.g:126:2: ( literal | Identifier )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==BooleanLiteral||LA13_0==IntegerLiteral) ) {
				alt13=1;
			}
			else if ( (LA13_0==Identifier) ) {
				alt13=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// interpreter/Interpreter_HLL1.g:126:4: literal
					{
					pushFollow(FOLLOW_literal_in_detValue525);
					literal22=literal();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) {n = literal22;}
					}
					break;
				case 2 :
					// interpreter/Interpreter_HLL1.g:127:4: Identifier
					{
					Identifier23=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_detValue534); if (state.failed) return n;
					if ( state.backtracking==0 ) {n = new IdentifierNode((Identifier23!=null?Identifier23.getText():null), currentScope);}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "detValue"



	// $ANTLR start "received"
	// interpreter/Interpreter_HLL1.g:130:1: received returns [Node n] : ^( RECEIVE a= receive_tuple_signatur b= sender c= statement ) ;
	public final Node received() throws RecognitionException {
		Node n = null;


		ReceiveTupleSignatur a =null;
		ReceiveNode b =null;
		Node c =null;


			  Scope recScope = new Scope(currentScope);
			  currentScope = recScope;
			
		try {
			// interpreter/Interpreter_HLL1.g:137:3: ( ^( RECEIVE a= receive_tuple_signatur b= sender c= statement ) )
			// interpreter/Interpreter_HLL1.g:138:2: ^( RECEIVE a= receive_tuple_signatur b= sender c= statement )
			{
			match(input,RECEIVE,FOLLOW_RECEIVE_in_received565); if (state.failed) return n;
			match(input, Token.DOWN, null); if (state.failed) return n;
			pushFollow(FOLLOW_receive_tuple_signatur_in_received569);
			a=receive_tuple_signatur();
			state._fsp--;
			if (state.failed) return n;
			pushFollow(FOLLOW_sender_in_received573);
			b=sender();
			state._fsp--;
			if (state.failed) return n;
			pushFollow(FOLLOW_statement_in_received577);
			c=statement();
			state._fsp--;
			if (state.failed) return n;
			match(input, Token.UP, null); if (state.failed) return n;

			if ( state.backtracking==0 ) {b.initialize(a, c, mtypes); n = b;}
			}

			if ( state.backtracking==0 ) {
				  currentScope = currentScope.parent();
				}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "received"



	// $ANTLR start "sender"
	// interpreter/Interpreter_HLL1.g:140:1: sender returns [ReceiveNode n] : ( ^( DISTINCT_PROCESSES a= expression ) | Identifier );
	public final ReceiveNode sender() throws RecognitionException {
		ReceiveNode n = null;


		CommonTree Identifier24=null;
		Node a =null;

		try {
			// interpreter/Interpreter_HLL1.g:141:2: ( ^( DISTINCT_PROCESSES a= expression ) | Identifier )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==DISTINCT_PROCESSES) ) {
				alt14=1;
			}
			else if ( (LA14_0==Identifier) ) {
				alt14=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// interpreter/Interpreter_HLL1.g:141:4: ^( DISTINCT_PROCESSES a= expression )
					{
					match(input,DISTINCT_PROCESSES,FOLLOW_DISTINCT_PROCESSES_in_sender595); if (state.failed) return n;
					match(input, Token.DOWN, null); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_sender599);
					a=expression();
					state._fsp--;
					if (state.failed) return n;
					match(input, Token.UP, null); if (state.failed) return n;

					if ( state.backtracking==0 ) {n = new ReceiveFromDistinctProcessesNode(a, messagePassing, processId, currentScope);}
					}
					break;
				case 2 :
					// interpreter/Interpreter_HLL1.g:142:4: Identifier
					{
					Identifier24=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_sender607); if (state.failed) return n;
					if ( state.backtracking==0 ) {n = new ReceiveFromAnyNode((Identifier24!=null?Identifier24.getText():null), messagePassing, processId, currentScope);}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "sender"



	// $ANTLR start "expression"
	// interpreter/Interpreter_HLL1.g:144:1: expression returns [Node n] : ( assignment | ^( 'and' a= expression b= expression ) | ^( 'or' a= expression b= expression ) | ^( '==' a= expression b= expression ) | ^( '!=' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '>' a= expression b= expression ) | ^( '<=' a= expression b= expression ) | ^( '>=' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '%' a= expression b= expression ) | ^( UNARY_EXPRESSION '+' a= expression ) | ^( UNARY_EXPRESSION '-' a= expression ) | ^( UNARY_EXPRESSION '!' a= expression ) | ^( UNARY_EXPRESSION Identifier '++' ) | ^( UNARY_EXPRESSION Identifier '--' ) |a= expression_set_invocation |a= operational_set_invocation | ^( UNARY_EXPRESSION '++' Identifier ) | ^( UNARY_EXPRESSION '--' Identifier ) | ^( PRIMARY primary ) );
	public final Node expression() throws RecognitionException {
		Node n = null;


		CommonTree Identifier26=null;
		CommonTree Identifier27=null;
		CommonTree Identifier28=null;
		CommonTree Identifier29=null;
		Node a =null;
		Node b =null;
		Node assignment25 =null;
		Node primary30 =null;

		try {
			// interpreter/Interpreter_HLL1.g:145:5: ( assignment | ^( 'and' a= expression b= expression ) | ^( 'or' a= expression b= expression ) | ^( '==' a= expression b= expression ) | ^( '!=' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '>' a= expression b= expression ) | ^( '<=' a= expression b= expression ) | ^( '>=' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '%' a= expression b= expression ) | ^( UNARY_EXPRESSION '+' a= expression ) | ^( UNARY_EXPRESSION '-' a= expression ) | ^( UNARY_EXPRESSION '!' a= expression ) | ^( UNARY_EXPRESSION Identifier '++' ) | ^( UNARY_EXPRESSION Identifier '--' ) |a= expression_set_invocation |a= operational_set_invocation | ^( UNARY_EXPRESSION '++' Identifier ) | ^( UNARY_EXPRESSION '--' Identifier ) | ^( PRIMARY primary ) )
			int alt15=24;
			switch ( input.LA(1) ) {
			case 56:
			case 60:
			case 63:
			case 67:
			case 72:
			case 77:
				{
				alt15=1;
				}
				break;
			case 101:
				{
				alt15=2;
				}
				break;
			case 119:
				{
				alt15=3;
				}
				break;
			case 78:
				{
				alt15=4;
				}
				break;
			case 54:
				{
				alt15=5;
				}
				break;
			case 75:
				{
				alt15=6;
				}
				break;
			case 79:
				{
				alt15=7;
				}
				break;
			case 76:
				{
				alt15=8;
				}
				break;
			case 80:
				{
				alt15=9;
				}
				break;
			case 61:
				{
				alt15=10;
				}
				break;
			case 65:
				{
				alt15=11;
				}
				break;
			case 59:
				{
				alt15=12;
				}
				break;
			case 71:
				{
				alt15=13;
				}
				break;
			case 55:
				{
				alt15=14;
				}
				break;
			case UNARY_EXPRESSION:
				{
				int LA15_15 = input.LA(2);
				if ( (LA15_15==DOWN) ) {
					switch ( input.LA(3) ) {
					case 61:
						{
						alt15=15;
						}
						break;
					case 65:
						{
						alt15=16;
						}
						break;
					case 53:
						{
						alt15=17;
						}
						break;
					case Identifier:
						{
						int LA15_24 = input.LA(4);
						if ( (LA15_24==62) ) {
							alt15=18;
						}
						else if ( (LA15_24==66) ) {
							alt15=19;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return n;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 15, 24, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case 62:
						{
						alt15=22;
						}
						break;
					case 66:
						{
						alt15=23;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return n;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 15, 18, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}

				else {
					if (state.backtracking>0) {state.failed=true; return n;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 15, 15, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case Identifier:
				{
				int LA15_16 = input.LA(2);
				if ( (LA15_16==CONTAINS_INVOCATION||LA15_16==FILTER_INVOCATION||LA15_16==SIZE_INVOCATION) ) {
					alt15=20;
				}
				else if ( (LA15_16==INSERT_INVOCATION||LA15_16==REMOVE_INVOCATION) ) {
					alt15=21;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return n;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 15, 16, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case PRIMARY:
				{
				alt15=24;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// interpreter/Interpreter_HLL1.g:145:7: assignment
					{
					pushFollow(FOLLOW_assignment_in_expression633);
					assignment25=assignment();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) {n = assignment25;}
					}
					break;
				case 2 :
					// interpreter/Interpreter_HLL1.g:146:6: ^( 'and' a= expression b= expression )
					{
					match(input,101,FOLLOW_101_in_expression652); if (state.failed) return n;
					match(input, Token.DOWN, null); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_expression656);
					a=expression();
					state._fsp--;
					if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_expression660);
					b=expression();
					state._fsp--;
					if (state.failed) return n;
					match(input, Token.UP, null); if (state.failed) return n;

					if ( state.backtracking==0 ) {n = new AndNode(a, b);}
					}
					break;
				case 3 :
					// interpreter/Interpreter_HLL1.g:147:9: ^( 'or' a= expression b= expression )
					{
					match(input,119,FOLLOW_119_in_expression677); if (state.failed) return n;
					match(input, Token.DOWN, null); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_expression681);
					a=expression();
					state._fsp--;
					if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_expression685);
					b=expression();
					state._fsp--;
					if (state.failed) return n;
					match(input, Token.UP, null); if (state.failed) return n;

					if ( state.backtracking==0 ) {n = new OrNode(a, b);}
					}
					break;
				case 4 :
					// interpreter/Interpreter_HLL1.g:148:4: ^( '==' a= expression b= expression )
					{
					match(input,78,FOLLOW_78_in_expression698); if (state.failed) return n;
					match(input, Token.DOWN, null); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_expression702);
					a=expression();
					state._fsp--;
					if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_expression706);
					b=expression();
					state._fsp--;
					if (state.failed) return n;
					match(input, Token.UP, null); if (state.failed) return n;

					if ( state.backtracking==0 ) {n = new EqNode(a, b);}
					}
					break;
				case 5 :
					// interpreter/Interpreter_HLL1.g:149:9: ^( '!=' a= expression b= expression )
					{
					match(input,54,FOLLOW_54_in_expression723); if (state.failed) return n;
					match(input, Token.DOWN, null); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_expression727);
					a=expression();
					state._fsp--;
					if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_expression731);
					b=expression();
					state._fsp--;
					if (state.failed) return n;
					match(input, Token.UP, null); if (state.failed) return n;

					if ( state.backtracking==0 ) {n = new NEqNode(a, b);}
					}
					break;
				case 6 :
					// interpreter/Interpreter_HLL1.g:150:9: ^( '<' a= expression b= expression )
					{
					match(input,75,FOLLOW_75_in_expression748); if (state.failed) return n;
					match(input, Token.DOWN, null); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_expression752);
					a=expression();
					state._fsp--;
					if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_expression756);
					b=expression();
					state._fsp--;
					if (state.failed) return n;
					match(input, Token.UP, null); if (state.failed) return n;

					if ( state.backtracking==0 ) {n = new LTNode(a, b);}
					}
					break;
				case 7 :
					// interpreter/Interpreter_HLL1.g:151:9: ^( '>' a= expression b= expression )
					{
					match(input,79,FOLLOW_79_in_expression774); if (state.failed) return n;
					match(input, Token.DOWN, null); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_expression778);
					a=expression();
					state._fsp--;
					if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_expression782);
					b=expression();
					state._fsp--;
					if (state.failed) return n;
					match(input, Token.UP, null); if (state.failed) return n;

					if ( state.backtracking==0 ) {n = new GTNode(a, b);}
					}
					break;
				case 8 :
					// interpreter/Interpreter_HLL1.g:152:9: ^( '<=' a= expression b= expression )
					{
					match(input,76,FOLLOW_76_in_expression800); if (state.failed) return n;
					match(input, Token.DOWN, null); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_expression804);
					a=expression();
					state._fsp--;
					if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_expression808);
					b=expression();
					state._fsp--;
					if (state.failed) return n;
					match(input, Token.UP, null); if (state.failed) return n;

					if ( state.backtracking==0 ) {n = new LTEqNode(a, b);}
					}
					break;
				case 9 :
					// interpreter/Interpreter_HLL1.g:153:9: ^( '>=' a= expression b= expression )
					{
					match(input,80,FOLLOW_80_in_expression825); if (state.failed) return n;
					match(input, Token.DOWN, null); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_expression829);
					a=expression();
					state._fsp--;
					if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_expression833);
					b=expression();
					state._fsp--;
					if (state.failed) return n;
					match(input, Token.UP, null); if (state.failed) return n;

					if ( state.backtracking==0 ) {n = new GTEqNode(a, b);}
					}
					break;
				case 10 :
					// interpreter/Interpreter_HLL1.g:154:9: ^( '+' a= expression b= expression )
					{
					match(input,61,FOLLOW_61_in_expression850); if (state.failed) return n;
					match(input, Token.DOWN, null); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_expression854);
					a=expression();
					state._fsp--;
					if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_expression858);
					b=expression();
					state._fsp--;
					if (state.failed) return n;
					match(input, Token.UP, null); if (state.failed) return n;

					if ( state.backtracking==0 ) {n = new AddNode(a, b);}
					}
					break;
				case 11 :
					// interpreter/Interpreter_HLL1.g:155:9: ^( '-' a= expression b= expression )
					{
					match(input,65,FOLLOW_65_in_expression875); if (state.failed) return n;
					match(input, Token.DOWN, null); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_expression879);
					a=expression();
					state._fsp--;
					if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_expression883);
					b=expression();
					state._fsp--;
					if (state.failed) return n;
					match(input, Token.UP, null); if (state.failed) return n;

					if ( state.backtracking==0 ) {n = new SubtractNode(a, b);}
					}
					break;
				case 12 :
					// interpreter/Interpreter_HLL1.g:156:9: ^( '*' a= expression b= expression )
					{
					match(input,59,FOLLOW_59_in_expression900); if (state.failed) return n;
					match(input, Token.DOWN, null); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_expression904);
					a=expression();
					state._fsp--;
					if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_expression908);
					b=expression();
					state._fsp--;
					if (state.failed) return n;
					match(input, Token.UP, null); if (state.failed) return n;

					if ( state.backtracking==0 ) {n = new MultNode(a, b);}
					}
					break;
				case 13 :
					// interpreter/Interpreter_HLL1.g:157:9: ^( '/' a= expression b= expression )
					{
					match(input,71,FOLLOW_71_in_expression925); if (state.failed) return n;
					match(input, Token.DOWN, null); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_expression929);
					a=expression();
					state._fsp--;
					if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_expression933);
					b=expression();
					state._fsp--;
					if (state.failed) return n;
					match(input, Token.UP, null); if (state.failed) return n;

					if ( state.backtracking==0 ) {n = new DivNode(a, b);}
					}
					break;
				case 14 :
					// interpreter/Interpreter_HLL1.g:158:9: ^( '%' a= expression b= expression )
					{
					match(input,55,FOLLOW_55_in_expression950); if (state.failed) return n;
					match(input, Token.DOWN, null); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_expression954);
					a=expression();
					state._fsp--;
					if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_expression958);
					b=expression();
					state._fsp--;
					if (state.failed) return n;
					match(input, Token.UP, null); if (state.failed) return n;

					if ( state.backtracking==0 ) {n = new ModNode(a, b);}
					}
					break;
				case 15 :
					// interpreter/Interpreter_HLL1.g:159:7: ^( UNARY_EXPRESSION '+' a= expression )
					{
					match(input,UNARY_EXPRESSION,FOLLOW_UNARY_EXPRESSION_in_expression973); if (state.failed) return n;
					match(input, Token.DOWN, null); if (state.failed) return n;
					match(input,61,FOLLOW_61_in_expression975); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_expression979);
					a=expression();
					state._fsp--;
					if (state.failed) return n;
					match(input, Token.UP, null); if (state.failed) return n;

					if ( state.backtracking==0 ) {n = new UnaryPlusNode(a);}
					}
					break;
				case 16 :
					// interpreter/Interpreter_HLL1.g:160:7: ^( UNARY_EXPRESSION '-' a= expression )
					{
					match(input,UNARY_EXPRESSION,FOLLOW_UNARY_EXPRESSION_in_expression993); if (state.failed) return n;
					match(input, Token.DOWN, null); if (state.failed) return n;
					match(input,65,FOLLOW_65_in_expression995); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_expression999);
					a=expression();
					state._fsp--;
					if (state.failed) return n;
					match(input, Token.UP, null); if (state.failed) return n;

					if ( state.backtracking==0 ) {n = new UnaryMinusNode(a);}
					}
					break;
				case 17 :
					// interpreter/Interpreter_HLL1.g:161:7: ^( UNARY_EXPRESSION '!' a= expression )
					{
					match(input,UNARY_EXPRESSION,FOLLOW_UNARY_EXPRESSION_in_expression1013); if (state.failed) return n;
					match(input, Token.DOWN, null); if (state.failed) return n;
					match(input,53,FOLLOW_53_in_expression1015); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_expression1019);
					a=expression();
					state._fsp--;
					if (state.failed) return n;
					match(input, Token.UP, null); if (state.failed) return n;

					if ( state.backtracking==0 ) {n = new NegateNode(a);}
					}
					break;
				case 18 :
					// interpreter/Interpreter_HLL1.g:162:7: ^( UNARY_EXPRESSION Identifier '++' )
					{
					match(input,UNARY_EXPRESSION,FOLLOW_UNARY_EXPRESSION_in_expression1033); if (state.failed) return n;
					match(input, Token.DOWN, null); if (state.failed) return n;
					Identifier26=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_expression1035); if (state.failed) return n;
					match(input,62,FOLLOW_62_in_expression1037); if (state.failed) return n;
					match(input, Token.UP, null); if (state.failed) return n;

					if ( state.backtracking==0 ) {n = new PostIncrementNode((Identifier26!=null?Identifier26.getText():null), currentScope);}
					}
					break;
				case 19 :
					// interpreter/Interpreter_HLL1.g:163:7: ^( UNARY_EXPRESSION Identifier '--' )
					{
					match(input,UNARY_EXPRESSION,FOLLOW_UNARY_EXPRESSION_in_expression1051); if (state.failed) return n;
					match(input, Token.DOWN, null); if (state.failed) return n;
					Identifier27=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_expression1053); if (state.failed) return n;
					match(input,66,FOLLOW_66_in_expression1055); if (state.failed) return n;
					match(input, Token.UP, null); if (state.failed) return n;

					if ( state.backtracking==0 ) {n = new PostDecrementNode((Identifier27!=null?Identifier27.getText():null), currentScope);}
					}
					break;
				case 20 :
					// interpreter/Interpreter_HLL1.g:164:7: a= expression_set_invocation
					{
					pushFollow(FOLLOW_expression_set_invocation_in_expression1070);
					a=expression_set_invocation();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) {n = a;}
					}
					break;
				case 21 :
					// interpreter/Interpreter_HLL1.g:165:4: a= operational_set_invocation
					{
					pushFollow(FOLLOW_operational_set_invocation_in_expression1083);
					a=operational_set_invocation();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) {n = a;}
					}
					break;
				case 22 :
					// interpreter/Interpreter_HLL1.g:166:7: ^( UNARY_EXPRESSION '++' Identifier )
					{
					match(input,UNARY_EXPRESSION,FOLLOW_UNARY_EXPRESSION_in_expression1097); if (state.failed) return n;
					match(input, Token.DOWN, null); if (state.failed) return n;
					match(input,62,FOLLOW_62_in_expression1099); if (state.failed) return n;
					Identifier28=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_expression1101); if (state.failed) return n;
					match(input, Token.UP, null); if (state.failed) return n;

					if ( state.backtracking==0 ) {n = new PreIncrementNode((Identifier28!=null?Identifier28.getText():null), currentScope);}
					}
					break;
				case 23 :
					// interpreter/Interpreter_HLL1.g:167:7: ^( UNARY_EXPRESSION '--' Identifier )
					{
					match(input,UNARY_EXPRESSION,FOLLOW_UNARY_EXPRESSION_in_expression1115); if (state.failed) return n;
					match(input, Token.DOWN, null); if (state.failed) return n;
					match(input,66,FOLLOW_66_in_expression1117); if (state.failed) return n;
					Identifier29=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_expression1119); if (state.failed) return n;
					match(input, Token.UP, null); if (state.failed) return n;

					if ( state.backtracking==0 ) {n = new PreDecrementNode((Identifier29!=null?Identifier29.getText():null), currentScope);}
					}
					break;
				case 24 :
					// interpreter/Interpreter_HLL1.g:168:7: ^( PRIMARY primary )
					{
					match(input,PRIMARY,FOLLOW_PRIMARY_in_expression1133); if (state.failed) return n;
					match(input, Token.DOWN, null); if (state.failed) return n;
					pushFollow(FOLLOW_primary_in_expression1135);
					primary30=primary();
					state._fsp--;
					if (state.failed) return n;
					match(input, Token.UP, null); if (state.failed) return n;

					if ( state.backtracking==0 ) {n = primary30;}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "expression"



	// $ANTLR start "expression_set_invocation"
	// interpreter/Interpreter_HLL1.g:170:1: expression_set_invocation returns [Node n] : ( Identifier expression_invocation |a= filter_expression_invocation );
	public final Node expression_set_invocation() throws RecognitionException {
		Node n = null;


		CommonTree Identifier32=null;
		Node a =null;
		BoolExpressionOnSetNode expression_invocation31 =null;

		try {
			// interpreter/Interpreter_HLL1.g:171:2: ( Identifier expression_invocation |a= filter_expression_invocation )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==Identifier) ) {
				int LA16_1 = input.LA(2);
				if ( (LA16_1==CONTAINS_INVOCATION||LA16_1==SIZE_INVOCATION) ) {
					alt16=1;
				}
				else if ( (LA16_1==FILTER_INVOCATION) ) {
					alt16=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return n;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 16, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// interpreter/Interpreter_HLL1.g:171:4: Identifier expression_invocation
					{
					Identifier32=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_expression_set_invocation1163); if (state.failed) return n;
					pushFollow(FOLLOW_expression_invocation_in_expression_set_invocation1165);
					expression_invocation31=expression_invocation();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) {expression_invocation31.set((Identifier32!=null?Identifier32.getText():null)); n = expression_invocation31;}
					}
					break;
				case 2 :
					// interpreter/Interpreter_HLL1.g:172:4: a= filter_expression_invocation
					{
					pushFollow(FOLLOW_filter_expression_invocation_in_expression_set_invocation1175);
					a=filter_expression_invocation();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) {n = a;}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "expression_set_invocation"



	// $ANTLR start "expression_invocation"
	// interpreter/Interpreter_HLL1.g:174:1: expression_invocation returns [BoolExpressionOnSetNode n] : ( ^( CONTAINS_INVOCATION setArgument ) | SIZE_INVOCATION );
	public final BoolExpressionOnSetNode expression_invocation() throws RecognitionException {
		BoolExpressionOnSetNode n = null;


		TupleNode setArgument33 =null;

		try {
			// interpreter/Interpreter_HLL1.g:175:2: ( ^( CONTAINS_INVOCATION setArgument ) | SIZE_INVOCATION )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==CONTAINS_INVOCATION) ) {
				alt17=1;
			}
			else if ( (LA17_0==SIZE_INVOCATION) ) {
				alt17=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// interpreter/Interpreter_HLL1.g:175:4: ^( CONTAINS_INVOCATION setArgument )
					{
					match(input,CONTAINS_INVOCATION,FOLLOW_CONTAINS_INVOCATION_in_expression_invocation1195); if (state.failed) return n;
					match(input, Token.DOWN, null); if (state.failed) return n;
					pushFollow(FOLLOW_setArgument_in_expression_invocation1197);
					setArgument33=setArgument();
					state._fsp--;
					if (state.failed) return n;
					match(input, Token.UP, null); if (state.failed) return n;

					if ( state.backtracking==0 ) {n = new ContainedInSetNode(setArgument33, currentScope);}
					}
					break;
				case 2 :
					// interpreter/Interpreter_HLL1.g:176:4: SIZE_INVOCATION
					{
					match(input,SIZE_INVOCATION,FOLLOW_SIZE_INVOCATION_in_expression_invocation1206); if (state.failed) return n;
					if ( state.backtracking==0 ) {n = new SizeOfSetNode(currentScope);}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "expression_invocation"



	// $ANTLR start "operational_set_invocation"
	// interpreter/Interpreter_HLL1.g:178:1: operational_set_invocation returns [Node n] : Identifier a= operational_invocation ;
	public final Node operational_set_invocation() throws RecognitionException {
		Node n = null;


		CommonTree Identifier34=null;
		OperationOnSetNode a =null;

		try {
			// interpreter/Interpreter_HLL1.g:179:2: ( Identifier a= operational_invocation )
			// interpreter/Interpreter_HLL1.g:179:4: Identifier a= operational_invocation
			{
			Identifier34=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_operational_set_invocation1228); if (state.failed) return n;
			pushFollow(FOLLOW_operational_invocation_in_operational_set_invocation1232);
			a=operational_invocation();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {a.set((Identifier34!=null?Identifier34.getText():null)); n = a;}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "operational_set_invocation"



	// $ANTLR start "set_invocation"
	// interpreter/Interpreter_HLL1.g:181:1: set_invocation returns [SetNode n] : ( ^( SET_INVOCATION Identifier ) | ^( SET_INVOCATION filter_set_invocation ) );
	public final SetNode set_invocation() throws RecognitionException {
		SetNode n = null;


		CommonTree Identifier35=null;
		FilterSet filter_set_invocation36 =null;

		try {
			// interpreter/Interpreter_HLL1.g:182:2: ( ^( SET_INVOCATION Identifier ) | ^( SET_INVOCATION filter_set_invocation ) )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==SET_INVOCATION) ) {
				int LA18_1 = input.LA(2);
				if ( (LA18_1==DOWN) ) {
					int LA18_2 = input.LA(3);
					if ( (LA18_2==Identifier) ) {
						int LA18_3 = input.LA(4);
						if ( (LA18_3==UP) ) {
							alt18=1;
						}
						else if ( (LA18_3==FILTER_INVOCATION) ) {
							alt18=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return n;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 18, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return n;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 18, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return n;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// interpreter/Interpreter_HLL1.g:182:4: ^( SET_INVOCATION Identifier )
					{
					match(input,SET_INVOCATION,FOLLOW_SET_INVOCATION_in_set_invocation1251); if (state.failed) return n;
					match(input, Token.DOWN, null); if (state.failed) return n;
					Identifier35=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_set_invocation1253); if (state.failed) return n;
					match(input, Token.UP, null); if (state.failed) return n;

					if ( state.backtracking==0 ) {n = new IdentifierSet((Identifier35!=null?Identifier35.getText():null), currentScope); }
					}
					break;
				case 2 :
					// interpreter/Interpreter_HLL1.g:183:4: ^( SET_INVOCATION filter_set_invocation )
					{
					match(input,SET_INVOCATION,FOLLOW_SET_INVOCATION_in_set_invocation1264); if (state.failed) return n;
					match(input, Token.DOWN, null); if (state.failed) return n;
					pushFollow(FOLLOW_filter_set_invocation_in_set_invocation1266);
					filter_set_invocation36=filter_set_invocation();
					state._fsp--;
					if (state.failed) return n;
					match(input, Token.UP, null); if (state.failed) return n;

					if ( state.backtracking==0 ) {n = filter_set_invocation36; }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "set_invocation"



	// $ANTLR start "filter_expression_invocation"
	// interpreter/Interpreter_HLL1.g:185:1: filter_expression_invocation returns [Node n] : a= filter_set_invocation b= expression_invocation ;
	public final Node filter_expression_invocation() throws RecognitionException {
		Node n = null;


		FilterSet a =null;
		BoolExpressionOnSetNode b =null;

		try {
			// interpreter/Interpreter_HLL1.g:185:46: (a= filter_set_invocation b= expression_invocation )
			// interpreter/Interpreter_HLL1.g:186:2: a= filter_set_invocation b= expression_invocation
			{
			pushFollow(FOLLOW_filter_set_invocation_in_filter_expression_invocation1285);
			a=filter_set_invocation();
			state._fsp--;
			if (state.failed) return n;
			pushFollow(FOLLOW_expression_invocation_in_filter_expression_invocation1289);
			b=expression_invocation();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = new OperationOnFilteredSetNode(a, b);}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "filter_expression_invocation"



	// $ANTLR start "filter_set_invocation"
	// interpreter/Interpreter_HLL1.g:188:1: filter_set_invocation returns [FilterSet n] : Identifier a= filter_invocation ;
	public final FilterSet filter_set_invocation() throws RecognitionException {
		FilterSet n = null;


		CommonTree Identifier37=null;
		LambdaExpr a =null;

		try {
			// interpreter/Interpreter_HLL1.g:188:44: ( Identifier a= filter_invocation )
			// interpreter/Interpreter_HLL1.g:189:2: Identifier a= filter_invocation
			{
			Identifier37=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_filter_set_invocation1305); if (state.failed) return n;
			pushFollow(FOLLOW_filter_invocation_in_filter_set_invocation1309);
			a=filter_invocation();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = new FilterSet((Identifier37!=null?Identifier37.getText():null), a, currentScope);}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "filter_set_invocation"



	// $ANTLR start "filter_invocation"
	// interpreter/Interpreter_HLL1.g:191:1: filter_invocation returns [LambdaExpr e] : ^( FILTER_INVOCATION a= lambda_expression ) ;
	public final LambdaExpr filter_invocation() throws RecognitionException {
		LambdaExpr e = null;


		LambdaExpr a =null;

		try {
			// interpreter/Interpreter_HLL1.g:191:41: ( ^( FILTER_INVOCATION a= lambda_expression ) )
			// interpreter/Interpreter_HLL1.g:192:2: ^( FILTER_INVOCATION a= lambda_expression )
			{
			match(input,FILTER_INVOCATION,FOLLOW_FILTER_INVOCATION_in_filter_invocation1330); if (state.failed) return e;
			match(input, Token.DOWN, null); if (state.failed) return e;
			pushFollow(FOLLOW_lambda_expression_in_filter_invocation1334);
			a=lambda_expression();
			state._fsp--;
			if (state.failed) return e;
			match(input, Token.UP, null); if (state.failed) return e;

			if ( state.backtracking==0 ) {e = a;}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "filter_invocation"



	// $ANTLR start "operational_invocation"
	// interpreter/Interpreter_HLL1.g:194:1: operational_invocation returns [OperationOnSetNode n] : ( ^( INSERT_INVOCATION setArgument ) | ^( REMOVE_INVOCATION setArgument ) );
	public final OperationOnSetNode operational_invocation() throws RecognitionException {
		OperationOnSetNode n = null;


		TupleNode setArgument38 =null;
		TupleNode setArgument39 =null;

		try {
			// interpreter/Interpreter_HLL1.g:195:2: ( ^( INSERT_INVOCATION setArgument ) | ^( REMOVE_INVOCATION setArgument ) )
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==INSERT_INVOCATION) ) {
				alt19=1;
			}
			else if ( (LA19_0==REMOVE_INVOCATION) ) {
				alt19=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// interpreter/Interpreter_HLL1.g:195:4: ^( INSERT_INVOCATION setArgument )
					{
					match(input,INSERT_INVOCATION,FOLLOW_INSERT_INVOCATION_in_operational_invocation1355); if (state.failed) return n;
					match(input, Token.DOWN, null); if (state.failed) return n;
					pushFollow(FOLLOW_setArgument_in_operational_invocation1357);
					setArgument38=setArgument();
					state._fsp--;
					if (state.failed) return n;
					match(input, Token.UP, null); if (state.failed) return n;

					if ( state.backtracking==0 ) {n = new InsertInSetNode(setArgument38, currentScope);}
					}
					break;
				case 2 :
					// interpreter/Interpreter_HLL1.g:196:4: ^( REMOVE_INVOCATION setArgument )
					{
					match(input,REMOVE_INVOCATION,FOLLOW_REMOVE_INVOCATION_in_operational_invocation1366); if (state.failed) return n;
					match(input, Token.DOWN, null); if (state.failed) return n;
					pushFollow(FOLLOW_setArgument_in_operational_invocation1368);
					setArgument39=setArgument();
					state._fsp--;
					if (state.failed) return n;
					match(input, Token.UP, null); if (state.failed) return n;

					if ( state.backtracking==0 ) {n = new RemoveFromSetNode(setArgument39, currentScope);}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "operational_invocation"



	// $ANTLR start "access_set_invocation"
	// interpreter/Interpreter_HLL1.g:198:1: access_set_invocation returns [AccessSet n] : Identifier a= access_invocation ;
	public final AccessSet access_set_invocation() throws RecognitionException {
		AccessSet n = null;


		CommonTree Identifier40=null;
		LambdaExpr a =null;

		try {
			// interpreter/Interpreter_HLL1.g:198:44: ( Identifier a= access_invocation )
			// interpreter/Interpreter_HLL1.g:199:2: Identifier a= access_invocation
			{
			Identifier40=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_access_set_invocation1384); if (state.failed) return n;
			pushFollow(FOLLOW_access_invocation_in_access_set_invocation1388);
			a=access_invocation();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {n = new AccessSet((Identifier40!=null?Identifier40.getText():null), a, currentScope);}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "access_set_invocation"



	// $ANTLR start "access_invocation"
	// interpreter/Interpreter_HLL1.g:201:1: access_invocation returns [LambdaExpr e] : ( ACCESS_INVOCATION | ^( ACCESS_INVOCATION a= lambda_expression ) );
	public final LambdaExpr access_invocation() throws RecognitionException {
		LambdaExpr e = null;


		LambdaExpr a =null;

		try {
			// interpreter/Interpreter_HLL1.g:202:2: ( ACCESS_INVOCATION | ^( ACCESS_INVOCATION a= lambda_expression ) )
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==ACCESS_INVOCATION) ) {
				int LA20_1 = input.LA(2);
				if ( (LA20_1==DOWN) ) {
					alt20=2;
				}
				else if ( (LA20_1==UP) ) {
					alt20=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return e;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 20, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return e;}
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}

			switch (alt20) {
				case 1 :
					// interpreter/Interpreter_HLL1.g:202:4: ACCESS_INVOCATION
					{
					match(input,ACCESS_INVOCATION,FOLLOW_ACCESS_INVOCATION_in_access_invocation1404); if (state.failed) return e;
					if ( state.backtracking==0 ) {e = new LambdaExpr();}
					}
					break;
				case 2 :
					// interpreter/Interpreter_HLL1.g:203:4: ^( ACCESS_INVOCATION a= lambda_expression )
					{
					match(input,ACCESS_INVOCATION,FOLLOW_ACCESS_INVOCATION_in_access_invocation1413); if (state.failed) return e;
					match(input, Token.DOWN, null); if (state.failed) return e;
					pushFollow(FOLLOW_lambda_expression_in_access_invocation1417);
					a=lambda_expression();
					state._fsp--;
					if (state.failed) return e;
					match(input, Token.UP, null); if (state.failed) return e;

					if ( state.backtracking==0 ) {e = a;}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "access_invocation"



	// $ANTLR start "lambda_expression"
	// interpreter/Interpreter_HLL1.g:206:1: lambda_expression returns [LambdaExpr e] : ^( LAMBDA_EXPRESSION a= tuple_signatur b= expression ) ;
	public final LambdaExpr lambda_expression() throws RecognitionException {
		LambdaExpr e = null;


		TupleSignatur a =null;
		Node b =null;


			  Scope lambdaScope = new Scope(currentScope);
			  currentScope = lambdaScope;
			
		try {
			// interpreter/Interpreter_HLL1.g:213:3: ( ^( LAMBDA_EXPRESSION a= tuple_signatur b= expression ) )
			// interpreter/Interpreter_HLL1.g:214:2: ^( LAMBDA_EXPRESSION a= tuple_signatur b= expression )
			{
			match(input,LAMBDA_EXPRESSION,FOLLOW_LAMBDA_EXPRESSION_in_lambda_expression1451); if (state.failed) return e;
			match(input, Token.DOWN, null); if (state.failed) return e;
			pushFollow(FOLLOW_tuple_signatur_in_lambda_expression1455);
			a=tuple_signatur();
			state._fsp--;
			if (state.failed) return e;
			pushFollow(FOLLOW_expression_in_lambda_expression1459);
			b=expression();
			state._fsp--;
			if (state.failed) return e;
			match(input, Token.UP, null); if (state.failed) return e;

			if ( state.backtracking==0 ) {e = new LambdaExpr(a, b, currentScope);}
			}

			if ( state.backtracking==0 ) {
				  currentScope = currentScope.parent();
				}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "lambda_expression"



	// $ANTLR start "tuple_signatur"
	// interpreter/Interpreter_HLL1.g:216:1: tuple_signatur returns [TupleSignatur n] : ( Identifier | ^( SIGNATUR ( Identifier )+ ) );
	public final TupleSignatur tuple_signatur() throws RecognitionException {
		TupleSignatur n = null;


		CommonTree Identifier41=null;
		CommonTree Identifier42=null;


				TupleSignatur tn = new TupleSignatur();
				n = tn;
			
		try {
			// interpreter/Interpreter_HLL1.g:221:2: ( Identifier | ^( SIGNATUR ( Identifier )+ ) )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==Identifier) ) {
				alt22=1;
			}
			else if ( (LA22_0==SIGNATUR) ) {
				alt22=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// interpreter/Interpreter_HLL1.g:221:4: Identifier
					{
					Identifier41=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_tuple_signatur1483); if (state.failed) return n;
					if ( state.backtracking==0 ) {tn.addIdentifier((Identifier41!=null?Identifier41.getText():null));}
					}
					break;
				case 2 :
					// interpreter/Interpreter_HLL1.g:222:4: ^( SIGNATUR ( Identifier )+ )
					{
					match(input,SIGNATUR,FOLLOW_SIGNATUR_in_tuple_signatur1494); if (state.failed) return n;
					match(input, Token.DOWN, null); if (state.failed) return n;
					// interpreter/Interpreter_HLL1.g:222:15: ( Identifier )+
					int cnt21=0;
					loop21:
					while (true) {
						int alt21=2;
						int LA21_0 = input.LA(1);
						if ( (LA21_0==Identifier) ) {
							alt21=1;
						}

						switch (alt21) {
						case 1 :
							// interpreter/Interpreter_HLL1.g:222:16: Identifier
							{
							Identifier42=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_tuple_signatur1497); if (state.failed) return n;
							if ( state.backtracking==0 ) {tn.addIdentifier((Identifier42!=null?Identifier42.getText():null));}
							}
							break;

						default :
							if ( cnt21 >= 1 ) break loop21;
							if (state.backtracking>0) {state.failed=true; return n;}
							EarlyExitException eee = new EarlyExitException(21, input);
							throw eee;
						}
						cnt21++;
					}

					match(input, Token.UP, null); if (state.failed) return n;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "tuple_signatur"



	// $ANTLR start "receive_tuple_signatur"
	// interpreter/Interpreter_HLL1.g:224:1: receive_tuple_signatur returns [ReceiveTupleSignatur n] : ( Identifier | ^( SIGNATUR (a= Identifier ) (b= Identifier )* ) );
	public final ReceiveTupleSignatur receive_tuple_signatur() throws RecognitionException {
		ReceiveTupleSignatur n = null;


		CommonTree a=null;
		CommonTree b=null;
		CommonTree Identifier43=null;


				ReceiveTupleSignatur tn = new ReceiveTupleSignatur();
				n = tn;
			
		try {
			// interpreter/Interpreter_HLL1.g:229:2: ( Identifier | ^( SIGNATUR (a= Identifier ) (b= Identifier )* ) )
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==Identifier) ) {
				alt24=1;
			}
			else if ( (LA24_0==SIGNATUR) ) {
				alt24=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// interpreter/Interpreter_HLL1.g:229:4: Identifier
					{
					Identifier43=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_receive_tuple_signatur1523); if (state.failed) return n;
					if ( state.backtracking==0 ) {tn.addMType((Identifier43!=null?Identifier43.getText():null));}
					}
					break;
				case 2 :
					// interpreter/Interpreter_HLL1.g:230:4: ^( SIGNATUR (a= Identifier ) (b= Identifier )* )
					{
					match(input,SIGNATUR,FOLLOW_SIGNATUR_in_receive_tuple_signatur1534); if (state.failed) return n;
					match(input, Token.DOWN, null); if (state.failed) return n;
					// interpreter/Interpreter_HLL1.g:230:15: (a= Identifier )
					// interpreter/Interpreter_HLL1.g:230:16: a= Identifier
					{
					a=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_receive_tuple_signatur1539); if (state.failed) return n;
					if ( state.backtracking==0 ) {tn.addMType((a!=null?a.getText():null));}
					}

					// interpreter/Interpreter_HLL1.g:230:54: (b= Identifier )*
					loop23:
					while (true) {
						int alt23=2;
						int LA23_0 = input.LA(1);
						if ( (LA23_0==Identifier) ) {
							alt23=1;
						}

						switch (alt23) {
						case 1 :
							// interpreter/Interpreter_HLL1.g:230:55: b= Identifier
							{
							b=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_receive_tuple_signatur1547); if (state.failed) return n;
							if ( state.backtracking==0 ) {tn.addIdentifier((b!=null?b.getText():null));}
							}
							break;

						default :
							break loop23;
						}
					}

					match(input, Token.UP, null); if (state.failed) return n;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "receive_tuple_signatur"



	// $ANTLR start "assignment"
	// interpreter/Interpreter_HLL1.g:233:1: assignment returns [Node n] : ( ^( '=' Identifier a= expression ) | ^( '+=' Identifier a= expression ) | ^( '-=' Identifier a= expression ) | ^( '*=' Identifier a= expression ) | ^( '/=' Identifier a= expression ) | ^( '%=' Identifier a= expression ) );
	public final Node assignment() throws RecognitionException {
		Node n = null;


		CommonTree Identifier44=null;
		CommonTree Identifier45=null;
		CommonTree Identifier46=null;
		CommonTree Identifier47=null;
		CommonTree Identifier48=null;
		CommonTree Identifier49=null;
		Node a =null;

		try {
			// interpreter/Interpreter_HLL1.g:234:2: ( ^( '=' Identifier a= expression ) | ^( '+=' Identifier a= expression ) | ^( '-=' Identifier a= expression ) | ^( '*=' Identifier a= expression ) | ^( '/=' Identifier a= expression ) | ^( '%=' Identifier a= expression ) )
			int alt25=6;
			switch ( input.LA(1) ) {
			case 77:
				{
				alt25=1;
				}
				break;
			case 63:
				{
				alt25=2;
				}
				break;
			case 67:
				{
				alt25=3;
				}
				break;
			case 60:
				{
				alt25=4;
				}
				break;
			case 72:
				{
				alt25=5;
				}
				break;
			case 56:
				{
				alt25=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}
			switch (alt25) {
				case 1 :
					// interpreter/Interpreter_HLL1.g:234:4: ^( '=' Identifier a= expression )
					{
					match(input,77,FOLLOW_77_in_assignment1568); if (state.failed) return n;
					match(input, Token.DOWN, null); if (state.failed) return n;
					Identifier44=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_assignment1570); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_assignment1574);
					a=expression();
					state._fsp--;
					if (state.failed) return n;
					match(input, Token.UP, null); if (state.failed) return n;

					if ( state.backtracking==0 ) {n = new AssignmentNode((Identifier44!=null?Identifier44.getText():null), a, currentScope);}
					}
					break;
				case 2 :
					// interpreter/Interpreter_HLL1.g:236:4: ^( '+=' Identifier a= expression )
					{
					match(input,63,FOLLOW_63_in_assignment1587); if (state.failed) return n;
					match(input, Token.DOWN, null); if (state.failed) return n;
					Identifier45=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_assignment1589); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_assignment1593);
					a=expression();
					state._fsp--;
					if (state.failed) return n;
					match(input, Token.UP, null); if (state.failed) return n;

					if ( state.backtracking==0 ) {n = new AssignmentNode((Identifier45!=null?Identifier45.getText():null), new AddNode(new IdentifierNode((Identifier45!=null?Identifier45.getText():null), currentScope), a), currentScope);}
					}
					break;
				case 3 :
					// interpreter/Interpreter_HLL1.g:238:4: ^( '-=' Identifier a= expression )
					{
					match(input,67,FOLLOW_67_in_assignment1607); if (state.failed) return n;
					match(input, Token.DOWN, null); if (state.failed) return n;
					Identifier46=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_assignment1609); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_assignment1613);
					a=expression();
					state._fsp--;
					if (state.failed) return n;
					match(input, Token.UP, null); if (state.failed) return n;

					if ( state.backtracking==0 ) {n = new AssignmentNode((Identifier46!=null?Identifier46.getText():null), new SubtractNode(new IdentifierNode((Identifier46!=null?Identifier46.getText():null), currentScope), a), currentScope);}
					}
					break;
				case 4 :
					// interpreter/Interpreter_HLL1.g:240:4: ^( '*=' Identifier a= expression )
					{
					match(input,60,FOLLOW_60_in_assignment1627); if (state.failed) return n;
					match(input, Token.DOWN, null); if (state.failed) return n;
					Identifier47=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_assignment1629); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_assignment1633);
					a=expression();
					state._fsp--;
					if (state.failed) return n;
					match(input, Token.UP, null); if (state.failed) return n;

					if ( state.backtracking==0 ) {n = new AssignmentNode((Identifier47!=null?Identifier47.getText():null), new MultNode(new IdentifierNode((Identifier47!=null?Identifier47.getText():null), currentScope), a), currentScope);}
					}
					break;
				case 5 :
					// interpreter/Interpreter_HLL1.g:242:4: ^( '/=' Identifier a= expression )
					{
					match(input,72,FOLLOW_72_in_assignment1647); if (state.failed) return n;
					match(input, Token.DOWN, null); if (state.failed) return n;
					Identifier48=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_assignment1649); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_assignment1653);
					a=expression();
					state._fsp--;
					if (state.failed) return n;
					match(input, Token.UP, null); if (state.failed) return n;

					if ( state.backtracking==0 ) {n = new AssignmentNode((Identifier48!=null?Identifier48.getText():null), new DivNode(new IdentifierNode((Identifier48!=null?Identifier48.getText():null), currentScope), a), currentScope);}
					}
					break;
				case 6 :
					// interpreter/Interpreter_HLL1.g:244:4: ^( '%=' Identifier a= expression )
					{
					match(input,56,FOLLOW_56_in_assignment1667); if (state.failed) return n;
					match(input, Token.DOWN, null); if (state.failed) return n;
					Identifier49=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_assignment1669); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_assignment1673);
					a=expression();
					state._fsp--;
					if (state.failed) return n;
					match(input, Token.UP, null); if (state.failed) return n;

					if ( state.backtracking==0 ) {n = new AssignmentNode((Identifier49!=null?Identifier49.getText():null), new ModNode(new IdentifierNode((Identifier49!=null?Identifier49.getText():null), currentScope), a), currentScope);}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "assignment"



	// $ANTLR start "setArgument"
	// interpreter/Interpreter_HLL1.g:247:1: setArgument returns [TupleNode n] : ( primary | tuple );
	public final TupleNode setArgument() throws RecognitionException {
		TupleNode n = null;


		Node primary50 =null;
		TupleNode tuple51 =null;

		try {
			// interpreter/Interpreter_HLL1.g:248:2: ( primary | tuple )
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==BooleanLiteral||(LA26_0 >= Identifier && LA26_0 <= IntegerLiteral)) ) {
				alt26=1;
			}
			else if ( (LA26_0==ARGUMENTS) ) {
				alt26=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}

			switch (alt26) {
				case 1 :
					// interpreter/Interpreter_HLL1.g:248:4: primary
					{
					pushFollow(FOLLOW_primary_in_setArgument1695);
					primary50=primary();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) {n = new TupleNode(primary50);}
					}
					break;
				case 2 :
					// interpreter/Interpreter_HLL1.g:249:4: tuple
					{
					pushFollow(FOLLOW_tuple_in_setArgument1703);
					tuple51=tuple();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) {n = tuple51;}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "setArgument"



	// $ANTLR start "tuple"
	// interpreter/Interpreter_HLL1.g:251:1: tuple returns [TupleNode n] : ^( ARGUMENTS ( primary )+ ) ;
	public final TupleNode tuple() throws RecognitionException {
		TupleNode n = null;


		Node primary52 =null;


			  TupleNode tn = new TupleNode();
			  n = tn;
			
		try {
			// interpreter/Interpreter_HLL1.g:255:3: ( ^( ARGUMENTS ( primary )+ ) )
			// interpreter/Interpreter_HLL1.g:256:2: ^( ARGUMENTS ( primary )+ )
			{
			match(input,ARGUMENTS,FOLLOW_ARGUMENTS_in_tuple1727); if (state.failed) return n;
			match(input, Token.DOWN, null); if (state.failed) return n;
			// interpreter/Interpreter_HLL1.g:256:14: ( primary )+
			int cnt27=0;
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==BooleanLiteral||(LA27_0 >= Identifier && LA27_0 <= IntegerLiteral)) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// interpreter/Interpreter_HLL1.g:256:15: primary
					{
					pushFollow(FOLLOW_primary_in_tuple1730);
					primary52=primary();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) {tn.addTupleObject(primary52);}
					}
					break;

				default :
					if ( cnt27 >= 1 ) break loop27;
					if (state.backtracking>0) {state.failed=true; return n;}
					EarlyExitException eee = new EarlyExitException(27, input);
					throw eee;
				}
				cnt27++;
			}

			match(input, Token.UP, null); if (state.failed) return n;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "tuple"



	// $ANTLR start "primary"
	// interpreter/Interpreter_HLL1.g:258:1: primary returns [Node n] : ( Identifier | literal );
	public final Node primary() throws RecognitionException {
		Node n = null;


		CommonTree Identifier53=null;
		Node literal54 =null;

		try {
			// interpreter/Interpreter_HLL1.g:259:2: ( Identifier | literal )
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==Identifier) ) {
				alt28=1;
			}
			else if ( (LA28_0==BooleanLiteral||LA28_0==IntegerLiteral) ) {
				alt28=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}

			switch (alt28) {
				case 1 :
					// interpreter/Interpreter_HLL1.g:259:4: Identifier
					{
					Identifier53=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_primary1750); if (state.failed) return n;
					if ( state.backtracking==0 ) {n = new IdentifierNode((Identifier53!=null?Identifier53.getText():null), currentScope);}
					}
					break;
				case 2 :
					// interpreter/Interpreter_HLL1.g:260:4: literal
					{
					pushFollow(FOLLOW_literal_in_primary1759);
					literal54=literal();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) {n = literal54;}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "primary"



	// $ANTLR start "literal"
	// interpreter/Interpreter_HLL1.g:262:1: literal returns [Node n] : ( BooleanLiteral | IntegerLiteral );
	public final Node literal() throws RecognitionException {
		Node n = null;


		CommonTree BooleanLiteral55=null;
		CommonTree IntegerLiteral56=null;

		try {
			// interpreter/Interpreter_HLL1.g:263:2: ( BooleanLiteral | IntegerLiteral )
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==BooleanLiteral) ) {
				alt29=1;
			}
			else if ( (LA29_0==IntegerLiteral) ) {
				alt29=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}

			switch (alt29) {
				case 1 :
					// interpreter/Interpreter_HLL1.g:263:4: BooleanLiteral
					{
					BooleanLiteral55=(CommonTree)match(input,BooleanLiteral,FOLLOW_BooleanLiteral_in_literal1778); if (state.failed) return n;
					if ( state.backtracking==0 ) {n = new AtomNode(Boolean.parseBoolean((BooleanLiteral55!=null?BooleanLiteral55.getText():null)));}
					}
					break;
				case 2 :
					// interpreter/Interpreter_HLL1.g:264:4: IntegerLiteral
					{
					IntegerLiteral56=(CommonTree)match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_literal1786); if (state.failed) return n;
					if ( state.backtracking==0 ) {n = new AtomNode(Integer.parseInt((IntegerLiteral56!=null?IntegerLiteral56.getText():null)));}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "literal"



	// $ANTLR start "statement"
	// interpreter/Interpreter_HLL1.g:267:1: statement returns [Node n] : ( block | HALT | sendTo | if_statement | for_statement | local_variable | expression );
	public final Node statement() throws RecognitionException {
		Node n = null;


		Node block57 =null;
		Node sendTo58 =null;
		Node if_statement59 =null;
		Node for_statement60 =null;
		Node local_variable61 =null;
		Node expression62 =null;

		try {
			// interpreter/Interpreter_HLL1.g:268:5: ( block | HALT | sendTo | if_statement | for_statement | local_variable | expression )
			int alt30=7;
			switch ( input.LA(1) ) {
			case BLOCK:
				{
				alt30=1;
				}
				break;
			case HALT:
				{
				alt30=2;
				}
				break;
			case SEND:
				{
				alt30=3;
				}
				break;
			case IF:
				{
				alt30=4;
				}
				break;
			case FOR:
			case FOREACH:
				{
				alt30=5;
				}
				break;
			case LOCAL_VARIABLE:
				{
				alt30=6;
				}
				break;
			case Identifier:
			case PRIMARY:
			case UNARY_EXPRESSION:
			case 54:
			case 55:
			case 56:
			case 59:
			case 60:
			case 61:
			case 63:
			case 65:
			case 67:
			case 71:
			case 72:
			case 75:
			case 76:
			case 77:
			case 78:
			case 79:
			case 80:
			case 101:
			case 119:
				{
				alt30=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}
			switch (alt30) {
				case 1 :
					// interpreter/Interpreter_HLL1.g:268:7: block
					{
					pushFollow(FOLLOW_block_in_statement1811);
					block57=block();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) {n = block57;}
					}
					break;
				case 2 :
					// interpreter/Interpreter_HLL1.g:269:7: HALT
					{
					match(input,HALT,FOLLOW_HALT_in_statement1825); if (state.failed) return n;
					if ( state.backtracking==0 ) {n = new HaltNode();}
					}
					break;
				case 3 :
					// interpreter/Interpreter_HLL1.g:270:7: sendTo
					{
					pushFollow(FOLLOW_sendTo_in_statement1838);
					sendTo58=sendTo();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) {n = sendTo58;}
					}
					break;
				case 4 :
					// interpreter/Interpreter_HLL1.g:271:9: if_statement
					{
					pushFollow(FOLLOW_if_statement_in_statement1853);
					if_statement59=if_statement();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) {n = if_statement59;}
					}
					break;
				case 5 :
					// interpreter/Interpreter_HLL1.g:272:7: for_statement
					{
					pushFollow(FOLLOW_for_statement_in_statement1865);
					for_statement60=for_statement();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) {n = for_statement60;}
					}
					break;
				case 6 :
					// interpreter/Interpreter_HLL1.g:273:7: local_variable
					{
					pushFollow(FOLLOW_local_variable_in_statement1877);
					local_variable61=local_variable();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) {n = local_variable61;}
					}
					break;
				case 7 :
					// interpreter/Interpreter_HLL1.g:274:9: expression
					{
					pushFollow(FOLLOW_expression_in_statement1890);
					expression62=expression();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) {n = expression62;}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "statement"



	// $ANTLR start "block"
	// interpreter/Interpreter_HLL1.g:276:1: block returns [Node n] : ^( BLOCK ( statement_list )? ) ;
	public final Node block() throws RecognitionException {
		Node n = null;


		Node statement_list63 =null;

		try {
			// interpreter/Interpreter_HLL1.g:276:23: ( ^( BLOCK ( statement_list )? ) )
			// interpreter/Interpreter_HLL1.g:277:2: ^( BLOCK ( statement_list )? )
			{
			match(input,BLOCK,FOLLOW_BLOCK_in_block1914); if (state.failed) return n;
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); if (state.failed) return n;
				// interpreter/Interpreter_HLL1.g:277:10: ( statement_list )?
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==BLOCK||(LA31_0 >= FOR && LA31_0 <= FOREACH)||LA31_0==HALT||LA31_0==IF||LA31_0==Identifier||LA31_0==LOCAL_VARIABLE||LA31_0==PRIMARY||LA31_0==SEND||LA31_0==UNARY_EXPRESSION||(LA31_0 >= 54 && LA31_0 <= 56)||(LA31_0 >= 59 && LA31_0 <= 61)||LA31_0==63||LA31_0==65||LA31_0==67||(LA31_0 >= 71 && LA31_0 <= 72)||(LA31_0 >= 75 && LA31_0 <= 80)||LA31_0==101||LA31_0==119) ) {
					alt31=1;
				}
				switch (alt31) {
					case 1 :
						// interpreter/Interpreter_HLL1.g:277:11: statement_list
						{
						pushFollow(FOLLOW_statement_list_in_block1917);
						statement_list63=statement_list();
						state._fsp--;
						if (state.failed) return n;
						if ( state.backtracking==0 ) {n = statement_list63;}
						}
						break;

				}

				match(input, Token.UP, null); if (state.failed) return n;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "block"



	// $ANTLR start "statement_list"
	// interpreter/Interpreter_HLL1.g:279:1: statement_list returns [Node n] : ( statement )+ ;
	public final Node statement_list() throws RecognitionException {
		Node n = null;


		Node statement64 =null;


			  BlockNode bn = new BlockNode();
			  n = bn;
			  Scope local = new Scope(currentScope);
			  currentScope = local;
			
		try {
			// interpreter/Interpreter_HLL1.g:288:3: ( ( statement )+ )
			// interpreter/Interpreter_HLL1.g:289:5: ( statement )+
			{
			// interpreter/Interpreter_HLL1.g:289:5: ( statement )+
			int cnt32=0;
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==BLOCK||(LA32_0 >= FOR && LA32_0 <= FOREACH)||LA32_0==HALT||LA32_0==IF||LA32_0==Identifier||LA32_0==LOCAL_VARIABLE||LA32_0==PRIMARY||LA32_0==SEND||LA32_0==UNARY_EXPRESSION||(LA32_0 >= 54 && LA32_0 <= 56)||(LA32_0 >= 59 && LA32_0 <= 61)||LA32_0==63||LA32_0==65||LA32_0==67||(LA32_0 >= 71 && LA32_0 <= 72)||(LA32_0 >= 75 && LA32_0 <= 80)||LA32_0==101||LA32_0==119) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// interpreter/Interpreter_HLL1.g:289:6: statement
					{
					pushFollow(FOLLOW_statement_in_statement_list1955);
					statement64=statement();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) {bn.addStatement(statement64);}
					}
					break;

				default :
					if ( cnt32 >= 1 ) break loop32;
					if (state.backtracking>0) {state.failed=true; return n;}
					EarlyExitException eee = new EarlyExitException(32, input);
					throw eee;
				}
				cnt32++;
			}

			}

			if ( state.backtracking==0 ) {
				  currentScope = currentScope.parent();
				}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "statement_list"



	// $ANTLR start "if_statement"
	// interpreter/Interpreter_HLL1.g:291:1: if_statement returns [Node n] : ^( IF expression statement ( else_statement )? ) ;
	public final Node if_statement() throws RecognitionException {
		Node n = null;


		Node expression65 =null;
		Node statement66 =null;
		Node else_statement67 =null;

		try {
			// interpreter/Interpreter_HLL1.g:291:30: ( ^( IF expression statement ( else_statement )? ) )
			// interpreter/Interpreter_HLL1.g:292:5: ^( IF expression statement ( else_statement )? )
			{
			match(input,IF,FOLLOW_IF_in_if_statement1980); if (state.failed) return n;
			match(input, Token.DOWN, null); if (state.failed) return n;
			pushFollow(FOLLOW_expression_in_if_statement1982);
			expression65=expression();
			state._fsp--;
			if (state.failed) return n;
			pushFollow(FOLLOW_statement_in_if_statement1984);
			statement66=statement();
			state._fsp--;
			if (state.failed) return n;
			// interpreter/Interpreter_HLL1.g:292:31: ( else_statement )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==ELSE) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// interpreter/Interpreter_HLL1.g:292:31: else_statement
					{
					pushFollow(FOLLOW_else_statement_in_if_statement1986);
					else_statement67=else_statement();
					state._fsp--;
					if (state.failed) return n;
					}
					break;

			}

			match(input, Token.UP, null); if (state.failed) return n;

			if ( state.backtracking==0 ) {n = new IfNode(expression65, statement66, else_statement67);}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "if_statement"



	// $ANTLR start "else_statement"
	// interpreter/Interpreter_HLL1.g:295:1: else_statement returns [Node n] : ^( ELSE statement ) ;
	public final Node else_statement() throws RecognitionException {
		Node n = null;


		Node statement68 =null;

		try {
			// interpreter/Interpreter_HLL1.g:295:32: ( ^( ELSE statement ) )
			// interpreter/Interpreter_HLL1.g:296:5: ^( ELSE statement )
			{
			match(input,ELSE,FOLLOW_ELSE_in_else_statement2012); if (state.failed) return n;
			match(input, Token.DOWN, null); if (state.failed) return n;
			pushFollow(FOLLOW_statement_in_else_statement2014);
			statement68=statement();
			state._fsp--;
			if (state.failed) return n;
			match(input, Token.UP, null); if (state.failed) return n;

			if ( state.backtracking==0 ) {n = statement68;}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "else_statement"



	// $ANTLR start "for_statement"
	// interpreter/Interpreter_HLL1.g:298:1: for_statement returns [Node n] : ( ^( FOR forControl statement ) | ^( FOREACH foreachControl statement ) );
	public final Node for_statement() throws RecognitionException {
		Node n = null;


		ForNode forControl69 =null;
		Node statement70 =null;
		ForEachNode foreachControl71 =null;
		Node statement72 =null;


			  Scope forScope = new Scope(currentScope);
			  currentScope = forScope;
			
		try {
			// interpreter/Interpreter_HLL1.g:306:2: ( ^( FOR forControl statement ) | ^( FOREACH foreachControl statement ) )
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==FOR) ) {
				alt34=1;
			}
			else if ( (LA34_0==FOREACH) ) {
				alt34=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}

			switch (alt34) {
				case 1 :
					// interpreter/Interpreter_HLL1.g:306:6: ^( FOR forControl statement )
					{
					match(input,FOR,FOLLOW_FOR_in_for_statement2049); if (state.failed) return n;
					match(input, Token.DOWN, null); if (state.failed) return n;
					pushFollow(FOLLOW_forControl_in_for_statement2051);
					forControl69=forControl();
					state._fsp--;
					if (state.failed) return n;
					pushFollow(FOLLOW_statement_in_for_statement2053);
					statement70=statement();
					state._fsp--;
					if (state.failed) return n;
					match(input, Token.UP, null); if (state.failed) return n;

					if ( state.backtracking==0 ) {forControl69.addBlock(statement70, currentScope);n = forControl69;}
					}
					break;
				case 2 :
					// interpreter/Interpreter_HLL1.g:307:4: ^( FOREACH foreachControl statement )
					{
					match(input,FOREACH,FOLLOW_FOREACH_in_for_statement2065); if (state.failed) return n;
					match(input, Token.DOWN, null); if (state.failed) return n;
					pushFollow(FOLLOW_foreachControl_in_for_statement2067);
					foreachControl71=foreachControl();
					state._fsp--;
					if (state.failed) return n;
					pushFollow(FOLLOW_statement_in_for_statement2069);
					statement72=statement();
					state._fsp--;
					if (state.failed) return n;
					match(input, Token.UP, null); if (state.failed) return n;

					if ( state.backtracking==0 ) {foreachControl71.addBlock(statement72, currentScope);n = foreachControl71;}
					}
					break;

			}
			if ( state.backtracking==0 ) {
				  currentScope = currentScope.parent();
				}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "for_statement"



	// $ANTLR start "forControl"
	// interpreter/Interpreter_HLL1.g:310:1: forControl returns [ForNode n] : ^( FOR_CONTROL forInit a= expression ) ;
	public final ForNode forControl() throws RecognitionException {
		ForNode n = null;


		Node a =null;
		ForNode forInit73 =null;

		try {
			// interpreter/Interpreter_HLL1.g:311:2: ( ^( FOR_CONTROL forInit a= expression ) )
			// interpreter/Interpreter_HLL1.g:312:2: ^( FOR_CONTROL forInit a= expression )
			{
			match(input,FOR_CONTROL,FOLLOW_FOR_CONTROL_in_forControl2095); if (state.failed) return n;
			match(input, Token.DOWN, null); if (state.failed) return n;
			pushFollow(FOLLOW_forInit_in_forControl2097);
			forInit73=forInit();
			state._fsp--;
			if (state.failed) return n;
			pushFollow(FOLLOW_expression_in_forControl2101);
			a=expression();
			state._fsp--;
			if (state.failed) return n;
			match(input, Token.UP, null); if (state.failed) return n;

			if ( state.backtracking==0 ) {forInit73.addStopExpr(a);n = forInit73;}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "forControl"



	// $ANTLR start "forInit"
	// interpreter/Interpreter_HLL1.g:314:1: forInit returns [ForNode n] : ( ^( '=' Identifier a= expression ) | Identifier );
	public final ForNode forInit() throws RecognitionException {
		ForNode n = null;


		CommonTree Identifier74=null;
		CommonTree Identifier75=null;
		Node a =null;

		try {
			// interpreter/Interpreter_HLL1.g:315:2: ( ^( '=' Identifier a= expression ) | Identifier )
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==77) ) {
				alt35=1;
			}
			else if ( (LA35_0==Identifier) ) {
				alt35=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return n;}
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}

			switch (alt35) {
				case 1 :
					// interpreter/Interpreter_HLL1.g:315:4: ^( '=' Identifier a= expression )
					{
					match(input,77,FOLLOW_77_in_forInit2119); if (state.failed) return n;
					match(input, Token.DOWN, null); if (state.failed) return n;
					Identifier74=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_forInit2121); if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_forInit2125);
					a=expression();
					state._fsp--;
					if (state.failed) return n;
					match(input, Token.UP, null); if (state.failed) return n;

					if ( state.backtracking==0 ) {n = new ForNode((Identifier74!=null?Identifier74.getText():null), a);}
					}
					break;
				case 2 :
					// interpreter/Interpreter_HLL1.g:316:4: Identifier
					{
					Identifier75=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_forInit2134); if (state.failed) return n;
					if ( state.backtracking==0 ) {n = new ForNode((Identifier75!=null?Identifier75.getText():null));}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "forInit"



	// $ANTLR start "local_variable"
	// interpreter/Interpreter_HLL1.g:318:1: local_variable returns [Node n] : ^( LOCAL_VARIABLE a= tuple_signatur b= access_set_invocation ) ;
	public final Node local_variable() throws RecognitionException {
		Node n = null;


		TupleSignatur a =null;
		AccessSet b =null;

		try {
			// interpreter/Interpreter_HLL1.g:318:32: ( ^( LOCAL_VARIABLE a= tuple_signatur b= access_set_invocation ) )
			// interpreter/Interpreter_HLL1.g:319:2: ^( LOCAL_VARIABLE a= tuple_signatur b= access_set_invocation )
			{
			match(input,LOCAL_VARIABLE,FOLLOW_LOCAL_VARIABLE_in_local_variable2156); if (state.failed) return n;
			match(input, Token.DOWN, null); if (state.failed) return n;
			pushFollow(FOLLOW_tuple_signatur_in_local_variable2160);
			a=tuple_signatur();
			state._fsp--;
			if (state.failed) return n;
			pushFollow(FOLLOW_access_set_invocation_in_local_variable2164);
			b=access_set_invocation();
			state._fsp--;
			if (state.failed) return n;
			match(input, Token.UP, null); if (state.failed) return n;

			if ( state.backtracking==0 ) {n = new LocalVariableNode(a, b, currentScope);}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "local_variable"



	// $ANTLR start "foreachControl"
	// interpreter/Interpreter_HLL1.g:321:1: foreachControl returns [ForEachNode n] : ^( FOREACH_CONTROL a= tuple_signatur b= set_invocation ) ;
	public final ForEachNode foreachControl() throws RecognitionException {
		ForEachNode n = null;


		TupleSignatur a =null;
		SetNode b =null;

		try {
			// interpreter/Interpreter_HLL1.g:321:39: ( ^( FOREACH_CONTROL a= tuple_signatur b= set_invocation ) )
			// interpreter/Interpreter_HLL1.g:322:2: ^( FOREACH_CONTROL a= tuple_signatur b= set_invocation )
			{
			match(input,FOREACH_CONTROL,FOLLOW_FOREACH_CONTROL_in_foreachControl2182); if (state.failed) return n;
			match(input, Token.DOWN, null); if (state.failed) return n;
			pushFollow(FOLLOW_tuple_signatur_in_foreachControl2186);
			a=tuple_signatur();
			state._fsp--;
			if (state.failed) return n;
			pushFollow(FOLLOW_set_invocation_in_foreachControl2191);
			b=set_invocation();
			state._fsp--;
			if (state.failed) return n;
			match(input, Token.UP, null); if (state.failed) return n;

			if ( state.backtracking==0 ) {n = new ForEachNode(a, b);}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "foreachControl"



	// $ANTLR start "sendTo"
	// interpreter/Interpreter_HLL1.g:324:1: sendTo returns [Node n] : ( ^( SEND sendTuple ALL ) | ^( SEND sendTuple a= expression ) );
	public final Node sendTo() throws RecognitionException {
		Node n = null;


		Node a =null;
		SendTupleNode sendTuple76 =null;
		SendTupleNode sendTuple77 =null;


			  SendNode sn = new SendNode(messagePassing, processId);
			  n = sn;
			
		try {
			// interpreter/Interpreter_HLL1.g:329:2: ( ^( SEND sendTuple ALL ) | ^( SEND sendTuple a= expression ) )
			int alt36=2;
			alt36 = dfa36.predict(input);
			switch (alt36) {
				case 1 :
					// interpreter/Interpreter_HLL1.g:329:4: ^( SEND sendTuple ALL )
					{
					match(input,SEND,FOLLOW_SEND_in_sendTo2216); if (state.failed) return n;
					match(input, Token.DOWN, null); if (state.failed) return n;
					pushFollow(FOLLOW_sendTuple_in_sendTo2218);
					sendTuple76=sendTuple();
					state._fsp--;
					if (state.failed) return n;
					match(input,ALL,FOLLOW_ALL_in_sendTo2220); if (state.failed) return n;
					match(input, Token.UP, null); if (state.failed) return n;

					if ( state.backtracking==0 ) {sn.sendToAll(sendTuple76);}
					}
					break;
				case 2 :
					// interpreter/Interpreter_HLL1.g:330:4: ^( SEND sendTuple a= expression )
					{
					match(input,SEND,FOLLOW_SEND_in_sendTo2231); if (state.failed) return n;
					match(input, Token.DOWN, null); if (state.failed) return n;
					pushFollow(FOLLOW_sendTuple_in_sendTo2233);
					sendTuple77=sendTuple();
					state._fsp--;
					if (state.failed) return n;
					pushFollow(FOLLOW_expression_in_sendTo2237);
					a=expression();
					state._fsp--;
					if (state.failed) return n;
					match(input, Token.UP, null); if (state.failed) return n;

					if ( state.backtracking==0 ) {sn.sendTo(sendTuple77, a);}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "sendTo"



	// $ANTLR start "sendTuple"
	// interpreter/Interpreter_HLL1.g:332:1: sendTuple returns [SendTupleNode n] : ^( ARGUMENTS (a= mtype ) (b= primary )* ) ;
	public final SendTupleNode sendTuple() throws RecognitionException {
		SendTupleNode n = null;


		MTypeNode a =null;
		Node b =null;


			  SendTupleNode tn = new SendTupleNode();
			  n = tn;
			
		try {
			// interpreter/Interpreter_HLL1.g:336:3: ( ^( ARGUMENTS (a= mtype ) (b= primary )* ) )
			// interpreter/Interpreter_HLL1.g:337:2: ^( ARGUMENTS (a= mtype ) (b= primary )* )
			{
			match(input,ARGUMENTS,FOLLOW_ARGUMENTS_in_sendTuple2261); if (state.failed) return n;
			match(input, Token.DOWN, null); if (state.failed) return n;
			// interpreter/Interpreter_HLL1.g:337:14: (a= mtype )
			// interpreter/Interpreter_HLL1.g:337:15: a= mtype
			{
			pushFollow(FOLLOW_mtype_in_sendTuple2266);
			a=mtype();
			state._fsp--;
			if (state.failed) return n;
			if ( state.backtracking==0 ) {tn.addMType(a);}
			}

			// interpreter/Interpreter_HLL1.g:337:45: (b= primary )*
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==BooleanLiteral||(LA37_0 >= Identifier && LA37_0 <= IntegerLiteral)) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// interpreter/Interpreter_HLL1.g:337:46: b= primary
					{
					pushFollow(FOLLOW_primary_in_sendTuple2274);
					b=primary();
					state._fsp--;
					if (state.failed) return n;
					if ( state.backtracking==0 ) {tn.addTupleObject(b);}
					}
					break;

				default :
					break loop37;
				}
			}

			match(input, Token.UP, null); if (state.failed) return n;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "sendTuple"



	// $ANTLR start "mtype"
	// interpreter/Interpreter_HLL1.g:339:1: mtype returns [MTypeNode n] : Identifier ;
	public final MTypeNode mtype() throws RecognitionException {
		MTypeNode n = null;


		CommonTree Identifier78=null;

		try {
			// interpreter/Interpreter_HLL1.g:339:28: ( Identifier )
			// interpreter/Interpreter_HLL1.g:340:2: Identifier
			{
			Identifier78=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_mtype2293); if (state.failed) return n;
			if ( state.backtracking==0 ) {n = new MTypeNode((Identifier78!=null?Identifier78.getText():null), mtypes, currentScope);}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "mtype"

	// Delegated rules


	protected DFA36 dfa36 = new DFA36(this);
	static final String DFA36_eotS =
		"\14\uffff";
	static final String DFA36_eofS =
		"\14\uffff";
	static final String DFA36_minS =
		"\1\52\1\2\1\6\1\2\1\34\4\3\1\5\2\uffff";
	static final String DFA36_maxS =
		"\1\52\1\2\1\6\1\2\1\34\4\35\1\167\2\uffff";
	static final String DFA36_acceptS =
		"\12\uffff\1\1\1\2";
	static final String DFA36_specialS =
		"\14\uffff}>";
	static final String[] DFA36_transitionS = {
			"\1\1",
			"\1\2",
			"\1\3",
			"\1\4",
			"\1\5",
			"\1\11\5\uffff\1\7\22\uffff\1\6\1\10",
			"\1\11\5\uffff\1\7\22\uffff\1\6\1\10",
			"\1\11\5\uffff\1\7\22\uffff\1\6\1\10",
			"\1\11\5\uffff\1\7\22\uffff\1\6\1\10",
			"\1\12\26\uffff\1\13\5\uffff\1\13\15\uffff\1\13\5\uffff\3\13\2\uffff"+
			"\3\13\1\uffff\1\13\1\uffff\1\13\1\uffff\1\13\3\uffff\2\13\2\uffff\6\13"+
			"\24\uffff\1\13\21\uffff\1\13",
			"",
			""
	};

	static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
	static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
	static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
	static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
	static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
	static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
	static final short[][] DFA36_transition;

	static {
		int numStates = DFA36_transitionS.length;
		DFA36_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
		}
	}

	protected class DFA36 extends DFA {

		public DFA36(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 36;
			this.eot = DFA36_eot;
			this.eof = DFA36_eof;
			this.min = DFA36_min;
			this.max = DFA36_max;
			this.accept = DFA36_accept;
			this.special = DFA36_special;
			this.transition = DFA36_transition;
		}
		@Override
		public String getDescription() {
			return "324:1: sendTo returns [Node n] : ( ^( SEND sendTuple ALL ) | ^( SEND sendTuple a= expression ) );";
		}
	}

	public static final BitSet FOLLOW_declarationBlock_in_algorithm68 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_initialBlock_in_algorithm70 = new BitSet(new long[]{0x0000810000000000L});
	public static final BitSet FOLLOW_receiveBlock_in_algorithm72 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_stepBlock_in_algorithm75 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLES_BLOCK_in_declarationBlock98 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_declaration_in_declarationBlock101 = new BitSet(new long[]{0x0004080000008008L});
	public static final BitSet FOLLOW_INIT_BLOCK_in_initialBlock126 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_initialization_in_initialBlock129 = new BitSet(new long[]{0xB9C90404914C0108L,0x008000200001F98AL});
	public static final BitSet FOLLOW_RECEIVE_BLOCK_in_receiveBlock153 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_received_in_receiveBlock156 = new BitSet(new long[]{0x0000008000000008L});
	public static final BitSet FOLLOW_STEP_BLOCK_in_stepBlock187 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_stepBlock192 = new BitSet(new long[]{0xB9C10404914C0108L,0x008000200001F98AL});
	public static final BitSet FOLLOW_variableDeclaration_in_declaration214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enumDeclaration_in_declaration224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_setDeclaration_in_declaration234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_DECLARATION_in_variableDeclaration253 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_variableDeclaration255 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_Identifier_in_variableDeclaration257 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SET_DECLARATION_in_setDeclaration275 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_setDeclaration277 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ENUM_DECLARATION_in_enumDeclaration295 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_enumDeclaration297 = new BitSet(new long[]{0x0000000010000008L});
	public static final BitSet FOLLOW_enumBody_in_enumDeclaration299 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_enumBody321 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_PrimitiveType_in_type339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_type348 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableInit_in_initialization370 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_initialization379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_INIT_in_variableInit399 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_variableInit401 = new BitSet(new long[]{0x0000003330000200L});
	public static final BitSet FOLLOW_variableValue_in_variableInit403 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PROC_COUNT_in_variableValue421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PROC_ID_in_variableValue430 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_detValue_in_variableValue440 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nondetValue_in_variableValue456 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_access_invocation_in_variableValue460 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NONDET_INIT_in_nondetValue484 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_detValue_in_nondetValue487 = new BitSet(new long[]{0x0000000030000208L});
	public static final BitSet FOLLOW_NONDET_RANGE_INIT_in_nondetValue499 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_detValue_in_nondetValue503 = new BitSet(new long[]{0x0000000030000200L});
	public static final BitSet FOLLOW_detValue_in_nondetValue507 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_literal_in_detValue525 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_detValue534 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RECEIVE_in_received565 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_receive_tuple_signatur_in_received569 = new BitSet(new long[]{0x0000000010002000L});
	public static final BitSet FOLLOW_sender_in_received573 = new BitSet(new long[]{0xB9C10404914C0100L,0x008000200001F98AL});
	public static final BitSet FOLLOW_statement_in_received577 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DISTINCT_PROCESSES_in_sender595 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_sender599 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_sender607 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_expression633 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_101_in_expression652 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression656 = new BitSet(new long[]{0xB9C1000410000000L,0x008000200001F98AL});
	public static final BitSet FOLLOW_expression_in_expression660 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_119_in_expression677 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression681 = new BitSet(new long[]{0xB9C1000410000000L,0x008000200001F98AL});
	public static final BitSet FOLLOW_expression_in_expression685 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_78_in_expression698 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression702 = new BitSet(new long[]{0xB9C1000410000000L,0x008000200001F98AL});
	public static final BitSet FOLLOW_expression_in_expression706 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_54_in_expression723 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression727 = new BitSet(new long[]{0xB9C1000410000000L,0x008000200001F98AL});
	public static final BitSet FOLLOW_expression_in_expression731 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_75_in_expression748 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression752 = new BitSet(new long[]{0xB9C1000410000000L,0x008000200001F98AL});
	public static final BitSet FOLLOW_expression_in_expression756 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_79_in_expression774 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression778 = new BitSet(new long[]{0xB9C1000410000000L,0x008000200001F98AL});
	public static final BitSet FOLLOW_expression_in_expression782 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_76_in_expression800 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression804 = new BitSet(new long[]{0xB9C1000410000000L,0x008000200001F98AL});
	public static final BitSet FOLLOW_expression_in_expression808 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_80_in_expression825 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression829 = new BitSet(new long[]{0xB9C1000410000000L,0x008000200001F98AL});
	public static final BitSet FOLLOW_expression_in_expression833 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_61_in_expression850 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression854 = new BitSet(new long[]{0xB9C1000410000000L,0x008000200001F98AL});
	public static final BitSet FOLLOW_expression_in_expression858 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_65_in_expression875 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression879 = new BitSet(new long[]{0xB9C1000410000000L,0x008000200001F98AL});
	public static final BitSet FOLLOW_expression_in_expression883 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_59_in_expression900 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression904 = new BitSet(new long[]{0xB9C1000410000000L,0x008000200001F98AL});
	public static final BitSet FOLLOW_expression_in_expression908 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_71_in_expression925 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression929 = new BitSet(new long[]{0xB9C1000410000000L,0x008000200001F98AL});
	public static final BitSet FOLLOW_expression_in_expression933 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_55_in_expression950 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression954 = new BitSet(new long[]{0xB9C1000410000000L,0x008000200001F98AL});
	public static final BitSet FOLLOW_expression_in_expression958 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_EXPRESSION_in_expression973 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_61_in_expression975 = new BitSet(new long[]{0xB9C1000410000000L,0x008000200001F98AL});
	public static final BitSet FOLLOW_expression_in_expression979 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_EXPRESSION_in_expression993 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_65_in_expression995 = new BitSet(new long[]{0xB9C1000410000000L,0x008000200001F98AL});
	public static final BitSet FOLLOW_expression_in_expression999 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_EXPRESSION_in_expression1013 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_53_in_expression1015 = new BitSet(new long[]{0xB9C1000410000000L,0x008000200001F98AL});
	public static final BitSet FOLLOW_expression_in_expression1019 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_EXPRESSION_in_expression1033 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_expression1035 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_expression1037 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_EXPRESSION_in_expression1051 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_expression1053 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_expression1055 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expression_set_invocation_in_expression1070 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operational_set_invocation_in_expression1083 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNARY_EXPRESSION_in_expression1097 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_62_in_expression1099 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_Identifier_in_expression1101 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_EXPRESSION_in_expression1115 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_expression1117 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_Identifier_in_expression1119 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRIMARY_in_expression1133 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_primary_in_expression1135 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_expression_set_invocation1163 = new BitSet(new long[]{0x0000400000001000L});
	public static final BitSet FOLLOW_expression_invocation_in_expression_set_invocation1165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_filter_expression_invocation_in_expression_set_invocation1175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONTAINS_INVOCATION_in_expression_invocation1195 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_setArgument_in_expression_invocation1197 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SIZE_INVOCATION_in_expression_invocation1206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_operational_set_invocation1228 = new BitSet(new long[]{0x0000020004000000L});
	public static final BitSet FOLLOW_operational_invocation_in_operational_set_invocation1232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SET_INVOCATION_in_set_invocation1251 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_set_invocation1253 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SET_INVOCATION_in_set_invocation1264 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_filter_set_invocation_in_set_invocation1266 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_filter_set_invocation_in_filter_expression_invocation1285 = new BitSet(new long[]{0x0000400000001000L});
	public static final BitSet FOLLOW_expression_invocation_in_filter_expression_invocation1289 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_filter_set_invocation1305 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_filter_invocation_in_filter_set_invocation1309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FILTER_INVOCATION_in_filter_invocation1330 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_lambda_expression_in_filter_invocation1334 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INSERT_INVOCATION_in_operational_invocation1355 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_setArgument_in_operational_invocation1357 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_REMOVE_INVOCATION_in_operational_invocation1366 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_setArgument_in_operational_invocation1368 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_access_set_invocation1384 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_access_invocation_in_access_set_invocation1388 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACCESS_INVOCATION_in_access_invocation1404 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACCESS_INVOCATION_in_access_invocation1413 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_lambda_expression_in_access_invocation1417 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LAMBDA_EXPRESSION_in_lambda_expression1451 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_tuple_signatur_in_lambda_expression1455 = new BitSet(new long[]{0xB9C1000410000000L,0x008000200001F98AL});
	public static final BitSet FOLLOW_expression_in_lambda_expression1459 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_tuple_signatur1483 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SIGNATUR_in_tuple_signatur1494 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_tuple_signatur1497 = new BitSet(new long[]{0x0000000010000008L});
	public static final BitSet FOLLOW_Identifier_in_receive_tuple_signatur1523 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SIGNATUR_in_receive_tuple_signatur1534 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_receive_tuple_signatur1539 = new BitSet(new long[]{0x0000000010000008L});
	public static final BitSet FOLLOW_Identifier_in_receive_tuple_signatur1547 = new BitSet(new long[]{0x0000000010000008L});
	public static final BitSet FOLLOW_77_in_assignment1568 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_assignment1570 = new BitSet(new long[]{0xB9C1000410000000L,0x008000200001F98AL});
	public static final BitSet FOLLOW_expression_in_assignment1574 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_63_in_assignment1587 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_assignment1589 = new BitSet(new long[]{0xB9C1000410000000L,0x008000200001F98AL});
	public static final BitSet FOLLOW_expression_in_assignment1593 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_assignment1607 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_assignment1609 = new BitSet(new long[]{0xB9C1000410000000L,0x008000200001F98AL});
	public static final BitSet FOLLOW_expression_in_assignment1613 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_60_in_assignment1627 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_assignment1629 = new BitSet(new long[]{0xB9C1000410000000L,0x008000200001F98AL});
	public static final BitSet FOLLOW_expression_in_assignment1633 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_72_in_assignment1647 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_assignment1649 = new BitSet(new long[]{0xB9C1000410000000L,0x008000200001F98AL});
	public static final BitSet FOLLOW_expression_in_assignment1653 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_56_in_assignment1667 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_assignment1669 = new BitSet(new long[]{0xB9C1000410000000L,0x008000200001F98AL});
	public static final BitSet FOLLOW_expression_in_assignment1673 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_primary_in_setArgument1695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tuple_in_setArgument1703 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARGUMENTS_in_tuple1727 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_primary_in_tuple1730 = new BitSet(new long[]{0x0000000030000208L});
	public static final BitSet FOLLOW_Identifier_in_primary1750 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_primary1759 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BooleanLiteral_in_literal1778 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IntegerLiteral_in_literal1786 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_statement1811 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HALT_in_statement1825 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sendTo_in_statement1838 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_statement_in_statement1853 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_for_statement_in_statement1865 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_local_variable_in_statement1877 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_statement1890 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCK_in_block1914 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_list_in_block1917 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_statement_in_statement_list1955 = new BitSet(new long[]{0xB9C10404914C0102L,0x008000200001F98AL});
	public static final BitSet FOLLOW_IF_in_if_statement1980 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_if_statement1982 = new BitSet(new long[]{0xB9C10404914C0100L,0x008000200001F98AL});
	public static final BitSet FOLLOW_statement_in_if_statement1984 = new BitSet(new long[]{0x0000000000004008L});
	public static final BitSet FOLLOW_else_statement_in_if_statement1986 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ELSE_in_else_statement2012 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_else_statement2014 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FOR_in_for_statement2049 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_forControl_in_for_statement2051 = new BitSet(new long[]{0xB9C10404914C0100L,0x008000200001F98AL});
	public static final BitSet FOLLOW_statement_in_for_statement2053 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FOREACH_in_for_statement2065 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_foreachControl_in_for_statement2067 = new BitSet(new long[]{0xB9C10404914C0100L,0x008000200001F98AL});
	public static final BitSet FOLLOW_statement_in_for_statement2069 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FOR_CONTROL_in_forControl2095 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_forInit_in_forControl2097 = new BitSet(new long[]{0xB9C1000410000000L,0x008000200001F98AL});
	public static final BitSet FOLLOW_expression_in_forControl2101 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_77_in_forInit2119 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_forInit2121 = new BitSet(new long[]{0xB9C1000410000000L,0x008000200001F98AL});
	public static final BitSet FOLLOW_expression_in_forInit2125 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_forInit2134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOCAL_VARIABLE_in_local_variable2156 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_tuple_signatur_in_local_variable2160 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_access_set_invocation_in_local_variable2164 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FOREACH_CONTROL_in_foreachControl2182 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_tuple_signatur_in_foreachControl2186 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_set_invocation_in_foreachControl2191 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SEND_in_sendTo2216 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_sendTuple_in_sendTo2218 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ALL_in_sendTo2220 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SEND_in_sendTo2231 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_sendTuple_in_sendTo2233 = new BitSet(new long[]{0xB9C1000410000000L,0x008000200001F98AL});
	public static final BitSet FOLLOW_expression_in_sendTo2237 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ARGUMENTS_in_sendTuple2261 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_mtype_in_sendTuple2266 = new BitSet(new long[]{0x0000000030000208L});
	public static final BitSet FOLLOW_primary_in_sendTuple2274 = new BitSet(new long[]{0x0000000030000208L});
	public static final BitSet FOLLOW_Identifier_in_mtype2293 = new BitSet(new long[]{0x0000000000000002L});
}
