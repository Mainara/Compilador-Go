/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.PrimaryExpr;
import org.xtext.example.mydsl.myDsl.UnaryExpr;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unary Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.UnaryExprImpl#getUnary_op <em>Unary op</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.UnaryExprImpl#getPrimaryExpr <em>Primary Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnaryExprImpl extends MinimalEObjectImpl.Container implements UnaryExpr
{
  /**
   * The cached value of the '{@link #getUnary_op() <em>Unary op</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnary_op()
   * @generated
   * @ordered
   */
  protected EList<String> unary_op;

  /**
   * The cached value of the '{@link #getPrimaryExpr() <em>Primary Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimaryExpr()
   * @generated
   * @ordered
   */
  protected PrimaryExpr primaryExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UnaryExprImpl()
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
    return MyDslPackage.Literals.UNARY_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getUnary_op()
  {
    if (unary_op == null)
    {
      unary_op = new EDataTypeEList<String>(String.class, this, MyDslPackage.UNARY_EXPR__UNARY_OP);
    }
    return unary_op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimaryExpr getPrimaryExpr()
  {
    return primaryExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrimaryExpr(PrimaryExpr newPrimaryExpr, NotificationChain msgs)
  {
    PrimaryExpr oldPrimaryExpr = primaryExpr;
    primaryExpr = newPrimaryExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.UNARY_EXPR__PRIMARY_EXPR, oldPrimaryExpr, newPrimaryExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimaryExpr(PrimaryExpr newPrimaryExpr)
  {
    if (newPrimaryExpr != primaryExpr)
    {
      NotificationChain msgs = null;
      if (primaryExpr != null)
        msgs = ((InternalEObject)primaryExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.UNARY_EXPR__PRIMARY_EXPR, null, msgs);
      if (newPrimaryExpr != null)
        msgs = ((InternalEObject)newPrimaryExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.UNARY_EXPR__PRIMARY_EXPR, null, msgs);
      msgs = basicSetPrimaryExpr(newPrimaryExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.UNARY_EXPR__PRIMARY_EXPR, newPrimaryExpr, newPrimaryExpr));
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
      case MyDslPackage.UNARY_EXPR__PRIMARY_EXPR:
        return basicSetPrimaryExpr(null, msgs);
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
      case MyDslPackage.UNARY_EXPR__UNARY_OP:
        return getUnary_op();
      case MyDslPackage.UNARY_EXPR__PRIMARY_EXPR:
        return getPrimaryExpr();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.UNARY_EXPR__UNARY_OP:
        getUnary_op().clear();
        getUnary_op().addAll((Collection<? extends String>)newValue);
        return;
      case MyDslPackage.UNARY_EXPR__PRIMARY_EXPR:
        setPrimaryExpr((PrimaryExpr)newValue);
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
      case MyDslPackage.UNARY_EXPR__UNARY_OP:
        getUnary_op().clear();
        return;
      case MyDslPackage.UNARY_EXPR__PRIMARY_EXPR:
        setPrimaryExpr((PrimaryExpr)null);
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
      case MyDslPackage.UNARY_EXPR__UNARY_OP:
        return unary_op != null && !unary_op.isEmpty();
      case MyDslPackage.UNARY_EXPR__PRIMARY_EXPR:
        return primaryExpr != null;
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
    result.append(" (unary_op: ");
    result.append(unary_op);
    result.append(')');
    return result.toString();
  }

} //UnaryExprImpl
