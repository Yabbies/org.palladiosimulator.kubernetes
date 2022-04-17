/**
 */
package kubernetesModel.resourceenvironment.impl;

import kubernetesModel.k8sconcepts.Deployment;

import kubernetesModel.resourceenvironment.ResourceenvironmentPackage;
import kubernetesModel.resourceenvironment.RunningPodNestedResourceContainer;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.palladiosimulator.pcm.resourceenvironment.impl.ResourceContainerImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Running Pod Nested Resource Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kubernetesModel.resourceenvironment.impl.RunningPodNestedResourceContainerImpl#getSelectorDeploymentReference <em>Selector Deployment Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RunningPodNestedResourceContainerImpl extends ResourceContainerImpl implements RunningPodNestedResourceContainer {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RunningPodNestedResourceContainerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ResourceenvironmentPackage.Literals.RUNNING_POD_NESTED_RESOURCE_CONTAINER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Deployment getSelectorDeploymentReference() {
        return (Deployment)eDynamicGet(ResourceenvironmentPackage.RUNNING_POD_NESTED_RESOURCE_CONTAINER__SELECTOR_DEPLOYMENT_REFERENCE, ResourceenvironmentPackage.Literals.RUNNING_POD_NESTED_RESOURCE_CONTAINER__SELECTOR_DEPLOYMENT_REFERENCE, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSelectorDeploymentReference(Deployment newSelectorDeploymentReference, NotificationChain msgs) {
        msgs = eDynamicInverseAdd((InternalEObject)newSelectorDeploymentReference, ResourceenvironmentPackage.RUNNING_POD_NESTED_RESOURCE_CONTAINER__SELECTOR_DEPLOYMENT_REFERENCE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSelectorDeploymentReference(Deployment newSelectorDeploymentReference) {
        eDynamicSet(ResourceenvironmentPackage.RUNNING_POD_NESTED_RESOURCE_CONTAINER__SELECTOR_DEPLOYMENT_REFERENCE, ResourceenvironmentPackage.Literals.RUNNING_POD_NESTED_RESOURCE_CONTAINER__SELECTOR_DEPLOYMENT_REFERENCE, newSelectorDeploymentReference);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ResourceenvironmentPackage.RUNNING_POD_NESTED_RESOURCE_CONTAINER__SELECTOR_DEPLOYMENT_REFERENCE:
                return basicSetSelectorDeploymentReference(null, msgs);
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
            case ResourceenvironmentPackage.RUNNING_POD_NESTED_RESOURCE_CONTAINER__SELECTOR_DEPLOYMENT_REFERENCE:
                return getSelectorDeploymentReference();
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
            case ResourceenvironmentPackage.RUNNING_POD_NESTED_RESOURCE_CONTAINER__SELECTOR_DEPLOYMENT_REFERENCE:
                setSelectorDeploymentReference((Deployment)newValue);
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
            case ResourceenvironmentPackage.RUNNING_POD_NESTED_RESOURCE_CONTAINER__SELECTOR_DEPLOYMENT_REFERENCE:
                setSelectorDeploymentReference((Deployment)null);
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
            case ResourceenvironmentPackage.RUNNING_POD_NESTED_RESOURCE_CONTAINER__SELECTOR_DEPLOYMENT_REFERENCE:
                return getSelectorDeploymentReference() != null;
        }
        return super.eIsSet(featureID);
    }

} //RunningPodNestedResourceContainerImpl
