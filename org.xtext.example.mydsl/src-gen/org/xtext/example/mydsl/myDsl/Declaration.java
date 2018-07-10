/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Declaration#getConstDecl <em>Const Decl</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Declaration#getTypeDecl <em>Type Decl</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Declaration#getVarDecl <em>Var Decl</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDeclaration()
 * @model
 * @generated
 */
public interface Declaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Const Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Const Decl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Const Decl</em>' containment reference.
   * @see #setConstDecl(ConstDecl)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDeclaration_ConstDecl()
   * @model containment="true"
   * @generated
   */
  ConstDecl getConstDecl();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Declaration#getConstDecl <em>Const Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Const Decl</em>' containment reference.
   * @see #getConstDecl()
   * @generated
   */
  void setConstDecl(ConstDecl value);

  /**
   * Returns the value of the '<em><b>Type Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Decl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Decl</em>' containment reference.
   * @see #setTypeDecl(TypeDecl)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDeclaration_TypeDecl()
   * @model containment="true"
   * @generated
   */
  TypeDecl getTypeDecl();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Declaration#getTypeDecl <em>Type Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Decl</em>' containment reference.
   * @see #getTypeDecl()
   * @generated
   */
  void setTypeDecl(TypeDecl value);

  /**
   * Returns the value of the '<em><b>Var Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var Decl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Decl</em>' containment reference.
   * @see #setVarDecl(VarDecl)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDeclaration_VarDecl()
   * @model containment="true"
   * @generated
   */
  VarDecl getVarDecl();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Declaration#getVarDecl <em>Var Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Decl</em>' containment reference.
   * @see #getVarDecl()
   * @generated
   */
  void setVarDecl(VarDecl value);

} // Declaration
