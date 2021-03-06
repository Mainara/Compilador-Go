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

import org.xtext.example.mydsl.myDsl.ChannelType;
import org.xtext.example.mydsl.myDsl.FunctionType;
import org.xtext.example.mydsl.myDsl.InterfaceType;
import org.xtext.example.mydsl.myDsl.MapType;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.PointerType;
import org.xtext.example.mydsl.myDsl.StructType;
import org.xtext.example.mydsl.myDsl.TypeLit;
import org.xtext.example.mydsl.myDsl.TypeLitLinha;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Lit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.TypeLitImpl#getTypeLitLinha <em>Type Lit Linha</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.TypeLitImpl#getSrtuctType <em>Srtuct Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.TypeLitImpl#getPointerType <em>Pointer Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.TypeLitImpl#getFunctionType <em>Function Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.TypeLitImpl#getInterfaceType <em>Interface Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.TypeLitImpl#getMapType <em>Map Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.TypeLitImpl#getChannelType <em>Channel Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeLitImpl extends MinimalEObjectImpl.Container implements TypeLit
{
  /**
   * The cached value of the '{@link #getTypeLitLinha() <em>Type Lit Linha</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeLitLinha()
   * @generated
   * @ordered
   */
  protected TypeLitLinha typeLitLinha;

  /**
   * The cached value of the '{@link #getSrtuctType() <em>Srtuct Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSrtuctType()
   * @generated
   * @ordered
   */
  protected StructType srtuctType;

  /**
   * The cached value of the '{@link #getPointerType() <em>Pointer Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPointerType()
   * @generated
   * @ordered
   */
  protected PointerType pointerType;

  /**
   * The cached value of the '{@link #getFunctionType() <em>Function Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctionType()
   * @generated
   * @ordered
   */
  protected FunctionType functionType;

  /**
   * The cached value of the '{@link #getInterfaceType() <em>Interface Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfaceType()
   * @generated
   * @ordered
   */
  protected InterfaceType interfaceType;

  /**
   * The cached value of the '{@link #getMapType() <em>Map Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMapType()
   * @generated
   * @ordered
   */
  protected MapType mapType;

  /**
   * The cached value of the '{@link #getChannelType() <em>Channel Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChannelType()
   * @generated
   * @ordered
   */
  protected ChannelType channelType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeLitImpl()
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
    return MyDslPackage.Literals.TYPE_LIT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeLitLinha getTypeLitLinha()
  {
    return typeLitLinha;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeLitLinha(TypeLitLinha newTypeLitLinha, NotificationChain msgs)
  {
    TypeLitLinha oldTypeLitLinha = typeLitLinha;
    typeLitLinha = newTypeLitLinha;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE_LIT__TYPE_LIT_LINHA, oldTypeLitLinha, newTypeLitLinha);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeLitLinha(TypeLitLinha newTypeLitLinha)
  {
    if (newTypeLitLinha != typeLitLinha)
    {
      NotificationChain msgs = null;
      if (typeLitLinha != null)
        msgs = ((InternalEObject)typeLitLinha).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TYPE_LIT__TYPE_LIT_LINHA, null, msgs);
      if (newTypeLitLinha != null)
        msgs = ((InternalEObject)newTypeLitLinha).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TYPE_LIT__TYPE_LIT_LINHA, null, msgs);
      msgs = basicSetTypeLitLinha(newTypeLitLinha, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE_LIT__TYPE_LIT_LINHA, newTypeLitLinha, newTypeLitLinha));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructType getSrtuctType()
  {
    return srtuctType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSrtuctType(StructType newSrtuctType, NotificationChain msgs)
  {
    StructType oldSrtuctType = srtuctType;
    srtuctType = newSrtuctType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE_LIT__SRTUCT_TYPE, oldSrtuctType, newSrtuctType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSrtuctType(StructType newSrtuctType)
  {
    if (newSrtuctType != srtuctType)
    {
      NotificationChain msgs = null;
      if (srtuctType != null)
        msgs = ((InternalEObject)srtuctType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TYPE_LIT__SRTUCT_TYPE, null, msgs);
      if (newSrtuctType != null)
        msgs = ((InternalEObject)newSrtuctType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TYPE_LIT__SRTUCT_TYPE, null, msgs);
      msgs = basicSetSrtuctType(newSrtuctType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE_LIT__SRTUCT_TYPE, newSrtuctType, newSrtuctType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PointerType getPointerType()
  {
    return pointerType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPointerType(PointerType newPointerType, NotificationChain msgs)
  {
    PointerType oldPointerType = pointerType;
    pointerType = newPointerType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE_LIT__POINTER_TYPE, oldPointerType, newPointerType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPointerType(PointerType newPointerType)
  {
    if (newPointerType != pointerType)
    {
      NotificationChain msgs = null;
      if (pointerType != null)
        msgs = ((InternalEObject)pointerType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TYPE_LIT__POINTER_TYPE, null, msgs);
      if (newPointerType != null)
        msgs = ((InternalEObject)newPointerType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TYPE_LIT__POINTER_TYPE, null, msgs);
      msgs = basicSetPointerType(newPointerType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE_LIT__POINTER_TYPE, newPointerType, newPointerType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionType getFunctionType()
  {
    return functionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFunctionType(FunctionType newFunctionType, NotificationChain msgs)
  {
    FunctionType oldFunctionType = functionType;
    functionType = newFunctionType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE_LIT__FUNCTION_TYPE, oldFunctionType, newFunctionType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunctionType(FunctionType newFunctionType)
  {
    if (newFunctionType != functionType)
    {
      NotificationChain msgs = null;
      if (functionType != null)
        msgs = ((InternalEObject)functionType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TYPE_LIT__FUNCTION_TYPE, null, msgs);
      if (newFunctionType != null)
        msgs = ((InternalEObject)newFunctionType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TYPE_LIT__FUNCTION_TYPE, null, msgs);
      msgs = basicSetFunctionType(newFunctionType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE_LIT__FUNCTION_TYPE, newFunctionType, newFunctionType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceType getInterfaceType()
  {
    return interfaceType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInterfaceType(InterfaceType newInterfaceType, NotificationChain msgs)
  {
    InterfaceType oldInterfaceType = interfaceType;
    interfaceType = newInterfaceType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE_LIT__INTERFACE_TYPE, oldInterfaceType, newInterfaceType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterfaceType(InterfaceType newInterfaceType)
  {
    if (newInterfaceType != interfaceType)
    {
      NotificationChain msgs = null;
      if (interfaceType != null)
        msgs = ((InternalEObject)interfaceType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TYPE_LIT__INTERFACE_TYPE, null, msgs);
      if (newInterfaceType != null)
        msgs = ((InternalEObject)newInterfaceType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TYPE_LIT__INTERFACE_TYPE, null, msgs);
      msgs = basicSetInterfaceType(newInterfaceType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE_LIT__INTERFACE_TYPE, newInterfaceType, newInterfaceType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MapType getMapType()
  {
    return mapType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMapType(MapType newMapType, NotificationChain msgs)
  {
    MapType oldMapType = mapType;
    mapType = newMapType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE_LIT__MAP_TYPE, oldMapType, newMapType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMapType(MapType newMapType)
  {
    if (newMapType != mapType)
    {
      NotificationChain msgs = null;
      if (mapType != null)
        msgs = ((InternalEObject)mapType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TYPE_LIT__MAP_TYPE, null, msgs);
      if (newMapType != null)
        msgs = ((InternalEObject)newMapType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TYPE_LIT__MAP_TYPE, null, msgs);
      msgs = basicSetMapType(newMapType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE_LIT__MAP_TYPE, newMapType, newMapType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChannelType getChannelType()
  {
    return channelType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetChannelType(ChannelType newChannelType, NotificationChain msgs)
  {
    ChannelType oldChannelType = channelType;
    channelType = newChannelType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE_LIT__CHANNEL_TYPE, oldChannelType, newChannelType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChannelType(ChannelType newChannelType)
  {
    if (newChannelType != channelType)
    {
      NotificationChain msgs = null;
      if (channelType != null)
        msgs = ((InternalEObject)channelType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TYPE_LIT__CHANNEL_TYPE, null, msgs);
      if (newChannelType != null)
        msgs = ((InternalEObject)newChannelType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TYPE_LIT__CHANNEL_TYPE, null, msgs);
      msgs = basicSetChannelType(newChannelType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE_LIT__CHANNEL_TYPE, newChannelType, newChannelType));
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
      case MyDslPackage.TYPE_LIT__TYPE_LIT_LINHA:
        return basicSetTypeLitLinha(null, msgs);
      case MyDslPackage.TYPE_LIT__SRTUCT_TYPE:
        return basicSetSrtuctType(null, msgs);
      case MyDslPackage.TYPE_LIT__POINTER_TYPE:
        return basicSetPointerType(null, msgs);
      case MyDslPackage.TYPE_LIT__FUNCTION_TYPE:
        return basicSetFunctionType(null, msgs);
      case MyDslPackage.TYPE_LIT__INTERFACE_TYPE:
        return basicSetInterfaceType(null, msgs);
      case MyDslPackage.TYPE_LIT__MAP_TYPE:
        return basicSetMapType(null, msgs);
      case MyDslPackage.TYPE_LIT__CHANNEL_TYPE:
        return basicSetChannelType(null, msgs);
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
      case MyDslPackage.TYPE_LIT__TYPE_LIT_LINHA:
        return getTypeLitLinha();
      case MyDslPackage.TYPE_LIT__SRTUCT_TYPE:
        return getSrtuctType();
      case MyDslPackage.TYPE_LIT__POINTER_TYPE:
        return getPointerType();
      case MyDslPackage.TYPE_LIT__FUNCTION_TYPE:
        return getFunctionType();
      case MyDslPackage.TYPE_LIT__INTERFACE_TYPE:
        return getInterfaceType();
      case MyDslPackage.TYPE_LIT__MAP_TYPE:
        return getMapType();
      case MyDslPackage.TYPE_LIT__CHANNEL_TYPE:
        return getChannelType();
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
      case MyDslPackage.TYPE_LIT__TYPE_LIT_LINHA:
        setTypeLitLinha((TypeLitLinha)newValue);
        return;
      case MyDslPackage.TYPE_LIT__SRTUCT_TYPE:
        setSrtuctType((StructType)newValue);
        return;
      case MyDslPackage.TYPE_LIT__POINTER_TYPE:
        setPointerType((PointerType)newValue);
        return;
      case MyDslPackage.TYPE_LIT__FUNCTION_TYPE:
        setFunctionType((FunctionType)newValue);
        return;
      case MyDslPackage.TYPE_LIT__INTERFACE_TYPE:
        setInterfaceType((InterfaceType)newValue);
        return;
      case MyDslPackage.TYPE_LIT__MAP_TYPE:
        setMapType((MapType)newValue);
        return;
      case MyDslPackage.TYPE_LIT__CHANNEL_TYPE:
        setChannelType((ChannelType)newValue);
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
      case MyDslPackage.TYPE_LIT__TYPE_LIT_LINHA:
        setTypeLitLinha((TypeLitLinha)null);
        return;
      case MyDslPackage.TYPE_LIT__SRTUCT_TYPE:
        setSrtuctType((StructType)null);
        return;
      case MyDslPackage.TYPE_LIT__POINTER_TYPE:
        setPointerType((PointerType)null);
        return;
      case MyDslPackage.TYPE_LIT__FUNCTION_TYPE:
        setFunctionType((FunctionType)null);
        return;
      case MyDslPackage.TYPE_LIT__INTERFACE_TYPE:
        setInterfaceType((InterfaceType)null);
        return;
      case MyDslPackage.TYPE_LIT__MAP_TYPE:
        setMapType((MapType)null);
        return;
      case MyDslPackage.TYPE_LIT__CHANNEL_TYPE:
        setChannelType((ChannelType)null);
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
      case MyDslPackage.TYPE_LIT__TYPE_LIT_LINHA:
        return typeLitLinha != null;
      case MyDslPackage.TYPE_LIT__SRTUCT_TYPE:
        return srtuctType != null;
      case MyDslPackage.TYPE_LIT__POINTER_TYPE:
        return pointerType != null;
      case MyDslPackage.TYPE_LIT__FUNCTION_TYPE:
        return functionType != null;
      case MyDslPackage.TYPE_LIT__INTERFACE_TYPE:
        return interfaceType != null;
      case MyDslPackage.TYPE_LIT__MAP_TYPE:
        return mapType != null;
      case MyDslPackage.TYPE_LIT__CHANNEL_TYPE:
        return channelType != null;
    }
    return super.eIsSet(featureID);
  }

} //TypeLitImpl
