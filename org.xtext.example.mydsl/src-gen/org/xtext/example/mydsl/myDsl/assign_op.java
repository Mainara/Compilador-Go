/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>assign op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.assign_op#getADD_OP <em>ADD OP</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.assign_op#getMUL_OP <em>MUL OP</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getassign_op()
 * @model
 * @generated
 */
public interface assign_op extends EObject
{
  /**
   * Returns the value of the '<em><b>ADD OP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>ADD OP</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>ADD OP</em>' attribute.
   * @see #setADD_OP(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getassign_op_ADD_OP()
   * @model
   * @generated
   */
  String getADD_OP();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.assign_op#getADD_OP <em>ADD OP</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>ADD OP</em>' attribute.
   * @see #getADD_OP()
   * @generated
   */
  void setADD_OP(String value);

  /**
   * Returns the value of the '<em><b>MUL OP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>MUL OP</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>MUL OP</em>' attribute.
   * @see #setMUL_OP(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getassign_op_MUL_OP()
   * @model
   * @generated
   */
  String getMUL_OP();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.assign_op#getMUL_OP <em>MUL OP</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>MUL OP</em>' attribute.
   * @see #getMUL_OP()
   * @generated
   */
  void setMUL_OP(String value);

} // assign_op
