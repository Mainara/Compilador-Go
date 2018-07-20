/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.TypeDecl#getTypekeyword <em>Typekeyword</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.TypeDecl#getTypeSpec <em>Type Spec</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.TypeDecl#getTypeSpec1 <em>Type Spec1</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getTypeDecl()
 * @model
 * @generated
 */
public interface TypeDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Typekeyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typekeyword</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typekeyword</em>' attribute.
   * @see #setTypekeyword(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getTypeDecl_Typekeyword()
   * @model
   * @generated
   */
  String getTypekeyword();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.TypeDecl#getTypekeyword <em>Typekeyword</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Typekeyword</em>' attribute.
   * @see #getTypekeyword()
   * @generated
   */
  void setTypekeyword(String value);

  /**
   * Returns the value of the '<em><b>Type Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Spec</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Spec</em>' containment reference.
   * @see #setTypeSpec(TypeSpec)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getTypeDecl_TypeSpec()
   * @model containment="true"
   * @generated
   */
  TypeSpec getTypeSpec();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.TypeDecl#getTypeSpec <em>Type Spec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Spec</em>' containment reference.
   * @see #getTypeSpec()
   * @generated
   */
  void setTypeSpec(TypeSpec value);

  /**
   * Returns the value of the '<em><b>Type Spec1</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.TypeSpec}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Spec1</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Spec1</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getTypeDecl_TypeSpec1()
   * @model containment="true"
   * @generated
   */
  EList<TypeSpec> getTypeSpec1();

} // TypeDecl