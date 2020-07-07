/**
 */
package domijProject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inspection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domijProject.Inspection#getType <em>Type</em>}</li>
 *   <li>{@link domijProject.Inspection#getAcceptanceCriteria <em>Acceptance Criteria</em>}</li>
 *   <li>{@link domijProject.Inspection#getCompletionCriteria <em>Completion Criteria</em>}</li>
 * </ul>
 * </p>
 *
 * @see domijProject.DomijProjectPackage#getInspection()
 * @model
 * @generated
 */
public interface Inspection extends NamedConcept {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"PRESTEP"</code>.
	 * The literals are from the enumeration {@link domijProject.EInspectionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see domijProject.EInspectionType
	 * @see #setType(EInspectionType)
	 * @see domijProject.DomijProjectPackage#getInspection_Type()
	 * @model default="PRESTEP"
	 * @generated
	 */
	EInspectionType getType();

	/**
	 * Sets the value of the '{@link domijProject.Inspection#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see domijProject.EInspectionType
	 * @see #getType()
	 * @generated
	 */
	void setType(EInspectionType value);

	/**
	 * Returns the value of the '<em><b>Acceptance Criteria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acceptance Criteria</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acceptance Criteria</em>' attribute.
	 * @see #setAcceptanceCriteria(String)
	 * @see domijProject.DomijProjectPackage#getInspection_AcceptanceCriteria()
	 * @model
	 * @generated
	 */
	String getAcceptanceCriteria();

	/**
	 * Sets the value of the '{@link domijProject.Inspection#getAcceptanceCriteria <em>Acceptance Criteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acceptance Criteria</em>' attribute.
	 * @see #getAcceptanceCriteria()
	 * @generated
	 */
	void setAcceptanceCriteria(String value);

	/**
	 * Returns the value of the '<em><b>Completion Criteria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Completion Criteria</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completion Criteria</em>' attribute.
	 * @see #setCompletionCriteria(String)
	 * @see domijProject.DomijProjectPackage#getInspection_CompletionCriteria()
	 * @model
	 * @generated
	 */
	String getCompletionCriteria();

	/**
	 * Sets the value of the '{@link domijProject.Inspection#getCompletionCriteria <em>Completion Criteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completion Criteria</em>' attribute.
	 * @see #getCompletionCriteria()
	 * @generated
	 */
	void setCompletionCriteria(String value);

} // Inspection
