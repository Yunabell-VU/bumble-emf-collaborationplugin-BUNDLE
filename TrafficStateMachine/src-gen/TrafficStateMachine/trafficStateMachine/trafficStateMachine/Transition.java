/**
 */
package TrafficStateMachine.trafficStateMachine.trafficStateMachine;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TrafficStateMachine.trafficStateMachine.trafficStateMachine.Transition#getTo <em>To</em>}</li>
 *   <li>{@link TrafficStateMachine.trafficStateMachine.trafficStateMachine.Transition#getFrom <em>From</em>}</li>
 *   <li>{@link TrafficStateMachine.trafficStateMachine.trafficStateMachine.Transition#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @see TrafficStateMachine.trafficStateMachine.trafficStateMachine.TrafficStateMachinePackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(State)
	 * @see TrafficStateMachine.trafficStateMachine.trafficStateMachine.TrafficStateMachinePackage#getTransition_To()
	 * @model
	 * @generated
	 */
	State getTo();

	/**
	 * Sets the value of the '{@link TrafficStateMachine.trafficStateMachine.trafficStateMachine.Transition#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(State value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(State)
	 * @see TrafficStateMachine.trafficStateMachine.trafficStateMachine.TrafficStateMachinePackage#getTransition_From()
	 * @model
	 * @generated
	 */
	State getFrom();

	/**
	 * Sets the value of the '{@link TrafficStateMachine.trafficStateMachine.trafficStateMachine.Transition#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(State value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' attribute.
	 * @see #setInput(String)
	 * @see TrafficStateMachine.trafficStateMachine.trafficStateMachine.TrafficStateMachinePackage#getTransition_Input()
	 * @model
	 * @generated
	 */
	String getInput();

	/**
	 * Sets the value of the '{@link TrafficStateMachine.trafficStateMachine.trafficStateMachine.Transition#getInput <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' attribute.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(String value);

} // Transition
