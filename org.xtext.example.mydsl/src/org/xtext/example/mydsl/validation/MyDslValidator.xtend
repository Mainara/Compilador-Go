/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.validation

import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.xtext.validation.Check
import org.xtext.example.mydsl.myDsl.Declaration
import org.xtext.example.mydsl.myDsl.MethodDecl
import org.xtext.example.mydsl.myDsl.SwitchStmt
import org.xtext.example.mydsl.myDsl.Expression
import org.xtext.example.mydsl.myDsl.MyDslPackage

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class MyDslValidator extends AbstractMyDslValidator {
	
	ConstDeclValidator constDeclValidator = new ConstDeclValidator();
	MethodDeclValidator methodDeclValidator = new MethodDeclValidator();
	VarDeclValidator varDeclValidator = new VarDeclValidator();
	TypeDeclValidator typeDeclValidator = new TypeDeclValidator();
	ExpressionValidator expressionValidator = new ExpressionValidator();
	Map<String, String> idsTypes = new HashMap<String,String>;
	List<MethodDecl> methodDeclList = new ArrayList;
	Map<String, String> typeDefs = new HashMap;
	
//	public static val INVALID_NAME = 'invalidName'
//S
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					MyDslPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}

	//List<PointerType> ponteiros = new ArrayList;
	//List<TypeName> typeName = new ArrayList;
	
	@Check
	def checkMethodDecl(MethodDecl methodDecl){
		if(methodDeclValidator.checkMethodDecl(methodDecl, methodDeclList, typeDefs) != null){
			var Exception erro = methodDeclValidator.checkMethodDecl(methodDecl, methodDeclList, typeDefs);
			error(erro.erro, erro.feature);
		}
	}
	
	@Check
	def checkDecl(Declaration decl){
		if(decl.constDecl != null){
			if(constDeclValidator.validaConstDecl(decl.constDecl) != null){
				var Exception erro = constDeclValidator.validaConstDecl(decl.constDecl)
				error(erro.erro, erro.feature)
			}
		}else if(decl.typeDecl != null){
			if(typeDeclValidator.addIdsTypes(decl.typeDecl, idsTypes, typeDefs) != null){
				var String erro = typeDeclValidator.addIdsTypes(decl.typeDecl, idsTypes, typeDefs)
				error(erro, MyDslPackage.Literals.DECLARATION__TYPE_DECL);
			}
		}else{
			if(varDeclValidator.validaVarDecl(decl.varDecl,idsTypes) != null){
				var Exception erro = varDeclValidator.validaVarDecl(decl.varDecl, idsTypes);
				error(erro.erro, erro.feature)
			}
		}
	}
	
	@Check
	def checkExpression(Expression exp){
		if(expressionValidator.expressionValidator(exp) != null){
			var String erro = expressionValidator.expressionValidator(exp);
			error(erro, MyDslPackage.Literals.EXPRESSION__UNARY_EXPR);
		}
	}
	
	@Check
	def checkSwitch(SwitchStmt switchStmt){
		
	}
	
}
