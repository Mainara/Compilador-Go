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

import org.xtext.example.mydsl.myDsl.ExprSwitchCase;
import org.xtext.example.mydsl.myDsl.ExpressionList;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr Switch Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ExprSwitchCaseImpl#getCase <em>Case</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ExprSwitchCaseImpl#getExpressionList <em>Expression List</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ExprSwitchCaseImpl#getDefault <em>Default</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExprSwitchCaseImpl extends MinimalEObjectImpl.Container implements ExprSwitchCase
{
  /**
   * The default value of the '{@link #getCase() <em>Case</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCase()
   * @generated
   * @ordered
   */
  protected static final String CASE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCase() <em>Case</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCase()
   * @generated
   * @ordered
   */
  protected String case_ = CASE_EDEFAULT;

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
   * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefault()
   * @generated
   * @ordered
   */
  protected static final String DEFAULT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDefault() <em>Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefault()
   * @generated
   * @ordered
   */
  protected String default_ = DEFAULT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprSwitchCaseImpl()
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
    return MyDslPackage.Literals.EXPR_SWITCH_CASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCase()
  {
    return case_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCase(String newCase)
  {
    String oldCase = case_;
    case_ = newCase;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR_SWITCH_CASE__CASE, oldCase, case_));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR_SWITCH_CASE__EXPRESSION_LIST, oldExpressionList, newExpressionList);
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
        msgs = ((InternalEObject)expressionList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR_SWITCH_CASE__EXPRESSION_LIST, null, msgs);
      if (newExpressionList != null)
        msgs = ((InternalEObject)newExpressionList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPR_SWITCH_CASE__EXPRESSION_LIST, null, msgs);
      msgs = basicSetExpressionList(newExpressionList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR_SWITCH_CASE__EXPRESSION_LIST, newExpressionList, newExpressionList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDefault()
  {
    return default_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefault(String newDefault)
  {
    String oldDefault = default_;
    default_ = newDefault;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPR_SWITCH_CASE__DEFAULT, oldDefault, default_));
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
      case MyDslPackage.EXPR_SWITCH_CASE__EXPRESSION_LIST:
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
      case MyDslPackage.EXPR_SWITCH_CASE__CASE:
        return getCase();
      case MyDslPackage.EXPR_SWITCH_CASE__EXPRESSION_LIST:
        return getExpressionList();
      case MyDslPackage.EXPR_SWITCH_CASE__DEFAULT:
        return getDefault();
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
      case MyDslPackage.EXPR_SWITCH_CASE__CASE:
        setCase((String)newValue);
        return;
      case MyDslPackage.EXPR_SWITCH_CASE__EXPRESSION_LIST:
        setExpressionList((ExpressionList)newValue);
        return;
      case MyDslPackage.EXPR_SWITCH_CASE__DEFAULT:
        setDefault((String)newValue);
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
      case MyDslPackage.EXPR_SWITCH_CASE__CASE:
        setCase(CASE_EDEFAULT);
        return;
      case MyDslPackage.EXPR_SWITCH_CASE__EXPRESSION_LIST:
        setExpressionList((ExpressionList)null);
        return;
      case MyDslPackage.EXPR_SWITCH_CASE__DEFAULT:
        setDefault(DEFAULT_EDEFAULT);
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
      case MyDslPackage.EXPR_SWITCH_CASE__CASE:
        return CASE_EDEFAULT == null ? case_ != null : !CASE_EDEFAULT.equals(case_);
      case MyDslPackage.EXPR_SWITCH_CASE__EXPRESSION_LIST:
        return expressionList != null;
      case MyDslPackage.EXPR_SWITCH_CASE__DEFAULT:
        return DEFAULT_EDEFAULT == null ? default_ != null : !DEFAULT_EDEFAULT.equals(default_);
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
    result.append(" (case: ");
    result.append(case_);
    result.append(", default: ");
    result.append(default_);
    result.append(')');
    return result.toString();
  }

} //ExprSwitchCaseImpl
