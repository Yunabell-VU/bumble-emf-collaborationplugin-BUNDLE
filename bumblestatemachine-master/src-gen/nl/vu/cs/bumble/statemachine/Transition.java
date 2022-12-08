/**
 */
package nl.vu.cs.bumble.statemachine;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.vu.cs.bumble.statemachine.Transition#getInput <em>Input</em>}</li>
 *   <li>{@link nl.vu.cs.bumble.statemachine.Transition#getFrom <em>From</em>}</li>
 *   <li>{@link nl.vu.cs.bumble.statemachine.Transition#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see nl.vu.cs.bumble.statemachine.StatemachinePackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends Element {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference.
	 * @see #setInput(Input)
	 * @see nl.vu.cs.bumble.statemachine.StatemachinePackage#getTransition_Input()
	 * @model required="true"
	 * @generated
	 */
	Input getInput();

	/**
	 * Sets the value of the '{@link nl.vu.cs.bumble.statemachine.Transition#getInput <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(Input value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(State)
	 * @see nl.vu.cs.bumble.statemachine.StatemachinePackage#getTransition_From()
	 * @model required="true"
	 * @generated
	 */
	State getFrom();

	/**
	 * Sets the value of the '{@link nl.vu.cs.bumble.statemachine.Transition#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(State value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(State)
	 * @see nl.vu.cs.bumble.statemachine.StatemachinePackage#getTransition_To()
	 * @model required="true"
	 * @generated
	 */
	State getTo();

	/**
	 * Sets the value of the '{@link nl.vu.cs.bumble.statemachine.Transition#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(State value);

} // Transition
