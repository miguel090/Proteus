/**
 * generated by Xtext 2.25.0
 */
package org.xtext.agen.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.agen.AgenPackage;
import org.xtext.agen.ExecParams;
import org.xtext.agen.Fault;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fault</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.agen.impl.FaultImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.agen.impl.FaultImpl#getPointcut <em>Pointcut</em>}</li>
 *   <li>{@link org.xtext.agen.impl.FaultImpl#getExecParams <em>Exec Params</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FaultImpl extends TypesImpl implements Fault
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getPointcut() <em>Pointcut</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPointcut()
   * @generated
   * @ordered
   */
  protected static final String POINTCUT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPointcut() <em>Pointcut</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPointcut()
   * @generated
   * @ordered
   */
  protected String pointcut = POINTCUT_EDEFAULT;

  /**
   * The cached value of the '{@link #getExecParams() <em>Exec Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExecParams()
   * @generated
   * @ordered
   */
  protected EList<ExecParams> execParams;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FaultImpl()
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
    return AgenPackage.Literals.FAULT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgenPackage.FAULT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPointcut()
  {
    return pointcut;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPointcut(String newPointcut)
  {
    String oldPointcut = pointcut;
    pointcut = newPointcut;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgenPackage.FAULT__POINTCUT, oldPointcut, pointcut));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ExecParams> getExecParams()
  {
    if (execParams == null)
    {
      execParams = new EObjectContainmentEList<ExecParams>(ExecParams.class, this, AgenPackage.FAULT__EXEC_PARAMS);
    }
    return execParams;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AgenPackage.FAULT__EXEC_PARAMS:
        return ((InternalEList<?>)getExecParams()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case AgenPackage.FAULT__NAME:
        return getName();
      case AgenPackage.FAULT__POINTCUT:
        return getPointcut();
      case AgenPackage.FAULT__EXEC_PARAMS:
        return getExecParams();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AgenPackage.FAULT__NAME:
        setName((String)newValue);
        return;
      case AgenPackage.FAULT__POINTCUT:
        setPointcut((String)newValue);
        return;
      case AgenPackage.FAULT__EXEC_PARAMS:
        getExecParams().clear();
        getExecParams().addAll((Collection<? extends ExecParams>)newValue);
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
      case AgenPackage.FAULT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AgenPackage.FAULT__POINTCUT:
        setPointcut(POINTCUT_EDEFAULT);
        return;
      case AgenPackage.FAULT__EXEC_PARAMS:
        getExecParams().clear();
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
      case AgenPackage.FAULT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AgenPackage.FAULT__POINTCUT:
        return POINTCUT_EDEFAULT == null ? pointcut != null : !POINTCUT_EDEFAULT.equals(pointcut);
      case AgenPackage.FAULT__EXEC_PARAMS:
        return execParams != null && !execParams.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(", pointcut: ");
    result.append(pointcut);
    result.append(')');
    return result.toString();
  }

} //FaultImpl