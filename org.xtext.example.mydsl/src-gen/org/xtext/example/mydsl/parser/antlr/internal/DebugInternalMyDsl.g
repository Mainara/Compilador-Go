/*
 * generated by Xtext 2.10.0
 */
grammar DebugInternalMyDsl;

// Rule Model
ruleModel:
	ruleGreeting
	*
;

// Rule Greeting
ruleGreeting:
	ruleSourceFile
;

// Rule FLOAT_LIT
ruleFLOAT_LIT:
	(
		RULE_DECIMALS
		ruleFLOAT_LIT_Linha
		    |
		RULE_DECIMALS
		'.'
		RULE_DECIMALS
		ruleFLOAT_LIT_Linha_Linha
		    |
		RULE_DECIMALS
		'.'
		ruleFLOAT_LIT_Linha_Linha_Linha
		    |
		'.'
		RULE_DECIMALS
		RULE_EXPONENT
	)
;

// Rule FLOAT_LIT_Linha_Linha_Linha
ruleFLOAT_LIT_Linha_Linha_Linha:
	(
		RULE_EXPONENT
		    |
		RULE_ANY_OTHER
	)
;

// Rule FLOAT_LIT_Linha_Linha
ruleFLOAT_LIT_Linha_Linha:
	(
		RULE_EXPONENT
		    |
		RULE_ANY_OTHER
	)
;

// Rule FLOAT_LIT_Linha
ruleFLOAT_LIT_Linha:
	(
		RULE_EXPONENT
		    |
		RULE_ANY_OTHER
	)
;

// Rule IMAGINARY_LIT
ruleIMAGINARY_LIT:
	(
		RULE_DECIMALS
		    |
		ruleFLOAT_LIT
	)
	'i'
;

// Rule Type
ruleType:
	(
		ruleTypeName
		    |
		ruleTypeLit
		    |
		'('
		ruleType
		')'
	)
;

// Rule TypeName
ruleTypeName:
	RULE_IDENTIFIER
	ruleTypeNameLinha
;

// Rule TypeNameLinha
ruleTypeNameLinha:
	(
		'.'
		RULE_IDENTIFIER
		    |
		RULE_ANY_OTHER
	)
;

// Rule PackageName
rulePackageName:
	RULE_IDENTIFIER
;

// Rule TypeLit
ruleTypeLit:
	(
		'['
		ruleTypeLitLinha
		    |
		ruleStructType
		    |
		rulePointerType
		    |
		ruleFunctionType
		    |
		ruleInterfaceType
		    |
		ruleMapType
		    |
		ruleChannelType
	)
;

// Rule TypeLitLinha
ruleTypeLitLinha:
	(
		ruleArrayLength
		']'
		ruleElementType
		    |
		']'
		ruleElementType
	)
;

// Rule ArrayLength
ruleArrayLength:
	ruleExpression
;

// Rule ElementType
ruleElementType:
	ruleType
;

// Rule StructType
ruleStructType:
	RULE_STRUCT
	'{'
	(
		ruleFieldDecl
		';'
	)*
	'}'
;

// Rule FieldDecl
ruleFieldDecl:
	(
		ruleIdentifierList
		ruleType
		    |
		ruleEmbeddedField
	)
	ruleTag?
;

// Rule EmbeddedField
ruleEmbeddedField:
	'*'?
	ruleTypeName
;

// Rule Tag
ruleTag:
	RULE_STRING_LIT
;

// Rule PointerType
rulePointerType:
	'*'
	ruleBaseType
;

// Rule BaseType
ruleBaseType:
	ruleType
;

// Rule FunctionType
ruleFunctionType:
	RULE_FUNC
	ruleSignature
;

// Rule Signature
ruleSignature:
	ruleParameters
	(
		(ruleResult)=>
		ruleResult
	)?
;

// Rule Result
ruleResult:
	(
		(
			(ruleParameters)=>
			ruleParameters
		)
		    |
		ruleType
	)
;

// Rule Parameters
ruleParameters:
	'('
	(
		ruleParameterList
		','?
	)?
	')'
;

