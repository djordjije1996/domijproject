/**
 */
package domijProject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domijProject.ProcessElement#getInRelations <em>In Relations</em>}</li>
 *   <li>{@link domijProject.ProcessElement#getOutRelations <em>Out Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @see domijProject.DomijProjectPackage#getProcessElement()
 * @model abstract="true"
 * @generated
 */
public interface ProcessElement extends NamedConcept {
	/**
	 * Returns the value of the '<em><b>In Relations</b></em>' reference list.
	 * The list contents are of type {@link domijProject.Relationship}.
	 * It is bidirectional and its opposite is '{@link domijProject.Relationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Relations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Relations</em>' reference list.
	 * @see domijProject.DomijProjectPackage#getProcessElement_InRelations()
	 * @see domijProject.Relationship#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Relationship> getInRelations();

	/**
	 * Returns the value of the '<em><b>Out Relations</b></em>' reference list.
	 * The list contents are of type {@link domijProject.Relationship}.
	 * It is bidirectional and its opposite is '{@link domijProject.Relationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Relations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Relations</em>' reference list.
	 * @see domijProject.DomijProjectPackage#getProcessElement_OutRelations()
	 * @see domijProject.Relationship#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Relationship> getOutRelations();

} // ProcessElement
