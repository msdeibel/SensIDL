/**
 */
package de.fzi.sensidl.design.sensidl.dataRepresentation.impl;

import de.fzi.sensidl.design.sensidl.dataRepresentation.Data;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataRepresentationPackage;
import de.fzi.sensidl.design.sensidl.dataRepresentation.DataSet;
import de.fzi.sensidl.design.sensidl.dataRepresentation.Method;
import de.fzi.sensidl.design.sensidl.dataRepresentation.SensorDataDescription;
import de.fzi.sensidl.design.sensidl.impl.NamedElementImpl;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataSetImpl#getSensorDataDescription <em>Sensor Data Description</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataSetImpl#getData <em>Data</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataSetImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataSetImpl#getUsedDataSets <em>Used Data Sets</em>}</li>
 *   <li>{@link de.fzi.sensidl.design.sensidl.dataRepresentation.impl.DataSetImpl#getUsedByDataSets <em>Used By Data Sets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataSetImpl extends NamedElementImpl implements DataSet {
	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> data;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<Method> method;

	/**
	 * The cached value of the '{@link #getUsedDataSets() <em>Used Data Sets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedDataSets()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSet> usedDataSets;

	/**
	 * The cached value of the '{@link #getUsedByDataSets() <em>Used By Data Sets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedByDataSets()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSet> usedByDataSets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataRepresentationPackage.Literals.DATA_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorDataDescription getSensorDataDescription() {
		if (eContainerFeatureID() != DataRepresentationPackage.DATA_SET__SENSOR_DATA_DESCRIPTION) return null;
		return (SensorDataDescription)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSensorDataDescription(SensorDataDescription newSensorDataDescription, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSensorDataDescription, DataRepresentationPackage.DATA_SET__SENSOR_DATA_DESCRIPTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensorDataDescription(SensorDataDescription newSensorDataDescription) {
		if (newSensorDataDescription != eInternalContainer() || (eContainerFeatureID() != DataRepresentationPackage.DATA_SET__SENSOR_DATA_DESCRIPTION && newSensorDataDescription != null)) {
			if (EcoreUtil.isAncestor(this, newSensorDataDescription))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSensorDataDescription != null)
				msgs = ((InternalEObject)newSensorDataDescription).eInverseAdd(this, DataRepresentationPackage.SENSOR_DATA_DESCRIPTION__DATA_SETS, SensorDataDescription.class, msgs);
			msgs = basicSetSensorDataDescription(newSensorDataDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataRepresentationPackage.DATA_SET__SENSOR_DATA_DESCRIPTION, newSensorDataDescription, newSensorDataDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data> getData() {
		if (data == null) {
			data = new EObjectContainmentWithInverseEList<Data>(Data.class, this, DataRepresentationPackage.DATA_SET__DATA, DataRepresentationPackage.DATA__DATA_SET);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Method> getMethod() {
		if (method == null) {
			method = new EObjectContainmentWithInverseEList<Method>(Method.class, this, DataRepresentationPackage.DATA_SET__METHOD, DataRepresentationPackage.METHOD__DATA_SET);
		}
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataSet> getUsedDataSets() {
		if (usedDataSets == null) {
			usedDataSets = new EObjectWithInverseResolvingEList.ManyInverse<DataSet>(DataSet.class, this, DataRepresentationPackage.DATA_SET__USED_DATA_SETS, DataRepresentationPackage.DATA_SET__USED_BY_DATA_SETS);
		}
		return usedDataSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataSet> getUsedByDataSets() {
		if (usedByDataSets == null) {
			usedByDataSets = new EObjectWithInverseResolvingEList.ManyInverse<DataSet>(DataSet.class, this, DataRepresentationPackage.DATA_SET__USED_BY_DATA_SETS, DataRepresentationPackage.DATA_SET__USED_DATA_SETS);
		}
		return usedByDataSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataRepresentationPackage.DATA_SET__SENSOR_DATA_DESCRIPTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSensorDataDescription((SensorDataDescription)otherEnd, msgs);
			case DataRepresentationPackage.DATA_SET__DATA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getData()).basicAdd(otherEnd, msgs);
			case DataRepresentationPackage.DATA_SET__METHOD:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMethod()).basicAdd(otherEnd, msgs);
			case DataRepresentationPackage.DATA_SET__USED_DATA_SETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsedDataSets()).basicAdd(otherEnd, msgs);
			case DataRepresentationPackage.DATA_SET__USED_BY_DATA_SETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsedByDataSets()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataRepresentationPackage.DATA_SET__SENSOR_DATA_DESCRIPTION:
				return basicSetSensorDataDescription(null, msgs);
			case DataRepresentationPackage.DATA_SET__DATA:
				return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
			case DataRepresentationPackage.DATA_SET__METHOD:
				return ((InternalEList<?>)getMethod()).basicRemove(otherEnd, msgs);
			case DataRepresentationPackage.DATA_SET__USED_DATA_SETS:
				return ((InternalEList<?>)getUsedDataSets()).basicRemove(otherEnd, msgs);
			case DataRepresentationPackage.DATA_SET__USED_BY_DATA_SETS:
				return ((InternalEList<?>)getUsedByDataSets()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case DataRepresentationPackage.DATA_SET__SENSOR_DATA_DESCRIPTION:
				return eInternalContainer().eInverseRemove(this, DataRepresentationPackage.SENSOR_DATA_DESCRIPTION__DATA_SETS, SensorDataDescription.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataRepresentationPackage.DATA_SET__SENSOR_DATA_DESCRIPTION:
				return getSensorDataDescription();
			case DataRepresentationPackage.DATA_SET__DATA:
				return getData();
			case DataRepresentationPackage.DATA_SET__METHOD:
				return getMethod();
			case DataRepresentationPackage.DATA_SET__USED_DATA_SETS:
				return getUsedDataSets();
			case DataRepresentationPackage.DATA_SET__USED_BY_DATA_SETS:
				return getUsedByDataSets();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DataRepresentationPackage.DATA_SET__SENSOR_DATA_DESCRIPTION:
				setSensorDataDescription((SensorDataDescription)newValue);
				return;
			case DataRepresentationPackage.DATA_SET__DATA:
				getData().clear();
				getData().addAll((Collection<? extends Data>)newValue);
				return;
			case DataRepresentationPackage.DATA_SET__METHOD:
				getMethod().clear();
				getMethod().addAll((Collection<? extends Method>)newValue);
				return;
			case DataRepresentationPackage.DATA_SET__USED_DATA_SETS:
				getUsedDataSets().clear();
				getUsedDataSets().addAll((Collection<? extends DataSet>)newValue);
				return;
			case DataRepresentationPackage.DATA_SET__USED_BY_DATA_SETS:
				getUsedByDataSets().clear();
				getUsedByDataSets().addAll((Collection<? extends DataSet>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case DataRepresentationPackage.DATA_SET__SENSOR_DATA_DESCRIPTION:
				setSensorDataDescription((SensorDataDescription)null);
				return;
			case DataRepresentationPackage.DATA_SET__DATA:
				getData().clear();
				return;
			case DataRepresentationPackage.DATA_SET__METHOD:
				getMethod().clear();
				return;
			case DataRepresentationPackage.DATA_SET__USED_DATA_SETS:
				getUsedDataSets().clear();
				return;
			case DataRepresentationPackage.DATA_SET__USED_BY_DATA_SETS:
				getUsedByDataSets().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DataRepresentationPackage.DATA_SET__SENSOR_DATA_DESCRIPTION:
				return getSensorDataDescription() != null;
			case DataRepresentationPackage.DATA_SET__DATA:
				return data != null && !data.isEmpty();
			case DataRepresentationPackage.DATA_SET__METHOD:
				return method != null && !method.isEmpty();
			case DataRepresentationPackage.DATA_SET__USED_DATA_SETS:
				return usedDataSets != null && !usedDataSets.isEmpty();
			case DataRepresentationPackage.DATA_SET__USED_BY_DATA_SETS:
				return usedByDataSets != null && !usedByDataSets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataSetImpl
