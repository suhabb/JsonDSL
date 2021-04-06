/**
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.course.jsonQ;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregate Statements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.course.jsonQ.AggregateStatements#getOpAgg <em>Op Agg</em>}</li>
 *   <li>{@link uk.ac.kcl.course.jsonQ.AggregateStatements#getAggField <em>Agg Field</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.course.jsonQ.JsonQPackage#getAggregateStatements()
 * @model
 * @generated
 */
public interface AggregateStatements extends Statements
{
  /**
   * Returns the value of the '<em><b>Op Agg</b></em>' attribute.
   * The literals are from the enumeration {@link uk.ac.kcl.course.jsonQ.OperationAgg}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op Agg</em>' attribute.
   * @see uk.ac.kcl.course.jsonQ.OperationAgg
   * @see #setOpAgg(OperationAgg)
   * @see uk.ac.kcl.course.jsonQ.JsonQPackage#getAggregateStatements_OpAgg()
   * @model
   * @generated
   */
  OperationAgg getOpAgg();

  /**
   * Sets the value of the '{@link uk.ac.kcl.course.jsonQ.AggregateStatements#getOpAgg <em>Op Agg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op Agg</em>' attribute.
   * @see uk.ac.kcl.course.jsonQ.OperationAgg
   * @see #getOpAgg()
   * @generated
   */
  void setOpAgg(OperationAgg value);

  /**
   * Returns the value of the '<em><b>Agg Field</b></em>' attribute.
   * The literals are from the enumeration {@link uk.ac.kcl.course.jsonQ.InputFieldSingle}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Agg Field</em>' attribute.
   * @see uk.ac.kcl.course.jsonQ.InputFieldSingle
   * @see #setAggField(InputFieldSingle)
   * @see uk.ac.kcl.course.jsonQ.JsonQPackage#getAggregateStatements_AggField()
   * @model
   * @generated
   */
  InputFieldSingle getAggField();

  /**
   * Sets the value of the '{@link uk.ac.kcl.course.jsonQ.AggregateStatements#getAggField <em>Agg Field</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Agg Field</em>' attribute.
   * @see uk.ac.kcl.course.jsonQ.InputFieldSingle
   * @see #getAggField()
   * @generated
   */
  void setAggField(InputFieldSingle value);

} // AggregateStatements
