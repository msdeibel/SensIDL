/**
 */
package de.fzi.sensidl.design.sensidl.dataRepresentation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationPackage
 * @generated
 */
public interface DataRepresentationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataRepresentationFactory eINSTANCE = de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataRepresentationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sensor Data Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor Data Description</em>'.
	 * @generated
	 */
	SensorDataDescription createSensorDataDescription();

	/**
	 * Returns a new object of class '<em>Data Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Set</em>'.
	 * @generated
	 */
	DataSet createDataSet();

	/**
	 * Returns a new object of class '<em>Measurement Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measurement Data</em>'.
	 * @generated
	 */
	MeasurementData createMeasurementData();

	/**
	 * Returns a new object of class '<em>Non Measurement Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Non Measurement Data</em>'.
	 * @generated
	 */
	NonMeasurementData createNonMeasurementData();

	/**
	 * Returns a new object of class '<em>Data Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Range</em>'.
	 * @generated
	 */
	DataRange createDataRange();

	/**
	 * Returns a new object of class '<em>Data Conversion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Conversion</em>'.
	 * @generated
	 */
	DataConversion createDataConversion();

	/**
	 * Returns a new object of class '<em>Linear Data Conversion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Linear Data Conversion</em>'.
	 * @generated
	 */
	LinearDataConversion createLinearDataConversion();

	/**
	 * Returns a new object of class '<em>Linear Data Conversion With Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Linear Data Conversion With Interval</em>'.
	 * @generated
	 */
	LinearDataConversionWithInterval createLinearDataConversionWithInterval();

	/**
	 * Returns a new object of class '<em>Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interval</em>'.
	 * @generated
	 */
	Interval createInterval();

	/**
	 * Returns a new object of class '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method</em>'.
	 * @generated
	 */
	Method createMethod();

	/**
	 * Returns a new object of class '<em>Method Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Parameter</em>'.
	 * @generated
	 */
	MethodParameter createMethodParameter();

	/**
	 * Returns a new object of class '<em>List Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Data</em>'.
	 * @generated
	 */
	ListData createListData();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DataRepresentationPackage getDataRepresentationPackage();

} //DataRepresentationFactory
