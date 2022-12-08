/**
 */
package TrafficStateMachine.trafficStateMachine.trafficStateMachine.impl;

import TrafficStateMachine.trafficStateMachine.trafficStateMachine.State;
import TrafficStateMachine.trafficStateMachine.trafficStateMachine.StateMachine;
import TrafficStateMachine.trafficStateMachine.trafficStateMachine.TrafficStateMachinePackage;
import TrafficStateMachine.trafficStateMachine.trafficStateMachine.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
 *   <li>{@link TrafficStateMachine.trafficStateMachine.trafficStateMachine.impl.StateMachineImpl#getHas <em>Has</em>}</li>
 *   <li>{@link TrafficStateMachine.trafficStateMachine.trafficStateMachine.impl.StateMachineImpl#getName <em>Name</em>}</li>
 *   <li>{@link TrafficStateMachine.trafficStateMachine.trafficStateMachine.impl.StateMachineImpl#getTransition <em>Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateMachineImpl extends MinimalEObjectImpl.Container implements StateMachine {
	/**
	 * The cached value of the '{@link #getHas() <em>Has</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas()
	 * @generated
	 * @ordered
	 */
	protected EList<State> has;

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
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transition;

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
		return TrafficStateMachinePackage.Literals.STATE_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getHas() {
		if (has == null) {
			has = new EObjectContainmentEList<State>(State.class, this, TrafficStateMachinePackage.STATE_MACHINE__HAS);
		}
		return has;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TrafficStateMachinePackage.STATE_MACHINE__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransition() {
		if (transition == null) {
			transition = new EObjectContainmentEList<Transition>(Transition.class, this,
					TrafficStateMachinePackage.STATE_MACHINE__TRANSITION);
		}
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TrafficStateMachinePackage.STATE_MACHINE__HAS:
			return ((InternalEList<?>) getHas()).basicRemove(otherEnd, msgs);
		case TrafficStateMachinePackage.STATE_MACHINE__TRANSITION:
			return ((InternalEList<?>) getTransition()).basicRemove(otherEnd, msgs);
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
		case TrafficStateMachinePackage.STATE_MACHINE__HAS:
			return getHas();
		case TrafficStateMachinePackage.STATE_MACHINE__NAME:
			return getName();
		case TrafficStateMachinePackage.STATE_MACHINE__TRANSITION:
			return getTransition();
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
		case TrafficStateMachinePackage.STATE_MACHINE__HAS:
			getHas().clear();
			getHas().addAll((Collection<? extends State>) newValue);
			return;
		case TrafficStateMachinePackage.STATE_MACHINE__NAME:
			setName((String) newValue);
			return;
		case TrafficStateMachinePackage.STATE_MACHINE__TRANSITION:
			getTransition().clear();
			getTransition().addAll((Collection<? extends Transition>) newValue);
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
		case TrafficStateMachinePackage.STATE_MACHINE__HAS:
			getHas().clear();
			return;
		case TrafficStateMachinePackage.STATE_MACHINE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case TrafficStateMachinePackage.STATE_MACHINE__TRANSITION:
			getTransition().clear();
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
		case TrafficStateMachinePackage.STATE_MACHINE__HAS:
			return has != null && !has.isEmpty();
		case TrafficStateMachinePackage.STATE_MACHINE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case TrafficStateMachinePackage.STATE_MACHINE__TRANSITION:
			return transition != null && !transition.isEmpty();
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //StateMachineImpl
