/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Stmt Linha</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ForStmtLinha#getVazio <em>Vazio</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ForStmtLinha#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ForStmtLinha#getForStmtLinhaLinha <em>For Stmt Linha Linha</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ForStmtLinha#getExpression1 <em>Expression1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ForStmtLinha#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ForStmtLinha#getPostStmt <em>Post Stmt</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getForStmtLinha()
 * @model
 * @generated
 */
public interface ForStmtLinha extends EObject
{
  /**
   * Returns the value of the '<em><b>Vazio</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vazio</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vazio</em>' attribute.
   * @see #setVazio(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getForStmtLinha_Vazio()
   * @model
   * @generated
   */
  String getVazio();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ForStmtLinha#getVazio <em>Vazio</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vazio</em>' attribute.
   * @see #getVazio()
   * @generated
   */
  void setVazio(String value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getForStmtLinha_Expression()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getExpression();

  /**
   * Returns the value of the '<em><b>For Stmt Linha Linha</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>For Stmt Linha Linha</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>For Stmt Linha Linha</em>' containment reference.
   * @see #setForStmtLinhaLinha(ForStmtLinhaLinha)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getForStmtLinha_ForStmtLinhaLinha()
   * @model containment="true"
   * @generated
   */
  ForStmtLinhaLinha getForStmtLinhaLinha();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ForStmtLinha#getForStmtLinhaLinha <em>For Stmt Linha Linha</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>For Stmt Linha Linha</em>' containment reference.
   * @see #getForStmtLinhaLinha()
   * @generated
   */
  void setForStmtLinhaLinha(ForStmtLinhaLinha value);

  /**
   * Returns the value of the '<em><b>Expression1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression1</em>' containment reference.
   * @see #setExpression1(Expression)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getForStmtLinha_Expression1()
   * @model containment="true"
   * @generated
   */
  Expression getExpression1();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ForStmtLinha#getExpression1 <em>Expression1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression1</em>' containment reference.
   * @see #getExpression1()
   * @generated
   */
  void setExpression1(Expression value);

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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getForStmtLinha_Condition()
   * @model containment="true"
   * @generated
   */
  Condition getCondition();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ForStmtLinha#getCondition <em>Condition</em>}' containment reference.
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getForStmtLinha_PostStmt()
   * @model containment="true"
   * @generated
   */
  PostStmt getPostStmt();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ForStmtLinha#getPostStmt <em>Post Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Post Stmt</em>' containment reference.
   * @see #getPostStmt()
   * @generated
   */
  void setPostStmt(PostStmt value);

} // ForStmtLinha