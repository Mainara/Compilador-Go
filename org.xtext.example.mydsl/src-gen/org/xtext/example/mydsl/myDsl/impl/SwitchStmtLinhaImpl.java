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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.ExprCaseClause;
import org.xtext.example.mydsl.myDsl.Expression_Linha;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.PrimaryExpr;
import org.xtext.example.mydsl.myDsl.SwitchStmtLinha;
import org.xtext.example.mydsl.myDsl.SwitchStmtLinhaLinha;
import org.xtext.example.mydsl.myDsl.TypeCaseClause;
import org.xtext.example.mydsl.myDsl.UnaryExpr;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch Stmt Linha</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.SwitchStmtLinhaImpl#getPrimaryExpr <em>Primary Expr</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.SwitchStmtLinhaImpl#getSwitchStmtLinhaLinha <em>Switch Stmt Linha Linha</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.SwitchStmtLinhaImpl#getUnary_op <em>Unary op</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.SwitchStmtLinhaImpl#getUnaryExpr <em>Unary Expr</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.SwitchStmtLinhaImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.SwitchStmtLinhaImpl#getExprCaseClause <em>Expr Case Clause</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.SwitchStmtLinhaImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.SwitchStmtLinhaImpl#getTypekeyword <em>Typekeyword</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.SwitchStmtLinhaImpl#getTypeCaseClause <em>Type Case Clause</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchStmtLinhaImpl extends MinimalEObjectImpl.Container implements SwitchStmtLinha
{
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
   * The cached value of the '{@link #getSwitchStmtLinhaLinha() <em>Switch Stmt Linha Linha</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSwitchStmtLinhaLinha()
   * @generated
   * @ordered
   */
  protected SwitchStmtLinhaLinha switchStmtLinhaLinha;

  /**
   * The default value of the '{@link #getUnary_op() <em>Unary op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnary_op()
   * @generated
   * @ordered
   */
  protected static final String UNARY_OP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUnary_op() <em>Unary op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnary_op()
   * @generated
   * @ordered
   */
  protected String unary_op = UNARY_OP_EDEFAULT;

  /**
   * The cached value of the '{@link #getUnaryExpr() <em>Unary Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnaryExpr()
   * @generated
   * @ordered
   */
  protected UnaryExpr unaryExpr;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected Expression_Linha expression;

  /**
   * The cached value of the '{@link #getExprCaseClause() <em>Expr Case Clause</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprCaseClause()
   * @generated
   * @ordered
   */
  protected EList<ExprCaseClause> exprCaseClause;

  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The default value of the '{@link #getTypekeyword() <em>Typekeyword</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypekeyword()
   * @generated
   * @ordered
   */
  protected static final String TYPEKEYWORD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTypekeyword() <em>Typekeyword</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypekeyword()
   * @generated
   * @ordered
   */
  protected String typekeyword = TYPEKEYWORD_EDEFAULT;

  /**
   * The cached value of the '{@link #getTypeCaseClause() <em>Type Case Clause</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeCaseClause()
   * @generated
   * @ordered
   */
  protected EList<TypeCaseClause> typeCaseClause;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SwitchStmtLinhaImpl()
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
    return MyDslPackage.Literals.SWITCH_STMT_LINHA;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.SWITCH_STMT_LINHA__PRIMARY_EXPR, oldPrimaryExpr, newPrimaryExpr);
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
        msgs = ((InternalEObject)primaryExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SWITCH_STMT_LINHA__PRIMARY_EXPR, null, msgs);
      if (newPrimaryExpr != null)
        msgs = ((InternalEObject)newPrimaryExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SWITCH_STMT_LINHA__PRIMARY_EXPR, null, msgs);
      msgs = basicSetPrimaryExpr(newPrimaryExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SWITCH_STMT_LINHA__PRIMARY_EXPR, newPrimaryExpr, newPrimaryExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SwitchStmtLinhaLinha getSwitchStmtLinhaLinha()
  {
    return switchStmtLinhaLinha;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSwitchStmtLinhaLinha(SwitchStmtLinhaLinha newSwitchStmtLinhaLinha, NotificationChain msgs)
  {
    SwitchStmtLinhaLinha oldSwitchStmtLinhaLinha = switchStmtLinhaLinha;
    switchStmtLinhaLinha = newSwitchStmtLinhaLinha;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.SWITCH_STMT_LINHA__SWITCH_STMT_LINHA_LINHA, oldSwitchStmtLinhaLinha, newSwitchStmtLinhaLinha);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSwitchStmtLinhaLinha(SwitchStmtLinhaLinha newSwitchStmtLinhaLinha)
  {
    if (newSwitchStmtLinhaLinha != switchStmtLinhaLinha)
    {
      NotificationChain msgs = null;
      if (switchStmtLinhaLinha != null)
        msgs = ((InternalEObject)switchStmtLinhaLinha).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SWITCH_STMT_LINHA__SWITCH_STMT_LINHA_LINHA, null, msgs);
      if (newSwitchStmtLinhaLinha != null)
        msgs = ((InternalEObject)newSwitchStmtLinhaLinha).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SWITCH_STMT_LINHA__SWITCH_STMT_LINHA_LINHA, null, msgs);
      msgs = basicSetSwitchStmtLinhaLinha(newSwitchStmtLinhaLinha, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SWITCH_STMT_LINHA__SWITCH_STMT_LINHA_LINHA, newSwitchStmtLinhaLinha, newSwitchStmtLinhaLinha));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUnary_op()
  {
    return unary_op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnary_op(String newUnary_op)
  {
    String oldUnary_op = unary_op;
    unary_op = newUnary_op;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SWITCH_STMT_LINHA__UNARY_OP, oldUnary_op, unary_op));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryExpr getUnaryExpr()
  {
    return unaryExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnaryExpr(UnaryExpr newUnaryExpr, NotificationChain msgs)
  {
    UnaryExpr oldUnaryExpr = unaryExpr;
    unaryExpr = newUnaryExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.SWITCH_STMT_LINHA__UNARY_EXPR, oldUnaryExpr, newUnaryExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnaryExpr(UnaryExpr newUnaryExpr)
  {
    if (newUnaryExpr != unaryExpr)
    {
      NotificationChain msgs = null;
      if (unaryExpr != null)
        msgs = ((InternalEObject)unaryExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SWITCH_STMT_LINHA__UNARY_EXPR, null, msgs);
      if (newUnaryExpr != null)
        msgs = ((InternalEObject)newUnaryExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SWITCH_STMT_LINHA__UNARY_EXPR, null, msgs);
      msgs = basicSetUnaryExpr(newUnaryExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SWITCH_STMT_LINHA__UNARY_EXPR, newUnaryExpr, newUnaryExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression_Linha getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(Expression_Linha newExpression, NotificationChain msgs)
  {
    Expression_Linha oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.SWITCH_STMT_LINHA__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(Expression_Linha newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SWITCH_STMT_LINHA__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SWITCH_STMT_LINHA__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SWITCH_STMT_LINHA__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExprCaseClause> getExprCaseClause()
  {
    if (exprCaseClause == null)
    {
      exprCaseClause = new EObjectContainmentEList<ExprCaseClause>(ExprCaseClause.class, this, MyDslPackage.SWITCH_STMT_LINHA__EXPR_CASE_CLAUSE);
    }
    return exprCaseClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SWITCH_STMT_LINHA__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTypekeyword()
  {
    return typekeyword;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypekeyword(String newTypekeyword)
  {
    String oldTypekeyword = typekeyword;
    typekeyword = newTypekeyword;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SWITCH_STMT_LINHA__TYPEKEYWORD, oldTypekeyword, typekeyword));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeCaseClause> getTypeCaseClause()
  {
    if (typeCaseClause == null)
    {
      typeCaseClause = new EObjectContainmentEList<TypeCaseClause>(TypeCaseClause.class, this, MyDslPackage.SWITCH_STMT_LINHA__TYPE_CASE_CLAUSE);
    }
    return typeCaseClause;
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
      case MyDslPackage.SWITCH_STMT_LINHA__PRIMARY_EXPR:
        return basicSetPrimaryExpr(null, msgs);
      case MyDslPackage.SWITCH_STMT_LINHA__SWITCH_STMT_LINHA_LINHA:
        return basicSetSwitchStmtLinhaLinha(null, msgs);
      case MyDslPackage.SWITCH_STMT_LINHA__UNARY_EXPR:
        return basicSetUnaryExpr(null, msgs);
      case MyDslPackage.SWITCH_STMT_LINHA__EXPRESSION:
        return basicSetExpression(null, msgs);
      case MyDslPackage.SWITCH_STMT_LINHA__EXPR_CASE_CLAUSE:
        return ((InternalEList<?>)getExprCaseClause()).basicRemove(otherEnd, msgs);
      case MyDslPackage.SWITCH_STMT_LINHA__TYPE_CASE_CLAUSE:
        return ((InternalEList<?>)getTypeCaseClause()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.SWITCH_STMT_LINHA__PRIMARY_EXPR:
        return getPrimaryExpr();
      case MyDslPackage.SWITCH_STMT_LINHA__SWITCH_STMT_LINHA_LINHA:
        return getSwitchStmtLinhaLinha();
      case MyDslPackage.SWITCH_STMT_LINHA__UNARY_OP:
        return getUnary_op();
      case MyDslPackage.SWITCH_STMT_LINHA__UNARY_EXPR:
        return getUnaryExpr();
      case MyDslPackage.SWITCH_STMT_LINHA__EXPRESSION:
        return getExpression();
      case MyDslPackage.SWITCH_STMT_LINHA__EXPR_CASE_CLAUSE:
        return getExprCaseClause();
      case MyDslPackage.SWITCH_STMT_LINHA__ID:
        return getId();
      case MyDslPackage.SWITCH_STMT_LINHA__TYPEKEYWORD:
        return getTypekeyword();
      case MyDslPackage.SWITCH_STMT_LINHA__TYPE_CASE_CLAUSE:
        return getTypeCaseClause();
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
      case MyDslPackage.SWITCH_STMT_LINHA__PRIMARY_EXPR:
        setPrimaryExpr((PrimaryExpr)newValue);
        return;
      case MyDslPackage.SWITCH_STMT_LINHA__SWITCH_STMT_LINHA_LINHA:
        setSwitchStmtLinhaLinha((SwitchStmtLinhaLinha)newValue);
        return;
      case MyDslPackage.SWITCH_STMT_LINHA__UNARY_OP:
        setUnary_op((String)newValue);
        return;
      case MyDslPackage.SWITCH_STMT_LINHA__UNARY_EXPR:
        setUnaryExpr((UnaryExpr)newValue);
        return;
      case MyDslPackage.SWITCH_STMT_LINHA__EXPRESSION:
        setExpression((Expression_Linha)newValue);
        return;
      case MyDslPackage.SWITCH_STMT_LINHA__EXPR_CASE_CLAUSE:
        getExprCaseClause().clear();
        getExprCaseClause().addAll((Collection<? extends ExprCaseClause>)newValue);
        return;
      case MyDslPackage.SWITCH_STMT_LINHA__ID:
        setId((String)newValue);
        return;
      case MyDslPackage.SWITCH_STMT_LINHA__TYPEKEYWORD:
        setTypekeyword((String)newValue);
        return;
      case MyDslPackage.SWITCH_STMT_LINHA__TYPE_CASE_CLAUSE:
        getTypeCaseClause().clear();
        getTypeCaseClause().addAll((Collection<? extends TypeCaseClause>)newValue);
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
      case MyDslPackage.SWITCH_STMT_LINHA__PRIMARY_EXPR:
        setPrimaryExpr((PrimaryExpr)null);
        return;
      case MyDslPackage.SWITCH_STMT_LINHA__SWITCH_STMT_LINHA_LINHA:
        setSwitchStmtLinhaLinha((SwitchStmtLinhaLinha)null);
        return;
      case MyDslPackage.SWITCH_STMT_LINHA__UNARY_OP:
        setUnary_op(UNARY_OP_EDEFAULT);
        return;
      case MyDslPackage.SWITCH_STMT_LINHA__UNARY_EXPR:
        setUnaryExpr((UnaryExpr)null);
        return;
      case MyDslPackage.SWITCH_STMT_LINHA__EXPRESSION:
        setExpression((Expression_Linha)null);
        return;
      case MyDslPackage.SWITCH_STMT_LINHA__EXPR_CASE_CLAUSE:
        getExprCaseClause().clear();
        return;
      case MyDslPackage.SWITCH_STMT_LINHA__ID:
        setId(ID_EDEFAULT);
        return;
      case MyDslPackage.SWITCH_STMT_LINHA__TYPEKEYWORD:
        setTypekeyword(TYPEKEYWORD_EDEFAULT);
        return;
      case MyDslPackage.SWITCH_STMT_LINHA__TYPE_CASE_CLAUSE:
        getTypeCaseClause().clear();
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
      case MyDslPackage.SWITCH_STMT_LINHA__PRIMARY_EXPR:
        return primaryExpr != null;
      case MyDslPackage.SWITCH_STMT_LINHA__SWITCH_STMT_LINHA_LINHA:
        return switchStmtLinhaLinha != null;
      case MyDslPackage.SWITCH_STMT_LINHA__UNARY_OP:
        return UNARY_OP_EDEFAULT == null ? unary_op != null : !UNARY_OP_EDEFAULT.equals(unary_op);
      case MyDslPackage.SWITCH_STMT_LINHA__UNARY_EXPR:
        return unaryExpr != null;
      case MyDslPackage.SWITCH_STMT_LINHA__EXPRESSION:
        return expression != null;
      case MyDslPackage.SWITCH_STMT_LINHA__EXPR_CASE_CLAUSE:
        return exprCaseClause != null && !exprCaseClause.isEmpty();
      case MyDslPackage.SWITCH_STMT_LINHA__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case MyDslPackage.SWITCH_STMT_LINHA__TYPEKEYWORD:
        return TYPEKEYWORD_EDEFAULT == null ? typekeyword != null : !TYPEKEYWORD_EDEFAULT.equals(typekeyword);
      case MyDslPackage.SWITCH_STMT_LINHA__TYPE_CASE_CLAUSE:
        return typeCaseClause != null && !typeCaseClause.isEmpty();
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
    result.append(", id: ");
    result.append(id);
    result.append(", typekeyword: ");
    result.append(typekeyword);
    result.append(')');
    return result.toString();
  }

} //SwitchStmtLinhaImpl