// Rule ParameterList
ruleParameterList:
	ruleParameterDecl
	(
		','
		ruleParameterDecl
	)*
;

// Rule ParameterDecl
ruleParameterDecl:
	ruleIdentifierList?
	'...'?
	ruleType
;

// Rule InterfaceType
ruleInterfaceType:
	RULE_INTERFACE
	'{'
	ruleMethodSpec
	';'
	'}'
;

// Rule MethodSpec
ruleMethodSpec:
	(
		ruleMethodName
		ruleSignature
		    |
		ruleInterfaceTypeName
	)
;

// Rule MethodName
ruleMethodName:
	RULE_IDENTIFIER
;

// Rule InterfaceTypeName
ruleInterfaceTypeName:
	ruleTypeName
;

// Rule MapType
ruleMapType:
	RULE_MAP
	'['
	ruleKeyType
	']'
	ruleElementType
;

// Rule KeyType
ruleKeyType:
	ruleType
;

// Rule ChannelType
ruleChannelType:
	(
		RULE_CHAN
		ruleChannelTypeLinha
		    |
		'<-'
		RULE_CHAN
	)
	ruleElementType
;

// Rule ChannelTypeLinha
ruleChannelTypeLinha:
	(
		'<-'
		    |
		RULE_ANY_OTHER
	)
;

// Rule Expression
ruleExpression:
	ruleUnaryExpr
	ruleExpression_Linha
;

// Rule Expression_Linha
ruleExpression_Linha:
	(
		rulebinary_op
		ruleExpression
		ruleExpression_Linha
		    |
		RULE_ANY_OTHER
	)
;

// Rule UnaryExpr
ruleUnaryExpr:
	(
		rulePrimaryExpr
		    |
		RULE_UNARY_OP
		ruleUnaryExpr
	)
;

// Rule binary_op
rulebinary_op:
	(
		'||'
		    |
		'&&'
		    |
		RULE_REL_OP
		    |
		RULE_ADD_OP
		    |
		RULE_MUL_OP
	)
;

// Rule PrimaryExpr
rulePrimaryExpr:
	(
		ruleBasicLit
		rulePrimaryExprLinha
		    |
		ruleStructType
		rulePrimaryExprFatFatFatFat
		    |
		ruleMapType
		rulePrimaryExprFatFatFatFat
		    |
		RULE_FUNC
		ruleSignature
		rulePrimaryExprFatFatFatFatFat
		rulePrimaryExprLinha
		    |
		'...'
		']'
		ruleElementType
		ruleLiteralValue
		rulePrimaryExprLinha
		    |
		ruleName
		rulePrimaryExprFatFatFat
		rulePrimaryExprLinha
		    |
		'('
		rulePrimaryExprFatFat
		rulePrimaryExprLinha
		    |
		'['
		ruleTypeLitLinha
		rulePrimaryExprFatFatFatFatFatFat
		rulePrimaryExprLinha
		    |
		rulePointerType
		rulePrimaryExprFat
		rulePrimaryExprLinha
		    |
		ruleInterfaceType
		rulePrimaryExprFat
		rulePrimaryExprLinha
		    |
		ruleChannelType
		rulePrimaryExprFat
		rulePrimaryExprLinha
	)
;

// Rule PrimaryExprFatFatFatFatFatFat
rulePrimaryExprFatFatFatFatFatFat:
	(
		ruleLiteralValue
		    |
		rulePrimaryExprFat
	)
;

// Rule PrimaryExprFatFatFatFatFat
rulePrimaryExprFatFatFatFatFat:
	(
		ruleFunctionBody
		    |
		rulePrimaryExprFat
	)
;

// Rule PrimaryExprFatFatFatFat
rulePrimaryExprFatFatFatFat:
	(
		ruleLiteralValue
		    |
		rulePrimaryExprFat
	)
;

// Rule PrimaryExprFatFatFat
rulePrimaryExprFatFatFat:
	(
		ruleLiteralValue
		    |
		rulePrimaryExprFat
		    |
		RULE_ANY_OTHER
	)
;

// Rule Name
ruleName:
	RULE_IDENTIFIER
	ruleNameLinha
;

