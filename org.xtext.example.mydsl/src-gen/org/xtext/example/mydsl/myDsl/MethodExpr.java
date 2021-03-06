/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.MethodExpr#getReceiverType <em>Receiver Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.MethodExpr#getMethodName <em>Method Name</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMethodExpr()
 * @model
 * @generated
 */
public interface MethodExpr extends EObject
{
  /**
   * Returns the value of the '<em><b>Receiver Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Receiver Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Receiver Type</em>' containment reference.
   * @see #setReceiverType(ReceiverType)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMethodExpr_ReceiverType()
   * @model containment="true"
   * @generated
   */
  ReceiverType getReceiverType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.MethodExpr#getReceiverType <em>Receiver Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Receiver Type</em>' containment reference.
   * @see #getReceiverType()
   * @generated
   */
  void setReceiverType(ReceiverType value);

  /**
   * Returns the value of the '<em><b>Method Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method Name</em>' containment reference.
   * @see #setMethodName(MethodName)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMethodExpr_MethodName()
   * @model containment="true"
   * @generated
   */
  MethodName getMethodName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.MethodExpr#getMethodName <em>Method Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method Name</em>' containment reference.
   * @see #getMethodName()
   * @generated
   */
  void setMethodName(MethodName value);

} // MethodExpr
