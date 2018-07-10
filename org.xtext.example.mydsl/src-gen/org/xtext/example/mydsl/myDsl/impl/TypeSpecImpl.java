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

import org.xtext.example.mydsl.myDsl.AliasDecl;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.TypeDef;
import org.xtext.example.mydsl.myDsl.TypeSpec;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.TypeSpecImpl#getAliasDecl <em>Alias Decl</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.TypeSpecImpl#getTypeDef <em>Type Def</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeSpecImpl extends MinimalEObjectImpl.Container implements TypeSpec
{
  /**
   * The cached value of the '{@link #getAliasDecl() <em>Alias Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAliasDecl()
   * @generated
   * @ordered
   */
  protected AliasDecl aliasDecl;

  /**
   * The cached value of the '{@link #getTypeDef() <em>Type Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeDef()
   * @generated
   * @ordered
   */
  protected TypeDef typeDef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeSpecImpl()
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
    return MyDslPackage.Literals.TYPE_SPEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AliasDecl getAliasDecl()
  {
    return aliasDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAliasDecl(AliasDecl newAliasDecl, NotificationChain msgs)
  {
    AliasDecl oldAliasDecl = aliasDecl;
    aliasDecl = newAliasDecl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE_SPEC__ALIAS_DECL, oldAliasDecl, newAliasDecl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAliasDecl(AliasDecl newAliasDecl)
  {
    if (newAliasDecl != aliasDecl)
    {
      NotificationChain msgs = null;
      if (aliasDecl != null)
        msgs = ((InternalEObject)aliasDecl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TYPE_SPEC__ALIAS_DECL, null, msgs);
      if (newAliasDecl != null)
        msgs = ((InternalEObject)newAliasDecl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TYPE_SPEC__ALIAS_DECL, null, msgs);
      msgs = basicSetAliasDecl(newAliasDecl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE_SPEC__ALIAS_DECL, newAliasDecl, newAliasDecl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDef getTypeDef()
  {
    return typeDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeDef(TypeDef newTypeDef, NotificationChain msgs)
  {
    TypeDef oldTypeDef = typeDef;
    typeDef = newTypeDef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE_SPEC__TYPE_DEF, oldTypeDef, newTypeDef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeDef(TypeDef newTypeDef)
  {
    if (newTypeDef != typeDef)
    {
      NotificationChain msgs = null;
      if (typeDef != null)
        msgs = ((InternalEObject)typeDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TYPE_SPEC__TYPE_DEF, null, msgs);
      if (newTypeDef != null)
        msgs = ((InternalEObject)newTypeDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TYPE_SPEC__TYPE_DEF, null, msgs);
      msgs = basicSetTypeDef(newTypeDef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TYPE_SPEC__TYPE_DEF, newTypeDef, newTypeDef));
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
      case MyDslPackage.TYPE_SPEC__ALIAS_DECL:
        return basicSetAliasDecl(null, msgs);
      case MyDslPackage.TYPE_SPEC__TYPE_DEF:
        return basicSetTypeDef(null, msgs);
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
      case MyDslPackage.TYPE_SPEC__ALIAS_DECL:
        return getAliasDecl();
      case MyDslPackage.TYPE_SPEC__TYPE_DEF:
        return getTypeDef();
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
      case MyDslPackage.TYPE_SPEC__ALIAS_DECL:
        setAliasDecl((AliasDecl)newValue);
        return;
      case MyDslPackage.TYPE_SPEC__TYPE_DEF:
        setTypeDef((TypeDef)newValue);
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
      case MyDslPackage.TYPE_SPEC__ALIAS_DECL:
        setAliasDecl((AliasDecl)null);
        return;
      case MyDslPackage.TYPE_SPEC__TYPE_DEF:
        setTypeDef((TypeDef)null);
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
      case MyDslPackage.TYPE_SPEC__ALIAS_DECL:
        return aliasDecl != null;
      case MyDslPackage.TYPE_SPEC__TYPE_DEF:
        return typeDef != null;
    }
    return super.eIsSet(featureID);
  }

} //TypeSpecImpl
