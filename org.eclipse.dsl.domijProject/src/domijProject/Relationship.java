/**
 */
package domijProject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domijProject.Relationship#getCondition <em>Condition</em>}</li>
 *   <li>{@link domijProject.Relationship#getTarget <em>Target</em>}</li>
 *   <li>{@link domijProject.Relationship#getSource <em>Source</em>}</li>
 *   <li>{@link domijProject.Relationship#getType <em>Type</em>}</li>
 *   <li>{@link domijProject.Relationship#getNotation <em>Notation</em>}</li>
 * </ul>
 * </p>
 *
 * @see domijProject.DomijProjectPackage#getRelationship()
 * @model
 * @generated
 */
public interface Relationship extends NamedConcept {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see domijProject.DomijProjectPackage#getRelationship_Condition()
	 * @model
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link domijProject.Relationship#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link domijProject.ProcessElement#getInRelations <em>In Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ProcessElement)
	 * @see domijProject.DomijProjectPackage#getRelationship_Target()
	 * @see domijProject.ProcessElement#getInRelations
	 * @model opposite="inRelations" required="true"
	 * @generated
	 */
	ProcessElement getTarget();

	/**
	 * Sets the value of the '{@link domijProject.Relationship#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ProcessElement value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link domijProject.ProcessElement#getOutRelations <em>Out Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ProcessElement)
	 * @see domijProject.DomijProjectPackage#getRelationship_Source()
	 * @see domijProject.ProcessElement#getOutRelations
	 * @model opposite="outRelations" required="true"
	 * @generated
	 */
	ProcessElement getSource();

	/**
	 * Sets the value of the '{@link domijProject.Relationship#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ProcessElement value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link domijProject.ERelationshipType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see domijProject.ERelationshipType
	 * @see #setType(ERelationshipType)
	 * @see domijProject.DomijProjectPackage#getRelationship_Type()
	 * @model
	 * @generated
	 */
	ERelationshipType getType();

	/**
	 * Sets the value of the '{@link domijProject.Relationship#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see domijProject.ERelationshipType
	 * @see #getType()
	 * @generated
	 */
	void setType(ERelationshipType value);

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
	 * @see domijProject.DomijProjectPackage#getRelationship_Notation()
	 * @model
	 * @generated
	 */
	ENotation getNotation();

	/**
	 * Sets the value of the '{@link domijProject.Relationship#getNotation <em>Notation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notation</em>' attribute.
	 * @see domijProject.ENotation
	 * @see #getNotation()
	 * @generated
	 */
	void setNotation(ENotation value);

} // Relationship
