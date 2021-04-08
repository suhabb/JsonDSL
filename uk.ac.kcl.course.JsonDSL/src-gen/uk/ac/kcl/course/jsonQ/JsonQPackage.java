/**
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.course.jsonQ;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.course.jsonQ.JsonQFactory
 * @model kind="package"
 * @generated
 */
public interface JsonQPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "jsonQ";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ac.uk/kcl/course/JsonQ";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "jsonQ";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  JsonQPackage eINSTANCE = uk.ac.kcl.course.jsonQ.impl.JsonQPackageImpl.init();

  /**
   * The meta object id for the '{@link uk.ac.kcl.course.jsonQ.impl.JSONQueryModelImpl <em>JSON Query Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.course.jsonQ.impl.JSONQueryModelImpl
   * @see uk.ac.kcl.course.jsonQ.impl.JsonQPackageImpl#getJSONQueryModel()
   * @generated
   */
  int JSON_QUERY_MODEL = 0;

  /**
   * The feature id for the '<em><b>Input Statement</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_QUERY_MODEL__INPUT_STATEMENT = 0;

  /**
   * The number of structural features of the '<em>JSON Query Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_QUERY_MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.course.jsonQ.impl.StatementsImpl <em>Statements</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.course.jsonQ.impl.StatementsImpl
   * @see uk.ac.kcl.course.jsonQ.impl.JsonQPackageImpl#getStatements()
   * @generated
   */
  int STATEMENTS = 1;

  /**
   * The feature id for the '<em><b>Q1key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENTS__Q1KEY = 0;

  /**
   * The feature id for the '<em><b>Q1val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENTS__Q1VAL = 1;

  /**
   * The feature id for the '<em><b>Qryadditional</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENTS__QRYADDITIONAL = 2;

  /**
   * The number of structural features of the '<em>Statements</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENTS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link uk.ac.kcl.course.jsonQ.impl.AggregateStatementsImpl <em>Aggregate Statements</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.course.jsonQ.impl.AggregateStatementsImpl
   * @see uk.ac.kcl.course.jsonQ.impl.JsonQPackageImpl#getAggregateStatements()
   * @generated
   */
  int AGGREGATE_STATEMENTS = 2;

  /**
   * The feature id for the '<em><b>Q1key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGGREGATE_STATEMENTS__Q1KEY = STATEMENTS__Q1KEY;

  /**
   * The feature id for the '<em><b>Q1val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGGREGATE_STATEMENTS__Q1VAL = STATEMENTS__Q1VAL;

  /**
   * The feature id for the '<em><b>Qryadditional</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGGREGATE_STATEMENTS__QRYADDITIONAL = STATEMENTS__QRYADDITIONAL;

  /**
   * The feature id for the '<em><b>Op Agg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGGREGATE_STATEMENTS__OP_AGG = STATEMENTS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Agg Field</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGGREGATE_STATEMENTS__AGG_FIELD = STATEMENTS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Aggregate Statements</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGGREGATE_STATEMENTS_FEATURE_COUNT = STATEMENTS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.ac.kcl.course.jsonQ.impl.GetStatementsImpl <em>Get Statements</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.course.jsonQ.impl.GetStatementsImpl
   * @see uk.ac.kcl.course.jsonQ.impl.JsonQPackageImpl#getGetStatements()
   * @generated
   */
  int GET_STATEMENTS = 3;

  /**
   * The feature id for the '<em><b>Q1key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_STATEMENTS__Q1KEY = STATEMENTS__Q1KEY;

  /**
   * The feature id for the '<em><b>Q1val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_STATEMENTS__Q1VAL = STATEMENTS__Q1VAL;

  /**
   * The feature id for the '<em><b>Qryadditional</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_STATEMENTS__QRYADDITIONAL = STATEMENTS__QRYADDITIONAL;

  /**
   * The feature id for the '<em><b>Op Get</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_STATEMENTS__OP_GET = STATEMENTS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Get Statements</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_STATEMENTS_FEATURE_COUNT = STATEMENTS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.course.jsonQ.impl.AdditionalQueryImpl <em>Additional Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.course.jsonQ.impl.AdditionalQueryImpl
   * @see uk.ac.kcl.course.jsonQ.impl.JsonQPackageImpl#getAdditionalQuery()
   * @generated
   */
  int ADDITIONAL_QUERY = 4;

  /**
   * The feature id for the '<em><b>Connector</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIONAL_QUERY__CONNECTOR = 0;

  /**
   * The feature id for the '<em><b>Q2key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIONAL_QUERY__Q2KEY = 1;

  /**
   * The feature id for the '<em><b>Q2val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIONAL_QUERY__Q2VAL = 2;

  /**
   * The number of structural features of the '<em>Additional Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIONAL_QUERY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link uk.ac.kcl.course.jsonQ.impl.InputValImpl <em>Input Val</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.course.jsonQ.impl.InputValImpl
   * @see uk.ac.kcl.course.jsonQ.impl.JsonQPackageImpl#getInputVal()
   * @generated
   */
  int INPUT_VAL = 5;

  /**
   * The number of structural features of the '<em>Input Val</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_VAL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link uk.ac.kcl.course.jsonQ.impl.IntLiteralImpl <em>Int Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.course.jsonQ.impl.IntLiteralImpl
   * @see uk.ac.kcl.course.jsonQ.impl.JsonQPackageImpl#getIntLiteral()
   * @generated
   */
  int INT_LITERAL = 6;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL__VALUE = INPUT_VAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Int Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL_FEATURE_COUNT = INPUT_VAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.course.jsonQ.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.course.jsonQ.impl.StringLiteralImpl
   * @see uk.ac.kcl.course.jsonQ.impl.JsonQPackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 7;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__VALUE = INPUT_VAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = INPUT_VAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.course.jsonQ.Connector <em>Connector</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.course.jsonQ.Connector
   * @see uk.ac.kcl.course.jsonQ.impl.JsonQPackageImpl#getConnector()
   * @generated
   */
  int CONNECTOR = 8;

  /**
   * The meta object id for the '{@link uk.ac.kcl.course.jsonQ.OperationAgg <em>Operation Agg</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.course.jsonQ.OperationAgg
   * @see uk.ac.kcl.course.jsonQ.impl.JsonQPackageImpl#getOperationAgg()
   * @generated
   */
  int OPERATION_AGG = 9;

  /**
   * The meta object id for the '{@link uk.ac.kcl.course.jsonQ.OperationGET <em>Operation GET</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.course.jsonQ.OperationGET
   * @see uk.ac.kcl.course.jsonQ.impl.JsonQPackageImpl#getOperationGET()
   * @generated
   */
  int OPERATION_GET = 10;

  /**
   * The meta object id for the '{@link uk.ac.kcl.course.jsonQ.InputFieldSingle <em>Input Field Single</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.course.jsonQ.InputFieldSingle
   * @see uk.ac.kcl.course.jsonQ.impl.JsonQPackageImpl#getInputFieldSingle()
   * @generated
   */
  int INPUT_FIELD_SINGLE = 11;


  /**
   * Returns the meta object for class '{@link uk.ac.kcl.course.jsonQ.JSONQueryModel <em>JSON Query Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>JSON Query Model</em>'.
   * @see uk.ac.kcl.course.jsonQ.JSONQueryModel
   * @generated
   */
  EClass getJSONQueryModel();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.course.jsonQ.JSONQueryModel#getInputStatement <em>Input Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Input Statement</em>'.
   * @see uk.ac.kcl.course.jsonQ.JSONQueryModel#getInputStatement()
   * @see #getJSONQueryModel()
   * @generated
   */
  EReference getJSONQueryModel_InputStatement();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.course.jsonQ.Statements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statements</em>'.
   * @see uk.ac.kcl.course.jsonQ.Statements
   * @generated
   */
  EClass getStatements();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.course.jsonQ.Statements#getQ1key <em>Q1key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Q1key</em>'.
   * @see uk.ac.kcl.course.jsonQ.Statements#getQ1key()
   * @see #getStatements()
   * @generated
   */
  EAttribute getStatements_Q1key();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.course.jsonQ.Statements#getQ1val <em>Q1val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Q1val</em>'.
   * @see uk.ac.kcl.course.jsonQ.Statements#getQ1val()
   * @see #getStatements()
   * @generated
   */
  EReference getStatements_Q1val();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.course.jsonQ.Statements#getQryadditional <em>Qryadditional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Qryadditional</em>'.
   * @see uk.ac.kcl.course.jsonQ.Statements#getQryadditional()
   * @see #getStatements()
   * @generated
   */
  EReference getStatements_Qryadditional();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.course.jsonQ.AggregateStatements <em>Aggregate Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Aggregate Statements</em>'.
   * @see uk.ac.kcl.course.jsonQ.AggregateStatements
   * @generated
   */
  EClass getAggregateStatements();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.course.jsonQ.AggregateStatements#getOpAgg <em>Op Agg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op Agg</em>'.
   * @see uk.ac.kcl.course.jsonQ.AggregateStatements#getOpAgg()
   * @see #getAggregateStatements()
   * @generated
   */
  EAttribute getAggregateStatements_OpAgg();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.course.jsonQ.AggregateStatements#getAggField <em>Agg Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Agg Field</em>'.
   * @see uk.ac.kcl.course.jsonQ.AggregateStatements#getAggField()
   * @see #getAggregateStatements()
   * @generated
   */
  EAttribute getAggregateStatements_AggField();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.course.jsonQ.GetStatements <em>Get Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Get Statements</em>'.
   * @see uk.ac.kcl.course.jsonQ.GetStatements
   * @generated
   */
  EClass getGetStatements();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.course.jsonQ.GetStatements#getOpGet <em>Op Get</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op Get</em>'.
   * @see uk.ac.kcl.course.jsonQ.GetStatements#getOpGet()
   * @see #getGetStatements()
   * @generated
   */
  EAttribute getGetStatements_OpGet();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.course.jsonQ.AdditionalQuery <em>Additional Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Additional Query</em>'.
   * @see uk.ac.kcl.course.jsonQ.AdditionalQuery
   * @generated
   */
  EClass getAdditionalQuery();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.course.jsonQ.AdditionalQuery#getConnector <em>Connector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Connector</em>'.
   * @see uk.ac.kcl.course.jsonQ.AdditionalQuery#getConnector()
   * @see #getAdditionalQuery()
   * @generated
   */
  EAttribute getAdditionalQuery_Connector();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.course.jsonQ.AdditionalQuery#getQ2key <em>Q2key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Q2key</em>'.
   * @see uk.ac.kcl.course.jsonQ.AdditionalQuery#getQ2key()
   * @see #getAdditionalQuery()
   * @generated
   */
  EAttribute getAdditionalQuery_Q2key();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.course.jsonQ.AdditionalQuery#getQ2val <em>Q2val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Q2val</em>'.
   * @see uk.ac.kcl.course.jsonQ.AdditionalQuery#getQ2val()
   * @see #getAdditionalQuery()
   * @generated
   */
  EReference getAdditionalQuery_Q2val();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.course.jsonQ.InputVal <em>Input Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Val</em>'.
   * @see uk.ac.kcl.course.jsonQ.InputVal
   * @generated
   */
  EClass getInputVal();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.course.jsonQ.IntLiteral <em>Int Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Literal</em>'.
   * @see uk.ac.kcl.course.jsonQ.IntLiteral
   * @generated
   */
  EClass getIntLiteral();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.course.jsonQ.IntLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see uk.ac.kcl.course.jsonQ.IntLiteral#getValue()
   * @see #getIntLiteral()
   * @generated
   */
  EAttribute getIntLiteral_Value();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.course.jsonQ.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal</em>'.
   * @see uk.ac.kcl.course.jsonQ.StringLiteral
   * @generated
   */
  EClass getStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.course.jsonQ.StringLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see uk.ac.kcl.course.jsonQ.StringLiteral#getValue()
   * @see #getStringLiteral()
   * @generated
   */
  EAttribute getStringLiteral_Value();

  /**
   * Returns the meta object for enum '{@link uk.ac.kcl.course.jsonQ.Connector <em>Connector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Connector</em>'.
   * @see uk.ac.kcl.course.jsonQ.Connector
   * @generated
   */
  EEnum getConnector();

  /**
   * Returns the meta object for enum '{@link uk.ac.kcl.course.jsonQ.OperationAgg <em>Operation Agg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Operation Agg</em>'.
   * @see uk.ac.kcl.course.jsonQ.OperationAgg
   * @generated
   */
  EEnum getOperationAgg();

  /**
   * Returns the meta object for enum '{@link uk.ac.kcl.course.jsonQ.OperationGET <em>Operation GET</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Operation GET</em>'.
   * @see uk.ac.kcl.course.jsonQ.OperationGET
   * @generated
   */
  EEnum getOperationGET();

  /**
   * Returns the meta object for enum '{@link uk.ac.kcl.course.jsonQ.InputFieldSingle <em>Input Field Single</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Input Field Single</em>'.
   * @see uk.ac.kcl.course.jsonQ.InputFieldSingle
   * @generated
   */
  EEnum getInputFieldSingle();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  JsonQFactory getJsonQFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link uk.ac.kcl.course.jsonQ.impl.JSONQueryModelImpl <em>JSON Query Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.course.jsonQ.impl.JSONQueryModelImpl
     * @see uk.ac.kcl.course.jsonQ.impl.JsonQPackageImpl#getJSONQueryModel()
     * @generated
     */
    EClass JSON_QUERY_MODEL = eINSTANCE.getJSONQueryModel();

    /**
     * The meta object literal for the '<em><b>Input Statement</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JSON_QUERY_MODEL__INPUT_STATEMENT = eINSTANCE.getJSONQueryModel_InputStatement();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.course.jsonQ.impl.StatementsImpl <em>Statements</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.course.jsonQ.impl.StatementsImpl
     * @see uk.ac.kcl.course.jsonQ.impl.JsonQPackageImpl#getStatements()
     * @generated
     */
    EClass STATEMENTS = eINSTANCE.getStatements();

    /**
     * The meta object literal for the '<em><b>Q1key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENTS__Q1KEY = eINSTANCE.getStatements_Q1key();

    /**
     * The meta object literal for the '<em><b>Q1val</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENTS__Q1VAL = eINSTANCE.getStatements_Q1val();

    /**
     * The meta object literal for the '<em><b>Qryadditional</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENTS__QRYADDITIONAL = eINSTANCE.getStatements_Qryadditional();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.course.jsonQ.impl.AggregateStatementsImpl <em>Aggregate Statements</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.course.jsonQ.impl.AggregateStatementsImpl
     * @see uk.ac.kcl.course.jsonQ.impl.JsonQPackageImpl#getAggregateStatements()
     * @generated
     */
    EClass AGGREGATE_STATEMENTS = eINSTANCE.getAggregateStatements();

    /**
     * The meta object literal for the '<em><b>Op Agg</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AGGREGATE_STATEMENTS__OP_AGG = eINSTANCE.getAggregateStatements_OpAgg();

    /**
     * The meta object literal for the '<em><b>Agg Field</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AGGREGATE_STATEMENTS__AGG_FIELD = eINSTANCE.getAggregateStatements_AggField();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.course.jsonQ.impl.GetStatementsImpl <em>Get Statements</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.course.jsonQ.impl.GetStatementsImpl
     * @see uk.ac.kcl.course.jsonQ.impl.JsonQPackageImpl#getGetStatements()
     * @generated
     */
    EClass GET_STATEMENTS = eINSTANCE.getGetStatements();

    /**
     * The meta object literal for the '<em><b>Op Get</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GET_STATEMENTS__OP_GET = eINSTANCE.getGetStatements_OpGet();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.course.jsonQ.impl.AdditionalQueryImpl <em>Additional Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.course.jsonQ.impl.AdditionalQueryImpl
     * @see uk.ac.kcl.course.jsonQ.impl.JsonQPackageImpl#getAdditionalQuery()
     * @generated
     */
    EClass ADDITIONAL_QUERY = eINSTANCE.getAdditionalQuery();

    /**
     * The meta object literal for the '<em><b>Connector</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADDITIONAL_QUERY__CONNECTOR = eINSTANCE.getAdditionalQuery_Connector();

    /**
     * The meta object literal for the '<em><b>Q2key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADDITIONAL_QUERY__Q2KEY = eINSTANCE.getAdditionalQuery_Q2key();

    /**
     * The meta object literal for the '<em><b>Q2val</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADDITIONAL_QUERY__Q2VAL = eINSTANCE.getAdditionalQuery_Q2val();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.course.jsonQ.impl.InputValImpl <em>Input Val</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.course.jsonQ.impl.InputValImpl
     * @see uk.ac.kcl.course.jsonQ.impl.JsonQPackageImpl#getInputVal()
     * @generated
     */
    EClass INPUT_VAL = eINSTANCE.getInputVal();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.course.jsonQ.impl.IntLiteralImpl <em>Int Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.course.jsonQ.impl.IntLiteralImpl
     * @see uk.ac.kcl.course.jsonQ.impl.JsonQPackageImpl#getIntLiteral()
     * @generated
     */
    EClass INT_LITERAL = eINSTANCE.getIntLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INT_LITERAL__VALUE = eINSTANCE.getIntLiteral_Value();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.course.jsonQ.impl.StringLiteralImpl <em>String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.course.jsonQ.impl.StringLiteralImpl
     * @see uk.ac.kcl.course.jsonQ.impl.JsonQPackageImpl#getStringLiteral()
     * @generated
     */
    EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.course.jsonQ.Connector <em>Connector</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.course.jsonQ.Connector
     * @see uk.ac.kcl.course.jsonQ.impl.JsonQPackageImpl#getConnector()
     * @generated
     */
    EEnum CONNECTOR = eINSTANCE.getConnector();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.course.jsonQ.OperationAgg <em>Operation Agg</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.course.jsonQ.OperationAgg
     * @see uk.ac.kcl.course.jsonQ.impl.JsonQPackageImpl#getOperationAgg()
     * @generated
     */
    EEnum OPERATION_AGG = eINSTANCE.getOperationAgg();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.course.jsonQ.OperationGET <em>Operation GET</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.course.jsonQ.OperationGET
     * @see uk.ac.kcl.course.jsonQ.impl.JsonQPackageImpl#getOperationGET()
     * @generated
     */
    EEnum OPERATION_GET = eINSTANCE.getOperationGET();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.course.jsonQ.InputFieldSingle <em>Input Field Single</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.course.jsonQ.InputFieldSingle
     * @see uk.ac.kcl.course.jsonQ.impl.JsonQPackageImpl#getInputFieldSingle()
     * @generated
     */
    EEnum INPUT_FIELD_SINGLE = eINSTANCE.getInputFieldSingle();

  }

} //JsonQPackage
