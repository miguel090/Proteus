/**
 * generated by Xtext 2.25.0
 */
package org.xtext.agen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Random</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.agen.Random#getChance <em>Chance</em>}</li>
 * </ul>
 *
 * @see org.xtext.agen.AgenPackage#getRandom()
 * @model
 * @generated
 */
public interface Random extends EObject
{
  /**
   * Returns the value of the '<em><b>Chance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Chance</em>' attribute.
   * @see #setChance(int)
   * @see org.xtext.agen.AgenPackage#getRandom_Chance()
   * @model
   * @generated
   */
  int getChance();

  /**
   * Sets the value of the '{@link org.xtext.agen.Random#getChance <em>Chance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Chance</em>' attribute.
   * @see #getChance()
   * @generated
   */
  void setChance(int value);

} // Random