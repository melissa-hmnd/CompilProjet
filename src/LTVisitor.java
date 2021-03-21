// Generated from C:/Users/Melissa/IdeaProjects/Projet_compil/src\LT.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LTParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LTVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LTParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(LTParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(LTParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec(LTParser.DecContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(LTParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(LTParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTParser#aff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAff(LTParser.AffContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(LTParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTParser#complicated}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplicated(LTParser.ComplicatedContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTParser#pm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPm(LTParser.PmContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTParser#md}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMd(LTParser.MdContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTParser#fex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFex(LTParser.FexContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal(LTParser.ValContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTParser#listeinst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListeinst(LTParser.ListeinstContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInst(LTParser.InstContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(LTParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTParser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite(LTParser.WriteContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTParser#listeid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListeid(LTParser.ListeidContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTParser#instif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstif(LTParser.InstifContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(LTParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(LTParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTParser#instdo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstdo(LTParser.InstdoContext ctx);
}