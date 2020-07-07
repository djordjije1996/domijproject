/**
 */
package domijProject.impl;

import domijProject.DomijProjectPackage;
import domijProject.Inspection;
import domijProject.ProcessElement;
import domijProject.Relationship;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domijProject.impl.ProcessImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link domijProject.impl.ProcessImpl#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link domijProject.impl.ProcessImpl#getInspections <em>Inspections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ProcessImpl extends NamedConceptImpl implements domijProject.Process {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessElement> elements;

	/**
	 * The cached value of the '{@link #getRelationships() <em>Relationships</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationships()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> relationships;

	/**
	 * The cached value of the '{@link #getInspections() <em>Inspections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInspections()
	 * @generated
	 * @ordered
	 */
	protected EList<Inspection> inspections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomijProjectPackage.Literals.PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<ProcessElement>(ProcessElement.class, this, DomijProjectPackage.PROCESS__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationship> getRelationships() {
		if (relationships == null) {
			relationships = new EObjectContainmentEList<Relationship>(Relationship.class, this, DomijProjectPackage.PROCESS__RELATIONSHIPS);
		}
		return relationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Inspection> getInspections() {
		if (inspections == null) {
			inspections = new EObjectContainmentEList<Inspection>(Inspection.class, this, DomijProjectPackage.PROCESS__INSPECTIONS);
		}
		return inspections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomijProjectPackage.PROCESS__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case DomijProjectPackage.PROCESS__RELATIONSHIPS:
				return ((InternalEList<?>)getRelationships()).basicRemove(otherEnd, msgs);
			case DomijProjectPackage.PROCESS__INSPECTIONS:
				return ((InternalEList<?>)getInspections()).basicRemove(otherEnd, msgs);
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
			case DomijProjectPackage.PROCESS__ELEMENTS:
				return getElements();
			case DomijProjectPackage.PROCESS__RELATIONSHIPS:
				return getRelationships();
			case DomijProjectPackage.PROCESS__INSPECTIONS:
				return getInspections();
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
			case DomijProjectPackage.PROCESS__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends ProcessElement>)newValue);
				return;
			case DomijProjectPackage.PROCESS__RELATIONSHIPS:
				getRelationships().clear();
				getRelationships().addAll((Collection<? extends Relationship>)newValue);
				return;
			case DomijProjectPackage.PROCESS__INSPECTIONS:
				getInspections().clear();
				getInspections().addAll((Collection<? extends Inspection>)newValue);
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
			case DomijProjectPackage.PROCESS__ELEMENTS:
				getElements().clear();
				return;
			case DomijProjectPackage.PROCESS__RELATIONSHIPS:
				getRelationships().clear();
				return;
			case DomijProjectPackage.PROCESS__INSPECTIONS:
				getInspections().clear();
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
			case DomijProjectPackage.PROCESS__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case DomijProjectPackage.PROCESS__RELATIONSHIPS:
				return relationships != null && !relationships.isEmpty();
			case DomijProjectPackage.PROCESS__INSPECTIONS:
				return inspections != null && !inspections.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProcessImpl
