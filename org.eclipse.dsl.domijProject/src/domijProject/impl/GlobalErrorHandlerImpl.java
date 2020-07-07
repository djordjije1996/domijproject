/**
 */
package domijProject.impl;

import domijProject.DomijProjectPackage;
import domijProject.GlobalErrorHandler;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Error Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domijProject.impl.GlobalErrorHandlerImpl#getError <em>Error</em>}</li>
 *   <li>{@link domijProject.impl.GlobalErrorHandlerImpl#getCause <em>Cause</em>}</li>
 *   <li>{@link domijProject.impl.GlobalErrorHandlerImpl#getHandlers <em>Handlers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlobalErrorHandlerImpl extends ProcessImpl implements GlobalErrorHandler {
	/**
	 * The cached value of the '{@link #getError() <em>Error</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getError()
	 * @generated
	 * @ordered
	 */
	protected domijProject.Error error;

	/**
	 * The default value of the '{@link #getCause() <em>Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCause()
	 * @generated
	 * @ordered
	 */
	protected static final String CAUSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCause() <em>Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCause()
	 * @generated
	 * @ordered
	 */
	protected String cause = CAUSE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHandlers() <em>Handlers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlers()
	 * @generated
	 * @ordered
	 */
	protected EList<GlobalErrorHandler> handlers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalErrorHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomijProjectPackage.Literals.GLOBAL_ERROR_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public domijProject.Error getError() {
		if (error != null && error.eIsProxy()) {
			InternalEObject oldError = (InternalEObject)error;
			error = (domijProject.Error)eResolveProxy(oldError);
			if (error != oldError) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomijProjectPackage.GLOBAL_ERROR_HANDLER__ERROR, oldError, error));
			}
		}
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public domijProject.Error basicGetError() {
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetError(domijProject.Error newError, NotificationChain msgs) {
		domijProject.Error oldError = error;
		error = newError;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomijProjectPackage.GLOBAL_ERROR_HANDLER__ERROR, oldError, newError);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setError(domijProject.Error newError) {
		if (newError != error) {
			NotificationChain msgs = null;
			if (error != null)
				msgs = ((InternalEObject)error).eInverseRemove(this, DomijProjectPackage.ERROR__GLOBALERRORHANDLER, domijProject.Error.class, msgs);
			if (newError != null)
				msgs = ((InternalEObject)newError).eInverseAdd(this, DomijProjectPackage.ERROR__GLOBALERRORHANDLER, domijProject.Error.class, msgs);
			msgs = basicSetError(newError, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomijProjectPackage.GLOBAL_ERROR_HANDLER__ERROR, newError, newError));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCause() {
		return cause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCause(String newCause) {
		String oldCause = cause;
		cause = newCause;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomijProjectPackage.GLOBAL_ERROR_HANDLER__CAUSE, oldCause, cause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalErrorHandler> getHandlers() {
		if (handlers == null) {
			handlers = new EObjectContainmentEList<GlobalErrorHandler>(GlobalErrorHandler.class, this, DomijProjectPackage.GLOBAL_ERROR_HANDLER__HANDLERS);
		}
		return handlers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomijProjectPackage.GLOBAL_ERROR_HANDLER__ERROR:
				if (error != null)
					msgs = ((InternalEObject)error).eInverseRemove(this, DomijProjectPackage.ERROR__GLOBALERRORHANDLER, domijProject.Error.class, msgs);
				return basicSetError((domijProject.Error)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomijProjectPackage.GLOBAL_ERROR_HANDLER__ERROR:
				return basicSetError(null, msgs);
			case DomijProjectPackage.GLOBAL_ERROR_HANDLER__HANDLERS:
				return ((InternalEList<?>)getHandlers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomijProjectPackage.GLOBAL_ERROR_HANDLER__ERROR:
				if (resolve) return getError();
				return basicGetError();
			case DomijProjectPackage.GLOBAL_ERROR_HANDLER__CAUSE:
				return getCause();
			case DomijProjectPackage.GLOBAL_ERROR_HANDLER__HANDLERS:
				return getHandlers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DomijProjectPackage.GLOBAL_ERROR_HANDLER__ERROR:
				setError((domijProject.Error)newValue);
				return;
			case DomijProjectPackage.GLOBAL_ERROR_HANDLER__CAUSE:
				setCause((String)newValue);
				return;
			case DomijProjectPackage.GLOBAL_ERROR_HANDLER__HANDLERS:
				getHandlers().clear();
				getHandlers().addAll((Collection<? extends GlobalErrorHandler>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DomijProjectPackage.GLOBAL_ERROR_HANDLER__ERROR:
				setError((domijProject.Error)null);
				return;
			case DomijProjectPackage.GLOBAL_ERROR_HANDLER__CAUSE:
				setCause(CAUSE_EDEFAULT);
				return;
			case DomijProjectPackage.GLOBAL_ERROR_HANDLER__HANDLERS:
				getHandlers().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DomijProjectPackage.GLOBAL_ERROR_HANDLER__ERROR:
				return error != null;
			case DomijProjectPackage.GLOBAL_ERROR_HANDLER__CAUSE:
				return CAUSE_EDEFAULT == null ? cause != null : !CAUSE_EDEFAULT.equals(cause);
			case DomijProjectPackage.GLOBAL_ERROR_HANDLER__HANDLERS:
				return handlers != null && !handlers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (cause: ");
		result.append(cause);
		result.append(')');
		return result.toString();
	}

} //GlobalErrorHandlerImpl
