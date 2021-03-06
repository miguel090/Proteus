/**
 * generated by Xtext 2.25.0
 */
package org.xtext.agen.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.agen.AgenPackage;
import org.xtext.agen.RepeatExecution;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repeat Execution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.agen.impl.RepeatExecutionImpl#getTimes <em>Times</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepeatExecutionImpl extends MinimalEObjectImpl.Container implements RepeatExecution
{
  /**
   * The default value of the '{@link #getTimes() <em>Times</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimes()
   * @generated
   * @ordered
   */
  protected static final int TIMES_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTimes() <em>Times</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimes()
   * @generated
   * @ordered
   */
  protected int times = TIMES_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RepeatExecutionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AgenPackage.Literals.REPEAT_EXECUTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getTimes()
  {
    return times;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTimes(int newTimes)
  {
    int oldTimes = times;
    times = newTimes;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgenPackage.REPEAT_EXECUTION__TIMES, oldTimes, times));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AgenPackage.REPEAT_EXECUTION__TIMES:
        return getTimes();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AgenPackage.REPEAT_EXECUTION__TIMES:
        setTimes((Integer)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AgenPackage.REPEAT_EXECUTION__TIMES:
        setTimes(TIMES_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AgenPackage.REPEAT_EXECUTION__TIMES:
        return times != TIMES_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (times: ");
    result.append(times);
    result.append(')');
    return result.toString();
  }

} //RepeatExecutionImpl
