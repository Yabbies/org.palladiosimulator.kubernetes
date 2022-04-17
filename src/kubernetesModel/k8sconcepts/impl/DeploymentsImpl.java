/**
 */
package kubernetesModel.k8sconcepts.impl;

import java.util.Collection;

import kubernetesModel.k8sconcepts.Deployment;
import kubernetesModel.k8sconcepts.Deployments;
import kubernetesModel.k8sconcepts.K8sconceptsPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployments</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kubernetesModel.k8sconcepts.impl.DeploymentsImpl#getDeploymentInstances <em>Deployment Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeploymentsImpl extends CDOObjectImpl implements Deployments {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DeploymentsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return K8sconceptsPackage.Literals.DEPLOYMENTS;
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
    public EList<Deployment> getDeploymentInstances() {
        return (EList<Deployment>)eDynamicGet(K8sconceptsPackage.DEPLOYMENTS__DEPLOYMENT_INSTANCES, K8sconceptsPackage.Literals.DEPLOYMENTS__DEPLOYMENT_INSTANCES, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case K8sconceptsPackage.DEPLOYMENTS__DEPLOYMENT_INSTANCES:
                return ((InternalEList<?>)getDeploymentInstances()).basicRemove(otherEnd, msgs);
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
            case K8sconceptsPackage.DEPLOYMENTS__DEPLOYMENT_INSTANCES:
                return getDeploymentInstances();
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
            case K8sconceptsPackage.DEPLOYMENTS__DEPLOYMENT_INSTANCES:
                getDeploymentInstances().clear();
                getDeploymentInstances().addAll((Collection<? extends Deployment>)newValue);
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
            case K8sconceptsPackage.DEPLOYMENTS__DEPLOYMENT_INSTANCES:
                getDeploymentInstances().clear();
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
            case K8sconceptsPackage.DEPLOYMENTS__DEPLOYMENT_INSTANCES:
                return !getDeploymentInstances().isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //DeploymentsImpl
