/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.jSchema.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.example.mydsl.jSchema.AbstractObject;
import org.xtext.example.mydsl.jSchema.Array;
import org.xtext.example.mydsl.jSchema.Extends;
import org.xtext.example.mydsl.jSchema.FormatTypes;
import org.xtext.example.mydsl.jSchema.Includes;
import org.xtext.example.mydsl.jSchema.IsRoot;
import org.xtext.example.mydsl.jSchema.JSchemaFactory;
import org.xtext.example.mydsl.jSchema.JSchemaPackage;
import org.xtext.example.mydsl.jSchema.MainObject;
import org.xtext.example.mydsl.jSchema.Model;
import org.xtext.example.mydsl.jSchema.PrimitiveObject;
import org.xtext.example.mydsl.jSchema.PrimitiveProperties;
import org.xtext.example.mydsl.jSchema.PrimitiveTypes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JSchemaPackageImpl extends EPackageImpl implements JSchemaPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mainObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass extendsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primitiveObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primitiveTypesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass isRootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primitivePropertiesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass includesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arrayEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum formatTypesEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.example.mydsl.jSchema.JSchemaPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private JSchemaPackageImpl()
  {
    super(eNS_URI, JSchemaFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link JSchemaPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static JSchemaPackage init()
  {
    if (isInited) return (JSchemaPackage)EPackage.Registry.INSTANCE.getEPackage(JSchemaPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredJSchemaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    JSchemaPackageImpl theJSchemaPackage = registeredJSchemaPackage instanceof JSchemaPackageImpl ? (JSchemaPackageImpl)registeredJSchemaPackage : new JSchemaPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theJSchemaPackage.createPackageContents();

    // Initialize created meta-data
    theJSchemaPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theJSchemaPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(JSchemaPackage.eNS_URI, theJSchemaPackage);
    return theJSchemaPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getModel_AbstractObject()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getNumber()
  {
    return numberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getNumber_Number()
  {
    return (EAttribute)numberEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getNumber_Decimal()
  {
    return (EAttribute)numberEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAbstractObject()
  {
    return abstractObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAbstractObject_MainObject()
  {
    return (EReference)abstractObjectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAbstractObject_PrimitiveObject()
  {
    return (EReference)abstractObjectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMainObject()
  {
    return mainObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMainObject_Name()
  {
    return (EAttribute)mainObjectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMainObject_Root()
  {
    return (EReference)mainObjectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMainObject_Inherits()
  {
    return (EReference)mainObjectEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMainObject_Properties()
  {
    return (EReference)mainObjectEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getExtends()
  {
    return extendsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExtends_ExtensionMainObject()
  {
    return (EReference)extendsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExtends_ExtensionPrimitiveObject()
  {
    return (EReference)extendsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPrimitiveObject()
  {
    return primitiveObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPrimitiveObject_Type()
  {
    return (EReference)primitiveObjectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPrimitiveObject_PrimitiveProperties()
  {
    return (EReference)primitiveObjectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPrimitiveTypes()
  {
    return primitiveTypesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPrimitiveTypes_Name()
  {
    return (EAttribute)primitiveTypesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPrimitiveTypes_Array()
  {
    return (EReference)primitiveTypesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPrimitiveTypes_Number()
  {
    return (EReference)primitiveTypesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getIsRoot()
  {
    return isRootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getIsRoot_String()
  {
    return (EAttribute)isRootEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPrimitiveProperties()
  {
    return primitivePropertiesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPrimitiveProperties_StringLength()
  {
    return (EAttribute)primitivePropertiesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPrimitiveProperties_PatternString()
  {
    return (EAttribute)primitivePropertiesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPrimitiveProperties_StringFormat()
  {
    return (EAttribute)primitivePropertiesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getIncludes()
  {
    return includesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getIncludes_IncludesMainObject()
  {
    return (EReference)includesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getIncludes_IncludesPrimitiveObject()
  {
    return (EReference)includesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getArray()
  {
    return arrayEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getArray_Name()
  {
    return (EAttribute)arrayEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getArray_Properties()
  {
    return (EReference)arrayEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getArray_ArrayType()
  {
    return (EAttribute)arrayEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getFormatTypes()
  {
    return formatTypesEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public JSchemaFactory getJSchemaFactory()
  {
    return (JSchemaFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__ABSTRACT_OBJECT);

    numberEClass = createEClass(NUMBER);
    createEAttribute(numberEClass, NUMBER__NUMBER);
    createEAttribute(numberEClass, NUMBER__DECIMAL);

    abstractObjectEClass = createEClass(ABSTRACT_OBJECT);
    createEReference(abstractObjectEClass, ABSTRACT_OBJECT__MAIN_OBJECT);
    createEReference(abstractObjectEClass, ABSTRACT_OBJECT__PRIMITIVE_OBJECT);

    mainObjectEClass = createEClass(MAIN_OBJECT);
    createEAttribute(mainObjectEClass, MAIN_OBJECT__NAME);
    createEReference(mainObjectEClass, MAIN_OBJECT__ROOT);
    createEReference(mainObjectEClass, MAIN_OBJECT__INHERITS);
    createEReference(mainObjectEClass, MAIN_OBJECT__PROPERTIES);

    extendsEClass = createEClass(EXTENDS);
    createEReference(extendsEClass, EXTENDS__EXTENSION_MAIN_OBJECT);
    createEReference(extendsEClass, EXTENDS__EXTENSION_PRIMITIVE_OBJECT);

    primitiveObjectEClass = createEClass(PRIMITIVE_OBJECT);
    createEReference(primitiveObjectEClass, PRIMITIVE_OBJECT__TYPE);
    createEReference(primitiveObjectEClass, PRIMITIVE_OBJECT__PRIMITIVE_PROPERTIES);

    primitiveTypesEClass = createEClass(PRIMITIVE_TYPES);
    createEAttribute(primitiveTypesEClass, PRIMITIVE_TYPES__NAME);
    createEReference(primitiveTypesEClass, PRIMITIVE_TYPES__ARRAY);
    createEReference(primitiveTypesEClass, PRIMITIVE_TYPES__NUMBER);

    isRootEClass = createEClass(IS_ROOT);
    createEAttribute(isRootEClass, IS_ROOT__STRING);

    primitivePropertiesEClass = createEClass(PRIMITIVE_PROPERTIES);
    createEAttribute(primitivePropertiesEClass, PRIMITIVE_PROPERTIES__STRING_LENGTH);
    createEAttribute(primitivePropertiesEClass, PRIMITIVE_PROPERTIES__PATTERN_STRING);
    createEAttribute(primitivePropertiesEClass, PRIMITIVE_PROPERTIES__STRING_FORMAT);

    includesEClass = createEClass(INCLUDES);
    createEReference(includesEClass, INCLUDES__INCLUDES_MAIN_OBJECT);
    createEReference(includesEClass, INCLUDES__INCLUDES_PRIMITIVE_OBJECT);

    arrayEClass = createEClass(ARRAY);
    createEAttribute(arrayEClass, ARRAY__NAME);
    createEReference(arrayEClass, ARRAY__PROPERTIES);
    createEAttribute(arrayEClass, ARRAY__ARRAY_TYPE);

    // Create enums
    formatTypesEEnum = createEEnum(FORMAT_TYPES);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_AbstractObject(), this.getAbstractObject(), null, "AbstractObject", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberEClass, org.xtext.example.mydsl.jSchema.Number.class, "Number", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNumber_Number(), ecorePackage.getEInt(), "number", null, 0, 1, org.xtext.example.mydsl.jSchema.Number.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNumber_Decimal(), ecorePackage.getEInt(), "decimal", null, 0, 1, org.xtext.example.mydsl.jSchema.Number.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractObjectEClass, AbstractObject.class, "AbstractObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAbstractObject_MainObject(), this.getMainObject(), null, "mainObject", null, 0, 1, AbstractObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbstractObject_PrimitiveObject(), this.getPrimitiveObject(), null, "primitiveObject", null, 0, 1, AbstractObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mainObjectEClass, MainObject.class, "MainObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMainObject_Name(), ecorePackage.getEString(), "name", null, 0, 1, MainObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMainObject_Root(), this.getIsRoot(), null, "root", null, 0, 1, MainObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMainObject_Inherits(), ecorePackage.getEObject(), null, "inherits", null, 0, 1, MainObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMainObject_Properties(), this.getAbstractObject(), null, "properties", null, 0, -1, MainObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(extendsEClass, Extends.class, "Extends", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExtends_ExtensionMainObject(), this.getMainObject(), null, "extensionMainObject", null, 0, -1, Extends.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExtends_ExtensionPrimitiveObject(), this.getPrimitiveObject(), null, "extensionPrimitiveObject", null, 0, -1, Extends.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(primitiveObjectEClass, PrimitiveObject.class, "PrimitiveObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPrimitiveObject_Type(), this.getPrimitiveTypes(), null, "type", null, 0, 1, PrimitiveObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrimitiveObject_PrimitiveProperties(), this.getPrimitiveProperties(), null, "primitiveProperties", null, 0, -1, PrimitiveObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(primitiveTypesEClass, PrimitiveTypes.class, "PrimitiveTypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPrimitiveTypes_Name(), ecorePackage.getEString(), "name", null, 0, 1, PrimitiveTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrimitiveTypes_Array(), this.getArray(), null, "array", null, 0, 1, PrimitiveTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrimitiveTypes_Number(), this.getNumber(), null, "number", null, 0, 1, PrimitiveTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(isRootEClass, IsRoot.class, "IsRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIsRoot_String(), ecorePackage.getEString(), "string", null, 0, 1, IsRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(primitivePropertiesEClass, PrimitiveProperties.class, "PrimitiveProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPrimitiveProperties_StringLength(), ecorePackage.getEString(), "stringLength", null, 0, 1, PrimitiveProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPrimitiveProperties_PatternString(), ecorePackage.getEString(), "patternString", null, 0, 1, PrimitiveProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPrimitiveProperties_StringFormat(), this.getFormatTypes(), "stringFormat", null, 0, 1, PrimitiveProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(includesEClass, Includes.class, "Includes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIncludes_IncludesMainObject(), this.getMainObject(), null, "includesMainObject", null, 0, -1, Includes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIncludes_IncludesPrimitiveObject(), this.getPrimitiveObject(), null, "includesPrimitiveObject", null, 0, -1, Includes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(arrayEClass, Array.class, "Array", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getArray_Name(), ecorePackage.getEString(), "name", null, 0, 1, Array.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArray_Properties(), this.getAbstractObject(), null, "properties", null, 0, -1, Array.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArray_ArrayType(), ecorePackage.getEString(), "arrayType", null, 0, 1, Array.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(formatTypesEEnum, FormatTypes.class, "FormatTypes");
    addEEnumLiteral(formatTypesEEnum, FormatTypes.DEFAULT);
    addEEnumLiteral(formatTypesEEnum, FormatTypes.DATE_TIME);
    addEEnumLiteral(formatTypesEEnum, FormatTypes.TIME);
    addEEnumLiteral(formatTypesEEnum, FormatTypes.DATE);
    addEEnumLiteral(formatTypesEEnum, FormatTypes.EMAIL);
    addEEnumLiteral(formatTypesEEnum, FormatTypes.IDN_EMAIL);
    addEEnumLiteral(formatTypesEEnum, FormatTypes.HOSTNAME);
    addEEnumLiteral(formatTypesEEnum, FormatTypes.IPV4);
    addEEnumLiteral(formatTypesEEnum, FormatTypes.IPV6);
    addEEnumLiteral(formatTypesEEnum, FormatTypes.URI);
    addEEnumLiteral(formatTypesEEnum, FormatTypes.URI_REFERENCE);
    addEEnumLiteral(formatTypesEEnum, FormatTypes.IRI);
    addEEnumLiteral(formatTypesEEnum, FormatTypes.IRI_REFERENCE);
    addEEnumLiteral(formatTypesEEnum, FormatTypes.URI_TEMPLATE);
    addEEnumLiteral(formatTypesEEnum, FormatTypes.JSON_POINTER);
    addEEnumLiteral(formatTypesEEnum, FormatTypes.RELATIVE_JSON_POINTER);
    addEEnumLiteral(formatTypesEEnum, FormatTypes.REGEX);

    // Create resource
    createResource(eNS_URI);
  }

} //JSchemaPackageImpl
