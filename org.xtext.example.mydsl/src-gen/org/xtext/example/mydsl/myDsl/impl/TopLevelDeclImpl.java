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

import org.xtext.example.mydsl.myDsl.Declaration;
import org.xtext.example.mydsl.myDsl.FunctionDecl;
import org.xtext.example.mydsl.myDsl.MethodDecl;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.TopLevelDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Top Level Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.TopLevelDeclImpl#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.TopLevelDeclImpl#getFunctionDecl <em>Function Decl</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.TopLevelDeclImpl#getMethodDecl <em>Method Decl</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopLevelDeclImpl extends MinimalEObjectImpl.Container implements TopLevelDecl
{
  /**
   * The cached value of the '{@link #getDeclaration() <em>Declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaration()
   * @generated
   * @ordered
   */
  protected Declaration declaration;

  /**
   * The cached value of the '{@link #getFunctionDecl() <em>Function Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctionDecl()
   * @generated
   * @ordered
   */
  protected FunctionDecl functionDecl;

  /**
   * The cached value of the '{@link #getMethodDecl() <em>Method Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethodDecl()
   * @generated
   * @ordered
   */
  protected MethodDecl methodDecl;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TopLevelDeclImpl()
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
    return MyDslPackage.Literals.TOP_LEVEL_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declaration getDeclaration()
  {
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeclaration(Declaration newDeclaration, NotificationChain msgs)
  {
    Declaration oldDeclaration = declaration;
    declaration = newDeclaration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.TOP_LEVEL_DECL__DECLARATION, oldDeclaration, newDeclaration);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeclaration(Declaration newDeclaration)
  {
    if (newDeclaration != declaration)
    {
      NotificationChain msgs = null;
      if (declaration != null)
        msgs = ((InternalEObject)declaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TOP_LEVEL_DECL__DECLARATION, null, msgs);
      if (newDeclaration != null)
        msgs = ((InternalEObject)newDeclaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TOP_LEVEL_DECL__DECLARATION, null, msgs);
      msgs = basicSetDeclaration(newDeclaration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TOP_LEVEL_DECL__DECLARATION, newDeclaration, newDeclaration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionDecl getFunctionDecl()
  {
    return functionDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFunctionDecl(FunctionDecl newFunctionDecl, NotificationChain msgs)
  {
    FunctionDecl oldFunctionDecl = functionDecl;
    functionDecl = newFunctionDecl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.TOP_LEVEL_DECL__FUNCTION_DECL, oldFunctionDecl, newFunctionDecl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunctionDecl(FunctionDecl newFunctionDecl)
  {
    if (newFunctionDecl != functionDecl)
    {
      NotificationChain msgs = null;
      if (functionDecl != null)
        msgs = ((InternalEObject)functionDecl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TOP_LEVEL_DECL__FUNCTION_DECL, null, msgs);
      if (newFunctionDecl != null)
        msgs = ((InternalEObject)newFunctionDecl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TOP_LEVEL_DECL__FUNCTION_DECL, null, msgs);
      msgs = basicSetFunctionDecl(newFunctionDecl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TOP_LEVEL_DECL__FUNCTION_DECL, newFunctionDecl, newFunctionDecl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodDecl getMethodDecl()
  {
    return methodDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMethodDecl(MethodDecl newMethodDecl, NotificationChain msgs)
  {
    MethodDecl oldMethodDecl = methodDecl;
    methodDecl = newMethodDecl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.TOP_LEVEL_DECL__METHOD_DECL, oldMethodDecl, newMethodDecl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethodDecl(MethodDecl newMethodDecl)
  {
    if (newMethodDecl != methodDecl)
    {
      NotificationChain msgs = null;
      if (methodDecl != null)
        msgs = ((InternalEObject)methodDecl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TOP_LEVEL_DECL__METHOD_DECL, null, msgs);
      if (newMethodDecl != null)
        msgs = ((InternalEObject)newMethodDecl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TOP_LEVEL_DECL__METHOD_DECL, null, msgs);
      msgs = basicSetMethodDecl(newMethodDecl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TOP_LEVEL_DECL__METHOD_DECL, newMethodDecl, newMethodDecl));
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
      case MyDslPackage.TOP_LEVEL_DECL__DECLARATION:
        return basicSetDeclaration(null, msgs);
      case MyDslPackage.TOP_LEVEL_DECL__FUNCTION_DECL:
        return basicSetFunctionDecl(null, msgs);
      case MyDslPackage.TOP_LEVEL_DECL__METHOD_DECL:
        return basicSetMethodDecl(null, msgs);
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
      case MyDslPackage.TOP_LEVEL_DECL__DECLARATION:
        return getDeclaration();
      case MyDslPackage.TOP_LEVEL_DECL__FUNCTION_DECL:
        return getFunctionDecl();
      case MyDslPackage.TOP_LEVEL_DECL__METHOD_DECL:
        return getMethodDecl();
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
      case MyDslPackage.TOP_LEVEL_DECL__DECLARATION:
        setDeclaration((Declaration)newValue);
        return;
      case MyDslPackage.TOP_LEVEL_DECL__FUNCTION_DECL:
        setFunctionDecl((FunctionDecl)newValue);
        return;
      case MyDslPackage.TOP_LEVEL_DECL__METHOD_DECL:
        setMethodDecl((MethodDecl)newValue);
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
      case MyDslPackage.TOP_LEVEL_DECL__DECLARATION:
        setDeclaration((Declaration)null);
        return;
      case MyDslPackage.TOP_LEVEL_DECL__FUNCTION_DECL:
        setFunctionDecl((FunctionDecl)null);
        return;
      case MyDslPackage.TOP_LEVEL_DECL__METHOD_DECL:
        setMethodDecl((MethodDecl)null);
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
      case MyDslPackage.TOP_LEVEL_DECL__DECLARATION:
        return declaration != null;
      case MyDslPackage.TOP_LEVEL_DECL__FUNCTION_DECL:
        return functionDecl != null;
      case MyDslPackage.TOP_LEVEL_DECL__METHOD_DECL:
        return methodDecl != null;
    }
    return super.eIsSet(featureID);
  }

} //TopLevelDeclImpl
