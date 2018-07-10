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
 *   <li>{@link org.xtext.example.mydsl.myDsl.SwitchStmt#getSwitch <em>Switch</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.SwitchStmt#getSimpleStmt <em>Simple Stmt</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.SwitchStmt#getSwitchStmtLinha <em>Switch Stmt Linha</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSwitchStmt()
 * @model
 * @generated
 */
public interface SwitchStmt extends EObject
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSwitchStmt_Switch()
   * @model
   * @generated
   */
  String getSwitch();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.SwitchStmt#getSwitch <em>Switch</em>}' attribute.
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSwitchStmt_SimpleStmt()
   * @model containment="true"
   * @generated
   */
  SimpleStmt getSimpleStmt();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.SwitchStmt#getSimpleStmt <em>Simple Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Simple Stmt</em>' containment reference.
   * @see #getSimpleStmt()
   * @generated
   */
  void setSimpleStmt(SimpleStmt value);

  /**
   * Returns the value of the '<em><b>Switch Stmt Linha</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Switch Stmt Linha</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Switch Stmt Linha</em>' containment reference.
   * @see #setSwitchStmtLinha(SwitchStmtLinha)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSwitchStmt_SwitchStmtLinha()
   * @model containment="true"
   * @generated
   */
  SwitchStmtLinha getSwitchStmtLinha();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.SwitchStmt#getSwitchStmtLinha <em>Switch Stmt Linha</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Switch Stmt Linha</em>' containment reference.
   * @see #getSwitchStmtLinha()
   * @generated
   */
  void setSwitchStmtLinha(SwitchStmtLinha value);

} // SwitchStmt
