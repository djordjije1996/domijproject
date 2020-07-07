/**
 */
package domijProject.impl;

import domijProject.DomijProjectPackage;
import domijProject.GlobalErrorHandler;
import domijProject.Manufacture;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manufacture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domijProject.impl.ManufactureImpl#getHandlersOfManufacture <em>Handlers Of Manufacture</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ManufactureImpl extends ProcessImpl implements Manufacture {
	/**
	 * The cached value of the '{@link #getHandlersOfManufacture() <em>Handlers Of Manufacture</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlersOfManufacture()
	 * @generated
	 * @ordered
	 */
	protected EList<GlobalErrorHandler> handlersOfManufacture;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManufactureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomijProjectPackage.Literals.MANUFACTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalErrorHandler> getHandlersOfManufacture() {
		if (handlersOfManufacture == null) {
			handlersOfManufacture = new EObjectContainmentEList<GlobalErrorHandler>(GlobalErrorHandler.class, this, DomijProjectPackage.MANUFACTURE__HANDLERS_OF_MANUFACTURE);
		}
		return handlersOfManufacture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomijProjectPackage.MANUFACTURE__HANDLERS_OF_MANUFACTURE:
				return ((InternalEList<?>)getHandlersOfManufacture()).basicRemove(otherEnd, msgs);
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
			case DomijProjectPackage.MANUFACTURE__HANDLERS_OF_MANUFACTURE:
				return getHandlersOfManufacture();
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
			case DomijProjectPackage.MANUFACTURE__HANDLERS_OF_MANUFACTURE:
				getHandlersOfManufacture().clear();
				getHandlersOfManufacture().addAll((Collection<? extends GlobalErrorHandler>)newValue);
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
			case DomijProjectPackage.MANUFACTURE__HANDLERS_OF_MANUFACTURE:
				getHandlersOfManufacture().clear();
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
			case DomijProjectPackage.MANUFACTURE__HANDLERS_OF_MANUFACTURE:
				return handlersOfManufacture != null && !handlersOfManufacture.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ManufactureImpl
