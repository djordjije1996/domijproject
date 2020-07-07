/**
 */
package domijProject;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Error Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domijProject.GlobalErrorHandler#getError <em>Error</em>}</li>
 *   <li>{@link domijProject.GlobalErrorHandler#getCause <em>Cause</em>}</li>
 *   <li>{@link domijProject.GlobalErrorHandler#getHandlers <em>Handlers</em>}</li>
 * </ul>
 * </p>
 *
 * @see domijProject.DomijProjectPackage#getGlobalErrorHandler()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='handlerCantBeReferencedByContainingError'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot handlerCantBeReferencedByContainingError='\n\t\t\tself.elements->selectByType(ProcessStep).errors->forAll(e:Error| e.globalerrorhandler <> self)'"
 * @generated
 */
public interface GlobalErrorHandler extends domijProject.Process {
	/**
	 * Returns the value of the '<em><b>Error</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link domijProject.Error#getGlobalerrorhandler <em>Globalerrorhandler</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error</em>' reference.
	 * @see #setError(domijProject.Error)
	 * @see domijProject.DomijProjectPackage#getGlobalErrorHandler_Error()
	 * @see domijProject.Error#getGlobalerrorhandler
	 * @model opposite="globalerrorhandler" required="true"
	 * @generated
	 */
	domijProject.Error getError();

	/**
	 * Sets the value of the '{@link domijProject.GlobalErrorHandler#getError <em>Error</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error</em>' reference.
	 * @see #getError()
	 * @generated
	 */
	void setError(domijProject.Error value);

	/**
	 * Returns the value of the '<em><b>Cause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cause</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cause</em>' attribute.
	 * @see #setCause(String)
	 * @see domijProject.DomijProjectPackage#getGlobalErrorHandler_Cause()
	 * @model
	 * @generated
	 */
	String getCause();

	/**
	 * Sets the value of the '{@link domijProject.GlobalErrorHandler#getCause <em>Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cause</em>' attribute.
	 * @see #getCause()
	 * @generated
	 */
	void setCause(String value);

	/**
	 * Returns the value of the '<em><b>Handlers</b></em>' containment reference list.
	 * The list contents are of type {@link domijProject.GlobalErrorHandler}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handlers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handlers</em>' containment reference list.
	 * @see domijProject.DomijProjectPackage#getGlobalErrorHandler_Handlers()
	 * @model containment="true"
	 * @generated
	 */
	EList<GlobalErrorHandler> getHandlers();

} // GlobalErrorHandler
