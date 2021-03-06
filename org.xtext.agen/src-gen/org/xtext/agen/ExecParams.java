/**
 * generated by Xtext 2.25.0
 */
package org.xtext.agen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exec Params</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.agen.ExecParams#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.agen.ExecParams#getWhere <em>Where</em>}</li>
 *   <li>{@link org.xtext.agen.ExecParams#getWhen <em>When</em>}</li>
 *   <li>{@link org.xtext.agen.ExecParams#getWhat <em>What</em>}</li>
 * </ul>
 *
 * @see org.xtext.agen.AgenPackage#getExecParams()
 * @model
 * @generated
 */
public interface ExecParams extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.agen.AgenPackage#getExecParams_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.agen.ExecParams#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Where</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.agen.JOIN_TYPE}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Where</em>' attribute.
   * @see org.xtext.agen.JOIN_TYPE
   * @see #setWhere(JOIN_TYPE)
   * @see org.xtext.agen.AgenPackage#getExecParams_Where()
   * @model
   * @generated
   */
  JOIN_TYPE getWhere();

  /**
   * Sets the value of the '{@link org.xtext.agen.ExecParams#getWhere <em>Where</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Where</em>' attribute.
   * @see org.xtext.agen.JOIN_TYPE
   * @see #getWhere()
   * @generated
   */
  void setWhere(JOIN_TYPE value);

  /**
   * Returns the value of the '<em><b>When</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>When</em>' containment reference.
   * @see #setWhen(When)
   * @see org.xtext.agen.AgenPackage#getExecParams_When()
   * @model containment="true"
   * @generated
   */
  When getWhen();

  /**
   * Sets the value of the '{@link org.xtext.agen.ExecParams#getWhen <em>When</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>When</em>' containment reference.
   * @see #getWhen()
   * @generated
   */
  void setWhen(When value);

  /**
   * Returns the value of the '<em><b>What</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>What</em>' containment reference.
   * @see #setWhat(What)
   * @see org.xtext.agen.AgenPackage#getExecParams_What()
   * @model containment="true"
   * @generated
   */
  What getWhat();

  /**
   * Sets the value of the '{@link org.xtext.agen.ExecParams#getWhat <em>What</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>What</em>' containment reference.
   * @see #getWhat()
   * @generated
   */
  void setWhat(What value);

} // ExecParams
