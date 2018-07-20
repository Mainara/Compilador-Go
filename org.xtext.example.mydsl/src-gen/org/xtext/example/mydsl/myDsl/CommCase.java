/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comm Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.CommCase#getCase <em>Case</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.CommCase#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.CommCase#getCommCaseLinha <em>Comm Case Linha</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.CommCase#getDefault <em>Default</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCommCase()
 * @model
 * @generated
 */
public interface CommCase extends EObject
{
  /**
   * Returns the value of the '<em><b>Case</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Case</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Case</em>' attribute.
   * @see #setCase(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCommCase_Case()
   * @model
   * @generated
   */
  String getCase();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.CommCase#getCase <em>Case</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Case</em>' attribute.
   * @see #getCase()
   * @generated
   */
  void setCase(String value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCommCase_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.CommCase#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Comm Case Linha</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comm Case Linha</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comm Case Linha</em>' containment reference.
   * @see #setCommCaseLinha(CommCaseLinha)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCommCase_CommCaseLinha()
   * @model containment="true"
   * @generated
   */
  CommCaseLinha getCommCaseLinha();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.CommCase#getCommCaseLinha <em>Comm Case Linha</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comm Case Linha</em>' containment reference.
   * @see #getCommCaseLinha()
   * @generated
   */
  void setCommCaseLinha(CommCaseLinha value);

  /**
   * Returns the value of the '<em><b>Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default</em>' attribute.
   * @see #setDefault(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCommCase_Default()
   * @model
   * @generated
   */
  String getDefault();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.CommCase#getDefault <em>Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default</em>' attribute.
   * @see #getDefault()
   * @generated
   */
  void setDefault(String value);

} // CommCase