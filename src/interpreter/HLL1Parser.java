// $ANTLR 3.5 interpreter/HLL1.g 2013-06-12 17:19:54
package interpreter;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class HLL1Parser extends Parser {
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public HLL1Parser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public HLL1Parser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
		this.state.ruleMemo = new HashMap[177+1];


	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return HLL1Parser.tokenNames; }
	@Override public String getGrammarFileName() { return "interpreter/HLL1.g"; }


	public static class algorithm_toString_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "algorithm_toString"
	// interpreter/HLL1.g:60:1: algorithm_toString : algorithm ;
	public final HLL1Parser.algorithm_toString_return algorithm_toString() throws RecognitionException {
		HLL1Parser.algorithm_toString_return retval = new HLL1Parser.algorithm_toString_return();
		retval.start = input.LT(1);
		int algorithm_toString_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope algorithm1 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }

			// interpreter/HLL1.g:60:19: ( algorithm )
			// interpreter/HLL1.g:61:2: algorithm
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_algorithm_in_algorithm_toString358);
			algorithm1=algorithm();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, algorithm1.getTree());

			if ( state.backtracking==0 ) {System.out.println(
			                (algorithm1!=null?((CommonTree)algorithm1.getTree()):null)==null?"null":(algorithm1!=null?((CommonTree)algorithm1.getTree()):null).toStringTree());}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 1, algorithm_toString_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "algorithm_toString"


	public static class algorithm_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "algorithm"
	// interpreter/HLL1.g:63:1: algorithm : declarationBlock initialBlock ( receiveBlock )? stepBlock ;
	public final HLL1Parser.algorithm_return algorithm() throws RecognitionException {
		HLL1Parser.algorithm_return retval = new HLL1Parser.algorithm_return();
		retval.start = input.LT(1);
		int algorithm_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope declarationBlock2 =null;
		ParserRuleReturnScope initialBlock3 =null;
		ParserRuleReturnScope receiveBlock4 =null;
		ParserRuleReturnScope stepBlock5 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

			// interpreter/HLL1.g:63:10: ( declarationBlock initialBlock ( receiveBlock )? stepBlock )
			// interpreter/HLL1.g:64:2: declarationBlock initialBlock ( receiveBlock )? stepBlock
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_declarationBlock_in_algorithm368);
			declarationBlock2=declarationBlock();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, declarationBlock2.getTree());

			pushFollow(FOLLOW_initialBlock_in_algorithm370);
			initialBlock3=initialBlock();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, initialBlock3.getTree());

			// interpreter/HLL1.g:64:32: ( receiveBlock )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( ((LA1_0 >= 91 && LA1_0 <= 92)||LA1_0==120) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// interpreter/HLL1.g:64:32: receiveBlock
					{
					pushFollow(FOLLOW_receiveBlock_in_algorithm372);
					receiveBlock4=receiveBlock();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, receiveBlock4.getTree());

					}
					break;

			}

			pushFollow(FOLLOW_stepBlock_in_algorithm375);
			stepBlock5=stepBlock();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, stepBlock5.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 2, algorithm_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "algorithm"


	public static class declarationBlock_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "declarationBlock"
	// interpreter/HLL1.g:67:1: declarationBlock : ( 'Variables' | 'variables' | 'VARIABLES' ) ( ':' )? ( declaration )* -> ^( VARIABLES_BLOCK ( declaration )* ) ;
	public final HLL1Parser.declarationBlock_return declarationBlock() throws RecognitionException {
		HLL1Parser.declarationBlock_return retval = new HLL1Parser.declarationBlock_return();
		retval.start = input.LT(1);
		int declarationBlock_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal6=null;
		Token string_literal7=null;
		Token string_literal8=null;
		Token char_literal9=null;
		ParserRuleReturnScope declaration10 =null;

		CommonTree string_literal6_tree=null;
		CommonTree string_literal7_tree=null;
		CommonTree string_literal8_tree=null;
		CommonTree char_literal9_tree=null;
		RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
		RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
		RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

			// interpreter/HLL1.g:67:17: ( ( 'Variables' | 'variables' | 'VARIABLES' ) ( ':' )? ( declaration )* -> ^( VARIABLES_BLOCK ( declaration )* ) )
			// interpreter/HLL1.g:68:2: ( 'Variables' | 'variables' | 'VARIABLES' ) ( ':' )? ( declaration )*
			{
			// interpreter/HLL1.g:68:2: ( 'Variables' | 'variables' | 'VARIABLES' )
			int alt2=3;
			switch ( input.LA(1) ) {
			case 97:
				{
				alt2=1;
				}
				break;
			case 128:
				{
				alt2=2;
				}
				break;
			case 96:
				{
				alt2=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// interpreter/HLL1.g:68:3: 'Variables'
					{
					string_literal6=(Token)match(input,97,FOLLOW_97_in_declarationBlock387); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_97.add(string_literal6);

					}
					break;
				case 2 :
					// interpreter/HLL1.g:68:17: 'variables'
					{
					string_literal7=(Token)match(input,128,FOLLOW_128_in_declarationBlock391); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_128.add(string_literal7);

					}
					break;
				case 3 :
					// interpreter/HLL1.g:68:31: 'VARIABLES'
					{
					string_literal8=(Token)match(input,96,FOLLOW_96_in_declarationBlock395); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_96.add(string_literal8);

					}
					break;

			}

			// interpreter/HLL1.g:68:44: ( ':' )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==73) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// interpreter/HLL1.g:68:44: ':'
					{
					char_literal9=(Token)match(input,73,FOLLOW_73_in_declarationBlock398); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_73.add(char_literal9);

					}
					break;

			}

			// interpreter/HLL1.g:68:49: ( declaration )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==Identifier||LA4_0==PrimitiveType||LA4_0==94||LA4_0==105) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// interpreter/HLL1.g:68:49: declaration
					{
					pushFollow(FOLLOW_declaration_in_declarationBlock401);
					declaration10=declaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_declaration.add(declaration10.getTree());
					}
					break;

				default :
					break loop4;
				}
			}

			// AST REWRITE
			// elements: declaration
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 68:62: -> ^( VARIABLES_BLOCK ( declaration )* )
			{
				// interpreter/HLL1.g:68:65: ^( VARIABLES_BLOCK ( declaration )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARIABLES_BLOCK, "VARIABLES_BLOCK"), root_1);
				// interpreter/HLL1.g:68:83: ( declaration )*
				while ( stream_declaration.hasNext() ) {
					adaptor.addChild(root_1, stream_declaration.nextTree());
				}
				stream_declaration.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 3, declarationBlock_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "declarationBlock"


	public static class declaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "declaration"
	// interpreter/HLL1.g:70:1: declaration : ( variableDeclaration ';' !| enumDeclaration ';' !| setDeclaration ';' !);
	public final HLL1Parser.declaration_return declaration() throws RecognitionException {
		HLL1Parser.declaration_return retval = new HLL1Parser.declaration_return();
		retval.start = input.LT(1);
		int declaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal12=null;
		Token char_literal14=null;
		Token char_literal16=null;
		ParserRuleReturnScope variableDeclaration11 =null;
		ParserRuleReturnScope enumDeclaration13 =null;
		ParserRuleReturnScope setDeclaration15 =null;

		CommonTree char_literal12_tree=null;
		CommonTree char_literal14_tree=null;
		CommonTree char_literal16_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

			// interpreter/HLL1.g:71:2: ( variableDeclaration ';' !| enumDeclaration ';' !| setDeclaration ';' !)
			int alt5=3;
			switch ( input.LA(1) ) {
			case Identifier:
			case PrimitiveType:
				{
				alt5=1;
				}
				break;
			case 105:
				{
				alt5=2;
				}
				break;
			case 94:
				{
				alt5=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// interpreter/HLL1.g:71:4: variableDeclaration ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_variableDeclaration_in_declaration421);
					variableDeclaration11=variableDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration11.getTree());

					char_literal12=(Token)match(input,74,FOLLOW_74_in_declaration423); if (state.failed) return retval;
					}
					break;
				case 2 :
					// interpreter/HLL1.g:72:4: enumDeclaration ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_enumDeclaration_in_declaration429);
					enumDeclaration13=enumDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDeclaration13.getTree());

					char_literal14=(Token)match(input,74,FOLLOW_74_in_declaration431); if (state.failed) return retval;
					}
					break;
				case 3 :
					// interpreter/HLL1.g:73:4: setDeclaration ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_setDeclaration_in_declaration437);
					setDeclaration15=setDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, setDeclaration15.getTree());

					char_literal16=(Token)match(input,74,FOLLOW_74_in_declaration439); if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 4, declaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "declaration"


	public static class variableDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "variableDeclaration"
	// interpreter/HLL1.g:76:1: variableDeclaration : type Identifier -> ^( VARIABLE_DECLARATION type Identifier ) ;
	public final HLL1Parser.variableDeclaration_return variableDeclaration() throws RecognitionException {
		HLL1Parser.variableDeclaration_return retval = new HLL1Parser.variableDeclaration_return();
		retval.start = input.LT(1);
		int variableDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier18=null;
		ParserRuleReturnScope type17 =null;

		CommonTree Identifier18_tree=null;
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

			// interpreter/HLL1.g:76:20: ( type Identifier -> ^( VARIABLE_DECLARATION type Identifier ) )
			// interpreter/HLL1.g:77:2: type Identifier
			{
			pushFollow(FOLLOW_type_in_variableDeclaration451);
			type17=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_type.add(type17.getTree());
			Identifier18=(Token)match(input,Identifier,FOLLOW_Identifier_in_variableDeclaration453); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(Identifier18);

			// AST REWRITE
			// elements: type, Identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 77:18: -> ^( VARIABLE_DECLARATION type Identifier )
			{
				// interpreter/HLL1.g:77:21: ^( VARIABLE_DECLARATION type Identifier )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARIABLE_DECLARATION, "VARIABLE_DECLARATION"), root_1);
				adaptor.addChild(root_1, stream_type.nextTree());
				adaptor.addChild(root_1, stream_Identifier.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 5, variableDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "variableDeclaration"


	public static class setDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "setDeclaration"
	// interpreter/HLL1.g:79:1: setDeclaration : 'Set' Identifier -> ^( SET_DECLARATION Identifier ) ;
	public final HLL1Parser.setDeclaration_return setDeclaration() throws RecognitionException {
		HLL1Parser.setDeclaration_return retval = new HLL1Parser.setDeclaration_return();
		retval.start = input.LT(1);
		int setDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal19=null;
		Token Identifier20=null;

		CommonTree string_literal19_tree=null;
		CommonTree Identifier20_tree=null;
		RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

			// interpreter/HLL1.g:79:15: ( 'Set' Identifier -> ^( SET_DECLARATION Identifier ) )
			// interpreter/HLL1.g:80:2: 'Set' Identifier
			{
			string_literal19=(Token)match(input,94,FOLLOW_94_in_setDeclaration473); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_94.add(string_literal19);

			Identifier20=(Token)match(input,Identifier,FOLLOW_Identifier_in_setDeclaration475); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(Identifier20);

			// AST REWRITE
			// elements: Identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 80:19: -> ^( SET_DECLARATION Identifier )
			{
				// interpreter/HLL1.g:80:22: ^( SET_DECLARATION Identifier )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET_DECLARATION, "SET_DECLARATION"), root_1);
				adaptor.addChild(root_1, stream_Identifier.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 6, setDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "setDeclaration"


	public static class enumDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "enumDeclaration"
	// interpreter/HLL1.g:82:1: enumDeclaration : 'enum' Identifier enumBody -> ^( ENUM_DECLARATION Identifier enumBody ) ;
	public final HLL1Parser.enumDeclaration_return enumDeclaration() throws RecognitionException {
		HLL1Parser.enumDeclaration_return retval = new HLL1Parser.enumDeclaration_return();
		retval.start = input.LT(1);
		int enumDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal21=null;
		Token Identifier22=null;
		ParserRuleReturnScope enumBody23 =null;

		CommonTree string_literal21_tree=null;
		CommonTree Identifier22_tree=null;
		RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_enumBody=new RewriteRuleSubtreeStream(adaptor,"rule enumBody");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

			// interpreter/HLL1.g:83:2: ( 'enum' Identifier enumBody -> ^( ENUM_DECLARATION Identifier enumBody ) )
			// interpreter/HLL1.g:83:4: 'enum' Identifier enumBody
			{
			string_literal21=(Token)match(input,105,FOLLOW_105_in_enumDeclaration493); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_105.add(string_literal21);

			Identifier22=(Token)match(input,Identifier,FOLLOW_Identifier_in_enumDeclaration497); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(Identifier22);

			pushFollow(FOLLOW_enumBody_in_enumDeclaration499);
			enumBody23=enumBody();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_enumBody.add(enumBody23.getTree());
			// AST REWRITE
			// elements: enumBody, Identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 84:2: -> ^( ENUM_DECLARATION Identifier enumBody )
			{
				// interpreter/HLL1.g:84:5: ^( ENUM_DECLARATION Identifier enumBody )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ENUM_DECLARATION, "ENUM_DECLARATION"), root_1);
				adaptor.addChild(root_1, stream_Identifier.nextNode());
				adaptor.addChild(root_1, stream_enumBody.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 7, enumDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "enumDeclaration"


	public static class enumBody_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "enumBody"
	// interpreter/HLL1.g:86:1: enumBody : '{' ! ( enumMemberDeclarations ( ',' !)? )? '}' !;
	public final HLL1Parser.enumBody_return enumBody() throws RecognitionException {
		HLL1Parser.enumBody_return retval = new HLL1Parser.enumBody_return();
		retval.start = input.LT(1);
		int enumBody_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal24=null;
		Token char_literal26=null;
		Token char_literal27=null;
		ParserRuleReturnScope enumMemberDeclarations25 =null;

		CommonTree char_literal24_tree=null;
		CommonTree char_literal26_tree=null;
		CommonTree char_literal27_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

			// interpreter/HLL1.g:87:2: ( '{' ! ( enumMemberDeclarations ( ',' !)? )? '}' !)
			// interpreter/HLL1.g:87:4: '{' ! ( enumMemberDeclarations ( ',' !)? )? '}' !
			{
			root_0 = (CommonTree)adaptor.nil();


			char_literal24=(Token)match(input,129,FOLLOW_129_in_enumBody520); if (state.failed) return retval;
			// interpreter/HLL1.g:87:9: ( enumMemberDeclarations ( ',' !)? )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==Identifier) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// interpreter/HLL1.g:87:10: enumMemberDeclarations ( ',' !)?
					{
					pushFollow(FOLLOW_enumMemberDeclarations_in_enumBody524);
					enumMemberDeclarations25=enumMemberDeclarations();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, enumMemberDeclarations25.getTree());

					// interpreter/HLL1.g:87:36: ( ',' !)?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==64) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// interpreter/HLL1.g:87:36: ',' !
							{
							char_literal26=(Token)match(input,64,FOLLOW_64_in_enumBody526); if (state.failed) return retval;
							}
							break;

					}

					}
					break;

			}

			char_literal27=(Token)match(input,130,FOLLOW_130_in_enumBody534); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 8, enumBody_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "enumBody"


	public static class enumMemberDeclarations_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "enumMemberDeclarations"
	// interpreter/HLL1.g:89:1: enumMemberDeclarations : enumMemberDeclaration ( ',' ! enumMemberDeclaration )* ;
	public final HLL1Parser.enumMemberDeclarations_return enumMemberDeclarations() throws RecognitionException {
		HLL1Parser.enumMemberDeclarations_return retval = new HLL1Parser.enumMemberDeclarations_return();
		retval.start = input.LT(1);
		int enumMemberDeclarations_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal29=null;
		ParserRuleReturnScope enumMemberDeclaration28 =null;
		ParserRuleReturnScope enumMemberDeclaration30 =null;

		CommonTree char_literal29_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

			// interpreter/HLL1.g:90:2: ( enumMemberDeclaration ( ',' ! enumMemberDeclaration )* )
			// interpreter/HLL1.g:90:4: enumMemberDeclaration ( ',' ! enumMemberDeclaration )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_enumMemberDeclaration_in_enumMemberDeclarations546);
			enumMemberDeclaration28=enumMemberDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, enumMemberDeclaration28.getTree());

			// interpreter/HLL1.g:90:26: ( ',' ! enumMemberDeclaration )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==64) ) {
					int LA8_1 = input.LA(2);
					if ( (LA8_1==Identifier) ) {
						alt8=1;
					}

				}

				switch (alt8) {
				case 1 :
					// interpreter/HLL1.g:90:27: ',' ! enumMemberDeclaration
					{
					char_literal29=(Token)match(input,64,FOLLOW_64_in_enumMemberDeclarations549); if (state.failed) return retval;
					pushFollow(FOLLOW_enumMemberDeclaration_in_enumMemberDeclarations552);
					enumMemberDeclaration30=enumMemberDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, enumMemberDeclaration30.getTree());

					}
					break;

				default :
					break loop8;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 9, enumMemberDeclarations_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "enumMemberDeclarations"


	public static class enumMemberDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "enumMemberDeclaration"
	// interpreter/HLL1.g:92:1: enumMemberDeclaration : Identifier ;
	public final HLL1Parser.enumMemberDeclaration_return enumMemberDeclaration() throws RecognitionException {
		HLL1Parser.enumMemberDeclaration_return retval = new HLL1Parser.enumMemberDeclaration_return();
		retval.start = input.LT(1);
		int enumMemberDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier31=null;

		CommonTree Identifier31_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

			// interpreter/HLL1.g:93:2: ( Identifier )
			// interpreter/HLL1.g:93:7: Identifier
			{
			root_0 = (CommonTree)adaptor.nil();


			Identifier31=(Token)match(input,Identifier,FOLLOW_Identifier_in_enumMemberDeclaration571); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier31_tree = (CommonTree)adaptor.create(Identifier31);
			adaptor.addChild(root_0, Identifier31_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 10, enumMemberDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "enumMemberDeclaration"


	public static class initialBlock_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "initialBlock"
	// interpreter/HLL1.g:97:1: initialBlock : ( 'Init' | 'init' | 'INIT' | 'Initialisation' | 'Initialization' | 'initialisation' | 'initialization' | 'INITIALISATION' | 'INITIALIZATION' ) ( ':' )? ( initialization )* -> ^( INIT_BLOCK ( initialization )* ) ;
	public final HLL1Parser.initialBlock_return initialBlock() throws RecognitionException {
		HLL1Parser.initialBlock_return retval = new HLL1Parser.initialBlock_return();
		retval.start = input.LT(1);
		int initialBlock_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal32=null;
		Token string_literal33=null;
		Token string_literal34=null;
		Token string_literal35=null;
		Token string_literal36=null;
		Token string_literal37=null;
		Token string_literal38=null;
		Token string_literal39=null;
		Token string_literal40=null;
		Token char_literal41=null;
		ParserRuleReturnScope initialization42 =null;

		CommonTree string_literal32_tree=null;
		CommonTree string_literal33_tree=null;
		CommonTree string_literal34_tree=null;
		CommonTree string_literal35_tree=null;
		CommonTree string_literal36_tree=null;
		CommonTree string_literal37_tree=null;
		CommonTree string_literal38_tree=null;
		CommonTree string_literal39_tree=null;
		CommonTree string_literal40_tree=null;
		CommonTree char_literal41_tree=null;
		RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
		RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
		RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
		RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
		RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
		RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
		RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
		RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
		RewriteRuleSubtreeStream stream_initialization=new RewriteRuleSubtreeStream(adaptor,"rule initialization");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

			// interpreter/HLL1.g:97:13: ( ( 'Init' | 'init' | 'INIT' | 'Initialisation' | 'Initialization' | 'initialisation' | 'initialization' | 'INITIALISATION' | 'INITIALIZATION' ) ( ':' )? ( initialization )* -> ^( INIT_BLOCK ( initialization )* ) )
			// interpreter/HLL1.g:98:2: ( 'Init' | 'init' | 'INIT' | 'Initialisation' | 'Initialization' | 'initialisation' | 'initialization' | 'INITIALISATION' | 'INITIALIZATION' ) ( ':' )? ( initialization )*
			{
			// interpreter/HLL1.g:98:2: ( 'Init' | 'init' | 'INIT' | 'Initialisation' | 'Initialization' | 'initialisation' | 'initialization' | 'INITIALISATION' | 'INITIALIZATION' )
			int alt9=9;
			switch ( input.LA(1) ) {
			case 84:
				{
				alt9=1;
				}
				break;
			case 113:
				{
				alt9=2;
				}
				break;
			case 81:
				{
				alt9=3;
				}
				break;
			case 85:
				{
				alt9=4;
				}
				break;
			case 86:
				{
				alt9=5;
				}
				break;
			case 114:
				{
				alt9=6;
				}
				break;
			case 115:
				{
				alt9=7;
				}
				break;
			case 82:
				{
				alt9=8;
				}
				break;
			case 83:
				{
				alt9=9;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// interpreter/HLL1.g:98:3: 'Init'
					{
					string_literal32=(Token)match(input,84,FOLLOW_84_in_initialBlock583); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_84.add(string_literal32);

					}
					break;
				case 2 :
					// interpreter/HLL1.g:98:12: 'init'
					{
					string_literal33=(Token)match(input,113,FOLLOW_113_in_initialBlock587); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_113.add(string_literal33);

					}
					break;
				case 3 :
					// interpreter/HLL1.g:98:21: 'INIT'
					{
					string_literal34=(Token)match(input,81,FOLLOW_81_in_initialBlock591); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_81.add(string_literal34);

					}
					break;
				case 4 :
					// interpreter/HLL1.g:98:29: 'Initialisation'
					{
					string_literal35=(Token)match(input,85,FOLLOW_85_in_initialBlock594); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_85.add(string_literal35);

					}
					break;
				case 5 :
					// interpreter/HLL1.g:98:48: 'Initialization'
					{
					string_literal36=(Token)match(input,86,FOLLOW_86_in_initialBlock598); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_86.add(string_literal36);

					}
					break;
				case 6 :
					// interpreter/HLL1.g:98:67: 'initialisation'
					{
					string_literal37=(Token)match(input,114,FOLLOW_114_in_initialBlock602); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_114.add(string_literal37);

					}
					break;
				case 7 :
					// interpreter/HLL1.g:98:85: 'initialization'
					{
					string_literal38=(Token)match(input,115,FOLLOW_115_in_initialBlock605); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_115.add(string_literal38);

					}
					break;
				case 8 :
					// interpreter/HLL1.g:98:104: 'INITIALISATION'
					{
					string_literal39=(Token)match(input,82,FOLLOW_82_in_initialBlock609); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_82.add(string_literal39);

					}
					break;
				case 9 :
					// interpreter/HLL1.g:98:123: 'INITIALIZATION'
					{
					string_literal40=(Token)match(input,83,FOLLOW_83_in_initialBlock613); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_83.add(string_literal40);

					}
					break;

			}

			// interpreter/HLL1.g:98:141: ( ':' )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==73) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// interpreter/HLL1.g:98:141: ':'
					{
					char_literal41=(Token)match(input,73,FOLLOW_73_in_initialBlock616); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_73.add(char_literal41);

					}
					break;

			}

			// interpreter/HLL1.g:98:146: ( initialization )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==BooleanLiteral||(LA11_0 >= Identifier && LA11_0 <= IntegerLiteral)||LA11_0==53||LA11_0==57||(LA11_0 >= 61 && LA11_0 <= 62)||(LA11_0 >= 65 && LA11_0 <= 66)||LA11_0==74||(LA11_0 >= 107 && LA11_0 <= 108)||(LA11_0 >= 110 && LA11_0 <= 111)||LA11_0==117||LA11_0==122||LA11_0==129) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// interpreter/HLL1.g:98:146: initialization
					{
					pushFollow(FOLLOW_initialization_in_initialBlock619);
					initialization42=initialization();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_initialization.add(initialization42.getTree());
					}
					break;

				default :
					break loop11;
				}
			}

			// AST REWRITE
			// elements: initialization
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 98:162: -> ^( INIT_BLOCK ( initialization )* )
			{
				// interpreter/HLL1.g:98:165: ^( INIT_BLOCK ( initialization )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INIT_BLOCK, "INIT_BLOCK"), root_1);
				// interpreter/HLL1.g:98:178: ( initialization )*
				while ( stream_initialization.hasNext() ) {
					adaptor.addChild(root_1, stream_initialization.nextTree());
				}
				stream_initialization.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 11, initialBlock_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "initialBlock"


	public static class initialization_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "initialization"
	// interpreter/HLL1.g:100:1: initialization : ( variableInit ';' !| statement );
	public final HLL1Parser.initialization_return initialization() throws RecognitionException {
		HLL1Parser.initialization_return retval = new HLL1Parser.initialization_return();
		retval.start = input.LT(1);
		int initialization_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal44=null;
		ParserRuleReturnScope variableInit43 =null;
		ParserRuleReturnScope statement45 =null;

		CommonTree char_literal44_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

			// interpreter/HLL1.g:101:2: ( variableInit ';' !| statement )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==Identifier) ) {
				int LA12_1 = input.LA(2);
				if ( (LA12_1==77) ) {
					switch ( input.LA(3) ) {
					case 87:
					case 88:
					case 89:
					case 90:
					case 98:
						{
						alt12=1;
						}
						break;
					case BooleanLiteral:
					case IntegerLiteral:
						{
						int LA12_5 = input.LA(4);
						if ( (LA12_5==74) ) {
							int LA12_7 = input.LA(5);
							if ( (synpred21_HLL1()) ) {
								alt12=1;
							}
							else if ( (true) ) {
								alt12=2;
							}

						}
						else if ( ((LA12_5 >= 54 && LA12_5 <= 55)||LA12_5==59||LA12_5==61||LA12_5==65||LA12_5==71||(LA12_5 >= 75 && LA12_5 <= 76)||(LA12_5 >= 78 && LA12_5 <= 80)||LA12_5==101||LA12_5==119) ) {
							alt12=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 12, 5, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case Identifier:
						{
						int LA12_6 = input.LA(4);
						if ( ((LA12_6 >= 54 && LA12_6 <= 56)||(LA12_6 >= 59 && LA12_6 <= 63)||(LA12_6 >= 65 && LA12_6 <= 68)||(LA12_6 >= 71 && LA12_6 <= 72)||(LA12_6 >= 75 && LA12_6 <= 80)||LA12_6==101||LA12_6==119) ) {
							alt12=2;
						}
						else if ( (LA12_6==74) ) {
							int LA12_8 = input.LA(5);
							if ( (synpred21_HLL1()) ) {
								alt12=1;
							}
							else if ( (true) ) {
								alt12=2;
							}

						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 12, 6, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case 53:
					case 57:
					case 61:
					case 62:
					case 65:
					case 66:
						{
						alt12=2;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 12, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else if ( ((LA12_1 >= 54 && LA12_1 <= 56)||(LA12_1 >= 59 && LA12_1 <= 63)||(LA12_1 >= 65 && LA12_1 <= 68)||(LA12_1 >= 71 && LA12_1 <= 72)||(LA12_1 >= 74 && LA12_1 <= 76)||(LA12_1 >= 78 && LA12_1 <= 80)||LA12_1==101||LA12_1==119) ) {
					alt12=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA12_0==BooleanLiteral||LA12_0==IntegerLiteral||LA12_0==53||LA12_0==57||(LA12_0 >= 61 && LA12_0 <= 62)||(LA12_0 >= 65 && LA12_0 <= 66)||LA12_0==74||(LA12_0 >= 107 && LA12_0 <= 108)||(LA12_0 >= 110 && LA12_0 <= 111)||LA12_0==117||LA12_0==122||LA12_0==129) ) {
				alt12=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// interpreter/HLL1.g:101:4: variableInit ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_variableInit_in_initialization640);
					variableInit43=variableInit();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableInit43.getTree());

					char_literal44=(Token)match(input,74,FOLLOW_74_in_initialization642); if (state.failed) return retval;
					}
					break;
				case 2 :
					// interpreter/HLL1.g:102:4: statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_statement_in_initialization648);
					statement45=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement45.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 12, initialization_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "initialization"


	public static class variableInit_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "variableInit"
	// interpreter/HLL1.g:106:1: variableInit : Identifier '=' variableValue -> ^( VARIABLE_INIT Identifier variableValue ) ;
	public final HLL1Parser.variableInit_return variableInit() throws RecognitionException {
		HLL1Parser.variableInit_return retval = new HLL1Parser.variableInit_return();
		retval.start = input.LT(1);
		int variableInit_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier46=null;
		Token char_literal47=null;
		ParserRuleReturnScope variableValue48 =null;

		CommonTree Identifier46_tree=null;
		CommonTree char_literal47_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_variableValue=new RewriteRuleSubtreeStream(adaptor,"rule variableValue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

			// interpreter/HLL1.g:106:13: ( Identifier '=' variableValue -> ^( VARIABLE_INIT Identifier variableValue ) )
			// interpreter/HLL1.g:107:2: Identifier '=' variableValue
			{
			Identifier46=(Token)match(input,Identifier,FOLLOW_Identifier_in_variableInit661); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(Identifier46);

			char_literal47=(Token)match(input,77,FOLLOW_77_in_variableInit663); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_77.add(char_literal47);

			pushFollow(FOLLOW_variableValue_in_variableInit665);
			variableValue48=variableValue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_variableValue.add(variableValue48.getTree());
			// AST REWRITE
			// elements: Identifier, variableValue
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 107:31: -> ^( VARIABLE_INIT Identifier variableValue )
			{
				// interpreter/HLL1.g:107:34: ^( VARIABLE_INIT Identifier variableValue )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARIABLE_INIT, "VARIABLE_INIT"), root_1);
				adaptor.addChild(root_1, stream_Identifier.nextNode());
				adaptor.addChild(root_1, stream_variableValue.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 13, variableInit_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "variableInit"


	public static class variableValue_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "variableValue"
	// interpreter/HLL1.g:110:1: variableValue : ( ( 'ProcCount' | 'PROC_COUNT' ) -> PROC_COUNT | ( 'ProcId' | 'PROC_ID' ) -> PROC_ID | detValue | '[' ! nondetValue ']' ! '.' ! access_invocation );
	public final HLL1Parser.variableValue_return variableValue() throws RecognitionException {
		HLL1Parser.variableValue_return retval = new HLL1Parser.variableValue_return();
		retval.start = input.LT(1);
		int variableValue_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal49=null;
		Token string_literal50=null;
		Token string_literal51=null;
		Token string_literal52=null;
		Token char_literal54=null;
		Token char_literal56=null;
		Token char_literal57=null;
		ParserRuleReturnScope detValue53 =null;
		ParserRuleReturnScope nondetValue55 =null;
		ParserRuleReturnScope access_invocation58 =null;

		CommonTree string_literal49_tree=null;
		CommonTree string_literal50_tree=null;
		CommonTree string_literal51_tree=null;
		CommonTree string_literal52_tree=null;
		CommonTree char_literal54_tree=null;
		CommonTree char_literal56_tree=null;
		CommonTree char_literal57_tree=null;
		RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
		RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
		RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
		RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

			// interpreter/HLL1.g:111:2: ( ( 'ProcCount' | 'PROC_COUNT' ) -> PROC_COUNT | ( 'ProcId' | 'PROC_ID' ) -> PROC_ID | detValue | '[' ! nondetValue ']' ! '.' ! access_invocation )
			int alt15=4;
			switch ( input.LA(1) ) {
			case 87:
			case 89:
				{
				alt15=1;
				}
				break;
			case 88:
			case 90:
				{
				alt15=2;
				}
				break;
			case BooleanLiteral:
			case Identifier:
			case IntegerLiteral:
				{
				alt15=3;
				}
				break;
			case 98:
				{
				alt15=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// interpreter/HLL1.g:111:4: ( 'ProcCount' | 'PROC_COUNT' )
					{
					// interpreter/HLL1.g:111:4: ( 'ProcCount' | 'PROC_COUNT' )
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==89) ) {
						alt13=1;
					}
					else if ( (LA13_0==87) ) {
						alt13=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 13, 0, input);
						throw nvae;
					}

					switch (alt13) {
						case 1 :
							// interpreter/HLL1.g:111:5: 'ProcCount'
							{
							string_literal49=(Token)match(input,89,FOLLOW_89_in_variableValue689); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_89.add(string_literal49);

							}
							break;
						case 2 :
							// interpreter/HLL1.g:111:19: 'PROC_COUNT'
							{
							string_literal50=(Token)match(input,87,FOLLOW_87_in_variableValue693); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_87.add(string_literal50);

							}
							break;

					}

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 111:34: -> PROC_COUNT
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(PROC_COUNT, "PROC_COUNT"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// interpreter/HLL1.g:112:4: ( 'ProcId' | 'PROC_ID' )
					{
					// interpreter/HLL1.g:112:4: ( 'ProcId' | 'PROC_ID' )
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==90) ) {
						alt14=1;
					}
					else if ( (LA14_0==88) ) {
						alt14=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 14, 0, input);
						throw nvae;
					}

					switch (alt14) {
						case 1 :
							// interpreter/HLL1.g:112:5: 'ProcId'
							{
							string_literal51=(Token)match(input,90,FOLLOW_90_in_variableValue705); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_90.add(string_literal51);

							}
							break;
						case 2 :
							// interpreter/HLL1.g:112:16: 'PROC_ID'
							{
							string_literal52=(Token)match(input,88,FOLLOW_88_in_variableValue709); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_88.add(string_literal52);

							}
							break;

					}

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 112:30: -> PROC_ID
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(PROC_ID, "PROC_ID"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// interpreter/HLL1.g:113:4: detValue
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_detValue_in_variableValue723);
					detValue53=detValue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, detValue53.getTree());

					}
					break;
				case 4 :
					// interpreter/HLL1.g:114:4: '[' ! nondetValue ']' ! '.' ! access_invocation
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal54=(Token)match(input,98,FOLLOW_98_in_variableValue728); if (state.failed) return retval;
					pushFollow(FOLLOW_nondetValue_in_variableValue731);
					nondetValue55=nondetValue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nondetValue55.getTree());

					char_literal56=(Token)match(input,99,FOLLOW_99_in_variableValue733); if (state.failed) return retval;
					char_literal57=(Token)match(input,68,FOLLOW_68_in_variableValue736); if (state.failed) return retval;
					pushFollow(FOLLOW_access_invocation_in_variableValue739);
					access_invocation58=access_invocation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, access_invocation58.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 14, variableValue_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "variableValue"


	public static class nondetValue_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "nondetValue"
	// interpreter/HLL1.g:116:1: nondetValue : ( detValue ( ',' detValue )* -> ^( NONDET_INIT ( detValue )+ ) | ( detValue '..' detValue | detValue '...' detValue ) -> ^( NONDET_RANGE_INIT detValue detValue ) );
	public final HLL1Parser.nondetValue_return nondetValue() throws RecognitionException {
		HLL1Parser.nondetValue_return retval = new HLL1Parser.nondetValue_return();
		retval.start = input.LT(1);
		int nondetValue_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal60=null;
		Token string_literal63=null;
		Token string_literal66=null;
		ParserRuleReturnScope detValue59 =null;
		ParserRuleReturnScope detValue61 =null;
		ParserRuleReturnScope detValue62 =null;
		ParserRuleReturnScope detValue64 =null;
		ParserRuleReturnScope detValue65 =null;
		ParserRuleReturnScope detValue67 =null;

		CommonTree char_literal60_tree=null;
		CommonTree string_literal63_tree=null;
		CommonTree string_literal66_tree=null;
		RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
		RewriteRuleSubtreeStream stream_detValue=new RewriteRuleSubtreeStream(adaptor,"rule detValue");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

			// interpreter/HLL1.g:117:2: ( detValue ( ',' detValue )* -> ^( NONDET_INIT ( detValue )+ ) | ( detValue '..' detValue | detValue '...' detValue ) -> ^( NONDET_RANGE_INIT detValue detValue ) )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==BooleanLiteral||LA18_0==IntegerLiteral) ) {
				int LA18_1 = input.LA(2);
				if ( (LA18_1==64||LA18_1==99) ) {
					alt18=1;
				}
				else if ( ((LA18_1 >= 69 && LA18_1 <= 70)) ) {
					alt18=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
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
			else if ( (LA18_0==Identifier) ) {
				int LA18_2 = input.LA(2);
				if ( (LA18_2==64||LA18_2==99) ) {
					alt18=1;
				}
				else if ( ((LA18_2 >= 69 && LA18_2 <= 70)) ) {
					alt18=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// interpreter/HLL1.g:117:4: detValue ( ',' detValue )*
					{
					pushFollow(FOLLOW_detValue_in_nondetValue751);
					detValue59=detValue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_detValue.add(detValue59.getTree());
					// interpreter/HLL1.g:117:13: ( ',' detValue )*
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( (LA16_0==64) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// interpreter/HLL1.g:117:14: ',' detValue
							{
							char_literal60=(Token)match(input,64,FOLLOW_64_in_nondetValue754); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_64.add(char_literal60);

							pushFollow(FOLLOW_detValue_in_nondetValue756);
							detValue61=detValue();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_detValue.add(detValue61.getTree());
							}
							break;

						default :
							break loop16;
						}
					}

					// AST REWRITE
					// elements: detValue
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 117:29: -> ^( NONDET_INIT ( detValue )+ )
					{
						// interpreter/HLL1.g:117:32: ^( NONDET_INIT ( detValue )+ )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NONDET_INIT, "NONDET_INIT"), root_1);
						if ( !(stream_detValue.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_detValue.hasNext() ) {
							adaptor.addChild(root_1, stream_detValue.nextTree());
						}
						stream_detValue.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// interpreter/HLL1.g:118:5: ( detValue '..' detValue | detValue '...' detValue )
					{
					// interpreter/HLL1.g:118:5: ( detValue '..' detValue | detValue '...' detValue )
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==BooleanLiteral||LA17_0==IntegerLiteral) ) {
						int LA17_1 = input.LA(2);
						if ( (LA17_1==69) ) {
							alt17=1;
						}
						else if ( (LA17_1==70) ) {
							alt17=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 17, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA17_0==Identifier) ) {
						int LA17_2 = input.LA(2);
						if ( (LA17_2==69) ) {
							alt17=1;
						}
						else if ( (LA17_2==70) ) {
							alt17=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 17, 2, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 17, 0, input);
						throw nvae;
					}

					switch (alt17) {
						case 1 :
							// interpreter/HLL1.g:118:7: detValue '..' detValue
							{
							pushFollow(FOLLOW_detValue_in_nondetValue775);
							detValue62=detValue();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_detValue.add(detValue62.getTree());
							string_literal63=(Token)match(input,69,FOLLOW_69_in_nondetValue777); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_69.add(string_literal63);

							pushFollow(FOLLOW_detValue_in_nondetValue779);
							detValue64=detValue();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_detValue.add(detValue64.getTree());
							}
							break;
						case 2 :
							// interpreter/HLL1.g:119:6: detValue '...' detValue
							{
							pushFollow(FOLLOW_detValue_in_nondetValue786);
							detValue65=detValue();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_detValue.add(detValue65.getTree());
							string_literal66=(Token)match(input,70,FOLLOW_70_in_nondetValue788); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_70.add(string_literal66);

							pushFollow(FOLLOW_detValue_in_nondetValue790);
							detValue67=detValue();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_detValue.add(detValue67.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: detValue, detValue
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 120:5: -> ^( NONDET_RANGE_INIT detValue detValue )
					{
						// interpreter/HLL1.g:120:8: ^( NONDET_RANGE_INIT detValue detValue )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NONDET_RANGE_INIT, "NONDET_RANGE_INIT"), root_1);
						adaptor.addChild(root_1, stream_detValue.nextTree());
						adaptor.addChild(root_1, stream_detValue.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 15, nondetValue_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "nondetValue"


	public static class detValue_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "detValue"
	// interpreter/HLL1.g:122:1: detValue : ( literal | Identifier );
	public final HLL1Parser.detValue_return detValue() throws RecognitionException {
		HLL1Parser.detValue_return retval = new HLL1Parser.detValue_return();
		retval.start = input.LT(1);
		int detValue_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier69=null;
		ParserRuleReturnScope literal68 =null;

		CommonTree Identifier69_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

			// interpreter/HLL1.g:123:2: ( literal | Identifier )
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==BooleanLiteral||LA19_0==IntegerLiteral) ) {
				alt19=1;
			}
			else if ( (LA19_0==Identifier) ) {
				alt19=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// interpreter/HLL1.g:123:4: literal
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_literal_in_detValue816);
					literal68=literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, literal68.getTree());

					}
					break;
				case 2 :
					// interpreter/HLL1.g:124:4: Identifier
					{
					root_0 = (CommonTree)adaptor.nil();


					Identifier69=(Token)match(input,Identifier,FOLLOW_Identifier_in_detValue821); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier69_tree = (CommonTree)adaptor.create(Identifier69);
					adaptor.addChild(root_0, Identifier69_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 16, detValue_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "detValue"


	public static class receiveBlock_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "receiveBlock"
	// interpreter/HLL1.g:129:1: receiveBlock : ( 'Receive' | 'receive' | 'RECEIVE' ) ( ':' )? ( received )* -> ^( RECEIVE_BLOCK ( received )* ) ;
	public final HLL1Parser.receiveBlock_return receiveBlock() throws RecognitionException {
		HLL1Parser.receiveBlock_return retval = new HLL1Parser.receiveBlock_return();
		retval.start = input.LT(1);
		int receiveBlock_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal70=null;
		Token string_literal71=null;
		Token string_literal72=null;
		Token char_literal73=null;
		ParserRuleReturnScope received74 =null;

		CommonTree string_literal70_tree=null;
		CommonTree string_literal71_tree=null;
		CommonTree string_literal72_tree=null;
		CommonTree char_literal73_tree=null;
		RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
		RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
		RewriteRuleTokenStream stream_120=new RewriteRuleTokenStream(adaptor,"token 120");
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleSubtreeStream stream_received=new RewriteRuleSubtreeStream(adaptor,"rule received");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

			// interpreter/HLL1.g:129:13: ( ( 'Receive' | 'receive' | 'RECEIVE' ) ( ':' )? ( received )* -> ^( RECEIVE_BLOCK ( received )* ) )
			// interpreter/HLL1.g:130:2: ( 'Receive' | 'receive' | 'RECEIVE' ) ( ':' )? ( received )*
			{
			// interpreter/HLL1.g:130:2: ( 'Receive' | 'receive' | 'RECEIVE' )
			int alt20=3;
			switch ( input.LA(1) ) {
			case 92:
				{
				alt20=1;
				}
				break;
			case 120:
				{
				alt20=2;
				}
				break;
			case 91:
				{
				alt20=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}
			switch (alt20) {
				case 1 :
					// interpreter/HLL1.g:130:3: 'Receive'
					{
					string_literal70=(Token)match(input,92,FOLLOW_92_in_receiveBlock835); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_92.add(string_literal70);

					}
					break;
				case 2 :
					// interpreter/HLL1.g:130:15: 'receive'
					{
					string_literal71=(Token)match(input,120,FOLLOW_120_in_receiveBlock839); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_120.add(string_literal71);

					}
					break;
				case 3 :
					// interpreter/HLL1.g:130:27: 'RECEIVE'
					{
					string_literal72=(Token)match(input,91,FOLLOW_91_in_receiveBlock843); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_91.add(string_literal72);

					}
					break;

			}

			// interpreter/HLL1.g:130:38: ( ':' )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==73) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// interpreter/HLL1.g:130:38: ':'
					{
					char_literal73=(Token)match(input,73,FOLLOW_73_in_receiveBlock846); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_73.add(char_literal73);

					}
					break;

			}

			// interpreter/HLL1.g:130:43: ( received )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==118) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// interpreter/HLL1.g:130:43: received
					{
					pushFollow(FOLLOW_received_in_receiveBlock849);
					received74=received();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_received.add(received74.getTree());
					}
					break;

				default :
					break loop22;
				}
			}

			// AST REWRITE
			// elements: received
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 130:53: -> ^( RECEIVE_BLOCK ( received )* )
			{
				// interpreter/HLL1.g:130:56: ^( RECEIVE_BLOCK ( received )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RECEIVE_BLOCK, "RECEIVE_BLOCK"), root_1);
				// interpreter/HLL1.g:130:72: ( received )*
				while ( stream_received.hasNext() ) {
					adaptor.addChild(root_1, stream_received.nextTree());
				}
				stream_received.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 17, receiveBlock_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "receiveBlock"


	public static class stepBlock_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "stepBlock"
	// interpreter/HLL1.g:134:1: stepBlock : ( 'Step' | 'step' | 'STEP' ) ( ':' )? ( statement )* -> ^( STEP_BLOCK ( statement )* ) ;
	public final HLL1Parser.stepBlock_return stepBlock() throws RecognitionException {
		HLL1Parser.stepBlock_return retval = new HLL1Parser.stepBlock_return();
		retval.start = input.LT(1);
		int stepBlock_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal75=null;
		Token string_literal76=null;
		Token string_literal77=null;
		Token char_literal78=null;
		ParserRuleReturnScope statement79 =null;

		CommonTree string_literal75_tree=null;
		CommonTree string_literal76_tree=null;
		CommonTree string_literal77_tree=null;
		CommonTree char_literal78_tree=null;
		RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
		RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
		RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }

			// interpreter/HLL1.g:134:10: ( ( 'Step' | 'step' | 'STEP' ) ( ':' )? ( statement )* -> ^( STEP_BLOCK ( statement )* ) )
			// interpreter/HLL1.g:135:2: ( 'Step' | 'step' | 'STEP' ) ( ':' )? ( statement )*
			{
			// interpreter/HLL1.g:135:2: ( 'Step' | 'step' | 'STEP' )
			int alt23=3;
			switch ( input.LA(1) ) {
			case 95:
				{
				alt23=1;
				}
				break;
			case 125:
				{
				alt23=2;
				}
				break;
			case 93:
				{
				alt23=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}
			switch (alt23) {
				case 1 :
					// interpreter/HLL1.g:135:3: 'Step'
					{
					string_literal75=(Token)match(input,95,FOLLOW_95_in_stepBlock871); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_95.add(string_literal75);

					}
					break;
				case 2 :
					// interpreter/HLL1.g:135:12: 'step'
					{
					string_literal76=(Token)match(input,125,FOLLOW_125_in_stepBlock875); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_125.add(string_literal76);

					}
					break;
				case 3 :
					// interpreter/HLL1.g:135:21: 'STEP'
					{
					string_literal77=(Token)match(input,93,FOLLOW_93_in_stepBlock879); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_93.add(string_literal77);

					}
					break;

			}

			// interpreter/HLL1.g:135:29: ( ':' )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==73) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// interpreter/HLL1.g:135:29: ':'
					{
					char_literal78=(Token)match(input,73,FOLLOW_73_in_stepBlock882); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_73.add(char_literal78);

					}
					break;

			}

			// interpreter/HLL1.g:135:34: ( statement )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==BooleanLiteral||(LA25_0 >= Identifier && LA25_0 <= IntegerLiteral)||LA25_0==53||LA25_0==57||(LA25_0 >= 61 && LA25_0 <= 62)||(LA25_0 >= 65 && LA25_0 <= 66)||LA25_0==74||(LA25_0 >= 107 && LA25_0 <= 108)||(LA25_0 >= 110 && LA25_0 <= 111)||LA25_0==117||LA25_0==122||LA25_0==129) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// interpreter/HLL1.g:135:34: statement
					{
					pushFollow(FOLLOW_statement_in_stepBlock885);
					statement79=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statement.add(statement79.getTree());
					}
					break;

				default :
					break loop25;
				}
			}

			// AST REWRITE
			// elements: statement
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 135:45: -> ^( STEP_BLOCK ( statement )* )
			{
				// interpreter/HLL1.g:135:48: ^( STEP_BLOCK ( statement )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STEP_BLOCK, "STEP_BLOCK"), root_1);
				// interpreter/HLL1.g:135:61: ( statement )*
				while ( stream_statement.hasNext() ) {
					adaptor.addChild(root_1, stream_statement.nextTree());
				}
				stream_statement.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 18, stepBlock_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "stepBlock"


	public static class statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// interpreter/HLL1.g:140:1: statement : ( block | 'halt' ';' -> HALT | sendTo ';' !| if_statement | for_statement | local_variable | ';' !| expression ';' !);
	public final HLL1Parser.statement_return statement() throws RecognitionException {
		HLL1Parser.statement_return retval = new HLL1Parser.statement_return();
		retval.start = input.LT(1);
		int statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal81=null;
		Token char_literal82=null;
		Token char_literal84=null;
		Token char_literal88=null;
		Token char_literal90=null;
		ParserRuleReturnScope block80 =null;
		ParserRuleReturnScope sendTo83 =null;
		ParserRuleReturnScope if_statement85 =null;
		ParserRuleReturnScope for_statement86 =null;
		ParserRuleReturnScope local_variable87 =null;
		ParserRuleReturnScope expression89 =null;

		CommonTree string_literal81_tree=null;
		CommonTree char_literal82_tree=null;
		CommonTree char_literal84_tree=null;
		CommonTree char_literal88_tree=null;
		CommonTree char_literal90_tree=null;
		RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
		RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

			// interpreter/HLL1.g:141:5: ( block | 'halt' ';' -> HALT | sendTo ';' !| if_statement | for_statement | local_variable | ';' !| expression ';' !)
			int alt26=8;
			switch ( input.LA(1) ) {
			case 129:
				{
				alt26=1;
				}
				break;
			case 110:
				{
				alt26=2;
				}
				break;
			case 122:
				{
				alt26=3;
				}
				break;
			case 111:
				{
				alt26=4;
				}
				break;
			case 107:
			case 108:
				{
				alt26=5;
				}
				break;
			case 117:
				{
				alt26=6;
				}
				break;
			case 74:
				{
				alt26=7;
				}
				break;
			case BooleanLiteral:
			case Identifier:
			case IntegerLiteral:
			case 53:
			case 57:
			case 61:
			case 62:
			case 65:
			case 66:
				{
				alt26=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}
			switch (alt26) {
				case 1 :
					// interpreter/HLL1.g:141:7: block
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_block_in_statement916);
					block80=block();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, block80.getTree());

					}
					break;
				case 2 :
					// interpreter/HLL1.g:142:7: 'halt' ';'
					{
					string_literal81=(Token)match(input,110,FOLLOW_110_in_statement924); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_110.add(string_literal81);

					char_literal82=(Token)match(input,74,FOLLOW_74_in_statement926); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_74.add(char_literal82);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 142:18: -> HALT
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(HALT, "HALT"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// interpreter/HLL1.g:143:7: sendTo ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_sendTo_in_statement938);
					sendTo83=sendTo();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, sendTo83.getTree());

					char_literal84=(Token)match(input,74,FOLLOW_74_in_statement940); if (state.failed) return retval;
					}
					break;
				case 4 :
					// interpreter/HLL1.g:144:9: if_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_if_statement_in_statement951);
					if_statement85=if_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, if_statement85.getTree());

					}
					break;
				case 5 :
					// interpreter/HLL1.g:145:7: for_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_for_statement_in_statement959);
					for_statement86=for_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, for_statement86.getTree());

					}
					break;
				case 6 :
					// interpreter/HLL1.g:146:7: local_variable
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_local_variable_in_statement967);
					local_variable87=local_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, local_variable87.getTree());

					}
					break;
				case 7 :
					// interpreter/HLL1.g:147:9: ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal88=(Token)match(input,74,FOLLOW_74_in_statement977); if (state.failed) return retval;
					}
					break;
				case 8 :
					// interpreter/HLL1.g:148:9: expression ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_expression_in_statement988);
					expression89=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression89.getTree());

					char_literal90=(Token)match(input,74,FOLLOW_74_in_statement990); if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 19, statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class block_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "block"
	// interpreter/HLL1.g:151:1: block : '{' ( statement_list )? '}' -> ^( BLOCK ( statement_list )? ) ;
	public final HLL1Parser.block_return block() throws RecognitionException {
		HLL1Parser.block_return retval = new HLL1Parser.block_return();
		retval.start = input.LT(1);
		int block_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal91=null;
		Token char_literal93=null;
		ParserRuleReturnScope statement_list92 =null;

		CommonTree char_literal91_tree=null;
		CommonTree char_literal93_tree=null;
		RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
		RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
		RewriteRuleSubtreeStream stream_statement_list=new RewriteRuleSubtreeStream(adaptor,"rule statement_list");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }

			// interpreter/HLL1.g:151:6: ( '{' ( statement_list )? '}' -> ^( BLOCK ( statement_list )? ) )
			// interpreter/HLL1.g:152:2: '{' ( statement_list )? '}'
			{
			char_literal91=(Token)match(input,129,FOLLOW_129_in_block1009); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_129.add(char_literal91);

			// interpreter/HLL1.g:152:6: ( statement_list )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==BooleanLiteral||(LA27_0 >= Identifier && LA27_0 <= IntegerLiteral)||LA27_0==53||LA27_0==57||(LA27_0 >= 61 && LA27_0 <= 62)||(LA27_0 >= 65 && LA27_0 <= 66)||LA27_0==74||(LA27_0 >= 107 && LA27_0 <= 108)||(LA27_0 >= 110 && LA27_0 <= 111)||LA27_0==117||LA27_0==122||LA27_0==129) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// interpreter/HLL1.g:152:6: statement_list
					{
					pushFollow(FOLLOW_statement_list_in_block1011);
					statement_list92=statement_list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statement_list.add(statement_list92.getTree());
					}
					break;

			}

			char_literal93=(Token)match(input,130,FOLLOW_130_in_block1014); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_130.add(char_literal93);

			// AST REWRITE
			// elements: statement_list
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 153:3: -> ^( BLOCK ( statement_list )? )
			{
				// interpreter/HLL1.g:153:6: ^( BLOCK ( statement_list )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);
				// interpreter/HLL1.g:153:14: ( statement_list )?
				if ( stream_statement_list.hasNext() ) {
					adaptor.addChild(root_1, stream_statement_list.nextTree());
				}
				stream_statement_list.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 20, block_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "block"


	public static class statement_list_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "statement_list"
	// interpreter/HLL1.g:155:1: statement_list : ( statement )+ ;
	public final HLL1Parser.statement_list_return statement_list() throws RecognitionException {
		HLL1Parser.statement_list_return retval = new HLL1Parser.statement_list_return();
		retval.start = input.LT(1);
		int statement_list_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope statement94 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

			// interpreter/HLL1.g:155:15: ( ( statement )+ )
			// interpreter/HLL1.g:156:5: ( statement )+
			{
			root_0 = (CommonTree)adaptor.nil();


			// interpreter/HLL1.g:156:5: ( statement )+
			int cnt28=0;
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==BooleanLiteral||(LA28_0 >= Identifier && LA28_0 <= IntegerLiteral)||LA28_0==53||LA28_0==57||(LA28_0 >= 61 && LA28_0 <= 62)||(LA28_0 >= 65 && LA28_0 <= 66)||LA28_0==74||(LA28_0 >= 107 && LA28_0 <= 108)||(LA28_0 >= 110 && LA28_0 <= 111)||LA28_0==117||LA28_0==122||LA28_0==129) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// interpreter/HLL1.g:156:5: statement
					{
					pushFollow(FOLLOW_statement_in_statement_list1042);
					statement94=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement94.getTree());

					}
					break;

				default :
					if ( cnt28 >= 1 ) break loop28;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(28, input);
					throw eee;
				}
				cnt28++;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 21, statement_list_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "statement_list"


	public static class if_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "if_statement"
	// interpreter/HLL1.g:158:1: if_statement : 'if' expression 'then' statement ( else_statement )? -> ^( IF expression statement ( else_statement )? ) ;
	public final HLL1Parser.if_statement_return if_statement() throws RecognitionException {
		HLL1Parser.if_statement_return retval = new HLL1Parser.if_statement_return();
		retval.start = input.LT(1);
		int if_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal95=null;
		Token string_literal97=null;
		ParserRuleReturnScope expression96 =null;
		ParserRuleReturnScope statement98 =null;
		ParserRuleReturnScope else_statement99 =null;

		CommonTree string_literal95_tree=null;
		CommonTree string_literal97_tree=null;
		RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
		RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
		RewriteRuleSubtreeStream stream_else_statement=new RewriteRuleSubtreeStream(adaptor,"rule else_statement");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

			// interpreter/HLL1.g:158:13: ( 'if' expression 'then' statement ( else_statement )? -> ^( IF expression statement ( else_statement )? ) )
			// interpreter/HLL1.g:159:5: 'if' expression 'then' statement ( else_statement )?
			{
			string_literal95=(Token)match(input,111,FOLLOW_111_in_if_statement1059); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_111.add(string_literal95);

			pushFollow(FOLLOW_expression_in_if_statement1061);
			expression96=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression96.getTree());
			string_literal97=(Token)match(input,126,FOLLOW_126_in_if_statement1063); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_126.add(string_literal97);

			pushFollow(FOLLOW_statement_in_if_statement1065);
			statement98=statement();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_statement.add(statement98.getTree());
			// interpreter/HLL1.g:159:38: ( else_statement )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==104) ) {
				int LA29_1 = input.LA(2);
				if ( (synpred48_HLL1()) ) {
					alt29=1;
				}
			}
			switch (alt29) {
				case 1 :
					// interpreter/HLL1.g:159:38: else_statement
					{
					pushFollow(FOLLOW_else_statement_in_if_statement1067);
					else_statement99=else_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_else_statement.add(else_statement99.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: else_statement, expression, statement
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 160:5: -> ^( IF expression statement ( else_statement )? )
			{
				// interpreter/HLL1.g:160:8: ^( IF expression statement ( else_statement )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF, "IF"), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_statement.nextTree());
				// interpreter/HLL1.g:160:34: ( else_statement )?
				if ( stream_else_statement.hasNext() ) {
					adaptor.addChild(root_1, stream_else_statement.nextTree());
				}
				stream_else_statement.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 22, if_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "if_statement"


	public static class else_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "else_statement"
	// interpreter/HLL1.g:162:1: else_statement : 'else' statement -> ^( ELSE statement ) ;
	public final HLL1Parser.else_statement_return else_statement() throws RecognitionException {
		HLL1Parser.else_statement_return retval = new HLL1Parser.else_statement_return();
		retval.start = input.LT(1);
		int else_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal100=null;
		ParserRuleReturnScope statement101 =null;

		CommonTree string_literal100_tree=null;
		RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

			// interpreter/HLL1.g:162:15: ( 'else' statement -> ^( ELSE statement ) )
			// interpreter/HLL1.g:163:5: 'else' statement
			{
			string_literal100=(Token)match(input,104,FOLLOW_104_in_else_statement1102); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_104.add(string_literal100);

			pushFollow(FOLLOW_statement_in_else_statement1104);
			statement101=statement();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_statement.add(statement101.getTree());
			// AST REWRITE
			// elements: statement
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 164:2: -> ^( ELSE statement )
			{
				// interpreter/HLL1.g:164:5: ^( ELSE statement )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ELSE, "ELSE"), root_1);
				adaptor.addChild(root_1, stream_statement.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 23, else_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "else_statement"


	public static class for_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "for_statement"
	// interpreter/HLL1.g:166:1: for_statement : ( 'for' '(' forControl ')' statement -> ^( FOR forControl statement ) | 'foreach' foreachControl statement -> ^( FOREACH foreachControl statement ) );
	public final HLL1Parser.for_statement_return for_statement() throws RecognitionException {
		HLL1Parser.for_statement_return retval = new HLL1Parser.for_statement_return();
		retval.start = input.LT(1);
		int for_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal102=null;
		Token char_literal103=null;
		Token char_literal105=null;
		Token string_literal107=null;
		ParserRuleReturnScope forControl104 =null;
		ParserRuleReturnScope statement106 =null;
		ParserRuleReturnScope foreachControl108 =null;
		ParserRuleReturnScope statement109 =null;

		CommonTree string_literal102_tree=null;
		CommonTree char_literal103_tree=null;
		CommonTree char_literal105_tree=null;
		CommonTree string_literal107_tree=null;
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
		RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
		RewriteRuleSubtreeStream stream_foreachControl=new RewriteRuleSubtreeStream(adaptor,"rule foreachControl");
		RewriteRuleSubtreeStream stream_forControl=new RewriteRuleSubtreeStream(adaptor,"rule forControl");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

			// interpreter/HLL1.g:167:2: ( 'for' '(' forControl ')' statement -> ^( FOR forControl statement ) | 'foreach' foreachControl statement -> ^( FOREACH foreachControl statement ) )
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==107) ) {
				alt30=1;
			}
			else if ( (LA30_0==108) ) {
				alt30=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}

			switch (alt30) {
				case 1 :
					// interpreter/HLL1.g:167:6: 'for' '(' forControl ')' statement
					{
					string_literal102=(Token)match(input,107,FOLLOW_107_in_for_statement1129); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_107.add(string_literal102);

					char_literal103=(Token)match(input,57,FOLLOW_57_in_for_statement1131); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_57.add(char_literal103);

					pushFollow(FOLLOW_forControl_in_for_statement1133);
					forControl104=forControl();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_forControl.add(forControl104.getTree());
					char_literal105=(Token)match(input,58,FOLLOW_58_in_for_statement1135); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_58.add(char_literal105);

					pushFollow(FOLLOW_statement_in_for_statement1137);
					statement106=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statement.add(statement106.getTree());
					// AST REWRITE
					// elements: forControl, statement
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 167:41: -> ^( FOR forControl statement )
					{
						// interpreter/HLL1.g:167:44: ^( FOR forControl statement )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FOR, "FOR"), root_1);
						adaptor.addChild(root_1, stream_forControl.nextTree());
						adaptor.addChild(root_1, stream_statement.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// interpreter/HLL1.g:168:4: 'foreach' foreachControl statement
					{
					string_literal107=(Token)match(input,108,FOLLOW_108_in_for_statement1152); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_108.add(string_literal107);

					pushFollow(FOLLOW_foreachControl_in_for_statement1154);
					foreachControl108=foreachControl();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_foreachControl.add(foreachControl108.getTree());
					pushFollow(FOLLOW_statement_in_for_statement1156);
					statement109=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statement.add(statement109.getTree());
					// AST REWRITE
					// elements: foreachControl, statement
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 168:39: -> ^( FOREACH foreachControl statement )
					{
						// interpreter/HLL1.g:168:42: ^( FOREACH foreachControl statement )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FOREACH, "FOREACH"), root_1);
						adaptor.addChild(root_1, stream_foreachControl.nextTree());
						adaptor.addChild(root_1, stream_statement.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 24, for_statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "for_statement"


	public static class forControl_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "forControl"
	// interpreter/HLL1.g:171:1: forControl : ( forInit '..' expression | forInit '...' expression ) -> ^( FOR_CONTROL forInit expression ) ;
	public final HLL1Parser.forControl_return forControl() throws RecognitionException {
		HLL1Parser.forControl_return retval = new HLL1Parser.forControl_return();
		retval.start = input.LT(1);
		int forControl_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal111=null;
		Token string_literal114=null;
		ParserRuleReturnScope forInit110 =null;
		ParserRuleReturnScope expression112 =null;
		ParserRuleReturnScope forInit113 =null;
		ParserRuleReturnScope expression115 =null;

		CommonTree string_literal111_tree=null;
		CommonTree string_literal114_tree=null;
		RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
		RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_forInit=new RewriteRuleSubtreeStream(adaptor,"rule forInit");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

			// interpreter/HLL1.g:172:2: ( ( forInit '..' expression | forInit '...' expression ) -> ^( FOR_CONTROL forInit expression ) )
			// interpreter/HLL1.g:173:3: ( forInit '..' expression | forInit '...' expression )
			{
			// interpreter/HLL1.g:173:3: ( forInit '..' expression | forInit '...' expression )
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==Identifier) ) {
				int LA31_1 = input.LA(2);
				if ( (synpred50_HLL1()) ) {
					alt31=1;
				}
				else if ( (true) ) {
					alt31=2;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}

			switch (alt31) {
				case 1 :
					// interpreter/HLL1.g:173:5: forInit '..' expression
					{
					pushFollow(FOLLOW_forInit_in_forControl1186);
					forInit110=forInit();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_forInit.add(forInit110.getTree());
					string_literal111=(Token)match(input,69,FOLLOW_69_in_forControl1188); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_69.add(string_literal111);

					pushFollow(FOLLOW_expression_in_forControl1190);
					expression112=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression112.getTree());
					}
					break;
				case 2 :
					// interpreter/HLL1.g:174:5: forInit '...' expression
					{
					pushFollow(FOLLOW_forInit_in_forControl1196);
					forInit113=forInit();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_forInit.add(forInit113.getTree());
					string_literal114=(Token)match(input,70,FOLLOW_70_in_forControl1198); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_70.add(string_literal114);

					pushFollow(FOLLOW_expression_in_forControl1200);
					expression115=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression115.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: expression, forInit
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 175:5: -> ^( FOR_CONTROL forInit expression )
			{
				// interpreter/HLL1.g:175:8: ^( FOR_CONTROL forInit expression )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FOR_CONTROL, "FOR_CONTROL"), root_1);
				adaptor.addChild(root_1, stream_forInit.nextTree());
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 25, forControl_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "forControl"


	public static class forInit_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "forInit"
	// interpreter/HLL1.g:177:1: forInit : Identifier ( '=' ^ expression )? ;
	public final HLL1Parser.forInit_return forInit() throws RecognitionException {
		HLL1Parser.forInit_return retval = new HLL1Parser.forInit_return();
		retval.start = input.LT(1);
		int forInit_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier116=null;
		Token char_literal117=null;
		ParserRuleReturnScope expression118 =null;

		CommonTree Identifier116_tree=null;
		CommonTree char_literal117_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }

			// interpreter/HLL1.g:177:8: ( Identifier ( '=' ^ expression )? )
			// interpreter/HLL1.g:178:2: Identifier ( '=' ^ expression )?
			{
			root_0 = (CommonTree)adaptor.nil();


			Identifier116=(Token)match(input,Identifier,FOLLOW_Identifier_in_forInit1223); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier116_tree = (CommonTree)adaptor.create(Identifier116);
			adaptor.addChild(root_0, Identifier116_tree);
			}

			// interpreter/HLL1.g:178:13: ( '=' ^ expression )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==77) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// interpreter/HLL1.g:178:14: '=' ^ expression
					{
					char_literal117=(Token)match(input,77,FOLLOW_77_in_forInit1226); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal117_tree = (CommonTree)adaptor.create(char_literal117);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal117_tree, root_0);
					}

					pushFollow(FOLLOW_expression_in_forInit1229);
					expression118=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression118.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 26, forInit_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "forInit"


	public static class local_variable_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "local_variable"
	// interpreter/HLL1.g:180:1: local_variable : 'let' tuple_signatur_list '=' access_set_invocation -> ^( LOCAL_VARIABLE tuple_signatur_list access_set_invocation ) ;
	public final HLL1Parser.local_variable_return local_variable() throws RecognitionException {
		HLL1Parser.local_variable_return retval = new HLL1Parser.local_variable_return();
		retval.start = input.LT(1);
		int local_variable_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal119=null;
		Token char_literal121=null;
		ParserRuleReturnScope tuple_signatur_list120 =null;
		ParserRuleReturnScope access_set_invocation122 =null;

		CommonTree string_literal119_tree=null;
		CommonTree char_literal121_tree=null;
		RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleSubtreeStream stream_access_set_invocation=new RewriteRuleSubtreeStream(adaptor,"rule access_set_invocation");
		RewriteRuleSubtreeStream stream_tuple_signatur_list=new RewriteRuleSubtreeStream(adaptor,"rule tuple_signatur_list");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }

			// interpreter/HLL1.g:180:15: ( 'let' tuple_signatur_list '=' access_set_invocation -> ^( LOCAL_VARIABLE tuple_signatur_list access_set_invocation ) )
			// interpreter/HLL1.g:181:2: 'let' tuple_signatur_list '=' access_set_invocation
			{
			string_literal119=(Token)match(input,117,FOLLOW_117_in_local_variable1241); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_117.add(string_literal119);

			pushFollow(FOLLOW_tuple_signatur_list_in_local_variable1243);
			tuple_signatur_list120=tuple_signatur_list();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_tuple_signatur_list.add(tuple_signatur_list120.getTree());
			char_literal121=(Token)match(input,77,FOLLOW_77_in_local_variable1245); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_77.add(char_literal121);

			pushFollow(FOLLOW_access_set_invocation_in_local_variable1247);
			access_set_invocation122=access_set_invocation();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_access_set_invocation.add(access_set_invocation122.getTree());
			// AST REWRITE
			// elements: tuple_signatur_list, access_set_invocation
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 181:54: -> ^( LOCAL_VARIABLE tuple_signatur_list access_set_invocation )
			{
				// interpreter/HLL1.g:181:57: ^( LOCAL_VARIABLE tuple_signatur_list access_set_invocation )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LOCAL_VARIABLE, "LOCAL_VARIABLE"), root_1);
				adaptor.addChild(root_1, stream_tuple_signatur_list.nextTree());
				adaptor.addChild(root_1, stream_access_set_invocation.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 27, local_variable_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "local_variable"


	public static class foreachControl_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "foreachControl"
	// interpreter/HLL1.g:183:1: foreachControl : anonymous_function_signature 'in' set_invocation -> ^( FOREACH_CONTROL anonymous_function_signature set_invocation ) ;
	public final HLL1Parser.foreachControl_return foreachControl() throws RecognitionException {
		HLL1Parser.foreachControl_return retval = new HLL1Parser.foreachControl_return();
		retval.start = input.LT(1);
		int foreachControl_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal124=null;
		ParserRuleReturnScope anonymous_function_signature123 =null;
		ParserRuleReturnScope set_invocation125 =null;

		CommonTree string_literal124_tree=null;
		RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
		RewriteRuleSubtreeStream stream_set_invocation=new RewriteRuleSubtreeStream(adaptor,"rule set_invocation");
		RewriteRuleSubtreeStream stream_anonymous_function_signature=new RewriteRuleSubtreeStream(adaptor,"rule anonymous_function_signature");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

			// interpreter/HLL1.g:183:15: ( anonymous_function_signature 'in' set_invocation -> ^( FOREACH_CONTROL anonymous_function_signature set_invocation ) )
			// interpreter/HLL1.g:184:2: anonymous_function_signature 'in' set_invocation
			{
			pushFollow(FOLLOW_anonymous_function_signature_in_foreachControl1266);
			anonymous_function_signature123=anonymous_function_signature();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_anonymous_function_signature.add(anonymous_function_signature123.getTree());
			string_literal124=(Token)match(input,112,FOLLOW_112_in_foreachControl1268); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_112.add(string_literal124);

			pushFollow(FOLLOW_set_invocation_in_foreachControl1270);
			set_invocation125=set_invocation();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_set_invocation.add(set_invocation125.getTree());
			// AST REWRITE
			// elements: anonymous_function_signature, set_invocation
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 184:51: -> ^( FOREACH_CONTROL anonymous_function_signature set_invocation )
			{
				// interpreter/HLL1.g:184:54: ^( FOREACH_CONTROL anonymous_function_signature set_invocation )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FOREACH_CONTROL, "FOREACH_CONTROL"), root_1);
				adaptor.addChild(root_1, stream_anonymous_function_signature.nextTree());
				adaptor.addChild(root_1, stream_set_invocation.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 28, foreachControl_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "foreachControl"


	public static class set_invocation_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "set_invocation"
	// interpreter/HLL1.g:188:1: set_invocation : ( Identifier -> ^( SET_INVOCATION Identifier ) | filter_set_invocation -> ^( SET_INVOCATION filter_set_invocation ) );
	public final HLL1Parser.set_invocation_return set_invocation() throws RecognitionException {
		HLL1Parser.set_invocation_return retval = new HLL1Parser.set_invocation_return();
		retval.start = input.LT(1);
		int set_invocation_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier126=null;
		ParserRuleReturnScope filter_set_invocation127 =null;

		CommonTree Identifier126_tree=null;
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_filter_set_invocation=new RewriteRuleSubtreeStream(adaptor,"rule filter_set_invocation");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

			// interpreter/HLL1.g:189:2: ( Identifier -> ^( SET_INVOCATION Identifier ) | filter_set_invocation -> ^( SET_INVOCATION filter_set_invocation ) )
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==Identifier) ) {
				int LA33_1 = input.LA(2);
				if ( (LA33_1==68) ) {
					alt33=2;
				}
				else if ( (LA33_1==BooleanLiteral||(LA33_1 >= Identifier && LA33_1 <= IntegerLiteral)||LA33_1==53||LA33_1==57||(LA33_1 >= 61 && LA33_1 <= 62)||(LA33_1 >= 65 && LA33_1 <= 66)||LA33_1==74||(LA33_1 >= 107 && LA33_1 <= 108)||(LA33_1 >= 110 && LA33_1 <= 111)||LA33_1==117||LA33_1==122||LA33_1==129) ) {
					alt33=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 33, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}

			switch (alt33) {
				case 1 :
					// interpreter/HLL1.g:189:4: Identifier
					{
					Identifier126=(Token)match(input,Identifier,FOLLOW_Identifier_in_set_invocation1293); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(Identifier126);

					// AST REWRITE
					// elements: Identifier
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 189:15: -> ^( SET_INVOCATION Identifier )
					{
						// interpreter/HLL1.g:189:18: ^( SET_INVOCATION Identifier )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET_INVOCATION, "SET_INVOCATION"), root_1);
						adaptor.addChild(root_1, stream_Identifier.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// interpreter/HLL1.g:190:4: filter_set_invocation
					{
					pushFollow(FOLLOW_filter_set_invocation_in_set_invocation1306);
					filter_set_invocation127=filter_set_invocation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_filter_set_invocation.add(filter_set_invocation127.getTree());
					// AST REWRITE
					// elements: filter_set_invocation
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 190:26: -> ^( SET_INVOCATION filter_set_invocation )
					{
						// interpreter/HLL1.g:190:29: ^( SET_INVOCATION filter_set_invocation )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SET_INVOCATION, "SET_INVOCATION"), root_1);
						adaptor.addChild(root_1, stream_filter_set_invocation.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 29, set_invocation_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "set_invocation"


	public static class expression_set_invocation_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expression_set_invocation"
	// interpreter/HLL1.g:192:1: expression_set_invocation : ( Identifier '.' ! expression_invocation | filter_expression_invocation );
	public final HLL1Parser.expression_set_invocation_return expression_set_invocation() throws RecognitionException {
		HLL1Parser.expression_set_invocation_return retval = new HLL1Parser.expression_set_invocation_return();
		retval.start = input.LT(1);
		int expression_set_invocation_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier128=null;
		Token char_literal129=null;
		ParserRuleReturnScope expression_invocation130 =null;
		ParserRuleReturnScope filter_expression_invocation131 =null;

		CommonTree Identifier128_tree=null;
		CommonTree char_literal129_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

			// interpreter/HLL1.g:193:2: ( Identifier '.' ! expression_invocation | filter_expression_invocation )
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==Identifier) ) {
				int LA34_1 = input.LA(2);
				if ( (LA34_1==68) ) {
					int LA34_2 = input.LA(3);
					if ( (LA34_2==102||LA34_2==123) ) {
						alt34=1;
					}
					else if ( (LA34_2==106) ) {
						alt34=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 34, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 34, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}

			switch (alt34) {
				case 1 :
					// interpreter/HLL1.g:193:4: Identifier '.' ! expression_invocation
					{
					root_0 = (CommonTree)adaptor.nil();


					Identifier128=(Token)match(input,Identifier,FOLLOW_Identifier_in_expression_set_invocation1324); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier128_tree = (CommonTree)adaptor.create(Identifier128);
					adaptor.addChild(root_0, Identifier128_tree);
					}

					char_literal129=(Token)match(input,68,FOLLOW_68_in_expression_set_invocation1326); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_invocation_in_expression_set_invocation1329);
					expression_invocation130=expression_invocation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_invocation130.getTree());

					}
					break;
				case 2 :
					// interpreter/HLL1.g:194:4: filter_expression_invocation
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_filter_expression_invocation_in_expression_set_invocation1334);
					filter_expression_invocation131=filter_expression_invocation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, filter_expression_invocation131.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 30, expression_set_invocation_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "expression_set_invocation"


	public static class expression_invocation_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expression_invocation"
	// interpreter/HLL1.g:196:1: expression_invocation : ( 'contains' '(' setArgument ')' -> ^( CONTAINS_INVOCATION setArgument ) | 'size' -> ^( SIZE_INVOCATION ) );
	public final HLL1Parser.expression_invocation_return expression_invocation() throws RecognitionException {
		HLL1Parser.expression_invocation_return retval = new HLL1Parser.expression_invocation_return();
		retval.start = input.LT(1);
		int expression_invocation_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal132=null;
		Token char_literal133=null;
		Token char_literal135=null;
		Token string_literal136=null;
		ParserRuleReturnScope setArgument134 =null;

		CommonTree string_literal132_tree=null;
		CommonTree char_literal133_tree=null;
		CommonTree char_literal135_tree=null;
		CommonTree string_literal136_tree=null;
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
		RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
		RewriteRuleSubtreeStream stream_setArgument=new RewriteRuleSubtreeStream(adaptor,"rule setArgument");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

			// interpreter/HLL1.g:197:2: ( 'contains' '(' setArgument ')' -> ^( CONTAINS_INVOCATION setArgument ) | 'size' -> ^( SIZE_INVOCATION ) )
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==102) ) {
				alt35=1;
			}
			else if ( (LA35_0==123) ) {
				alt35=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}

			switch (alt35) {
				case 1 :
					// interpreter/HLL1.g:197:4: 'contains' '(' setArgument ')'
					{
					string_literal132=(Token)match(input,102,FOLLOW_102_in_expression_invocation1345); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_102.add(string_literal132);

					char_literal133=(Token)match(input,57,FOLLOW_57_in_expression_invocation1347); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_57.add(char_literal133);

					pushFollow(FOLLOW_setArgument_in_expression_invocation1349);
					setArgument134=setArgument();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_setArgument.add(setArgument134.getTree());
					char_literal135=(Token)match(input,58,FOLLOW_58_in_expression_invocation1351); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_58.add(char_literal135);

					// AST REWRITE
					// elements: setArgument
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 197:35: -> ^( CONTAINS_INVOCATION setArgument )
					{
						// interpreter/HLL1.g:197:38: ^( CONTAINS_INVOCATION setArgument )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONTAINS_INVOCATION, "CONTAINS_INVOCATION"), root_1);
						adaptor.addChild(root_1, stream_setArgument.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// interpreter/HLL1.g:198:4: 'size'
					{
					string_literal136=(Token)match(input,123,FOLLOW_123_in_expression_invocation1364); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_123.add(string_literal136);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 198:11: -> ^( SIZE_INVOCATION )
					{
						// interpreter/HLL1.g:198:14: ^( SIZE_INVOCATION )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SIZE_INVOCATION, "SIZE_INVOCATION"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 31, expression_invocation_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "expression_invocation"


	public static class operational_set_invocation_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "operational_set_invocation"
	// interpreter/HLL1.g:200:1: operational_set_invocation : Identifier '.' ! operational_invocation ;
	public final HLL1Parser.operational_set_invocation_return operational_set_invocation() throws RecognitionException {
		HLL1Parser.operational_set_invocation_return retval = new HLL1Parser.operational_set_invocation_return();
		retval.start = input.LT(1);
		int operational_set_invocation_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier137=null;
		Token char_literal138=null;
		ParserRuleReturnScope operational_invocation139 =null;

		CommonTree Identifier137_tree=null;
		CommonTree char_literal138_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

			// interpreter/HLL1.g:201:2: ( Identifier '.' ! operational_invocation )
			// interpreter/HLL1.g:201:4: Identifier '.' ! operational_invocation
			{
			root_0 = (CommonTree)adaptor.nil();


			Identifier137=(Token)match(input,Identifier,FOLLOW_Identifier_in_operational_set_invocation1380); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier137_tree = (CommonTree)adaptor.create(Identifier137);
			adaptor.addChild(root_0, Identifier137_tree);
			}

			char_literal138=(Token)match(input,68,FOLLOW_68_in_operational_set_invocation1382); if (state.failed) return retval;
			pushFollow(FOLLOW_operational_invocation_in_operational_set_invocation1385);
			operational_invocation139=operational_invocation();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, operational_invocation139.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 32, operational_set_invocation_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "operational_set_invocation"


	public static class operational_invocation_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "operational_invocation"
	// interpreter/HLL1.g:203:1: operational_invocation : ( 'insert' '(' setArgument ')' -> ^( INSERT_INVOCATION setArgument ) | 'remove' '(' setArgument ')' -> ^( REMOVE_INVOCATION setArgument ) );
	public final HLL1Parser.operational_invocation_return operational_invocation() throws RecognitionException {
		HLL1Parser.operational_invocation_return retval = new HLL1Parser.operational_invocation_return();
		retval.start = input.LT(1);
		int operational_invocation_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal140=null;
		Token char_literal141=null;
		Token char_literal143=null;
		Token string_literal144=null;
		Token char_literal145=null;
		Token char_literal147=null;
		ParserRuleReturnScope setArgument142 =null;
		ParserRuleReturnScope setArgument146 =null;

		CommonTree string_literal140_tree=null;
		CommonTree char_literal141_tree=null;
		CommonTree char_literal143_tree=null;
		CommonTree string_literal144_tree=null;
		CommonTree char_literal145_tree=null;
		CommonTree char_literal147_tree=null;
		RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
		RewriteRuleTokenStream stream_121=new RewriteRuleTokenStream(adaptor,"token 121");
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleSubtreeStream stream_setArgument=new RewriteRuleSubtreeStream(adaptor,"rule setArgument");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

			// interpreter/HLL1.g:204:2: ( 'insert' '(' setArgument ')' -> ^( INSERT_INVOCATION setArgument ) | 'remove' '(' setArgument ')' -> ^( REMOVE_INVOCATION setArgument ) )
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==116) ) {
				alt36=1;
			}
			else if ( (LA36_0==121) ) {
				alt36=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 36, 0, input);
				throw nvae;
			}

			switch (alt36) {
				case 1 :
					// interpreter/HLL1.g:204:4: 'insert' '(' setArgument ')'
					{
					string_literal140=(Token)match(input,116,FOLLOW_116_in_operational_invocation1396); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_116.add(string_literal140);

					char_literal141=(Token)match(input,57,FOLLOW_57_in_operational_invocation1398); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_57.add(char_literal141);

					pushFollow(FOLLOW_setArgument_in_operational_invocation1400);
					setArgument142=setArgument();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_setArgument.add(setArgument142.getTree());
					char_literal143=(Token)match(input,58,FOLLOW_58_in_operational_invocation1402); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_58.add(char_literal143);

					// AST REWRITE
					// elements: setArgument
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 204:33: -> ^( INSERT_INVOCATION setArgument )
					{
						// interpreter/HLL1.g:204:36: ^( INSERT_INVOCATION setArgument )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INSERT_INVOCATION, "INSERT_INVOCATION"), root_1);
						adaptor.addChild(root_1, stream_setArgument.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// interpreter/HLL1.g:205:4: 'remove' '(' setArgument ')'
					{
					string_literal144=(Token)match(input,121,FOLLOW_121_in_operational_invocation1415); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_121.add(string_literal144);

					char_literal145=(Token)match(input,57,FOLLOW_57_in_operational_invocation1417); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_57.add(char_literal145);

					pushFollow(FOLLOW_setArgument_in_operational_invocation1419);
					setArgument146=setArgument();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_setArgument.add(setArgument146.getTree());
					char_literal147=(Token)match(input,58,FOLLOW_58_in_operational_invocation1421); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_58.add(char_literal147);

					// AST REWRITE
					// elements: setArgument
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 205:33: -> ^( REMOVE_INVOCATION setArgument )
					{
						// interpreter/HLL1.g:205:36: ^( REMOVE_INVOCATION setArgument )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(REMOVE_INVOCATION, "REMOVE_INVOCATION"), root_1);
						adaptor.addChild(root_1, stream_setArgument.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 33, operational_invocation_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "operational_invocation"


	public static class access_set_invocation_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "access_set_invocation"
	// interpreter/HLL1.g:207:1: access_set_invocation : Identifier '.' ! access_invocation ;
	public final HLL1Parser.access_set_invocation_return access_set_invocation() throws RecognitionException {
		HLL1Parser.access_set_invocation_return retval = new HLL1Parser.access_set_invocation_return();
		retval.start = input.LT(1);
		int access_set_invocation_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier148=null;
		Token char_literal149=null;
		ParserRuleReturnScope access_invocation150 =null;

		CommonTree Identifier148_tree=null;
		CommonTree char_literal149_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

			// interpreter/HLL1.g:207:22: ( Identifier '.' ! access_invocation )
			// interpreter/HLL1.g:208:2: Identifier '.' ! access_invocation
			{
			root_0 = (CommonTree)adaptor.nil();


			Identifier148=(Token)match(input,Identifier,FOLLOW_Identifier_in_access_set_invocation1438); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier148_tree = (CommonTree)adaptor.create(Identifier148);
			adaptor.addChild(root_0, Identifier148_tree);
			}

			char_literal149=(Token)match(input,68,FOLLOW_68_in_access_set_invocation1440); if (state.failed) return retval;
			pushFollow(FOLLOW_access_invocation_in_access_set_invocation1443);
			access_invocation150=access_invocation();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, access_invocation150.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 34, access_set_invocation_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "access_set_invocation"


	public static class access_invocation_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "access_invocation"
	// interpreter/HLL1.g:210:1: access_invocation : ( 'some' '(' ')' -> ACCESS_INVOCATION | 'some' '(' lambda_expression ')' -> ^( ACCESS_INVOCATION lambda_expression ) );
	public final HLL1Parser.access_invocation_return access_invocation() throws RecognitionException {
		HLL1Parser.access_invocation_return retval = new HLL1Parser.access_invocation_return();
		retval.start = input.LT(1);
		int access_invocation_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal151=null;
		Token char_literal152=null;
		Token char_literal153=null;
		Token string_literal154=null;
		Token char_literal155=null;
		Token char_literal157=null;
		ParserRuleReturnScope lambda_expression156 =null;

		CommonTree string_literal151_tree=null;
		CommonTree char_literal152_tree=null;
		CommonTree char_literal153_tree=null;
		CommonTree string_literal154_tree=null;
		CommonTree char_literal155_tree=null;
		CommonTree char_literal157_tree=null;
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
		RewriteRuleSubtreeStream stream_lambda_expression=new RewriteRuleSubtreeStream(adaptor,"rule lambda_expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

			// interpreter/HLL1.g:211:2: ( 'some' '(' ')' -> ACCESS_INVOCATION | 'some' '(' lambda_expression ')' -> ^( ACCESS_INVOCATION lambda_expression ) )
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==124) ) {
				int LA37_1 = input.LA(2);
				if ( (LA37_1==57) ) {
					int LA37_2 = input.LA(3);
					if ( (LA37_2==58) ) {
						alt37=1;
					}
					else if ( (LA37_2==Identifier||LA37_2==75) ) {
						alt37=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 37, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 37, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				throw nvae;
			}

			switch (alt37) {
				case 1 :
					// interpreter/HLL1.g:211:4: 'some' '(' ')'
					{
					string_literal151=(Token)match(input,124,FOLLOW_124_in_access_invocation1454); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_124.add(string_literal151);

					char_literal152=(Token)match(input,57,FOLLOW_57_in_access_invocation1456); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_57.add(char_literal152);

					char_literal153=(Token)match(input,58,FOLLOW_58_in_access_invocation1458); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_58.add(char_literal153);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 211:19: -> ACCESS_INVOCATION
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(ACCESS_INVOCATION, "ACCESS_INVOCATION"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// interpreter/HLL1.g:212:4: 'some' '(' lambda_expression ')'
					{
					string_literal154=(Token)match(input,124,FOLLOW_124_in_access_invocation1467); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_124.add(string_literal154);

					char_literal155=(Token)match(input,57,FOLLOW_57_in_access_invocation1469); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_57.add(char_literal155);

					pushFollow(FOLLOW_lambda_expression_in_access_invocation1471);
					lambda_expression156=lambda_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_lambda_expression.add(lambda_expression156.getTree());
					char_literal157=(Token)match(input,58,FOLLOW_58_in_access_invocation1473); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_58.add(char_literal157);

					// AST REWRITE
					// elements: lambda_expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 212:37: -> ^( ACCESS_INVOCATION lambda_expression )
					{
						// interpreter/HLL1.g:212:40: ^( ACCESS_INVOCATION lambda_expression )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ACCESS_INVOCATION, "ACCESS_INVOCATION"), root_1);
						adaptor.addChild(root_1, stream_lambda_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 35, access_invocation_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "access_invocation"


	public static class filter_set_invocation_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "filter_set_invocation"
	// interpreter/HLL1.g:214:1: filter_set_invocation : Identifier '.' ! filter_invocation ;
	public final HLL1Parser.filter_set_invocation_return filter_set_invocation() throws RecognitionException {
		HLL1Parser.filter_set_invocation_return retval = new HLL1Parser.filter_set_invocation_return();
		retval.start = input.LT(1);
		int filter_set_invocation_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier158=null;
		Token char_literal159=null;
		ParserRuleReturnScope filter_invocation160 =null;

		CommonTree Identifier158_tree=null;
		CommonTree char_literal159_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

			// interpreter/HLL1.g:214:22: ( Identifier '.' ! filter_invocation )
			// interpreter/HLL1.g:215:2: Identifier '.' ! filter_invocation
			{
			root_0 = (CommonTree)adaptor.nil();


			Identifier158=(Token)match(input,Identifier,FOLLOW_Identifier_in_filter_set_invocation1491); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier158_tree = (CommonTree)adaptor.create(Identifier158);
			adaptor.addChild(root_0, Identifier158_tree);
			}

			char_literal159=(Token)match(input,68,FOLLOW_68_in_filter_set_invocation1493); if (state.failed) return retval;
			pushFollow(FOLLOW_filter_invocation_in_filter_set_invocation1496);
			filter_invocation160=filter_invocation();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, filter_invocation160.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 36, filter_set_invocation_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "filter_set_invocation"


	public static class filter_expression_invocation_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "filter_expression_invocation"
	// interpreter/HLL1.g:217:1: filter_expression_invocation : filter_set_invocation '.' ! expression_invocation ;
	public final HLL1Parser.filter_expression_invocation_return filter_expression_invocation() throws RecognitionException {
		HLL1Parser.filter_expression_invocation_return retval = new HLL1Parser.filter_expression_invocation_return();
		retval.start = input.LT(1);
		int filter_expression_invocation_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal162=null;
		ParserRuleReturnScope filter_set_invocation161 =null;
		ParserRuleReturnScope expression_invocation163 =null;

		CommonTree char_literal162_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

			// interpreter/HLL1.g:217:29: ( filter_set_invocation '.' ! expression_invocation )
			// interpreter/HLL1.g:218:2: filter_set_invocation '.' ! expression_invocation
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_filter_set_invocation_in_filter_expression_invocation1507);
			filter_set_invocation161=filter_set_invocation();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, filter_set_invocation161.getTree());

			char_literal162=(Token)match(input,68,FOLLOW_68_in_filter_expression_invocation1509); if (state.failed) return retval;
			pushFollow(FOLLOW_expression_invocation_in_filter_expression_invocation1512);
			expression_invocation163=expression_invocation();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_invocation163.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 37, filter_expression_invocation_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "filter_expression_invocation"


	public static class filter_invocation_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "filter_invocation"
	// interpreter/HLL1.g:220:1: filter_invocation : 'filter' '(' lambda_expression ')' -> ^( FILTER_INVOCATION lambda_expression ) ;
	public final HLL1Parser.filter_invocation_return filter_invocation() throws RecognitionException {
		HLL1Parser.filter_invocation_return retval = new HLL1Parser.filter_invocation_return();
		retval.start = input.LT(1);
		int filter_invocation_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal164=null;
		Token char_literal165=null;
		Token char_literal167=null;
		ParserRuleReturnScope lambda_expression166 =null;

		CommonTree string_literal164_tree=null;
		CommonTree char_literal165_tree=null;
		CommonTree char_literal167_tree=null;
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
		RewriteRuleSubtreeStream stream_lambda_expression=new RewriteRuleSubtreeStream(adaptor,"rule lambda_expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

			// interpreter/HLL1.g:220:18: ( 'filter' '(' lambda_expression ')' -> ^( FILTER_INVOCATION lambda_expression ) )
			// interpreter/HLL1.g:221:2: 'filter' '(' lambda_expression ')'
			{
			string_literal164=(Token)match(input,106,FOLLOW_106_in_filter_invocation1521); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_106.add(string_literal164);

			char_literal165=(Token)match(input,57,FOLLOW_57_in_filter_invocation1523); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_57.add(char_literal165);

			pushFollow(FOLLOW_lambda_expression_in_filter_invocation1525);
			lambda_expression166=lambda_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_lambda_expression.add(lambda_expression166.getTree());
			char_literal167=(Token)match(input,58,FOLLOW_58_in_filter_invocation1527); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_58.add(char_literal167);

			// AST REWRITE
			// elements: lambda_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 221:37: -> ^( FILTER_INVOCATION lambda_expression )
			{
				// interpreter/HLL1.g:221:40: ^( FILTER_INVOCATION lambda_expression )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FILTER_INVOCATION, "FILTER_INVOCATION"), root_1);
				adaptor.addChild(root_1, stream_lambda_expression.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 38, filter_invocation_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "filter_invocation"


	public static class lambda_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "lambda_expression"
	// interpreter/HLL1.g:223:1: lambda_expression : anonymous_function_signature ':' anonymous_function_body -> ^( LAMBDA_EXPRESSION anonymous_function_signature anonymous_function_body ) ;
	public final HLL1Parser.lambda_expression_return lambda_expression() throws RecognitionException {
		HLL1Parser.lambda_expression_return retval = new HLL1Parser.lambda_expression_return();
		retval.start = input.LT(1);
		int lambda_expression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal169=null;
		ParserRuleReturnScope anonymous_function_signature168 =null;
		ParserRuleReturnScope anonymous_function_body170 =null;

		CommonTree char_literal169_tree=null;
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleSubtreeStream stream_anonymous_function_signature=new RewriteRuleSubtreeStream(adaptor,"rule anonymous_function_signature");
		RewriteRuleSubtreeStream stream_anonymous_function_body=new RewriteRuleSubtreeStream(adaptor,"rule anonymous_function_body");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

			// interpreter/HLL1.g:223:18: ( anonymous_function_signature ':' anonymous_function_body -> ^( LAMBDA_EXPRESSION anonymous_function_signature anonymous_function_body ) )
			// interpreter/HLL1.g:224:2: anonymous_function_signature ':' anonymous_function_body
			{
			pushFollow(FOLLOW_anonymous_function_signature_in_lambda_expression1547);
			anonymous_function_signature168=anonymous_function_signature();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_anonymous_function_signature.add(anonymous_function_signature168.getTree());
			char_literal169=(Token)match(input,73,FOLLOW_73_in_lambda_expression1549); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_73.add(char_literal169);

			pushFollow(FOLLOW_anonymous_function_body_in_lambda_expression1551);
			anonymous_function_body170=anonymous_function_body();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_anonymous_function_body.add(anonymous_function_body170.getTree());
			// AST REWRITE
			// elements: anonymous_function_body, anonymous_function_signature
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 225:2: -> ^( LAMBDA_EXPRESSION anonymous_function_signature anonymous_function_body )
			{
				// interpreter/HLL1.g:225:5: ^( LAMBDA_EXPRESSION anonymous_function_signature anonymous_function_body )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LAMBDA_EXPRESSION, "LAMBDA_EXPRESSION"), root_1);
				adaptor.addChild(root_1, stream_anonymous_function_signature.nextTree());
				adaptor.addChild(root_1, stream_anonymous_function_body.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 39, lambda_expression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "lambda_expression"


	public static class anonymous_function_signature_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "anonymous_function_signature"
	// interpreter/HLL1.g:227:1: anonymous_function_signature : ( Identifier | tuple_signatur );
	public final HLL1Parser.anonymous_function_signature_return anonymous_function_signature() throws RecognitionException {
		HLL1Parser.anonymous_function_signature_return retval = new HLL1Parser.anonymous_function_signature_return();
		retval.start = input.LT(1);
		int anonymous_function_signature_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier171=null;
		ParserRuleReturnScope tuple_signatur172 =null;

		CommonTree Identifier171_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

			// interpreter/HLL1.g:228:2: ( Identifier | tuple_signatur )
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==Identifier) ) {
				alt38=1;
			}
			else if ( (LA38_0==75) ) {
				alt38=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				throw nvae;
			}

			switch (alt38) {
				case 1 :
					// interpreter/HLL1.g:228:4: Identifier
					{
					root_0 = (CommonTree)adaptor.nil();


					Identifier171=(Token)match(input,Identifier,FOLLOW_Identifier_in_anonymous_function_signature1573); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier171_tree = (CommonTree)adaptor.create(Identifier171);
					adaptor.addChild(root_0, Identifier171_tree);
					}

					}
					break;
				case 2 :
					// interpreter/HLL1.g:229:4: tuple_signatur
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_tuple_signatur_in_anonymous_function_signature1578);
					tuple_signatur172=tuple_signatur();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, tuple_signatur172.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 40, anonymous_function_signature_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "anonymous_function_signature"


	public static class receive_anonymous_function_signature_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "receive_anonymous_function_signature"
	// interpreter/HLL1.g:231:1: receive_anonymous_function_signature : ( Identifier | receive_tuple_signatur );
	public final HLL1Parser.receive_anonymous_function_signature_return receive_anonymous_function_signature() throws RecognitionException {
		HLL1Parser.receive_anonymous_function_signature_return retval = new HLL1Parser.receive_anonymous_function_signature_return();
		retval.start = input.LT(1);
		int receive_anonymous_function_signature_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier173=null;
		ParserRuleReturnScope receive_tuple_signatur174 =null;

		CommonTree Identifier173_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

			// interpreter/HLL1.g:232:2: ( Identifier | receive_tuple_signatur )
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==Identifier) ) {
				alt39=1;
			}
			else if ( (LA39_0==75) ) {
				alt39=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 39, 0, input);
				throw nvae;
			}

			switch (alt39) {
				case 1 :
					// interpreter/HLL1.g:232:4: Identifier
					{
					root_0 = (CommonTree)adaptor.nil();


					Identifier173=(Token)match(input,Identifier,FOLLOW_Identifier_in_receive_anonymous_function_signature1589); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier173_tree = (CommonTree)adaptor.create(Identifier173);
					adaptor.addChild(root_0, Identifier173_tree);
					}

					}
					break;
				case 2 :
					// interpreter/HLL1.g:233:4: receive_tuple_signatur
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_receive_tuple_signatur_in_receive_anonymous_function_signature1594);
					receive_tuple_signatur174=receive_tuple_signatur();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, receive_tuple_signatur174.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 41, receive_anonymous_function_signature_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "receive_anonymous_function_signature"


	public static class tuple_signatur_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "tuple_signatur"
	// interpreter/HLL1.g:235:1: tuple_signatur : '<' ! tuple_signatur_list '>' !;
	public final HLL1Parser.tuple_signatur_return tuple_signatur() throws RecognitionException {
		HLL1Parser.tuple_signatur_return retval = new HLL1Parser.tuple_signatur_return();
		retval.start = input.LT(1);
		int tuple_signatur_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal175=null;
		Token char_literal177=null;
		ParserRuleReturnScope tuple_signatur_list176 =null;

		CommonTree char_literal175_tree=null;
		CommonTree char_literal177_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }

			// interpreter/HLL1.g:236:2: ( '<' ! tuple_signatur_list '>' !)
			// interpreter/HLL1.g:236:4: '<' ! tuple_signatur_list '>' !
			{
			root_0 = (CommonTree)adaptor.nil();


			char_literal175=(Token)match(input,75,FOLLOW_75_in_tuple_signatur1605); if (state.failed) return retval;
			pushFollow(FOLLOW_tuple_signatur_list_in_tuple_signatur1608);
			tuple_signatur_list176=tuple_signatur_list();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, tuple_signatur_list176.getTree());

			char_literal177=(Token)match(input,79,FOLLOW_79_in_tuple_signatur1610); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 42, tuple_signatur_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "tuple_signatur"


	public static class receive_tuple_signatur_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "receive_tuple_signatur"
	// interpreter/HLL1.g:238:1: receive_tuple_signatur : '<' ! receive_tuple_signatur_list '>' !;
	public final HLL1Parser.receive_tuple_signatur_return receive_tuple_signatur() throws RecognitionException {
		HLL1Parser.receive_tuple_signatur_return retval = new HLL1Parser.receive_tuple_signatur_return();
		retval.start = input.LT(1);
		int receive_tuple_signatur_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal178=null;
		Token char_literal180=null;
		ParserRuleReturnScope receive_tuple_signatur_list179 =null;

		CommonTree char_literal178_tree=null;
		CommonTree char_literal180_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }

			// interpreter/HLL1.g:239:2: ( '<' ! receive_tuple_signatur_list '>' !)
			// interpreter/HLL1.g:239:4: '<' ! receive_tuple_signatur_list '>' !
			{
			root_0 = (CommonTree)adaptor.nil();


			char_literal178=(Token)match(input,75,FOLLOW_75_in_receive_tuple_signatur1622); if (state.failed) return retval;
			pushFollow(FOLLOW_receive_tuple_signatur_list_in_receive_tuple_signatur1625);
			receive_tuple_signatur_list179=receive_tuple_signatur_list();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, receive_tuple_signatur_list179.getTree());

			char_literal180=(Token)match(input,79,FOLLOW_79_in_receive_tuple_signatur1627); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 43, receive_tuple_signatur_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "receive_tuple_signatur"


	public static class tuple_signatur_list_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "tuple_signatur_list"
	// interpreter/HLL1.g:241:1: tuple_signatur_list : Identifier ( ',' Identifier )* -> ^( SIGNATUR ( Identifier )+ ) ;
	public final HLL1Parser.tuple_signatur_list_return tuple_signatur_list() throws RecognitionException {
		HLL1Parser.tuple_signatur_list_return retval = new HLL1Parser.tuple_signatur_list_return();
		retval.start = input.LT(1);
		int tuple_signatur_list_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier181=null;
		Token char_literal182=null;
		Token Identifier183=null;

		CommonTree Identifier181_tree=null;
		CommonTree char_literal182_tree=null;
		CommonTree Identifier183_tree=null;
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

			// interpreter/HLL1.g:242:2: ( Identifier ( ',' Identifier )* -> ^( SIGNATUR ( Identifier )+ ) )
			// interpreter/HLL1.g:242:4: Identifier ( ',' Identifier )*
			{
			Identifier181=(Token)match(input,Identifier,FOLLOW_Identifier_in_tuple_signatur_list1639); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(Identifier181);

			// interpreter/HLL1.g:242:15: ( ',' Identifier )*
			loop40:
			while (true) {
				int alt40=2;
				int LA40_0 = input.LA(1);
				if ( (LA40_0==64) ) {
					alt40=1;
				}

				switch (alt40) {
				case 1 :
					// interpreter/HLL1.g:242:16: ',' Identifier
					{
					char_literal182=(Token)match(input,64,FOLLOW_64_in_tuple_signatur_list1642); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_64.add(char_literal182);

					Identifier183=(Token)match(input,Identifier,FOLLOW_Identifier_in_tuple_signatur_list1644); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(Identifier183);

					}
					break;

				default :
					break loop40;
				}
			}

			// AST REWRITE
			// elements: Identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 243:2: -> ^( SIGNATUR ( Identifier )+ )
			{
				// interpreter/HLL1.g:243:6: ^( SIGNATUR ( Identifier )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SIGNATUR, "SIGNATUR"), root_1);
				if ( !(stream_Identifier.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_Identifier.hasNext() ) {
					adaptor.addChild(root_1, stream_Identifier.nextNode());
				}
				stream_Identifier.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 44, tuple_signatur_list_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "tuple_signatur_list"


	public static class receive_tuple_signatur_list_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "receive_tuple_signatur_list"
	// interpreter/HLL1.g:245:1: receive_tuple_signatur_list : Identifier ( ',' Identifier )* -> ^( SIGNATUR ( Identifier )+ ) ;
	public final HLL1Parser.receive_tuple_signatur_list_return receive_tuple_signatur_list() throws RecognitionException {
		HLL1Parser.receive_tuple_signatur_list_return retval = new HLL1Parser.receive_tuple_signatur_list_return();
		retval.start = input.LT(1);
		int receive_tuple_signatur_list_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier184=null;
		Token char_literal185=null;
		Token Identifier186=null;

		CommonTree Identifier184_tree=null;
		CommonTree char_literal185_tree=null;
		CommonTree Identifier186_tree=null;
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }

			// interpreter/HLL1.g:246:2: ( Identifier ( ',' Identifier )* -> ^( SIGNATUR ( Identifier )+ ) )
			// interpreter/HLL1.g:246:4: Identifier ( ',' Identifier )*
			{
			Identifier184=(Token)match(input,Identifier,FOLLOW_Identifier_in_receive_tuple_signatur_list1668); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(Identifier184);

			// interpreter/HLL1.g:246:15: ( ',' Identifier )*
			loop41:
			while (true) {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( (LA41_0==64) ) {
					alt41=1;
				}

				switch (alt41) {
				case 1 :
					// interpreter/HLL1.g:246:16: ',' Identifier
					{
					char_literal185=(Token)match(input,64,FOLLOW_64_in_receive_tuple_signatur_list1671); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_64.add(char_literal185);

					Identifier186=(Token)match(input,Identifier,FOLLOW_Identifier_in_receive_tuple_signatur_list1673); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(Identifier186);

					}
					break;

				default :
					break loop41;
				}
			}

			// AST REWRITE
			// elements: Identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 247:2: -> ^( SIGNATUR ( Identifier )+ )
			{
				// interpreter/HLL1.g:247:6: ^( SIGNATUR ( Identifier )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SIGNATUR, "SIGNATUR"), root_1);
				if ( !(stream_Identifier.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_Identifier.hasNext() ) {
					adaptor.addChild(root_1, stream_Identifier.nextNode());
				}
				stream_Identifier.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 45, receive_tuple_signatur_list_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "receive_tuple_signatur_list"


	public static class anonymous_function_body_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "anonymous_function_body"
	// interpreter/HLL1.g:249:1: anonymous_function_body : expression ;
	public final HLL1Parser.anonymous_function_body_return anonymous_function_body() throws RecognitionException {
		HLL1Parser.anonymous_function_body_return retval = new HLL1Parser.anonymous_function_body_return();
		retval.start = input.LT(1);
		int anonymous_function_body_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope expression187 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }

			// interpreter/HLL1.g:249:24: ( expression )
			// interpreter/HLL1.g:250:2: expression
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_expression_in_anonymous_function_body1696);
			expression187=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression187.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 46, anonymous_function_body_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "anonymous_function_body"


	public static class setArgument_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "setArgument"
	// interpreter/HLL1.g:252:1: setArgument : ( argument | tuple );
	public final HLL1Parser.setArgument_return setArgument() throws RecognitionException {
		HLL1Parser.setArgument_return retval = new HLL1Parser.setArgument_return();
		retval.start = input.LT(1);
		int setArgument_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope argument188 =null;
		ParserRuleReturnScope tuple189 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }

			// interpreter/HLL1.g:253:2: ( argument | tuple )
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==BooleanLiteral||(LA42_0 >= Identifier && LA42_0 <= IntegerLiteral)) ) {
				alt42=1;
			}
			else if ( (LA42_0==75) ) {
				alt42=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 42, 0, input);
				throw nvae;
			}

			switch (alt42) {
				case 1 :
					// interpreter/HLL1.g:253:4: argument
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_argument_in_setArgument1706);
					argument188=argument();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, argument188.getTree());

					}
					break;
				case 2 :
					// interpreter/HLL1.g:254:4: tuple
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_tuple_in_setArgument1711);
					tuple189=tuple();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, tuple189.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 47, setArgument_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "setArgument"


	public static class expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// interpreter/HLL1.g:258:1: expression : ( conditional_or_expression | assignment );
	public final HLL1Parser.expression_return expression() throws RecognitionException {
		HLL1Parser.expression_return retval = new HLL1Parser.expression_return();
		retval.start = input.LT(1);
		int expression_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope conditional_or_expression190 =null;
		ParserRuleReturnScope assignment191 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }

			// interpreter/HLL1.g:259:2: ( conditional_or_expression | assignment )
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==BooleanLiteral||LA43_0==IntegerLiteral||LA43_0==53||LA43_0==57||(LA43_0 >= 61 && LA43_0 <= 62)||(LA43_0 >= 65 && LA43_0 <= 66)) ) {
				alt43=1;
			}
			else if ( (LA43_0==Identifier) ) {
				int LA43_2 = input.LA(2);
				if ( (LA43_2==EOF||(LA43_2 >= 54 && LA43_2 <= 55)||(LA43_2 >= 58 && LA43_2 <= 59)||(LA43_2 >= 61 && LA43_2 <= 62)||(LA43_2 >= 65 && LA43_2 <= 66)||(LA43_2 >= 68 && LA43_2 <= 71)||(LA43_2 >= 74 && LA43_2 <= 76)||(LA43_2 >= 78 && LA43_2 <= 80)||LA43_2==101||LA43_2==103||LA43_2==119||LA43_2==126) ) {
					alt43=1;
				}
				else if ( (LA43_2==56||LA43_2==60||LA43_2==63||LA43_2==67||LA43_2==72||LA43_2==77) ) {
					alt43=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 43, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 43, 0, input);
				throw nvae;
			}

			switch (alt43) {
				case 1 :
					// interpreter/HLL1.g:259:4: conditional_or_expression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_conditional_or_expression_in_expression1723);
					conditional_or_expression190=conditional_or_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional_or_expression190.getTree());

					}
					break;
				case 2 :
					// interpreter/HLL1.g:260:7: assignment
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_assignment_in_expression1731);
					assignment191=assignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment191.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 48, expression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class assignment_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "assignment"
	// interpreter/HLL1.g:263:1: assignment : Identifier assignment_operator ^ expression ;
	public final HLL1Parser.assignment_return assignment() throws RecognitionException {
		HLL1Parser.assignment_return retval = new HLL1Parser.assignment_return();
		retval.start = input.LT(1);
		int assignment_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier192=null;
		ParserRuleReturnScope assignment_operator193 =null;
		ParserRuleReturnScope expression194 =null;

		CommonTree Identifier192_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }

			// interpreter/HLL1.g:263:11: ( Identifier assignment_operator ^ expression )
			// interpreter/HLL1.g:264:2: Identifier assignment_operator ^ expression
			{
			root_0 = (CommonTree)adaptor.nil();


			Identifier192=(Token)match(input,Identifier,FOLLOW_Identifier_in_assignment1744); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier192_tree = (CommonTree)adaptor.create(Identifier192);
			adaptor.addChild(root_0, Identifier192_tree);
			}

			pushFollow(FOLLOW_assignment_operator_in_assignment1746);
			assignment_operator193=assignment_operator();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(assignment_operator193.getTree(), root_0);
			pushFollow(FOLLOW_expression_in_assignment1749);
			expression194=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression194.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 49, assignment_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "assignment"


	public static class unary_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "unary_expression"
	// interpreter/HLL1.g:266:1: unary_expression : ( '+' primary_expression -> ^( UNARY_EXPRESSION '+' primary_expression ) | '-' primary_expression -> ^( UNARY_EXPRESSION '-' primary_expression ) | '!' primary_expression -> ^( UNARY_EXPRESSION '!' primary_expression ) | pre_increment_expression | pre_decrement_expression | Identifier '++' -> ^( UNARY_EXPRESSION Identifier '++' ) | Identifier '--' -> ^( UNARY_EXPRESSION Identifier '--' ) | primary_expression );
	public final HLL1Parser.unary_expression_return unary_expression() throws RecognitionException {
		HLL1Parser.unary_expression_return retval = new HLL1Parser.unary_expression_return();
		retval.start = input.LT(1);
		int unary_expression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal195=null;
		Token char_literal197=null;
		Token char_literal199=null;
		Token Identifier203=null;
		Token string_literal204=null;
		Token Identifier205=null;
		Token string_literal206=null;
		ParserRuleReturnScope primary_expression196 =null;
		ParserRuleReturnScope primary_expression198 =null;
		ParserRuleReturnScope primary_expression200 =null;
		ParserRuleReturnScope pre_increment_expression201 =null;
		ParserRuleReturnScope pre_decrement_expression202 =null;
		ParserRuleReturnScope primary_expression207 =null;

		CommonTree char_literal195_tree=null;
		CommonTree char_literal197_tree=null;
		CommonTree char_literal199_tree=null;
		CommonTree Identifier203_tree=null;
		CommonTree string_literal204_tree=null;
		CommonTree Identifier205_tree=null;
		CommonTree string_literal206_tree=null;
		RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
		RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
		RewriteRuleSubtreeStream stream_primary_expression=new RewriteRuleSubtreeStream(adaptor,"rule primary_expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }

			// interpreter/HLL1.g:267:2: ( '+' primary_expression -> ^( UNARY_EXPRESSION '+' primary_expression ) | '-' primary_expression -> ^( UNARY_EXPRESSION '-' primary_expression ) | '!' primary_expression -> ^( UNARY_EXPRESSION '!' primary_expression ) | pre_increment_expression | pre_decrement_expression | Identifier '++' -> ^( UNARY_EXPRESSION Identifier '++' ) | Identifier '--' -> ^( UNARY_EXPRESSION Identifier '--' ) | primary_expression )
			int alt44=8;
			switch ( input.LA(1) ) {
			case 61:
				{
				alt44=1;
				}
				break;
			case 65:
				{
				alt44=2;
				}
				break;
			case 53:
				{
				alt44=3;
				}
				break;
			case 62:
				{
				alt44=4;
				}
				break;
			case 66:
				{
				alt44=5;
				}
				break;
			case Identifier:
				{
				switch ( input.LA(2) ) {
				case 62:
					{
					alt44=6;
					}
					break;
				case 66:
					{
					alt44=7;
					}
					break;
				case EOF:
				case 54:
				case 55:
				case 58:
				case 59:
				case 61:
				case 65:
				case 68:
				case 69:
				case 70:
				case 71:
				case 74:
				case 75:
				case 76:
				case 78:
				case 79:
				case 80:
				case 101:
				case 103:
				case 119:
				case 126:
					{
					alt44=8;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 44, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case BooleanLiteral:
			case IntegerLiteral:
			case 57:
				{
				alt44=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}
			switch (alt44) {
				case 1 :
					// interpreter/HLL1.g:267:4: '+' primary_expression
					{
					char_literal195=(Token)match(input,61,FOLLOW_61_in_unary_expression1760); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_61.add(char_literal195);

					pushFollow(FOLLOW_primary_expression_in_unary_expression1764);
					primary_expression196=primary_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_primary_expression.add(primary_expression196.getTree());
					// AST REWRITE
					// elements: primary_expression, 61
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 267:29: -> ^( UNARY_EXPRESSION '+' primary_expression )
					{
						// interpreter/HLL1.g:267:32: ^( UNARY_EXPRESSION '+' primary_expression )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(UNARY_EXPRESSION, "UNARY_EXPRESSION"), root_1);
						adaptor.addChild(root_1, stream_61.nextNode());
						adaptor.addChild(root_1, stream_primary_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// interpreter/HLL1.g:268:7: '-' primary_expression
					{
					char_literal197=(Token)match(input,65,FOLLOW_65_in_unary_expression1783); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_65.add(char_literal197);

					pushFollow(FOLLOW_primary_expression_in_unary_expression1787);
					primary_expression198=primary_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_primary_expression.add(primary_expression198.getTree());
					// AST REWRITE
					// elements: 65, primary_expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 268:32: -> ^( UNARY_EXPRESSION '-' primary_expression )
					{
						// interpreter/HLL1.g:268:35: ^( UNARY_EXPRESSION '-' primary_expression )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(UNARY_EXPRESSION, "UNARY_EXPRESSION"), root_1);
						adaptor.addChild(root_1, stream_65.nextNode());
						adaptor.addChild(root_1, stream_primary_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// interpreter/HLL1.g:269:7: '!' primary_expression
					{
					char_literal199=(Token)match(input,53,FOLLOW_53_in_unary_expression1805); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_53.add(char_literal199);

					pushFollow(FOLLOW_primary_expression_in_unary_expression1809);
					primary_expression200=primary_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_primary_expression.add(primary_expression200.getTree());
					// AST REWRITE
					// elements: primary_expression, 53
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 269:32: -> ^( UNARY_EXPRESSION '!' primary_expression )
					{
						// interpreter/HLL1.g:269:35: ^( UNARY_EXPRESSION '!' primary_expression )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(UNARY_EXPRESSION, "UNARY_EXPRESSION"), root_1);
						adaptor.addChild(root_1, stream_53.nextNode());
						adaptor.addChild(root_1, stream_primary_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// interpreter/HLL1.g:270:7: pre_increment_expression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_pre_increment_expression_in_unary_expression1827);
					pre_increment_expression201=pre_increment_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, pre_increment_expression201.getTree());

					}
					break;
				case 5 :
					// interpreter/HLL1.g:271:7: pre_decrement_expression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_pre_decrement_expression_in_unary_expression1835);
					pre_decrement_expression202=pre_decrement_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, pre_decrement_expression202.getTree());

					}
					break;
				case 6 :
					// interpreter/HLL1.g:272:7: Identifier '++'
					{
					Identifier203=(Token)match(input,Identifier,FOLLOW_Identifier_in_unary_expression1843); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(Identifier203);

					string_literal204=(Token)match(input,62,FOLLOW_62_in_unary_expression1845); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_62.add(string_literal204);

					// AST REWRITE
					// elements: 62, Identifier
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 272:23: -> ^( UNARY_EXPRESSION Identifier '++' )
					{
						// interpreter/HLL1.g:272:26: ^( UNARY_EXPRESSION Identifier '++' )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(UNARY_EXPRESSION, "UNARY_EXPRESSION"), root_1);
						adaptor.addChild(root_1, stream_Identifier.nextNode());
						adaptor.addChild(root_1, stream_62.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 7 :
					// interpreter/HLL1.g:273:7: Identifier '--'
					{
					Identifier205=(Token)match(input,Identifier,FOLLOW_Identifier_in_unary_expression1863); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(Identifier205);

					string_literal206=(Token)match(input,66,FOLLOW_66_in_unary_expression1865); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_66.add(string_literal206);

					// AST REWRITE
					// elements: Identifier, 66
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 273:23: -> ^( UNARY_EXPRESSION Identifier '--' )
					{
						// interpreter/HLL1.g:273:26: ^( UNARY_EXPRESSION Identifier '--' )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(UNARY_EXPRESSION, "UNARY_EXPRESSION"), root_1);
						adaptor.addChild(root_1, stream_Identifier.nextNode());
						adaptor.addChild(root_1, stream_66.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 8 :
					// interpreter/HLL1.g:274:7: primary_expression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_primary_expression_in_unary_expression1883);
					primary_expression207=primary_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primary_expression207.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 50, unary_expression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "unary_expression"


	public static class primary_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "primary_expression"
	// interpreter/HLL1.g:276:1: primary_expression : ( expression_set_invocation | operational_set_invocation | paren_expression | primary -> ^( PRIMARY primary ) );
	public final HLL1Parser.primary_expression_return primary_expression() throws RecognitionException {
		HLL1Parser.primary_expression_return retval = new HLL1Parser.primary_expression_return();
		retval.start = input.LT(1);
		int primary_expression_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope expression_set_invocation208 =null;
		ParserRuleReturnScope operational_set_invocation209 =null;
		ParserRuleReturnScope paren_expression210 =null;
		ParserRuleReturnScope primary211 =null;

		RewriteRuleSubtreeStream stream_primary=new RewriteRuleSubtreeStream(adaptor,"rule primary");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }

			// interpreter/HLL1.g:277:2: ( expression_set_invocation | operational_set_invocation | paren_expression | primary -> ^( PRIMARY primary ) )
			int alt45=4;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				int LA45_1 = input.LA(2);
				if ( (LA45_1==68) ) {
					int LA45_4 = input.LA(3);
					if ( (LA45_4==102||LA45_4==106||LA45_4==123) ) {
						alt45=1;
					}
					else if ( (LA45_4==116||LA45_4==121) ) {
						alt45=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 45, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA45_1==EOF||(LA45_1 >= 54 && LA45_1 <= 55)||(LA45_1 >= 58 && LA45_1 <= 59)||LA45_1==61||LA45_1==65||(LA45_1 >= 69 && LA45_1 <= 71)||(LA45_1 >= 74 && LA45_1 <= 76)||(LA45_1 >= 78 && LA45_1 <= 80)||LA45_1==101||LA45_1==103||LA45_1==119||LA45_1==126) ) {
					alt45=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 45, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 57:
				{
				alt45=3;
				}
				break;
			case BooleanLiteral:
			case IntegerLiteral:
				{
				alt45=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 45, 0, input);
				throw nvae;
			}
			switch (alt45) {
				case 1 :
					// interpreter/HLL1.g:277:4: expression_set_invocation
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_expression_set_invocation_in_primary_expression1893);
					expression_set_invocation208=expression_set_invocation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_set_invocation208.getTree());

					}
					break;
				case 2 :
					// interpreter/HLL1.g:278:4: operational_set_invocation
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_operational_set_invocation_in_primary_expression1898);
					operational_set_invocation209=operational_set_invocation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, operational_set_invocation209.getTree());

					}
					break;
				case 3 :
					// interpreter/HLL1.g:279:7: paren_expression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_paren_expression_in_primary_expression1906);
					paren_expression210=paren_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, paren_expression210.getTree());

					}
					break;
				case 4 :
					// interpreter/HLL1.g:280:7: primary
					{
					pushFollow(FOLLOW_primary_in_primary_expression1915);
					primary211=primary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_primary.add(primary211.getTree());
					// AST REWRITE
					// elements: primary
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 280:15: -> ^( PRIMARY primary )
					{
						// interpreter/HLL1.g:280:18: ^( PRIMARY primary )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PRIMARY, "PRIMARY"), root_1);
						adaptor.addChild(root_1, stream_primary.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 51, primary_expression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "primary_expression"


	public static class primary_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "primary"
	// interpreter/HLL1.g:282:1: primary : ( Identifier | literal );
	public final HLL1Parser.primary_return primary() throws RecognitionException {
		HLL1Parser.primary_return retval = new HLL1Parser.primary_return();
		retval.start = input.LT(1);
		int primary_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier212=null;
		ParserRuleReturnScope literal213 =null;

		CommonTree Identifier212_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }

			// interpreter/HLL1.g:283:2: ( Identifier | literal )
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==Identifier) ) {
				alt46=1;
			}
			else if ( (LA46_0==BooleanLiteral||LA46_0==IntegerLiteral) ) {
				alt46=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 46, 0, input);
				throw nvae;
			}

			switch (alt46) {
				case 1 :
					// interpreter/HLL1.g:283:4: Identifier
					{
					root_0 = (CommonTree)adaptor.nil();


					Identifier212=(Token)match(input,Identifier,FOLLOW_Identifier_in_primary1937); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Identifier212_tree = (CommonTree)adaptor.create(Identifier212);
					adaptor.addChild(root_0, Identifier212_tree);
					}

					}
					break;
				case 2 :
					// interpreter/HLL1.g:284:4: literal
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_literal_in_primary1942);
					literal213=literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, literal213.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 52, primary_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "primary"


	public static class paren_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "paren_expression"
	// interpreter/HLL1.g:287:1: paren_expression : '(' ! expression ')' !;
	public final HLL1Parser.paren_expression_return paren_expression() throws RecognitionException {
		HLL1Parser.paren_expression_return retval = new HLL1Parser.paren_expression_return();
		retval.start = input.LT(1);
		int paren_expression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal214=null;
		Token char_literal216=null;
		ParserRuleReturnScope expression215 =null;

		CommonTree char_literal214_tree=null;
		CommonTree char_literal216_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }

			// interpreter/HLL1.g:287:17: ( '(' ! expression ')' !)
			// interpreter/HLL1.g:288:2: '(' ! expression ')' !
			{
			root_0 = (CommonTree)adaptor.nil();


			char_literal214=(Token)match(input,57,FOLLOW_57_in_paren_expression1956); if (state.failed) return retval;
			pushFollow(FOLLOW_expression_in_paren_expression1961);
			expression215=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression215.getTree());

			char_literal216=(Token)match(input,58,FOLLOW_58_in_paren_expression1965); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 53, paren_expression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "paren_expression"


	public static class assignment_operator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "assignment_operator"
	// interpreter/HLL1.g:290:1: assignment_operator : ( '=' | '+=' | '-=' | '*=' | '/=' | '%=' );
	public final HLL1Parser.assignment_operator_return assignment_operator() throws RecognitionException {
		HLL1Parser.assignment_operator_return retval = new HLL1Parser.assignment_operator_return();
		retval.start = input.LT(1);
		int assignment_operator_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set217=null;

		CommonTree set217_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }

			// interpreter/HLL1.g:290:20: ( '=' | '+=' | '-=' | '*=' | '/=' | '%=' )
			// interpreter/HLL1.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set217=input.LT(1);
			if ( input.LA(1)==56||input.LA(1)==60||input.LA(1)==63||input.LA(1)==67||input.LA(1)==72||input.LA(1)==77 ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set217));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 54, assignment_operator_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "assignment_operator"


	public static class pre_increment_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "pre_increment_expression"
	// interpreter/HLL1.g:293:1: pre_increment_expression : '++' Identifier -> ^( UNARY_EXPRESSION '++' Identifier ) ;
	public final HLL1Parser.pre_increment_expression_return pre_increment_expression() throws RecognitionException {
		HLL1Parser.pre_increment_expression_return retval = new HLL1Parser.pre_increment_expression_return();
		retval.start = input.LT(1);
		int pre_increment_expression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal218=null;
		Token Identifier219=null;

		CommonTree string_literal218_tree=null;
		CommonTree Identifier219_tree=null;
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }

			// interpreter/HLL1.g:293:25: ( '++' Identifier -> ^( UNARY_EXPRESSION '++' Identifier ) )
			// interpreter/HLL1.g:294:2: '++' Identifier
			{
			string_literal218=(Token)match(input,62,FOLLOW_62_in_pre_increment_expression2011); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_62.add(string_literal218);

			Identifier219=(Token)match(input,Identifier,FOLLOW_Identifier_in_pre_increment_expression2013); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(Identifier219);

			// AST REWRITE
			// elements: 62, Identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 294:18: -> ^( UNARY_EXPRESSION '++' Identifier )
			{
				// interpreter/HLL1.g:294:21: ^( UNARY_EXPRESSION '++' Identifier )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(UNARY_EXPRESSION, "UNARY_EXPRESSION"), root_1);
				adaptor.addChild(root_1, stream_62.nextNode());
				adaptor.addChild(root_1, stream_Identifier.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 55, pre_increment_expression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "pre_increment_expression"


	public static class pre_decrement_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "pre_decrement_expression"
	// interpreter/HLL1.g:296:1: pre_decrement_expression : '--' Identifier -> ^( UNARY_EXPRESSION '--' Identifier ) ;
	public final HLL1Parser.pre_decrement_expression_return pre_decrement_expression() throws RecognitionException {
		HLL1Parser.pre_decrement_expression_return retval = new HLL1Parser.pre_decrement_expression_return();
		retval.start = input.LT(1);
		int pre_decrement_expression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal220=null;
		Token Identifier221=null;

		CommonTree string_literal220_tree=null;
		CommonTree Identifier221_tree=null;
		RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }

			// interpreter/HLL1.g:296:25: ( '--' Identifier -> ^( UNARY_EXPRESSION '--' Identifier ) )
			// interpreter/HLL1.g:297:2: '--' Identifier
			{
			string_literal220=(Token)match(input,66,FOLLOW_66_in_pre_decrement_expression2035); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_66.add(string_literal220);

			Identifier221=(Token)match(input,Identifier,FOLLOW_Identifier_in_pre_decrement_expression2037); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Identifier.add(Identifier221);

			// AST REWRITE
			// elements: 66, Identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 297:18: -> ^( UNARY_EXPRESSION '--' Identifier )
			{
				// interpreter/HLL1.g:297:21: ^( UNARY_EXPRESSION '--' Identifier )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(UNARY_EXPRESSION, "UNARY_EXPRESSION"), root_1);
				adaptor.addChild(root_1, stream_66.nextNode());
				adaptor.addChild(root_1, stream_Identifier.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 56, pre_decrement_expression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "pre_decrement_expression"


	public static class variable_reference_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "variable_reference"
	// interpreter/HLL1.g:299:1: variable_reference : expression ;
	public final HLL1Parser.variable_reference_return variable_reference() throws RecognitionException {
		HLL1Parser.variable_reference_return retval = new HLL1Parser.variable_reference_return();
		retval.start = input.LT(1);
		int variable_reference_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope expression222 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }

			// interpreter/HLL1.g:299:19: ( expression )
			// interpreter/HLL1.g:300:2: expression
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_expression_in_variable_reference2059);
			expression222=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression222.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 57, variable_reference_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "variable_reference"


	public static class multiplicative_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "multiplicative_expression"
	// interpreter/HLL1.g:302:1: multiplicative_expression : unary_expression ( ( '*' ^| '/' ^| '%' ^) unary_expression )* ;
	public final HLL1Parser.multiplicative_expression_return multiplicative_expression() throws RecognitionException {
		HLL1Parser.multiplicative_expression_return retval = new HLL1Parser.multiplicative_expression_return();
		retval.start = input.LT(1);
		int multiplicative_expression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal224=null;
		Token char_literal225=null;
		Token char_literal226=null;
		ParserRuleReturnScope unary_expression223 =null;
		ParserRuleReturnScope unary_expression227 =null;

		CommonTree char_literal224_tree=null;
		CommonTree char_literal225_tree=null;
		CommonTree char_literal226_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }

			// interpreter/HLL1.g:302:26: ( unary_expression ( ( '*' ^| '/' ^| '%' ^) unary_expression )* )
			// interpreter/HLL1.g:303:5: unary_expression ( ( '*' ^| '/' ^| '%' ^) unary_expression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_unary_expression_in_multiplicative_expression2075);
			unary_expression223=unary_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression223.getTree());

			// interpreter/HLL1.g:303:22: ( ( '*' ^| '/' ^| '%' ^) unary_expression )*
			loop48:
			while (true) {
				int alt48=2;
				int LA48_0 = input.LA(1);
				if ( (LA48_0==55||LA48_0==59||LA48_0==71) ) {
					alt48=1;
				}

				switch (alt48) {
				case 1 :
					// interpreter/HLL1.g:303:23: ( '*' ^| '/' ^| '%' ^) unary_expression
					{
					// interpreter/HLL1.g:303:23: ( '*' ^| '/' ^| '%' ^)
					int alt47=3;
					switch ( input.LA(1) ) {
					case 59:
						{
						alt47=1;
						}
						break;
					case 71:
						{
						alt47=2;
						}
						break;
					case 55:
						{
						alt47=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 47, 0, input);
						throw nvae;
					}
					switch (alt47) {
						case 1 :
							// interpreter/HLL1.g:303:24: '*' ^
							{
							char_literal224=(Token)match(input,59,FOLLOW_59_in_multiplicative_expression2079); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal224_tree = (CommonTree)adaptor.create(char_literal224);
							root_0 = (CommonTree)adaptor.becomeRoot(char_literal224_tree, root_0);
							}

							}
							break;
						case 2 :
							// interpreter/HLL1.g:303:29: '/' ^
							{
							char_literal225=(Token)match(input,71,FOLLOW_71_in_multiplicative_expression2082); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal225_tree = (CommonTree)adaptor.create(char_literal225);
							root_0 = (CommonTree)adaptor.becomeRoot(char_literal225_tree, root_0);
							}

							}
							break;
						case 3 :
							// interpreter/HLL1.g:303:34: '%' ^
							{
							char_literal226=(Token)match(input,55,FOLLOW_55_in_multiplicative_expression2085); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal226_tree = (CommonTree)adaptor.create(char_literal226);
							root_0 = (CommonTree)adaptor.becomeRoot(char_literal226_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_unary_expression_in_multiplicative_expression2091);
					unary_expression227=unary_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression227.getTree());

					}
					break;

				default :
					break loop48;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 58, multiplicative_expression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "multiplicative_expression"


	public static class additive_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "additive_expression"
	// interpreter/HLL1.g:305:1: additive_expression : multiplicative_expression ( ( '+' ^| '-' ^) multiplicative_expression )* ;
	public final HLL1Parser.additive_expression_return additive_expression() throws RecognitionException {
		HLL1Parser.additive_expression_return retval = new HLL1Parser.additive_expression_return();
		retval.start = input.LT(1);
		int additive_expression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal229=null;
		Token char_literal230=null;
		ParserRuleReturnScope multiplicative_expression228 =null;
		ParserRuleReturnScope multiplicative_expression231 =null;

		CommonTree char_literal229_tree=null;
		CommonTree char_literal230_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }

			// interpreter/HLL1.g:305:20: ( multiplicative_expression ( ( '+' ^| '-' ^) multiplicative_expression )* )
			// interpreter/HLL1.g:306:5: multiplicative_expression ( ( '+' ^| '-' ^) multiplicative_expression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_multiplicative_expression_in_additive_expression2109);
			multiplicative_expression228=multiplicative_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression228.getTree());

			// interpreter/HLL1.g:306:31: ( ( '+' ^| '-' ^) multiplicative_expression )*
			loop50:
			while (true) {
				int alt50=2;
				int LA50_0 = input.LA(1);
				if ( (LA50_0==61||LA50_0==65) ) {
					alt50=1;
				}

				switch (alt50) {
				case 1 :
					// interpreter/HLL1.g:306:32: ( '+' ^| '-' ^) multiplicative_expression
					{
					// interpreter/HLL1.g:306:32: ( '+' ^| '-' ^)
					int alt49=2;
					int LA49_0 = input.LA(1);
					if ( (LA49_0==61) ) {
						alt49=1;
					}
					else if ( (LA49_0==65) ) {
						alt49=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 49, 0, input);
						throw nvae;
					}

					switch (alt49) {
						case 1 :
							// interpreter/HLL1.g:306:33: '+' ^
							{
							char_literal229=(Token)match(input,61,FOLLOW_61_in_additive_expression2113); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal229_tree = (CommonTree)adaptor.create(char_literal229);
							root_0 = (CommonTree)adaptor.becomeRoot(char_literal229_tree, root_0);
							}

							}
							break;
						case 2 :
							// interpreter/HLL1.g:306:38: '-' ^
							{
							char_literal230=(Token)match(input,65,FOLLOW_65_in_additive_expression2116); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal230_tree = (CommonTree)adaptor.create(char_literal230);
							root_0 = (CommonTree)adaptor.becomeRoot(char_literal230_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_multiplicative_expression_in_additive_expression2122);
					multiplicative_expression231=multiplicative_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression231.getTree());

					}
					break;

				default :
					break loop50;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 59, additive_expression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "additive_expression"


	public static class relational_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "relational_expression"
	// interpreter/HLL1.g:308:1: relational_expression : additive_expression ( ( '<' ^| '>' ^| '<=' ^| '>=' ^) additive_expression )* ;
	public final HLL1Parser.relational_expression_return relational_expression() throws RecognitionException {
		HLL1Parser.relational_expression_return retval = new HLL1Parser.relational_expression_return();
		retval.start = input.LT(1);
		int relational_expression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal233=null;
		Token char_literal234=null;
		Token string_literal235=null;
		Token string_literal236=null;
		ParserRuleReturnScope additive_expression232 =null;
		ParserRuleReturnScope additive_expression237 =null;

		CommonTree char_literal233_tree=null;
		CommonTree char_literal234_tree=null;
		CommonTree string_literal235_tree=null;
		CommonTree string_literal236_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }

			// interpreter/HLL1.g:308:22: ( additive_expression ( ( '<' ^| '>' ^| '<=' ^| '>=' ^) additive_expression )* )
			// interpreter/HLL1.g:309:2: additive_expression ( ( '<' ^| '>' ^| '<=' ^| '>=' ^) additive_expression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_additive_expression_in_relational_expression2137);
			additive_expression232=additive_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression232.getTree());

			// interpreter/HLL1.g:309:22: ( ( '<' ^| '>' ^| '<=' ^| '>=' ^) additive_expression )*
			loop52:
			while (true) {
				int alt52=2;
				int LA52_0 = input.LA(1);
				if ( ((LA52_0 >= 75 && LA52_0 <= 76)||(LA52_0 >= 79 && LA52_0 <= 80)) ) {
					alt52=1;
				}

				switch (alt52) {
				case 1 :
					// interpreter/HLL1.g:309:23: ( '<' ^| '>' ^| '<=' ^| '>=' ^) additive_expression
					{
					// interpreter/HLL1.g:309:23: ( '<' ^| '>' ^| '<=' ^| '>=' ^)
					int alt51=4;
					switch ( input.LA(1) ) {
					case 75:
						{
						alt51=1;
						}
						break;
					case 79:
						{
						alt51=2;
						}
						break;
					case 76:
						{
						alt51=3;
						}
						break;
					case 80:
						{
						alt51=4;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 51, 0, input);
						throw nvae;
					}
					switch (alt51) {
						case 1 :
							// interpreter/HLL1.g:309:24: '<' ^
							{
							char_literal233=(Token)match(input,75,FOLLOW_75_in_relational_expression2141); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal233_tree = (CommonTree)adaptor.create(char_literal233);
							root_0 = (CommonTree)adaptor.becomeRoot(char_literal233_tree, root_0);
							}

							}
							break;
						case 2 :
							// interpreter/HLL1.g:309:29: '>' ^
							{
							char_literal234=(Token)match(input,79,FOLLOW_79_in_relational_expression2144); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal234_tree = (CommonTree)adaptor.create(char_literal234);
							root_0 = (CommonTree)adaptor.becomeRoot(char_literal234_tree, root_0);
							}

							}
							break;
						case 3 :
							// interpreter/HLL1.g:309:34: '<=' ^
							{
							string_literal235=(Token)match(input,76,FOLLOW_76_in_relational_expression2147); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal235_tree = (CommonTree)adaptor.create(string_literal235);
							root_0 = (CommonTree)adaptor.becomeRoot(string_literal235_tree, root_0);
							}

							}
							break;
						case 4 :
							// interpreter/HLL1.g:309:40: '>=' ^
							{
							string_literal236=(Token)match(input,80,FOLLOW_80_in_relational_expression2150); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal236_tree = (CommonTree)adaptor.create(string_literal236);
							root_0 = (CommonTree)adaptor.becomeRoot(string_literal236_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_additive_expression_in_relational_expression2154);
					additive_expression237=additive_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression237.getTree());

					}
					break;

				default :
					break loop52;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 60, relational_expression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "relational_expression"


	public static class equality_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "equality_expression"
	// interpreter/HLL1.g:311:1: equality_expression : relational_expression ( ( '==' ^| '!=' ^) relational_expression )* ;
	public final HLL1Parser.equality_expression_return equality_expression() throws RecognitionException {
		HLL1Parser.equality_expression_return retval = new HLL1Parser.equality_expression_return();
		retval.start = input.LT(1);
		int equality_expression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal239=null;
		Token string_literal240=null;
		ParserRuleReturnScope relational_expression238 =null;
		ParserRuleReturnScope relational_expression241 =null;

		CommonTree string_literal239_tree=null;
		CommonTree string_literal240_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }

			// interpreter/HLL1.g:311:20: ( relational_expression ( ( '==' ^| '!=' ^) relational_expression )* )
			// interpreter/HLL1.g:312:5: relational_expression ( ( '==' ^| '!=' ^) relational_expression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_relational_expression_in_equality_expression2172);
			relational_expression238=relational_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression238.getTree());

			// interpreter/HLL1.g:312:28: ( ( '==' ^| '!=' ^) relational_expression )*
			loop54:
			while (true) {
				int alt54=2;
				int LA54_0 = input.LA(1);
				if ( (LA54_0==54||LA54_0==78) ) {
					alt54=1;
				}

				switch (alt54) {
				case 1 :
					// interpreter/HLL1.g:312:29: ( '==' ^| '!=' ^) relational_expression
					{
					// interpreter/HLL1.g:312:29: ( '==' ^| '!=' ^)
					int alt53=2;
					int LA53_0 = input.LA(1);
					if ( (LA53_0==78) ) {
						alt53=1;
					}
					else if ( (LA53_0==54) ) {
						alt53=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 53, 0, input);
						throw nvae;
					}

					switch (alt53) {
						case 1 :
							// interpreter/HLL1.g:312:30: '==' ^
							{
							string_literal239=(Token)match(input,78,FOLLOW_78_in_equality_expression2177); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal239_tree = (CommonTree)adaptor.create(string_literal239);
							root_0 = (CommonTree)adaptor.becomeRoot(string_literal239_tree, root_0);
							}

							}
							break;
						case 2 :
							// interpreter/HLL1.g:312:36: '!=' ^
							{
							string_literal240=(Token)match(input,54,FOLLOW_54_in_equality_expression2180); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							string_literal240_tree = (CommonTree)adaptor.create(string_literal240);
							root_0 = (CommonTree)adaptor.becomeRoot(string_literal240_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_relational_expression_in_equality_expression2186);
					relational_expression241=relational_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression241.getTree());

					}
					break;

				default :
					break loop54;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 61, equality_expression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "equality_expression"


	public static class conditional_and_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "conditional_and_expression"
	// interpreter/HLL1.g:314:1: conditional_and_expression : equality_expression ( 'and' ^ equality_expression )* ;
	public final HLL1Parser.conditional_and_expression_return conditional_and_expression() throws RecognitionException {
		HLL1Parser.conditional_and_expression_return retval = new HLL1Parser.conditional_and_expression_return();
		retval.start = input.LT(1);
		int conditional_and_expression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal243=null;
		ParserRuleReturnScope equality_expression242 =null;
		ParserRuleReturnScope equality_expression244 =null;

		CommonTree string_literal243_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }

			// interpreter/HLL1.g:314:27: ( equality_expression ( 'and' ^ equality_expression )* )
			// interpreter/HLL1.g:315:5: equality_expression ( 'and' ^ equality_expression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_equality_expression_in_conditional_and_expression2204);
			equality_expression242=equality_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expression242.getTree());

			// interpreter/HLL1.g:315:27: ( 'and' ^ equality_expression )*
			loop55:
			while (true) {
				int alt55=2;
				int LA55_0 = input.LA(1);
				if ( (LA55_0==101) ) {
					alt55=1;
				}

				switch (alt55) {
				case 1 :
					// interpreter/HLL1.g:315:28: 'and' ^ equality_expression
					{
					string_literal243=(Token)match(input,101,FOLLOW_101_in_conditional_and_expression2209); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal243_tree = (CommonTree)adaptor.create(string_literal243);
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal243_tree, root_0);
					}

					pushFollow(FOLLOW_equality_expression_in_conditional_and_expression2214);
					equality_expression244=equality_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expression244.getTree());

					}
					break;

				default :
					break loop55;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 62, conditional_and_expression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "conditional_and_expression"


	public static class conditional_or_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "conditional_or_expression"
	// interpreter/HLL1.g:317:1: conditional_or_expression : conditional_and_expression ( 'or' ^ conditional_and_expression )* ;
	public final HLL1Parser.conditional_or_expression_return conditional_or_expression() throws RecognitionException {
		HLL1Parser.conditional_or_expression_return retval = new HLL1Parser.conditional_or_expression_return();
		retval.start = input.LT(1);
		int conditional_or_expression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal246=null;
		ParserRuleReturnScope conditional_and_expression245 =null;
		ParserRuleReturnScope conditional_and_expression247 =null;

		CommonTree string_literal246_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }

			// interpreter/HLL1.g:317:26: ( conditional_and_expression ( 'or' ^ conditional_and_expression )* )
			// interpreter/HLL1.g:318:5: conditional_and_expression ( 'or' ^ conditional_and_expression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_conditional_and_expression_in_conditional_or_expression2232);
			conditional_and_expression245=conditional_and_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional_and_expression245.getTree());

			// interpreter/HLL1.g:318:33: ( 'or' ^ conditional_and_expression )*
			loop56:
			while (true) {
				int alt56=2;
				int LA56_0 = input.LA(1);
				if ( (LA56_0==119) ) {
					alt56=1;
				}

				switch (alt56) {
				case 1 :
					// interpreter/HLL1.g:318:34: 'or' ^ conditional_and_expression
					{
					string_literal246=(Token)match(input,119,FOLLOW_119_in_conditional_or_expression2236); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal246_tree = (CommonTree)adaptor.create(string_literal246);
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal246_tree, root_0);
					}

					pushFollow(FOLLOW_conditional_and_expression_in_conditional_or_expression2241);
					conditional_and_expression247=conditional_and_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional_and_expression247.getTree());

					}
					break;

				default :
					break loop56;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 63, conditional_or_expression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "conditional_or_expression"


	public static class message_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "message"
	// interpreter/HLL1.g:326:1: message : ( sendTo | received );
	public final HLL1Parser.message_return message() throws RecognitionException {
		HLL1Parser.message_return retval = new HLL1Parser.message_return();
		retval.start = input.LT(1);
		int message_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope sendTo248 =null;
		ParserRuleReturnScope received249 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }

			// interpreter/HLL1.g:327:2: ( sendTo | received )
			int alt57=2;
			int LA57_0 = input.LA(1);
			if ( (LA57_0==122) ) {
				alt57=1;
			}
			else if ( (LA57_0==118) ) {
				alt57=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 57, 0, input);
				throw nvae;
			}

			switch (alt57) {
				case 1 :
					// interpreter/HLL1.g:327:4: sendTo
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_sendTo_in_message2265);
					sendTo248=sendTo();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, sendTo248.getTree());

					}
					break;
				case 2 :
					// interpreter/HLL1.g:328:4: received
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_received_in_message2270);
					received249=received();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, received249.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 64, message_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "message"


	public static class sendTo_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "sendTo"
	// interpreter/HLL1.g:331:1: sendTo : 'send' sendTuple 'to' receiver -> ^( SEND sendTuple receiver ) ;
	public final HLL1Parser.sendTo_return sendTo() throws RecognitionException {
		HLL1Parser.sendTo_return retval = new HLL1Parser.sendTo_return();
		retval.start = input.LT(1);
		int sendTo_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal250=null;
		Token string_literal252=null;
		ParserRuleReturnScope sendTuple251 =null;
		ParserRuleReturnScope receiver253 =null;

		CommonTree string_literal250_tree=null;
		CommonTree string_literal252_tree=null;
		RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
		RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
		RewriteRuleSubtreeStream stream_receiver=new RewriteRuleSubtreeStream(adaptor,"rule receiver");
		RewriteRuleSubtreeStream stream_sendTuple=new RewriteRuleSubtreeStream(adaptor,"rule sendTuple");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }

			// interpreter/HLL1.g:331:7: ( 'send' sendTuple 'to' receiver -> ^( SEND sendTuple receiver ) )
			// interpreter/HLL1.g:332:2: 'send' sendTuple 'to' receiver
			{
			string_literal250=(Token)match(input,122,FOLLOW_122_in_sendTo2282); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_122.add(string_literal250);

			pushFollow(FOLLOW_sendTuple_in_sendTo2284);
			sendTuple251=sendTuple();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_sendTuple.add(sendTuple251.getTree());
			string_literal252=(Token)match(input,127,FOLLOW_127_in_sendTo2286); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_127.add(string_literal252);

			pushFollow(FOLLOW_receiver_in_sendTo2288);
			receiver253=receiver();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_receiver.add(receiver253.getTree());
			// AST REWRITE
			// elements: sendTuple, receiver
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 332:33: -> ^( SEND sendTuple receiver )
			{
				// interpreter/HLL1.g:332:36: ^( SEND sendTuple receiver )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEND, "SEND"), root_1);
				adaptor.addChild(root_1, stream_sendTuple.nextTree());
				adaptor.addChild(root_1, stream_receiver.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 65, sendTo_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "sendTo"


	public static class received_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "received"
	// interpreter/HLL1.g:334:1: received : 'on receive' receive_anonymous_function_signature 'from' sender ':' statement -> ^( RECEIVE receive_anonymous_function_signature sender statement ) ;
	public final HLL1Parser.received_return received() throws RecognitionException {
		HLL1Parser.received_return retval = new HLL1Parser.received_return();
		retval.start = input.LT(1);
		int received_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal254=null;
		Token string_literal256=null;
		Token char_literal258=null;
		ParserRuleReturnScope receive_anonymous_function_signature255 =null;
		ParserRuleReturnScope sender257 =null;
		ParserRuleReturnScope statement259 =null;

		CommonTree string_literal254_tree=null;
		CommonTree string_literal256_tree=null;
		CommonTree char_literal258_tree=null;
		RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
		RewriteRuleSubtreeStream stream_sender=new RewriteRuleSubtreeStream(adaptor,"rule sender");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
		RewriteRuleSubtreeStream stream_receive_anonymous_function_signature=new RewriteRuleSubtreeStream(adaptor,"rule receive_anonymous_function_signature");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }

			// interpreter/HLL1.g:335:2: ( 'on receive' receive_anonymous_function_signature 'from' sender ':' statement -> ^( RECEIVE receive_anonymous_function_signature sender statement ) )
			// interpreter/HLL1.g:335:4: 'on receive' receive_anonymous_function_signature 'from' sender ':' statement
			{
			string_literal254=(Token)match(input,118,FOLLOW_118_in_received2308); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_118.add(string_literal254);

			pushFollow(FOLLOW_receive_anonymous_function_signature_in_received2310);
			receive_anonymous_function_signature255=receive_anonymous_function_signature();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_receive_anonymous_function_signature.add(receive_anonymous_function_signature255.getTree());
			string_literal256=(Token)match(input,109,FOLLOW_109_in_received2312); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_109.add(string_literal256);

			pushFollow(FOLLOW_sender_in_received2314);
			sender257=sender();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_sender.add(sender257.getTree());
			char_literal258=(Token)match(input,73,FOLLOW_73_in_received2316); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_73.add(char_literal258);

			pushFollow(FOLLOW_statement_in_received2318);
			statement259=statement();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_statement.add(statement259.getTree());
			// AST REWRITE
			// elements: statement, receive_anonymous_function_signature, sender
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 335:82: -> ^( RECEIVE receive_anonymous_function_signature sender statement )
			{
				// interpreter/HLL1.g:335:85: ^( RECEIVE receive_anonymous_function_signature sender statement )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RECEIVE, "RECEIVE"), root_1);
				adaptor.addChild(root_1, stream_receive_anonymous_function_signature.nextTree());
				adaptor.addChild(root_1, stream_sender.nextTree());
				adaptor.addChild(root_1, stream_statement.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 66, received_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "received"


	public static class receiver_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "receiver"
	// interpreter/HLL1.g:338:1: receiver : ( 'all' -> ^( ALL ) | pID );
	public final HLL1Parser.receiver_return receiver() throws RecognitionException {
		HLL1Parser.receiver_return retval = new HLL1Parser.receiver_return();
		retval.start = input.LT(1);
		int receiver_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal260=null;
		ParserRuleReturnScope pID261 =null;

		CommonTree string_literal260_tree=null;
		RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }

			// interpreter/HLL1.g:339:2: ( 'all' -> ^( ALL ) | pID )
			int alt58=2;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==100) ) {
				alt58=1;
			}
			else if ( (LA58_0==Identifier) ) {
				alt58=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 58, 0, input);
				throw nvae;
			}

			switch (alt58) {
				case 1 :
					// interpreter/HLL1.g:339:4: 'all'
					{
					string_literal260=(Token)match(input,100,FOLLOW_100_in_receiver2342); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_100.add(string_literal260);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 339:10: -> ^( ALL )
					{
						// interpreter/HLL1.g:339:13: ^( ALL )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALL, "ALL"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// interpreter/HLL1.g:340:4: pID
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_pID_in_receiver2353);
					pID261=pID();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, pID261.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 67, receiver_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "receiver"


	public static class sender_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "sender"
	// interpreter/HLL1.g:343:1: sender : ( expression 'distinct processes' -> ^( DISTINCT_PROCESSES expression ) | pID );
	public final HLL1Parser.sender_return sender() throws RecognitionException {
		HLL1Parser.sender_return retval = new HLL1Parser.sender_return();
		retval.start = input.LT(1);
		int sender_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal263=null;
		ParserRuleReturnScope expression262 =null;
		ParserRuleReturnScope pID264 =null;

		CommonTree string_literal263_tree=null;
		RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }

			// interpreter/HLL1.g:344:2: ( expression 'distinct processes' -> ^( DISTINCT_PROCESSES expression ) | pID )
			int alt59=2;
			int LA59_0 = input.LA(1);
			if ( (LA59_0==BooleanLiteral||LA59_0==IntegerLiteral||LA59_0==53||LA59_0==57||(LA59_0 >= 61 && LA59_0 <= 62)||(LA59_0 >= 65 && LA59_0 <= 66)) ) {
				alt59=1;
			}
			else if ( (LA59_0==Identifier) ) {
				int LA59_2 = input.LA(2);
				if ( ((LA59_2 >= 54 && LA59_2 <= 56)||(LA59_2 >= 59 && LA59_2 <= 63)||(LA59_2 >= 65 && LA59_2 <= 68)||(LA59_2 >= 71 && LA59_2 <= 72)||(LA59_2 >= 75 && LA59_2 <= 80)||LA59_2==101||LA59_2==103||LA59_2==119) ) {
					alt59=1;
				}
				else if ( (LA59_2==73) ) {
					alt59=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 59, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 59, 0, input);
				throw nvae;
			}

			switch (alt59) {
				case 1 :
					// interpreter/HLL1.g:344:4: expression 'distinct processes'
					{
					pushFollow(FOLLOW_expression_in_sender2365);
					expression262=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression262.getTree());
					string_literal263=(Token)match(input,103,FOLLOW_103_in_sender2367); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_103.add(string_literal263);

					// AST REWRITE
					// elements: expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 344:36: -> ^( DISTINCT_PROCESSES expression )
					{
						// interpreter/HLL1.g:344:39: ^( DISTINCT_PROCESSES expression )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DISTINCT_PROCESSES, "DISTINCT_PROCESSES"), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// interpreter/HLL1.g:345:4: pID
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_pID_in_sender2380);
					pID264=pID();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, pID264.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 68, sender_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "sender"


	public static class pID_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "pID"
	// interpreter/HLL1.g:348:1: pID : Identifier ;
	public final HLL1Parser.pID_return pID() throws RecognitionException {
		HLL1Parser.pID_return retval = new HLL1Parser.pID_return();
		retval.start = input.LT(1);
		int pID_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier265=null;

		CommonTree Identifier265_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }

			// interpreter/HLL1.g:348:5: ( Identifier )
			// interpreter/HLL1.g:349:3: Identifier
			{
			root_0 = (CommonTree)adaptor.nil();


			Identifier265=(Token)match(input,Identifier,FOLLOW_Identifier_in_pID2393); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier265_tree = (CommonTree)adaptor.create(Identifier265);
			adaptor.addChild(root_0, Identifier265_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 69, pID_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "pID"


	public static class tuple_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "tuple"
	// interpreter/HLL1.g:351:1: tuple : '<' ! tuple_list '>' !;
	public final HLL1Parser.tuple_return tuple() throws RecognitionException {
		HLL1Parser.tuple_return retval = new HLL1Parser.tuple_return();
		retval.start = input.LT(1);
		int tuple_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal266=null;
		Token char_literal268=null;
		ParserRuleReturnScope tuple_list267 =null;

		CommonTree char_literal266_tree=null;
		CommonTree char_literal268_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }

			// interpreter/HLL1.g:352:2: ( '<' ! tuple_list '>' !)
			// interpreter/HLL1.g:352:4: '<' ! tuple_list '>' !
			{
			root_0 = (CommonTree)adaptor.nil();


			char_literal266=(Token)match(input,75,FOLLOW_75_in_tuple2403); if (state.failed) return retval;
			pushFollow(FOLLOW_tuple_list_in_tuple2406);
			tuple_list267=tuple_list();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, tuple_list267.getTree());

			char_literal268=(Token)match(input,79,FOLLOW_79_in_tuple2408); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 70, tuple_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "tuple"


	public static class tuple_list_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "tuple_list"
	// interpreter/HLL1.g:354:1: tuple_list : argument ( ',' argument )* -> ^( ARGUMENTS ( argument )+ ) ;
	public final HLL1Parser.tuple_list_return tuple_list() throws RecognitionException {
		HLL1Parser.tuple_list_return retval = new HLL1Parser.tuple_list_return();
		retval.start = input.LT(1);
		int tuple_list_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal270=null;
		ParserRuleReturnScope argument269 =null;
		ParserRuleReturnScope argument271 =null;

		CommonTree char_literal270_tree=null;
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleSubtreeStream stream_argument=new RewriteRuleSubtreeStream(adaptor,"rule argument");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }

			// interpreter/HLL1.g:355:2: ( argument ( ',' argument )* -> ^( ARGUMENTS ( argument )+ ) )
			// interpreter/HLL1.g:355:4: argument ( ',' argument )*
			{
			pushFollow(FOLLOW_argument_in_tuple_list2420);
			argument269=argument();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_argument.add(argument269.getTree());
			// interpreter/HLL1.g:355:13: ( ',' argument )*
			loop60:
			while (true) {
				int alt60=2;
				int LA60_0 = input.LA(1);
				if ( (LA60_0==64) ) {
					alt60=1;
				}

				switch (alt60) {
				case 1 :
					// interpreter/HLL1.g:355:14: ',' argument
					{
					char_literal270=(Token)match(input,64,FOLLOW_64_in_tuple_list2423); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_64.add(char_literal270);

					pushFollow(FOLLOW_argument_in_tuple_list2425);
					argument271=argument();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_argument.add(argument271.getTree());
					}
					break;

				default :
					break loop60;
				}
			}

			// AST REWRITE
			// elements: argument
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 356:2: -> ^( ARGUMENTS ( argument )+ )
			{
				// interpreter/HLL1.g:356:6: ^( ARGUMENTS ( argument )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGUMENTS, "ARGUMENTS"), root_1);
				if ( !(stream_argument.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_argument.hasNext() ) {
					adaptor.addChild(root_1, stream_argument.nextTree());
				}
				stream_argument.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 71, tuple_list_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "tuple_list"


	public static class argument_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "argument"
	// interpreter/HLL1.g:358:1: argument : argument_name ;
	public final HLL1Parser.argument_return argument() throws RecognitionException {
		HLL1Parser.argument_return retval = new HLL1Parser.argument_return();
		retval.start = input.LT(1);
		int argument_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope argument_name272 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }

			// interpreter/HLL1.g:359:2: ( argument_name )
			// interpreter/HLL1.g:359:7: argument_name
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_argument_name_in_argument2452);
			argument_name272=argument_name();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, argument_name272.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 72, argument_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "argument"


	public static class argument_name_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "argument_name"
	// interpreter/HLL1.g:361:1: argument_name : primary ;
	public final HLL1Parser.argument_name_return argument_name() throws RecognitionException {
		HLL1Parser.argument_name_return retval = new HLL1Parser.argument_name_return();
		retval.start = input.LT(1);
		int argument_name_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope primary273 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }

			// interpreter/HLL1.g:362:2: ( primary )
			// interpreter/HLL1.g:362:7: primary
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_primary_in_argument_name2466);
			primary273=primary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, primary273.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 73, argument_name_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "argument_name"


	public static class sendTuple_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "sendTuple"
	// interpreter/HLL1.g:364:1: sendTuple : '<' ! send_tuple_list '>' !;
	public final HLL1Parser.sendTuple_return sendTuple() throws RecognitionException {
		HLL1Parser.sendTuple_return retval = new HLL1Parser.sendTuple_return();
		retval.start = input.LT(1);
		int sendTuple_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal274=null;
		Token char_literal276=null;
		ParserRuleReturnScope send_tuple_list275 =null;

		CommonTree char_literal274_tree=null;
		CommonTree char_literal276_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }

			// interpreter/HLL1.g:365:2: ( '<' ! send_tuple_list '>' !)
			// interpreter/HLL1.g:365:4: '<' ! send_tuple_list '>' !
			{
			root_0 = (CommonTree)adaptor.nil();


			char_literal274=(Token)match(input,75,FOLLOW_75_in_sendTuple2477); if (state.failed) return retval;
			pushFollow(FOLLOW_send_tuple_list_in_sendTuple2480);
			send_tuple_list275=send_tuple_list();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, send_tuple_list275.getTree());

			char_literal276=(Token)match(input,79,FOLLOW_79_in_sendTuple2482); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 74, sendTuple_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "sendTuple"


	public static class send_tuple_list_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "send_tuple_list"
	// interpreter/HLL1.g:367:1: send_tuple_list : mtype ( ',' argument )* -> ^( ARGUMENTS mtype ( argument )* ) ;
	public final HLL1Parser.send_tuple_list_return send_tuple_list() throws RecognitionException {
		HLL1Parser.send_tuple_list_return retval = new HLL1Parser.send_tuple_list_return();
		retval.start = input.LT(1);
		int send_tuple_list_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal278=null;
		ParserRuleReturnScope mtype277 =null;
		ParserRuleReturnScope argument279 =null;

		CommonTree char_literal278_tree=null;
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleSubtreeStream stream_argument=new RewriteRuleSubtreeStream(adaptor,"rule argument");
		RewriteRuleSubtreeStream stream_mtype=new RewriteRuleSubtreeStream(adaptor,"rule mtype");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }

			// interpreter/HLL1.g:368:2: ( mtype ( ',' argument )* -> ^( ARGUMENTS mtype ( argument )* ) )
			// interpreter/HLL1.g:368:4: mtype ( ',' argument )*
			{
			pushFollow(FOLLOW_mtype_in_send_tuple_list2494);
			mtype277=mtype();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_mtype.add(mtype277.getTree());
			// interpreter/HLL1.g:368:10: ( ',' argument )*
			loop61:
			while (true) {
				int alt61=2;
				int LA61_0 = input.LA(1);
				if ( (LA61_0==64) ) {
					alt61=1;
				}

				switch (alt61) {
				case 1 :
					// interpreter/HLL1.g:368:11: ',' argument
					{
					char_literal278=(Token)match(input,64,FOLLOW_64_in_send_tuple_list2497); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_64.add(char_literal278);

					pushFollow(FOLLOW_argument_in_send_tuple_list2499);
					argument279=argument();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_argument.add(argument279.getTree());
					}
					break;

				default :
					break loop61;
				}
			}

			// AST REWRITE
			// elements: mtype, argument
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 369:2: -> ^( ARGUMENTS mtype ( argument )* )
			{
				// interpreter/HLL1.g:369:6: ^( ARGUMENTS mtype ( argument )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGUMENTS, "ARGUMENTS"), root_1);
				adaptor.addChild(root_1, stream_mtype.nextTree());
				// interpreter/HLL1.g:369:24: ( argument )*
				while ( stream_argument.hasNext() ) {
					adaptor.addChild(root_1, stream_argument.nextTree());
				}
				stream_argument.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 75, send_tuple_list_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "send_tuple_list"


	public static class literal_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "literal"
	// interpreter/HLL1.g:372:1: literal : ( BooleanLiteral | IntegerLiteral );
	public final HLL1Parser.literal_return literal() throws RecognitionException {
		HLL1Parser.literal_return retval = new HLL1Parser.literal_return();
		retval.start = input.LT(1);
		int literal_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set280=null;

		CommonTree set280_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }

			// interpreter/HLL1.g:373:2: ( BooleanLiteral | IntegerLiteral )
			// interpreter/HLL1.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set280=input.LT(1);
			if ( input.LA(1)==BooleanLiteral||input.LA(1)==IntegerLiteral ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set280));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 76, literal_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "literal"


	public static class type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "type"
	// interpreter/HLL1.g:377:1: type : ( PrimitiveType | enumType );
	public final HLL1Parser.type_return type() throws RecognitionException {
		HLL1Parser.type_return retval = new HLL1Parser.type_return();
		retval.start = input.LT(1);
		int type_StartIndex = input.index();

		CommonTree root_0 = null;

		Token PrimitiveType281=null;
		ParserRuleReturnScope enumType282 =null;

		CommonTree PrimitiveType281_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }

			// interpreter/HLL1.g:378:2: ( PrimitiveType | enumType )
			int alt62=2;
			int LA62_0 = input.LA(1);
			if ( (LA62_0==PrimitiveType) ) {
				alt62=1;
			}
			else if ( (LA62_0==Identifier) ) {
				alt62=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 62, 0, input);
				throw nvae;
			}

			switch (alt62) {
				case 1 :
					// interpreter/HLL1.g:378:4: PrimitiveType
					{
					root_0 = (CommonTree)adaptor.nil();


					PrimitiveType281=(Token)match(input,PrimitiveType,FOLLOW_PrimitiveType_in_type2542); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					PrimitiveType281_tree = (CommonTree)adaptor.create(PrimitiveType281);
					adaptor.addChild(root_0, PrimitiveType281_tree);
					}

					}
					break;
				case 2 :
					// interpreter/HLL1.g:379:4: enumType
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_enumType_in_type2547);
					enumType282=enumType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, enumType282.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 77, type_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "type"


	public static class mtype_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "mtype"
	// interpreter/HLL1.g:382:1: mtype : Identifier ;
	public final HLL1Parser.mtype_return mtype() throws RecognitionException {
		HLL1Parser.mtype_return retval = new HLL1Parser.mtype_return();
		retval.start = input.LT(1);
		int mtype_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier283=null;

		CommonTree Identifier283_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }

			// interpreter/HLL1.g:382:6: ( Identifier )
			// interpreter/HLL1.g:383:2: Identifier
			{
			root_0 = (CommonTree)adaptor.nil();


			Identifier283=(Token)match(input,Identifier,FOLLOW_Identifier_in_mtype2558); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier283_tree = (CommonTree)adaptor.create(Identifier283);
			adaptor.addChild(root_0, Identifier283_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 78, mtype_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "mtype"


	public static class enumType_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "enumType"
	// interpreter/HLL1.g:385:1: enumType : Identifier ;
	public final HLL1Parser.enumType_return enumType() throws RecognitionException {
		HLL1Parser.enumType_return retval = new HLL1Parser.enumType_return();
		retval.start = input.LT(1);
		int enumType_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Identifier284=null;

		CommonTree Identifier284_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }

			// interpreter/HLL1.g:385:9: ( Identifier )
			// interpreter/HLL1.g:386:2: Identifier
			{
			root_0 = (CommonTree)adaptor.nil();


			Identifier284=(Token)match(input,Identifier,FOLLOW_Identifier_in_enumType2567); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier284_tree = (CommonTree)adaptor.create(Identifier284);
			adaptor.addChild(root_0, Identifier284_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 79, enumType_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "enumType"

	// $ANTLR start synpred21_HLL1
	public final void synpred21_HLL1_fragment() throws RecognitionException {
		// interpreter/HLL1.g:101:4: ( variableInit ';' )
		// interpreter/HLL1.g:101:4: variableInit ';'
		{
		pushFollow(FOLLOW_variableInit_in_synpred21_HLL1640);
		variableInit();
		state._fsp--;
		if (state.failed) return;

		match(input,74,FOLLOW_74_in_synpred21_HLL1642); if (state.failed) return;

		}

	}
	// $ANTLR end synpred21_HLL1

	// $ANTLR start synpred48_HLL1
	public final void synpred48_HLL1_fragment() throws RecognitionException {
		// interpreter/HLL1.g:159:38: ( else_statement )
		// interpreter/HLL1.g:159:38: else_statement
		{
		pushFollow(FOLLOW_else_statement_in_synpred48_HLL11067);
		else_statement();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred48_HLL1

	// $ANTLR start synpred50_HLL1
	public final void synpred50_HLL1_fragment() throws RecognitionException {
		// interpreter/HLL1.g:173:5: ( forInit '..' expression )
		// interpreter/HLL1.g:173:5: forInit '..' expression
		{
		pushFollow(FOLLOW_forInit_in_synpred50_HLL11186);
		forInit();
		state._fsp--;
		if (state.failed) return;

		match(input,69,FOLLOW_69_in_synpred50_HLL11188); if (state.failed) return;

		pushFollow(FOLLOW_expression_in_synpred50_HLL11190);
		expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred50_HLL1

	// Delegated rules

	public final boolean synpred48_HLL1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred48_HLL1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred50_HLL1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred50_HLL1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred21_HLL1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred21_HLL1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_algorithm_in_algorithm_toString358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declarationBlock_in_algorithm368 = new BitSet(new long[]{0x0000000000000000L,0x000E0000007E0000L});
	public static final BitSet FOLLOW_initialBlock_in_algorithm370 = new BitSet(new long[]{0x0000000000000000L,0x21000000B8000000L});
	public static final BitSet FOLLOW_receiveBlock_in_algorithm372 = new BitSet(new long[]{0x0000000000000000L,0x20000000A0000000L});
	public static final BitSet FOLLOW_stepBlock_in_algorithm375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_97_in_declarationBlock387 = new BitSet(new long[]{0x0000004010000002L,0x0000020040000200L});
	public static final BitSet FOLLOW_128_in_declarationBlock391 = new BitSet(new long[]{0x0000004010000002L,0x0000020040000200L});
	public static final BitSet FOLLOW_96_in_declarationBlock395 = new BitSet(new long[]{0x0000004010000002L,0x0000020040000200L});
	public static final BitSet FOLLOW_73_in_declarationBlock398 = new BitSet(new long[]{0x0000004010000002L,0x0000020040000000L});
	public static final BitSet FOLLOW_declaration_in_declarationBlock401 = new BitSet(new long[]{0x0000004010000002L,0x0000020040000000L});
	public static final BitSet FOLLOW_variableDeclaration_in_declaration421 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_74_in_declaration423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enumDeclaration_in_declaration429 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_74_in_declaration431 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_setDeclaration_in_declaration437 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_74_in_declaration439 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_variableDeclaration451 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_Identifier_in_variableDeclaration453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_setDeclaration473 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_Identifier_in_setDeclaration475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_105_in_enumDeclaration493 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_Identifier_in_enumDeclaration497 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_enumBody_in_enumDeclaration499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_129_in_enumBody520 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_enumMemberDeclarations_in_enumBody524 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L,0x0000000000000004L});
	public static final BitSet FOLLOW_64_in_enumBody526 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_130_in_enumBody534 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enumMemberDeclaration_in_enumMemberDeclarations546 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_enumMemberDeclarations549 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_enumMemberDeclaration_in_enumMemberDeclarations552 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_Identifier_in_enumMemberDeclaration571 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_84_in_initialBlock583 = new BitSet(new long[]{0x6220000030000202L,0x0420D80000000606L,0x0000000000000002L});
	public static final BitSet FOLLOW_113_in_initialBlock587 = new BitSet(new long[]{0x6220000030000202L,0x0420D80000000606L,0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_initialBlock591 = new BitSet(new long[]{0x6220000030000202L,0x0420D80000000606L,0x0000000000000002L});
	public static final BitSet FOLLOW_85_in_initialBlock594 = new BitSet(new long[]{0x6220000030000202L,0x0420D80000000606L,0x0000000000000002L});
	public static final BitSet FOLLOW_86_in_initialBlock598 = new BitSet(new long[]{0x6220000030000202L,0x0420D80000000606L,0x0000000000000002L});
	public static final BitSet FOLLOW_114_in_initialBlock602 = new BitSet(new long[]{0x6220000030000202L,0x0420D80000000606L,0x0000000000000002L});
	public static final BitSet FOLLOW_115_in_initialBlock605 = new BitSet(new long[]{0x6220000030000202L,0x0420D80000000606L,0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_initialBlock609 = new BitSet(new long[]{0x6220000030000202L,0x0420D80000000606L,0x0000000000000002L});
	public static final BitSet FOLLOW_83_in_initialBlock613 = new BitSet(new long[]{0x6220000030000202L,0x0420D80000000606L,0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_initialBlock616 = new BitSet(new long[]{0x6220000030000202L,0x0420D80000000406L,0x0000000000000002L});
	public static final BitSet FOLLOW_initialization_in_initialBlock619 = new BitSet(new long[]{0x6220000030000202L,0x0420D80000000406L,0x0000000000000002L});
	public static final BitSet FOLLOW_variableInit_in_initialization640 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_74_in_initialization642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_initialization648 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_variableInit661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_77_in_variableInit663 = new BitSet(new long[]{0x0000000030000200L,0x0000000407800000L});
	public static final BitSet FOLLOW_variableValue_in_variableInit665 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_89_in_variableValue689 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_87_in_variableValue693 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_90_in_variableValue705 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_88_in_variableValue709 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_detValue_in_variableValue723 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_98_in_variableValue728 = new BitSet(new long[]{0x0000000030000200L});
	public static final BitSet FOLLOW_nondetValue_in_variableValue731 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_99_in_variableValue733 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_variableValue736 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_access_invocation_in_variableValue739 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_detValue_in_nondetValue751 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_nondetValue754 = new BitSet(new long[]{0x0000000030000200L});
	public static final BitSet FOLLOW_detValue_in_nondetValue756 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_detValue_in_nondetValue775 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_69_in_nondetValue777 = new BitSet(new long[]{0x0000000030000200L});
	public static final BitSet FOLLOW_detValue_in_nondetValue779 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_detValue_in_nondetValue786 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_70_in_nondetValue788 = new BitSet(new long[]{0x0000000030000200L});
	public static final BitSet FOLLOW_detValue_in_nondetValue790 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_detValue816 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_detValue821 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_92_in_receiveBlock835 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000200L});
	public static final BitSet FOLLOW_120_in_receiveBlock839 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000200L});
	public static final BitSet FOLLOW_91_in_receiveBlock843 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000200L});
	public static final BitSet FOLLOW_73_in_receiveBlock846 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
	public static final BitSet FOLLOW_received_in_receiveBlock849 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
	public static final BitSet FOLLOW_95_in_stepBlock871 = new BitSet(new long[]{0x6220000030000202L,0x0420D80000000606L,0x0000000000000002L});
	public static final BitSet FOLLOW_125_in_stepBlock875 = new BitSet(new long[]{0x6220000030000202L,0x0420D80000000606L,0x0000000000000002L});
	public static final BitSet FOLLOW_93_in_stepBlock879 = new BitSet(new long[]{0x6220000030000202L,0x0420D80000000606L,0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_stepBlock882 = new BitSet(new long[]{0x6220000030000202L,0x0420D80000000406L,0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_stepBlock885 = new BitSet(new long[]{0x6220000030000202L,0x0420D80000000406L,0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_statement916 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_110_in_statement924 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_74_in_statement926 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sendTo_in_statement938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_74_in_statement940 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_statement_in_statement951 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_for_statement_in_statement959 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_local_variable_in_statement967 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_statement977 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_statement988 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_74_in_statement990 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_129_in_block1009 = new BitSet(new long[]{0x6220000030000200L,0x0420D80000000406L,0x0000000000000006L});
	public static final BitSet FOLLOW_statement_list_in_block1011 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_130_in_block1014 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statement_list1042 = new BitSet(new long[]{0x6220000030000202L,0x0420D80000000406L,0x0000000000000002L});
	public static final BitSet FOLLOW_111_in_if_statement1059 = new BitSet(new long[]{0x6220000030000200L,0x0000000000000006L});
	public static final BitSet FOLLOW_expression_in_if_statement1061 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_126_in_if_statement1063 = new BitSet(new long[]{0x6220000030000200L,0x0420D80000000406L,0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_if_statement1065 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
	public static final BitSet FOLLOW_else_statement_in_if_statement1067 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_104_in_else_statement1102 = new BitSet(new long[]{0x6220000030000200L,0x0420D80000000406L,0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_else_statement1104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_107_in_for_statement1129 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_for_statement1131 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_forControl_in_for_statement1133 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_for_statement1135 = new BitSet(new long[]{0x6220000030000200L,0x0420D80000000406L,0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_for_statement1137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_108_in_for_statement1152 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_foreachControl_in_for_statement1154 = new BitSet(new long[]{0x6220000030000200L,0x0420D80000000406L,0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_for_statement1156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forInit_in_forControl1186 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_69_in_forControl1188 = new BitSet(new long[]{0x6220000030000200L,0x0000000000000006L});
	public static final BitSet FOLLOW_expression_in_forControl1190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forInit_in_forControl1196 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_70_in_forControl1198 = new BitSet(new long[]{0x6220000030000200L,0x0000000000000006L});
	public static final BitSet FOLLOW_expression_in_forControl1200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_forInit1223 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
	public static final BitSet FOLLOW_77_in_forInit1226 = new BitSet(new long[]{0x6220000030000200L,0x0000000000000006L});
	public static final BitSet FOLLOW_expression_in_forInit1229 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_117_in_local_variable1241 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_tuple_signatur_list_in_local_variable1243 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_77_in_local_variable1245 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_access_set_invocation_in_local_variable1247 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_anonymous_function_signature_in_foreachControl1266 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_112_in_foreachControl1268 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_set_invocation_in_foreachControl1270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_set_invocation1293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_filter_set_invocation_in_set_invocation1306 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_expression_set_invocation1324 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_expression_set_invocation1326 = new BitSet(new long[]{0x0000000000000000L,0x0800004000000000L});
	public static final BitSet FOLLOW_expression_invocation_in_expression_set_invocation1329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_filter_expression_invocation_in_expression_set_invocation1334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_102_in_expression_invocation1345 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_expression_invocation1347 = new BitSet(new long[]{0x0000000030000200L,0x0000000000000800L});
	public static final BitSet FOLLOW_setArgument_in_expression_invocation1349 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_expression_invocation1351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_123_in_expression_invocation1364 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_operational_set_invocation1380 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_operational_set_invocation1382 = new BitSet(new long[]{0x0000000000000000L,0x0210000000000000L});
	public static final BitSet FOLLOW_operational_invocation_in_operational_set_invocation1385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_116_in_operational_invocation1396 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_operational_invocation1398 = new BitSet(new long[]{0x0000000030000200L,0x0000000000000800L});
	public static final BitSet FOLLOW_setArgument_in_operational_invocation1400 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_operational_invocation1402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_121_in_operational_invocation1415 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_operational_invocation1417 = new BitSet(new long[]{0x0000000030000200L,0x0000000000000800L});
	public static final BitSet FOLLOW_setArgument_in_operational_invocation1419 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_operational_invocation1421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_access_set_invocation1438 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_access_set_invocation1440 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_access_invocation_in_access_set_invocation1443 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_124_in_access_invocation1454 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_access_invocation1456 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_access_invocation1458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_124_in_access_invocation1467 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_access_invocation1469 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_lambda_expression_in_access_invocation1471 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_access_invocation1473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_filter_set_invocation1491 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_filter_set_invocation1493 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_filter_invocation_in_filter_set_invocation1496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_filter_set_invocation_in_filter_expression_invocation1507 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_filter_expression_invocation1509 = new BitSet(new long[]{0x0000000000000000L,0x0800004000000000L});
	public static final BitSet FOLLOW_expression_invocation_in_filter_expression_invocation1512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_106_in_filter_invocation1521 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_filter_invocation1523 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_lambda_expression_in_filter_invocation1525 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_filter_invocation1527 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_anonymous_function_signature_in_lambda_expression1547 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_lambda_expression1549 = new BitSet(new long[]{0x6220000030000200L,0x0000000000000006L});
	public static final BitSet FOLLOW_anonymous_function_body_in_lambda_expression1551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_anonymous_function_signature1573 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tuple_signatur_in_anonymous_function_signature1578 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_receive_anonymous_function_signature1589 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_receive_tuple_signatur_in_receive_anonymous_function_signature1594 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_75_in_tuple_signatur1605 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_tuple_signatur_list_in_tuple_signatur1608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_tuple_signatur1610 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_75_in_receive_tuple_signatur1622 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_receive_tuple_signatur_list_in_receive_tuple_signatur1625 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_receive_tuple_signatur1627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_tuple_signatur_list1639 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_tuple_signatur_list1642 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_Identifier_in_tuple_signatur_list1644 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_Identifier_in_receive_tuple_signatur_list1668 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_receive_tuple_signatur_list1671 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_Identifier_in_receive_tuple_signatur_list1673 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_anonymous_function_body1696 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_argument_in_setArgument1706 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tuple_in_setArgument1711 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditional_or_expression_in_expression1723 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_expression1731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_assignment1744 = new BitSet(new long[]{0x9100000000000000L,0x0000000000002108L});
	public static final BitSet FOLLOW_assignment_operator_in_assignment1746 = new BitSet(new long[]{0x6220000030000200L,0x0000000000000006L});
	public static final BitSet FOLLOW_expression_in_assignment1749 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_unary_expression1760 = new BitSet(new long[]{0x0200000030000200L});
	public static final BitSet FOLLOW_primary_expression_in_unary_expression1764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_unary_expression1783 = new BitSet(new long[]{0x0200000030000200L});
	public static final BitSet FOLLOW_primary_expression_in_unary_expression1787 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_unary_expression1805 = new BitSet(new long[]{0x0200000030000200L});
	public static final BitSet FOLLOW_primary_expression_in_unary_expression1809 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pre_increment_expression_in_unary_expression1827 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pre_decrement_expression_in_unary_expression1835 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_unary_expression1843 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_unary_expression1845 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_unary_expression1863 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_unary_expression1865 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_expression_in_unary_expression1883 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_set_invocation_in_primary_expression1893 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operational_set_invocation_in_primary_expression1898 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paren_expression_in_primary_expression1906 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_in_primary_expression1915 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_primary1937 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_primary1942 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_paren_expression1956 = new BitSet(new long[]{0x6220000030000200L,0x0000000000000006L});
	public static final BitSet FOLLOW_expression_in_paren_expression1961 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_paren_expression1965 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_pre_increment_expression2011 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_Identifier_in_pre_increment_expression2013 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_66_in_pre_decrement_expression2035 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_Identifier_in_pre_decrement_expression2037 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_variable_reference2059 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_expression_in_multiplicative_expression2075 = new BitSet(new long[]{0x0880000000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_59_in_multiplicative_expression2079 = new BitSet(new long[]{0x6220000030000200L,0x0000000000000006L});
	public static final BitSet FOLLOW_71_in_multiplicative_expression2082 = new BitSet(new long[]{0x6220000030000200L,0x0000000000000006L});
	public static final BitSet FOLLOW_55_in_multiplicative_expression2085 = new BitSet(new long[]{0x6220000030000200L,0x0000000000000006L});
	public static final BitSet FOLLOW_unary_expression_in_multiplicative_expression2091 = new BitSet(new long[]{0x0880000000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression2109 = new BitSet(new long[]{0x2000000000000002L,0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_additive_expression2113 = new BitSet(new long[]{0x6220000030000200L,0x0000000000000006L});
	public static final BitSet FOLLOW_65_in_additive_expression2116 = new BitSet(new long[]{0x6220000030000200L,0x0000000000000006L});
	public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression2122 = new BitSet(new long[]{0x2000000000000002L,0x0000000000000002L});
	public static final BitSet FOLLOW_additive_expression_in_relational_expression2137 = new BitSet(new long[]{0x0000000000000002L,0x0000000000019800L});
	public static final BitSet FOLLOW_75_in_relational_expression2141 = new BitSet(new long[]{0x6220000030000200L,0x0000000000000006L});
	public static final BitSet FOLLOW_79_in_relational_expression2144 = new BitSet(new long[]{0x6220000030000200L,0x0000000000000006L});
	public static final BitSet FOLLOW_76_in_relational_expression2147 = new BitSet(new long[]{0x6220000030000200L,0x0000000000000006L});
	public static final BitSet FOLLOW_80_in_relational_expression2150 = new BitSet(new long[]{0x6220000030000200L,0x0000000000000006L});
	public static final BitSet FOLLOW_additive_expression_in_relational_expression2154 = new BitSet(new long[]{0x0000000000000002L,0x0000000000019800L});
	public static final BitSet FOLLOW_relational_expression_in_equality_expression2172 = new BitSet(new long[]{0x0040000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_equality_expression2177 = new BitSet(new long[]{0x6220000030000200L,0x0000000000000006L});
	public static final BitSet FOLLOW_54_in_equality_expression2180 = new BitSet(new long[]{0x6220000030000200L,0x0000000000000006L});
	public static final BitSet FOLLOW_relational_expression_in_equality_expression2186 = new BitSet(new long[]{0x0040000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_equality_expression_in_conditional_and_expression2204 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
	public static final BitSet FOLLOW_101_in_conditional_and_expression2209 = new BitSet(new long[]{0x6220000030000200L,0x0000000000000006L});
	public static final BitSet FOLLOW_equality_expression_in_conditional_and_expression2214 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
	public static final BitSet FOLLOW_conditional_and_expression_in_conditional_or_expression2232 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L});
	public static final BitSet FOLLOW_119_in_conditional_or_expression2236 = new BitSet(new long[]{0x6220000030000200L,0x0000000000000006L});
	public static final BitSet FOLLOW_conditional_and_expression_in_conditional_or_expression2241 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L});
	public static final BitSet FOLLOW_sendTo_in_message2265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_received_in_message2270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_122_in_sendTo2282 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_sendTuple_in_sendTo2284 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_127_in_sendTo2286 = new BitSet(new long[]{0x0000000010000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_receiver_in_sendTo2288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_118_in_received2308 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_receive_anonymous_function_signature_in_received2310 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_109_in_received2312 = new BitSet(new long[]{0x6220000030000200L,0x0000000000000006L});
	public static final BitSet FOLLOW_sender_in_received2314 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_received2316 = new BitSet(new long[]{0x6220000030000200L,0x0420D80000000406L,0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_received2318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_100_in_receiver2342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pID_in_receiver2353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_sender2365 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_103_in_sender2367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pID_in_sender2380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_pID2393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_75_in_tuple2403 = new BitSet(new long[]{0x0000000030000200L});
	public static final BitSet FOLLOW_tuple_list_in_tuple2406 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_tuple2408 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_argument_in_tuple_list2420 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_tuple_list2423 = new BitSet(new long[]{0x0000000030000200L});
	public static final BitSet FOLLOW_argument_in_tuple_list2425 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_argument_name_in_argument2452 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_in_argument_name2466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_75_in_sendTuple2477 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_send_tuple_list_in_sendTuple2480 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_sendTuple2482 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mtype_in_send_tuple_list2494 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_send_tuple_list2497 = new BitSet(new long[]{0x0000000030000200L});
	public static final BitSet FOLLOW_argument_in_send_tuple_list2499 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_PrimitiveType_in_type2542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enumType_in_type2547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_mtype2558 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_enumType2567 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableInit_in_synpred21_HLL1640 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_74_in_synpred21_HLL1642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_else_statement_in_synpred48_HLL11067 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forInit_in_synpred50_HLL11186 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_69_in_synpred50_HLL11188 = new BitSet(new long[]{0x6220000030000200L,0x0000000000000006L});
	public static final BitSet FOLLOW_expression_in_synpred50_HLL11190 = new BitSet(new long[]{0x0000000000000002L});
}
