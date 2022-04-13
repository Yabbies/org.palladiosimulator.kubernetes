/**
 */
package kubernetesModel.repository.impl;

import java.math.BigInteger;

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
 *   <li>{@link kubernetesModel.repository.impl.ContainerImpl#getContainerMemoryRequest <em>Container Memory Request</em>}</li>
 *   <li>{@link kubernetesModel.repository.impl.ContainerImpl#getContainerMemoryLimit <em>Container Memory Limit</em>}</li>
 *   <li>{@link kubernetesModel.repository.impl.ContainerImpl#getContainerCPURequest <em>Container CPU Request</em>}</li>
 *   <li>{@link kubernetesModel.repository.impl.ContainerImpl#getContainerCPULimit <em>Container CPU Limit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerImpl extends CompositeComponentImpl implements kubernetesModel.repository.Container {
    /**
     * The default value of the '{@link #getContainerMemoryRequest() <em>Container Memory Request</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContainerMemoryRequest()
     * @generated
     * @ordered
     */
    protected static final BigInteger CONTAINER_MEMORY_REQUEST_EDEFAULT = null;

    /**
     * The default value of the '{@link #getContainerMemoryLimit() <em>Container Memory Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContainerMemoryLimit()
     * @generated
     * @ordered
     */
    protected static final BigInteger CONTAINER_MEMORY_LIMIT_EDEFAULT = null;

    /**
     * The default value of the '{@link #getContainerCPURequest() <em>Container CPU Request</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContainerCPURequest()
     * @generated
     * @ordered
     */
    protected static final int CONTAINER_CPU_REQUEST_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getContainerCPULimit() <em>Container CPU Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContainerCPULimit()
     * @generated
     * @ordered
     */
    protected static final int CONTAINER_CPU_LIMIT_EDEFAULT = 0;

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
    public BigInteger getContainerMemoryRequest() {
        return (BigInteger)eDynamicGet(RepositoryPackage.CONTAINER__CONTAINER_MEMORY_REQUEST, RepositoryPackage.Literals.CONTAINER__CONTAINER_MEMORY_REQUEST, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContainerMemoryRequest(BigInteger newContainerMemoryRequest) {
        eDynamicSet(RepositoryPackage.CONTAINER__CONTAINER_MEMORY_REQUEST, RepositoryPackage.Literals.CONTAINER__CONTAINER_MEMORY_REQUEST, newContainerMemoryRequest);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BigInteger getContainerMemoryLimit() {
        return (BigInteger)eDynamicGet(RepositoryPackage.CONTAINER__CONTAINER_MEMORY_LIMIT, RepositoryPackage.Literals.CONTAINER__CONTAINER_MEMORY_LIMIT, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContainerMemoryLimit(BigInteger newContainerMemoryLimit) {
        eDynamicSet(RepositoryPackage.CONTAINER__CONTAINER_MEMORY_LIMIT, RepositoryPackage.Literals.CONTAINER__CONTAINER_MEMORY_LIMIT, newContainerMemoryLimit);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getContainerCPURequest() {
        return (Integer)eDynamicGet(RepositoryPackage.CONTAINER__CONTAINER_CPU_REQUEST, RepositoryPackage.Literals.CONTAINER__CONTAINER_CPU_REQUEST, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContainerCPURequest(int newContainerCPURequest) {
        eDynamicSet(RepositoryPackage.CONTAINER__CONTAINER_CPU_REQUEST, RepositoryPackage.Literals.CONTAINER__CONTAINER_CPU_REQUEST, newContainerCPURequest);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getContainerCPULimit() {
        return (Integer)eDynamicGet(RepositoryPackage.CONTAINER__CONTAINER_CPU_LIMIT, RepositoryPackage.Literals.CONTAINER__CONTAINER_CPU_LIMIT, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContainerCPULimit(int newContainerCPULimit) {
        eDynamicSet(RepositoryPackage.CONTAINER__CONTAINER_CPU_LIMIT, RepositoryPackage.Literals.CONTAINER__CONTAINER_CPU_LIMIT, newContainerCPULimit);
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
            case RepositoryPackage.CONTAINER__CONTAINER_MEMORY_REQUEST:
                return getContainerMemoryRequest();
            case RepositoryPackage.CONTAINER__CONTAINER_MEMORY_LIMIT:
                return getContainerMemoryLimit();
            case RepositoryPackage.CONTAINER__CONTAINER_CPU_REQUEST:
                return getContainerCPURequest();
            case RepositoryPackage.CONTAINER__CONTAINER_CPU_LIMIT:
                return getContainerCPULimit();
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
            case RepositoryPackage.CONTAINER__CONTAINER_MEMORY_REQUEST:
                setContainerMemoryRequest((BigInteger)newValue);
                return;
            case RepositoryPackage.CONTAINER__CONTAINER_MEMORY_LIMIT:
                setContainerMemoryLimit((BigInteger)newValue);
                return;
            case RepositoryPackage.CONTAINER__CONTAINER_CPU_REQUEST:
                setContainerCPURequest((Integer)newValue);
                return;
            case RepositoryPackage.CONTAINER__CONTAINER_CPU_LIMIT:
                setContainerCPULimit((Integer)newValue);
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
            case RepositoryPackage.CONTAINER__CONTAINER_MEMORY_REQUEST:
                setContainerMemoryRequest(CONTAINER_MEMORY_REQUEST_EDEFAULT);
                return;
            case RepositoryPackage.CONTAINER__CONTAINER_MEMORY_LIMIT:
                setContainerMemoryLimit(CONTAINER_MEMORY_LIMIT_EDEFAULT);
                return;
            case RepositoryPackage.CONTAINER__CONTAINER_CPU_REQUEST:
                setContainerCPURequest(CONTAINER_CPU_REQUEST_EDEFAULT);
                return;
            case RepositoryPackage.CONTAINER__CONTAINER_CPU_LIMIT:
                setContainerCPULimit(CONTAINER_CPU_LIMIT_EDEFAULT);
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
            case RepositoryPackage.CONTAINER__CONTAINER_MEMORY_REQUEST:
                return CONTAINER_MEMORY_REQUEST_EDEFAULT == null ? getContainerMemoryRequest() != null : !CONTAINER_MEMORY_REQUEST_EDEFAULT.equals(getContainerMemoryRequest());
            case RepositoryPackage.CONTAINER__CONTAINER_MEMORY_LIMIT:
                return CONTAINER_MEMORY_LIMIT_EDEFAULT == null ? getContainerMemoryLimit() != null : !CONTAINER_MEMORY_LIMIT_EDEFAULT.equals(getContainerMemoryLimit());
            case RepositoryPackage.CONTAINER__CONTAINER_CPU_REQUEST:
                return getContainerCPURequest() != CONTAINER_CPU_REQUEST_EDEFAULT;
            case RepositoryPackage.CONTAINER__CONTAINER_CPU_LIMIT:
                return getContainerCPULimit() != CONTAINER_CPU_LIMIT_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} //ContainerImpl
