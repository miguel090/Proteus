/**
 * generated by Xtext 2.25.0
 */
package org.xtext.agen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>When</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.agen.When#getBetweenRounds <em>Between Rounds</em>}</li>
 *   <li>{@link org.xtext.agen.When#getBetweenSeconds <em>Between Seconds</em>}</li>
 *   <li>{@link org.xtext.agen.When#getRandom <em>Random</em>}</li>
 *   <li>{@link org.xtext.agen.When#getIfCondition <em>If Condition</em>}</li>
 *   <li>{@link org.xtext.agen.When#getFaultCond <em>Fault Cond</em>}</li>
 *   <li>{@link org.xtext.agen.When#getSyncpoint <em>Syncpoint</em>}</li>
 * </ul>
 *
 * @see org.xtext.agen.AgenPackage#getWhen()
 * @model
 * @generated
 */
public interface When extends EObject
{
  /**
   * Returns the value of the '<em><b>Between Rounds</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Between Rounds</em>' containment reference.
   * @see #setBetweenRounds(betweenRounds)
   * @see org.xtext.agen.AgenPackage#getWhen_BetweenRounds()
   * @model containment="true"
   * @generated
   */
  betweenRounds getBetweenRounds();

  /**
   * Sets the value of the '{@link org.xtext.agen.When#getBetweenRounds <em>Between Rounds</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Between Rounds</em>' containment reference.
   * @see #getBetweenRounds()
   * @generated
   */
  void setBetweenRounds(betweenRounds value);

  /**
   * Returns the value of the '<em><b>Between Seconds</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Between Seconds</em>' containment reference.
   * @see #setBetweenSeconds(betweenSeconds)
   * @see org.xtext.agen.AgenPackage#getWhen_BetweenSeconds()
   * @model containment="true"
   * @generated
   */
  betweenSeconds getBetweenSeconds();

  /**
   * Sets the value of the '{@link org.xtext.agen.When#getBetweenSeconds <em>Between Seconds</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Between Seconds</em>' containment reference.
   * @see #getBetweenSeconds()
   * @generated
   */
  void setBetweenSeconds(betweenSeconds value);

  /**
   * Returns the value of the '<em><b>Random</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Random</em>' containment reference.
   * @see #setRandom(Random)
   * @see org.xtext.agen.AgenPackage#getWhen_Random()
   * @model containment="true"
   * @generated
   */
  Random getRandom();

  /**
   * Sets the value of the '{@link org.xtext.agen.When#getRandom <em>Random</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Random</em>' containment reference.
   * @see #getRandom()
   * @generated
   */
  void setRandom(Random value);

  /**
   * Returns the value of the '<em><b>If Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>If Condition</em>' containment reference.
   * @see #setIfCondition(Condition)
   * @see org.xtext.agen.AgenPackage#getWhen_IfCondition()
   * @model containment="true"
   * @generated
   */
  Condition getIfCondition();

  /**
   * Sets the value of the '{@link org.xtext.agen.When#getIfCondition <em>If Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>If Condition</em>' containment reference.
   * @see #getIfCondition()
   * @generated
   */
  void setIfCondition(Condition value);

  /**
   * Returns the value of the '<em><b>Fault Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fault Cond</em>' containment reference.
   * @see #setFaultCond(FaultCond)
   * @see org.xtext.agen.AgenPackage#getWhen_FaultCond()
   * @model containment="true"
   * @generated
   */
  FaultCond getFaultCond();

  /**
   * Sets the value of the '{@link org.xtext.agen.When#getFaultCond <em>Fault Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fault Cond</em>' containment reference.
   * @see #getFaultCond()
   * @generated
   */
  void setFaultCond(FaultCond value);

  /**
   * Returns the value of the '<em><b>Syncpoint</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Syncpoint</em>' attribute.
   * @see #setSyncpoint(String)
   * @see org.xtext.agen.AgenPackage#getWhen_Syncpoint()
   * @model
   * @generated
   */
  String getSyncpoint();

  /**
   * Sets the value of the '{@link org.xtext.agen.When#getSyncpoint <em>Syncpoint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Syncpoint</em>' attribute.
   * @see #getSyncpoint()
   * @generated
   */
  void setSyncpoint(String value);

} // When
