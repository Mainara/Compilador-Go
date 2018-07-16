package org.xtext.example.mydsl.validation;

import java.util.List;
import java.util.Map;
import org.xtext.example.mydsl.myDsl.MethodDecl;
import org.xtext.example.mydsl.myDsl.ParameterDecl;
import org.xtext.example.mydsl.myDsl.Type;

public class MethodDeclValidator {
	
	public String checkMethodDecl(MethodDecl methodDecl, List<MethodDecl> methodDeclList, Map<String, String> typeDefs){
		String id = methodDecl.getReceiver().getParameters().getParameterList().getParameterDecl().getIdentifierList().getId();
		if(methodDecl.getReceiver().getParameters().getParameterList().getParameterDecl1().size() > 0){
			return "Erro Semântico: receptor só pode ser um parâmetro.";
		}else if(id.equals(methodDecl.getMethodName().getId())){
			return "Nome de identificador do receptor deve ser exclusivo";
		}else if(id.equals(methodDecl.getSignature().getParameters().getParameterList().getParameterDecl().getIdentifierList().getId())){
				return "Nome de identificador do receptor deve ser exclusivo";
		}else if(methodDecl.getSignature().getParameters().getParameterList().getParameterDecl().getIdentifierList().getId1().size() > 0){
			return checaId(methodDecl, id);
		}else if(methodDecl.getSignature().getParameters().getParameterList().getParameterDecl1().size() > 0){
			return checaId1(methodDecl, id);
		}else{
			System.out.println("oi");
			return validaBaseType(methodDecl.getReceiver().getParameters().getParameterList().getParameterDecl().getType(), typeDefs);
		}
	}
	
	public String validaBaseType(Type type, Map<String, String> typeDefs){
		if(type.getTypeName() == null){
			return "Erro Semântico: tipo base deve ser da forma T ou *T onde T é um nome de um tipo já definido";
		}else if(!typeDefs.containsKey(type.getTypeName().getId())){
			return "Tipo não definido";
		}else{
			if(typeDefs.get(type.getTypeName().getId()).equals("pointer") || typeDefs.get(type.getTypeName().getId()).equals("interface")){
				return "Tipo Base nao poder ser do tipo ponteiro ou interface";
			}else{
				return null;
			}
		}
	}
	
	public String checaId(MethodDecl methodDecl, String id){
		for(String ids: methodDecl.getSignature().getParameters().getParameterList().getParameterDecl().getIdentifierList().getId1()){
			if(id.equals(ids)){
				return "Nome de identificador do receptor deve ser exclusivo";
			}
		}
		return null;
	}
	
	public String checaId1(MethodDecl methodDecl, String id){
		for(ParameterDecl p: methodDecl.getSignature().getParameters().getParameterList().getParameterDecl1()){
			if(id.equals(p.getIdentifierList().getId())){
				return "Nome de identificador do receptor deve ser exclusivo";
			}else if(p.getIdentifierList().getId1().size() > 0){
				for(String ids: p.getIdentifierList().getId1()){
					if(id.equals(ids)){
						return "Nome de identificador do receptor deve ser exclusivo";
					}
				}
			}
		}
		return null;
	}
}
