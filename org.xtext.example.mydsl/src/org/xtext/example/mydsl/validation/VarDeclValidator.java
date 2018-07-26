package org.xtext.example.mydsl.validation;

import java.util.Map;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.VarDecl;
import org.xtext.example.mydsl.myDsl.VarSpec;

public class VarDeclValidator {
	
	public Exception validaVarDecl(VarDecl varDecl, Map<String, String> varsDecl){
		if(varDecl.getVarSpec() != null){
			return validaVarSpec(varDecl.getVarSpec(), varsDecl);
		}else{
			for(VarSpec varSpec: varDecl.getVarSpec1()){
				return validaVarSpec(varSpec, varsDecl);
			}
		}
		return null;
	}
	
	public Exception validaVarSpec(VarSpec varSpec, Map<String, String> varsDecl){
			if(varSpec.getExpressionList().getExpression().getExpression_Linha().getBINARY_OP() != null){
				if(varSpec.getExpressionList().getExpression().getExpression_Linha().getBINARY_OP().getADD_OP() != null){
					if(varSpec.getExpressionList().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getLiteral().getBasicLit().getInt_lit() != null &&
							!varSpec.getType().getTypeName().getId().equals("int")){
						return new Exception("Erro semântico: operações aritmeticas com inteiros retorna valores inteiros", MyDslPackage.Literals.DECLARATION__VAR_DECL);
					}else if(varSpec.getExpressionList().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getLiteral().getBasicLit().getFloat_lit() != null &&
							!varSpec.getType().getTypeName().getId().equals("float")){
						return new Exception("Erro semântico: operações aritmetica com float retorna valores float", MyDslPackage.Literals.DECLARATION__VAR_DECL);
					}else{
						varsDecl.put(varSpec.getIdentifierList().getId(), varSpec.getType().getTypeName().getId());
					}
				}else{
					if(!varSpec.getType().getTypeName().getId().equals("bool")){
						return new Exception("Erro semântico: expressões relacionais retornam apenas valores booleanos", MyDslPackage.Literals.DECLARATION__VAR_DECL);
					}else{
						varsDecl.put(varSpec.getIdentifierList().getId(), varSpec.getType().getTypeName().getId());
					}
				}
		}else{
			if(varSpec.getExpressionList().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getOperandName() != null){
				if(varSpec.getExpressionList().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getOperandName().getId().equals("true") ||
						varSpec.getExpressionList().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getOperandName().getId().equals("false")){
					if(!varSpec.getType().getTypeName().getId().equals("bool")){
						return new Exception("Erro semântico: incompatibilidade de tipo", MyDslPackage.Literals.DECLARATION__VAR_DECL);
					}else{
						varsDecl.put(varSpec.getIdentifierList().getId(), varSpec.getType().getTypeName().getId());
					}
				}
			}else{
				if(varSpec.getExpressionList().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getLiteral().getBasicLit().getInt_lit() != null){
					if(!varSpec.getType().getTypeName().getId().equals("int")){
						return new Exception("Erro semântico: incompatibilidade de tipo", MyDslPackage.Literals.DECLARATION__VAR_DECL);
					}else{
						varsDecl.put(varSpec.getIdentifierList().getId(), varSpec.getType().getTypeName().getId());
					}
				}else if(varSpec.getExpressionList().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getLiteral().getBasicLit().getFloat_lit() != null){
					if(!varSpec.getType().getTypeName().getId().equals("float")){
						return new Exception("Erro semântico: incompatibilidade de tipo", MyDslPackage.Literals.DECLARATION__VAR_DECL);
					}else{
						varsDecl.put(varSpec.getIdentifierList().getId(), varSpec.getType().getTypeName().getId());
					}
				}else if(varSpec.getExpressionList().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getLiteral().getBasicLit().getString_lit() != null){
					if(!varSpec.getType().getTypeName().getId().equals("string")){
						return new Exception("Erro semântico: incompatibilidade de tipo", MyDslPackage.Literals.DECLARATION__VAR_DECL);
					}else{
						varsDecl.put(varSpec.getIdentifierList().getId(), varSpec.getType().getTypeName().getId());
					}
				}
			}
		}
		return null;
	}

}
