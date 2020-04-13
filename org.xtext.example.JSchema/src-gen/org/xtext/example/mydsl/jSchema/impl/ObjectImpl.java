/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.jSchema.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.jSchema.Includes;
import org.xtext.example.mydsl.jSchema.JSchemaPackage;
import org.xtext.example.mydsl.jSchema.hasProperties;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.jSchema.impl.ObjectImpl#getIncludeObjects <em>Include Objects</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.jSchema.impl.ObjectImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectImpl extends ModelImpl implements org.xtext.example.mydsl.jSchema.Object
{
  /**
   * The cached value of the '{@link #getIncludeObjects() <em>Include Objects</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludeObjects()
   * @generated
   * @ordered
   */
  protected Includes includeObjects;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected hasProperties properties;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObjectImpl()
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
    return JSchemaPackage.Literals.OBJECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Includes getIncludeObjects()
  {
    return includeObjects;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIncludeObjects(Includes newIncludeObjects, NotificationChain msgs)
  {
    Includes oldIncludeObjects = includeObjects;
    includeObjects = newIncludeObjects;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JSchemaPackage.OBJECT__INCLUDE_OBJECTS, oldIncludeObjects, newIncludeObjects);
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
  public void setIncludeObjects(Includes newIncludeObjects)
  {
    if (newIncludeObjects != includeObjects)
    {
      NotificationChain msgs = null;
      if (includeObjects != null)
        msgs = ((InternalEObject)includeObjects).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JSchemaPackage.OBJECT__INCLUDE_OBJECTS, null, msgs);
      if (newIncludeObjects != null)
        msgs = ((InternalEObject)newIncludeObjects).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JSchemaPackage.OBJECT__INCLUDE_OBJECTS, null, msgs);
      msgs = basicSetIncludeObjects(newIncludeObjects, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JSchemaPackage.OBJECT__INCLUDE_OBJECTS, newIncludeObjects, newIncludeObjects));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public hasProperties getProperties()
  {
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProperties(hasProperties newProperties, NotificationChain msgs)
  {
    hasProperties oldProperties = properties;
    properties = newProperties;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JSchemaPackage.OBJECT__PROPERTIES, oldProperties, newProperties);
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
  public void setProperties(hasProperties newProperties)
  {
    if (newProperties != properties)
    {
      NotificationChain msgs = null;
      if (properties != null)
        msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JSchemaPackage.OBJECT__PROPERTIES, null, msgs);
      if (newProperties != null)
        msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JSchemaPackage.OBJECT__PROPERTIES, null, msgs);
      msgs = basicSetProperties(newProperties, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JSchemaPackage.OBJECT__PROPERTIES, newProperties, newProperties));
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
      case JSchemaPackage.OBJECT__INCLUDE_OBJECTS:
        return basicSetIncludeObjects(null, msgs);
      case JSchemaPackage.OBJECT__PROPERTIES:
        return basicSetProperties(null, msgs);
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
      case JSchemaPackage.OBJECT__INCLUDE_OBJECTS:
        return getIncludeObjects();
      case JSchemaPackage.OBJECT__PROPERTIES:
        return getProperties();
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
      case JSchemaPackage.OBJECT__INCLUDE_OBJECTS:
        setIncludeObjects((Includes)newValue);
        return;
      case JSchemaPackage.OBJECT__PROPERTIES:
        setProperties((hasProperties)newValue);
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
      case JSchemaPackage.OBJECT__INCLUDE_OBJECTS:
        setIncludeObjects((Includes)null);
        return;
      case JSchemaPackage.OBJECT__PROPERTIES:
        setProperties((hasProperties)null);
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
      case JSchemaPackage.OBJECT__INCLUDE_OBJECTS:
        return includeObjects != null;
      case JSchemaPackage.OBJECT__PROPERTIES:
        return properties != null;
    }
    return super.eIsSet(featureID);
  }

} //ObjectImpl