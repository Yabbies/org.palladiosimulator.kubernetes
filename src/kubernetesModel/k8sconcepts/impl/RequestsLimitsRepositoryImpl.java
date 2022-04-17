/**
 */
package kubernetesModel.k8sconcepts.impl;

import java.util.Collection;

import kubernetesModel.k8sconcepts.AbstractK8sRequestLimit;
import kubernetesModel.k8sconcepts.K8sconceptsPackage;
import kubernetesModel.k8sconcepts.RequestsLimitsRepository;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requests Limits Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kubernetesModel.k8sconcepts.impl.RequestsLimitsRepositoryImpl#getRequestsLimitsRepo <em>Requests Limits Repo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequestsLimitsRepositoryImpl extends CDOObjectImpl implements RequestsLimitsRepository {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RequestsLimitsRepositoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return K8sconceptsPackage.Literals.REQUESTS_LIMITS_REPOSITORY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<AbstractK8sRequestLimit> getRequestsLimitsRepo() {
        return (EList<AbstractK8sRequestLimit>)eDynamicGet(K8sconceptsPackage.REQUESTS_LIMITS_REPOSITORY__REQUESTS_LIMITS_REPO, K8sconceptsPackage.Literals.REQUESTS_LIMITS_REPOSITORY__REQUESTS_LIMITS_REPO, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case K8sconceptsPackage.REQUESTS_LIMITS_REPOSITORY__REQUESTS_LIMITS_REPO:
                return ((InternalEList<?>)getRequestsLimitsRepo()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case K8sconceptsPackage.REQUESTS_LIMITS_REPOSITORY__REQUESTS_LIMITS_REPO:
                return getRequestsLimitsRepo();
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
            case K8sconceptsPackage.REQUESTS_LIMITS_REPOSITORY__REQUESTS_LIMITS_REPO:
                getRequestsLimitsRepo().clear();
                getRequestsLimitsRepo().addAll((Collection<? extends AbstractK8sRequestLimit>)newValue);
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
            case K8sconceptsPackage.REQUESTS_LIMITS_REPOSITORY__REQUESTS_LIMITS_REPO:
                getRequestsLimitsRepo().clear();
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
            case K8sconceptsPackage.REQUESTS_LIMITS_REPOSITORY__REQUESTS_LIMITS_REPO:
                return !getRequestsLimitsRepo().isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //RequestsLimitsRepositoryImpl
