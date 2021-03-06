/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ImportSpec#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ImportSpec#getSTRING_LIT <em>STRING LIT</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getImportSpec()
 * @model
 * @generated
 */
public interface ImportSpec extends EObject
{
  /**
   * Returns the value of the '<em><b>Package Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package Name</em>' containment reference.
   * @see #setPackageName(PackageName)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getImportSpec_PackageName()
   * @model containment="true"
   * @generated
   */
  PackageName getPackageName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ImportSpec#getPackageName <em>Package Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package Name</em>' containment reference.
   * @see #getPackageName()
   * @generated
   */
  void setPackageName(PackageName value);

  /**
   * Returns the value of the '<em><b>STRING LIT</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>STRING LIT</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>STRING LIT</em>' attribute.
   * @see #setSTRING_LIT(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getImportSpec_STRING_LIT()
   * @model
   * @generated
   */
  String getSTRING_LIT();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ImportSpec#getSTRING_LIT <em>STRING LIT</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>STRING LIT</em>' attribute.
   * @see #getSTRING_LIT()
   * @generated
   */
  void setSTRING_LIT(String value);

} // ImportSpec