// Rule NameLinha
ruleNameLinha:
	(
		'.'
		RULE_IDENTIFIER
		    |
		RULE_ANY_OTHER
	)
;

// Rule PrimaryExprFatFat
rulePrimaryExprFatFat:
	(
		(
			(ruleExpression)=>
			ruleExpression
		)
		')'
		    |
		ruleType
		')'
		rulePrimaryExprFat
	)
;

// Rule PrimaryExprFat
rulePrimaryExprFat:
	(
		'('
		ruleExpression
		','?
		')'
		    |
		'.'
		ruleMethodName
	)
;

// Rule PrimaryExprLinha
rulePrimaryExprLinha:
	(
		'.'
		rulePrimaryExprLinhaLinha
		rulePrimaryExprLinha
		    |
		'['
		rulePrimaryExprLinhaLinhaLinha
		rulePrimaryExprLinha
		    |
		ruleArguments
		rulePrimaryExprLinha
	)
;

// Rule PrimaryExprLinhaLinha
rulePrimaryExprLinhaLinha:
	(
		RULE_IDENTIFIER
		    |
		'('
		ruleType
		')'
	)
;

// Rule PrimaryExprLinhaLinhaLinha
rulePrimaryExprLinhaLinhaLinha:
	(
		ruleExpression
		rulePrimaryExprLinhaLinhaLinhaLinha
		    |
		':'
		ruleSliceLinha
	)
;

// Rule PrimaryExprLinhaLinhaLinhaLinha
rulePrimaryExprLinhaLinhaLinhaLinha:
	(
		']'
		    |
		':'
		ruleSliceLinha
	)
;

// Rule SliceLinha
ruleSliceLinha:
	(
		':'
		ruleExpression?
		']'
		    |
		ruleExpression
		':'
		ruleExpression
		']'
	)
;

// Rule Arguments
ruleArguments:
	'('
	(
		(
			(
				(ruleExpressionList)=>
				ruleExpressionList
			)
			    |
			ruleType
			(
				','
				ruleExpressionList
			)?
		)
		'...'?
		','?
	)?
	')'
;

// Rule ExpressionList
ruleExpressionList:
	ruleExpression
	(
		','
		ruleExpression
	)*
;

// Rule IdentifierList
ruleIdentifierList:
	RULE_IDENTIFIER
	(
		','
		RULE_IDENTIFIER
	)*
;

// Rule Block
ruleBlock:
	'{'
	ruleStatementList
	'}'
;

// Rule StatementList
ruleStatementList:
	(
		ruleStatement
		';'
	)*
;

// Rule Statement
ruleStatement:
	(
		ruleDeclaration
		    |
		ruleLabeledStmt
		    |
		ruleSimpleStmt
		    |
		ruleGoStmt
		    |
		ruleReturnStmt
		    |
		ruleBreakStmt
		    |
		ruleContinueStmt
		    |
		ruleGotoStmt
		    |
		ruleFallthroughStmt
		    |
		ruleBlock
		    |
		ruleIfStmt
		    |
		ruleSwitchStmt
		    |
		ruleSelectStmt
		    |
		ruleForStmt
		    |
		ruleDeferStmt
	)
;

// Rule DeferStmt
ruleDeferStmt:
	RULE_DEFER
	ruleExpression
;

// Rule ForStmt
ruleForStmt:
	RULE_FOR
	(
		ruleExpression
		ruleForStmtLinha
	)?
	ruleBlock
;

// Rule ForStmtLinha
ruleForStmtLinha:
	(
		(
			ruleSimpleStmtLinha
			    |
			RULE_IDENTIFIER
			(
				','
				RULE_IDENTIFIER
			)*
			':='
			ruleExpression
			(
				','
				ruleExpression
			)*
		)
		';'
		ruleCondition
		';'
		(
			ruleExpression
			ruleSimpleStmtLinha
			    |
			RULE_IDENTIFIER
			(
				','
				RULE_IDENTIFIER
			)*
			':='
			ruleExpression
			(
				','
				ruleExpression
			)*
			    |
			(
				','
				ruleExpression
			)*
			'='
			    |
			ruleIdentifierList
			':='
		)
		RULE_RANGE
		ruleExpression
		    |
		RULE_ANY_OTHER
	)
