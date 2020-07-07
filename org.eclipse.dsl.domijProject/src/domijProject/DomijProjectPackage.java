/**
 */
package domijProject;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see domijProject.DomijProjectFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore#/'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface DomijProjectPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "domijProject";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/dsl/domijProject";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "domijProject";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DomijProjectPackage eINSTANCE = domijProject.impl.DomijProjectPackageImpl.init();

	/**
	 * The meta object id for the '{@link domijProject.impl.NamedConceptImpl <em>Named Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domijProject.impl.NamedConceptImpl
	 * @see domijProject.impl.DomijProjectPackageImpl#getNamedConcept()
	 * @generated
	 */
	int NAMED_CONCEPT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_CONCEPT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_CONCEPT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Named Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_CONCEPT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Named Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_CONCEPT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link domijProject.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domijProject.impl.ModelImpl
	 * @see domijProject.impl.DomijProjectPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ID = NAMED_CONCEPT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = NAMED_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Processing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PROCESSING = NAMED_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = NAMED_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = NAMED_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domijProject.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domijProject.impl.ProcessImpl
	 * @see domijProject.impl.DomijProjectPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ID = NAMED_CONCEPT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = NAMED_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ELEMENTS = NAMED_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__RELATIONSHIPS = NAMED_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inspections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__INSPECTIONS = NAMED_CONCEPT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = NAMED_CONCEPT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION_COUNT = NAMED_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domijProject.impl.ManufactureImpl <em>Manufacture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domijProject.impl.ManufactureImpl
	 * @see domijProject.impl.DomijProjectPackageImpl#getManufacture()
	 * @generated
	 */
	int MANUFACTURE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURE__ID = PROCESS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURE__NAME = PROCESS__NAME;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURE__ELEMENTS = PROCESS__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURE__RELATIONSHIPS = PROCESS__RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Inspections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURE__INSPECTIONS = PROCESS__INSPECTIONS;

	/**
	 * The feature id for the '<em><b>Handlers Of Manufacture</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURE__HANDLERS_OF_MANUFACTURE = PROCESS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Manufacture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURE_FEATURE_COUNT = PROCESS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Manufacture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURE_OPERATION_COUNT = PROCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domijProject.impl.GlobalErrorHandlerImpl <em>Global Error Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domijProject.impl.GlobalErrorHandlerImpl
	 * @see domijProject.impl.DomijProjectPackageImpl#getGlobalErrorHandler()
	 * @generated
	 */
	int GLOBAL_ERROR_HANDLER = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ERROR_HANDLER__ID = PROCESS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ERROR_HANDLER__NAME = PROCESS__NAME;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ERROR_HANDLER__ELEMENTS = PROCESS__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ERROR_HANDLER__RELATIONSHIPS = PROCESS__RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Inspections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ERROR_HANDLER__INSPECTIONS = PROCESS__INSPECTIONS;

	/**
	 * The feature id for the '<em><b>Error</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ERROR_HANDLER__ERROR = PROCESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ERROR_HANDLER__CAUSE = PROCESS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ERROR_HANDLER__HANDLERS = PROCESS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Global Error Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ERROR_HANDLER_FEATURE_COUNT = PROCESS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Global Error Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ERROR_HANDLER_OPERATION_COUNT = PROCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domijProject.impl.ProcessElementImpl <em>Process Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domijProject.impl.ProcessElementImpl
	 * @see domijProject.impl.DomijProjectPackageImpl#getProcessElement()
	 * @generated
	 */
	int PROCESS_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENT__ID = NAMED_CONCEPT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENT__NAME = NAMED_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>In Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENT__IN_RELATIONS = NAMED_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Out Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENT__OUT_RELATIONS = NAMED_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Process Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENT_FEATURE_COUNT = NAMED_CONCEPT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Process Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENT_OPERATION_COUNT = NAMED_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domijProject.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domijProject.impl.RelationshipImpl
	 * @see domijProject.impl.DomijProjectPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__ID = NAMED_CONCEPT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__NAME = NAMED_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__CONDITION = NAMED_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TARGET = NAMED_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__SOURCE = NAMED_CONCEPT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TYPE = NAMED_CONCEPT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Notation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__NOTATION = NAMED_CONCEPT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = NAMED_CONCEPT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_COUNT = NAMED_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domijProject.impl.ProcessStepImpl <em>Process Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domijProject.impl.ProcessStepImpl
	 * @see domijProject.impl.DomijProjectPackageImpl#getProcessStep()
	 * @generated
	 */
	int PROCESS_STEP = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__ID = PROCESS_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__NAME = PROCESS_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>In Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__IN_RELATIONS = PROCESS_ELEMENT__IN_RELATIONS;

	/**
	 * The feature id for the '<em><b>Out Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__OUT_RELATIONS = PROCESS_ELEMENT__OUT_RELATIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__TYPE = PROCESS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__IN_PRODUCTS = PROCESS_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Out Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__OUT_PRODUCTS = PROCESS_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__MONITORING = PROCESS_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Errors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__ERRORS = PROCESS_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__DESCRIPTION = PROCESS_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__CAPABILITY = PROCESS_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Notation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP__NOTATION = PROCESS_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Process Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP_FEATURE_COUNT = PROCESS_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Process Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_STEP_OPERATION_COUNT = PROCESS_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domijProject.impl.GateImpl <em>Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domijProject.impl.GateImpl
	 * @see domijProject.impl.DomijProjectPackageImpl#getGate()
	 * @generated
	 */
	int GATE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__ID = PROCESS_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__NAME = PROCESS_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>In Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__IN_RELATIONS = PROCESS_ELEMENT__IN_RELATIONS;

	/**
	 * The feature id for the '<em><b>Out Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__OUT_RELATIONS = PROCESS_ELEMENT__OUT_RELATIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__TYPE = PROCESS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Notation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__NOTATION = PROCESS_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_FEATURE_COUNT = PROCESS_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_OPERATION_COUNT = PROCESS_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domijProject.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domijProject.impl.ProductImpl
	 * @see domijProject.impl.DomijProjectPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__ID = NAMED_CONCEPT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = NAMED_CONCEPT__NAME;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = NAMED_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = NAMED_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domijProject.impl.InspectionImpl <em>Inspection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domijProject.impl.InspectionImpl
	 * @see domijProject.impl.DomijProjectPackageImpl#getInspection()
	 * @generated
	 */
	int INSPECTION = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION__ID = NAMED_CONCEPT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION__NAME = NAMED_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION__TYPE = NAMED_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Acceptance Criteria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION__ACCEPTANCE_CRITERIA = NAMED_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Completion Criteria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION__COMPLETION_CRITERIA = NAMED_CONCEPT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Inspection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_FEATURE_COUNT = NAMED_CONCEPT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Inspection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_OPERATION_COUNT = NAMED_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domijProject.impl.ErrorImpl <em>Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domijProject.impl.ErrorImpl
	 * @see domijProject.impl.DomijProjectPackageImpl#getError()
	 * @generated
	 */
	int ERROR = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__ID = NAMED_CONCEPT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__NAME = NAMED_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__CAUSE = NAMED_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__EFFECT = NAMED_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Error Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__ERROR_LINK = NAMED_CONCEPT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Globalerrorhandler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__GLOBALERRORHANDLER = NAMED_CONCEPT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Severity Of Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__SEVERITY_OF_ERROR = NAMED_CONCEPT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_FEATURE_COUNT = NAMED_CONCEPT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_OPERATION_COUNT = NAMED_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domijProject.EGateType <em>EGate Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domijProject.EGateType
	 * @see domijProject.impl.DomijProjectPackageImpl#getEGateType()
	 * @generated
	 */
	int EGATE_TYPE = 12;

	/**
	 * The meta object id for the '{@link domijProject.ERelationshipType <em>ERelationship Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domijProject.ERelationshipType
	 * @see domijProject.impl.DomijProjectPackageImpl#getERelationshipType()
	 * @generated
	 */
	int ERELATIONSHIP_TYPE = 13;

	/**
	 * The meta object id for the '{@link domijProject.EStepType <em>EStep Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domijProject.EStepType
	 * @see domijProject.impl.DomijProjectPackageImpl#getEStepType()
	 * @generated
	 */
	int ESTEP_TYPE = 14;

	/**
	 * The meta object id for the '{@link domijProject.EInspectionType <em>EInspection Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domijProject.EInspectionType
	 * @see domijProject.impl.DomijProjectPackageImpl#getEInspectionType()
	 * @generated
	 */
	int EINSPECTION_TYPE = 15;


	/**
	 * The meta object id for the '{@link domijProject.ENotation <em>ENotation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domijProject.ENotation
	 * @see domijProject.impl.DomijProjectPackageImpl#getENotation()
	 * @generated
	 */
	int ENOTATION = 16;


	/**
	 * Returns the meta object for class '{@link domijProject.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see domijProject.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link domijProject.Model#getProcessing <em>Processing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processing</em>'.
	 * @see domijProject.Model#getProcessing()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Processing();

	/**
	 * Returns the meta object for class '{@link domijProject.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see domijProject.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the containment reference list '{@link domijProject.Process#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see domijProject.Process#getElements()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Elements();

	/**
	 * Returns the meta object for the containment reference list '{@link domijProject.Process#getRelationships <em>Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationships</em>'.
	 * @see domijProject.Process#getRelationships()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Relationships();

	/**
	 * Returns the meta object for the containment reference list '{@link domijProject.Process#getInspections <em>Inspections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inspections</em>'.
	 * @see domijProject.Process#getInspections()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Inspections();

	/**
	 * Returns the meta object for class '{@link domijProject.NamedConcept <em>Named Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Concept</em>'.
	 * @see domijProject.NamedConcept
	 * @generated
	 */
	EClass getNamedConcept();

	/**
	 * Returns the meta object for the attribute '{@link domijProject.NamedConcept#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see domijProject.NamedConcept#getId()
	 * @see #getNamedConcept()
	 * @generated
	 */
	EAttribute getNamedConcept_Id();

	/**
	 * Returns the meta object for the attribute '{@link domijProject.NamedConcept#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see domijProject.NamedConcept#getName()
	 * @see #getNamedConcept()
	 * @generated
	 */
	EAttribute getNamedConcept_Name();

	/**
	 * Returns the meta object for class '{@link domijProject.Manufacture <em>Manufacture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manufacture</em>'.
	 * @see domijProject.Manufacture
	 * @generated
	 */
	EClass getManufacture();

	/**
	 * Returns the meta object for the containment reference list '{@link domijProject.Manufacture#getHandlersOfManufacture <em>Handlers Of Manufacture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Handlers Of Manufacture</em>'.
	 * @see domijProject.Manufacture#getHandlersOfManufacture()
	 * @see #getManufacture()
	 * @generated
	 */
	EReference getManufacture_HandlersOfManufacture();

	/**
	 * Returns the meta object for class '{@link domijProject.GlobalErrorHandler <em>Global Error Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Error Handler</em>'.
	 * @see domijProject.GlobalErrorHandler
	 * @generated
	 */
	EClass getGlobalErrorHandler();

	/**
	 * Returns the meta object for the reference '{@link domijProject.GlobalErrorHandler#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Error</em>'.
	 * @see domijProject.GlobalErrorHandler#getError()
	 * @see #getGlobalErrorHandler()
	 * @generated
	 */
	EReference getGlobalErrorHandler_Error();

	/**
	 * Returns the meta object for the attribute '{@link domijProject.GlobalErrorHandler#getCause <em>Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cause</em>'.
	 * @see domijProject.GlobalErrorHandler#getCause()
	 * @see #getGlobalErrorHandler()
	 * @generated
	 */
	EAttribute getGlobalErrorHandler_Cause();

	/**
	 * Returns the meta object for the containment reference list '{@link domijProject.GlobalErrorHandler#getHandlers <em>Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Handlers</em>'.
	 * @see domijProject.GlobalErrorHandler#getHandlers()
	 * @see #getGlobalErrorHandler()
	 * @generated
	 */
	EReference getGlobalErrorHandler_Handlers();

	/**
	 * Returns the meta object for class '{@link domijProject.ProcessElement <em>Process Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Element</em>'.
	 * @see domijProject.ProcessElement
	 * @generated
	 */
	EClass getProcessElement();

	/**
	 * Returns the meta object for the reference list '{@link domijProject.ProcessElement#getInRelations <em>In Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Relations</em>'.
	 * @see domijProject.ProcessElement#getInRelations()
	 * @see #getProcessElement()
	 * @generated
	 */
	EReference getProcessElement_InRelations();

	/**
	 * Returns the meta object for the reference list '{@link domijProject.ProcessElement#getOutRelations <em>Out Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out Relations</em>'.
	 * @see domijProject.ProcessElement#getOutRelations()
	 * @see #getProcessElement()
	 * @generated
	 */
	EReference getProcessElement_OutRelations();

	/**
	 * Returns the meta object for class '{@link domijProject.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see domijProject.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the attribute '{@link domijProject.Relationship#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see domijProject.Relationship#getCondition()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_Condition();

	/**
	 * Returns the meta object for the reference '{@link domijProject.Relationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see domijProject.Relationship#getTarget()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Target();

	/**
	 * Returns the meta object for the reference '{@link domijProject.Relationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see domijProject.Relationship#getSource()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Source();

	/**
	 * Returns the meta object for the attribute '{@link domijProject.Relationship#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see domijProject.Relationship#getType()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_Type();

	/**
	 * Returns the meta object for the attribute '{@link domijProject.Relationship#getNotation <em>Notation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notation</em>'.
	 * @see domijProject.Relationship#getNotation()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_Notation();

	/**
	 * Returns the meta object for class '{@link domijProject.ProcessStep <em>Process Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Step</em>'.
	 * @see domijProject.ProcessStep
	 * @generated
	 */
	EClass getProcessStep();

	/**
	 * Returns the meta object for the attribute '{@link domijProject.ProcessStep#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see domijProject.ProcessStep#getType()
	 * @see #getProcessStep()
	 * @generated
	 */
	EAttribute getProcessStep_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link domijProject.ProcessStep#getInProducts <em>In Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>In Products</em>'.
	 * @see domijProject.ProcessStep#getInProducts()
	 * @see #getProcessStep()
	 * @generated
	 */
	EReference getProcessStep_InProducts();

	/**
	 * Returns the meta object for the containment reference list '{@link domijProject.ProcessStep#getOutProducts <em>Out Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Out Products</em>'.
	 * @see domijProject.ProcessStep#getOutProducts()
	 * @see #getProcessStep()
	 * @generated
	 */
	EReference getProcessStep_OutProducts();

	/**
	 * Returns the meta object for the reference list '{@link domijProject.ProcessStep#getMonitoring <em>Monitoring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Monitoring</em>'.
	 * @see domijProject.ProcessStep#getMonitoring()
	 * @see #getProcessStep()
	 * @generated
	 */
	EReference getProcessStep_Monitoring();

	/**
	 * Returns the meta object for the containment reference list '{@link domijProject.ProcessStep#getErrors <em>Errors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Errors</em>'.
	 * @see domijProject.ProcessStep#getErrors()
	 * @see #getProcessStep()
	 * @generated
	 */
	EReference getProcessStep_Errors();

	/**
	 * Returns the meta object for the attribute '{@link domijProject.ProcessStep#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see domijProject.ProcessStep#getDescription()
	 * @see #getProcessStep()
	 * @generated
	 */
	EAttribute getProcessStep_Description();

	/**
	 * Returns the meta object for the attribute '{@link domijProject.ProcessStep#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capability</em>'.
	 * @see domijProject.ProcessStep#getCapability()
	 * @see #getProcessStep()
	 * @generated
	 */
	EAttribute getProcessStep_Capability();

	/**
	 * Returns the meta object for the attribute '{@link domijProject.ProcessStep#getNotation <em>Notation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notation</em>'.
	 * @see domijProject.ProcessStep#getNotation()
	 * @see #getProcessStep()
	 * @generated
	 */
	EAttribute getProcessStep_Notation();

	/**
	 * Returns the meta object for class '{@link domijProject.Gate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gate</em>'.
	 * @see domijProject.Gate
	 * @generated
	 */
	EClass getGate();

	/**
	 * Returns the meta object for the attribute '{@link domijProject.Gate#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see domijProject.Gate#getType()
	 * @see #getGate()
	 * @generated
	 */
	EAttribute getGate_Type();

	/**
	 * Returns the meta object for the attribute '{@link domijProject.Gate#getNotation <em>Notation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notation</em>'.
	 * @see domijProject.Gate#getNotation()
	 * @see #getGate()
	 * @generated
	 */
	EAttribute getGate_Notation();

	/**
	 * Returns the meta object for class '{@link domijProject.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see domijProject.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for class '{@link domijProject.Inspection <em>Inspection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inspection</em>'.
	 * @see domijProject.Inspection
	 * @generated
	 */
	EClass getInspection();

	/**
	 * Returns the meta object for the attribute '{@link domijProject.Inspection#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see domijProject.Inspection#getType()
	 * @see #getInspection()
	 * @generated
	 */
	EAttribute getInspection_Type();

	/**
	 * Returns the meta object for the attribute '{@link domijProject.Inspection#getAcceptanceCriteria <em>Acceptance Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acceptance Criteria</em>'.
	 * @see domijProject.Inspection#getAcceptanceCriteria()
	 * @see #getInspection()
	 * @generated
	 */
	EAttribute getInspection_AcceptanceCriteria();

	/**
	 * Returns the meta object for the attribute '{@link domijProject.Inspection#getCompletionCriteria <em>Completion Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Completion Criteria</em>'.
	 * @see domijProject.Inspection#getCompletionCriteria()
	 * @see #getInspection()
	 * @generated
	 */
	EAttribute getInspection_CompletionCriteria();

	/**
	 * Returns the meta object for class '{@link domijProject.Error <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error</em>'.
	 * @see domijProject.Error
	 * @generated
	 */
	EClass getError();

	/**
	 * Returns the meta object for the attribute '{@link domijProject.Error#getCause <em>Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cause</em>'.
	 * @see domijProject.Error#getCause()
	 * @see #getError()
	 * @generated
	 */
	EAttribute getError_Cause();

	/**
	 * Returns the meta object for the attribute '{@link domijProject.Error#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see domijProject.Error#getEffect()
	 * @see #getError()
	 * @generated
	 */
	EAttribute getError_Effect();

	/**
	 * Returns the meta object for the reference '{@link domijProject.Error#getErrorLink <em>Error Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Error Link</em>'.
	 * @see domijProject.Error#getErrorLink()
	 * @see #getError()
	 * @generated
	 */
	EReference getError_ErrorLink();

	/**
	 * Returns the meta object for the reference '{@link domijProject.Error#getGlobalerrorhandler <em>Globalerrorhandler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Globalerrorhandler</em>'.
	 * @see domijProject.Error#getGlobalerrorhandler()
	 * @see #getError()
	 * @generated
	 */
	EReference getError_Globalerrorhandler();

	/**
	 * Returns the meta object for the attribute '{@link domijProject.Error#getSeverityOfError <em>Severity Of Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity Of Error</em>'.
	 * @see domijProject.Error#getSeverityOfError()
	 * @see #getError()
	 * @generated
	 */
	EAttribute getError_SeverityOfError();

	/**
	 * Returns the meta object for enum '{@link domijProject.EGateType <em>EGate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EGate Type</em>'.
	 * @see domijProject.EGateType
	 * @generated
	 */
	EEnum getEGateType();

	/**
	 * Returns the meta object for enum '{@link domijProject.ERelationshipType <em>ERelationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ERelationship Type</em>'.
	 * @see domijProject.ERelationshipType
	 * @generated
	 */
	EEnum getERelationshipType();

	/**
	 * Returns the meta object for enum '{@link domijProject.EStepType <em>EStep Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EStep Type</em>'.
	 * @see domijProject.EStepType
	 * @generated
	 */
	EEnum getEStepType();

	/**
	 * Returns the meta object for enum '{@link domijProject.EInspectionType <em>EInspection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EInspection Type</em>'.
	 * @see domijProject.EInspectionType
	 * @generated
	 */
	EEnum getEInspectionType();

	/**
	 * Returns the meta object for enum '{@link domijProject.ENotation <em>ENotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ENotation</em>'.
	 * @see domijProject.ENotation
	 * @generated
	 */
	EEnum getENotation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DomijProjectFactory getDomijProjectFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link domijProject.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domijProject.impl.ModelImpl
		 * @see domijProject.impl.DomijProjectPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Processing</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__PROCESSING = eINSTANCE.getModel_Processing();

		/**
		 * The meta object literal for the '{@link domijProject.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domijProject.impl.ProcessImpl
		 * @see domijProject.impl.DomijProjectPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__ELEMENTS = eINSTANCE.getProcess_Elements();

		/**
		 * The meta object literal for the '<em><b>Relationships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__RELATIONSHIPS = eINSTANCE.getProcess_Relationships();

		/**
		 * The meta object literal for the '<em><b>Inspections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__INSPECTIONS = eINSTANCE.getProcess_Inspections();

		/**
		 * The meta object literal for the '{@link domijProject.impl.NamedConceptImpl <em>Named Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domijProject.impl.NamedConceptImpl
		 * @see domijProject.impl.DomijProjectPackageImpl#getNamedConcept()
		 * @generated
		 */
		EClass NAMED_CONCEPT = eINSTANCE.getNamedConcept();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_CONCEPT__ID = eINSTANCE.getNamedConcept_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_CONCEPT__NAME = eINSTANCE.getNamedConcept_Name();

		/**
		 * The meta object literal for the '{@link domijProject.impl.ManufactureImpl <em>Manufacture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domijProject.impl.ManufactureImpl
		 * @see domijProject.impl.DomijProjectPackageImpl#getManufacture()
		 * @generated
		 */
		EClass MANUFACTURE = eINSTANCE.getManufacture();

		/**
		 * The meta object literal for the '<em><b>Handlers Of Manufacture</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANUFACTURE__HANDLERS_OF_MANUFACTURE = eINSTANCE.getManufacture_HandlersOfManufacture();

		/**
		 * The meta object literal for the '{@link domijProject.impl.GlobalErrorHandlerImpl <em>Global Error Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domijProject.impl.GlobalErrorHandlerImpl
		 * @see domijProject.impl.DomijProjectPackageImpl#getGlobalErrorHandler()
		 * @generated
		 */
		EClass GLOBAL_ERROR_HANDLER = eINSTANCE.getGlobalErrorHandler();

		/**
		 * The meta object literal for the '<em><b>Error</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_ERROR_HANDLER__ERROR = eINSTANCE.getGlobalErrorHandler_Error();

		/**
		 * The meta object literal for the '<em><b>Cause</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_ERROR_HANDLER__CAUSE = eINSTANCE.getGlobalErrorHandler_Cause();

		/**
		 * The meta object literal for the '<em><b>Handlers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_ERROR_HANDLER__HANDLERS = eINSTANCE.getGlobalErrorHandler_Handlers();

		/**
		 * The meta object literal for the '{@link domijProject.impl.ProcessElementImpl <em>Process Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domijProject.impl.ProcessElementImpl
		 * @see domijProject.impl.DomijProjectPackageImpl#getProcessElement()
		 * @generated
		 */
		EClass PROCESS_ELEMENT = eINSTANCE.getProcessElement();

		/**
		 * The meta object literal for the '<em><b>In Relations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_ELEMENT__IN_RELATIONS = eINSTANCE.getProcessElement_InRelations();

		/**
		 * The meta object literal for the '<em><b>Out Relations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_ELEMENT__OUT_RELATIONS = eINSTANCE.getProcessElement_OutRelations();

		/**
		 * The meta object literal for the '{@link domijProject.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domijProject.impl.RelationshipImpl
		 * @see domijProject.impl.DomijProjectPackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__CONDITION = eINSTANCE.getRelationship_Condition();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__TARGET = eINSTANCE.getRelationship_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__SOURCE = eINSTANCE.getRelationship_Source();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__TYPE = eINSTANCE.getRelationship_Type();

		/**
		 * The meta object literal for the '<em><b>Notation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__NOTATION = eINSTANCE.getRelationship_Notation();

		/**
		 * The meta object literal for the '{@link domijProject.impl.ProcessStepImpl <em>Process Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domijProject.impl.ProcessStepImpl
		 * @see domijProject.impl.DomijProjectPackageImpl#getProcessStep()
		 * @generated
		 */
		EClass PROCESS_STEP = eINSTANCE.getProcessStep();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_STEP__TYPE = eINSTANCE.getProcessStep_Type();

		/**
		 * The meta object literal for the '<em><b>In Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_STEP__IN_PRODUCTS = eINSTANCE.getProcessStep_InProducts();

		/**
		 * The meta object literal for the '<em><b>Out Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_STEP__OUT_PRODUCTS = eINSTANCE.getProcessStep_OutProducts();

		/**
		 * The meta object literal for the '<em><b>Monitoring</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_STEP__MONITORING = eINSTANCE.getProcessStep_Monitoring();

		/**
		 * The meta object literal for the '<em><b>Errors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_STEP__ERRORS = eINSTANCE.getProcessStep_Errors();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_STEP__DESCRIPTION = eINSTANCE.getProcessStep_Description();

		/**
		 * The meta object literal for the '<em><b>Capability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_STEP__CAPABILITY = eINSTANCE.getProcessStep_Capability();

		/**
		 * The meta object literal for the '<em><b>Notation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_STEP__NOTATION = eINSTANCE.getProcessStep_Notation();

		/**
		 * The meta object literal for the '{@link domijProject.impl.GateImpl <em>Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domijProject.impl.GateImpl
		 * @see domijProject.impl.DomijProjectPackageImpl#getGate()
		 * @generated
		 */
		EClass GATE = eINSTANCE.getGate();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATE__TYPE = eINSTANCE.getGate_Type();

		/**
		 * The meta object literal for the '<em><b>Notation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATE__NOTATION = eINSTANCE.getGate_Notation();

		/**
		 * The meta object literal for the '{@link domijProject.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domijProject.impl.ProductImpl
		 * @see domijProject.impl.DomijProjectPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '{@link domijProject.impl.InspectionImpl <em>Inspection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domijProject.impl.InspectionImpl
		 * @see domijProject.impl.DomijProjectPackageImpl#getInspection()
		 * @generated
		 */
		EClass INSPECTION = eINSTANCE.getInspection();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSPECTION__TYPE = eINSTANCE.getInspection_Type();

		/**
		 * The meta object literal for the '<em><b>Acceptance Criteria</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSPECTION__ACCEPTANCE_CRITERIA = eINSTANCE.getInspection_AcceptanceCriteria();

		/**
		 * The meta object literal for the '<em><b>Completion Criteria</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSPECTION__COMPLETION_CRITERIA = eINSTANCE.getInspection_CompletionCriteria();

		/**
		 * The meta object literal for the '{@link domijProject.impl.ErrorImpl <em>Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domijProject.impl.ErrorImpl
		 * @see domijProject.impl.DomijProjectPackageImpl#getError()
		 * @generated
		 */
		EClass ERROR = eINSTANCE.getError();

		/**
		 * The meta object literal for the '<em><b>Cause</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR__CAUSE = eINSTANCE.getError_Cause();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR__EFFECT = eINSTANCE.getError_Effect();

		/**
		 * The meta object literal for the '<em><b>Error Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR__ERROR_LINK = eINSTANCE.getError_ErrorLink();

		/**
		 * The meta object literal for the '<em><b>Globalerrorhandler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR__GLOBALERRORHANDLER = eINSTANCE.getError_Globalerrorhandler();

		/**
		 * The meta object literal for the '<em><b>Severity Of Error</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR__SEVERITY_OF_ERROR = eINSTANCE.getError_SeverityOfError();

		/**
		 * The meta object literal for the '{@link domijProject.EGateType <em>EGate Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domijProject.EGateType
		 * @see domijProject.impl.DomijProjectPackageImpl#getEGateType()
		 * @generated
		 */
		EEnum EGATE_TYPE = eINSTANCE.getEGateType();

		/**
		 * The meta object literal for the '{@link domijProject.ERelationshipType <em>ERelationship Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domijProject.ERelationshipType
		 * @see domijProject.impl.DomijProjectPackageImpl#getERelationshipType()
		 * @generated
		 */
		EEnum ERELATIONSHIP_TYPE = eINSTANCE.getERelationshipType();

		/**
		 * The meta object literal for the '{@link domijProject.EStepType <em>EStep Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domijProject.EStepType
		 * @see domijProject.impl.DomijProjectPackageImpl#getEStepType()
		 * @generated
		 */
		EEnum ESTEP_TYPE = eINSTANCE.getEStepType();

		/**
		 * The meta object literal for the '{@link domijProject.EInspectionType <em>EInspection Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domijProject.EInspectionType
		 * @see domijProject.impl.DomijProjectPackageImpl#getEInspectionType()
		 * @generated
		 */
		EEnum EINSPECTION_TYPE = eINSTANCE.getEInspectionType();

		/**
		 * The meta object literal for the '{@link domijProject.ENotation <em>ENotation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domijProject.ENotation
		 * @see domijProject.impl.DomijProjectPackageImpl#getENotation()
		 * @generated
		 */
		EEnum ENOTATION = eINSTANCE.getENotation();

	}

} //DomijProjectPackage
