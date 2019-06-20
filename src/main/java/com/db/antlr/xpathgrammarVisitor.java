// Generated from /Users/Danny/Desktop/CSE 232B/232/src/main/java/com/db/xpathgrammar.g4 by ANTLR 4.7.2
package com.db.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link xpathgrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface xpathgrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code ap_ap}
	 * labeled alternative in {@link xpathgrammarParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAp_ap(xpathgrammarParser.Ap_apContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_slash_rp}
	 * labeled alternative in {@link xpathgrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_slash_rp(xpathgrammarParser.Rp_slash_rpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_rp}
	 * labeled alternative in {@link xpathgrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_rp(xpathgrammarParser.Rp_rpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_star}
	 * labeled alternative in {@link xpathgrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_star(xpathgrammarParser.Rp_starContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_text}
	 * labeled alternative in {@link xpathgrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_text(xpathgrammarParser.Rp_textContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_tagName}
	 * labeled alternative in {@link xpathgrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_tagName(xpathgrammarParser.Rp_tagNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_filter}
	 * labeled alternative in {@link xpathgrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_filter(xpathgrammarParser.Rp_filterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_comma_rp}
	 * labeled alternative in {@link xpathgrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_comma_rp(xpathgrammarParser.Rp_comma_rpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_at}
	 * labeled alternative in {@link xpathgrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_at(xpathgrammarParser.Rp_atContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rp_dot_dot}
	 * labeled alternative in {@link xpathgrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp_dot_dot(xpathgrammarParser.Rp_dot_dotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code f_and_f}
	 * labeled alternative in {@link xpathgrammarParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF_and_f(xpathgrammarParser.F_and_fContext ctx);
	/**
	 * Visit a parse tree produced by the {@code f_rp}
	 * labeled alternative in {@link xpathgrammarParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF_rp(xpathgrammarParser.F_rpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code f_eq}
	 * labeled alternative in {@link xpathgrammarParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF_eq(xpathgrammarParser.F_eqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code f_not_f}
	 * labeled alternative in {@link xpathgrammarParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF_not_f(xpathgrammarParser.F_not_fContext ctx);
	/**
	 * Visit a parse tree produced by the {@code f_is}
	 * labeled alternative in {@link xpathgrammarParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF_is(xpathgrammarParser.F_isContext ctx);
	/**
	 * Visit a parse tree produced by the {@code f_f}
	 * labeled alternative in {@link xpathgrammarParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF_f(xpathgrammarParser.F_fContext ctx);
	/**
	 * Visit a parse tree produced by the {@code f_or_f}
	 * labeled alternative in {@link xpathgrammarParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF_or_f(xpathgrammarParser.F_or_fContext ctx);
	/**
	 * Visit a parse tree produced by {@link xpathgrammarParser#filename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilename(xpathgrammarParser.FilenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link xpathgrammarParser#tagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagName(xpathgrammarParser.TagNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link xpathgrammarParser#attName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttName(xpathgrammarParser.AttNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xq_xq}
	 * labeled alternative in {@link xpathgrammarParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq_xq(xpathgrammarParser.Xq_xqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xq_comma_xq}
	 * labeled alternative in {@link xpathgrammarParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq_comma_xq(xpathgrammarParser.Xq_comma_xqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xq_slash_rp}
	 * labeled alternative in {@link xpathgrammarParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq_slash_rp(xpathgrammarParser.Xq_slash_rpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xq_t_xq_t}
	 * labeled alternative in {@link xpathgrammarParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq_t_xq_t(xpathgrammarParser.Xq_t_xq_tContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xq_stringcon}
	 * labeled alternative in {@link xpathgrammarParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq_stringcon(xpathgrammarParser.Xq_stringconContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xq_ap}
	 * labeled alternative in {@link xpathgrammarParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq_ap(xpathgrammarParser.Xq_apContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xq_var}
	 * labeled alternative in {@link xpathgrammarParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq_var(xpathgrammarParser.Xq_varContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xq_for_let_where_return}
	 * labeled alternative in {@link xpathgrammarParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq_for_let_where_return(xpathgrammarParser.Xq_for_let_where_returnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xq_join}
	 * labeled alternative in {@link xpathgrammarParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq_join(xpathgrammarParser.Xq_joinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xq_t_xq_t_no_bracket}
	 * labeled alternative in {@link xpathgrammarParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq_t_xq_t_no_bracket(xpathgrammarParser.Xq_t_xq_t_no_bracketContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xq_let}
	 * labeled alternative in {@link xpathgrammarParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq_let(xpathgrammarParser.Xq_letContext ctx);
	/**
	 * Visit a parse tree produced by {@link xpathgrammarParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(xpathgrammarParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link xpathgrammarParser#stringConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringConstant(xpathgrammarParser.StringConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link xpathgrammarParser#forClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForClause(xpathgrammarParser.ForClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link xpathgrammarParser#letClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetClause(xpathgrammarParser.LetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link xpathgrammarParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(xpathgrammarParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link xpathgrammarParser#returnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnClause(xpathgrammarParser.ReturnClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cond_empty}
	 * labeled alternative in {@link xpathgrammarParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_empty(xpathgrammarParser.Cond_emptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cond_eq}
	 * labeled alternative in {@link xpathgrammarParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_eq(xpathgrammarParser.Cond_eqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cond_not_cond}
	 * labeled alternative in {@link xpathgrammarParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_not_cond(xpathgrammarParser.Cond_not_condContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cond_is}
	 * labeled alternative in {@link xpathgrammarParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_is(xpathgrammarParser.Cond_isContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cond_or_cond}
	 * labeled alternative in {@link xpathgrammarParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_or_cond(xpathgrammarParser.Cond_or_condContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cond_cond}
	 * labeled alternative in {@link xpathgrammarParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_cond(xpathgrammarParser.Cond_condContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cond_some}
	 * labeled alternative in {@link xpathgrammarParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_some(xpathgrammarParser.Cond_someContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cond_and_cond}
	 * labeled alternative in {@link xpathgrammarParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_and_cond(xpathgrammarParser.Cond_and_condContext ctx);
	/**
	 * Visit a parse tree produced by the {@code join_clause}
	 * labeled alternative in {@link xpathgrammarParser#joinClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_clause(xpathgrammarParser.Join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code join_attr}
	 * labeled alternative in {@link xpathgrammarParser#joinAtt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_attr(xpathgrammarParser.Join_attrContext ctx);
	/**
	 * Visit a parse tree produced by {@link xpathgrammarParser#varName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarName(xpathgrammarParser.VarNameContext ctx);
}