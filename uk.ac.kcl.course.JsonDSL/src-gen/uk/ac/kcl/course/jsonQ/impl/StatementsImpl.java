/**
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.course.jsonQ.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.kcl.course.jsonQ.AdditionalQuery;
import uk.ac.kcl.course.jsonQ.InputFieldSingle;
import uk.ac.kcl.course.jsonQ.InputVal;
import uk.ac.kcl.course.jsonQ.JsonQPackage;
import uk.ac.kcl.course.jsonQ.Statements;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.course.jsonQ.impl.StatementsImpl#getQ1key <em>Q1key</em>}</li>
 *   <li>{@link uk.ac.kcl.course.jsonQ.impl.StatementsImpl#getQ1val <em>Q1val</em>}</li>
 *   <li>{@link uk.ac.kcl.course.jsonQ.impl.StatementsImpl#getQryadditional <em>Qryadditional</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatementsImpl extends MinimalEObjectImpl.Container implements Statements
{
  /**
   * The default value of the '{@link #getQ1key() <em>Q1key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQ1key()
   * @generated
   * @ordered
   */
  protected static final InputFieldSingle Q1KEY_EDEFAULT = InputFieldSingle.FIRST_NAME;

  /**
   * The cached value of the '{@link #getQ1key() <em>Q1key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQ1key()
   * @generated
   * @ordered
   */
  protected InputFieldSingle q1key = Q1KEY_EDEFAULT;

  /**
   * The cached value of the '{@link #getQ1val() <em>Q1val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQ1val()
   * @generated
   * @ordered
   */
  protected InputVal q1val;

  /**
   * The cached value of the '{@link #getQryadditional() <em>Qryadditional</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQryadditional()
   * @generated
   * @ordered
   */
  protected AdditionalQuery qryadditional;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StatementsImpl()
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
    return JsonQPackage.Literals.STATEMENTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InputFieldSingle getQ1key()
  {
    return q1key;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setQ1key(InputFieldSingle newQ1key)
  {
    InputFieldSingle oldQ1key = q1key;
    q1key = newQ1key == null ? Q1KEY_EDEFAULT : newQ1key;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JsonQPackage.STATEMENTS__Q1KEY, oldQ1key, q1key));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InputVal getQ1val()
  {
    return q1val;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQ1val(InputVal newQ1val, NotificationChain msgs)
  {
    InputVal oldQ1val = q1val;
    q1val = newQ1val;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JsonQPackage.STATEMENTS__Q1VAL, oldQ1val, newQ1val);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setQ1val(InputVal newQ1val)
  {
    if (newQ1val != q1val)
    {
      NotificationChain msgs = null;
      if (q1val != null)
        msgs = ((InternalEObject)q1val).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JsonQPackage.STATEMENTS__Q1VAL, null, msgs);
      if (newQ1val != null)
        msgs = ((InternalEObject)newQ1val).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JsonQPackage.STATEMENTS__Q1VAL, null, msgs);
      msgs = basicSetQ1val(newQ1val, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JsonQPackage.STATEMENTS__Q1VAL, newQ1val, newQ1val));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AdditionalQuery getQryadditional()
  {
    return qryadditional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQryadditional(AdditionalQuery newQryadditional, NotificationChain msgs)
  {
    AdditionalQuery oldQryadditional = qryadditional;
    qryadditional = newQryadditional;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JsonQPackage.STATEMENTS__QRYADDITIONAL, oldQryadditional, newQryadditional);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setQryadditional(AdditionalQuery newQryadditional)
  {
    if (newQryadditional != qryadditional)
    {
      NotificationChain msgs = null;
      if (qryadditional != null)
        msgs = ((InternalEObject)qryadditional).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JsonQPackage.STATEMENTS__QRYADDITIONAL, null, msgs);
      if (newQryadditional != null)
        msgs = ((InternalEObject)newQryadditional).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JsonQPackage.STATEMENTS__QRYADDITIONAL, null, msgs);
      msgs = basicSetQryadditional(newQryadditional, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JsonQPackage.STATEMENTS__QRYADDITIONAL, newQryadditional, newQryadditional));
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
      case JsonQPackage.STATEMENTS__Q1VAL:
        return basicSetQ1val(null, msgs);
      case JsonQPackage.STATEMENTS__QRYADDITIONAL:
        return basicSetQryadditional(null, msgs);
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
      case JsonQPackage.STATEMENTS__Q1KEY:
        return getQ1key();
      case JsonQPackage.STATEMENTS__Q1VAL:
        return getQ1val();
      case JsonQPackage.STATEMENTS__QRYADDITIONAL:
        return getQryadditional();
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
      case JsonQPackage.STATEMENTS__Q1KEY:
        setQ1key((InputFieldSingle)newValue);
        return;
      case JsonQPackage.STATEMENTS__Q1VAL:
        setQ1val((InputVal)newValue);
        return;
      case JsonQPackage.STATEMENTS__QRYADDITIONAL:
        setQryadditional((AdditionalQuery)newValue);
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
      case JsonQPackage.STATEMENTS__Q1KEY:
        setQ1key(Q1KEY_EDEFAULT);
        return;
      case JsonQPackage.STATEMENTS__Q1VAL:
        setQ1val((InputVal)null);
        return;
      case JsonQPackage.STATEMENTS__QRYADDITIONAL:
        setQryadditional((AdditionalQuery)null);
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
      case JsonQPackage.STATEMENTS__Q1KEY:
        return q1key != Q1KEY_EDEFAULT;
      case JsonQPackage.STATEMENTS__Q1VAL:
        return q1val != null;
      case JsonQPackage.STATEMENTS__QRYADDITIONAL:
        return qryadditional != null;
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
    result.append(" (q1key: ");
    result.append(q1key);
    result.append(')');
    return result.toString();
  }

} //StatementsImpl
