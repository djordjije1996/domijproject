/**
 */
package domijProject.impl;

import domijProject.DomijProjectPackage;
import domijProject.ProcessElement;
import domijProject.Relationship;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link domijProject.impl.ProcessElementImpl#getInRelations <em>In Relations</em>}</li>
 *   <li>{@link domijProject.impl.ProcessElementImpl#getOutRelations <em>Out Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ProcessElementImpl extends NamedConceptImpl implements ProcessElement {
	/**
	 * The cached value of the '{@link #getInRelations() <em>In Relations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> inRelations;

	/**
	 * The cached value of the '{@link #getOutRelations() <em>Out Relations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> outRelations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomijProjectPackage.Literals.PROCESS_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationship> getInRelations() {
		if (inRelations == null) {
			inRelations = new EObjectWithInverseResolvingEList<Relationship>(Relationship.class, this, DomijProjectPackage.PROCESS_ELEMENT__IN_RELATIONS, DomijProjectPackage.RELATIONSHIP__TARGET);
		}
		return inRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationship> getOutRelations() {
		if (outRelations == null) {
			outRelations = new EObjectWithInverseResolvingEList<Relationship>(Relationship.class, this, DomijProjectPackage.PROCESS_ELEMENT__OUT_RELATIONS, DomijProjectPackage.RELATIONSHIP__SOURCE);
		}
		return outRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomijProjectPackage.PROCESS_ELEMENT__IN_RELATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInRelations()).basicAdd(otherEnd, msgs);
			case DomijProjectPackage.PROCESS_ELEMENT__OUT_RELATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutRelations()).basicAdd(otherEnd, msgs);
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
			case DomijProjectPackage.PROCESS_ELEMENT__IN_RELATIONS:
				return ((InternalEList<?>)getInRelations()).basicRemove(otherEnd, msgs);
			case DomijProjectPackage.PROCESS_ELEMENT__OUT_RELATIONS:
				return ((InternalEList<?>)getOutRelations()).basicRemove(otherEnd, msgs);
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
			case DomijProjectPackage.PROCESS_ELEMENT__IN_RELATIONS:
				return getInRelations();
			case DomijProjectPackage.PROCESS_ELEMENT__OUT_RELATIONS:
				return getOutRelations();
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
			case DomijProjectPackage.PROCESS_ELEMENT__IN_RELATIONS:
				getInRelations().clear();
				getInRelations().addAll((Collection<? extends Relationship>)newValue);
				return;
			case DomijProjectPackage.PROCESS_ELEMENT__OUT_RELATIONS:
				getOutRelations().clear();
				getOutRelations().addAll((Collection<? extends Relationship>)newValue);
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
			case DomijProjectPackage.PROCESS_ELEMENT__IN_RELATIONS:
				getInRelations().clear();
				return;
			case DomijProjectPackage.PROCESS_ELEMENT__OUT_RELATIONS:
				getOutRelations().clear();
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
			case DomijProjectPackage.PROCESS_ELEMENT__IN_RELATIONS:
				return inRelations != null && !inRelations.isEmpty();
			case DomijProjectPackage.PROCESS_ELEMENT__OUT_RELATIONS:
				return outRelations != null && !outRelations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProcessElementImpl
