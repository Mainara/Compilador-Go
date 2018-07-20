/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.PackageClause#getPackage <em>Package</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.PackageClause#getPackageName <em>Package Name</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPackageClause()
 * @model
 * @generated
 */
public interface PackageClause extends EObject
{
  /**
   * Returns the value of the '<em><b>Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package</em>' attribute.
   * @see #setPackage(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPackageClause_Package()
   * @model
   * @generated
   */
  String getPackage();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.PackageClause#getPackage <em>Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package</em>' attribute.
   * @see #getPackage()
   * @generated
   */
  void setPackage(String value);

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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPackageClause_PackageName()
   * @model containment="true"
   * @generated
   */
  PackageName getPackageName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.PackageClause#getPackageName <em>Package Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package Name</em>' containment reference.
   * @see #getPackageName()
   * @generated
   */
  void setPackageName(PackageName value);

} // PackageClause