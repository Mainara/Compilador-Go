/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.validation

import java.util.ArrayList
import java.util.List
import org.eclipse.xtext.validation.Check
import org.xtext.example.mydsl.myDsl.Declaration
import org.xtext.example.mydsl.myDsl.Expression
import org.xtext.example.mydsl.myDsl.MyDslPackage
import org.xtext.example.mydsl.myDsl.MethodDecl
import java.lang.reflect.Array
import org.xtext.example.mydsl.myDsl.PointerType
import org.xtext.example.mydsl.myDsl.ParameterDecl
import org.xtext.example.mydsl.myDsl.MethodName
import org.xtext.example.mydsl.myDsl.TypeLit
import org.xtext.example.mydsl.myDsl.Type
import java.util.Set
import java.util.HashSet

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class MyDslValidator extends AbstractMyDslValidator {
	
	ConstDeclValidator constDeclValidator = new ConstDeclValidator();
	MethodDeclValidator methodDeclValidator = new MethodDeclValidator();
	
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
		methodDeclValidator.checkMethodDecl(methodDecl);
	}
	
	@Check
	def checkDecl(Declaration decl){
		if(decl.constDecl != null){
			if(constDeclValidator.validaConstDecl(decl.constDecl) != null){
				var String erro = constDeclValidator.validaConstDecl(decl.constDecl)
				error(erro, MyDslPackage.Literals.DECLARATION__CONST_DECL)
			}
		}else if(decl.typeDecl != null){
		}
	}
	
	@Check
	def checkExpression(Expression exp){
		if(exp != null){
			
		}
	}
	
}
