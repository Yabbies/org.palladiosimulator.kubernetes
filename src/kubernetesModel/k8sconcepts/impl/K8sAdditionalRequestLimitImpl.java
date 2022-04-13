/**
 */
package kubernetesModel.k8sconcepts.impl;

import java.util.Collection;

import kubernetesModel.k8sconcepts.K8sAdditionalRequestLimit;
import kubernetesModel.k8sconcepts.K8sconceptsPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>K8s Additional Request Limit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kubernetesModel.k8sconcepts.impl.K8sAdditionalRequestLimitImpl#getSpecification <em>Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class K8sAdditionalRequestLimitImpl extends AbstractK8sRequestLimitImpl implements K8sAdditionalRequestLimit {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected K8sAdditionalRequestLimitImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return K8sconceptsPackage.Literals.K8S_ADDITIONAL_REQUEST_LIMIT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<String> getSpecification() {
        return (EList<String>)eDynamicGet(K8sconceptsPackage.K8S_ADDITIONAL_REQUEST_LIMIT__SPECIFICATION, K8sconceptsPackage.Literals.K8S_ADDITIONAL_REQUEST_LIMIT__SPECIFICATION, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case K8sconceptsPackage.K8S_ADDITIONAL_REQUEST_LIMIT__SPECIFICATION:
                return getSpecification();
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
            case K8sconceptsPackage.K8S_ADDITIONAL_REQUEST_LIMIT__SPECIFICATION:
                getSpecification().clear();
                getSpecification().addAll((Collection<? extends String>)newValue);
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
            case K8sconceptsPackage.K8S_ADDITIONAL_REQUEST_LIMIT__SPECIFICATION:
                getSpecification().clear();
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
            case K8sconceptsPackage.K8S_ADDITIONAL_REQUEST_LIMIT__SPECIFICATION:
                return !getSpecification().isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //K8sAdditionalRequestLimitImpl
