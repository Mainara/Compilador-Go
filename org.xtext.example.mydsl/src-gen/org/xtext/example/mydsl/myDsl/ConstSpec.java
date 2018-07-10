/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Const Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ConstSpec#getIdentifierList <em>Identifier List</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ConstSpec#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ConstSpec#getExpressionList <em>Expression List</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getConstSpec()
 * @model
 * @generated
 */
public interface ConstSpec extends EObject
{
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getConstSpec_IdentifierList()
   * @model containment="true"
   * @generated
   */
  IdentifierList getIdentifierList();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ConstSpec#getIdentifierList <em>Identifier List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier List</em>' containment reference.
   * @see #getIdentifierList()
   * @generated
   */
  void setIdentifierList(IdentifierList value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Type)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getConstSpec_Type()
   * @model containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ConstSpec#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Expression List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression List</em>' containment reference.
   * @see #setExpressionList(ExpressionList)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getConstSpec_ExpressionList()
   * @model containment="true"
   * @generated
   */
  ExpressionList getExpressionList();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ConstSpec#getExpressionList <em>Expression List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression List</em>' containment reference.
   * @see #getExpressionList()
   * @generated
   */
  void setExpressionList(ExpressionList value);

} // ConstSpec
