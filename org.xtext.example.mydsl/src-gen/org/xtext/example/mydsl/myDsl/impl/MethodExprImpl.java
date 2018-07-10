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

import org.xtext.example.mydsl.myDsl.MethodExpr;
import org.xtext.example.mydsl.myDsl.MethodName;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.ReceiverType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.MethodExprImpl#getReceiverType <em>Receiver Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.MethodExprImpl#getMethodName <em>Method Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodExprImpl extends MinimalEObjectImpl.Container implements MethodExpr
{
  /**
   * The cached value of the '{@link #getReceiverType() <em>Receiver Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReceiverType()
   * @generated
   * @ordered
   */
  protected ReceiverType receiverType;

  /**
   * The cached value of the '{@link #getMethodName() <em>Method Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethodName()
   * @generated
   * @ordered
   */
  protected MethodName methodName;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MethodExprImpl()
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
    return MyDslPackage.Literals.METHOD_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReceiverType getReceiverType()
  {
    return receiverType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReceiverType(ReceiverType newReceiverType, NotificationChain msgs)
  {
    ReceiverType oldReceiverType = receiverType;
    receiverType = newReceiverType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.METHOD_EXPR__RECEIVER_TYPE, oldReceiverType, newReceiverType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReceiverType(ReceiverType newReceiverType)
  {
    if (newReceiverType != receiverType)
    {
      NotificationChain msgs = null;
      if (receiverType != null)
        msgs = ((InternalEObject)receiverType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.METHOD_EXPR__RECEIVER_TYPE, null, msgs);
      if (newReceiverType != null)
        msgs = ((InternalEObject)newReceiverType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.METHOD_EXPR__RECEIVER_TYPE, null, msgs);
      msgs = basicSetReceiverType(newReceiverType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.METHOD_EXPR__RECEIVER_TYPE, newReceiverType, newReceiverType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodName getMethodName()
  {
    return methodName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMethodName(MethodName newMethodName, NotificationChain msgs)
  {
    MethodName oldMethodName = methodName;
    methodName = newMethodName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.METHOD_EXPR__METHOD_NAME, oldMethodName, newMethodName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethodName(MethodName newMethodName)
  {
    if (newMethodName != methodName)
    {
      NotificationChain msgs = null;
      if (methodName != null)
        msgs = ((InternalEObject)methodName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.METHOD_EXPR__METHOD_NAME, null, msgs);
      if (newMethodName != null)
        msgs = ((InternalEObject)newMethodName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.METHOD_EXPR__METHOD_NAME, null, msgs);
      msgs = basicSetMethodName(newMethodName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.METHOD_EXPR__METHOD_NAME, newMethodName, newMethodName));
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
      case MyDslPackage.METHOD_EXPR__RECEIVER_TYPE:
        return basicSetReceiverType(null, msgs);
      case MyDslPackage.METHOD_EXPR__METHOD_NAME:
        return basicSetMethodName(null, msgs);
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
      case MyDslPackage.METHOD_EXPR__RECEIVER_TYPE:
        return getReceiverType();
      case MyDslPackage.METHOD_EXPR__METHOD_NAME:
        return getMethodName();
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
      case MyDslPackage.METHOD_EXPR__RECEIVER_TYPE:
        setReceiverType((ReceiverType)newValue);
        return;
      case MyDslPackage.METHOD_EXPR__METHOD_NAME:
        setMethodName((MethodName)newValue);
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
      case MyDslPackage.METHOD_EXPR__RECEIVER_TYPE:
        setReceiverType((ReceiverType)null);
        return;
      case MyDslPackage.METHOD_EXPR__METHOD_NAME:
        setMethodName((MethodName)null);
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
      case MyDslPackage.METHOD_EXPR__RECEIVER_TYPE:
        return receiverType != null;
      case MyDslPackage.METHOD_EXPR__METHOD_NAME:
        return methodName != null;
    }
    return super.eIsSet(featureID);
  }

} //MethodExprImpl
