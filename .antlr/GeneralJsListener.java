// Generated from c:/Users/Usuario/Desktop/1UTN/Sintaxis/tp4e5/GeneralJs.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GeneralJsParser}.
 */
public interface GeneralJsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GeneralJsParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(GeneralJsParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneralJsParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(GeneralJsParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneralJsParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(GeneralJsParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneralJsParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(GeneralJsParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneralJsParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(GeneralJsParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneralJsParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(GeneralJsParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneralJsParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(GeneralJsParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneralJsParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(GeneralJsParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneralJsParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(GeneralJsParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneralJsParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(GeneralJsParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneralJsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(GeneralJsParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneralJsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(GeneralJsParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneralJsParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(GeneralJsParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneralJsParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(GeneralJsParser.OpContext ctx);
}