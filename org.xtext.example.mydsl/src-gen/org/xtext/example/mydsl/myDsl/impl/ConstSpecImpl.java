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

import org.xtext.example.mydsl.myDsl.ConstSpec;
import org.xtext.example.mydsl.myDsl.ExpressionList;
import org.xtext.example.mydsl.myDsl.IdentifierList;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Const Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ConstSpecImpl#getIdentifierList <em>Identifier List</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ConstSpecImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ConstSpecImpl#getExpressionList <em>Expression List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstSpecImpl extends MinimalEObjectImpl.Container implements ConstSpec
{
  /**
   * The cached value of the '{@link #getIdentifierList() <em>Identifier List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifierList()
   * @generated
   * @ordered
   */
  protected IdentifierList identifierList;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Type type;

  /**
   * The cached value of the '{@link #getExpressionList() <em>Expression List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressionList()
   * @generated
   * @ordered
   */
  protected ExpressionList expressionList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConstSpecImpl()
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
    return MyDslPackage.Literals.CONST_SPEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdentifierList getIdentifierList()
  {
    return identifierList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIdentifierList(IdentifierList newIdentifierList, NotificationChain msgs)
  {
    IdentifierList oldIdentifierList = identifierList;
    identifierList = newIdentifierList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.CONST_SPEC__IDENTIFIER_LIST, oldIdentifierList, newIdentifierList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdentifierList(IdentifierList newIdentifierList)
  {
    if (newIdentifierList != identifierList)
    {
      NotificationChain msgs = null;
      if (identifierList != null)
        msgs = ((InternalEObject)identifierList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CONST_SPEC__IDENTIFIER_LIST, null, msgs);
      if (newIdentifierList != null)
        msgs = ((InternalEObject)newIdentifierList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CONST_SPEC__IDENTIFIER_LIST, null, msgs);
      msgs = basicSetIdentifierList(newIdentifierList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONST_SPEC__IDENTIFIER_LIST, newIdentifierList, newIdentifierList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(Type newType, NotificationChain msgs)
  {
    Type oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.CONST_SPEC__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Type newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CONST_SPEC__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CONST_SPEC__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONST_SPEC__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionList getExpressionList()
  {
    return expressionList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpressionList(ExpressionList newExpressionList, NotificationChain msgs)
  {
    ExpressionList oldExpressionList = expressionList;
    expressionList = newExpressionList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.CONST_SPEC__EXPRESSION_LIST, oldExpressionList, newExpressionList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpressionList(ExpressionList newExpressionList)
  {
    if (newExpressionList != expressionList)
    {
      NotificationChain msgs = null;
      if (expressionList != null)
        msgs = ((InternalEObject)expressionList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CONST_SPEC__EXPRESSION_LIST, null, msgs);
      if (newExpressionList != null)
        msgs = ((InternalEObject)newExpressionList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CONST_SPEC__EXPRESSION_LIST, null, msgs);
      msgs = basicSetExpressionList(newExpressionList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONST_SPEC__EXPRESSION_LIST, newExpressionList, newExpressionList));
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
      case MyDslPackage.CONST_SPEC__IDENTIFIER_LIST:
        return basicSetIdentifierList(null, msgs);
      case MyDslPackage.CONST_SPEC__TYPE:
        return basicSetType(null, msgs);
      case MyDslPackage.CONST_SPEC__EXPRESSION_LIST:
        return basicSetExpressionList(null, msgs);
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
      case MyDslPackage.CONST_SPEC__IDENTIFIER_LIST:
        return getIdentifierList();
      case MyDslPackage.CONST_SPEC__TYPE:
        return getType();
      case MyDslPackage.CONST_SPEC__EXPRESSION_LIST:
        return getExpressionList();
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
      case MyDslPackage.CONST_SPEC__IDENTIFIER_LIST:
        setIdentifierList((IdentifierList)newValue);
        return;
      case MyDslPackage.CONST_SPEC__TYPE:
        setType((Type)newValue);
        return;
      case MyDslPackage.CONST_SPEC__EXPRESSION_LIST:
        setExpressionList((ExpressionList)newValue);
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
      case MyDslPackage.CONST_SPEC__IDENTIFIER_LIST:
        setIdentifierList((IdentifierList)null);
        return;
      case MyDslPackage.CONST_SPEC__TYPE:
        setType((Type)null);
        return;
      case MyDslPackage.CONST_SPEC__EXPRESSION_LIST:
        setExpressionList((ExpressionList)null);
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
      case MyDslPackage.CONST_SPEC__IDENTIFIER_LIST:
        return identifierList != null;
      case MyDslPackage.CONST_SPEC__TYPE:
        return type != null;
      case MyDslPackage.CONST_SPEC__EXPRESSION_LIST:
        return expressionList != null;
    }
    return super.eIsSet(featureID);
  }

} //ConstSpecImpl