;

// Rule Condition
ruleCondition:
	ruleExpression
;

// Rule SelectStmt
ruleSelectStmt:
	RULE_SELECT
	'{'
	ruleCommClause*
	'}'
;

// Rule CommClause
ruleCommClause:
	ruleCommCase
	':'
	ruleStatementList
;

// Rule CommCase
ruleCommCase:
	(
		RULE_CASE
		ruleExpression
		ruleCommCaseLinha
		    |
		RULE_DEFAULT
	)
;

// Rule CommCaseLinha
ruleCommCaseLinha:
	(
		'<-'
		ruleExpression
		    |
		(
			(
				','
				ruleExpression
			)*
			'='
			    |
			ruleIdentifierList
			':='
		)
		ruleRecvExpr
	)
;

// Rule RecvExpr
ruleRecvExpr:
	ruleExpression
;

// Rule SwitchStmt
ruleSwitchStmt:
	RULE_SWITCH
	ruleSimpleStmt
	';'
	ruleSwitchStmtLinha
;

// Rule SwitchStmtLinha
ruleSwitchStmtLinha:
	(
		ruleExpression
		'{'
		ruleExprCaseClause*
		'}'
		    |
		ruleTypeSwitchGuard
		'{'
		ruleTypeCaseClause*
		'}'
	)
;

// Rule TypeCaseClause
ruleTypeCaseClause:
	ruleTypeSwitchCase
	':'
	ruleStatementList
;

// Rule TypeSwitchCase
ruleTypeSwitchCase:
	(
		RULE_CASE
		ruleTypeList
		    |
		RULE_DEFAULT
	)
;

// Rule TypeList
ruleTypeList:
	ruleType
	(
		','
		ruleType
	)*
;

// Rule TypeSwitchGuard
ruleTypeSwitchGuard:
	RULE_IDENTIFIER
	':='
	rulePrimaryExpr
	'.'
	'('
	RULE_TYPEKEYWORD
	')'
;

// Rule ExprCaseClause
ruleExprCaseClause:
	ruleExprSwitchCase
	':'
	ruleStatementList
;

// Rule ExprSwitchCase
ruleExprSwitchCase:
	(
		RULE_CASE
		ruleExpressionList
		    |
		RULE_DEFAULT
	)
;

// Rule IfStmt
ruleIfStmt:
	RULE_IF
	ruleSimpleStmt
	';'
	ruleExpression
	ruleBlock
	RULE_ELSE
	(
		ruleIfStmt
		    |
		ruleBlock
	)
;

// Rule FallthroughStmt
ruleFallthroughStmt:
	RULE_FALLTHROUGH
;

// Rule GotoStmt
ruleGotoStmt:
	RULE_GOTO
	ruleLabel
;

// Rule ContinueStmt
ruleContinueStmt:
	RULE_CONTINUE
	ruleLabel
;

// Rule BreakStmt
ruleBreakStmt:
	RULE_BREAK
	ruleLabel
;

// Rule ReturnStmt
ruleReturnStmt:
	RULE_RETURN
	ruleExpressionList
;

// Rule GoStmt
ruleGoStmt:
	RULE_GO
	ruleLabel
;

// Rule SimpleStmt
ruleSimpleStmt:
	(
		ruleExpression
		ruleSimpleStmtLinha
		    |
		RULE_IDENTIFIER
		(
			','
			RULE_IDENTIFIER
		)*
		':='
		ruleExpression
		(
			','
			ruleExpression
		)*
	)
;

// Rule SimpleStmtLinha
ruleSimpleStmtLinha:
	(
		'<-'
		ruleExpression
		    |
		(
			'++'
			    |
			'--'
		)
		    |
		(
			','
			ruleExpression
		)*
		ruleassign_op
		ruleExpression
		(
			','
			ruleExpression
		)*
	)
;

// Rule assign_op
ruleassign_op:
	(
		RULE_ADD_OP
		    |
		RULE_MUL_OP
	)
	'='
;

// Rule LabeledStmt
ruleLabeledStmt:
	ruleLabel
	':'
	ruleStatement
