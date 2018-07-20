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

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.PackageClause;
import org.xtext.example.mydsl.myDsl.PackageName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.PackageClauseImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.PackageClauseImpl#getPackageName <em>Package Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageClauseImpl extends MinimalEObjectImpl.Container implements PackageClause
{
  /**
   * The default value of the '{@link #getPackage() <em>Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackage()
   * @generated
   * @ordered
   */
  protected static final String PACKAGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPackage() <em>Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackage()
   * @generated
   * @ordered
   */
  protected String package_ = PACKAGE_EDEFAULT;

  /**
   * The cached value of the '{@link #getPackageName() <em>Package Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackageName()
   * @generated
   * @ordered
   */
  protected PackageName packageName;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PackageClauseImpl()
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
    return MyDslPackage.Literals.PACKAGE_CLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPackage()
  {
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPackage(String newPackage)
  {
    String oldPackage = package_;
    package_ = newPackage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PACKAGE_CLAUSE__PACKAGE, oldPackage, package_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageName getPackageName()
  {
    return packageName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPackageName(PackageName newPackageName, NotificationChain msgs)
  {
    PackageName oldPackageName = packageName;
    packageName = newPackageName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.PACKAGE_CLAUSE__PACKAGE_NAME, oldPackageName, newPackageName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPackageName(PackageName newPackageName)
  {
    if (newPackageName != packageName)
    {
      NotificationChain msgs = null;
      if (packageName != null)
        msgs = ((InternalEObject)packageName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PACKAGE_CLAUSE__PACKAGE_NAME, null, msgs);
      if (newPackageName != null)
        msgs = ((InternalEObject)newPackageName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PACKAGE_CLAUSE__PACKAGE_NAME, null, msgs);
      msgs = basicSetPackageName(newPackageName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PACKAGE_CLAUSE__PACKAGE_NAME, newPackageName, newPackageName));
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
      case MyDslPackage.PACKAGE_CLAUSE__PACKAGE_NAME:
        return basicSetPackageName(null, msgs);
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
      case MyDslPackage.PACKAGE_CLAUSE__PACKAGE:
        return getPackage();
      case MyDslPackage.PACKAGE_CLAUSE__PACKAGE_NAME:
        return getPackageName();
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
      case MyDslPackage.PACKAGE_CLAUSE__PACKAGE:
        setPackage((String)newValue);
        return;
      case MyDslPackage.PACKAGE_CLAUSE__PACKAGE_NAME:
        setPackageName((PackageName)newValue);
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
      case MyDslPackage.PACKAGE_CLAUSE__PACKAGE:
        setPackage(PACKAGE_EDEFAULT);
        return;
      case MyDslPackage.PACKAGE_CLAUSE__PACKAGE_NAME:
        setPackageName((PackageName)null);
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
      case MyDslPackage.PACKAGE_CLAUSE__PACKAGE:
        return PACKAGE_EDEFAULT == null ? package_ != null : !PACKAGE_EDEFAULT.equals(package_);
      case MyDslPackage.PACKAGE_CLAUSE__PACKAGE_NAME:
        return packageName != null;
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
    result.append(" (package: ");
    result.append(package_);
    result.append(')');
    return result.toString();
  }

} //PackageClauseImpl