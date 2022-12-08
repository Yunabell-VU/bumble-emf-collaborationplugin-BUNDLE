/**
 */
package nl.vu.cs.bumble.statemachine.impl;

import java.util.Collection;

import nl.vu.cs.bumble.statemachine.Input;
import nl.vu.cs.bumble.statemachine.NamedElement;
import nl.vu.cs.bumble.statemachine.Output;
import nl.vu.cs.bumble.statemachine.State;
import nl.vu.cs.bumble.statemachine.StateMachine;
import nl.vu.cs.bumble.statemachine.StatemachinePackage;
import nl.vu.cs.bumble.statemachine.Transition;

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
 * An implementation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.vu.cs.bumble.statemachine.impl.StateMachineImpl#getName <em>Name</em>}</li>
 *   <li>{@link nl.vu.cs.bumble.statemachine.impl.StateMachineImpl#getCurrentinput <em>Currentinput</em>}</li>
 *   <li>{@link nl.vu.cs.bumble.statemachine.impl.StateMachineImpl#getCurrentstate <em>Currentstate</em>}</li>
 *   <li>{@link nl.vu.cs.bumble.statemachine.impl.StateMachineImpl#getCurrentoutput <em>Currentoutput</em>}</li>
 *   <li>{@link nl.vu.cs.bumble.statemachine.impl.StateMachineImpl#getInput <em>Input</em>}</li>
 *   <li>{@link nl.vu.cs.bumble.statemachine.impl.StateMachineImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link nl.vu.cs.bumble.statemachine.impl.StateMachineImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link nl.vu.cs.bumble.statemachine.impl.StateMachineImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateMachineImpl extends BaseConceptImpl implements StateMachine {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCurrentinput() <em>Currentinput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentinput()
	 * @generated
	 * @ordered
	 */
	protected Input currentinput;

	/**
	 * The cached value of the '{@link #getCurrentstate() <em>Currentstate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentstate()
	 * @generated
	 * @ordered
	 */
	protected State currentstate;

	/**
	 * The cached value of the '{@link #getCurrentoutput() <em>Currentoutput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentoutput()
	 * @generated
	 * @ordered
	 */
	protected Output currentoutput;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<Input> input;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<Output> output;

	/**
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transition;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatemachinePackage.Literals.STATE_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE_MACHINE__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input getCurrentinput() {
		if (currentinput != null && currentinput.eIsProxy()) {
			InternalEObject oldCurrentinput = (InternalEObject) currentinput;
			currentinput = (Input) eResolveProxy(oldCurrentinput);
			if (currentinput != oldCurrentinput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StatemachinePackage.STATE_MACHINE__CURRENTINPUT, oldCurrentinput, currentinput));
			}
		}
		return currentinput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input basicGetCurrentinput() {
		return currentinput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentinput(Input newCurrentinput) {
		Input oldCurrentinput = currentinput;
		currentinput = newCurrentinput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE_MACHINE__CURRENTINPUT,
					oldCurrentinput, currentinput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getCurrentstate() {
		if (currentstate != null && currentstate.eIsProxy()) {
			InternalEObject oldCurrentstate = (InternalEObject) currentstate;
			currentstate = (State) eResolveProxy(oldCurrentstate);
			if (currentstate != oldCurrentstate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StatemachinePackage.STATE_MACHINE__CURRENTSTATE, oldCurrentstate, currentstate));
			}
		}
		return currentstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetCurrentstate() {
		return currentstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentstate(State newCurrentstate) {
		State oldCurrentstate = currentstate;
		currentstate = newCurrentstate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE_MACHINE__CURRENTSTATE,
					oldCurrentstate, currentstate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output getCurrentoutput() {
		if (currentoutput != null && currentoutput.eIsProxy()) {
			InternalEObject oldCurrentoutput = (InternalEObject) currentoutput;
			currentoutput = (Output) eResolveProxy(oldCurrentoutput);
			if (currentoutput != oldCurrentoutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StatemachinePackage.STATE_MACHINE__CURRENTOUTPUT, oldCurrentoutput, currentoutput));
			}
		}
		return currentoutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output basicGetCurrentoutput() {
		return currentoutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentoutput(Output newCurrentoutput) {
		Output oldCurrentoutput = currentoutput;
		currentoutput = newCurrentoutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE_MACHINE__CURRENTOUTPUT,
					oldCurrentoutput, currentoutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Input> getInput() {
		if (input == null) {
			input = new EObjectContainmentEList<Input>(Input.class, this, StatemachinePackage.STATE_MACHINE__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Output> getOutput() {
		if (output == null) {
			output = new EObjectContainmentEList<Output>(Output.class, this, StatemachinePackage.STATE_MACHINE__OUTPUT);
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransition() {
		if (transition == null) {
			transition = new EObjectContainmentEList<Transition>(Transition.class, this,
					StatemachinePackage.STATE_MACHINE__TRANSITION);
		}
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<State>(State.class, this, StatemachinePackage.STATE_MACHINE__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StatemachinePackage.STATE_MACHINE__INPUT:
			return ((InternalEList<?>) getInput()).basicRemove(otherEnd, msgs);
		case StatemachinePackage.STATE_MACHINE__OUTPUT:
			return ((InternalEList<?>) getOutput()).basicRemove(otherEnd, msgs);
		case StatemachinePackage.STATE_MACHINE__TRANSITION:
			return ((InternalEList<?>) getTransition()).basicRemove(otherEnd, msgs);
		case StatemachinePackage.STATE_MACHINE__STATES:
			return ((InternalEList<?>) getStates()).basicRemove(otherEnd, msgs);
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
		case StatemachinePackage.STATE_MACHINE__NAME:
			return getName();
		case StatemachinePackage.STATE_MACHINE__CURRENTINPUT:
			if (resolve)
				return getCurrentinput();
			return basicGetCurrentinput();
		case StatemachinePackage.STATE_MACHINE__CURRENTSTATE:
			if (resolve)
				return getCurrentstate();
			return basicGetCurrentstate();
		case StatemachinePackage.STATE_MACHINE__CURRENTOUTPUT:
			if (resolve)
				return getCurrentoutput();
			return basicGetCurrentoutput();
		case StatemachinePackage.STATE_MACHINE__INPUT:
			return getInput();
		case StatemachinePackage.STATE_MACHINE__OUTPUT:
			return getOutput();
		case StatemachinePackage.STATE_MACHINE__TRANSITION:
			return getTransition();
		case StatemachinePackage.STATE_MACHINE__STATES:
			return getStates();
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
		case StatemachinePackage.STATE_MACHINE__NAME:
			setName((String) newValue);
			return;
		case StatemachinePackage.STATE_MACHINE__CURRENTINPUT:
			setCurrentinput((Input) newValue);
			return;
		case StatemachinePackage.STATE_MACHINE__CURRENTSTATE:
			setCurrentstate((State) newValue);
			return;
		case StatemachinePackage.STATE_MACHINE__CURRENTOUTPUT:
			setCurrentoutput((Output) newValue);
			return;
		case StatemachinePackage.STATE_MACHINE__INPUT:
			getInput().clear();
			getInput().addAll((Collection<? extends Input>) newValue);
			return;
		case StatemachinePackage.STATE_MACHINE__OUTPUT:
			getOutput().clear();
			getOutput().addAll((Collection<? extends Output>) newValue);
			return;
		case StatemachinePackage.STATE_MACHINE__TRANSITION:
			getTransition().clear();
			getTransition().addAll((Collection<? extends Transition>) newValue);
			return;
		case StatemachinePackage.STATE_MACHINE__STATES:
			getStates().clear();
			getStates().addAll((Collection<? extends State>) newValue);
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
		case StatemachinePackage.STATE_MACHINE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case StatemachinePackage.STATE_MACHINE__CURRENTINPUT:
			setCurrentinput((Input) null);
			return;
		case StatemachinePackage.STATE_MACHINE__CURRENTSTATE:
			setCurrentstate((State) null);
			return;
		case StatemachinePackage.STATE_MACHINE__CURRENTOUTPUT:
			setCurrentoutput((Output) null);
			return;
		case StatemachinePackage.STATE_MACHINE__INPUT:
			getInput().clear();
			return;
		case StatemachinePackage.STATE_MACHINE__OUTPUT:
			getOutput().clear();
			return;
		case StatemachinePackage.STATE_MACHINE__TRANSITION:
			getTransition().clear();
			return;
		case StatemachinePackage.STATE_MACHINE__STATES:
			getStates().clear();
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
		case StatemachinePackage.STATE_MACHINE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case StatemachinePackage.STATE_MACHINE__CURRENTINPUT:
			return currentinput != null;
		case StatemachinePackage.STATE_MACHINE__CURRENTSTATE:
			return currentstate != null;
		case StatemachinePackage.STATE_MACHINE__CURRENTOUTPUT:
			return currentoutput != null;
		case StatemachinePackage.STATE_MACHINE__INPUT:
			return input != null && !input.isEmpty();
		case StatemachinePackage.STATE_MACHINE__OUTPUT:
			return output != null && !output.isEmpty();
		case StatemachinePackage.STATE_MACHINE__TRANSITION:
			return transition != null && !transition.isEmpty();
		case StatemachinePackage.STATE_MACHINE__STATES:
			return states != null && !states.isEmpty();
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
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
			case StatemachinePackage.STATE_MACHINE__NAME:
				return StatemachinePackage.NAMED_ELEMENT__NAME;
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
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
			case StatemachinePackage.NAMED_ELEMENT__NAME:
				return StatemachinePackage.STATE_MACHINE__NAME;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //StateMachineImpl
