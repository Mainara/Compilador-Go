package org.xtext.example.mydsl.validation;

import java.util.Map;

import org.xtext.example.mydsl.myDsl.Type;
import org.xtext.example.mydsl.myDsl.TypeDecl;
import org.xtext.example.mydsl.myDsl.TypeSpec;

public class TypeDeclValidator {
	
	public String addIdsTypes(TypeDecl typeDecl, Map<String, String> idsTypes, Map<String, String> typeDefs){
		if(typeDecl.getTypeSpec() != null){
			return validaSpec(typeDecl.getTypeSpec(), idsTypes, typeDefs);
		}else{
			for(TypeSpec typeSpec: typeDecl.getTypeSpec1()){
				return validaSpec(typeSpec, idsTypes, typeDefs);
			}
		}
		return null;
	}
	
	public String validaSpec(TypeSpec typeSpec, Map<String, String> idsTypes, Map<String, String> typeDefs){
		if(typeSpec.getAliasDecl() != null){
			String id = typeSpec.getAliasDecl().getId();
			return type(typeSpec.getAliasDecl().getType(), idsTypes, id);
		}else{
			String id = typeSpec.getTypeDef().getId();
			return typeDef(typeSpec.getTypeDef().getType(), typeDefs, id);
		}
	}
	
	
	public String type(Type type, Map<String, String> idsTypes, String id){
		if(type.getTypeName() != null){
			if(!type.getTypeName().getId().equals("bool") && !type.getTypeName().getId().equals("string") &&
					!type.getTypeName().getId().equals("int") && !type.getTypeName().getId().equals("float")){
				return "Erro";
			}
			idsTypes.put(id, type.getTypeName().getId());
		}
		
		return null;
	}
	
	public String typeDef(Type type, Map<String, String> typeDefs, String id){
		if(type.getTypeName() != null){
			if(!type.getTypeName().getId().equals("bool") && !type.getTypeName().getId().equals("string") &&
					!type.getTypeName().getId().equals("int") && !type.getTypeName().getId().equals("float")){
				return "Erro";
			}
			typeDefs.put(id, type.getTypeName().getId());
		}
		return null;
	}

}