;

// Rule Label
ruleLabel:
	RULE_IDENTIFIER
;

// Rule Declaration
ruleDeclaration:
	(
		ruleConstDecl
		    |
		ruleTypeDecl
		    |
		ruleVarDecl
	)
;

// Rule TopLevelDecl
ruleTopLevelDecl:
	(
		ruleDeclaration
		    |
		ruleFunctionDecl
		    |
		ruleMethodDecl
	)
;

// Rule ConstDecl
ruleConstDecl:
	RULE_CONST
	(
		ruleConstSpec
		    |
		'('
		(
			ruleConstSpec
			';'
		)*
		')'
	)
;

// Rule ConstSpec
ruleConstSpec:
	ruleIdentifierList
	(
		ruleType?
		'='
		ruleExpressionList
	)?
;

// Rule TypeDecl
ruleTypeDecl:
	RULE_TYPEKEYWORD
	(
		ruleTypeSpec
		    |
		'('
		(
			ruleTypeSpec
			';'
		)*
		')'
	)
;

// Rule TypeSpec
ruleTypeSpec:
	(
		ruleAliasDecl
		    |
		ruleTypeDef
	)
;

// Rule AliasDecl
ruleAliasDecl:
	RULE_IDENTIFIER
	'='
	ruleType
;

// Rule TypeDef
ruleTypeDef:
	RULE_IDENTIFIER
	ruleType
;

// Rule VarDecl
ruleVarDecl:
	RULE_VAR
	(
		ruleVarSpec
		    |
		'('
		(
			ruleVarSpec
			';'
		)*
		')'
	)
;

// Rule VarSpec
ruleVarSpec:
	ruleIdentifierList
	(
		ruleType
		(
			'='
			ruleExpressionList
		)?
		    |
		'='
		ruleExpressionList
	)
;

// Rule FunctionDecl
ruleFunctionDecl:
	RULE_FUNC
	ruleFunctionName
	ruleSignature
	ruleFunctionBody?
;

// Rule FunctionName
ruleFunctionName:
	RULE_IDENTIFIER
;

// Rule FunctionBody
ruleFunctionBody:
	ruleBlock
;

// Rule MethodDecl
ruleMethodDecl:
	RULE_FUNC
	ruleReceiver
	ruleMethodName
	ruleSignature
	ruleFunctionBody?
;

// Rule Receiver
ruleReceiver:
	ruleParameters
;

// Rule BasicLit
ruleBasicLit:
	(
		RULE_INT_LIT
		    |
		RULE_STRING_LIT
		    |
		ruleFLOAT_LIT
		    |
		ruleIMAGINARY_LIT
	)
;

// Rule LiteralValue
ruleLiteralValue:
	'{'
	(
		(
			(ruleKey
			':'
			)=>
			ruleElementList
		)
		','?
	)?
	'}'
;

// Rule ElementList
ruleElementList:
	(
		(ruleKey
		':'
		)=>
		ruleKeyedElement
	)
	(
		','
		(
			(ruleKey
			':'
			)=>
			ruleKeyedElement
		)
	)*
;

// Rule KeyedElement
ruleKeyedElement:
	(
		(ruleKey
		':'
		)=>
		ruleKey
		':'
	)?
	ruleElement
;

// Rule Key
ruleKey:
	(
		ruleFieldName
		    |
		ruleExpression
		    |
		ruleLiteralValue
	)
;

// Rule FieldName
ruleFieldName:
	RULE_IDENTIFIER
;

// Rule Element
ruleElement:
	(
		ruleExpression
		    |
		ruleLiteralValue
	)
;

// Rule SourceFile
ruleSourceFile:
	rulePackageClause
	';'
	(
		ruleImportDecl
		';'
	)*
	(
		ruleTopLevelDecl
		';'
	)*
;

// Rule PackageClause
rulePackageClause:
	RULE_PACKAGE
	rulePackageName
;

// Rule ImportDecl
ruleImportDecl:
	RULE_IMPORT
	(
		ruleImportSpec
		    |
		'('
		(
			ruleImportSpec
			';'
		)*
		')'
	)
