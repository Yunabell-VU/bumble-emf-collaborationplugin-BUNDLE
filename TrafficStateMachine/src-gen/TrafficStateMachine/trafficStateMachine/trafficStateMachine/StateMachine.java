/**
 */
package TrafficStateMachine.trafficStateMachine.trafficStateMachine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TrafficStateMachine.trafficStateMachine.trafficStateMachine.StateMachine#getHas <em>Has</em>}</li>
 *   <li>{@link TrafficStateMachine.trafficStateMachine.trafficStateMachine.StateMachine#getName <em>Name</em>}</li>
 *   <li>{@link TrafficStateMachine.trafficStateMachine.trafficStateMachine.StateMachine#getTransition <em>Transition</em>}</li>
 * </ul>
 *
 * @see TrafficStateMachine.trafficStateMachine.trafficStateMachine.TrafficStateMachinePackage#getStateMachine()
 * @model
 * @generated
 */
public interface StateMachine extends EObject {
	/**
	 * Returns the value of the '<em><b>Has</b></em>' containment reference list.
	 * The list contents are of type {@link TrafficStateMachine.trafficStateMachine.trafficStateMachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has</em>' containment reference list.
	 * @see TrafficStateMachine.trafficStateMachine.trafficStateMachine.TrafficStateMachinePackage#getStateMachine_Has()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getHas();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see TrafficStateMachine.trafficStateMachine.trafficStateMachine.TrafficStateMachinePackage#getStateMachine_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link TrafficStateMachine.trafficStateMachine.trafficStateMachine.StateMachine#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' containment reference list.
	 * The list contents are of type {@link TrafficStateMachine.trafficStateMachine.trafficStateMachine.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' containment reference list.
	 * @see TrafficStateMachine.trafficStateMachine.trafficStateMachine.TrafficStateMachinePackage#getStateMachine_Transition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransition();

} // StateMachine
