package org.xtext.example.mydsl.validation;

import org.eclipse.emf.common.util.EList;
import org.xtext.example.mydsl.myDsl.ExprCaseClause;
import org.xtext.example.mydsl.myDsl.ExprSwitchStmt;
import org.xtext.example.mydsl.myDsl.SwitchStmt;
import org.xtext.example.mydsl.myDsl.TypeSwitchStmt;

public class SwitchValidator {

	public String validaSwitchStmt(SwitchStmt switchStmt) {
		System.out.println("antes");
		
		if (switchStmt.getTypeSwitchStmt() != null) {
			System.out.println("dentro type");
			return validaTypeSwitchStmt(switchStmt.getTypeSwitchStmt());
		}
		
		else if(switchStmt.getExprSwitchStmt() != null) {
			System.out.println("dentro exp");
			return validaExprSwitchStmt(switchStmt.getExprSwitchStmt());
			
		}

		//ExpSwitchStm ta como null.
		
		return null;
	}
		
	public String validaExprSwitchStmt(ExprSwitchStmt switchStmt) {
		String tipo_tag = "";
		if (switchStmt.getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getLiteral().getBasicLit().getFloat_lit() != null) {
			tipo_tag = "float";
		} else if (switchStmt.getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getLiteral().getBasicLit().getInt_lit() != null) {
			tipo_tag = "int";
		} else if (switchStmt.getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getOperandName().getId().equals("true") ||
				switchStmt.getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getOperandName().getId().equals("false")) {
			tipo_tag = "bool";
		}
		
		System.out.println(tipo_tag);
		
		EList<ExprCaseClause> caseClauses = switchStmt.getExprCaseClause();
		
		for (int i = 0; i < caseClauses.size(); i++) {
			String tipo_case = "";
			if (caseClauses.get(i).getExprSwitchCase().getExpressionList().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getLiteral().getBasicLit().getFloat_lit() != null) {
				tipo_case = "float";
			}
			else if (caseClauses.get(i).getExprSwitchCase().getExpressionList().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getLiteral().getBasicLit().getInt_lit() != null) {
				tipo_case = "int";
			} 
			
			if (tipo_case.equals("") || !tipo_case.equals(tipo_tag)) {
				return "Erro semântico: os tipos de case e da tag são incompatíveis.";
			}
		}
		
		
		return null;
	}
	
	public String validaTypeSwitchStmt(TypeSwitchStmt switchStmt) {
		return null;
	}
	
}
