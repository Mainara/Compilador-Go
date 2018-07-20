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

import org.xtext.example.mydsl.myDsl.Conversion;
import org.xtext.example.mydsl.myDsl.MethodExpr;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Operand;
import org.xtext.example.mydsl.myDsl.PrimaryExpr;
import org.xtext.example.mydsl.myDsl.PrimaryExprLinha;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primary Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.PrimaryExprImpl#getOperand <em>Operand</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.PrimaryExprImpl#getPrimaryExprLinha <em>Primary Expr Linha</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.PrimaryExprImpl#getConversion <em>Conversion</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.PrimaryExprImpl#getMethodExpr <em>Method Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimaryExprImpl extends MinimalEObjectImpl.Container implements PrimaryExpr
{
  /**
   * The cached value of the '{@link #getOperand() <em>Operand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperand()
   * @generated
   * @ordered
   */
  protected Operand operand;

  /**
   * The cached value of the '{@link #getPrimaryExprLinha() <em>Primary Expr Linha</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimaryExprLinha()
   * @generated
   * @ordered
   */
  protected PrimaryExprLinha primaryExprLinha;

  /**
   * The cached value of the '{@link #getConversion() <em>Conversion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConversion()
   * @generated
   * @ordered
   */
  protected Conversion conversion;

  /**
   * The cached value of the '{@link #getMethodExpr() <em>Method Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethodExpr()
   * @generated
   * @ordered
   */
  protected MethodExpr methodExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrimaryExprImpl()
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
    return MyDslPackage.Literals.PRIMARY_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operand getOperand()
  {
    return operand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOperand(Operand newOperand, NotificationChain msgs)
  {
    Operand oldOperand = operand;
    operand = newOperand;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.PRIMARY_EXPR__OPERAND, oldOperand, newOperand);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperand(Operand newOperand)
  {
    if (newOperand != operand)
    {
      NotificationChain msgs = null;
      if (operand != null)
        msgs = ((InternalEObject)operand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PRIMARY_EXPR__OPERAND, null, msgs);
      if (newOperand != null)
        msgs = ((InternalEObject)newOperand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PRIMARY_EXPR__OPERAND, null, msgs);
      msgs = basicSetOperand(newOperand, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PRIMARY_EXPR__OPERAND, newOperand, newOperand));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimaryExprLinha getPrimaryExprLinha()
  {
    return primaryExprLinha;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrimaryExprLinha(PrimaryExprLinha newPrimaryExprLinha, NotificationChain msgs)
  {
    PrimaryExprLinha oldPrimaryExprLinha = primaryExprLinha;
    primaryExprLinha = newPrimaryExprLinha;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.PRIMARY_EXPR__PRIMARY_EXPR_LINHA, oldPrimaryExprLinha, newPrimaryExprLinha);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimaryExprLinha(PrimaryExprLinha newPrimaryExprLinha)
  {
    if (newPrimaryExprLinha != primaryExprLinha)
    {
      NotificationChain msgs = null;
      if (primaryExprLinha != null)
        msgs = ((InternalEObject)primaryExprLinha).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PRIMARY_EXPR__PRIMARY_EXPR_LINHA, null, msgs);
      if (newPrimaryExprLinha != null)
        msgs = ((InternalEObject)newPrimaryExprLinha).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PRIMARY_EXPR__PRIMARY_EXPR_LINHA, null, msgs);
      msgs = basicSetPrimaryExprLinha(newPrimaryExprLinha, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PRIMARY_EXPR__PRIMARY_EXPR_LINHA, newPrimaryExprLinha, newPrimaryExprLinha));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Conversion getConversion()
  {
    return conversion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConversion(Conversion newConversion, NotificationChain msgs)
  {
    Conversion oldConversion = conversion;
    conversion = newConversion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.PRIMARY_EXPR__CONVERSION, oldConversion, newConversion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConversion(Conversion newConversion)
  {
    if (newConversion != conversion)
    {
      NotificationChain msgs = null;
      if (conversion != null)
        msgs = ((InternalEObject)conversion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PRIMARY_EXPR__CONVERSION, null, msgs);
      if (newConversion != null)
        msgs = ((InternalEObject)newConversion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PRIMARY_EXPR__CONVERSION, null, msgs);
      msgs = basicSetConversion(newConversion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PRIMARY_EXPR__CONVERSION, newConversion, newConversion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodExpr getMethodExpr()
  {
    return methodExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMethodExpr(MethodExpr newMethodExpr, NotificationChain msgs)
  {
    MethodExpr oldMethodExpr = methodExpr;
    methodExpr = newMethodExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.PRIMARY_EXPR__METHOD_EXPR, oldMethodExpr, newMethodExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethodExpr(MethodExpr newMethodExpr)
  {
    if (newMethodExpr != methodExpr)
    {
      NotificationChain msgs = null;
      if (methodExpr != null)
        msgs = ((InternalEObject)methodExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PRIMARY_EXPR__METHOD_EXPR, null, msgs);
      if (newMethodExpr != null)
        msgs = ((InternalEObject)newMethodExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PRIMARY_EXPR__METHOD_EXPR, null, msgs);
      msgs = basicSetMethodExpr(newMethodExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PRIMARY_EXPR__METHOD_EXPR, newMethodExpr, newMethodExpr));
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
      case MyDslPackage.PRIMARY_EXPR__OPERAND:
        return basicSetOperand(null, msgs);
      case MyDslPackage.PRIMARY_EXPR__PRIMARY_EXPR_LINHA:
        return basicSetPrimaryExprLinha(null, msgs);
      case MyDslPackage.PRIMARY_EXPR__CONVERSION:
        return basicSetConversion(null, msgs);
      case MyDslPackage.PRIMARY_EXPR__METHOD_EXPR:
        return basicSetMethodExpr(null, msgs);
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
      case MyDslPackage.PRIMARY_EXPR__OPERAND:
        return getOperand();
      case MyDslPackage.PRIMARY_EXPR__PRIMARY_EXPR_LINHA:
        return getPrimaryExprLinha();
      case MyDslPackage.PRIMARY_EXPR__CONVERSION:
        return getConversion();
      case MyDslPackage.PRIMARY_EXPR__METHOD_EXPR:
        return getMethodExpr();
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
      case MyDslPackage.PRIMARY_EXPR__OPERAND:
        setOperand((Operand)newValue);
        return;
      case MyDslPackage.PRIMARY_EXPR__PRIMARY_EXPR_LINHA:
        setPrimaryExprLinha((PrimaryExprLinha)newValue);
        return;
      case MyDslPackage.PRIMARY_EXPR__CONVERSION:
        setConversion((Conversion)newValue);
        return;
      case MyDslPackage.PRIMARY_EXPR__METHOD_EXPR:
        setMethodExpr((MethodExpr)newValue);
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
      case MyDslPackage.PRIMARY_EXPR__OPERAND:
        setOperand((Operand)null);
        return;
      case MyDslPackage.PRIMARY_EXPR__PRIMARY_EXPR_LINHA:
        setPrimaryExprLinha((PrimaryExprLinha)null);
        return;
      case MyDslPackage.PRIMARY_EXPR__CONVERSION:
        setConversion((Conversion)null);
        return;
      case MyDslPackage.PRIMARY_EXPR__METHOD_EXPR:
        setMethodExpr((MethodExpr)null);
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
      case MyDslPackage.PRIMARY_EXPR__OPERAND:
        return operand != null;
      case MyDslPackage.PRIMARY_EXPR__PRIMARY_EXPR_LINHA:
        return primaryExprLinha != null;
      case MyDslPackage.PRIMARY_EXPR__CONVERSION:
        return conversion != null;
      case MyDslPackage.PRIMARY_EXPR__METHOD_EXPR:
        return methodExpr != null;
    }
    return super.eIsSet(featureID);
  }

} //PrimaryExprImpl