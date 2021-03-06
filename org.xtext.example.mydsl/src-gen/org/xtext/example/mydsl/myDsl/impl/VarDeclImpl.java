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

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.VarDecl;
import org.xtext.example.mydsl.myDsl.VarSpec;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Var Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.VarDeclImpl#getVar <em>Var</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.VarDeclImpl#getVarSpec <em>Var Spec</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.VarDeclImpl#getVarSpec1 <em>Var Spec1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VarDeclImpl extends MinimalEObjectImpl.Container implements VarDecl
{
  /**
   * The default value of the '{@link #getVar() <em>Var</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar()
   * @generated
   * @ordered
   */
  protected static final String VAR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVar() <em>Var</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar()
   * @generated
   * @ordered
   */
  protected String var = VAR_EDEFAULT;

  /**
   * The cached value of the '{@link #getVarSpec() <em>Var Spec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarSpec()
   * @generated
   * @ordered
   */
  protected VarSpec varSpec;

  /**
   * The cached value of the '{@link #getVarSpec1() <em>Var Spec1</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarSpec1()
   * @generated
   * @ordered
   */
  protected EList<VarSpec> varSpec1;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VarDeclImpl()
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
    return MyDslPackage.Literals.VAR_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVar()
  {
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVar(String newVar)
  {
    String oldVar = var;
    var = newVar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.VAR_DECL__VAR, oldVar, var));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarSpec getVarSpec()
  {
    return varSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVarSpec(VarSpec newVarSpec, NotificationChain msgs)
  {
    VarSpec oldVarSpec = varSpec;
    varSpec = newVarSpec;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.VAR_DECL__VAR_SPEC, oldVarSpec, newVarSpec);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVarSpec(VarSpec newVarSpec)
  {
    if (newVarSpec != varSpec)
    {
      NotificationChain msgs = null;
      if (varSpec != null)
        msgs = ((InternalEObject)varSpec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.VAR_DECL__VAR_SPEC, null, msgs);
      if (newVarSpec != null)
        msgs = ((InternalEObject)newVarSpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.VAR_DECL__VAR_SPEC, null, msgs);
      msgs = basicSetVarSpec(newVarSpec, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.VAR_DECL__VAR_SPEC, newVarSpec, newVarSpec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VarSpec> getVarSpec1()
  {
    if (varSpec1 == null)
    {
      varSpec1 = new EObjectContainmentEList<VarSpec>(VarSpec.class, this, MyDslPackage.VAR_DECL__VAR_SPEC1);
    }
    return varSpec1;
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
      case MyDslPackage.VAR_DECL__VAR_SPEC:
        return basicSetVarSpec(null, msgs);
      case MyDslPackage.VAR_DECL__VAR_SPEC1:
        return ((InternalEList<?>)getVarSpec1()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.VAR_DECL__VAR:
        return getVar();
      case MyDslPackage.VAR_DECL__VAR_SPEC:
        return getVarSpec();
      case MyDslPackage.VAR_DECL__VAR_SPEC1:
        return getVarSpec1();
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
      case MyDslPackage.VAR_DECL__VAR:
        setVar((String)newValue);
        return;
      case MyDslPackage.VAR_DECL__VAR_SPEC:
        setVarSpec((VarSpec)newValue);
        return;
      case MyDslPackage.VAR_DECL__VAR_SPEC1:
        getVarSpec1().clear();
        getVarSpec1().addAll((Collection<? extends VarSpec>)newValue);
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
      case MyDslPackage.VAR_DECL__VAR:
        setVar(VAR_EDEFAULT);
        return;
      case MyDslPackage.VAR_DECL__VAR_SPEC:
        setVarSpec((VarSpec)null);
        return;
      case MyDslPackage.VAR_DECL__VAR_SPEC1:
        getVarSpec1().clear();
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
      case MyDslPackage.VAR_DECL__VAR:
        return VAR_EDEFAULT == null ? var != null : !VAR_EDEFAULT.equals(var);
      case MyDslPackage.VAR_DECL__VAR_SPEC:
        return varSpec != null;
      case MyDslPackage.VAR_DECL__VAR_SPEC1:
        return varSpec1 != null && !varSpec1.isEmpty();
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
    result.append(" (var: ");
    result.append(var);
    result.append(')');
    return result.toString();
  }

} //VarDeclImpl
