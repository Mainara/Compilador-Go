package org.xtext.example.mydsl.validation;

import org.xtext.example.mydsl.myDsl.Expression;

public class ExpressionValidator {
	
	public String expressionValidator(Expression exp){
		if(exp.getUnaryExpr().getPrimaryExpr().getOperand().getOperandName().getId().equals("true") ||
			exp.getUnaryExpr().getPrimaryExpr().getOperand().getOperandName().getId().equals("false")){
				return checaBooleanos(exp);
		}else if(exp.getUnaryExpr().getPrimaryExpr().getOperand().getLiteral().getBasicLit().getInt_lit() != null || 
				exp.getUnaryExpr().getPrimaryExpr().getOperand().getLiteral().getBasicLit().getFloat_lit() != null){
			return checaIntFloat(exp);
		}else if(exp.getUnaryExpr().getPrimaryExpr().getOperand().getLiteral().getBasicLit().getString_lit() != null){
			return checaString(exp);
			
		}else if(exp.getUnaryExpr().getPrimaryExpr().getOperand().getLiteral().getCompositeLit().getLiteralType().getStructType() != null){
			return checaStructType(exp);
		}
		
		return null;
	}


	public String checaBooleanos(Expression exp){
		if(!exp.getExpression_Linha().getBINARY_OP().getREL_OP().equals("==") && !exp.getExpression_Linha().getBINARY_OP().getREL_OP().equals("!=")){
			return "Erro Semântico: tipos booleano só podem ser aplicados aos operadores == ou !=";
		}else if(exp.getExpression_Linha().getExpression().getUnaryExpr().getPrimaryExpr().getOperand() == null){
			return "Erro Semântico: incompatibilidade de tipos";
		}else if(!exp.getExpression_Linha().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getOperandName().equals("true") &&
		!exp.getExpression_Linha().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getOperandName().equals("false")){
			return "Erro Semântico: incompatibilidade de tipos";
		}else{
			return null;
		}
	}
	
	public String checaIntFloat(Expression exp) {
		if(exp.getExpression_Linha().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getLiteral().getBasicLit().getInt_lit() == null &&
				exp.getExpression_Linha().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getLiteral().getBasicLit().getFloat_lit() == null){
			return "Erro semântico: incompatibilidade de tipos";
		}
		return null;
	}
	
	public String checaString(Expression exp) {
		if(exp.getExpression_Linha().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getLiteral().getBasicLit().getString_lit() == null){
			return "Erro semântico: incompatibilidade de tipos";
		}
		return null;
	}
	
	public String checaStructType(Expression exp){
		if(!exp.getExpression_Linha().getBINARY_OP().getREL_OP().equals("==") &&
				exp.getExpression_Linha().getBINARY_OP().getREL_OP().equals("!=")){
			return "Erro semântico: struct só podem ser aplicados aos operdaorses == e !=";
		}else if(exp.getExpression_Linha().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getLiteral().getCompositeLit().getLiteralType().getStructType() == null){
			return "Erro semântico: incompatiblidade de tipo";
		}
		
		
		return null;
	}

}
