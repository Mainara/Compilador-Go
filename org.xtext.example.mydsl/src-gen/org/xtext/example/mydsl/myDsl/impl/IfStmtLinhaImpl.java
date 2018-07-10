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

import org.xtext.example.mydsl.myDsl.Block;
import org.xtext.example.mydsl.myDsl.Expression;
import org.xtext.example.mydsl.myDsl.IfStmt;
import org.xtext.example.mydsl.myDsl.IfStmtLinha;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.SimpleStmtLinha;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Stmt Linha</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.IfStmtLinhaImpl#getSimpleStmtLinha <em>Simple Stmt Linha</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.IfStmtLinhaImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.IfStmtLinhaImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.IfStmtLinhaImpl#getElse <em>Else</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.IfStmtLinhaImpl#getIfStmt <em>If Stmt</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.IfStmtLinhaImpl#getBlock1 <em>Block1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfStmtLinhaImpl extends MinimalEObjectImpl.Container implements IfStmtLinha
{
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
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected Expression expression;

  /**
   * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlock()
   * @generated
   * @ordered
   */
  protected Block block;

  /**
   * The default value of the '{@link #getElse() <em>Else</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElse()
   * @generated
   * @ordered
   */
  protected static final String ELSE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getElse() <em>Else</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElse()
   * @generated
   * @ordered
   */
  protected String else_ = ELSE_EDEFAULT;

  /**
   * The cached value of the '{@link #getIfStmt() <em>If Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfStmt()
   * @generated
   * @ordered
   */
  protected IfStmt ifStmt;

  /**
   * The cached value of the '{@link #getBlock1() <em>Block1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlock1()
   * @generated
   * @ordered
   */
  protected Block block1;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IfStmtLinhaImpl()
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
    return MyDslPackage.Literals.IF_STMT_LINHA;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.IF_STMT_LINHA__SIMPLE_STMT_LINHA, oldSimpleStmtLinha, newSimpleStmtLinha);
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
        msgs = ((InternalEObject)simpleStmtLinha).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.IF_STMT_LINHA__SIMPLE_STMT_LINHA, null, msgs);
      if (newSimpleStmtLinha != null)
        msgs = ((InternalEObject)newSimpleStmtLinha).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.IF_STMT_LINHA__SIMPLE_STMT_LINHA, null, msgs);
      msgs = basicSetSimpleStmtLinha(newSimpleStmtLinha, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.IF_STMT_LINHA__SIMPLE_STMT_LINHA, newSimpleStmtLinha, newSimpleStmtLinha));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.IF_STMT_LINHA__EXPRESSION, oldExpression, newExpression);
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
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.IF_STMT_LINHA__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.IF_STMT_LINHA__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.IF_STMT_LINHA__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block getBlock()
  {
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlock(Block newBlock, NotificationChain msgs)
  {
    Block oldBlock = block;
    block = newBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.IF_STMT_LINHA__BLOCK, oldBlock, newBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlock(Block newBlock)
  {
    if (newBlock != block)
    {
      NotificationChain msgs = null;
      if (block != null)
        msgs = ((InternalEObject)block).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.IF_STMT_LINHA__BLOCK, null, msgs);
      if (newBlock != null)
        msgs = ((InternalEObject)newBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.IF_STMT_LINHA__BLOCK, null, msgs);
      msgs = basicSetBlock(newBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.IF_STMT_LINHA__BLOCK, newBlock, newBlock));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getElse()
  {
    return else_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElse(String newElse)
  {
    String oldElse = else_;
    else_ = newElse;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.IF_STMT_LINHA__ELSE, oldElse, else_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfStmt getIfStmt()
  {
    return ifStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIfStmt(IfStmt newIfStmt, NotificationChain msgs)
  {
    IfStmt oldIfStmt = ifStmt;
    ifStmt = newIfStmt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.IF_STMT_LINHA__IF_STMT, oldIfStmt, newIfStmt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIfStmt(IfStmt newIfStmt)
  {
    if (newIfStmt != ifStmt)
    {
      NotificationChain msgs = null;
      if (ifStmt != null)
        msgs = ((InternalEObject)ifStmt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.IF_STMT_LINHA__IF_STMT, null, msgs);
      if (newIfStmt != null)
        msgs = ((InternalEObject)newIfStmt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.IF_STMT_LINHA__IF_STMT, null, msgs);
      msgs = basicSetIfStmt(newIfStmt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.IF_STMT_LINHA__IF_STMT, newIfStmt, newIfStmt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block getBlock1()
  {
    return block1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlock1(Block newBlock1, NotificationChain msgs)
  {
    Block oldBlock1 = block1;
    block1 = newBlock1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.IF_STMT_LINHA__BLOCK1, oldBlock1, newBlock1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlock1(Block newBlock1)
  {
    if (newBlock1 != block1)
    {
      NotificationChain msgs = null;
      if (block1 != null)
        msgs = ((InternalEObject)block1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.IF_STMT_LINHA__BLOCK1, null, msgs);
      if (newBlock1 != null)
        msgs = ((InternalEObject)newBlock1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.IF_STMT_LINHA__BLOCK1, null, msgs);
      msgs = basicSetBlock1(newBlock1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.IF_STMT_LINHA__BLOCK1, newBlock1, newBlock1));
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
      case MyDslPackage.IF_STMT_LINHA__SIMPLE_STMT_LINHA:
        return basicSetSimpleStmtLinha(null, msgs);
      case MyDslPackage.IF_STMT_LINHA__EXPRESSION:
        return basicSetExpression(null, msgs);
      case MyDslPackage.IF_STMT_LINHA__BLOCK:
        return basicSetBlock(null, msgs);
      case MyDslPackage.IF_STMT_LINHA__IF_STMT:
        return basicSetIfStmt(null, msgs);
      case MyDslPackage.IF_STMT_LINHA__BLOCK1:
        return basicSetBlock1(null, msgs);
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
      case MyDslPackage.IF_STMT_LINHA__SIMPLE_STMT_LINHA:
        return getSimpleStmtLinha();
      case MyDslPackage.IF_STMT_LINHA__EXPRESSION:
        return getExpression();
      case MyDslPackage.IF_STMT_LINHA__BLOCK:
        return getBlock();
      case MyDslPackage.IF_STMT_LINHA__ELSE:
        return getElse();
      case MyDslPackage.IF_STMT_LINHA__IF_STMT:
        return getIfStmt();
      case MyDslPackage.IF_STMT_LINHA__BLOCK1:
        return getBlock1();
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
      case MyDslPackage.IF_STMT_LINHA__SIMPLE_STMT_LINHA:
        setSimpleStmtLinha((SimpleStmtLinha)newValue);
        return;
      case MyDslPackage.IF_STMT_LINHA__EXPRESSION:
        setExpression((Expression)newValue);
        return;
      case MyDslPackage.IF_STMT_LINHA__BLOCK:
        setBlock((Block)newValue);
        return;
      case MyDslPackage.IF_STMT_LINHA__ELSE:
        setElse((String)newValue);
        return;
      case MyDslPackage.IF_STMT_LINHA__IF_STMT:
        setIfStmt((IfStmt)newValue);
        return;
      case MyDslPackage.IF_STMT_LINHA__BLOCK1:
        setBlock1((Block)newValue);
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
      case MyDslPackage.IF_STMT_LINHA__SIMPLE_STMT_LINHA:
        setSimpleStmtLinha((SimpleStmtLinha)null);
        return;
      case MyDslPackage.IF_STMT_LINHA__EXPRESSION:
        setExpression((Expression)null);
        return;
      case MyDslPackage.IF_STMT_LINHA__BLOCK:
        setBlock((Block)null);
        return;
      case MyDslPackage.IF_STMT_LINHA__ELSE:
        setElse(ELSE_EDEFAULT);
        return;
      case MyDslPackage.IF_STMT_LINHA__IF_STMT:
        setIfStmt((IfStmt)null);
        return;
      case MyDslPackage.IF_STMT_LINHA__BLOCK1:
        setBlock1((Block)null);
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
      case MyDslPackage.IF_STMT_LINHA__SIMPLE_STMT_LINHA:
        return simpleStmtLinha != null;
      case MyDslPackage.IF_STMT_LINHA__EXPRESSION:
        return expression != null;
      case MyDslPackage.IF_STMT_LINHA__BLOCK:
        return block != null;
      case MyDslPackage.IF_STMT_LINHA__ELSE:
        return ELSE_EDEFAULT == null ? else_ != null : !ELSE_EDEFAULT.equals(else_);
      case MyDslPackage.IF_STMT_LINHA__IF_STMT:
        return ifStmt != null;
      case MyDslPackage.IF_STMT_LINHA__BLOCK1:
        return block1 != null;
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
    result.append(" (else: ");
    result.append(else_);
    result.append(')');
    return result.toString();
  }

} //IfStmtLinhaImpl
