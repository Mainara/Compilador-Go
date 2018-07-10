/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Lit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.FunctionLit#getFunc <em>Func</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.FunctionLit#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.FunctionLit#getFunctionBody <em>Function Body</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFunctionLit()
 * @model
 * @generated
 */
public interface FunctionLit extends EObject
{
  /**
   * Returns the value of the '<em><b>Func</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Func</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Func</em>' attribute.
   * @see #setFunc(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFunctionLit_Func()
   * @model
   * @generated
   */
  String getFunc();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.FunctionLit#getFunc <em>Func</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Func</em>' attribute.
   * @see #getFunc()
   * @generated
   */
  void setFunc(String value);

  /**
   * Returns the value of the '<em><b>Signature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Signature</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Signature</em>' containment reference.
   * @see #setSignature(Signature)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFunctionLit_Signature()
   * @model containment="true"
   * @generated
   */
  Signature getSignature();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.FunctionLit#getSignature <em>Signature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Signature</em>' containment reference.
   * @see #getSignature()
   * @generated
   */
  void setSignature(Signature value);

  /**
   * Returns the value of the '<em><b>Function Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function Body</em>' containment reference.
   * @see #setFunctionBody(FunctionBody)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFunctionLit_FunctionBody()
   * @model containment="true"
   * @generated
   */
  FunctionBody getFunctionBody();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.FunctionLit#getFunctionBody <em>Function Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function Body</em>' containment reference.
   * @see #getFunctionBody()
   * @generated
   */
  void setFunctionBody(FunctionBody value);

} // FunctionLit
