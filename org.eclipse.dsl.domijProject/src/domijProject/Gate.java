/**
 */
package domijProject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domijProject.Gate#getType <em>Type</em>}</li>
 *   <li>{@link domijProject.Gate#getNotation <em>Notation</em>}</li>
 * </ul>
 * </p>
 *
 * @see domijProject.DomijProjectPackage#getGate()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='gateHasAtLeastOneInRelation gateHasAtLeastOneOutRelation decisionGateHasAtLeastTwoOutRelation onlyOneOutRelationWithNoCondition allRelationsAreFlow'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot gateHasAtLeastOneInRelation='\n\t\t\tself.oclAsType(ProcessElement).inRelations->size() > 0' gateHasAtLeastOneOutRelation='\n\t\t\tself.oclAsType(ProcessElement).outRelations->size() > 0' decisionGateHasAtLeastTwoOutRelation='\n\t\t\tself.type = EGateType::DECISION implies\n\t\t\tself.oclAsType(ProcessElement).outRelations->size() > 1' onlyOneOutRelationWithNoCondition='\n\t\t\tself.oclAsType(ProcessElement).outRelations->select(r:Relationship| r.condition->isEmpty())->size()< 2' allRelationsAreFlow='\n\t\t\t(self.oclAsType(ProcessElement).inRelations->select(r:Relationship| r.type = ERelationshipType::COLLABORATION)->size() = 0)\n\t\t\tand\n\t\t\t(self.oclAsType(ProcessElement).outRelations->select(r:Relationship| r.type = ERelationshipType::COLLABORATION)->size() = 0)'"
 * @generated
 */
public interface Gate extends ProcessElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link domijProject.EGateType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see domijProject.EGateType
	 * @see #setType(EGateType)
	 * @see domijProject.DomijProjectPackage#getGate_Type()
	 * @model
	 * @generated
	 */
	EGateType getType();

	/**
	 * Sets the value of the '{@link domijProject.Gate#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see domijProject.EGateType
	 * @see #getType()
	 * @generated
	 */
	void setType(EGateType value);

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
	 * @see domijProject.DomijProjectPackage#getGate_Notation()
	 * @model
	 * @generated
	 */
	ENotation getNotation();

	/**
	 * Sets the value of the '{@link domijProject.Gate#getNotation <em>Notation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notation</em>' attribute.
	 * @see domijProject.ENotation
	 * @see #getNotation()
	 * @generated
	 */
	void setNotation(ENotation value);

} // Gate
