/**
 */
package nl.vu.cs.bumble.statemachine.impl;

import java.util.Collection;

import nl.vu.cs.bumble.statemachine.BaseConcept;
import nl.vu.cs.bumble.statemachine.Element;
import nl.vu.cs.bumble.statemachine.Input;
import nl.vu.cs.bumble.statemachine.Output;
import nl.vu.cs.bumble.statemachine.State;
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
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.vu.cs.bumble.statemachine.impl.StateImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link nl.vu.cs.bumble.statemachine.impl.StateImpl#getBaseconcept <em>Baseconcept</em>}</li>
 *   <li>{@link nl.vu.cs.bumble.statemachine.impl.StateImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link nl.vu.cs.bumble.statemachine.impl.StateImpl#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends NamedElementImpl implements State {
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
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected Output output;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected Input input;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatemachinePackage.Literals.STATE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__DESCRIPTION,
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
					StatemachinePackage.STATE__BASECONCEPT);
		}
		return baseconcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output getOutput() {
		if (output != null && output.eIsProxy()) {
			InternalEObject oldOutput = (InternalEObject) output;
			output = (Output) eResolveProxy(oldOutput);
			if (output != oldOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.STATE__OUTPUT,
							oldOutput, output));
			}
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output basicGetOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(Output newOutput) {
		Output oldOutput = output;
		output = newOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__OUTPUT, oldOutput,
					output));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input getInput() {
		if (input != null && input.eIsProxy()) {
			InternalEObject oldInput = (InternalEObject) input;
			input = (Input) eResolveProxy(oldInput);
			if (input != oldInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.STATE__INPUT,
							oldInput, input));
			}
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input basicGetInput() {
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput(Input newInput) {
		Input oldInput = input;
		input = newInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__INPUT, oldInput, input));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StatemachinePackage.STATE__BASECONCEPT:
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
		case StatemachinePackage.STATE__DESCRIPTION:
			return getDescription();
		case StatemachinePackage.STATE__BASECONCEPT:
			return getBaseconcept();
		case StatemachinePackage.STATE__OUTPUT:
			if (resolve)
				return getOutput();
			return basicGetOutput();
		case StatemachinePackage.STATE__INPUT:
			if (resolve)
				return getInput();
			return basicGetInput();
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
		case StatemachinePackage.STATE__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case StatemachinePackage.STATE__BASECONCEPT:
			getBaseconcept().clear();
			getBaseconcept().addAll((Collection<? extends BaseConcept>) newValue);
			return;
		case StatemachinePackage.STATE__OUTPUT:
			setOutput((Output) newValue);
			return;
		case StatemachinePackage.STATE__INPUT:
			setInput((Input) newValue);
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
		case StatemachinePackage.STATE__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case StatemachinePackage.STATE__BASECONCEPT:
			getBaseconcept().clear();
			return;
		case StatemachinePackage.STATE__OUTPUT:
			setOutput((Output) null);
			return;
		case StatemachinePackage.STATE__INPUT:
			setInput((Input) null);
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
		case StatemachinePackage.STATE__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case StatemachinePackage.STATE__BASECONCEPT:
			return baseconcept != null && !baseconcept.isEmpty();
		case StatemachinePackage.STATE__OUTPUT:
			return output != null;
		case StatemachinePackage.STATE__INPUT:
			return input != null;
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
			case StatemachinePackage.STATE__DESCRIPTION:
				return StatemachinePackage.ELEMENT__DESCRIPTION;
			case StatemachinePackage.STATE__BASECONCEPT:
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
				return StatemachinePackage.STATE__DESCRIPTION;
			case StatemachinePackage.ELEMENT__BASECONCEPT:
				return StatemachinePackage.STATE__BASECONCEPT;
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

} //StateImpl
