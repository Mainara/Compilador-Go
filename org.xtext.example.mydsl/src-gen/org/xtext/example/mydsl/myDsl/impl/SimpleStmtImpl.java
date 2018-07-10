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

import org.xtext.example.mydsl.myDsl.EmptyStmt;
import org.xtext.example.mydsl.myDsl.Expression;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.ShortVarDecl;
import org.xtext.example.mydsl.myDsl.SimpleStmt;
import org.xtext.example.mydsl.myDsl.SimpleStmtLinha;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.SimpleStmtImpl#getEmptyStmt <em>Empty Stmt</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.SimpleStmtImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.SimpleStmtImpl#getSimpleStmtLinha <em>Simple Stmt Linha</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.SimpleStmtImpl#getShortVarDecl <em>Short Var Decl</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleStmtImpl extends MinimalEObjectImpl.Container implements SimpleStmt
{
  /**
   * The cached value of the '{@link #getEmptyStmt() <em>Empty Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmptyStmt()
   * @generated
   * @ordered
   */
  protected EmptyStmt emptyStmt;

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
   * The cached value of the '{@link #getSimpleStmtLinha() <em>Simple Stmt Linha</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSimpleStmtLinha()
   * @generated
   * @ordered
   */
  protected SimpleStmtLinha simpleStmtLinha;

  /**
   * The cached value of the '{@link #getShortVarDecl() <em>Short Var Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShortVarDecl()
   * @generated
   * @ordered
   */
  protected ShortVarDecl shortVarDecl;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SimpleStmtImpl()
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
    return MyDslPackage.Literals.SIMPLE_STMT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmptyStmt getEmptyStmt()
  {
    return emptyStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEmptyStmt(EmptyStmt newEmptyStmt, NotificationChain msgs)
  {
    EmptyStmt oldEmptyStmt = emptyStmt;
    emptyStmt = newEmptyStmt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.SIMPLE_STMT__EMPTY_STMT, oldEmptyStmt, newEmptyStmt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEmptyStmt(EmptyStmt newEmptyStmt)
  {
    if (newEmptyStmt != emptyStmt)
    {
      NotificationChain msgs = null;
      if (emptyStmt != null)
        msgs = ((InternalEObject)emptyStmt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SIMPLE_STMT__EMPTY_STMT, null, msgs);
      if (newEmptyStmt != null)
        msgs = ((InternalEObject)newEmptyStmt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SIMPLE_STMT__EMPTY_STMT, null, msgs);
      msgs = basicSetEmptyStmt(newEmptyStmt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SIMPLE_STMT__EMPTY_STMT, newEmptyStmt, newEmptyStmt));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.SIMPLE_STMT__EXPRESSION, oldExpression, newExpression);
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
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SIMPLE_STMT__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SIMPLE_STMT__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SIMPLE_STMT__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleStmtLinha getSimpleStmtLinha()
  {
    return simpleStmtLinha;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSimpleStmtLinha(SimpleStmtLinha newSimpleStmtLinha, NotificationChain msgs)
  {
    SimpleStmtLinha oldSimpleStmtLinha = simpleStmtLinha;
    simpleStmtLinha = newSimpleStmtLinha;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.SIMPLE_STMT__SIMPLE_STMT_LINHA, oldSimpleStmtLinha, newSimpleStmtLinha);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSimpleStmtLinha(SimpleStmtLinha newSimpleStmtLinha)
  {
    if (newSimpleStmtLinha != simpleStmtLinha)
    {
      NotificationChain msgs = null;
      if (simpleStmtLinha != null)
        msgs = ((InternalEObject)simpleStmtLinha).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SIMPLE_STMT__SIMPLE_STMT_LINHA, null, msgs);
      if (newSimpleStmtLinha != null)
        msgs = ((InternalEObject)newSimpleStmtLinha).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SIMPLE_STMT__SIMPLE_STMT_LINHA, null, msgs);
      msgs = basicSetSimpleStmtLinha(newSimpleStmtLinha, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SIMPLE_STMT__SIMPLE_STMT_LINHA, newSimpleStmtLinha, newSimpleStmtLinha));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShortVarDecl getShortVarDecl()
  {
    return shortVarDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetShortVarDecl(ShortVarDecl newShortVarDecl, NotificationChain msgs)
  {
    ShortVarDecl oldShortVarDecl = shortVarDecl;
    shortVarDecl = newShortVarDecl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.SIMPLE_STMT__SHORT_VAR_DECL, oldShortVarDecl, newShortVarDecl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setShortVarDecl(ShortVarDecl newShortVarDecl)
  {
    if (newShortVarDecl != shortVarDecl)
    {
      NotificationChain msgs = null;
      if (shortVarDecl != null)
        msgs = ((InternalEObject)shortVarDecl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SIMPLE_STMT__SHORT_VAR_DECL, null, msgs);
      if (newShortVarDecl != null)
        msgs = ((InternalEObject)newShortVarDecl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SIMPLE_STMT__SHORT_VAR_DECL, null, msgs);
      msgs = basicSetShortVarDecl(newShortVarDecl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SIMPLE_STMT__SHORT_VAR_DECL, newShortVarDecl, newShortVarDecl));
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
      case MyDslPackage.SIMPLE_STMT__EMPTY_STMT:
        return basicSetEmptyStmt(null, msgs);
      case MyDslPackage.SIMPLE_STMT__EXPRESSION:
        return basicSetExpression(null, msgs);
      case MyDslPackage.SIMPLE_STMT__SIMPLE_STMT_LINHA:
        return basicSetSimpleStmtLinha(null, msgs);
      case MyDslPackage.SIMPLE_STMT__SHORT_VAR_DECL:
        return basicSetShortVarDecl(null, msgs);
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
      case MyDslPackage.SIMPLE_STMT__EMPTY_STMT:
        return getEmptyStmt();
      case MyDslPackage.SIMPLE_STMT__EXPRESSION:
        return getExpression();
      case MyDslPackage.SIMPLE_STMT__SIMPLE_STMT_LINHA:
        return getSimpleStmtLinha();
      case MyDslPackage.SIMPLE_STMT__SHORT_VAR_DECL:
        return getShortVarDecl();
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
      case MyDslPackage.SIMPLE_STMT__EMPTY_STMT:
        setEmptyStmt((EmptyStmt)newValue);
        return;
      case MyDslPackage.SIMPLE_STMT__EXPRESSION:
        setExpression((Expression)newValue);
        return;
      case MyDslPackage.SIMPLE_STMT__SIMPLE_STMT_LINHA:
        setSimpleStmtLinha((SimpleStmtLinha)newValue);
        return;
      case MyDslPackage.SIMPLE_STMT__SHORT_VAR_DECL:
        setShortVarDecl((ShortVarDecl)newValue);
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
      case MyDslPackage.SIMPLE_STMT__EMPTY_STMT:
        setEmptyStmt((EmptyStmt)null);
        return;
      case MyDslPackage.SIMPLE_STMT__EXPRESSION:
        setExpression((Expression)null);
        return;
      case MyDslPackage.SIMPLE_STMT__SIMPLE_STMT_LINHA:
        setSimpleStmtLinha((SimpleStmtLinha)null);
        return;
      case MyDslPackage.SIMPLE_STMT__SHORT_VAR_DECL:
        setShortVarDecl((ShortVarDecl)null);
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
      case MyDslPackage.SIMPLE_STMT__EMPTY_STMT:
        return emptyStmt != null;
      case MyDslPackage.SIMPLE_STMT__EXPRESSION:
        return expression != null;
      case MyDslPackage.SIMPLE_STMT__SIMPLE_STMT_LINHA:
        return simpleStmtLinha != null;
      case MyDslPackage.SIMPLE_STMT__SHORT_VAR_DECL:
        return shortVarDecl != null;
    }
    return super.eIsSet(featureID);
  }

} //SimpleStmtImpl
