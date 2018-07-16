package org.xtext.example.mydsl.validation;

import java.util.Map;

import org.xtext.example.mydsl.myDsl.Type;
import org.xtext.example.mydsl.myDsl.TypeDecl;

public class TypeDeclValidator {
	
	public void addIdsTypes(TypeDecl typeDecl, Map<String, String> idsTypes, Map<String, String> typeDefs){
		if(typeDecl.getTypeSpec().getAliasDecl() != null){
			String id = typeDecl.getTypeSpec().getAliasDecl().getId();
			type(typeDecl.getTypeSpec().getAliasDecl().getType(), idsTypes, id);
		}else{
			String id = typeDecl.getTypeSpec().getTypeDef().getId();
			typeDef(typeDecl.getTypeSpec().getTypeDef().getType(), typeDefs, id);
		}
	}
	
	public void type(Type type, Map<String, String> idsTypes, String id){
		if(type.getTypeName() != null){
			idsTypes.put(id, type.getTypeName().getId());
		}else if(type.getType() != null){
			type(type.getType(), idsTypes, id);
		}else{
			if(type.getTypeLit().getChannelType() != null){
				idsTypes.put(id, "channel");
			}else if(type.getTypeLit().getFunctionType() != null){
				idsTypes.put(id, "function");
			}else if(type.getTypeLit().getInterfaceType() != null){
				idsTypes.put(id, "interface");
			}else if(type.getTypeLit().getMapType() != null){
				idsTypes.put(id, "map");
			}else if(type.getTypeLit().getPointerType() != null){
				idsTypes.put(id, "pointer");
			}else if(type.getTypeLit().getSrtuctType() != null){
				idsTypes.put(id, "struct");
			}else{
				if(type.getTypeLit().getTypeLitLinha().getArrayLength() != null){
					idsTypes.put(id, "array");
				}else{
					idsTypes.put(id, "slice");
				}
			}
		}
	}
	
	public void typeDef(Type type, Map<String, String> typeDefs, String id){
		if(type.getTypeName() != null){
			typeDefs.put(id, type.getTypeName().getId());
		}else if(type.getType() != null){
			typeDef(type.getType(), typeDefs, id);
		}else{
			if(type.getTypeLit().getChannelType() != null){
				typeDefs.put(id, "channel");
			}else if(type.getTypeLit().getFunctionType() != null){
				typeDefs.put(id, "function");
			}else if(type.getTypeLit().getInterfaceType() != null){
				typeDefs.put(id, "interface");
			}else if(type.getTypeLit().getMapType() != null){
				typeDefs.put(id, "map");
			}else if(type.getTypeLit().getPointerType() != null){
				typeDefs.put(id, "pointer");
			}else if(type.getTypeLit().getSrtuctType() != null){
				typeDefs.put(id, "struct");
			}else{
				if(type.getTypeLit().getTypeLitLinha().getArrayLength() != null){
					typeDefs.put(id, "array");
				}else{
					typeDefs.put(id, "slice");
				}
			}
		}
		
	}

}
