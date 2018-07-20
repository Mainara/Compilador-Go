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

import org.xtext.example.mydsl.myDsl.BINARY_OP;
import org.xtext.example.mydsl.myDsl.Expression;
import org.xtext.example.mydsl.myDsl.Expression_Linha;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression Linha</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Expression_LinhaImpl#getBINARY_OP <em>BINARY OP</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Expression_LinhaImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Expression_LinhaImpl#getExpression_Linha <em>Expression Linha</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Expression_LinhaImpl extends MinimalEObjectImpl.Container implements Expression_Linha
{
  /**
   * The cached value of the '{@link #getBINARY_OP() <em>BINARY OP</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBINARY_OP()
   * @generated
   * @ordered
   */
  protected BINARY_OP binarY_OP;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected Expression expression;

  /**
   * The cached value of the '{@link #getExpression_Linha() <em>Expression Linha</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression_Linha()
   * @generated
   * @ordered
   */
  protected Expression_Linha expression_Linha;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Expression_LinhaImpl()
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
    return MyDslPackage.Literals.EXPRESSION_LINHA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BINARY_OP getBINARY_OP()
  {
    return binarY_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBINARY_OP(BINARY_OP newBINARY_OP, NotificationChain msgs)
  {
    BINARY_OP oldBINARY_OP = binarY_OP;
    binarY_OP = newBINARY_OP;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPRESSION_LINHA__BINARY_OP, oldBINARY_OP, newBINARY_OP);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBINARY_OP(BINARY_OP newBINARY_OP)
  {
    if (newBINARY_OP != binarY_OP)
    {
      NotificationChain msgs = null;
      if (binarY_OP != null)
        msgs = ((InternalEObject)binarY_OP).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPRESSION_LINHA__BINARY_OP, null, msgs);
      if (newBINARY_OP != null)
        msgs = ((InternalEObject)newBINARY_OP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPRESSION_LINHA__BINARY_OP, null, msgs);
      msgs = basicSetBINARY_OP(newBINARY_OP, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPRESSION_LINHA__BINARY_OP, newBINARY_OP, newBINARY_OP));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs)
  {
    Expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPRESSION_LINHA__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(Expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPRESSION_LINHA__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPRESSION_LINHA__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPRESSION_LINHA__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression_Linha getExpression_Linha()
  {
    return expression_Linha;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression_Linha(Expression_Linha newExpression_Linha, NotificationChain msgs)
  {
    Expression_Linha oldExpression_Linha = expression_Linha;
    expression_Linha = newExpression_Linha;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPRESSION_LINHA__EXPRESSION_LINHA, oldExpression_Linha, newExpression_Linha);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression_Linha(Expression_Linha newExpression_Linha)
  {
    if (newExpression_Linha != expression_Linha)
    {
      NotificationChain msgs = null;
      if (expression_Linha != null)
        msgs = ((InternalEObject)expression_Linha).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPRESSION_LINHA__EXPRESSION_LINHA, null, msgs);
      if (newExpression_Linha != null)
        msgs = ((InternalEObject)newExpression_Linha).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EXPRESSION_LINHA__EXPRESSION_LINHA, null, msgs);
      msgs = basicSetExpression_Linha(newExpression_Linha, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXPRESSION_LINHA__EXPRESSION_LINHA, newExpression_Linha, newExpression_Linha));
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
      case MyDslPackage.EXPRESSION_LINHA__BINARY_OP:
        return basicSetBINARY_OP(null, msgs);
      case MyDslPackage.EXPRESSION_LINHA__EXPRESSION:
        return basicSetExpression(null, msgs);
      case MyDslPackage.EXPRESSION_LINHA__EXPRESSION_LINHA:
        return basicSetExpression_Linha(null, msgs);
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
      case MyDslPackage.EXPRESSION_LINHA__BINARY_OP:
        return getBINARY_OP();
      case MyDslPackage.EXPRESSION_LINHA__EXPRESSION:
        return getExpression();
      case MyDslPackage.EXPRESSION_LINHA__EXPRESSION_LINHA:
        return getExpression_Linha();
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
      case MyDslPackage.EXPRESSION_LINHA__BINARY_OP:
        setBINARY_OP((BINARY_OP)newValue);
        return;
      case MyDslPackage.EXPRESSION_LINHA__EXPRESSION:
        setExpression((Expression)newValue);
        return;
      case MyDslPackage.EXPRESSION_LINHA__EXPRESSION_LINHA:
        setExpression_Linha((Expression_Linha)newValue);
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
      case MyDslPackage.EXPRESSION_LINHA__BINARY_OP:
        setBINARY_OP((BINARY_OP)null);
        return;
      case MyDslPackage.EXPRESSION_LINHA__EXPRESSION:
        setExpression((Expression)null);
        return;
      case MyDslPackage.EXPRESSION_LINHA__EXPRESSION_LINHA:
        setExpression_Linha((Expression_Linha)null);
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
      case MyDslPackage.EXPRESSION_LINHA__BINARY_OP:
        return binarY_OP != null;
      case MyDslPackage.EXPRESSION_LINHA__EXPRESSION:
        return expression != null;
      case MyDslPackage.EXPRESSION_LINHA__EXPRESSION_LINHA:
        return expression_Linha != null;
    }
    return super.eIsSet(featureID);
  }

} //Expression_LinhaImpl