/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.ElementType;
import org.xtext.example.mydsl.myDsl.KeyType;
import org.xtext.example.mydsl.myDsl.MapType;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.MapTypeImpl#getMap <em>Map</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.MapTypeImpl#getKeyType <em>Key Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.MapTypeImpl#getElementType <em>Element Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MapTypeImpl extends MinimalEObjectImpl.Container implements MapType
{
  /**
   * The default value of the '{@link #getMap() <em>Map</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMap()
   * @generated
   * @ordered
   */
  protected static final String MAP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMap() <em>Map</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMap()
   * @generated
   * @ordered
   */
  protected String map = MAP_EDEFAULT;

  /**
   * The cached value of the '{@link #getKeyType() <em>Key Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKeyType()
   * @generated
   * @ordered
   */
  protected KeyType keyType;

  /**
   * The cached value of the '{@link #getElementType() <em>Element Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElementType()
   * @generated
   * @ordered
   */
  protected ElementType elementType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MapTypeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.MAP_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMap()
  {
    return map;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMap(String newMap)
  {
    String oldMap = map;
    map = newMap;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.MAP_TYPE__MAP, oldMap, map));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KeyType getKeyType()
  {
    return keyType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetKeyType(KeyType newKeyType, NotificationChain msgs)
  {
    KeyType oldKeyType = keyType;
    keyType = newKeyType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.MAP_TYPE__KEY_TYPE, oldKeyType, newKeyType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKeyType(KeyType newKeyType)
  {
    if (newKeyType != keyType)
    {
      NotificationChain msgs = null;
      if (keyType != null)
        msgs = ((InternalEObject)keyType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.MAP_TYPE__KEY_TYPE, null, msgs);
      if (newKeyType != null)
        msgs = ((InternalEObject)newKeyType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.MAP_TYPE__KEY_TYPE, null, msgs);
      msgs = basicSetKeyType(newKeyType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.MAP_TYPE__KEY_TYPE, newKeyType, newKeyType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementType getElementType()
  {
    return elementType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElementType(ElementType newElementType, NotificationChain msgs)
  {
    ElementType oldElementType = elementType;
    elementType = newElementType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.MAP_TYPE__ELEMENT_TYPE, oldElementType, newElementType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElementType(ElementType newElementType)
  {
    if (newElementType != elementType)
    {
      NotificationChain msgs = null;
      if (elementType != null)
        msgs = ((InternalEObject)elementType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.MAP_TYPE__ELEMENT_TYPE, null, msgs);
      if (newElementType != null)
        msgs = ((InternalEObject)newElementType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.MAP_TYPE__ELEMENT_TYPE, null, msgs);
      msgs = basicSetElementType(newElementType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.MAP_TYPE__ELEMENT_TYPE, newElementType, newElementType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.MAP_TYPE__KEY_TYPE:
        return basicSetKeyType(null, msgs);
      case MyDslPackage.MAP_TYPE__ELEMENT_TYPE:
        return basicSetElementType(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.MAP_TYPE__MAP:
        return getMap();
      case MyDslPackage.MAP_TYPE__KEY_TYPE:
        return getKeyType();
      case MyDslPackage.MAP_TYPE__ELEMENT_TYPE:
        return getElementType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.MAP_TYPE__MAP:
        setMap((String)newValue);
        return;
      case MyDslPackage.MAP_TYPE__KEY_TYPE:
        setKeyType((KeyType)newValue);
        return;
      case MyDslPackage.MAP_TYPE__ELEMENT_TYPE:
        setElementType((ElementType)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.MAP_TYPE__MAP:
        setMap(MAP_EDEFAULT);
        return;
      case MyDslPackage.MAP_TYPE__KEY_TYPE:
        setKeyType((KeyType)null);
        return;
      case MyDslPackage.MAP_TYPE__ELEMENT_TYPE:
        setElementType((ElementType)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.MAP_TYPE__MAP:
        return MAP_EDEFAULT == null ? map != null : !MAP_EDEFAULT.equals(map);
      case MyDslPackage.MAP_TYPE__KEY_TYPE:
        return keyType != null;
      case MyDslPackage.MAP_TYPE__ELEMENT_TYPE:
        return elementType != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (map: ");
    result.append(map);
    result.append(')');
    return result.toString();
  }

} //MapTypeImpl
