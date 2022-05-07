/**
 */
package kubernetesModel.repository.impl;

import java.util.Collection;

import kubernetesModel.k8sconcepts.AbstractK8sRequestLimit;
import kubernetesModel.k8sconcepts.K8sStandardRequestLimit;

import kubernetesModel.repository.RepositoryPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

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
 *   <li>{@link kubernetesModel.repository.impl.ContainerImpl#getAdditionalRequests <em>Additional Requests</em>}</li>
 *   <li>{@link kubernetesModel.repository.impl.ContainerImpl#getAdditionalLimits <em>Additional Limits</em>}</li>
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
    public NotificationChain basicSetStandardLimit(K8sStandardRequestLimit newStandardLimit, NotificationChain msgs) {
        msgs = eDynamicInverseAdd((InternalEObject)newStandardLimit, RepositoryPackage.CONTAINER__STANDARD_LIMIT, msgs);
        return msgs;
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
    public NotificationChain basicSetStandardRequest(K8sStandardRequestLimit newStandardRequest, NotificationChain msgs) {
        msgs = eDynamicInverseAdd((InternalEObject)newStandardRequest, RepositoryPackage.CONTAINER__STANDARD_REQUEST, msgs);
        return msgs;
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
    @SuppressWarnings("unchecked")
    public EList<AbstractK8sRequestLimit> getAdditionalRequests() {
        return (EList<AbstractK8sRequestLimit>)eDynamicGet(RepositoryPackage.CONTAINER__ADDITIONAL_REQUESTS, RepositoryPackage.Literals.CONTAINER__ADDITIONAL_REQUESTS, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<AbstractK8sRequestLimit> getAdditionalLimits() {
        return (EList<AbstractK8sRequestLimit>)eDynamicGet(RepositoryPackage.CONTAINER__ADDITIONAL_LIMITS, RepositoryPackage.Literals.CONTAINER__ADDITIONAL_LIMITS, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case RepositoryPackage.CONTAINER__STANDARD_LIMIT:
                return basicSetStandardLimit(null, msgs);
            case RepositoryPackage.CONTAINER__STANDARD_REQUEST:
                return basicSetStandardRequest(null, msgs);
            case RepositoryPackage.CONTAINER__ADDITIONAL_REQUESTS:
                return ((InternalEList<?>)getAdditionalRequests()).basicRemove(otherEnd, msgs);
            case RepositoryPackage.CONTAINER__ADDITIONAL_LIMITS:
                return ((InternalEList<?>)getAdditionalLimits()).basicRemove(otherEnd, msgs);
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
            case RepositoryPackage.CONTAINER__STANDARD_LIMIT:
                return getStandardLimit();
            case RepositoryPackage.CONTAINER__STANDARD_REQUEST:
                return getStandardRequest();
            case RepositoryPackage.CONTAINER__ADDITIONAL_REQUESTS:
                return getAdditionalRequests();
            case RepositoryPackage.CONTAINER__ADDITIONAL_LIMITS:
                return getAdditionalLimits();
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
            case RepositoryPackage.CONTAINER__STANDARD_LIMIT:
                setStandardLimit((K8sStandardRequestLimit)newValue);
                return;
            case RepositoryPackage.CONTAINER__STANDARD_REQUEST:
                setStandardRequest((K8sStandardRequestLimit)newValue);
                return;
            case RepositoryPackage.CONTAINER__ADDITIONAL_REQUESTS:
                getAdditionalRequests().clear();
                getAdditionalRequests().addAll((Collection<? extends AbstractK8sRequestLimit>)newValue);
                return;
            case RepositoryPackage.CONTAINER__ADDITIONAL_LIMITS:
                getAdditionalLimits().clear();
                getAdditionalLimits().addAll((Collection<? extends AbstractK8sRequestLimit>)newValue);
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
            case RepositoryPackage.CONTAINER__ADDITIONAL_REQUESTS:
                getAdditionalRequests().clear();
                return;
            case RepositoryPackage.CONTAINER__ADDITIONAL_LIMITS:
                getAdditionalLimits().clear();
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
                return getStandardLimit() != null;
            case RepositoryPackage.CONTAINER__STANDARD_REQUEST:
                return getStandardRequest() != null;
            case RepositoryPackage.CONTAINER__ADDITIONAL_REQUESTS:
                return !getAdditionalRequests().isEmpty();
            case RepositoryPackage.CONTAINER__ADDITIONAL_LIMITS:
                return !getAdditionalLimits().isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ContainerImpl
