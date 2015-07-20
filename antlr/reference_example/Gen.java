package translation;
// $ANTLR 3.5 Gen.g 2013-04-05 19:55:51

import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
@SuppressWarnings("all")
public class Gen extends TreeParser {
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
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public Gen(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public Gen(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected StringTemplateGroup templateLib =
	  new StringTemplateGroup("GenTemplates", AngleBracketTemplateLexer.class);

	public void setTemplateLib(StringTemplateGroup templateLib) {
	  this.templateLib = templateLib;
	}
	public StringTemplateGroup getTemplateLib() {
	  return templateLib;
	}
	/** allows convenient multi-value initialization:
	 *  "new STAttrMap().put(...).put(...)"
	 */
	@SuppressWarnings("serial")
	public static class STAttrMap extends HashMap<String, Object> {
		public STAttrMap put(String attrName, Object value) {
			super.put(attrName, value);
			return this;
		}
	}
	@Override public String[] getTokenNames() { return Gen.tokenNames; }
	@Override public String getGrammarFileName() { return "Gen.g"; }


	/** Points at locals table built by the parser */
	HashMap locals;


	public static class prog_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "prog"
	// Gen.g:27:1: prog[int numOps, HashMap locals] : (s+= stat )+ -> jasminFile(instructions=$smaxStackDepth=numOps+1+1maxLocals=locals.size()+1);
	public final Gen.prog_return prog(int numOps, HashMap locals) throws RecognitionException {
		Gen.prog_return retval = new Gen.prog_return();
		retval.start = input.LT(1);

		List<Object> list_s=null;
		RuleReturnScope s = null;

		this.locals = locals; // point at map created in parser

		try {
			// Gen.g:31:5: ( (s+= stat )+ -> jasminFile(instructions=$smaxStackDepth=numOps+1+1maxLocals=locals.size()+1))
			// Gen.g:31:9: (s+= stat )+
			{
			// Gen.g:31:9: (s+= stat )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= ID && LA1_0 <= INT)||(LA1_0 >= 10 && LA1_0 <= 13)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Gen.g:31:10: s+= stat
					{
					pushFollow(FOLLOW_stat_in_prog79);
					s=stat();
					state._fsp--;

					if (list_s==null) list_s=new ArrayList<Object>();
					list_s.add(s.getTemplate());
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			// TEMPLATE REWRITE
			// 31:20: -> jasminFile(instructions=$smaxStackDepth=numOps+1+1maxLocals=locals.size()+1)
			{
				retval.st = templateLib.getInstanceOf("jasminFile",new STAttrMap().put("instructions", list_s).put("maxStackDepth", numOps+1+1).put("maxLocals", locals.size()+1));
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
		return retval;
	}
	// $ANTLR end "prog"


	public static class stat_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "stat"
	// Gen.g:38:1: stat : ( expr -> exprStat(v=$expr.stdescr=$expr.text)| ^( '=' ID expr ) -> assign(id=$ID.textdescr=$textvarNum=locals.get($ID.text)v=$expr.st));
	public final Gen.stat_return stat() throws RecognitionException {
		Gen.stat_return retval = new Gen.stat_return();
		retval.start = input.LT(1);

		CommonTree ID2=null;
		TreeRuleReturnScope expr1 =null;
		TreeRuleReturnScope expr3 =null;

		try {
			// Gen.g:38:5: ( expr -> exprStat(v=$expr.stdescr=$expr.text)| ^( '=' ID expr ) -> assign(id=$ID.textdescr=$textvarNum=locals.get($ID.text)v=$expr.st))
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( ((LA2_0 >= ID && LA2_0 <= INT)||(LA2_0 >= 10 && LA2_0 <= 12)) ) {
				alt2=1;
			}
			else if ( (LA2_0==13) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// Gen.g:38:9: expr
					{
					pushFollow(FOLLOW_expr_in_stat182);
					expr1=expr();
					state._fsp--;

					// TEMPLATE REWRITE
					// 38:14: -> exprStat(v=$expr.stdescr=$expr.text)
					{
						retval.st = templateLib.getInstanceOf("exprStat",new STAttrMap().put("v", (expr1!=null?((StringTemplate)expr1.getTemplate()):null)).put("descr", (expr1!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(expr1.start),input.getTreeAdaptor().getTokenStopIndex(expr1.start))):null)));
					}



					}
					break;
				case 2 :
					// Gen.g:39:9: ^( '=' ID expr )
					{
					match(input,13,FOLLOW_13_in_stat207); 
					match(input, Token.DOWN, null); 
					ID2=(CommonTree)match(input,ID,FOLLOW_ID_in_stat209); 
					pushFollow(FOLLOW_expr_in_stat211);
					expr3=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 40:9: -> assign(id=$ID.textdescr=$textvarNum=locals.get($ID.text)v=$expr.st)
					{
						retval.st = templateLib.getInstanceOf("assign",new STAttrMap().put("id", (ID2!=null?ID2.getText():null)).put("descr", input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(retval.start),input.getTreeAdaptor().getTokenStopIndex(retval.start))).put("varNum", locals.get((ID2!=null?ID2.getText():null))).put("v", (expr3!=null?((StringTemplate)expr3.getTemplate()):null)));
					}



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
		return retval;
	}
	// $ANTLR end "stat"


	public static class expr_return extends TreeRuleReturnScope {
		public int value;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "expr"
	// Gen.g:48:1: expr returns [int value] : ( ^( '+' a= expr b= expr ) -> add(a=$a.stb=$b.st)| ^( '-' a= expr b= expr ) -> sub(a=$a.stb=$b.st)| ^( '*' a= expr b= expr ) -> mult(a=$a.stb=$b.st)| INT -> int(v=$INT.text)| ID -> var(id=$ID.textvarNum=locals.get($ID.text)));
	public final Gen.expr_return expr() throws RecognitionException {
		Gen.expr_return retval = new Gen.expr_return();
		retval.start = input.LT(1);

		CommonTree INT4=null;
		CommonTree ID5=null;
		TreeRuleReturnScope a =null;
		TreeRuleReturnScope b =null;

		try {
			// Gen.g:49:5: ( ^( '+' a= expr b= expr ) -> add(a=$a.stb=$b.st)| ^( '-' a= expr b= expr ) -> sub(a=$a.stb=$b.st)| ^( '*' a= expr b= expr ) -> mult(a=$a.stb=$b.st)| INT -> int(v=$INT.text)| ID -> var(id=$ID.textvarNum=locals.get($ID.text)))
			int alt3=5;
			switch ( input.LA(1) ) {
			case 11:
				{
				alt3=1;
				}
				break;
			case 12:
				{
				alt3=2;
				}
				break;
			case 10:
				{
				alt3=3;
				}
				break;
			case INT:
				{
				alt3=4;
				}
				break;
			case ID:
				{
				alt3=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// Gen.g:49:9: ^( '+' a= expr b= expr )
					{
					match(input,11,FOLLOW_11_in_expr324); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr328);
					a=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr332);
					b=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 49:30: -> add(a=$a.stb=$b.st)
					{
						retval.st = templateLib.getInstanceOf("add",new STAttrMap().put("a", (a!=null?((StringTemplate)a.getTemplate()):null)).put("b", (b!=null?((StringTemplate)b.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// Gen.g:50:9: ^( '-' a= expr b= expr )
					{
					match(input,12,FOLLOW_12_in_expr357); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr361);
					a=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr365);
					b=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 50:30: -> sub(a=$a.stb=$b.st)
					{
						retval.st = templateLib.getInstanceOf("sub",new STAttrMap().put("a", (a!=null?((StringTemplate)a.getTemplate()):null)).put("b", (b!=null?((StringTemplate)b.getTemplate()):null)));
					}



					}
					break;
				case 3 :
					// Gen.g:51:9: ^( '*' a= expr b= expr )
					{
					match(input,10,FOLLOW_10_in_expr390); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr394);
					a=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr398);
					b=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 51:30: -> mult(a=$a.stb=$b.st)
					{
						retval.st = templateLib.getInstanceOf("mult",new STAttrMap().put("a", (a!=null?((StringTemplate)a.getTemplate()):null)).put("b", (b!=null?((StringTemplate)b.getTemplate()):null)));
					}



					}
					break;
				case 4 :
					// Gen.g:52:7: INT
					{
					INT4=(CommonTree)match(input,INT,FOLLOW_INT_in_expr420); 
					// TEMPLATE REWRITE
					// 52:11: -> int(v=$INT.text)
					{
						retval.st = templateLib.getInstanceOf("int",new STAttrMap().put("v", (INT4!=null?INT4.getText():null)));
					}



					}
					break;
				case 5 :
					// Gen.g:53:9: ID
					{
					ID5=(CommonTree)match(input,ID,FOLLOW_ID_in_expr439); 
					// TEMPLATE REWRITE
					// 53:13: -> var(id=$ID.textvarNum=locals.get($ID.text))
					{
						retval.st = templateLib.getInstanceOf("var",new STAttrMap().put("id", (ID5!=null?ID5.getText():null)).put("varNum", locals.get((ID5!=null?ID5.getText():null))));
					}



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
		return retval;
	}
	// $ANTLR end "expr"

	// Delegated rules



	public static final BitSet FOLLOW_stat_in_prog79 = new BitSet(new long[]{0x0000000000003C32L});
	public static final BitSet FOLLOW_expr_in_stat182 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_stat207 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_stat209 = new BitSet(new long[]{0x0000000000001C30L});
	public static final BitSet FOLLOW_expr_in_stat211 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_11_in_expr324 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr328 = new BitSet(new long[]{0x0000000000001C30L});
	public static final BitSet FOLLOW_expr_in_expr332 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_12_in_expr357 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr361 = new BitSet(new long[]{0x0000000000001C30L});
	public static final BitSet FOLLOW_expr_in_expr365 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_10_in_expr390 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr394 = new BitSet(new long[]{0x0000000000001C30L});
	public static final BitSet FOLLOW_expr_in_expr398 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INT_in_expr420 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr439 = new BitSet(new long[]{0x0000000000000002L});
}
