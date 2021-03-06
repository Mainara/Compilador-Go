/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Post Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.PostStmt#getSimpleStmt <em>Simple Stmt</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPostStmt()
 * @model
 * @generated
 */
public interface PostStmt extends EObject
{
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPostStmt_SimpleStmt()
   * @model containment="true"
   * @generated
   */
  SimpleStmt getSimpleStmt();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.PostStmt#getSimpleStmt <em>Simple Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Simple Stmt</em>' containment reference.
   * @see #getSimpleStmt()
   * @generated
   */
  void setSimpleStmt(SimpleStmt value);

} // PostStmt
