/**
 */
package kubernetesModel.repository.impl;

import kubernetesModel.k8sconcepts.K8sStandardRequestLimit;

import kubernetesModel.repository.RepositoryPackage;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.repository.impl.CompositeComponentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kubernetesModel.repository.impl.ContainerImpl#getStandardLimit <em>Standard Limit</em>}</li>
 *   <li>{@link kubernetesModel.repository.impl.ContainerImpl#getStandardRequest <em>Standard Request</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerImpl extends CompositeComponentImpl implements kubernetesModel.repository.Container {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ContainerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RepositoryPackage.Literals.CONTAINER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public K8sStandardRequestLimit getStandardLimit() {
        return (K8sStandardRequestLimit)eDynamicGet(RepositoryPackage.CONTAINER__STANDARD_LIMIT, RepositoryPackage.Literals.CONTAINER__STANDARD_LIMIT, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public K8sStandardRequestLimit basicGetStandardLimit() {
        return (K8sStandardRequestLimit)eDynamicGet(RepositoryPackage.CONTAINER__STANDARD_LIMIT, RepositoryPackage.Literals.CONTAINER__STANDARD_LIMIT, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStandardLimit(K8sStandardRequestLimit newStandardLimit) {
        eDynamicSet(RepositoryPackage.CONTAINER__STANDARD_LIMIT, RepositoryPackage.Literals.CONTAINER__STANDARD_LIMIT, newStandardLimit);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public K8sStandardRequestLimit getStandardRequest() {
        return (K8sStandardRequestLimit)eDynamicGet(RepositoryPackage.CONTAINER__STANDARD_REQUEST, RepositoryPackage.Literals.CONTAINER__STANDARD_REQUEST, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public K8sStandardRequestLimit basicGetStandardRequest() {
        return (K8sStandardRequestLimit)eDynamicGet(RepositoryPackage.CONTAINER__STANDARD_REQUEST, RepositoryPackage.Literals.CONTAINER__STANDARD_REQUEST, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStandardRequest(K8sStandardRequestLimit newStandardRequest) {
        eDynamicSet(RepositoryPackage.CONTAINER__STANDARD_REQUEST, RepositoryPackage.Literals.CONTAINER__STANDARD_REQUEST, newStandardRequest);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case RepositoryPackage.CONTAINER__STANDARD_LIMIT:
                if (resolve) return getStandardLimit();
                return basicGetStandardLimit();
            case RepositoryPackage.CONTAINER__STANDARD_REQUEST:
                if (resolve) return getStandardRequest();
                return basicGetStandardRequest();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case RepositoryPackage.CONTAINER__STANDARD_LIMIT:
                setStandardLimit((K8sStandardRequestLimit)newValue);
                return;
            case RepositoryPackage.CONTAINER__STANDARD_REQUEST:
                setStandardRequest((K8sStandardRequestLimit)newValue);
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
            case RepositoryPackage.CONTAINER__STANDARD_LIMIT:
                setStandardLimit((K8sStandardRequestLimit)null);
                return;
            case RepositoryPackage.CONTAINER__STANDARD_REQUEST:
                setStandardRequest((K8sStandardRequestLimit)null);
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
            case RepositoryPackage.CONTAINER__STANDARD_LIMIT:
                return basicGetStandardLimit() != null;
            case RepositoryPackage.CONTAINER__STANDARD_REQUEST:
                return basicGetStandardRequest() != null;
        }
        return super.eIsSet(featureID);
    }

} //ContainerImpl
