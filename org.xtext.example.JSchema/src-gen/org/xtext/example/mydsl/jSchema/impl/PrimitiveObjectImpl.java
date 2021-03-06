/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.jSchema.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.jSchema.JSchemaPackage;
import org.xtext.example.mydsl.jSchema.PrimitiveObject;
import org.xtext.example.mydsl.jSchema.PrimitiveProperties;
import org.xtext.example.mydsl.jSchema.PrimitiveTypes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.jSchema.impl.PrimitiveObjectImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.jSchema.impl.PrimitiveObjectImpl#getPrimitiveProperties <em>Primitive Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimitiveObjectImpl extends AbstractObjectImpl implements PrimitiveObject
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected PrimitiveTypes type;

  /**
   * The cached value of the '{@link #getPrimitiveProperties() <em>Primitive Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimitiveProperties()
   * @generated
   * @ordered
   */
  protected EList<PrimitiveProperties> primitiveProperties;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrimitiveObjectImpl()
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
    return JSchemaPackage.Literals.PRIMITIVE_OBJECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PrimitiveTypes getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(PrimitiveTypes newType, NotificationChain msgs)
  {
    PrimitiveTypes oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JSchemaPackage.PRIMITIVE_OBJECT__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(PrimitiveTypes newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JSchemaPackage.PRIMITIVE_OBJECT__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JSchemaPackage.PRIMITIVE_OBJECT__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JSchemaPackage.PRIMITIVE_OBJECT__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<PrimitiveProperties> getPrimitiveProperties()
  {
    if (primitiveProperties == null)
    {
      primitiveProperties = new EObjectContainmentEList<PrimitiveProperties>(PrimitiveProperties.class, this, JSchemaPackage.PRIMITIVE_OBJECT__PRIMITIVE_PROPERTIES);
    }
    return primitiveProperties;
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
      case JSchemaPackage.PRIMITIVE_OBJECT__TYPE:
        return basicSetType(null, msgs);
      case JSchemaPackage.PRIMITIVE_OBJECT__PRIMITIVE_PROPERTIES:
        return ((InternalEList<?>)getPrimitiveProperties()).basicRemove(otherEnd, msgs);
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
      case JSchemaPackage.PRIMITIVE_OBJECT__TYPE:
        return getType();
      case JSchemaPackage.PRIMITIVE_OBJECT__PRIMITIVE_PROPERTIES:
        return getPrimitiveProperties();
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
      case JSchemaPackage.PRIMITIVE_OBJECT__TYPE:
        setType((PrimitiveTypes)newValue);
        return;
      case JSchemaPackage.PRIMITIVE_OBJECT__PRIMITIVE_PROPERTIES:
        getPrimitiveProperties().clear();
        getPrimitiveProperties().addAll((Collection<? extends PrimitiveProperties>)newValue);
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
      case JSchemaPackage.PRIMITIVE_OBJECT__TYPE:
        setType((PrimitiveTypes)null);
        return;
      case JSchemaPackage.PRIMITIVE_OBJECT__PRIMITIVE_PROPERTIES:
        getPrimitiveProperties().clear();
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
      case JSchemaPackage.PRIMITIVE_OBJECT__TYPE:
        return type != null;
      case JSchemaPackage.PRIMITIVE_OBJECT__PRIMITIVE_PROPERTIES:
        return primitiveProperties != null && !primitiveProperties.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PrimitiveObjectImpl
