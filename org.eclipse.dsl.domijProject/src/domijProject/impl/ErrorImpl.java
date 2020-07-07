/**
 */
package domijProject.impl;

import domijProject.DomijProjectPackage;
import domijProject.GlobalErrorHandler;
import domijProject.ProcessStep;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domijProject.impl.ErrorImpl#getCause <em>Cause</em>}</li>
 *   <li>{@link domijProject.impl.ErrorImpl#getEffect <em>Effect</em>}</li>
 *   <li>{@link domijProject.impl.ErrorImpl#getErrorLink <em>Error Link</em>}</li>
 *   <li>{@link domijProject.impl.ErrorImpl#getGlobalerrorhandler <em>Globalerrorhandler</em>}</li>
 *   <li>{@link domijProject.impl.ErrorImpl#getSeverityOfError <em>Severity Of Error</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErrorImpl extends NamedConceptImpl implements domijProject.Error {
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
	 * The default value of the '{@link #getEffect() <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected static final String EFFECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEffect() <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected String effect = EFFECT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getErrorLink() <em>Error Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorLink()
	 * @generated
	 * @ordered
	 */
	protected ProcessStep errorLink;

	/**
	 * The cached value of the '{@link #getGlobalerrorhandler() <em>Globalerrorhandler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalerrorhandler()
	 * @generated
	 * @ordered
	 */
	protected GlobalErrorHandler globalerrorhandler;

	/**
	 * The default value of the '{@link #getSeverityOfError() <em>Severity Of Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverityOfError()
	 * @generated
	 * @ordered
	 */
	protected static final int SEVERITY_OF_ERROR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSeverityOfError() <em>Severity Of Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverityOfError()
	 * @generated
	 * @ordered
	 */
	protected int severityOfError = SEVERITY_OF_ERROR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomijProjectPackage.Literals.ERROR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomijProjectPackage.ERROR__CAUSE, oldCause, cause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEffect() {
		return effect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffect(String newEffect) {
		String oldEffect = effect;
		effect = newEffect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomijProjectPackage.ERROR__EFFECT, oldEffect, effect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessStep getErrorLink() {
		if (errorLink != null && errorLink.eIsProxy()) {
			InternalEObject oldErrorLink = (InternalEObject)errorLink;
			errorLink = (ProcessStep)eResolveProxy(oldErrorLink);
			if (errorLink != oldErrorLink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomijProjectPackage.ERROR__ERROR_LINK, oldErrorLink, errorLink));
			}
		}
		return errorLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessStep basicGetErrorLink() {
		return errorLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorLink(ProcessStep newErrorLink) {
		ProcessStep oldErrorLink = errorLink;
		errorLink = newErrorLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomijProjectPackage.ERROR__ERROR_LINK, oldErrorLink, errorLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalErrorHandler getGlobalerrorhandler() {
		if (globalerrorhandler != null && globalerrorhandler.eIsProxy()) {
			InternalEObject oldGlobalerrorhandler = (InternalEObject)globalerrorhandler;
			globalerrorhandler = (GlobalErrorHandler)eResolveProxy(oldGlobalerrorhandler);
			if (globalerrorhandler != oldGlobalerrorhandler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomijProjectPackage.ERROR__GLOBALERRORHANDLER, oldGlobalerrorhandler, globalerrorhandler));
			}
		}
		return globalerrorhandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalErrorHandler basicGetGlobalerrorhandler() {
		return globalerrorhandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobalerrorhandler(GlobalErrorHandler newGlobalerrorhandler, NotificationChain msgs) {
		GlobalErrorHandler oldGlobalerrorhandler = globalerrorhandler;
		globalerrorhandler = newGlobalerrorhandler;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomijProjectPackage.ERROR__GLOBALERRORHANDLER, oldGlobalerrorhandler, newGlobalerrorhandler);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalerrorhandler(GlobalErrorHandler newGlobalerrorhandler) {
		if (newGlobalerrorhandler != globalerrorhandler) {
			NotificationChain msgs = null;
			if (globalerrorhandler != null)
				msgs = ((InternalEObject)globalerrorhandler).eInverseRemove(this, DomijProjectPackage.GLOBAL_ERROR_HANDLER__ERROR, GlobalErrorHandler.class, msgs);
			if (newGlobalerrorhandler != null)
				msgs = ((InternalEObject)newGlobalerrorhandler).eInverseAdd(this, DomijProjectPackage.GLOBAL_ERROR_HANDLER__ERROR, GlobalErrorHandler.class, msgs);
			msgs = basicSetGlobalerrorhandler(newGlobalerrorhandler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomijProjectPackage.ERROR__GLOBALERRORHANDLER, newGlobalerrorhandler, newGlobalerrorhandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSeverityOfError() {
		return severityOfError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeverityOfError(int newSeverityOfError) {
		int oldSeverityOfError = severityOfError;
		severityOfError = newSeverityOfError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomijProjectPackage.ERROR__SEVERITY_OF_ERROR, oldSeverityOfError, severityOfError));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomijProjectPackage.ERROR__GLOBALERRORHANDLER:
				if (globalerrorhandler != null)
					msgs = ((InternalEObject)globalerrorhandler).eInverseRemove(this, DomijProjectPackage.GLOBAL_ERROR_HANDLER__ERROR, GlobalErrorHandler.class, msgs);
				return basicSetGlobalerrorhandler((GlobalErrorHandler)otherEnd, msgs);
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
			case DomijProjectPackage.ERROR__GLOBALERRORHANDLER:
				return basicSetGlobalerrorhandler(null, msgs);
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
			case DomijProjectPackage.ERROR__CAUSE:
				return getCause();
			case DomijProjectPackage.ERROR__EFFECT:
				return getEffect();
			case DomijProjectPackage.ERROR__ERROR_LINK:
				if (resolve) return getErrorLink();
				return basicGetErrorLink();
			case DomijProjectPackage.ERROR__GLOBALERRORHANDLER:
				if (resolve) return getGlobalerrorhandler();
				return basicGetGlobalerrorhandler();
			case DomijProjectPackage.ERROR__SEVERITY_OF_ERROR:
				return getSeverityOfError();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DomijProjectPackage.ERROR__CAUSE:
				setCause((String)newValue);
				return;
			case DomijProjectPackage.ERROR__EFFECT:
				setEffect((String)newValue);
				return;
			case DomijProjectPackage.ERROR__ERROR_LINK:
				setErrorLink((ProcessStep)newValue);
				return;
			case DomijProjectPackage.ERROR__GLOBALERRORHANDLER:
				setGlobalerrorhandler((GlobalErrorHandler)newValue);
				return;
			case DomijProjectPackage.ERROR__SEVERITY_OF_ERROR:
				setSeverityOfError((Integer)newValue);
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
			case DomijProjectPackage.ERROR__CAUSE:
				setCause(CAUSE_EDEFAULT);
				return;
			case DomijProjectPackage.ERROR__EFFECT:
				setEffect(EFFECT_EDEFAULT);
				return;
			case DomijProjectPackage.ERROR__ERROR_LINK:
				setErrorLink((ProcessStep)null);
				return;
			case DomijProjectPackage.ERROR__GLOBALERRORHANDLER:
				setGlobalerrorhandler((GlobalErrorHandler)null);
				return;
			case DomijProjectPackage.ERROR__SEVERITY_OF_ERROR:
				setSeverityOfError(SEVERITY_OF_ERROR_EDEFAULT);
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
			case DomijProjectPackage.ERROR__CAUSE:
				return CAUSE_EDEFAULT == null ? cause != null : !CAUSE_EDEFAULT.equals(cause);
			case DomijProjectPackage.ERROR__EFFECT:
				return EFFECT_EDEFAULT == null ? effect != null : !EFFECT_EDEFAULT.equals(effect);
			case DomijProjectPackage.ERROR__ERROR_LINK:
				return errorLink != null;
			case DomijProjectPackage.ERROR__GLOBALERRORHANDLER:
				return globalerrorhandler != null;
			case DomijProjectPackage.ERROR__SEVERITY_OF_ERROR:
				return severityOfError != SEVERITY_OF_ERROR_EDEFAULT;
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
		result.append(", effect: ");
		result.append(effect);
		result.append(", severityOfError: ");
		result.append(severityOfError);
		result.append(')');
		return result.toString();
	}

} //ErrorImpl
