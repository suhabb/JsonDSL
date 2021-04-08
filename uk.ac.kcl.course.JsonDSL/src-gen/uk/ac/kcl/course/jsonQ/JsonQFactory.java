/**
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.course.jsonQ;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.course.jsonQ.JsonQPackage
 * @generated
 */
public interface JsonQFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  JsonQFactory eINSTANCE = uk.ac.kcl.course.jsonQ.impl.JsonQFactoryImpl.init();

  /**
   * Returns a new object of class '<em>JSON Query Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>JSON Query Model</em>'.
   * @generated
   */
  JSONQueryModel createJSONQueryModel();

  /**
   * Returns a new object of class '<em>Statements</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statements</em>'.
   * @generated
   */
  Statements createStatements();

  /**
   * Returns a new object of class '<em>Aggregate Statements</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Aggregate Statements</em>'.
   * @generated
   */
  AggregateStatements createAggregateStatements();

  /**
   * Returns a new object of class '<em>Get Statements</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Get Statements</em>'.
   * @generated
   */
  GetStatements createGetStatements();

  /**
   * Returns a new object of class '<em>Additional Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Additional Query</em>'.
   * @generated
   */
  AdditionalQuery createAdditionalQuery();

  /**
   * Returns a new object of class '<em>Input Val</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Input Val</em>'.
   * @generated
   */
  InputVal createInputVal();

  /**
   * Returns a new object of class '<em>Int Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Literal</em>'.
   * @generated
   */
  IntLiteral createIntLiteral();

  /**
   * Returns a new object of class '<em>String Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Literal</em>'.
   * @generated
   */
  StringLiteral createStringLiteral();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  JsonQPackage getJsonQPackage();

} //JsonQFactory
