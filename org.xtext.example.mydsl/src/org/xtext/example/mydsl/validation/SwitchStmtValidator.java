package org.xtext.example.mydsl.validation;

import org.xtext.example.mydsl.myDsl.ExprCaseClause;
import org.xtext.example.mydsl.myDsl.ExprSwitchStmt;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.SwitchStmt;

public class SwitchStmtValidator {
	
	public Exception validaSwicthStmt(SwitchStmt switchStmt){
		if(switchStmt.getExprSwitchStmt() != null){
			return validaExprSwitchStmt(switchStmt.getExprSwitchStmt());
		}else{
			
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
		}
		return null;
		
	}
	

}
