/**
 */
package domijProject.util;

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

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see domijProject.DomijProjectPackage
 * @generated
 */
public class DomijProjectValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DomijProjectValidator INSTANCE = new DomijProjectValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "domijProject";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomijProjectValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return DomijProjectPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case DomijProjectPackage.MODEL:
				return validateModel((Model)value, diagnostics, context);
			case DomijProjectPackage.PROCESS:
				return validateProcess((domijProject.Process)value, diagnostics, context);
			case DomijProjectPackage.NAMED_CONCEPT:
				return validateNamedConcept((NamedConcept)value, diagnostics, context);
			case DomijProjectPackage.MANUFACTURE:
				return validateManufacture((Manufacture)value, diagnostics, context);
			case DomijProjectPackage.GLOBAL_ERROR_HANDLER:
				return validateGlobalErrorHandler((GlobalErrorHandler)value, diagnostics, context);
			case DomijProjectPackage.PROCESS_ELEMENT:
				return validateProcessElement((ProcessElement)value, diagnostics, context);
			case DomijProjectPackage.RELATIONSHIP:
				return validateRelationship((Relationship)value, diagnostics, context);
			case DomijProjectPackage.PROCESS_STEP:
				return validateProcessStep((ProcessStep)value, diagnostics, context);
			case DomijProjectPackage.GATE:
				return validateGate((Gate)value, diagnostics, context);
			case DomijProjectPackage.PRODUCT:
				return validateProduct((Product)value, diagnostics, context);
			case DomijProjectPackage.INSPECTION:
				return validateInspection((Inspection)value, diagnostics, context);
			case DomijProjectPackage.ERROR:
				return validateError((domijProject.Error)value, diagnostics, context);
			case DomijProjectPackage.EGATE_TYPE:
				return validateEGateType((EGateType)value, diagnostics, context);
			case DomijProjectPackage.ERELATIONSHIP_TYPE:
				return validateERelationshipType((ERelationshipType)value, diagnostics, context);
			case DomijProjectPackage.ESTEP_TYPE:
				return validateEStepType((EStepType)value, diagnostics, context);
			case DomijProjectPackage.EINSPECTION_TYPE:
				return validateEInspectionType((EInspectionType)value, diagnostics, context);
			case DomijProjectPackage.ENOTATION:
				return validateENotation((ENotation)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModel(Model model, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(model, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(model, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(model, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(model, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(model, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(model, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(model, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(model, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(model, diagnostics, context);
		if (result || diagnostics != null) result &= validateModel_mustHaveOneManufactureProcess(model, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the mustHaveOneManufactureProcess constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MODEL__MUST_HAVE_ONE_MANUFACTURE_PROCESS__EEXPRESSION = "\n" +
		"\t\t\tself.processing->selectByType(Manufacture)->size() = 1";

	/**
	 * Validates the mustHaveOneManufactureProcess constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModel_mustHaveOneManufactureProcess(Model model, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DomijProjectPackage.Literals.MODEL,
				 model,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "mustHaveOneManufactureProcess",
				 MODEL__MUST_HAVE_ONE_MANUFACTURE_PROCESS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcess(domijProject.Process process, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(process, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(process, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcess_uniqunessOfStartStep(process, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcess_mustHaveAtLeastOneStartStep(process, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcess_mustHaveAtLeastOneEndStep(process, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcess_relationsConnectingStepsFromSameProcess(process, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the uniqunessOfStartStep constraint of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROCESS__UNIQUNESS_OF_START_STEP__EEXPRESSION = "\n" +
		"\t\t\tself.elements->selectByType(ProcessStep)->forAll(ps1, ps2| \n" +
		"\t\t\t\tps1.type = EStepType::START and ps2.type = EStepType::START implies ps1=ps2)";

	/**
	 * Validates the uniqunessOfStartStep constraint of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcess_uniqunessOfStartStep(domijProject.Process process, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DomijProjectPackage.Literals.PROCESS,
				 process,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqunessOfStartStep",
				 PROCESS__UNIQUNESS_OF_START_STEP__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the mustHaveAtLeastOneStartStep constraint of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROCESS__MUST_HAVE_AT_LEAST_ONE_START_STEP__EEXPRESSION = "\n" +
		"\t\t\tself.elements->selectByType(ProcessStep)->exists(ps| ps.type = EStepType::START)";

	/**
	 * Validates the mustHaveAtLeastOneStartStep constraint of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcess_mustHaveAtLeastOneStartStep(domijProject.Process process, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DomijProjectPackage.Literals.PROCESS,
				 process,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "mustHaveAtLeastOneStartStep",
				 PROCESS__MUST_HAVE_AT_LEAST_ONE_START_STEP__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the mustHaveAtLeastOneEndStep constraint of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROCESS__MUST_HAVE_AT_LEAST_ONE_END_STEP__EEXPRESSION = "\n" +
		"\t\t\tself.elements->selectByType(ProcessStep)->exists(ps| ps.type = EStepType::END)";

	/**
	 * Validates the mustHaveAtLeastOneEndStep constraint of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcess_mustHaveAtLeastOneEndStep(domijProject.Process process, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DomijProjectPackage.Literals.PROCESS,
				 process,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "mustHaveAtLeastOneEndStep",
				 PROCESS__MUST_HAVE_AT_LEAST_ONE_END_STEP__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the relationsConnectingStepsFromSameProcess constraint of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROCESS__RELATIONS_CONNECTING_STEPS_FROM_SAME_PROCESS__EEXPRESSION = "\n" +
		"\t\t\tself.relationships->forAll(r:Relationship| \n" +
		"\t\t\t\tself.elements->exists(e:ProcessElement| r.target = e)\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\tself.elements->exists(e:ProcessElement| r.source = e))";

	/**
	 * Validates the relationsConnectingStepsFromSameProcess constraint of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcess_relationsConnectingStepsFromSameProcess(domijProject.Process process, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DomijProjectPackage.Literals.PROCESS,
				 process,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "relationsConnectingStepsFromSameProcess",
				 PROCESS__RELATIONS_CONNECTING_STEPS_FROM_SAME_PROCESS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedConcept(NamedConcept namedConcept, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedConcept, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManufacture(Manufacture manufacture, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(manufacture, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(manufacture, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(manufacture, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(manufacture, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(manufacture, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(manufacture, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(manufacture, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(manufacture, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(manufacture, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcess_uniqunessOfStartStep(manufacture, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcess_mustHaveAtLeastOneStartStep(manufacture, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcess_mustHaveAtLeastOneEndStep(manufacture, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcess_relationsConnectingStepsFromSameProcess(manufacture, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalErrorHandler(GlobalErrorHandler globalErrorHandler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(globalErrorHandler, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(globalErrorHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(globalErrorHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(globalErrorHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(globalErrorHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(globalErrorHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(globalErrorHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(globalErrorHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(globalErrorHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcess_uniqunessOfStartStep(globalErrorHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcess_mustHaveAtLeastOneStartStep(globalErrorHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcess_mustHaveAtLeastOneEndStep(globalErrorHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcess_relationsConnectingStepsFromSameProcess(globalErrorHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validateGlobalErrorHandler_handlerCantBeReferencedByContainingError(globalErrorHandler, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the handlerCantBeReferencedByContainingError constraint of '<em>Global Error Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GLOBAL_ERROR_HANDLER__HANDLER_CANT_BE_REFERENCED_BY_CONTAINING_ERROR__EEXPRESSION = "\n" +
		"\t\t\tself.elements->selectByType(ProcessStep).errors->forAll(e:Error| e.globalerrorhandler <> self)";

	/**
	 * Validates the handlerCantBeReferencedByContainingError constraint of '<em>Global Error Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalErrorHandler_handlerCantBeReferencedByContainingError(GlobalErrorHandler globalErrorHandler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DomijProjectPackage.Literals.GLOBAL_ERROR_HANDLER,
				 globalErrorHandler,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "handlerCantBeReferencedByContainingError",
				 GLOBAL_ERROR_HANDLER__HANDLER_CANT_BE_REFERENCED_BY_CONTAINING_ERROR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessElement(ProcessElement processElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationship(Relationship relationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relationship, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessStep(ProcessStep processStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(processStep, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(processStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(processStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(processStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(processStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(processStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(processStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(processStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(processStep, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcessStep_endStepHasNoOutRelations(processStep, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcessStep_startStepHasNoInRelations(processStep, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcessStep_everyNoStartStepHasInFlowRelation(processStep, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcessStep_everyNoEndStepHasOneOutFlowRelation(processStep, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcessStep_stepCantBeReferencedByContainingError(processStep, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcessStep_startHasNoInspection(processStep, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the endStepHasNoOutRelations constraint of '<em>Process Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROCESS_STEP__END_STEP_HAS_NO_OUT_RELATIONS__EEXPRESSION = "\n" +
		"\t\t\tself.type = EStepType::END implies self.outRelations->size() = 0";

	/**
	 * Validates the endStepHasNoOutRelations constraint of '<em>Process Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessStep_endStepHasNoOutRelations(ProcessStep processStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DomijProjectPackage.Literals.PROCESS_STEP,
				 processStep,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "endStepHasNoOutRelations",
				 PROCESS_STEP__END_STEP_HAS_NO_OUT_RELATIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the startStepHasNoInRelations constraint of '<em>Process Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROCESS_STEP__START_STEP_HAS_NO_IN_RELATIONS__EEXPRESSION = "\n" +
		"\t\t\tself.type = EStepType::START implies self.inRelations->size() = 0";

	/**
	 * Validates the startStepHasNoInRelations constraint of '<em>Process Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessStep_startStepHasNoInRelations(ProcessStep processStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DomijProjectPackage.Literals.PROCESS_STEP,
				 processStep,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "startStepHasNoInRelations",
				 PROCESS_STEP__START_STEP_HAS_NO_IN_RELATIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the everyNoStartStepHasInFlowRelation constraint of '<em>Process Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROCESS_STEP__EVERY_NO_START_STEP_HAS_IN_FLOW_RELATION__EEXPRESSION = "\n" +
		"\t\t\tself.type <> EStepType::START implies\n" +
		"\t\t\t((self.oclAsType(ProcessElement).inRelations->select(r:Relationship| r.type = ERelationshipType::FLOW)->size() > 0)\n" +
		"\t\t\tor\n" +
		"\t\t\t(Error.allInstances().errorLink->exists(self)))";

	/**
	 * Validates the everyNoStartStepHasInFlowRelation constraint of '<em>Process Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessStep_everyNoStartStepHasInFlowRelation(ProcessStep processStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DomijProjectPackage.Literals.PROCESS_STEP,
				 processStep,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "everyNoStartStepHasInFlowRelation",
				 PROCESS_STEP__EVERY_NO_START_STEP_HAS_IN_FLOW_RELATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the everyNoEndStepHasOneOutFlowRelation constraint of '<em>Process Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROCESS_STEP__EVERY_NO_END_STEP_HAS_ONE_OUT_FLOW_RELATION__EEXPRESSION = "\n" +
		"\t\t\tself.type <> EStepType::END implies\n" +
		"\t\t\tself.oclAsType(ProcessElement).outRelations->select(r:Relationship| r.type = ERelationshipType::FLOW)->size() = 1";

	/**
	 * Validates the everyNoEndStepHasOneOutFlowRelation constraint of '<em>Process Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessStep_everyNoEndStepHasOneOutFlowRelation(ProcessStep processStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DomijProjectPackage.Literals.PROCESS_STEP,
				 processStep,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "everyNoEndStepHasOneOutFlowRelation",
				 PROCESS_STEP__EVERY_NO_END_STEP_HAS_ONE_OUT_FLOW_RELATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the stepCantBeReferencedByContainingError constraint of '<em>Process Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROCESS_STEP__STEP_CANT_BE_REFERENCED_BY_CONTAINING_ERROR__EEXPRESSION = "\n" +
		"\t\t\tself.errors->select(e:Error| e.errorLink = self)->size() = 0";

	/**
	 * Validates the stepCantBeReferencedByContainingError constraint of '<em>Process Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessStep_stepCantBeReferencedByContainingError(ProcessStep processStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DomijProjectPackage.Literals.PROCESS_STEP,
				 processStep,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "stepCantBeReferencedByContainingError",
				 PROCESS_STEP__STEP_CANT_BE_REFERENCED_BY_CONTAINING_ERROR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the startHasNoInspection constraint of '<em>Process Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROCESS_STEP__START_HAS_NO_INSPECTION__EEXPRESSION = "\n" +
		"\t\t\tself.type = EStepType::START implies self.monitoring->isEmpty()";

	/**
	 * Validates the startHasNoInspection constraint of '<em>Process Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessStep_startHasNoInspection(ProcessStep processStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DomijProjectPackage.Literals.PROCESS_STEP,
				 processStep,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "startHasNoInspection",
				 PROCESS_STEP__START_HAS_NO_INSPECTION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGate(Gate gate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(gate, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validateGate_gateHasAtLeastOneInRelation(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validateGate_gateHasAtLeastOneOutRelation(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validateGate_decisionGateHasAtLeastTwoOutRelation(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validateGate_onlyOneOutRelationWithNoCondition(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validateGate_allRelationsAreFlow(gate, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the gateHasAtLeastOneInRelation constraint of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GATE__GATE_HAS_AT_LEAST_ONE_IN_RELATION__EEXPRESSION = "\n" +
		"\t\t\tself.oclAsType(ProcessElement).inRelations->size() > 0";

	/**
	 * Validates the gateHasAtLeastOneInRelation constraint of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGate_gateHasAtLeastOneInRelation(Gate gate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DomijProjectPackage.Literals.GATE,
				 gate,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "gateHasAtLeastOneInRelation",
				 GATE__GATE_HAS_AT_LEAST_ONE_IN_RELATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the gateHasAtLeastOneOutRelation constraint of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GATE__GATE_HAS_AT_LEAST_ONE_OUT_RELATION__EEXPRESSION = "\n" +
		"\t\t\tself.oclAsType(ProcessElement).outRelations->size() > 0";

	/**
	 * Validates the gateHasAtLeastOneOutRelation constraint of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGate_gateHasAtLeastOneOutRelation(Gate gate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DomijProjectPackage.Literals.GATE,
				 gate,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "gateHasAtLeastOneOutRelation",
				 GATE__GATE_HAS_AT_LEAST_ONE_OUT_RELATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the decisionGateHasAtLeastTwoOutRelation constraint of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GATE__DECISION_GATE_HAS_AT_LEAST_TWO_OUT_RELATION__EEXPRESSION = "\n" +
		"\t\t\tself.type = EGateType::DECISION implies\n" +
		"\t\t\tself.oclAsType(ProcessElement).outRelations->size() > 1";

	/**
	 * Validates the decisionGateHasAtLeastTwoOutRelation constraint of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGate_decisionGateHasAtLeastTwoOutRelation(Gate gate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DomijProjectPackage.Literals.GATE,
				 gate,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "decisionGateHasAtLeastTwoOutRelation",
				 GATE__DECISION_GATE_HAS_AT_LEAST_TWO_OUT_RELATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the onlyOneOutRelationWithNoCondition constraint of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GATE__ONLY_ONE_OUT_RELATION_WITH_NO_CONDITION__EEXPRESSION = "\n" +
		"\t\t\tself.oclAsType(ProcessElement).outRelations->select(r:Relationship| r.condition->isEmpty())->size()< 2";

	/**
	 * Validates the onlyOneOutRelationWithNoCondition constraint of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGate_onlyOneOutRelationWithNoCondition(Gate gate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DomijProjectPackage.Literals.GATE,
				 gate,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "onlyOneOutRelationWithNoCondition",
				 GATE__ONLY_ONE_OUT_RELATION_WITH_NO_CONDITION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the allRelationsAreFlow constraint of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GATE__ALL_RELATIONS_ARE_FLOW__EEXPRESSION = "\n" +
		"\t\t\t(self.oclAsType(ProcessElement).inRelations->select(r:Relationship| r.type = ERelationshipType::COLLABORATION)->size() = 0)\n" +
		"\t\t\tand\n" +
		"\t\t\t(self.oclAsType(ProcessElement).outRelations->select(r:Relationship| r.type = ERelationshipType::COLLABORATION)->size() = 0)";

	/**
	 * Validates the allRelationsAreFlow constraint of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGate_allRelationsAreFlow(Gate gate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DomijProjectPackage.Literals.GATE,
				 gate,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "allRelationsAreFlow",
				 GATE__ALL_RELATIONS_ARE_FLOW__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProduct(Product product, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(product, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInspection(Inspection inspection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inspection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateError(domijProject.Error error, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(error, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(error, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(error, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(error, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(error, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(error, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(error, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(error, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(error, diagnostics, context);
		if (result || diagnostics != null) result &= validateError_errorExclusivelyReferencesHandlerOrStep(error, diagnostics, context);
		if (result || diagnostics != null) result &= validateError_severityOneToTen(error, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the errorExclusivelyReferencesHandlerOrStep constraint of '<em>Error</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ERROR__ERROR_EXCLUSIVELY_REFERENCES_HANDLER_OR_STEP__EEXPRESSION = "\n" +
		"\t\t\tself.errorLink->isEmpty() xor self.globalerrorhandler->isEmpty()";

	/**
	 * Validates the errorExclusivelyReferencesHandlerOrStep constraint of '<em>Error</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateError_errorExclusivelyReferencesHandlerOrStep(domijProject.Error error, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DomijProjectPackage.Literals.ERROR,
				 error,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "errorExclusivelyReferencesHandlerOrStep",
				 ERROR__ERROR_EXCLUSIVELY_REFERENCES_HANDLER_OR_STEP__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the severityOneToTen constraint of '<em>Error</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ERROR__SEVERITY_ONE_TO_TEN__EEXPRESSION = "\n" +
		"\t\t\tself.severityOfError > 0 and self.severityOfError < 11";

	/**
	 * Validates the severityOneToTen constraint of '<em>Error</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateError_severityOneToTen(domijProject.Error error, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DomijProjectPackage.Literals.ERROR,
				 error,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "severityOneToTen",
				 ERROR__SEVERITY_ONE_TO_TEN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEGateType(EGateType eGateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateERelationshipType(ERelationshipType eRelationshipType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEStepType(EStepType eStepType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEInspectionType(EInspectionType eInspectionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENotation(ENotation eNotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //DomijProjectValidator
