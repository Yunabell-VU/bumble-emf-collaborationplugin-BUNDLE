/**
 */
package nl.vu.cs.bumble.statemachine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.vu.cs.bumble.statemachine.Element#getDescription <em>Description</em>}</li>
 *   <li>{@link nl.vu.cs.bumble.statemachine.Element#getBaseconcept <em>Baseconcept</em>}</li>
 * </ul>
 *
 * @see nl.vu.cs.bumble.statemachine.StatemachinePackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends BaseConcept {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see nl.vu.cs.bumble.statemachine.StatemachinePackage#getElement_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link nl.vu.cs.bumble.statemachine.Element#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Baseconcept</b></em>' containment reference list.
	 * The list contents are of type {@link nl.vu.cs.bumble.statemachine.BaseConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Baseconcept</em>' containment reference list.
	 * @see nl.vu.cs.bumble.statemachine.StatemachinePackage#getElement_Baseconcept()
	 * @model containment="true"
	 * @generated
	 */
	EList<BaseConcept> getBaseconcept();

} // Element
