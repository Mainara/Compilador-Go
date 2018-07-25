package org.xtext.example.mydsl.validation;

import java.util.Map;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.VarDecl;
import org.xtext.example.mydsl.myDsl.VarSpec;

public class VarDeclValidator {
	
	public Exception validaVarDecl(VarDecl varDecl, Map<String, String> varsDecl){
		if(varDecl.getVarSpec() != null){
			addVarsDecl(varDecl.getVarSpec(), varsDecl);
			return validaVarSpec(varDecl.getVarSpec());
		}else{
			for(VarSpec varSpec: varDecl.getVarSpec1()){
				addVarsDecl(varSpec, varsDecl);
				return validaVarSpec(varSpec);
			}
		}
		return null;
	}
	
	public Exception validaVarSpec(VarSpec varSpec){
		if(varSpec.getType() != null){
			if(varSpec.getType().getTypeName() == null || !varSpec.getType().getTypeName().getId().equals("bool")){
				return new Exception("Erro semântico: incompatibilidade de tipo, expressões relacionais retornam apenas valores booleanos", MyDslPackage.Literals.DECLARATION__VAR_DECL);
			}
		}else{
			if(varSpec.getExpressionList().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getOperandName().getId().equals("nil")){
				return new Exception("Erro semântico: não é possível inicializar um variável sem tipo com nil", MyDslPackage.Literals.DECLARATION__VAR_DECL);
			}
		}
		
		return null;
	}
	
	public void addVarsDecl(VarSpec varSpec, Map<String, String> varsDecl){
		if(!varSpec.getIdentifierList().getId().isEmpty()){
			varsDecl.put(varSpec.getIdentifierList().getId(), "bool");
		}
		
		if(varSpec.getIdentifierList().getId1().size() > 0){
			for(String id: varSpec.getIdentifierList().getId1()){
				if(!id.isEmpty()){
					varsDecl.put(id, "bool");
				}
			}
		}
	}

}
