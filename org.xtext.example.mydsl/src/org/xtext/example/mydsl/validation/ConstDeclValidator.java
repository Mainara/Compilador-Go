package org.xtext.example.mydsl.validation;

import java.util.List;
import org.xtext.example.mydsl.myDsl.ConstDecl;
import org.xtext.example.mydsl.myDsl.ConstSpec;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

public class ConstDeclValidator {
	
	public Exception validaConstDecl(ConstDecl constDecl){
		if(constDecl.getConstSpec() != null){
			return validaConstSpec(constDecl.getConstSpec());
		}else{
			return validaConstSpec1(constDecl.getConstSpec1());
		}
	}
	
	
	public Exception validaConstSpec(ConstSpec constSpec){
		if(constSpec.getExpressionList() != null){
			int contId = contIds(constSpec);
			int contExp = contExp(constSpec);
			
			if(contId > contExp){
				return new Exception("Erro semântico: numero de ids diferentes do número de expressões", MyDslPackage.Literals.DECLARATION__CONST_DECL);
			}else if(contExp > contId){
				return new Exception("Erro semântico: numero de ids diferentes do número de expressões", MyDslPackage.Literals.DECLARATION__CONST_DECL);
			}
		}else{
			
		}
		
		if(constSpec.getExpressionList().getExpression().getExpression_Linha().getBINARY_OP() != null){
			if(constSpec.getExpressionList().getExpression().getExpression_Linha().getBINARY_OP().getADD_OP() != null){
				if(constSpec.getExpressionList().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getLiteral().getBasicLit().getInt_lit() != null &&
						!constSpec.getType().getTypeName().getId().equals("int")){
					return new Exception("Erro semântico: operações aritmeticas com inteiros retorna valores inteiros", MyDslPackage.Literals.DECLARATION__VAR_DECL);
				}else if(constSpec.getExpressionList().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getLiteral().getBasicLit().getFloat_lit() != null &&
						!constSpec.getType().getTypeName().getId().equals("float")){
					return new Exception("Erro semântico: operações aritmetica com float retorna valores float", MyDslPackage.Literals.DECLARATION__VAR_DECL);
				}
			}else{
				if(!constSpec.getType().getTypeName().getId().equals("bool")){
					return new Exception("Erro semântico: expressões relacionais retornam apenas valores booleanos", MyDslPackage.Literals.DECLARATION__VAR_DECL);
				}
			}
		}else{
			if(constSpec.getExpressionList().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getOperandName() != null){
			if(constSpec.getExpressionList().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getOperandName().getId().equals("true") ||
					constSpec.getExpressionList().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getOperandName().getId().equals("false")){
				if(!constSpec.getType().getTypeName().getId().equals("bool")){
					return new Exception("Erro semântico: incompatibilidade de tipo", MyDslPackage.Literals.DECLARATION__VAR_DECL);
				}
			}
		}else{
			if(constSpec.getExpressionList().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getLiteral().getBasicLit().getInt_lit() != null){
				if(!constSpec.getType().getTypeName().getId().equals("int")){
					return new Exception("Erro semântico: incompatibilidade de tipo", MyDslPackage.Literals.DECLARATION__VAR_DECL);
				}
			}else if(constSpec.getExpressionList().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getLiteral().getBasicLit().getFloat_lit() != null){
				if(!constSpec.getType().getTypeName().getId().equals("float")){
					return new Exception("Erro semântico: incompatibilidade de tipo", MyDslPackage.Literals.DECLARATION__VAR_DECL);
				}
			}else if(constSpec.getExpressionList().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getLiteral().getBasicLit().getString_lit() != null){
				if(!constSpec.getType().getTypeName().getId().equals("string")){
					return new Exception("Erro semântico: incompatibilidade de tipo", MyDslPackage.Literals.DECLARATION__VAR_DECL);
				}
			}
		}
	}
		
		
		
		return null;
	}
	
	public int contIds(ConstSpec constSpec){
		int cont = 0;
		if(!constSpec.getIdentifierList().getId().isEmpty()){
			cont ++;
		}
		
		if(constSpec.getIdentifierList().getId1().size() > 0){
			for(String id: constSpec.getIdentifierList().getId1()){
				if(!id.isEmpty()){
						cont ++;
				}
			}
		}
		return cont;
	}
	
	public int contExp(ConstSpec constSpec){
		int cont = 0;
		if(constSpec.getExpressionList() != null){
			if (constSpec.getExpressionList().getExpression() != null){
				cont ++;
			}
			
			if(constSpec.getExpressionList().getExpression1().size() > 0){
				cont += constSpec.getExpressionList().getExpression1().size();
			}
		}
		return cont;
	}
	
	public Exception validaConstSpec1(List<ConstSpec> constSpecs){
		if(constSpecs.get(0).getExpressionList() == null){
			return new Exception("Erro semântico: lista de expressões não pode ser omitida da primeira constante", MyDslPackage.Literals.DECLARATION__CONST_DECL);
		}
		
		if(contIds(constSpecs.get(0)) > contExp(constSpecs.get(0)) || contExp(constSpecs.get(0)) > contIds(constSpecs.get(0))){
			return new Exception("Erro semântico: numero de ids diferentes do número de expressões", MyDslPackage.Literals.DECLARATION__CONST_DECL);
		}
		
		for(int i = 1; i < constSpecs.size(); i ++){
			if(constSpecs.get(i).getExpressionList() == null){
				for(int j = i-1; j >= 0; j --){
					if(constSpecs.get(j).getExpressionList() != null){
						if(contIds(constSpecs.get(i)) > contExp(constSpecs.get(j)) || contExp(constSpecs.get(j)) > contIds(constSpecs.get(i))){
							return new Exception("Erro semântico: numero de ids diferentes do número de expressões", MyDslPackage.Literals.DECLARATION__CONST_DECL);
						}
						
						break;
					}
				}
			}else{
				if(contIds(constSpecs.get(i)) > contExp(constSpecs.get(i)) || contExp(constSpecs.get(i)) > contIds(constSpecs.get(i))){
					return new Exception("Erro semântico: numero de ids diferentes do número de expressões", MyDslPackage.Literals.DECLARATION__CONST_DECL);
				}
			}
		}
		return null;
	}
}