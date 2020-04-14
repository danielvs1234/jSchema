/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.jSchema;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>has Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.jSchema.hasProperties#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.jSchema.JSchemaPackage#gethasProperties()
 * @model
 * @generated
 */
public interface hasProperties extends EObject
{
  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference.
   * @see #setProperties(Property)
   * @see org.xtext.example.mydsl.jSchema.JSchemaPackage#gethasProperties_Properties()
   * @model containment="true"
   * @generated
   */
  Property getProperties();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.jSchema.hasProperties#getProperties <em>Properties</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Properties</em>' containment reference.
   * @see #getProperties()
   * @generated
   */
  void setProperties(Property value);

} // hasProperties
