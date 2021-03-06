/**
 * generated by Xtext 2.25.0
 */
package org.xtext.agen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>between Rounds</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.agen.betweenRounds#getStart <em>Start</em>}</li>
 *   <li>{@link org.xtext.agen.betweenRounds#getEnd <em>End</em>}</li>
 *   <li>{@link org.xtext.agen.betweenRounds#getInterval <em>Interval</em>}</li>
 *   <li>{@link org.xtext.agen.betweenRounds#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.xtext.agen.betweenRounds#getRandom <em>Random</em>}</li>
 * </ul>
 *
 * @see org.xtext.agen.AgenPackage#getbetweenRounds()
 * @model
 * @generated
 */
public interface betweenRounds extends EObject
{
  /**
   * Returns the value of the '<em><b>Start</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start</em>' attribute.
   * @see #setStart(int)
   * @see org.xtext.agen.AgenPackage#getbetweenRounds_Start()
   * @model
   * @generated
   */
  int getStart();

  /**
   * Sets the value of the '{@link org.xtext.agen.betweenRounds#getStart <em>Start</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start</em>' attribute.
   * @see #getStart()
   * @generated
   */
  void setStart(int value);

  /**
   * Returns the value of the '<em><b>End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>End</em>' attribute.
   * @see #setEnd(int)
   * @see org.xtext.agen.AgenPackage#getbetweenRounds_End()
   * @model
   * @generated
   */
  int getEnd();

  /**
   * Sets the value of the '{@link org.xtext.agen.betweenRounds#getEnd <em>End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' attribute.
   * @see #getEnd()
   * @generated
   */
  void setEnd(int value);

  /**
   * Returns the value of the '<em><b>Interval</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interval</em>' attribute.
   * @see #setInterval(int)
   * @see org.xtext.agen.AgenPackage#getbetweenRounds_Interval()
   * @model
   * @generated
   */
  int getInterval();

  /**
   * Sets the value of the '{@link org.xtext.agen.betweenRounds#getInterval <em>Interval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interval</em>' attribute.
   * @see #getInterval()
   * @generated
   */
  void setInterval(int value);

  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(Condition)
   * @see org.xtext.agen.AgenPackage#getbetweenRounds_Condition()
   * @model containment="true"
   * @generated
   */
  Condition getCondition();

  /**
   * Sets the value of the '{@link org.xtext.agen.betweenRounds#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(Condition value);

  /**
   * Returns the value of the '<em><b>Random</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Random</em>' containment reference.
   * @see #setRandom(Random)
   * @see org.xtext.agen.AgenPackage#getbetweenRounds_Random()
   * @model containment="true"
   * @generated
   */
  Random getRandom();

  /**
   * Sets the value of the '{@link org.xtext.agen.betweenRounds#getRandom <em>Random</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Random</em>' containment reference.
   * @see #getRandom()
   * @generated
   */
  void setRandom(Random value);

} // betweenRounds
