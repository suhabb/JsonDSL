/**
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.course.jsonQ.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.kcl.course.jsonQ.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JsonQFactoryImpl extends EFactoryImpl implements JsonQFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static JsonQFactory init()
  {
    try
    {
      JsonQFactory theJsonQFactory = (JsonQFactory)EPackage.Registry.INSTANCE.getEFactory(JsonQPackage.eNS_URI);
      if (theJsonQFactory != null)
      {
        return theJsonQFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new JsonQFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonQFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case JsonQPackage.JSON_QUERY_MODEL: return createJSONQueryModel();
      case JsonQPackage.STATEMENTS: return createStatements();
      case JsonQPackage.AGGREGATE_STATEMENTS: return createAggregateStatements();
      case JsonQPackage.GET_STATEMENTS: return createGetStatements();
      case JsonQPackage.ADDITIONAL_QUERY: return createAdditionalQuery();
      case JsonQPackage.INPUT_VAL: return createInputVal();
      case JsonQPackage.INT_LITERAL: return createIntLiteral();
      case JsonQPackage.STRING_LITERAL: return createStringLiteral();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case JsonQPackage.CONNECTOR:
        return createConnectorFromString(eDataType, initialValue);
      case JsonQPackage.OPERATION_AGG:
        return createOperationAggFromString(eDataType, initialValue);
      case JsonQPackage.OPERATION_GET:
        return createOperationGETFromString(eDataType, initialValue);
      case JsonQPackage.INPUT_FIELD_SINGLE:
        return createInputFieldSingleFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case JsonQPackage.CONNECTOR:
        return convertConnectorToString(eDataType, instanceValue);
      case JsonQPackage.OPERATION_AGG:
        return convertOperationAggToString(eDataType, instanceValue);
      case JsonQPackage.OPERATION_GET:
        return convertOperationGETToString(eDataType, instanceValue);
      case JsonQPackage.INPUT_FIELD_SINGLE:
        return convertInputFieldSingleToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public JSONQueryModel createJSONQueryModel()
  {
    JSONQueryModelImpl jsonQueryModel = new JSONQueryModelImpl();
    return jsonQueryModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Statements createStatements()
  {
    StatementsImpl statements = new StatementsImpl();
    return statements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AggregateStatements createAggregateStatements()
  {
    AggregateStatementsImpl aggregateStatements = new AggregateStatementsImpl();
    return aggregateStatements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GetStatements createGetStatements()
  {
    GetStatementsImpl getStatements = new GetStatementsImpl();
    return getStatements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AdditionalQuery createAdditionalQuery()
  {
    AdditionalQueryImpl additionalQuery = new AdditionalQueryImpl();
    return additionalQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InputVal createInputVal()
  {
    InputValImpl inputVal = new InputValImpl();
    return inputVal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IntLiteral createIntLiteral()
  {
    IntLiteralImpl intLiteral = new IntLiteralImpl();
    return intLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Connector createConnectorFromString(EDataType eDataType, String initialValue)
  {
    Connector result = Connector.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertConnectorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationAgg createOperationAggFromString(EDataType eDataType, String initialValue)
  {
    OperationAgg result = OperationAgg.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOperationAggToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationGET createOperationGETFromString(EDataType eDataType, String initialValue)
  {
    OperationGET result = OperationGET.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOperationGETToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputFieldSingle createInputFieldSingleFromString(EDataType eDataType, String initialValue)
  {
    InputFieldSingle result = InputFieldSingle.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertInputFieldSingleToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public JsonQPackage getJsonQPackage()
  {
    return (JsonQPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static JsonQPackage getPackage()
  {
    return JsonQPackage.eINSTANCE;
  }

} //JsonQFactoryImpl
