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

import org.xtext.example.mydsl.myDsl.ConstDecl;
import org.xtext.example.mydsl.myDsl.Declaration;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.TypeDecl;
import org.xtext.example.mydsl.myDsl.VarDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DeclarationImpl#getConstDecl <em>Const Decl</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DeclarationImpl#getTypeDecl <em>Type Decl</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DeclarationImpl#getVarDecl <em>Var Decl</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeclarationImpl extends MinimalEObjectImpl.Container implements Declaration
{
  /**
   * The cached value of the '{@link #getConstDecl() <em>Const Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstDecl()
   * @generated
   * @ordered
   */
  protected ConstDecl constDecl;

  /**
   * The cached value of the '{@link #getTypeDecl() <em>Type Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeDecl()
   * @generated
   * @ordered
   */
  protected TypeDecl typeDecl;

  /**
   * The cached value of the '{@link #getVarDecl() <em>Var Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarDecl()
   * @generated
   * @ordered
   */
  protected VarDecl varDecl;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeclarationImpl()
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
    return MyDslPackage.Literals.DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstDecl getConstDecl()
  {
    return constDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstDecl(ConstDecl newConstDecl, NotificationChain msgs)
  {
    ConstDecl oldConstDecl = constDecl;
    constDecl = newConstDecl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.DECLARATION__CONST_DECL, oldConstDecl, newConstDecl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstDecl(ConstDecl newConstDecl)
  {
    if (newConstDecl != constDecl)
    {
      NotificationChain msgs = null;
      if (constDecl != null)
        msgs = ((InternalEObject)constDecl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DECLARATION__CONST_DECL, null, msgs);
      if (newConstDecl != null)
        msgs = ((InternalEObject)newConstDecl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DECLARATION__CONST_DECL, null, msgs);
      msgs = basicSetConstDecl(newConstDecl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DECLARATION__CONST_DECL, newConstDecl, newConstDecl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDecl getTypeDecl()
  {
    return typeDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeDecl(TypeDecl newTypeDecl, NotificationChain msgs)
  {
    TypeDecl oldTypeDecl = typeDecl;
    typeDecl = newTypeDecl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.DECLARATION__TYPE_DECL, oldTypeDecl, newTypeDecl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeDecl(TypeDecl newTypeDecl)
  {
    if (newTypeDecl != typeDecl)
    {
      NotificationChain msgs = null;
      if (typeDecl != null)
        msgs = ((InternalEObject)typeDecl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DECLARATION__TYPE_DECL, null, msgs);
      if (newTypeDecl != null)
        msgs = ((InternalEObject)newTypeDecl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DECLARATION__TYPE_DECL, null, msgs);
      msgs = basicSetTypeDecl(newTypeDecl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DECLARATION__TYPE_DECL, newTypeDecl, newTypeDecl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarDecl getVarDecl()
  {
    return varDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVarDecl(VarDecl newVarDecl, NotificationChain msgs)
  {
    VarDecl oldVarDecl = varDecl;
    varDecl = newVarDecl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.DECLARATION__VAR_DECL, oldVarDecl, newVarDecl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVarDecl(VarDecl newVarDecl)
  {
    if (newVarDecl != varDecl)
    {
      NotificationChain msgs = null;
      if (varDecl != null)
        msgs = ((InternalEObject)varDecl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DECLARATION__VAR_DECL, null, msgs);
      if (newVarDecl != null)
        msgs = ((InternalEObject)newVarDecl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DECLARATION__VAR_DECL, null, msgs);
      msgs = basicSetVarDecl(newVarDecl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DECLARATION__VAR_DECL, newVarDecl, newVarDecl));
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
      case MyDslPackage.DECLARATION__CONST_DECL:
        return basicSetConstDecl(null, msgs);
      case MyDslPackage.DECLARATION__TYPE_DECL:
        return basicSetTypeDecl(null, msgs);
      case MyDslPackage.DECLARATION__VAR_DECL:
        return basicSetVarDecl(null, msgs);
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
      case MyDslPackage.DECLARATION__CONST_DECL:
        return getConstDecl();
      case MyDslPackage.DECLARATION__TYPE_DECL:
        return getTypeDecl();
      case MyDslPackage.DECLARATION__VAR_DECL:
        return getVarDecl();
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
      case MyDslPackage.DECLARATION__CONST_DECL:
        setConstDecl((ConstDecl)newValue);
        return;
      case MyDslPackage.DECLARATION__TYPE_DECL:
        setTypeDecl((TypeDecl)newValue);
        return;
      case MyDslPackage.DECLARATION__VAR_DECL:
        setVarDecl((VarDecl)newValue);
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
      case MyDslPackage.DECLARATION__CONST_DECL:
        setConstDecl((ConstDecl)null);
        return;
      case MyDslPackage.DECLARATION__TYPE_DECL:
        setTypeDecl((TypeDecl)null);
        return;
      case MyDslPackage.DECLARATION__VAR_DECL:
        setVarDecl((VarDecl)null);
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
      case MyDslPackage.DECLARATION__CONST_DECL:
        return constDecl != null;
      case MyDslPackage.DECLARATION__TYPE_DECL:
        return typeDecl != null;
      case MyDslPackage.DECLARATION__VAR_DECL:
        return varDecl != null;
    }
    return super.eIsSet(featureID);
  }

} //DeclarationImpl
