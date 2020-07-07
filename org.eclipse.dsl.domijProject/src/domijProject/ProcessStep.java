/**
 */
package domijProject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domijProject.ProcessStep#getType <em>Type</em>}</li>
 *   <li>{@link domijProject.ProcessStep#getInProducts <em>In Products</em>}</li>
 *   <li>{@link domijProject.ProcessStep#getOutProducts <em>Out Products</em>}</li>
 *   <li>{@link domijProject.ProcessStep#getMonitoring <em>Monitoring</em>}</li>
 *   <li>{@link domijProject.ProcessStep#getErrors <em>Errors</em>}</li>
 *   <li>{@link domijProject.ProcessStep#getDescription <em>Description</em>}</li>
 *   <li>{@link domijProject.ProcessStep#getCapability <em>Capability</em>}</li>
 *   <li>{@link domijProject.ProcessStep#getNotation <em>Notation</em>}</li>
 * </ul>
 * </p>
 *
 * @see domijProject.DomijProjectPackage#getProcessStep()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='endStepHasNoOutRelations startStepHasNoInRelations everyNoStartStepHasInFlowRelation everyNoEndStepHasOneOutFlowRelation stepCantBeReferencedByContainingError startHasNoInspection'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot endStepHasNoOutRelations='\n\t\t\tself.type = EStepType::END implies self.outRelations->size() = 0' startStepHasNoInRelations='\n\t\t\tself.type = EStepType::START implies self.inRelations->size() = 0' everyNoStartStepHasInFlowRelation='\n\t\t\tself.type <> EStepType::START implies\n\t\t\t((self.oclAsType(ProcessElement).inRelations->select(r:Relationship| r.type = ERelationshipType::FLOW)->size() > 0)\n\t\t\tor\n\t\t\t(Error.allInstances().errorLink->exists(self)))' everyNoEndStepHasOneOutFlowRelation='\n\t\t\tself.type <> EStepType::END implies\n\t\t\tself.oclAsType(ProcessElement).outRelations->select(r:Relationship| r.type = ERelationshipType::FLOW)->size() = 1' stepCantBeReferencedByContainingError='\n\t\t\tself.errors->select(e:Error| e.errorLink = self)->size() = 0' startHasNoInspection='\n\t\t\tself.type = EStepType::START implies self.monitoring->isEmpty()'"
 * @generated
 */
public interface ProcessStep extends ProcessElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link domijProject.EStepType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see domijProject.EStepType
	 * @see #setType(EStepType)
	 * @see domijProject.DomijProjectPackage#getProcessStep_Type()
	 * @model
	 * @generated
	 */
	EStepType getType();

	/**
	 * Sets the value of the '{@link domijProject.ProcessStep#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see domijProject.EStepType
	 * @see #getType()
	 * @generated
	 */
	void setType(EStepType value);

	/**
	 * Returns the value of the '<em><b>In Products</b></em>' containment reference list.
	 * The list contents are of type {@link domijProject.Product}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Products</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Products</em>' containment reference list.
	 * @see domijProject.DomijProjectPackage#getProcessStep_InProducts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Product> getInProducts();

	/**
	 * Returns the value of the '<em><b>Out Products</b></em>' containment reference list.
	 * The list contents are of type {@link domijProject.Product}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Products</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Products</em>' containment reference list.
	 * @see domijProject.DomijProjectPackage#getProcessStep_OutProducts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Product> getOutProducts();

	/**
	 * Returns the value of the '<em><b>Monitoring</b></em>' reference list.
	 * The list contents are of type {@link domijProject.Inspection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitoring</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitoring</em>' reference list.
	 * @see domijProject.DomijProjectPackage#getProcessStep_Monitoring()
	 * @model
	 * @generated
	 */
	EList<Inspection> getMonitoring();

	/**
	 * Returns the value of the '<em><b>Errors</b></em>' containment reference list.
	 * The list contents are of type {@link domijProject.Error}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Errors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Errors</em>' containment reference list.
	 * @see domijProject.DomijProjectPackage#getProcessStep_Errors()
	 * @model containment="true"
	 * @generated
	 */
	EList<domijProject.Error> getErrors();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see domijProject.DomijProjectPackage#getProcessStep_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link domijProject.ProcessStep#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Capability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability</em>' attribute.
	 * @see #setCapability(String)
	 * @see domijProject.DomijProjectPackage#getProcessStep_Capability()
	 * @model
	 * @generated
	 */
	String getCapability();

	/**
	 * Sets the value of the '{@link domijProject.ProcessStep#getCapability <em>Capability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability</em>' attribute.
	 * @see #getCapability()
	 * @generated
	 */
	void setCapability(String value);

	/**
	 * Returns the value of the '<em><b>Notation</b></em>' attribute.
	 * The literals are from the enumeration {@link domijProject.ENotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notation</em>' attribute.
	 * @see domijProject.ENotation
	 * @see #setNotation(ENotation)
	 * @see domijProject.DomijProjectPackage#getProcessStep_Notation()
	 * @model
	 * @generated
	 */
	ENotation getNotation();

	/**
	 * Sets the value of the '{@link domijProject.ProcessStep#getNotation <em>Notation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notation</em>' attribute.
	 * @see domijProject.ENotation
	 * @see #getNotation()
	 * @generated
	 */
	void setNotation(ENotation value);

} // ProcessStep
