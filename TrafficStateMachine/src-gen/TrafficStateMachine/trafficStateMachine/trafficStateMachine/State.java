/**
 */
package TrafficStateMachine.trafficStateMachine.trafficStateMachine;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TrafficStateMachine.trafficStateMachine.trafficStateMachine.State#getColor <em>Color</em>}</li>
 *   <li>{@link TrafficStateMachine.trafficStateMachine.trafficStateMachine.State#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @see TrafficStateMachine.trafficStateMachine.trafficStateMachine.TrafficStateMachinePackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see TrafficStateMachine.trafficStateMachine.trafficStateMachine.TrafficStateMachinePackage#getState_Color()
	 * @model
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link TrafficStateMachine.trafficStateMachine.trafficStateMachine.State#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' attribute.
	 * @see #setProperty(String)
	 * @see TrafficStateMachine.trafficStateMachine.trafficStateMachine.TrafficStateMachinePackage#getState_Property()
	 * @model
	 * @generated
	 */
	String getProperty();

	/**
	 * Sets the value of the '{@link TrafficStateMachine.trafficStateMachine.trafficStateMachine.State#getProperty <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' attribute.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(String value);

} // State
