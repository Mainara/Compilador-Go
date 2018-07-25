package org.xtext.example.mydsl.validation;

import java.util.List;
import java.util.Map;
import org.xtext.example.mydsl.myDsl.MethodDecl;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.ParameterDecl;
import org.xtext.example.mydsl.myDsl.Type;

public class MethodDeclValidator {
	
	public Exception checkMethodDecl(MethodDecl methodDecl, List<MethodDecl> methodDeclList, Map<String, String> typeDefs){
		String id = methodDecl.getReceiver().getParameters().getParameterList().getParameterDecl().getIdentifierList().getId();
		if(methodDecl.getReceiver().getParameters().getParameterList().getParameterDecl1().size() > 0){
			return new Exception("Erro Semântico: receptor só pode ser um parâmetro.", MyDslPackage.Literals.TOP_LEVEL_DECL__METHOD_DECL);
		}else if(id.equals(methodDecl.getMethodName().getId())){
			return new Exception("Nome de identificador do receptor deve ser exclusivo", MyDslPackage.Literals.TOP_LEVEL_DECL__METHOD_DECL);
		}else if(id.equals(methodDecl.getSignature().getParameters().getParameterList().getParameterDecl().getIdentifierList().getId())){
				return new Exception("Nome de identificador do receptor deve ser exclusivo", MyDslPackage.Literals.TOP_LEVEL_DECL__METHOD_DECL);
		}else if(methodDecl.getSignature().getParameters().getParameterList().getParameterDecl().getIdentifierList().getId1().size() > 0){
			return checaId(methodDecl, id);
		}else if(methodDecl.getSignature().getParameters().getParameterList().getParameterDecl1().size() > 0){
			return checaId1(methodDecl, id);
		}else{
			return validaBaseType(methodDecl.getReceiver().getParameters().getParameterList().getParameterDecl().getType(), typeDefs);
		}
	}
	
	public Exception validaBaseType(Type type, Map<String, String> typeDefs){
		if(type.getTypeName() == null){
			return new Exception("Erro Semântico: tipo base deve ser da forma T ou *T onde T é um nome de um tipo já definido", MyDslPackage.Literals.TOP_LEVEL_DECL__METHOD_DECL);
		}else if(!typeDefs.containsKey(type.getTypeName().getId())){
			return new Exception("Tipo não definido", MyDslPackage.Literals.TOP_LEVEL_DECL__METHOD_DECL);
		}else{
			if(typeDefs.get(type.getTypeName().getId()).equals("pointer") || typeDefs.get(type.getTypeName().getId()).equals("interface")){
				return new Exception("Tipo Base nao poder ser do tipo ponteiro ou interface", MyDslPackage.Literals.TOP_LEVEL_DECL__METHOD_DECL);
			}else{
				return null;
			}
		}
	}
	
	public Exception checaId(MethodDecl methodDecl, String id){
		for(String ids: methodDecl.getSignature().getParameters().getParameterList().getParameterDecl().getIdentifierList().getId1()){
			if(id.equals(ids)){
				return new Exception("Nome de identificador do receptor deve ser exclusivo", MyDslPackage.Literals.TOP_LEVEL_DECL__METHOD_DECL);
			}
		}
		return null;
	}
	
	public Exception checaId1(MethodDecl methodDecl, String id){
		for(ParameterDecl p: methodDecl.getSignature().getParameters().getParameterList().getParameterDecl1()){
			if(id.equals(p.getIdentifierList().getId())){
				return new Exception("Nome de identificador do receptor deve ser exclusivo", MyDslPackage.Literals.TOP_LEVEL_DECL__METHOD_DECL);
			}else if(p.getIdentifierList().getId1().size() > 0){
				for(String ids: p.getIdentifierList().getId1()){
					if(id.equals(ids)){
						return new Exception("Nome de identificador do receptor deve ser exclusivo", MyDslPackage.Literals.TOP_LEVEL_DECL__METHOD_DECL);
					}
				}
			}
		}
		return null;
	}
}
