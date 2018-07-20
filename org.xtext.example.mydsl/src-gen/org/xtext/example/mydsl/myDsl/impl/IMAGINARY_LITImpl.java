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

import org.xtext.example.mydsl.myDsl.FLOAT_LIT;
import org.xtext.example.mydsl.myDsl.IMAGINARY_LIT;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IMAGINARY LIT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.IMAGINARY_LITImpl#getDECIMALS <em>DECIMALS</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.IMAGINARY_LITImpl#getFLOAT_LIT <em>FLOAT LIT</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IMAGINARY_LITImpl extends MinimalEObjectImpl.Container implements IMAGINARY_LIT
{
  /**
   * The default value of the '{@link #getDECIMALS() <em>DECIMALS</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDECIMALS()
   * @generated
   * @ordered
   */
  protected static final String DECIMALS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDECIMALS() <em>DECIMALS</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDECIMALS()
   * @generated
   * @ordered
   */
  protected String dECIMALS = DECIMALS_EDEFAULT;

  /**
   * The cached value of the '{@link #getFLOAT_LIT() <em>FLOAT LIT</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFLOAT_LIT()
   * @generated
   * @ordered
   */
  protected FLOAT_LIT fLOAT_LIT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IMAGINARY_LITImpl()
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
    return MyDslPackage.Literals.IMAGINARY_LIT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDECIMALS()
  {
    return dECIMALS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDECIMALS(String newDECIMALS)
  {
    String oldDECIMALS = dECIMALS;
    dECIMALS = newDECIMALS;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.IMAGINARY_LIT__DECIMALS, oldDECIMALS, dECIMALS));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FLOAT_LIT getFLOAT_LIT()
  {
    return fLOAT_LIT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFLOAT_LIT(FLOAT_LIT newFLOAT_LIT, NotificationChain msgs)
  {
    FLOAT_LIT oldFLOAT_LIT = fLOAT_LIT;
    fLOAT_LIT = newFLOAT_LIT;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.IMAGINARY_LIT__FLOAT_LIT, oldFLOAT_LIT, newFLOAT_LIT);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFLOAT_LIT(FLOAT_LIT newFLOAT_LIT)
  {
    if (newFLOAT_LIT != fLOAT_LIT)
    {
      NotificationChain msgs = null;
      if (fLOAT_LIT != null)
        msgs = ((InternalEObject)fLOAT_LIT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.IMAGINARY_LIT__FLOAT_LIT, null, msgs);
      if (newFLOAT_LIT != null)
        msgs = ((InternalEObject)newFLOAT_LIT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.IMAGINARY_LIT__FLOAT_LIT, null, msgs);
      msgs = basicSetFLOAT_LIT(newFLOAT_LIT, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.IMAGINARY_LIT__FLOAT_LIT, newFLOAT_LIT, newFLOAT_LIT));
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
      case MyDslPackage.IMAGINARY_LIT__FLOAT_LIT:
        return basicSetFLOAT_LIT(null, msgs);
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
      case MyDslPackage.IMAGINARY_LIT__DECIMALS:
        return getDECIMALS();
      case MyDslPackage.IMAGINARY_LIT__FLOAT_LIT:
        return getFLOAT_LIT();
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
      case MyDslPackage.IMAGINARY_LIT__DECIMALS:
        setDECIMALS((String)newValue);
        return;
      case MyDslPackage.IMAGINARY_LIT__FLOAT_LIT:
        setFLOAT_LIT((FLOAT_LIT)newValue);
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
      case MyDslPackage.IMAGINARY_LIT__DECIMALS:
        setDECIMALS(DECIMALS_EDEFAULT);
        return;
      case MyDslPackage.IMAGINARY_LIT__FLOAT_LIT:
        setFLOAT_LIT((FLOAT_LIT)null);
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
      case MyDslPackage.IMAGINARY_LIT__DECIMALS:
        return DECIMALS_EDEFAULT == null ? dECIMALS != null : !DECIMALS_EDEFAULT.equals(dECIMALS);
      case MyDslPackage.IMAGINARY_LIT__FLOAT_LIT:
        return fLOAT_LIT != null;
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
    result.append(" (dECIMALS: ");
    result.append(dECIMALS);
    result.append(')');
    return result.toString();
  }

} //IMAGINARY_LITImpl