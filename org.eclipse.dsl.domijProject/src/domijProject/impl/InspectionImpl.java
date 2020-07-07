/**
 */
package domijProject.impl;

import domijProject.DomijProjectPackage;
import domijProject.EInspectionType;
import domijProject.Inspection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inspection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domijProject.impl.InspectionImpl#getType <em>Type</em>}</li>
 *   <li>{@link domijProject.impl.InspectionImpl#getAcceptanceCriteria <em>Acceptance Criteria</em>}</li>
 *   <li>{@link domijProject.impl.InspectionImpl#getCompletionCriteria <em>Completion Criteria</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InspectionImpl extends NamedConceptImpl implements Inspection {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final EInspectionType TYPE_EDEFAULT = EInspectionType.PRESTEP;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EInspectionType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAcceptanceCriteria() <em>Acceptance Criteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptanceCriteria()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCEPTANCE_CRITERIA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAcceptanceCriteria() <em>Acceptance Criteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptanceCriteria()
	 * @generated
	 * @ordered
	 */
	protected String acceptanceCriteria = ACCEPTANCE_CRITERIA_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompletionCriteria() <em>Completion Criteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionCriteria()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPLETION_CRITERIA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompletionCriteria() <em>Completion Criteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionCriteria()
	 * @generated
	 * @ordered
	 */
	protected String completionCriteria = COMPLETION_CRITERIA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InspectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomijProjectPackage.Literals.INSPECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EInspectionType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(EInspectionType newType) {
		EInspectionType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomijProjectPackage.INSPECTION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAcceptanceCriteria() {
		return acceptanceCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcceptanceCriteria(String newAcceptanceCriteria) {
		String oldAcceptanceCriteria = acceptanceCriteria;
		acceptanceCriteria = newAcceptanceCriteria;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomijProjectPackage.INSPECTION__ACCEPTANCE_CRITERIA, oldAcceptanceCriteria, acceptanceCriteria));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompletionCriteria() {
		return completionCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompletionCriteria(String newCompletionCriteria) {
		String oldCompletionCriteria = completionCriteria;
		completionCriteria = newCompletionCriteria;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomijProjectPackage.INSPECTION__COMPLETION_CRITERIA, oldCompletionCriteria, completionCriteria));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomijProjectPackage.INSPECTION__TYPE:
				return getType();
			case DomijProjectPackage.INSPECTION__ACCEPTANCE_CRITERIA:
				return getAcceptanceCriteria();
			case DomijProjectPackage.INSPECTION__COMPLETION_CRITERIA:
				return getCompletionCriteria();
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
			case DomijProjectPackage.INSPECTION__TYPE:
				setType((EInspectionType)newValue);
				return;
			case DomijProjectPackage.INSPECTION__ACCEPTANCE_CRITERIA:
				setAcceptanceCriteria((String)newValue);
				return;
			case DomijProjectPackage.INSPECTION__COMPLETION_CRITERIA:
				setCompletionCriteria((String)newValue);
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
			case DomijProjectPackage.INSPECTION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DomijProjectPackage.INSPECTION__ACCEPTANCE_CRITERIA:
				setAcceptanceCriteria(ACCEPTANCE_CRITERIA_EDEFAULT);
				return;
			case DomijProjectPackage.INSPECTION__COMPLETION_CRITERIA:
				setCompletionCriteria(COMPLETION_CRITERIA_EDEFAULT);
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
			case DomijProjectPackage.INSPECTION__TYPE:
				return type != TYPE_EDEFAULT;
			case DomijProjectPackage.INSPECTION__ACCEPTANCE_CRITERIA:
				return ACCEPTANCE_CRITERIA_EDEFAULT == null ? acceptanceCriteria != null : !ACCEPTANCE_CRITERIA_EDEFAULT.equals(acceptanceCriteria);
			case DomijProjectPackage.INSPECTION__COMPLETION_CRITERIA:
				return COMPLETION_CRITERIA_EDEFAULT == null ? completionCriteria != null : !COMPLETION_CRITERIA_EDEFAULT.equals(completionCriteria);
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
		result.append(", acceptanceCriteria: ");
		result.append(acceptanceCriteria);
		result.append(", completionCriteria: ");
		result.append(completionCriteria);
		result.append(')');
		return result.toString();
	}

} //InspectionImpl
