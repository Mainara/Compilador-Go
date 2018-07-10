package org.xtext.example.mydsl.validation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.xtext.example.mydsl.myDsl.MethodDecl;
import org.xtext.example.mydsl.myDsl.MethodName;
import org.xtext.example.mydsl.myDsl.ParameterDecl;

public class MethodDeclValidator {
	
	Set<MethodDecl> methodDecl = new HashSet<>();
	List<MethodName> methodName = new ArrayList<>();
	
	public String checkMethodDecl(MethodDecl methodDecl){
		String id = methodDecl.getReceiver().getParameters().getParameterList().getParameterDecl().getIdentifierList().getId();
		if(methodDecl.getReceiver().getParameters().getParameterList().getParameterDecl1().size() > 0){
				return "Erro Semântico: receptor só pode ser um parâmetro.";
		}else if(methodDecl.getMethodName().getId().equals(id)){
				return "Declaracao de Método: nome de identificador já existente";
		}else if(methodDecl.getSignature().getParameters().getParameterList().getParameterDecl().getIdentifierList().getId().equals(id)){
				return "Declaracao de Método: nome de identificador já existente";
		}else if(methodDecl.getSignature().getParameters().getParameterList().getParameterDecl().getIdentifierList().getId1().size() > 0){
				List<String> a = methodDecl.getSignature().getParameters().getParameterList().getParameterDecl().getIdentifierList().getId1();
				for (String i : a) {
					if(i.equals(id)){
						return "Declaracao de Método: nome de identificador já existente";
					}
				}	
		}else if(methodDecl.getSignature().getParameters().getParameterList().getParameterDecl1().size() > 0){
			List<ParameterDecl> a = methodDecl.getSignature().getParameters().getParameterList().getParameterDecl1();
			for (ParameterDecl i : a) {
				if(i.getIdentifierList().getId().equals(id)){
					return "Declaracao de Método: nome de identificador já existente";
				}
			}
		}
		
		return null;
				
				
				/*var PointerType p
				for (Object ponteiro : ponteiros) {
					p = ponteiro as PointerType
					if(p.baseType.type.equals(methodDecl.receiver.parameters.parameterList.parameterDecl.type)){
						error("Declaracao de Método: tipo não pode ser ponteiro existente", MyDslPackage.Literals.METHOD_DECL__RECEIVER)
					}
				}
				*/
	}
}
