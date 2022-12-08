/**
 */
package nl.vu.cs.bumble.statemachine.impl;

import java.util.Collection;

import nl.vu.cs.bumble.statemachine.BaseConcept;
import nl.vu.cs.bumble.statemachine.Element;
import nl.vu.cs.bumble.statemachine.Input;
import nl.vu.cs.bumble.statemachine.StatemachinePackage;

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
 * An implementation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.vu.cs.bumble.statemachine.impl.InputImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link nl.vu.cs.bumble.statemachine.impl.InputImpl#getBaseconcept <em>Baseconcept</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputImpl extends NamedElementImpl implements Input {
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
	 * The cached value of the '{@link #getBaseconcept() <em>Baseconcept</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseconcept()
	 * @generated
	 * @ordered
	 */
	protected EList<BaseConcept> baseconcept;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatemachinePackage.Literals.INPUT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.INPUT__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BaseConcept> getBaseconcept() {
		if (baseconcept == null) {
			baseconcept = new EObjectContainmentEList<BaseConcept>(BaseConcept.class, this,
					StatemachinePackage.INPUT__BASECONCEPT);
		}
		return baseconcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StatemachinePackage.INPUT__BASECONCEPT:
			return ((InternalEList<?>) getBaseconcept()).basicRemove(otherEnd, msgs);
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
		case StatemachinePackage.INPUT__DESCRIPTION:
			return getDescription();
		case StatemachinePackage.INPUT__BASECONCEPT:
			return getBaseconcept();
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
		case StatemachinePackage.INPUT__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case StatemachinePackage.INPUT__BASECONCEPT:
			getBaseconcept().clear();
			getBaseconcept().addAll((Collection<? extends BaseConcept>) newValue);
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
		case StatemachinePackage.INPUT__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case StatemachinePackage.INPUT__BASECONCEPT:
			getBaseconcept().clear();
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
		case StatemachinePackage.INPUT__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case StatemachinePackage.INPUT__BASECONCEPT:
			return baseconcept != null && !baseconcept.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == BaseConcept.class) {
			switch (derivedFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == Element.class) {
			switch (derivedFeatureID) {
			case StatemachinePackage.INPUT__DESCRIPTION:
				return StatemachinePackage.ELEMENT__DESCRIPTION;
			case StatemachinePackage.INPUT__BASECONCEPT:
				return StatemachinePackage.ELEMENT__BASECONCEPT;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == BaseConcept.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == Element.class) {
			switch (baseFeatureID) {
			case StatemachinePackage.ELEMENT__DESCRIPTION:
				return StatemachinePackage.INPUT__DESCRIPTION;
			case StatemachinePackage.ELEMENT__BASECONCEPT:
				return StatemachinePackage.INPUT__BASECONCEPT;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //InputImpl
