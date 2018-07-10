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
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.SwitchStmtLinhaLinha;
import org.xtext.example.mydsl.myDsl.TypeCaseClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch Stmt Linha Linha</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.SwitchStmtLinhaLinhaImpl#getExprCaseClause <em>Expr Case Clause</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.SwitchStmtLinhaLinhaImpl#getTypekeyword <em>Typekeyword</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.SwitchStmtLinhaLinhaImpl#getTypeCaseClause <em>Type Case Clause</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchStmtLinhaLinhaImpl extends MinimalEObjectImpl.Container implements SwitchStmtLinhaLinha
{
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
  protected SwitchStmtLinhaLinhaImpl()
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
    return MyDslPackage.Literals.SWITCH_STMT_LINHA_LINHA;
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
      exprCaseClause = new EObjectContainmentEList<ExprCaseClause>(ExprCaseClause.class, this, MyDslPackage.SWITCH_STMT_LINHA_LINHA__EXPR_CASE_CLAUSE);
    }
    return exprCaseClause;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SWITCH_STMT_LINHA_LINHA__TYPEKEYWORD, oldTypekeyword, typekeyword));
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
      typeCaseClause = new EObjectContainmentEList<TypeCaseClause>(TypeCaseClause.class, this, MyDslPackage.SWITCH_STMT_LINHA_LINHA__TYPE_CASE_CLAUSE);
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
      case MyDslPackage.SWITCH_STMT_LINHA_LINHA__EXPR_CASE_CLAUSE:
        return ((InternalEList<?>)getExprCaseClause()).basicRemove(otherEnd, msgs);
      case MyDslPackage.SWITCH_STMT_LINHA_LINHA__TYPE_CASE_CLAUSE:
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
      case MyDslPackage.SWITCH_STMT_LINHA_LINHA__EXPR_CASE_CLAUSE:
        return getExprCaseClause();
      case MyDslPackage.SWITCH_STMT_LINHA_LINHA__TYPEKEYWORD:
        return getTypekeyword();
      case MyDslPackage.SWITCH_STMT_LINHA_LINHA__TYPE_CASE_CLAUSE:
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
      case MyDslPackage.SWITCH_STMT_LINHA_LINHA__EXPR_CASE_CLAUSE:
        getExprCaseClause().clear();
        getExprCaseClause().addAll((Collection<? extends ExprCaseClause>)newValue);
        return;
      case MyDslPackage.SWITCH_STMT_LINHA_LINHA__TYPEKEYWORD:
        setTypekeyword((String)newValue);
        return;
      case MyDslPackage.SWITCH_STMT_LINHA_LINHA__TYPE_CASE_CLAUSE:
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
      case MyDslPackage.SWITCH_STMT_LINHA_LINHA__EXPR_CASE_CLAUSE:
        getExprCaseClause().clear();
        return;
      case MyDslPackage.SWITCH_STMT_LINHA_LINHA__TYPEKEYWORD:
        setTypekeyword(TYPEKEYWORD_EDEFAULT);
        return;
      case MyDslPackage.SWITCH_STMT_LINHA_LINHA__TYPE_CASE_CLAUSE:
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
      case MyDslPackage.SWITCH_STMT_LINHA_LINHA__EXPR_CASE_CLAUSE:
        return exprCaseClause != null && !exprCaseClause.isEmpty();
      case MyDslPackage.SWITCH_STMT_LINHA_LINHA__TYPEKEYWORD:
        return TYPEKEYWORD_EDEFAULT == null ? typekeyword != null : !TYPEKEYWORD_EDEFAULT.equals(typekeyword);
      case MyDslPackage.SWITCH_STMT_LINHA_LINHA__TYPE_CASE_CLAUSE:
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
    result.append(" (typekeyword: ");
    result.append(typekeyword);
    result.append(')');
    return result.toString();
  }

} //SwitchStmtLinhaLinhaImpl