;

// Rule ImportSpec
ruleImportSpec:
	(
		'.'
		    |
		rulePackageName
	)?
	ruleImportPath
;

// Rule ImportPath
ruleImportPath:
	RULE_STRING_LIT
;

fragment RULE_NEWLINE : ('\n'|'\r'|'\n\r');

fragment RULE_LETTER : ('a'..'z'|'A'..'Z'|'_');

fragment RULE_DECIMAL_DIGIT : '0'..'9';

fragment RULE_OCTAL_DIGIT : '0'..'7';

fragment RULE_HEX_DIGIT : ('0'..'9'|'A'..'F'|'a'..'f');

RULE_BREAK : 'break';

RULE_DEFAULT : 'default';

RULE_FUNC : 'func';

RULE_INTERFACE : 'interface';

RULE_SELECT : 'select';

RULE_CASE : 'case';

RULE_DEFER : 'defer';

RULE_GO : 'go';

RULE_MAP : 'map';

RULE_STRUCT : 'struct';

RULE_CHAN : 'chan';

RULE_ELSE : 'else';

RULE_GOTO : 'goto';

RULE_PACKAGE : 'package';

RULE_SWITCH : 'switch';

RULE_CONST : 'const';

RULE_FALLTHROUGH : 'fallthrough';

RULE_IF : 'if';

RULE_RANGE : 'range';

RULE_TYPEKEYWORD : 'type';

RULE_CONTINUE : 'continue';

RULE_FOR : 'for';

RULE_IMPORT : 'import';

RULE_RETURN : 'return';

RULE_VAR : 'var';

RULE_IDENTIFIER : RULE_LETTER (RULE_LETTER|'0'..'9')*;

fragment RULE_UNICODE_CHAR : 'fazeer';

RULE_INT_LIT : ('1'..'9' RULE_DECIMAL_DIGIT*|'0' RULE_OCTAL_DIGIT*|'0' ('x'|'X') RULE_HEX_DIGIT+);

RULE_DECIMALS : RULE_INT;

RULE_EXPONENT : ('e'|'E') ('+'|'-')? RULE_DECIMALS;

RULE_RUNE_LIT : '\'' (RULE_UNICODE_VALUE|RULE_BYTE_VALUE) '\'';

fragment RULE_UNICODE_VALUE : (RULE_UNICODE_CHAR|RULE_LITTLE_U_VALUE|RULE_BIG_U_VALUE|RULE_ESCAPED_CHAR);

fragment RULE_BYTE_VALUE : (RULE_OCTAL_BYTE_VALUE|RULE_HEX_BYTE_VALUE);

fragment RULE_OCTAL_BYTE_VALUE : '\\' RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT;

fragment RULE_HEX_BYTE_VALUE : '\\' 'x' RULE_HEX_DIGIT RULE_HEX_DIGIT;

fragment RULE_LITTLE_U_VALUE : '\\' 'u' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT;

fragment RULE_BIG_U_VALUE : '\\' 'U' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT;

fragment RULE_ESCAPED_CHAR : '\\' ('a'|'b'|'f'|'n'|'r'|'t'|'v'|'\\'|'\''|'"');

RULE_STRING_LIT : (RULE_RAW_STRING_LIT|RULE_INTERPRETED_STRING_LIT);

fragment RULE_RAW_STRING_LIT : '\'' (RULE_UNICODE_CHAR|RULE_NEWLINE)* '\'';

fragment RULE_INTERPRETED_STRING_LIT : '"' (RULE_UNICODE_VALUE|RULE_BYTE_VALUE)* '"';

RULE_REL_OP : ('=='|'!='|'<'|'<='|'>'|'>=');

RULE_ADD_OP : ('+'|'-'|'|'|'^');

RULE_MUL_OP : ('*'|'/'|'%'|'<<'|'>>'|'&'|'&^');

RULE_UNARY_OP : ('+'|'-'|'!'|'^'|'*'|'&'|'<-');

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

fragment RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/' {skip();};

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')? {skip();};

RULE_WS : (' '|'\t'|'\r'|'\n')+ {skip();};

RULE_ANY_OTHER : .;
