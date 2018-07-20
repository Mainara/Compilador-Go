/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.MapType#getMap <em>Map</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.MapType#getKeyType <em>Key Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.MapType#getElementType <em>Element Type</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMapType()
 * @model
 * @generated
 */
public interface MapType extends EObject
{
  /**
   * Returns the value of the '<em><b>Map</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Map</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Map</em>' attribute.
   * @see #setMap(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMapType_Map()
   * @model
   * @generated
   */
  String getMap();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.MapType#getMap <em>Map</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Map</em>' attribute.
   * @see #getMap()
   * @generated
   */
  void setMap(String value);

  /**
   * Returns the value of the '<em><b>Key Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key Type</em>' containment reference.
   * @see #setKeyType(KeyType)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMapType_KeyType()
   * @model containment="true"
   * @generated
   */
  KeyType getKeyType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.MapType#getKeyType <em>Key Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key Type</em>' containment reference.
   * @see #getKeyType()
   * @generated
   */
  void setKeyType(KeyType value);

  /**
   * Returns the value of the '<em><b>Element Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element Type</em>' containment reference.
   * @see #setElementType(ElementType)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMapType_ElementType()
   * @model containment="true"
   * @generated
   */
  ElementType getElementType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.MapType#getElementType <em>Element Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element Type</em>' containment reference.
   * @see #getElementType()
   * @generated
   */
  void setElementType(ElementType value);

} // MapType