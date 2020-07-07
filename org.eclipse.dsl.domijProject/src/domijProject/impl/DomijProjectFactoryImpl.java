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
import domijProject.ProcessStep;
import domijProject.Product;
import domijProject.Relationship;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomijProjectFactoryImpl extends EFactoryImpl implements DomijProjectFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DomijProjectFactory init() {
		try {
			DomijProjectFactory theDomijProjectFactory = (DomijProjectFactory)EPackage.Registry.INSTANCE.getEFactory(DomijProjectPackage.eNS_URI);
			if (theDomijProjectFactory != null) {
				return theDomijProjectFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DomijProjectFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomijProjectFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DomijProjectPackage.MODEL: return createModel();
			case DomijProjectPackage.MANUFACTURE: return createManufacture();
			case DomijProjectPackage.GLOBAL_ERROR_HANDLER: return createGlobalErrorHandler();
			case DomijProjectPackage.RELATIONSHIP: return createRelationship();
			case DomijProjectPackage.PROCESS_STEP: return createProcessStep();
			case DomijProjectPackage.GATE: return createGate();
			case DomijProjectPackage.PRODUCT: return createProduct();
			case DomijProjectPackage.INSPECTION: return createInspection();
			case DomijProjectPackage.ERROR: return createError();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DomijProjectPackage.EGATE_TYPE:
				return createEGateTypeFromString(eDataType, initialValue);
			case DomijProjectPackage.ERELATIONSHIP_TYPE:
				return createERelationshipTypeFromString(eDataType, initialValue);
			case DomijProjectPackage.ESTEP_TYPE:
				return createEStepTypeFromString(eDataType, initialValue);
			case DomijProjectPackage.EINSPECTION_TYPE:
				return createEInspectionTypeFromString(eDataType, initialValue);
			case DomijProjectPackage.ENOTATION:
				return createENotationFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DomijProjectPackage.EGATE_TYPE:
				return convertEGateTypeToString(eDataType, instanceValue);
			case DomijProjectPackage.ERELATIONSHIP_TYPE:
				return convertERelationshipTypeToString(eDataType, instanceValue);
			case DomijProjectPackage.ESTEP_TYPE:
				return convertEStepTypeToString(eDataType, instanceValue);
			case DomijProjectPackage.EINSPECTION_TYPE:
				return convertEInspectionTypeToString(eDataType, instanceValue);
			case DomijProjectPackage.ENOTATION:
				return convertENotationToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manufacture createManufacture() {
		ManufactureImpl manufacture = new ManufactureImpl();
		return manufacture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalErrorHandler createGlobalErrorHandler() {
		GlobalErrorHandlerImpl globalErrorHandler = new GlobalErrorHandlerImpl();
		return globalErrorHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship createRelationship() {
		RelationshipImpl relationship = new RelationshipImpl();
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessStep createProcessStep() {
		ProcessStepImpl processStep = new ProcessStepImpl();
		return processStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gate createGate() {
		GateImpl gate = new GateImpl();
		return gate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product createProduct() {
		ProductImpl product = new ProductImpl();
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inspection createInspection() {
		InspectionImpl inspection = new InspectionImpl();
		return inspection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public domijProject.Error createError() {
		ErrorImpl error = new ErrorImpl();
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EGateType createEGateTypeFromString(EDataType eDataType, String initialValue) {
		EGateType result = EGateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEGateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERelationshipType createERelationshipTypeFromString(EDataType eDataType, String initialValue) {
		ERelationshipType result = ERelationshipType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertERelationshipTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStepType createEStepTypeFromString(EDataType eDataType, String initialValue) {
		EStepType result = EStepType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEStepTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EInspectionType createEInspectionTypeFromString(EDataType eDataType, String initialValue) {
		EInspectionType result = EInspectionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEInspectionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENotation createENotationFromString(EDataType eDataType, String initialValue) {
		ENotation result = ENotation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENotationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomijProjectPackage getDomijProjectPackage() {
		return (DomijProjectPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DomijProjectPackage getPackage() {
		return DomijProjectPackage.eINSTANCE;
	}

} //DomijProjectFactoryImpl
