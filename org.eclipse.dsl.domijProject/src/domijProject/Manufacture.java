/**
 */
package domijProject;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manufacture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domijProject.Manufacture#getHandlersOfManufacture <em>Handlers Of Manufacture</em>}</li>
 * </ul>
 * </p>
 *
 * @see domijProject.DomijProjectPackage#getManufacture()
 * @model
 * @generated
 */
public interface Manufacture extends domijProject.Process {

	/**
	 * Returns the value of the '<em><b>Handlers Of Manufacture</b></em>' containment reference list.
	 * The list contents are of type {@link domijProject.GlobalErrorHandler}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handlers Of Manufacture</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handlers Of Manufacture</em>' containment reference list.
	 * @see domijProject.DomijProjectPackage#getManufacture_HandlersOfManufacture()
	 * @model containment="true"
	 * @generated
	 */
	EList<GlobalErrorHandler> getHandlersOfManufacture();
} // Manufacture
