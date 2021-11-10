/**
 * generated by Xtext 2.25.0
 */
package org.xtext.agen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Run Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.agen.RunConfiguration#getCoordinatorLocation <em>Coordinator Location</em>}</li>
 *   <li>{@link org.xtext.agen.RunConfiguration#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @see org.xtext.agen.AgenPackage#getRunConfiguration()
 * @model
 * @generated
 */
public interface RunConfiguration extends Types
{
  /**
   * Returns the value of the '<em><b>Coordinator Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Coordinator Location</em>' attribute.
   * @see #setCoordinatorLocation(String)
   * @see org.xtext.agen.AgenPackage#getRunConfiguration_CoordinatorLocation()
   * @model
   * @generated
   */
  String getCoordinatorLocation();

  /**
   * Sets the value of the '{@link org.xtext.agen.RunConfiguration#getCoordinatorLocation <em>Coordinator Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Coordinator Location</em>' attribute.
   * @see #getCoordinatorLocation()
   * @generated
   */
  void setCoordinatorLocation(String value);

  /**
   * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.agen.Node}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nodes</em>' containment reference list.
   * @see org.xtext.agen.AgenPackage#getRunConfiguration_Nodes()
   * @model containment="true"
   * @generated
   */
  EList<Node> getNodes();

} // RunConfiguration