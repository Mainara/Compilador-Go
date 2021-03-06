/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goto Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.GotoStmt#getGoto <em>Goto</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.GotoStmt#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getGotoStmt()
 * @model
 * @generated
 */
public interface GotoStmt extends EObject
{
  /**
   * Returns the value of the '<em><b>Goto</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Goto</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Goto</em>' attribute.
   * @see #setGoto(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getGotoStmt_Goto()
   * @model
   * @generated
   */
  String getGoto();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.GotoStmt#getGoto <em>Goto</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Goto</em>' attribute.
   * @see #getGoto()
   * @generated
   */
  void setGoto(String value);

  /**
   * Returns the value of the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' containment reference.
   * @see #setLabel(Label)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getGotoStmt_Label()
   * @model containment="true"
   * @generated
   */
  Label getLabel();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.GotoStmt#getLabel <em>Label</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' containment reference.
   * @see #getLabel()
   * @generated
   */
  void setLabel(Label value);

} // GotoStmt
