package org.xtext.example.mydsl;

import org.eclipse.xtext.diagnostics.Diagnostic;
import org.eclipse.xtext.nodemodel.SyntaxErrorMessage;
import org.eclipse.xtext.parser.antlr.ISyntaxErrorMessageProvider;

public class MyDslSyntaxErrorMessageProvider implements ISyntaxErrorMessageProvider{

	@Override
	public SyntaxErrorMessage getSyntaxErrorMessage(IParserErrorContext context) {
		String message = context.getDefaultMessage();
		if(message.contains("missing EOF at")){
			return new SyntaxErrorMessage("ERRO Léxico: Não casa com nenhum padrão", Diagnostic.SYNTAX_DIAGNOSTIC);
		}else if(message.contains("no viable alternative at input")){
			return new SyntaxErrorMessage("ERRO Léxico: Não casa com nenhum padrão", Diagnostic.SYNTAX_DIAGNOSTIC);
			
		}else{
			return new SyntaxErrorMessage(message, Diagnostic.SYNTAX_DIAGNOSTIC);
			//System.out.println(message);
			//return null;
		}
	}

	@Override
	public SyntaxErrorMessage getSyntaxErrorMessage(IValueConverterErrorContext context) {
		System.out.println(context.getDefaultMessage());
		return new SyntaxErrorMessage(context.getDefaultMessage(),
				Diagnostic.SYNTAX_DIAGNOSTIC);
	}

}
