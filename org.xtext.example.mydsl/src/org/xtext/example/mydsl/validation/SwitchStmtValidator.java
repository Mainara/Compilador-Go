package org.xtext.example.mydsl.validation;

import java.util.List;

import org.xtext.example.mydsl.myDsl.ExprCaseClause;
import org.xtext.example.mydsl.myDsl.ExprSwitchStmt;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.SwitchStmt;

public class SwitchStmtValidator {
	
	public Exception validaSwicthStmt(SwitchStmt switchStmt){
		if(switchStmt.getExprSwitchStmt() != null){
			return validaExprSwitchStmt(switchStmt.getExprSwitchStmt());
		}
		return null;
	}
	
	public Exception validaExprSwitchStmt(ExprSwitchStmt exprSwitchStmt){
		int contDefault = 0;
		if(exprSwitchStmt.getExprCaseClause().size() > 0){
			for(ExprCaseClause exp: exprSwitchStmt.getExprCaseClause()){
				if(exp.getExprSwitchCase().getDefault() != null){
					contDefault++;
				}
			}
		}
		
		if(contDefault > 1){
			return new Exception("Caso default deve ser no máximo 1 ", MyDslPackage.Literals.SWITCH_STMT__EXPR_SWITCH_STMT);
		}else{
			String tipo = null;
			if(exprSwitchStmt.getSimpleStmt().getShortVarDecl().getExpressionList().getExpression().getExpression_Linha().getBINARY_OP() != null){
				if(exprSwitchStmt.getSimpleStmt().getShortVarDecl().getExpressionList().getExpression().getExpression_Linha().getBINARY_OP().getREL_OP() != null){
					tipo = "bool";
				}else{
					if(exprSwitchStmt.getSimpleStmt().getShortVarDecl().getExpressionList().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getLiteral().getBasicLit().getInt_lit() != null){
						tipo = "int";
					}else if(exprSwitchStmt.getSimpleStmt().getShortVarDecl().getExpressionList().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getLiteral().getBasicLit().getFloat_lit() != null){
						tipo = "float";
					}
				}
			}else{
				if(exprSwitchStmt.getSimpleStmt().getShortVarDecl().getExpressionList().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getOperandName() != null){
					if(exprSwitchStmt.getSimpleStmt().getShortVarDecl().getExpressionList().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getOperandName().getId().equals("true") ||
							exprSwitchStmt.getSimpleStmt().getShortVarDecl().getExpressionList().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getOperandName().getId().equals("false")){
						tipo = "bool";
					}
				}else{
					if(exprSwitchStmt.getSimpleStmt().getShortVarDecl().getExpressionList().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getLiteral().getBasicLit().getInt_lit() != null){
						tipo = "int";
					}else if(exprSwitchStmt.getSimpleStmt().getShortVarDecl().getExpressionList().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getLiteral().getBasicLit().getFloat_lit() != null){
						tipo = "float";
					}else if(exprSwitchStmt.getSimpleStmt().getShortVarDecl().getExpressionList().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getLiteral().getBasicLit().getString_lit() != null){
							tipo = "string";
					}
				}
			}
			
			System.out.println(tipo);
			
			return validaCase(exprSwitchStmt.getExprCaseClause(), tipo);
		}
	}
	
	public Exception validaCase(List<ExprCaseClause> exprCaseClause, String tipo){
		for(ExprCaseClause exprCaseClauses: exprCaseClause){
			if(exprCaseClauses.getExprSwitchCase().getExpressionList().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getOperandName() != null){
				if(exprCaseClauses.getExprSwitchCase().getExpressionList().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getOperandName().getId().equals("true") ||
						exprCaseClauses.getExprSwitchCase().getExpressionList().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getOperandName().getId().equals("false")){
					if(!tipo.equals("bool")){
						return new Exception("Erro semântico: Tipo da variável difernet do tipo case", MyDslPackage.Literals.SWITCH_STMT__EXPR_SWITCH_STMT);
					}
				}
					
				}else{
					if(exprCaseClauses.getExprSwitchCase().getExpressionList().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getLiteral().getBasicLit().getInt_lit() != null){
						if(!tipo.equals("int")){
							return new Exception("Erro semântico: Tipo da variável difernet do tipo case", MyDslPackage.Literals.SWITCH_STMT__EXPR_SWITCH_STMT);
						}
					}else if(exprCaseClauses.getExprSwitchCase().getExpressionList().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getLiteral().getBasicLit().getFloat_lit() != null){
						if(!tipo.equals("float")){
							return new Exception("Erro semântico: Tipo da variável difernet do tipo case", MyDslPackage.Literals.SWITCH_STMT__EXPR_SWITCH_STMT);
						}
					}else if(exprCaseClauses.getExprSwitchCase().getExpressionList().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getLiteral().getBasicLit().getString_lit() != null){
						if(!tipo.equals("string")){
							return new Exception("Erro semântico: Tipo da variável difernet do tipo case", MyDslPackage.Literals.SWITCH_STMT__EXPR_SWITCH_STMT);
						}
					}
			}
		}
		
		return null;
	}
	

}
