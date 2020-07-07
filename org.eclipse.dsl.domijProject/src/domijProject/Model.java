/**
 */
package domijProject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domijProject.Model#getProcessing <em>Processing</em>}</li>
 * </ul>
 * </p>
 *
 * @see domijProject.DomijProjectPackage#getModel()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mustHaveOneManufactureProcess'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot mustHaveOneManufactureProcess='\n\t\t\tself.processing->selectByType(Manufacture)->size() = 1'"
 * @generated
 */
public interface Model extends NamedConcept {
	/**
	 * Returns the value of the '<em><b>Processing</b></em>' containment reference list.
	 * The list contents are of type {@link domijProject.Manufacture}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing</em>' containment reference list.
	 * @see domijProject.DomijProjectPackage#getModel_Processing()
	 * @model containment="true"
	 * @generated
	 */
	EList<Manufacture> getProcessing();

} // Model
