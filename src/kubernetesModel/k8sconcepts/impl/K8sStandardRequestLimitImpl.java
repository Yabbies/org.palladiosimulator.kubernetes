/**
 */
package kubernetesModel.k8sconcepts.impl;

import kubernetesModel.k8sconcepts.K8sStandardRequestLimit;
import kubernetesModel.k8sconcepts.K8sconceptsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>K8s Standard Request Limit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kubernetesModel.k8sconcepts.impl.K8sStandardRequestLimitImpl#getCpu <em>Cpu</em>}</li>
 *   <li>{@link kubernetesModel.k8sconcepts.impl.K8sStandardRequestLimitImpl#getMemory <em>Memory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class K8sStandardRequestLimitImpl extends AbstractK8sRequestLimitImpl implements K8sStandardRequestLimit {
    /**
     * The default value of the '{@link #getCpu() <em>Cpu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCpu()
     * @generated
     * @ordered
     */
    protected static final int CPU_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getMemory() <em>Memory</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMemory()
     * @generated
     * @ordered
     */
    protected static final long MEMORY_EDEFAULT = 0L;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected K8sStandardRequestLimitImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return K8sconceptsPackage.Literals.K8S_STANDARD_REQUEST_LIMIT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getCpu() {
        return (Integer)eDynamicGet(K8sconceptsPackage.K8S_STANDARD_REQUEST_LIMIT__CPU, K8sconceptsPackage.Literals.K8S_STANDARD_REQUEST_LIMIT__CPU, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCpu(int newCpu) {
        eDynamicSet(K8sconceptsPackage.K8S_STANDARD_REQUEST_LIMIT__CPU, K8sconceptsPackage.Literals.K8S_STANDARD_REQUEST_LIMIT__CPU, newCpu);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public long getMemory() {
        return (Long)eDynamicGet(K8sconceptsPackage.K8S_STANDARD_REQUEST_LIMIT__MEMORY, K8sconceptsPackage.Literals.K8S_STANDARD_REQUEST_LIMIT__MEMORY, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMemory(long newMemory) {
        eDynamicSet(K8sconceptsPackage.K8S_STANDARD_REQUEST_LIMIT__MEMORY, K8sconceptsPackage.Literals.K8S_STANDARD_REQUEST_LIMIT__MEMORY, newMemory);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case K8sconceptsPackage.K8S_STANDARD_REQUEST_LIMIT__CPU:
                return getCpu();
            case K8sconceptsPackage.K8S_STANDARD_REQUEST_LIMIT__MEMORY:
                return getMemory();
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
            case K8sconceptsPackage.K8S_STANDARD_REQUEST_LIMIT__CPU:
                setCpu((Integer)newValue);
                return;
            case K8sconceptsPackage.K8S_STANDARD_REQUEST_LIMIT__MEMORY:
                setMemory((Long)newValue);
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
            case K8sconceptsPackage.K8S_STANDARD_REQUEST_LIMIT__CPU:
                setCpu(CPU_EDEFAULT);
                return;
            case K8sconceptsPackage.K8S_STANDARD_REQUEST_LIMIT__MEMORY:
                setMemory(MEMORY_EDEFAULT);
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
            case K8sconceptsPackage.K8S_STANDARD_REQUEST_LIMIT__CPU:
                return getCpu() != CPU_EDEFAULT;
            case K8sconceptsPackage.K8S_STANDARD_REQUEST_LIMIT__MEMORY:
                return getMemory() != MEMORY_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} //K8sStandardRequestLimitImpl
