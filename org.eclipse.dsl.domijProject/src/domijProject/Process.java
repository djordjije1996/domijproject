/**
 */
package domijProject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domijProject.Process#getElements <em>Elements</em>}</li>
 *   <li>{@link domijProject.Process#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link domijProject.Process#getInspections <em>Inspections</em>}</li>
 * </ul>
 * </p>
 *
 * @see domijProject.DomijProjectPackage#getProcess()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqunessOfStartStep mustHaveAtLeastOneStartStep mustHaveAtLeastOneEndStep relationsConnectingStepsFromSameProcess'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot uniqunessOfStartStep='\n\t\t\tself.elements->selectByType(ProcessStep)->forAll(ps1, ps2| \n\t\t\t\tps1.type = EStepType::START and ps2.type = EStepType::START implies ps1=ps2)' mustHaveAtLeastOneStartStep='\n\t\t\tself.elements->selectByType(ProcessStep)->exists(ps| ps.type = EStepType::START)' mustHaveAtLeastOneEndStep='\n\t\t\tself.elements->selectByType(ProcessStep)->exists(ps| ps.type = EStepType::END)' relationsConnectingStepsFromSameProcess='\n\t\t\tself.relationships->forAll(r:Relationship| \n\t\t\t\tself.elements->exists(e:ProcessElement| r.target = e)\n\t\t\t\tand\n\t\t\t\tself.elements->exists(e:ProcessElement| r.source = e))'"
 * @generated
 */
public interface Process extends NamedConcept {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link domijProject.ProcessElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see domijProject.DomijProjectPackage#getProcess_Elements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ProcessElement> getElements();

	/**
	 * Returns the value of the '<em><b>Relationships</b></em>' containment reference list.
	 * The list contents are of type {@link domijProject.Relationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationships</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationships</em>' containment reference list.
	 * @see domijProject.DomijProjectPackage#getProcess_Relationships()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Relationship> getRelationships();

	/**
	 * Returns the value of the '<em><b>Inspections</b></em>' containment reference list.
	 * The list contents are of type {@link domijProject.Inspection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inspections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inspections</em>' containment reference list.
	 * @see domijProject.DomijProjectPackage#getProcess_Inspections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Inspection> getInspections();

} // Process
