/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ElementList#getKeyedElement <em>Keyed Element</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ElementList#getKeyedElement1 <em>Keyed Element1</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getElementList()
 * @model
 * @generated
 */
public interface ElementList extends EObject
{
  /**
   * Returns the value of the '<em><b>Keyed Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Keyed Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Keyed Element</em>' containment reference.
   * @see #setKeyedElement(KeyedElement)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getElementList_KeyedElement()
   * @model containment="true"
   * @generated
   */
  KeyedElement getKeyedElement();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ElementList#getKeyedElement <em>Keyed Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Keyed Element</em>' containment reference.
   * @see #getKeyedElement()
   * @generated
   */
  void setKeyedElement(KeyedElement value);

  /**
   * Returns the value of the '<em><b>Keyed Element1</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.KeyedElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Keyed Element1</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Keyed Element1</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getElementList_KeyedElement1()
   * @model containment="true"
   * @generated
   */
  EList<KeyedElement> getKeyedElement1();

} // ElementList