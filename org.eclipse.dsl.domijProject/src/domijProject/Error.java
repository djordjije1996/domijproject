/**
 */
package domijProject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domijProject.Error#getCause <em>Cause</em>}</li>
 *   <li>{@link domijProject.Error#getEffect <em>Effect</em>}</li>
 *   <li>{@link domijProject.Error#getErrorLink <em>Error Link</em>}</li>
 *   <li>{@link domijProject.Error#getGlobalerrorhandler <em>Globalerrorhandler</em>}</li>
 *   <li>{@link domijProject.Error#getSeverityOfError <em>Severity Of Error</em>}</li>
 * </ul>
 * </p>
 *
 * @see domijProject.DomijProjectPackage#getError()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='errorExclusivelyReferencesHandlerOrStep severityOneToTen'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot errorExclusivelyReferencesHandlerOrStep='\n\t\t\tself.errorLink->isEmpty() xor self.globalerrorhandler->isEmpty()' severityOneToTen='\n\t\t\tself.severityOfError > 0 and self.severityOfError < 11'"
 * @generated
 */
public interface Error extends NamedConcept {
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
	 * @see domijProject.DomijProjectPackage#getError_Cause()
	 * @model
	 * @generated
	 */
	String getCause();

	/**
	 * Sets the value of the '{@link domijProject.Error#getCause <em>Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cause</em>' attribute.
	 * @see #getCause()
	 * @generated
	 */
	void setCause(String value);

	/**
	 * Returns the value of the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect</em>' attribute.
	 * @see #setEffect(String)
	 * @see domijProject.DomijProjectPackage#getError_Effect()
	 * @model
	 * @generated
	 */
	String getEffect();

	/**
	 * Sets the value of the '{@link domijProject.Error#getEffect <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' attribute.
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(String value);

	/**
	 * Returns the value of the '<em><b>Error Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Link</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Link</em>' reference.
	 * @see #setErrorLink(ProcessStep)
	 * @see domijProject.DomijProjectPackage#getError_ErrorLink()
	 * @model
	 * @generated
	 */
	ProcessStep getErrorLink();

	/**
	 * Sets the value of the '{@link domijProject.Error#getErrorLink <em>Error Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Link</em>' reference.
	 * @see #getErrorLink()
	 * @generated
	 */
	void setErrorLink(ProcessStep value);

	/**
	 * Returns the value of the '<em><b>Globalerrorhandler</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link domijProject.GlobalErrorHandler#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Globalerrorhandler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Globalerrorhandler</em>' reference.
	 * @see #setGlobalerrorhandler(GlobalErrorHandler)
	 * @see domijProject.DomijProjectPackage#getError_Globalerrorhandler()
	 * @see domijProject.GlobalErrorHandler#getError
	 * @model opposite="error"
	 * @generated
	 */
	GlobalErrorHandler getGlobalerrorhandler();

	/**
	 * Sets the value of the '{@link domijProject.Error#getGlobalerrorhandler <em>Globalerrorhandler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Globalerrorhandler</em>' reference.
	 * @see #getGlobalerrorhandler()
	 * @generated
	 */
	void setGlobalerrorhandler(GlobalErrorHandler value);

	/**
	 * Returns the value of the '<em><b>Severity Of Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity Of Error</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity Of Error</em>' attribute.
	 * @see #setSeverityOfError(int)
	 * @see domijProject.DomijProjectPackage#getError_SeverityOfError()
	 * @model
	 * @generated
	 */
	int getSeverityOfError();

	/**
	 * Sets the value of the '{@link domijProject.Error#getSeverityOfError <em>Severity Of Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity Of Error</em>' attribute.
	 * @see #getSeverityOfError()
	 * @generated
	 */
	void setSeverityOfError(int value);

} // Error
