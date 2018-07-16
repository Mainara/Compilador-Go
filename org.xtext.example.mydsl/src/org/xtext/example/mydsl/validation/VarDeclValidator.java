package org.xtext.example.mydsl.validation;

import java.util.Map;
import org.xtext.example.mydsl.myDsl.VarDecl;
import org.xtext.example.mydsl.myDsl.VarSpec;

public class VarDeclValidator {
	
	public String validaVarDecl(VarDecl varDecl, Map<String, String> idsTypes){
		if(varDecl.getVarSpec() != null){
			if(!varDecl.getVarSpec().getIdentifierList().getId().isEmpty()){
				idsTypes.put(varDecl.getVarSpec().getIdentifierList().getId(), "bool");
			}
			
			if(varDecl.getVarSpec().getIdentifierList().getId1().size() > 0){
				for(String id: varDecl.getVarSpec().getIdentifierList().getId1()){
					if(!id.isEmpty()){
						idsTypes.put(id, "bool");
					}
				}
			}
			
			if(varDecl.getVarSpec().getType() != null){
				if(varDecl.getVarSpec().getType().getTypeName() == null || !varDecl.getVarSpec().getType().getTypeName().getId().equals("bool")){
					return "Erro semânitco: incompatibilidade de tipo, expressões retornam apenas valores booleanos";
				}
			}else{
				if(varDecl.getVarSpec().getExpressionList().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getOperandName().getId().equals("nil")){
					return "Erro semântico: não é possível inicializar um variável sem tipo com nil";
				}
			}
		}else{
			if(varDecl.getVarSpec1().size() > 0){
				for(VarSpec varSpec: varDecl.getVarSpec1()){
					if(!varSpec.getIdentifierList().getId().isEmpty()){
						idsTypes.put(varSpec.getIdentifierList().getId(), "bool");
					}
					
					if(varSpec.getIdentifierList().getId1().size() > 0){
						for(String id: varSpec.getIdentifierList().getId1()){
							if(!id.isEmpty()){
								idsTypes.put(id, "bool");
							}
						}
					}
					
					if(varSpec.getType() != null){
						if(varSpec.getType().getTypeName() == null || !varSpec.getType().getTypeName().getId().equals("bool")){
							return "Erro semânitco: incompatibilidade de tipo, expressões retornam apenas valores booleanos";
						}
					}else{
						if(varSpec.getExpressionList().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getOperandName().getId().equals("nil")){
							return "Erro semântico: não é possível inicializar um variável sem tipo com nil";
						}
					}
				}
			}
		}
		return null;
	}

}
