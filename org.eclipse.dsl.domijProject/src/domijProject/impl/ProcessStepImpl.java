/**
 */
package domijProject.impl;

import domijProject.DomijProjectPackage;
import domijProject.ENotation;
import domijProject.EStepType;
import domijProject.Inspection;
import domijProject.ProcessStep;
import domijProject.Product;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domijProject.impl.ProcessStepImpl#getType <em>Type</em>}</li>
 *   <li>{@link domijProject.impl.ProcessStepImpl#getInProducts <em>In Products</em>}</li>
 *   <li>{@link domijProject.impl.ProcessStepImpl#getOutProducts <em>Out Products</em>}</li>
 *   <li>{@link domijProject.impl.ProcessStepImpl#getMonitoring <em>Monitoring</em>}</li>
 *   <li>{@link domijProject.impl.ProcessStepImpl#getErrors <em>Errors</em>}</li>
 *   <li>{@link domijProject.impl.ProcessStepImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link domijProject.impl.ProcessStepImpl#getCapability <em>Capability</em>}</li>
 *   <li>{@link domijProject.impl.ProcessStepImpl#getNotation <em>Notation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessStepImpl extends ProcessElementImpl implements ProcessStep {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final EStepType TYPE_EDEFAULT = EStepType.REGULAR;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EStepType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInProducts() <em>In Products</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<Product> inProducts;

	/**
	 * The cached value of the '{@link #getOutProducts() <em>Out Products</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<Product> outProducts;

	/**
	 * The cached value of the '{@link #getMonitoring() <em>Monitoring</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoring()
	 * @generated
	 * @ordered
	 */
	protected EList<Inspection> monitoring;

	/**
	 * The cached value of the '{@link #getErrors() <em>Errors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrors()
	 * @generated
	 * @ordered
	 */
	protected EList<domijProject.Error> errors;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapability() <em>Capability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapability()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCapability() <em>Capability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapability()
	 * @generated
	 * @ordered
	 */
	protected String capability = CAPABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotation() <em>Notation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotation()
	 * @generated
	 * @ordered
	 */
	protected static final ENotation NOTATION_EDEFAULT = ENotation.NONE;

	/**
	 * The cached value of the '{@link #getNotation() <em>Notation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotation()
	 * @generated
	 * @ordered
	 */
	protected ENotation notation = NOTATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomijProjectPackage.Literals.PROCESS_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStepType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(EStepType newType) {
		EStepType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomijProjectPackage.PROCESS_STEP__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Product> getInProducts() {
		if (inProducts == null) {
			inProducts = new EObjectContainmentEList<Product>(Product.class, this, DomijProjectPackage.PROCESS_STEP__IN_PRODUCTS);
		}
		return inProducts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Product> getOutProducts() {
		if (outProducts == null) {
			outProducts = new EObjectContainmentEList<Product>(Product.class, this, DomijProjectPackage.PROCESS_STEP__OUT_PRODUCTS);
		}
		return outProducts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Inspection> getMonitoring() {
		if (monitoring == null) {
			monitoring = new EObjectResolvingEList<Inspection>(Inspection.class, this, DomijProjectPackage.PROCESS_STEP__MONITORING);
		}
		return monitoring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<domijProject.Error> getErrors() {
		if (errors == null) {
			errors = new EObjectContainmentEList<domijProject.Error>(domijProject.Error.class, this, DomijProjectPackage.PROCESS_STEP__ERRORS);
		}
		return errors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomijProjectPackage.PROCESS_STEP__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCapability() {
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapability(String newCapability) {
		String oldCapability = capability;
		capability = newCapability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomijProjectPackage.PROCESS_STEP__CAPABILITY, oldCapability, capability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENotation getNotation() {
		return notation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotation(ENotation newNotation) {
		ENotation oldNotation = notation;
		notation = newNotation == null ? NOTATION_EDEFAULT : newNotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomijProjectPackage.PROCESS_STEP__NOTATION, oldNotation, notation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomijProjectPackage.PROCESS_STEP__IN_PRODUCTS:
				return ((InternalEList<?>)getInProducts()).basicRemove(otherEnd, msgs);
			case DomijProjectPackage.PROCESS_STEP__OUT_PRODUCTS:
				return ((InternalEList<?>)getOutProducts()).basicRemove(otherEnd, msgs);
			case DomijProjectPackage.PROCESS_STEP__ERRORS:
				return ((InternalEList<?>)getErrors()).basicRemove(otherEnd, msgs);
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
			case DomijProjectPackage.PROCESS_STEP__TYPE:
				return getType();
			case DomijProjectPackage.PROCESS_STEP__IN_PRODUCTS:
				return getInProducts();
			case DomijProjectPackage.PROCESS_STEP__OUT_PRODUCTS:
				return getOutProducts();
			case DomijProjectPackage.PROCESS_STEP__MONITORING:
				return getMonitoring();
			case DomijProjectPackage.PROCESS_STEP__ERRORS:
				return getErrors();
			case DomijProjectPackage.PROCESS_STEP__DESCRIPTION:
				return getDescription();
			case DomijProjectPackage.PROCESS_STEP__CAPABILITY:
				return getCapability();
			case DomijProjectPackage.PROCESS_STEP__NOTATION:
				return getNotation();
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
			case DomijProjectPackage.PROCESS_STEP__TYPE:
				setType((EStepType)newValue);
				return;
			case DomijProjectPackage.PROCESS_STEP__IN_PRODUCTS:
				getInProducts().clear();
				getInProducts().addAll((Collection<? extends Product>)newValue);
				return;
			case DomijProjectPackage.PROCESS_STEP__OUT_PRODUCTS:
				getOutProducts().clear();
				getOutProducts().addAll((Collection<? extends Product>)newValue);
				return;
			case DomijProjectPackage.PROCESS_STEP__MONITORING:
				getMonitoring().clear();
				getMonitoring().addAll((Collection<? extends Inspection>)newValue);
				return;
			case DomijProjectPackage.PROCESS_STEP__ERRORS:
				getErrors().clear();
				getErrors().addAll((Collection<? extends domijProject.Error>)newValue);
				return;
			case DomijProjectPackage.PROCESS_STEP__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case DomijProjectPackage.PROCESS_STEP__CAPABILITY:
				setCapability((String)newValue);
				return;
			case DomijProjectPackage.PROCESS_STEP__NOTATION:
				setNotation((ENotation)newValue);
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
			case DomijProjectPackage.PROCESS_STEP__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DomijProjectPackage.PROCESS_STEP__IN_PRODUCTS:
				getInProducts().clear();
				return;
			case DomijProjectPackage.PROCESS_STEP__OUT_PRODUCTS:
				getOutProducts().clear();
				return;
			case DomijProjectPackage.PROCESS_STEP__MONITORING:
				getMonitoring().clear();
				return;
			case DomijProjectPackage.PROCESS_STEP__ERRORS:
				getErrors().clear();
				return;
			case DomijProjectPackage.PROCESS_STEP__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case DomijProjectPackage.PROCESS_STEP__CAPABILITY:
				setCapability(CAPABILITY_EDEFAULT);
				return;
			case DomijProjectPackage.PROCESS_STEP__NOTATION:
				setNotation(NOTATION_EDEFAULT);
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
			case DomijProjectPackage.PROCESS_STEP__TYPE:
				return type != TYPE_EDEFAULT;
			case DomijProjectPackage.PROCESS_STEP__IN_PRODUCTS:
				return inProducts != null && !inProducts.isEmpty();
			case DomijProjectPackage.PROCESS_STEP__OUT_PRODUCTS:
				return outProducts != null && !outProducts.isEmpty();
			case DomijProjectPackage.PROCESS_STEP__MONITORING:
				return monitoring != null && !monitoring.isEmpty();
			case DomijProjectPackage.PROCESS_STEP__ERRORS:
				return errors != null && !errors.isEmpty();
			case DomijProjectPackage.PROCESS_STEP__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case DomijProjectPackage.PROCESS_STEP__CAPABILITY:
				return CAPABILITY_EDEFAULT == null ? capability != null : !CAPABILITY_EDEFAULT.equals(capability);
			case DomijProjectPackage.PROCESS_STEP__NOTATION:
				return notation != NOTATION_EDEFAULT;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", description: ");
		result.append(description);
		result.append(", capability: ");
		result.append(capability);
		result.append(", notation: ");
		result.append(notation);
		result.append(')');
		return result.toString();
	}

} //ProcessStepImpl
