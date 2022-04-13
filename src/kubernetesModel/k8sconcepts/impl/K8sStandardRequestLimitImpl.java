/**
 */
package kubernetesModel.k8sconcepts.impl;

import java.util.Collection;

import kubernetesModel.k8sconcepts.K8sStandardRequestLimit;
import kubernetesModel.k8sconcepts.K8sconceptsPackage;

import org.eclipse.emf.common.util.EList;

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
    @SuppressWarnings("unchecked")
    public EList<Integer> getCpu() {
        return (EList<Integer>)eDynamicGet(K8sconceptsPackage.K8S_STANDARD_REQUEST_LIMIT__CPU, K8sconceptsPackage.Literals.K8S_STANDARD_REQUEST_LIMIT__CPU, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<Integer> getMemory() {
        return (EList<Integer>)eDynamicGet(K8sconceptsPackage.K8S_STANDARD_REQUEST_LIMIT__MEMORY, K8sconceptsPackage.Literals.K8S_STANDARD_REQUEST_LIMIT__MEMORY, true, true);
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
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case K8sconceptsPackage.K8S_STANDARD_REQUEST_LIMIT__CPU:
                getCpu().clear();
                getCpu().addAll((Collection<? extends Integer>)newValue);
                return;
            case K8sconceptsPackage.K8S_STANDARD_REQUEST_LIMIT__MEMORY:
                getMemory().clear();
                getMemory().addAll((Collection<? extends Integer>)newValue);
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
                getCpu().clear();
                return;
            case K8sconceptsPackage.K8S_STANDARD_REQUEST_LIMIT__MEMORY:
                getMemory().clear();
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
                return !getCpu().isEmpty();
            case K8sconceptsPackage.K8S_STANDARD_REQUEST_LIMIT__MEMORY:
                return !getMemory().isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //K8sStandardRequestLimitImpl
