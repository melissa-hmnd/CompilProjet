// Generated from C:/Users/Melissa/IdeaProjects/Projet_compil/src\LT.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LTParser}.
 */
public interface LTListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LTParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(LTParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(LTParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(LTParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(LTParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDec(LTParser.DecContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDec(LTParser.DecContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(LTParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(LTParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(LTParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(LTParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTParser#aff}.
	 * @param ctx the parse tree
	 */
	void enterAff(LTParser.AffContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTParser#aff}.
	 * @param ctx the parse tree
	 */
	void exitAff(LTParser.AffContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(LTParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(LTParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTParser#complicated}.
	 * @param ctx the parse tree
	 */
	void enterComplicated(LTParser.ComplicatedContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTParser#complicated}.
	 * @param ctx the parse tree
	 */
	void exitComplicated(LTParser.ComplicatedContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTParser#pm}.
	 * @param ctx the parse tree
	 */
	void enterPm(LTParser.PmContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTParser#pm}.
	 * @param ctx the parse tree
	 */
	void exitPm(LTParser.PmContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTParser#md}.
	 * @param ctx the parse tree
	 */
	void enterMd(LTParser.MdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTParser#md}.
	 * @param ctx the parse tree
	 */
	void exitMd(LTParser.MdContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTParser#fex}.
	 * @param ctx the parse tree
	 */
	void enterFex(LTParser.FexContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTParser#fex}.
	 * @param ctx the parse tree
	 */
	void exitFex(LTParser.FexContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(LTParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(LTParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTParser#listeinst}.
	 * @param ctx the parse tree
	 */
	void enterListeinst(LTParser.ListeinstContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTParser#listeinst}.
	 * @param ctx the parse tree
	 */
	void exitListeinst(LTParser.ListeinstContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterInst(LTParser.InstContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitInst(LTParser.InstContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(LTParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(LTParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWrite(LTParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWrite(LTParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTParser#listeid}.
	 * @param ctx the parse tree
	 */
	void enterListeid(LTParser.ListeidContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTParser#listeid}.
	 * @param ctx the parse tree
	 */
	void exitListeid(LTParser.ListeidContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTParser#instif}.
	 * @param ctx the parse tree
	 */
	void enterInstif(LTParser.InstifContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTParser#instif}.
	 * @param ctx the parse tree
	 */
	void exitInstif(LTParser.InstifContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(LTParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(LTParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(LTParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(LTParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTParser#instdo}.
	 * @param ctx the parse tree
	 */
	void enterInstdo(LTParser.InstdoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTParser#instdo}.
	 * @param ctx the parse tree
	 */
	void exitInstdo(LTParser.InstdoContext ctx);
}