package org.xtext.example.mydsl.validation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.xtext.example.mydsl.myDsl.ConstDecl;
import org.xtext.example.mydsl.myDsl.ConstSpec;
import org.xtext.example.mydsl.myDsl.Expression;

public class ConstDeclValidator {
	
	List<String> type = new ArrayList<>();
	List<String> asIds = new ArrayList<>();
	
	List<String> type1 = new ArrayList<>();
	List<String> asIds1 = new ArrayList<>();
	
	public String validaConstDecl(ConstDecl constDecl){
		
		if(constDecl.getConstSpec() != null){
			return validaConstSpec(constDecl.getConstSpec());
		}else{
			return validaConstSpec1(constDecl.getConstSpec1());
		}
	}
	
	
	public String validaConstSpec(ConstSpec constSpec){
		int contId = contIds(constSpec);
		int contExp = contExp(constSpec);
		
		if(contId > contExp){
			return "Erro semântico: numero de ids diferentes do núemro de expressões";
		}else if(contExp > contId){
			return "Erro semântico: numero de ids diferentes do núemro de expressões";
		}
		
		addIds(constSpec);
		validaConstSpecType(constSpec);
		validaExpression(constSpec.getExpressionList().getExpression());
		
		for(Expression ex: constSpec.getExpressionList().getExpression1()){
			validaExpression(ex);
		}
		
		for(String id: asIds){
			System.out.println(id);
		}
		
		for(String id: type){
			System.out.println(id);
		}
		
		return null;
	}
	
	public String validaConstSpecType(ConstSpec constSpec){
		if(constSpec.getType().getTypeName() != null){
			if(!constSpec.getType().getTypeName().getId().equals("boolean")){
				return "Erro semântico: Expressão relacional incompatível com este tipo";
			}
		}else{
			for(String id: asIds){
				type.add("boolean");
			}
		}
		return null;
		
	}
	
	public String validaConstSpec1(EList<ConstSpec> constSpec1) {
		int cont = 0;
		if(constSpec1.get(0).getExpressionList() == null){
			return "Erro Semântico: não pode omitir a lista de exeperssão da primeira constante";
		}else{
			contExp(constSpec1.get(0));
		}
		List<Integer> quantExp = new ArrayList<>();
		quantExp.add(cont);
		
		for (int j = 1; j < constSpec1.size(); j++) {
			int contId = contIds(constSpec1.get(j));
			if(constSpec1.get(j).getExpressionList() == null){
				if(contId > quantExp.get(j-1)){
					return "Erro semântico: numero de ids diferentes do núemro de expressões";
				}else if(quantExp.get(j-1) > contId){
					return "Erro semântico: numero de ids diferentes do núemro de expressões";
				}
			}else{
				int contExp = contExp(constSpec1.get(j));
				quantExp.add(contExp);
				if(contId > contExp){
					return "Erro semântico: numero de ids diferentes do núemro de expressões";
				}else if(contExp > contId){
					return "Erro semântico: numero de ids diferentes do núemro de expressões";
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
	
	public void addIds(ConstSpec constSpec){
		if(!constSpec.getIdentifierList().getId().isEmpty()){
			asIds.add(constSpec.getIdentifierList().getId());
		}
		
		if(constSpec.getIdentifierList().getId1().size() > 0){
			for(String id: constSpec.getIdentifierList().getId1()){
				if(!id.isEmpty()){
						asIds.add(id);
				}
			}
		}
	}
	
	public String validaExpression(Expression expression){
		if(!expression.getUnaryExpr().getPrimaryExpr().getOperand().getOperandName().getId().equals("true") ||
			!expression.getUnaryExpr().getPrimaryExpr().getOperand().getOperandName().getId().equals("false")){
			return "Erro semântico: tipo de expressão incompatível com o tipo booleano";
		}
		return null;
	}
}