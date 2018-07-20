/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.SwitchStmt#getExprSwitchStmt <em>Expr Switch Stmt</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.SwitchStmt#getTypeSwitchStmt <em>Type Switch Stmt</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSwitchStmt()
 * @model
 * @generated
 */
public interface SwitchStmt extends EObject
{
  /**
   * Returns the value of the '<em><b>Expr Switch Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr Switch Stmt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr Switch Stmt</em>' containment reference.
   * @see #setExprSwitchStmt(ExprSwitchStmt)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSwitchStmt_ExprSwitchStmt()
   * @model containment="true"
   * @generated
   */
  ExprSwitchStmt getExprSwitchStmt();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.SwitchStmt#getExprSwitchStmt <em>Expr Switch Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr Switch Stmt</em>' containment reference.
   * @see #getExprSwitchStmt()
   * @generated
   */
  void setExprSwitchStmt(ExprSwitchStmt value);

  /**
   * Returns the value of the '<em><b>Type Switch Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Switch Stmt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Switch Stmt</em>' containment reference.
   * @see #setTypeSwitchStmt(TypeSwitchStmt)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSwitchStmt_TypeSwitchStmt()
   * @model containment="true"
   * @generated
   */
  TypeSwitchStmt getTypeSwitchStmt();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.SwitchStmt#getTypeSwitchStmt <em>Type Switch Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Switch Stmt</em>' containment reference.
   * @see #getTypeSwitchStmt()
   * @generated
   */
  void setTypeSwitchStmt(TypeSwitchStmt value);

} // SwitchStmt