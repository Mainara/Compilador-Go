package org.xtext.example.mydsl.validation;

import org.xtext.example.mydsl.myDsl.Expression;
import org.xtext.example.mydsl.myDsl.Literal;

public class ExpressionValidator {
	
	public String expressionValidator(Expression exp){
		if(exp.getUnaryExpr().getPrimaryExpr().getOperand().getOperandName() != null &&
				(exp.getUnaryExpr().getPrimaryExpr().getOperand().getOperandName().getId().equals("true") ||
					exp.getUnaryExpr().getPrimaryExpr().getOperand().getOperandName().getId().equals("false"))){
						return checaBooleanos(exp);
			}else if(exp.getUnaryExpr().getPrimaryExpr().getOperand().getLiteral() != null){
				return validaBasicLit(exp.getUnaryExpr().getPrimaryExpr().getOperand().getLiteral(), exp);
			}else{
				return null;
			}
	}
	
	public String validaExp2(Expression exp){
		if(exp.getUnaryExpr().getPrimaryExpr().getOperand().getOperandName() != null &&
			(exp.getUnaryExpr().getPrimaryExpr().getOperand().getOperandName().getId().equals("true") ||
				exp.getUnaryExpr().getPrimaryExpr().getOperand().getOperandName().getId().equals("false"))){
					return checaBooleanos(exp);
		}else if(exp.getUnaryExpr().getPrimaryExpr().getOperand().getLiteral() != null){
			return validaBasicLit(exp.getUnaryExpr().getPrimaryExpr().getOperand().getLiteral(), exp);
		}else{
			return null;
		}
	}
	
	public String validaBasicLit(Literal literal, Expression exp){
		if(literal.getBasicLit() != null){
			if(literal.getBasicLit().getInt_lit() != null || literal.getBasicLit().getFloat_lit() != null){
				return checaIntFloat(exp);
			}else if(literal.getBasicLit().getString_lit() != null){
				return checaString(exp);
			}
		}
		return null;
	}


	public String checaBooleanos(Expression exp){
		if(exp.getExpression_Linha().getBINARY_OP() != null){
			
			if(exp.getExpression_Linha().getBINARY_OP().getREL_OP() != null){
				if(!exp.getExpression_Linha().getBINARY_OP().getREL_OP().equals("==") && !exp.getExpression_Linha().getBINARY_OP().getREL_OP().equals("!=")){
					return "Erro Semântico: tipos booleano só podem ser aplicados aos operadores == ou !=";
				}
			}else if(exp.getExpression_Linha().getBINARY_OP().getADD_OP() != null){
				return "Erro Semântico: tipos booleano só podem ser aplicados aos operadores relacionais == ou !=";
			}else{
				if(exp.getExpression_Linha().getExpression1().getUnaryExpr().getPrimaryExpr().getOperand().getOperandName() == null){
					return "Erro Semântico: incompatibilidade de tipos booleanos";
				}else{
					if(!exp.getExpression_Linha().getExpression1().getUnaryExpr().getPrimaryExpr().getOperand().getOperandName().getId().equals("true") &&
						!exp.getExpression_Linha().getExpression1().getUnaryExpr().getPrimaryExpr().getOperand().getOperandName().getId().equals("false")){
							return "Erro Semântico: incompatibilidade de tipos booleanos";
					}
				}
			}
		}
		return null;
		}
	
	public String checaIntFloat(Expression exp) {
		if(exp.getUnaryExpr().getPrimaryExpr().getOperand().getLiteral().getBasicLit().getInt_lit() != null){
			if(exp.getExpression_Linha().getExpression1().getUnaryExpr().getPrimaryExpr().getOperand().getLiteral() == null){
				return "Erro semântico: incompatibilidade de tipos inteiros";
			}else if(exp.getExpression_Linha().getExpression1().getUnaryExpr().getPrimaryExpr().getOperand().getLiteral().getBasicLit() == null){
				return "Erro semântico: incompatibilidade de tipos inteiros";
			}else if(exp.getExpression_Linha().getExpression1().getUnaryExpr().getPrimaryExpr().getOperand().getLiteral().getBasicLit().getInt_lit() == null){
				return "Erro semântico: incompatibilidade de tipos inteiros";
			}else{
				return null;
			}
		}else{
			if(exp.getExpression_Linha().getExpression1().getUnaryExpr().getPrimaryExpr().getOperand().getLiteral() == null){
				return "Erro semântico: incompatibilidade de tipos float";
			}else if(exp.getExpression_Linha().getExpression1().getUnaryExpr().getPrimaryExpr().getOperand().getLiteral().getBasicLit() == null){
				return "Erro semântico: incompatibilidade de tipos float";
			}else if(exp.getExpression_Linha().getExpression1().getUnaryExpr().getPrimaryExpr().getOperand().getLiteral().getBasicLit().getFloat_lit() == null){
				return "Erro semântico: incompatibilidade de tipos float";
			}else{
				return null;
			}
		}
	}
	
	public String checaString(Expression exp) {
		if(exp.getExpression_Linha().getExpression1().getUnaryExpr().getPrimaryExpr().getOperand().getLiteral() == null){
			return "Erro semântico: incompatibilidade de tipos strings";
		}else if(exp.getExpression_Linha().getExpression1().getUnaryExpr().getPrimaryExpr().getOperand().getLiteral().getBasicLit() == null){
			return "Erro semântico: incompatibilidade de tipos strings";
		}else if(exp.getExpression_Linha().getExpression1().getUnaryExpr().getPrimaryExpr().getOperand().getLiteral().getBasicLit().getString_lit() == null){
			return "Erro semântico: incompatibilidade de tipos strings";
		}else{
			return null;
		}
	}

}
