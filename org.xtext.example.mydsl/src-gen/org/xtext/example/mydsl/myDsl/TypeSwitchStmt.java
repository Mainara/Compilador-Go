/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Switch Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.TypeSwitchStmt#getSwitch <em>Switch</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.TypeSwitchStmt#getSimpleStmt <em>Simple Stmt</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.TypeSwitchStmt#getTypeSwitchGuard <em>Type Switch Guard</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.TypeSwitchStmt#getTypeCaseClause <em>Type Case Clause</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getTypeSwitchStmt()
 * @model
 * @generated
 */
public interface TypeSwitchStmt extends EObject
{
  /**
   * Returns the value of the '<em><b>Switch</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Switch</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Switch</em>' attribute.
   * @see #setSwitch(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getTypeSwitchStmt_Switch()
   * @model
   * @generated
   */
  String getSwitch();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.TypeSwitchStmt#getSwitch <em>Switch</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Switch</em>' attribute.
   * @see #getSwitch()
   * @generated
   */
  void setSwitch(String value);

  /**
   * Returns the value of the '<em><b>Simple Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Simple Stmt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Simple Stmt</em>' containment reference.
   * @see #setSimpleStmt(SimpleStmt)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getTypeSwitchStmt_SimpleStmt()
   * @model containment="true"
   * @generated
   */
  SimpleStmt getSimpleStmt();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.TypeSwitchStmt#getSimpleStmt <em>Simple Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Simple Stmt</em>' containment reference.
   * @see #getSimpleStmt()
   * @generated
   */
  void setSimpleStmt(SimpleStmt value);

  /**
   * Returns the value of the '<em><b>Type Switch Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Switch Guard</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Switch Guard</em>' containment reference.
   * @see #setTypeSwitchGuard(TypeSwitchGuard)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getTypeSwitchStmt_TypeSwitchGuard()
   * @model containment="true"
   * @generated
   */
  TypeSwitchGuard getTypeSwitchGuard();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.TypeSwitchStmt#getTypeSwitchGuard <em>Type Switch Guard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Switch Guard</em>' containment reference.
   * @see #getTypeSwitchGuard()
   * @generated
   */
  void setTypeSwitchGuard(TypeSwitchGuard value);

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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getTypeSwitchStmt_TypeCaseClause()
   * @model containment="true"
   * @generated
   */
  EList<TypeCaseClause> getTypeCaseClause();

} // TypeSwitchStmt
