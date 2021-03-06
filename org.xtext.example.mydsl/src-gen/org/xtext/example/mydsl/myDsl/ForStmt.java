/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ForStmt#getFor <em>For</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ForStmt#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ForStmt#getForStmtLinha <em>For Stmt Linha</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ForStmt#getEmptyStmt <em>Empty Stmt</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ForStmt#getShortVarDecl <em>Short Var Decl</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ForStmt#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ForStmt#getPostStmt <em>Post Stmt</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ForStmt#getIdentifierList <em>Identifier List</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ForStmt#getRange <em>Range</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ForStmt#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getForStmt()
 * @model
 * @generated
 */
public interface ForStmt extends EObject
{
  /**
   * Returns the value of the '<em><b>For</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>For</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>For</em>' attribute.
   * @see #setFor(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getForStmt_For()
   * @model
   * @generated
   */
  String getFor();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ForStmt#getFor <em>For</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>For</em>' attribute.
   * @see #getFor()
   * @generated
   */
  void setFor(String value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getForStmt_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ForStmt#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

  /**
   * Returns the value of the '<em><b>For Stmt Linha</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>For Stmt Linha</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>For Stmt Linha</em>' containment reference.
   * @see #setForStmtLinha(ForStmtLinha)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getForStmt_ForStmtLinha()
   * @model containment="true"
   * @generated
   */
  ForStmtLinha getForStmtLinha();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ForStmt#getForStmtLinha <em>For Stmt Linha</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>For Stmt Linha</em>' containment reference.
   * @see #getForStmtLinha()
   * @generated
   */
  void setForStmtLinha(ForStmtLinha value);

  /**
   * Returns the value of the '<em><b>Empty Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Empty Stmt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Empty Stmt</em>' containment reference.
   * @see #setEmptyStmt(EmptyStmt)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getForStmt_EmptyStmt()
   * @model containment="true"
   * @generated
   */
  EmptyStmt getEmptyStmt();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ForStmt#getEmptyStmt <em>Empty Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Empty Stmt</em>' containment reference.
   * @see #getEmptyStmt()
   * @generated
   */
  void setEmptyStmt(EmptyStmt value);

  /**
   * Returns the value of the '<em><b>Short Var Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Short Var Decl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Short Var Decl</em>' containment reference.
   * @see #setShortVarDecl(ShortVarDecl)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getForStmt_ShortVarDecl()
   * @model containment="true"
   * @generated
   */
  ShortVarDecl getShortVarDecl();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ForStmt#getShortVarDecl <em>Short Var Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Short Var Decl</em>' containment reference.
   * @see #getShortVarDecl()
   * @generated
   */
  void setShortVarDecl(ShortVarDecl value);

  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(Condition)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getForStmt_Condition()
   * @model containment="true"
   * @generated
   */
  Condition getCondition();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ForStmt#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(Condition value);

  /**
   * Returns the value of the '<em><b>Post Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Post Stmt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Post Stmt</em>' containment reference.
   * @see #setPostStmt(PostStmt)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getForStmt_PostStmt()
   * @model containment="true"
   * @generated
   */
  PostStmt getPostStmt();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ForStmt#getPostStmt <em>Post Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Post Stmt</em>' containment reference.
   * @see #getPostStmt()
   * @generated
   */
  void setPostStmt(PostStmt value);

  /**
   * Returns the value of the '<em><b>Identifier List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier List</em>' containment reference.
   * @see #setIdentifierList(IdentifierList)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getForStmt_IdentifierList()
   * @model containment="true"
   * @generated
   */
  IdentifierList getIdentifierList();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ForStmt#getIdentifierList <em>Identifier List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier List</em>' containment reference.
   * @see #getIdentifierList()
   * @generated
   */
  void setIdentifierList(IdentifierList value);

  /**
   * Returns the value of the '<em><b>Range</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Range</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Range</em>' attribute.
   * @see #setRange(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getForStmt_Range()
   * @model
   * @generated
   */
  String getRange();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ForStmt#getRange <em>Range</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Range</em>' attribute.
   * @see #getRange()
   * @generated
   */
  void setRange(String value);

  /**
   * Returns the value of the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block</em>' containment reference.
   * @see #setBlock(Block)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getForStmt_Block()
   * @model containment="true"
   * @generated
   */
  Block getBlock();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ForStmt#getBlock <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block</em>' containment reference.
   * @see #getBlock()
   * @generated
   */
  void setBlock(Block value);

} // ForStmt
