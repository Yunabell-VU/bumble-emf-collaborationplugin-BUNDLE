/**
 */
package nl.vu.cs.bumble.statemachine;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.vu.cs.bumble.statemachine.State#getOutput <em>Output</em>}</li>
 *   <li>{@link nl.vu.cs.bumble.statemachine.State#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @see nl.vu.cs.bumble.statemachine.StatemachinePackage#getState()
 * @model
 * @generated
 */
public interface State extends NamedElement, Element {
	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(Output)
	 * @see nl.vu.cs.bumble.statemachine.StatemachinePackage#getState_Output()
	 * @model
	 * @generated
	 */
	Output getOutput();

	/**
	 * Sets the value of the '{@link nl.vu.cs.bumble.statemachine.State#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(Output value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference.
	 * @see #setInput(Input)
	 * @see nl.vu.cs.bumble.statemachine.StatemachinePackage#getState_Input()
	 * @model
	 * @generated
	 */
	Input getInput();

	/**
	 * Sets the value of the '{@link nl.vu.cs.bumble.statemachine.State#getInput <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(Input value);

} // State
