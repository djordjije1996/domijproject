/**
 */
package domijProject.impl;

import domijProject.DomijProjectFactory;
import domijProject.DomijProjectPackage;
import domijProject.EGateType;
import domijProject.EInspectionType;
import domijProject.ENotation;
import domijProject.ERelationshipType;
import domijProject.EStepType;
import domijProject.Gate;
import domijProject.GlobalErrorHandler;
import domijProject.Inspection;
import domijProject.Manufacture;
import domijProject.Model;
import domijProject.NamedConcept;
import domijProject.ProcessElement;
import domijProject.ProcessStep;
import domijProject.Product;
import domijProject.Relationship;

import domijProject.util.DomijProjectValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomijProjectPackageImpl extends EPackageImpl implements DomijProjectPackage {
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
	private EClass processEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedConceptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manufactureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalErrorHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inspectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eGateTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eRelationshipTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eStepTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eInspectionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eNotationEEnum = null;

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
	 * @see domijProject.DomijProjectPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DomijProjectPackageImpl() {
		super(eNS_URI, DomijProjectFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DomijProjectPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DomijProjectPackage init() {
		if (isInited) return (DomijProjectPackage)EPackage.Registry.INSTANCE.getEPackage(DomijProjectPackage.eNS_URI);

		// Obtain or create and register package
		DomijProjectPackageImpl theDomijProjectPackage = (DomijProjectPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DomijProjectPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DomijProjectPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDomijProjectPackage.createPackageContents();

		// Initialize created meta-data
		theDomijProjectPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theDomijProjectPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return DomijProjectValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theDomijProjectPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DomijProjectPackage.eNS_URI, theDomijProjectPackage);
		return theDomijProjectPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Processing() {
		return (EReference)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcess() {
		return processEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_Elements() {
		return (EReference)processEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_Relationships() {
		return (EReference)processEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_Inspections() {
		return (EReference)processEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedConcept() {
		return namedConceptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedConcept_Id() {
		return (EAttribute)namedConceptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedConcept_Name() {
		return (EAttribute)namedConceptEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManufacture() {
		return manufactureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManufacture_HandlersOfManufacture() {
		return (EReference)manufactureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalErrorHandler() {
		return globalErrorHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalErrorHandler_Error() {
		return (EReference)globalErrorHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalErrorHandler_Cause() {
		return (EAttribute)globalErrorHandlerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalErrorHandler_Handlers() {
		return (EReference)globalErrorHandlerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessElement() {
		return processElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessElement_InRelations() {
		return (EReference)processElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessElement_OutRelations() {
		return (EReference)processElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationship() {
		return relationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationship_Condition() {
		return (EAttribute)relationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_Target() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_Source() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationship_Type() {
		return (EAttribute)relationshipEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationship_Notation() {
		return (EAttribute)relationshipEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessStep() {
		return processStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessStep_Type() {
		return (EAttribute)processStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessStep_InProducts() {
		return (EReference)processStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessStep_OutProducts() {
		return (EReference)processStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessStep_Monitoring() {
		return (EReference)processStepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessStep_Errors() {
		return (EReference)processStepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessStep_Description() {
		return (EAttribute)processStepEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessStep_Capability() {
		return (EAttribute)processStepEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessStep_Notation() {
		return (EAttribute)processStepEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGate() {
		return gateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGate_Type() {
		return (EAttribute)gateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGate_Notation() {
		return (EAttribute)gateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProduct() {
		return productEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInspection() {
		return inspectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInspection_Type() {
		return (EAttribute)inspectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInspection_AcceptanceCriteria() {
		return (EAttribute)inspectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInspection_CompletionCriteria() {
		return (EAttribute)inspectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getError() {
		return errorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getError_Cause() {
		return (EAttribute)errorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getError_Effect() {
		return (EAttribute)errorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getError_ErrorLink() {
		return (EReference)errorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getError_Globalerrorhandler() {
		return (EReference)errorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getError_SeverityOfError() {
		return (EAttribute)errorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEGateType() {
		return eGateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getERelationshipType() {
		return eRelationshipTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEStepType() {
		return eStepTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEInspectionType() {
		return eInspectionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getENotation() {
		return eNotationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomijProjectFactory getDomijProjectFactory() {
		return (DomijProjectFactory)getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__PROCESSING);

		processEClass = createEClass(PROCESS);
		createEReference(processEClass, PROCESS__ELEMENTS);
		createEReference(processEClass, PROCESS__RELATIONSHIPS);
		createEReference(processEClass, PROCESS__INSPECTIONS);

		namedConceptEClass = createEClass(NAMED_CONCEPT);
		createEAttribute(namedConceptEClass, NAMED_CONCEPT__ID);
		createEAttribute(namedConceptEClass, NAMED_CONCEPT__NAME);

		manufactureEClass = createEClass(MANUFACTURE);
		createEReference(manufactureEClass, MANUFACTURE__HANDLERS_OF_MANUFACTURE);

		globalErrorHandlerEClass = createEClass(GLOBAL_ERROR_HANDLER);
		createEReference(globalErrorHandlerEClass, GLOBAL_ERROR_HANDLER__ERROR);
		createEAttribute(globalErrorHandlerEClass, GLOBAL_ERROR_HANDLER__CAUSE);
		createEReference(globalErrorHandlerEClass, GLOBAL_ERROR_HANDLER__HANDLERS);

		processElementEClass = createEClass(PROCESS_ELEMENT);
		createEReference(processElementEClass, PROCESS_ELEMENT__IN_RELATIONS);
		createEReference(processElementEClass, PROCESS_ELEMENT__OUT_RELATIONS);

		relationshipEClass = createEClass(RELATIONSHIP);
		createEAttribute(relationshipEClass, RELATIONSHIP__CONDITION);
		createEReference(relationshipEClass, RELATIONSHIP__TARGET);
		createEReference(relationshipEClass, RELATIONSHIP__SOURCE);
		createEAttribute(relationshipEClass, RELATIONSHIP__TYPE);
		createEAttribute(relationshipEClass, RELATIONSHIP__NOTATION);

		processStepEClass = createEClass(PROCESS_STEP);
		createEAttribute(processStepEClass, PROCESS_STEP__TYPE);
		createEReference(processStepEClass, PROCESS_STEP__IN_PRODUCTS);
		createEReference(processStepEClass, PROCESS_STEP__OUT_PRODUCTS);
		createEReference(processStepEClass, PROCESS_STEP__MONITORING);
		createEReference(processStepEClass, PROCESS_STEP__ERRORS);
		createEAttribute(processStepEClass, PROCESS_STEP__DESCRIPTION);
		createEAttribute(processStepEClass, PROCESS_STEP__CAPABILITY);
		createEAttribute(processStepEClass, PROCESS_STEP__NOTATION);

		gateEClass = createEClass(GATE);
		createEAttribute(gateEClass, GATE__TYPE);
		createEAttribute(gateEClass, GATE__NOTATION);

		productEClass = createEClass(PRODUCT);

		inspectionEClass = createEClass(INSPECTION);
		createEAttribute(inspectionEClass, INSPECTION__TYPE);
		createEAttribute(inspectionEClass, INSPECTION__ACCEPTANCE_CRITERIA);
		createEAttribute(inspectionEClass, INSPECTION__COMPLETION_CRITERIA);

		errorEClass = createEClass(ERROR);
		createEAttribute(errorEClass, ERROR__CAUSE);
		createEAttribute(errorEClass, ERROR__EFFECT);
		createEReference(errorEClass, ERROR__ERROR_LINK);
		createEReference(errorEClass, ERROR__GLOBALERRORHANDLER);
		createEAttribute(errorEClass, ERROR__SEVERITY_OF_ERROR);

		// Create enums
		eGateTypeEEnum = createEEnum(EGATE_TYPE);
		eRelationshipTypeEEnum = createEEnum(ERELATIONSHIP_TYPE);
		eStepTypeEEnum = createEEnum(ESTEP_TYPE);
		eInspectionTypeEEnum = createEEnum(EINSPECTION_TYPE);
		eNotationEEnum = createEEnum(ENOTATION);
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
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		modelEClass.getESuperTypes().add(this.getNamedConcept());
		processEClass.getESuperTypes().add(this.getNamedConcept());
		manufactureEClass.getESuperTypes().add(this.getProcess());
		globalErrorHandlerEClass.getESuperTypes().add(this.getProcess());
		processElementEClass.getESuperTypes().add(this.getNamedConcept());
		relationshipEClass.getESuperTypes().add(this.getNamedConcept());
		processStepEClass.getESuperTypes().add(this.getProcessElement());
		gateEClass.getESuperTypes().add(this.getProcessElement());
		productEClass.getESuperTypes().add(this.getNamedConcept());
		inspectionEClass.getESuperTypes().add(this.getNamedConcept());
		errorEClass.getESuperTypes().add(this.getNamedConcept());

		// Initialize classes, features, and operations; add parameters
		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_Processing(), this.getManufacture(), null, "processing", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processEClass, domijProject.Process.class, "Process", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcess_Elements(), this.getProcessElement(), null, "elements", null, 1, -1, domijProject.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_Relationships(), this.getRelationship(), null, "relationships", null, 1, -1, domijProject.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_Inspections(), this.getInspection(), null, "inspections", null, 0, -1, domijProject.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedConceptEClass, NamedConcept.class, "NamedConcept", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedConcept_Id(), ecorePackage.getEString(), "id", null, 0, 1, NamedConcept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamedConcept_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedConcept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(manufactureEClass, Manufacture.class, "Manufacture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getManufacture_HandlersOfManufacture(), this.getGlobalErrorHandler(), null, "handlersOfManufacture", null, 0, -1, Manufacture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(globalErrorHandlerEClass, GlobalErrorHandler.class, "GlobalErrorHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlobalErrorHandler_Error(), this.getError(), this.getError_Globalerrorhandler(), "error", null, 1, 1, GlobalErrorHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalErrorHandler_Cause(), ecorePackage.getEString(), "cause", null, 0, 1, GlobalErrorHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalErrorHandler_Handlers(), this.getGlobalErrorHandler(), null, "handlers", null, 0, -1, GlobalErrorHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processElementEClass, ProcessElement.class, "ProcessElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessElement_InRelations(), this.getRelationship(), this.getRelationship_Target(), "inRelations", null, 0, -1, ProcessElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessElement_OutRelations(), this.getRelationship(), this.getRelationship_Source(), "outRelations", null, 0, -1, ProcessElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipEClass, Relationship.class, "Relationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationship_Condition(), ecorePackage.getEString(), "condition", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationship_Target(), this.getProcessElement(), this.getProcessElement_InRelations(), "target", null, 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationship_Source(), this.getProcessElement(), this.getProcessElement_OutRelations(), "source", null, 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationship_Type(), this.getERelationshipType(), "type", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationship_Notation(), this.getENotation(), "notation", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processStepEClass, ProcessStep.class, "ProcessStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessStep_Type(), this.getEStepType(), "type", null, 0, 1, ProcessStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessStep_InProducts(), this.getProduct(), null, "inProducts", null, 0, -1, ProcessStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessStep_OutProducts(), this.getProduct(), null, "outProducts", null, 0, -1, ProcessStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessStep_Monitoring(), this.getInspection(), null, "monitoring", null, 0, -1, ProcessStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessStep_Errors(), this.getError(), null, "errors", null, 0, -1, ProcessStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessStep_Description(), ecorePackage.getEString(), "description", null, 0, 1, ProcessStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessStep_Capability(), ecorePackage.getEString(), "capability", null, 0, 1, ProcessStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessStep_Notation(), this.getENotation(), "notation", null, 0, 1, ProcessStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gateEClass, Gate.class, "Gate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGate_Type(), this.getEGateType(), "type", null, 0, 1, Gate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGate_Notation(), this.getENotation(), "notation", null, 0, 1, Gate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productEClass, Product.class, "Product", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inspectionEClass, Inspection.class, "Inspection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInspection_Type(), this.getEInspectionType(), "type", "PRESTEP", 0, 1, Inspection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInspection_AcceptanceCriteria(), ecorePackage.getEString(), "acceptanceCriteria", null, 0, 1, Inspection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInspection_CompletionCriteria(), ecorePackage.getEString(), "completionCriteria", null, 0, 1, Inspection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(errorEClass, domijProject.Error.class, "Error", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getError_Cause(), ecorePackage.getEString(), "cause", null, 0, 1, domijProject.Error.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getError_Effect(), ecorePackage.getEString(), "effect", null, 0, 1, domijProject.Error.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getError_ErrorLink(), this.getProcessStep(), null, "errorLink", null, 0, 1, domijProject.Error.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getError_Globalerrorhandler(), this.getGlobalErrorHandler(), this.getGlobalErrorHandler_Error(), "globalerrorhandler", null, 0, 1, domijProject.Error.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getError_SeverityOfError(), ecorePackage.getEInt(), "severityOfError", null, 0, 1, domijProject.Error.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(eGateTypeEEnum, EGateType.class, "EGateType");
		addEEnumLiteral(eGateTypeEEnum, EGateType.DECISION);
		addEEnumLiteral(eGateTypeEEnum, EGateType.PARALLELISM);

		initEEnum(eRelationshipTypeEEnum, ERelationshipType.class, "ERelationshipType");
		addEEnumLiteral(eRelationshipTypeEEnum, ERelationshipType.FLOW);
		addEEnumLiteral(eRelationshipTypeEEnum, ERelationshipType.COLLABORATION);

		initEEnum(eStepTypeEEnum, EStepType.class, "EStepType");
		addEEnumLiteral(eStepTypeEEnum, EStepType.REGULAR);
		addEEnumLiteral(eStepTypeEEnum, EStepType.END);
		addEEnumLiteral(eStepTypeEEnum, EStepType.START);

		initEEnum(eInspectionTypeEEnum, EInspectionType.class, "EInspectionType");
		addEEnumLiteral(eInspectionTypeEEnum, EInspectionType.PRESTEP);
		addEEnumLiteral(eInspectionTypeEEnum, EInspectionType.POSTSTEP);

		initEEnum(eNotationEEnum, ENotation.class, "ENotation");
		addEEnumLiteral(eNotationEEnum, ENotation.NONE);
		addEEnumLiteral(eNotationEEnum, ENotation.CORRECTION);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore#/"
		   });													
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";			
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });		
		addAnnotation
		  (modelEClass, 
		   source, 
		   new String[] {
			 "constraints", "mustHaveOneManufactureProcess"
		   });			
		addAnnotation
		  (processEClass, 
		   source, 
		   new String[] {
			 "constraints", "uniqunessOfStartStep mustHaveAtLeastOneStartStep mustHaveAtLeastOneEndStep relationsConnectingStepsFromSameProcess"
		   });			
		addAnnotation
		  (globalErrorHandlerEClass, 
		   source, 
		   new String[] {
			 "constraints", "handlerCantBeReferencedByContainingError"
		   });			
		addAnnotation
		  (processStepEClass, 
		   source, 
		   new String[] {
			 "constraints", "endStepHasNoOutRelations startStepHasNoInRelations everyNoStartStepHasInFlowRelation everyNoEndStepHasOneOutFlowRelation stepCantBeReferencedByContainingError startHasNoInspection"
		   });			
		addAnnotation
		  (gateEClass, 
		   source, 
		   new String[] {
			 "constraints", "gateHasAtLeastOneInRelation gateHasAtLeastOneOutRelation decisionGateHasAtLeastTwoOutRelation onlyOneOutRelationWithNoCondition allRelationsAreFlow"
		   });			
		addAnnotation
		  (errorEClass, 
		   source, 
		   new String[] {
			 "constraints", "errorExclusivelyReferencesHandlerOrStep severityOneToTen"
		   });	
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";					
		addAnnotation
		  (modelEClass, 
		   source, 
		   new String[] {
			 "mustHaveOneManufactureProcess", "\n\t\t\tself.processing->selectByType(Manufacture)->size() = 1"
		   });			
		addAnnotation
		  (processEClass, 
		   source, 
		   new String[] {
			 "uniqunessOfStartStep", "\n\t\t\tself.elements->selectByType(ProcessStep)->forAll(ps1, ps2| \n\t\t\t\tps1.type = EStepType::START and ps2.type = EStepType::START implies ps1=ps2)",
			 "mustHaveAtLeastOneStartStep", "\n\t\t\tself.elements->selectByType(ProcessStep)->exists(ps| ps.type = EStepType::START)",
			 "mustHaveAtLeastOneEndStep", "\n\t\t\tself.elements->selectByType(ProcessStep)->exists(ps| ps.type = EStepType::END)",
			 "relationsConnectingStepsFromSameProcess", "\n\t\t\tself.relationships->forAll(r:Relationship| \n\t\t\t\tself.elements->exists(e:ProcessElement| r.target = e)\n\t\t\t\tand\n\t\t\t\tself.elements->exists(e:ProcessElement| r.source = e))"
		   });			
		addAnnotation
		  (globalErrorHandlerEClass, 
		   source, 
		   new String[] {
			 "handlerCantBeReferencedByContainingError", "\n\t\t\tself.elements->selectByType(ProcessStep).errors->forAll(e:Error| e.globalerrorhandler <> self)"
		   });			
		addAnnotation
		  (processStepEClass, 
		   source, 
		   new String[] {
			 "endStepHasNoOutRelations", "\n\t\t\tself.type = EStepType::END implies self.outRelations->size() = 0",
			 "startStepHasNoInRelations", "\n\t\t\tself.type = EStepType::START implies self.inRelations->size() = 0",
			 "everyNoStartStepHasInFlowRelation", "\n\t\t\tself.type <> EStepType::START implies\n\t\t\t((self.oclAsType(ProcessElement).inRelations->select(r:Relationship| r.type = ERelationshipType::FLOW)->size() > 0)\n\t\t\tor\n\t\t\t(Error.allInstances().errorLink->exists(self)))",
			 "everyNoEndStepHasOneOutFlowRelation", "\n\t\t\tself.type <> EStepType::END implies\n\t\t\tself.oclAsType(ProcessElement).outRelations->select(r:Relationship| r.type = ERelationshipType::FLOW)->size() = 1",
			 "stepCantBeReferencedByContainingError", "\n\t\t\tself.errors->select(e:Error| e.errorLink = self)->size() = 0",
			 "startHasNoInspection", "\n\t\t\tself.type = EStepType::START implies self.monitoring->isEmpty()"
		   });			
		addAnnotation
		  (gateEClass, 
		   source, 
		   new String[] {
			 "gateHasAtLeastOneInRelation", "\n\t\t\tself.oclAsType(ProcessElement).inRelations->size() > 0",
			 "gateHasAtLeastOneOutRelation", "\n\t\t\tself.oclAsType(ProcessElement).outRelations->size() > 0",
			 "decisionGateHasAtLeastTwoOutRelation", "\n\t\t\tself.type = EGateType::DECISION implies\n\t\t\tself.oclAsType(ProcessElement).outRelations->size() > 1",
			 "onlyOneOutRelationWithNoCondition", "\n\t\t\tself.oclAsType(ProcessElement).outRelations->select(r:Relationship| r.condition->isEmpty())->size()< 2",
			 "allRelationsAreFlow", "\n\t\t\t(self.oclAsType(ProcessElement).inRelations->select(r:Relationship| r.type = ERelationshipType::COLLABORATION)->size() = 0)\n\t\t\tand\n\t\t\t(self.oclAsType(ProcessElement).outRelations->select(r:Relationship| r.type = ERelationshipType::COLLABORATION)->size() = 0)"
		   });			
		addAnnotation
		  (errorEClass, 
		   source, 
		   new String[] {
			 "errorExclusivelyReferencesHandlerOrStep", "\n\t\t\tself.errorLink->isEmpty() xor self.globalerrorhandler->isEmpty()",
			 "severityOneToTen", "\n\t\t\tself.severityOfError > 0 and self.severityOfError < 11"
		   });
	}

} //DomijProjectPackageImpl
