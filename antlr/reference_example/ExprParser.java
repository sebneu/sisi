package translation;
// $ANTLR 3.5 Expr.g 2013-04-05 19:55:47

import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class ExprParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "NEWLINE", "WS", 
		"'('", "')'", "'*'", "'+'", "'-'", "'='"
	};
	public static final int EOF=-1;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int ID=4;
	public static final int INT=5;
	public static final int NEWLINE=6;
	public static final int WS=7;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public ExprParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public ExprParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return ExprParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Expr.g"; }


	int numOps = 0;
	HashMap locals = new HashMap();
	int localVarNum = 1;


	public static class prog_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "prog"
	// Expr.g:24:1: prog : ( stat )+ ;
	public final ExprParser.prog_return prog() throws RecognitionException {
		ExprParser.prog_return retval = new ExprParser.prog_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope stat1 =null;


		try {
			// Expr.g:24:5: ( ( stat )+ )
			// Expr.g:24:9: ( stat )+
			{
			root_0 = (CommonTree)adaptor.nil();


			// Expr.g:24:9: ( stat )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= ID && LA1_0 <= NEWLINE)||LA1_0==8) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Expr.g:24:9: stat
					{
					pushFollow(FOLLOW_stat_in_prog49);
					stat1=stat();
					state._fsp--;

					adaptor.addChild(root_0, stat1.getTree());

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "prog"


	public static class stat_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "stat"
	// Expr.g:26:1: stat : ( expr NEWLINE -> expr | ID '=' expr NEWLINE -> ^( '=' ID expr ) | NEWLINE ->);
	public final ExprParser.stat_return stat() throws RecognitionException {
		ExprParser.stat_return retval = new ExprParser.stat_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token NEWLINE3=null;
		Token ID4=null;
		Token char_literal5=null;
		Token NEWLINE7=null;
		Token NEWLINE8=null;
		ParserRuleReturnScope expr2 =null;
		ParserRuleReturnScope expr6 =null;

		CommonTree NEWLINE3_tree=null;
		CommonTree ID4_tree=null;
		CommonTree char_literal5_tree=null;
		CommonTree NEWLINE7_tree=null;
		CommonTree NEWLINE8_tree=null;
		RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_13=new RewriteRuleTokenStream(adaptor,"token 13");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// Expr.g:26:5: ( expr NEWLINE -> expr | ID '=' expr NEWLINE -> ^( '=' ID expr ) | NEWLINE ->)
			int alt2=3;
			switch ( input.LA(1) ) {
			case INT:
			case 8:
				{
				alt2=1;
				}
				break;
			case ID:
				{
				int LA2_2 = input.LA(2);
				if ( (LA2_2==13) ) {
					alt2=2;
				}
				else if ( (LA2_2==NEWLINE||(LA2_2 >= 10 && LA2_2 <= 12)) ) {
					alt2=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case NEWLINE:
				{
				alt2=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// Expr.g:26:9: expr NEWLINE
					{
					pushFollow(FOLLOW_expr_in_stat60);
					expr2=expr();
					state._fsp--;

					stream_expr.add(expr2.getTree());
					NEWLINE3=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_stat62);  
					stream_NEWLINE.add(NEWLINE3);

					// AST REWRITE
					// elements: expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 26:29: -> expr
					{
						adaptor.addChild(root_0, stream_expr.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Expr.g:27:9: ID '=' expr NEWLINE
					{
					ID4=(Token)match(input,ID,FOLLOW_ID_in_stat83);  
					stream_ID.add(ID4);

					char_literal5=(Token)match(input,13,FOLLOW_13_in_stat85);  
					stream_13.add(char_literal5);

					pushFollow(FOLLOW_expr_in_stat87);
					expr6=expr();
					state._fsp--;

					stream_expr.add(expr6.getTree());
					NEWLINE7=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_stat89);  
					stream_NEWLINE.add(NEWLINE7);


							if(locals.get((ID4!=null?ID4.getText():null))==null) {
								locals.put((ID4!=null?ID4.getText():null), new Integer(localVarNum++));
							}
							
					// AST REWRITE
					// elements: expr, 13, ID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 32:9: -> ^( '=' ID expr )
					{
						// Expr.g:32:12: ^( '=' ID expr )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_13.nextNode(), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// Expr.g:33:9: NEWLINE
					{
					NEWLINE8=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_stat117);  
					stream_NEWLINE.add(NEWLINE8);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 33:29: ->
					{
						root_0 = null;
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stat"


	public static class expr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// Expr.g:38:1: expr : multExpr ( ( '+' ^| '-' ^) multExpr )* ;
	public final ExprParser.expr_return expr() throws RecognitionException {
		ExprParser.expr_return retval = new ExprParser.expr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal10=null;
		Token char_literal11=null;
		ParserRuleReturnScope multExpr9 =null;
		ParserRuleReturnScope multExpr12 =null;

		CommonTree char_literal10_tree=null;
		CommonTree char_literal11_tree=null;

		try {
			// Expr.g:38:5: ( multExpr ( ( '+' ^| '-' ^) multExpr )* )
			// Expr.g:38:9: multExpr ( ( '+' ^| '-' ^) multExpr )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_multExpr_in_expr147);
			multExpr9=multExpr();
			state._fsp--;

			adaptor.addChild(root_0, multExpr9.getTree());

			// Expr.g:38:18: ( ( '+' ^| '-' ^) multExpr )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= 11 && LA4_0 <= 12)) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// Expr.g:38:19: ( '+' ^| '-' ^) multExpr
					{
					// Expr.g:38:19: ( '+' ^| '-' ^)
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==11) ) {
						alt3=1;
					}
					else if ( (LA3_0==12) ) {
						alt3=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 3, 0, input);
						throw nvae;
					}

					switch (alt3) {
						case 1 :
							// Expr.g:38:20: '+' ^
							{
							char_literal10=(Token)match(input,11,FOLLOW_11_in_expr151); 
							char_literal10_tree = (CommonTree)adaptor.create(char_literal10);
							root_0 = (CommonTree)adaptor.becomeRoot(char_literal10_tree, root_0);

							}
							break;
						case 2 :
							// Expr.g:38:25: '-' ^
							{
							char_literal11=(Token)match(input,12,FOLLOW_12_in_expr154); 
							char_literal11_tree = (CommonTree)adaptor.create(char_literal11);
							root_0 = (CommonTree)adaptor.becomeRoot(char_literal11_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_multExpr_in_expr158);
					multExpr12=multExpr();
					state._fsp--;

					adaptor.addChild(root_0, multExpr12.getTree());

					numOps++;
					}
					break;

				default :
					break loop4;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr"


	public static class multExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "multExpr"
	// Expr.g:41:1: multExpr : atom ( '*' ^ atom )* ;
	public final ExprParser.multExpr_return multExpr() throws RecognitionException {
		ExprParser.multExpr_return retval = new ExprParser.multExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal14=null;
		ParserRuleReturnScope atom13 =null;
		ParserRuleReturnScope atom15 =null;

		CommonTree char_literal14_tree=null;

		try {
			// Expr.g:42:5: ( atom ( '*' ^ atom )* )
			// Expr.g:42:9: atom ( '*' ^ atom )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_atom_in_multExpr182);
			atom13=atom();
			state._fsp--;

			adaptor.addChild(root_0, atom13.getTree());

			// Expr.g:42:14: ( '*' ^ atom )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==10) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// Expr.g:42:15: '*' ^ atom
					{
					char_literal14=(Token)match(input,10,FOLLOW_10_in_multExpr185); 
					char_literal14_tree = (CommonTree)adaptor.create(char_literal14);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal14_tree, root_0);

					pushFollow(FOLLOW_atom_in_multExpr188);
					atom15=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom15.getTree());

					numOps++;
					}
					break;

				default :
					break loop5;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multExpr"


	public static class atom_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// Expr.g:45:1: atom : ( INT | ID | '(' ! expr ')' !);
	public final ExprParser.atom_return atom() throws RecognitionException {
		ExprParser.atom_return retval = new ExprParser.atom_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INT16=null;
		Token ID17=null;
		Token char_literal18=null;
		Token char_literal20=null;
		ParserRuleReturnScope expr19 =null;

		CommonTree INT16_tree=null;
		CommonTree ID17_tree=null;
		CommonTree char_literal18_tree=null;
		CommonTree char_literal20_tree=null;

		try {
			// Expr.g:45:5: ( INT | ID | '(' ! expr ')' !)
			int alt6=3;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt6=1;
				}
				break;
			case ID:
				{
				alt6=2;
				}
				break;
			case 8:
				{
				alt6=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// Expr.g:45:9: INT
					{
					root_0 = (CommonTree)adaptor.nil();


					INT16=(Token)match(input,INT,FOLLOW_INT_in_atom207); 
					INT16_tree = (CommonTree)adaptor.create(INT16);
					adaptor.addChild(root_0, INT16_tree);

					}
					break;
				case 2 :
					// Expr.g:46:9: ID
					{
					root_0 = (CommonTree)adaptor.nil();


					ID17=(Token)match(input,ID,FOLLOW_ID_in_atom218); 
					ID17_tree = (CommonTree)adaptor.create(ID17);
					adaptor.addChild(root_0, ID17_tree);

					}
					break;
				case 3 :
					// Expr.g:47:9: '(' ! expr ')' !
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal18=(Token)match(input,8,FOLLOW_8_in_atom228); 
					pushFollow(FOLLOW_expr_in_atom231);
					expr19=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr19.getTree());

					char_literal20=(Token)match(input,9,FOLLOW_9_in_atom233); 
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atom"

	// Delegated rules



	public static final BitSet FOLLOW_stat_in_prog49 = new BitSet(new long[]{0x0000000000000172L});
	public static final BitSet FOLLOW_expr_in_stat60 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_NEWLINE_in_stat62 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_stat83 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_stat85 = new BitSet(new long[]{0x0000000000000130L});
	public static final BitSet FOLLOW_expr_in_stat87 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_NEWLINE_in_stat89 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEWLINE_in_stat117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_expr147 = new BitSet(new long[]{0x0000000000001802L});
	public static final BitSet FOLLOW_11_in_expr151 = new BitSet(new long[]{0x0000000000000130L});
	public static final BitSet FOLLOW_12_in_expr154 = new BitSet(new long[]{0x0000000000000130L});
	public static final BitSet FOLLOW_multExpr_in_expr158 = new BitSet(new long[]{0x0000000000001802L});
	public static final BitSet FOLLOW_atom_in_multExpr182 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_multExpr185 = new BitSet(new long[]{0x0000000000000130L});
	public static final BitSet FOLLOW_atom_in_multExpr188 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_INT_in_atom207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom218 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_8_in_atom228 = new BitSet(new long[]{0x0000000000000130L});
	public static final BitSet FOLLOW_expr_in_atom231 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_atom233 = new BitSet(new long[]{0x0000000000000002L});
}
