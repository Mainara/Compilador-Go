/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Stmt Linha Linha</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.SwitchStmtLinhaLinha#getExprCaseClause <em>Expr Case Clause</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.SwitchStmtLinhaLinha#getTypekeyword <em>Typekeyword</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.SwitchStmtLinhaLinha#getTypeCaseClause <em>Type Case Clause</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSwitchStmtLinhaLinha()
 * @model
 * @generated
 */
public interface SwitchStmtLinhaLinha extends EObject
{
  /**
   * Returns the value of the '<em><b>Expr Case Clause</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.ExprCaseClause}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr Case Clause</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr Case Clause</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSwitchStmtLinhaLinha_ExprCaseClause()
   * @model containment="true"
   * @generated
   */
  EList<ExprCaseClause> getExprCaseClause();

  /**
   * Returns the value of the '<em><b>Typekeyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typekeyword</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typekeyword</em>' attribute.
   * @see #setTypekeyword(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSwitchStmtLinhaLinha_Typekeyword()
   * @model
   * @generated
   */
  String getTypekeyword();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.SwitchStmtLinhaLinha#getTypekeyword <em>Typekeyword</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Typekeyword</em>' attribute.
   * @see #getTypekeyword()
   * @generated
   */
  void setTypekeyword(String value);

  /**
   * Returns the value of the '<em><b>Type Case Clause</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.TypeCaseClause}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Case Clause</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Case Clause</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSwitchStmtLinhaLinha_TypeCaseClause()
   * @model containment="true"
   * @generated
   */
  EList<TypeCaseClause> getTypeCaseClause();

} // SwitchStmtLinhaLinha
