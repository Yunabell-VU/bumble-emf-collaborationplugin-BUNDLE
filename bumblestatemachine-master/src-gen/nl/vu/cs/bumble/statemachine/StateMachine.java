/**
 */
package nl.vu.cs.bumble.statemachine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.vu.cs.bumble.statemachine.StateMachine#getCurrentinput <em>Currentinput</em>}</li>
 *   <li>{@link nl.vu.cs.bumble.statemachine.StateMachine#getCurrentstate <em>Currentstate</em>}</li>
 *   <li>{@link nl.vu.cs.bumble.statemachine.StateMachine#getCurrentoutput <em>Currentoutput</em>}</li>
 *   <li>{@link nl.vu.cs.bumble.statemachine.StateMachine#getInput <em>Input</em>}</li>
 *   <li>{@link nl.vu.cs.bumble.statemachine.StateMachine#getOutput <em>Output</em>}</li>
 *   <li>{@link nl.vu.cs.bumble.statemachine.StateMachine#getTransition <em>Transition</em>}</li>
 *   <li>{@link nl.vu.cs.bumble.statemachine.StateMachine#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see nl.vu.cs.bumble.statemachine.StatemachinePackage#getStateMachine()
 * @model
 * @generated
 */
public interface StateMachine extends BaseConcept, NamedElement {
	/**
	 * Returns the value of the '<em><b>Currentinput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currentinput</em>' reference.
	 * @see #setCurrentinput(Input)
	 * @see nl.vu.cs.bumble.statemachine.StatemachinePackage#getStateMachine_Currentinput()
	 * @model
	 * @generated
	 */
	Input getCurrentinput();

	/**
	 * Sets the value of the '{@link nl.vu.cs.bumble.statemachine.StateMachine#getCurrentinput <em>Currentinput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currentinput</em>' reference.
	 * @see #getCurrentinput()
	 * @generated
	 */
	void setCurrentinput(Input value);

	/**
	 * Returns the value of the '<em><b>Currentstate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currentstate</em>' reference.
	 * @see #setCurrentstate(State)
	 * @see nl.vu.cs.bumble.statemachine.StatemachinePackage#getStateMachine_Currentstate()
	 * @model
	 * @generated
	 */
	State getCurrentstate();

	/**
	 * Sets the value of the '{@link nl.vu.cs.bumble.statemachine.StateMachine#getCurrentstate <em>Currentstate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currentstate</em>' reference.
	 * @see #getCurrentstate()
	 * @generated
	 */
	void setCurrentstate(State value);

	/**
	 * Returns the value of the '<em><b>Currentoutput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currentoutput</em>' reference.
	 * @see #setCurrentoutput(Output)
	 * @see nl.vu.cs.bumble.statemachine.StatemachinePackage#getStateMachine_Currentoutput()
	 * @model
	 * @generated
	 */
	Output getCurrentoutput();

	/**
	 * Sets the value of the '{@link nl.vu.cs.bumble.statemachine.StateMachine#getCurrentoutput <em>Currentoutput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currentoutput</em>' reference.
	 * @see #getCurrentoutput()
	 * @generated
	 */
	void setCurrentoutput(Output value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link nl.vu.cs.bumble.statemachine.Input}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see nl.vu.cs.bumble.statemachine.StatemachinePackage#getStateMachine_Input()
	 * @model containment="true"
	 * @generated
	 */
	EList<Input> getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference list.
	 * The list contents are of type {@link nl.vu.cs.bumble.statemachine.Output}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference list.
	 * @see nl.vu.cs.bumble.statemachine.StatemachinePackage#getStateMachine_Output()
	 * @model containment="true"
	 * @generated
	 */
	EList<Output> getOutput();

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' containment reference list.
	 * The list contents are of type {@link nl.vu.cs.bumble.statemachine.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' containment reference list.
	 * @see nl.vu.cs.bumble.statemachine.StatemachinePackage#getStateMachine_Transition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransition();

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link nl.vu.cs.bumble.statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see nl.vu.cs.bumble.statemachine.StatemachinePackage#getStateMachine_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStates();

} // StateMachine
