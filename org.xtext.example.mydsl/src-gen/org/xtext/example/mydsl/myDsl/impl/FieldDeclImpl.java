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

import org.xtext.example.mydsl.myDsl.EmbeddedField;
import org.xtext.example.mydsl.myDsl.FieldDecl;
import org.xtext.example.mydsl.myDsl.IdentifierList;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Tag;
import org.xtext.example.mydsl.myDsl.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.FieldDeclImpl#getIdentifierList <em>Identifier List</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.FieldDeclImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.FieldDeclImpl#getEmbeddedField <em>Embedded Field</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.FieldDeclImpl#getTag <em>Tag</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldDeclImpl extends MinimalEObjectImpl.Container implements FieldDecl
{
  /**
   * The cached value of the '{@link #getIdentifierList() <em>Identifier List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifierList()
   * @generated
   * @ordered
   */
  protected IdentifierList identifierList;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Type type;

  /**
   * The cached value of the '{@link #getEmbeddedField() <em>Embedded Field</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmbeddedField()
   * @generated
   * @ordered
   */
  protected EmbeddedField embeddedField;

  /**
   * The cached value of the '{@link #getTag() <em>Tag</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTag()
   * @generated
   * @ordered
   */
  protected Tag tag;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FieldDeclImpl()
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
    return MyDslPackage.Literals.FIELD_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdentifierList getIdentifierList()
  {
    return identifierList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIdentifierList(IdentifierList newIdentifierList, NotificationChain msgs)
  {
    IdentifierList oldIdentifierList = identifierList;
    identifierList = newIdentifierList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FIELD_DECL__IDENTIFIER_LIST, oldIdentifierList, newIdentifierList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdentifierList(IdentifierList newIdentifierList)
  {
    if (newIdentifierList != identifierList)
    {
      NotificationChain msgs = null;
      if (identifierList != null)
        msgs = ((InternalEObject)identifierList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FIELD_DECL__IDENTIFIER_LIST, null, msgs);
      if (newIdentifierList != null)
        msgs = ((InternalEObject)newIdentifierList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FIELD_DECL__IDENTIFIER_LIST, null, msgs);
      msgs = basicSetIdentifierList(newIdentifierList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FIELD_DECL__IDENTIFIER_LIST, newIdentifierList, newIdentifierList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(Type newType, NotificationChain msgs)
  {
    Type oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FIELD_DECL__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Type newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FIELD_DECL__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FIELD_DECL__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FIELD_DECL__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmbeddedField getEmbeddedField()
  {
    return embeddedField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEmbeddedField(EmbeddedField newEmbeddedField, NotificationChain msgs)
  {
    EmbeddedField oldEmbeddedField = embeddedField;
    embeddedField = newEmbeddedField;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FIELD_DECL__EMBEDDED_FIELD, oldEmbeddedField, newEmbeddedField);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEmbeddedField(EmbeddedField newEmbeddedField)
  {
    if (newEmbeddedField != embeddedField)
    {
      NotificationChain msgs = null;
      if (embeddedField != null)
        msgs = ((InternalEObject)embeddedField).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FIELD_DECL__EMBEDDED_FIELD, null, msgs);
      if (newEmbeddedField != null)
        msgs = ((InternalEObject)newEmbeddedField).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FIELD_DECL__EMBEDDED_FIELD, null, msgs);
      msgs = basicSetEmbeddedField(newEmbeddedField, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FIELD_DECL__EMBEDDED_FIELD, newEmbeddedField, newEmbeddedField));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tag getTag()
  {
    return tag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTag(Tag newTag, NotificationChain msgs)
  {
    Tag oldTag = tag;
    tag = newTag;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FIELD_DECL__TAG, oldTag, newTag);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTag(Tag newTag)
  {
    if (newTag != tag)
    {
      NotificationChain msgs = null;
      if (tag != null)
        msgs = ((InternalEObject)tag).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FIELD_DECL__TAG, null, msgs);
      if (newTag != null)
        msgs = ((InternalEObject)newTag).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FIELD_DECL__TAG, null, msgs);
      msgs = basicSetTag(newTag, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FIELD_DECL__TAG, newTag, newTag));
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
      case MyDslPackage.FIELD_DECL__IDENTIFIER_LIST:
        return basicSetIdentifierList(null, msgs);
      case MyDslPackage.FIELD_DECL__TYPE:
        return basicSetType(null, msgs);
      case MyDslPackage.FIELD_DECL__EMBEDDED_FIELD:
        return basicSetEmbeddedField(null, msgs);
      case MyDslPackage.FIELD_DECL__TAG:
        return basicSetTag(null, msgs);
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
      case MyDslPackage.FIELD_DECL__IDENTIFIER_LIST:
        return getIdentifierList();
      case MyDslPackage.FIELD_DECL__TYPE:
        return getType();
      case MyDslPackage.FIELD_DECL__EMBEDDED_FIELD:
        return getEmbeddedField();
      case MyDslPackage.FIELD_DECL__TAG:
        return getTag();
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
      case MyDslPackage.FIELD_DECL__IDENTIFIER_LIST:
        setIdentifierList((IdentifierList)newValue);
        return;
      case MyDslPackage.FIELD_DECL__TYPE:
        setType((Type)newValue);
        return;
      case MyDslPackage.FIELD_DECL__EMBEDDED_FIELD:
        setEmbeddedField((EmbeddedField)newValue);
        return;
      case MyDslPackage.FIELD_DECL__TAG:
        setTag((Tag)newValue);
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
      case MyDslPackage.FIELD_DECL__IDENTIFIER_LIST:
        setIdentifierList((IdentifierList)null);
        return;
      case MyDslPackage.FIELD_DECL__TYPE:
        setType((Type)null);
        return;
      case MyDslPackage.FIELD_DECL__EMBEDDED_FIELD:
        setEmbeddedField((EmbeddedField)null);
        return;
      case MyDslPackage.FIELD_DECL__TAG:
        setTag((Tag)null);
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
      case MyDslPackage.FIELD_DECL__IDENTIFIER_LIST:
        return identifierList != null;
      case MyDslPackage.FIELD_DECL__TYPE:
        return type != null;
      case MyDslPackage.FIELD_DECL__EMBEDDED_FIELD:
        return embeddedField != null;
      case MyDslPackage.FIELD_DECL__TAG:
        return tag != null;
    }
    return super.eIsSet(featureID);
  }

} //FieldDeclImpl