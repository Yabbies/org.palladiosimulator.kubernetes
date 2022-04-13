/**
 */
package kubernetesModel.resourceenvironment.impl;

import java.util.Collection;

import kubernetesModel.repository.Pod;

import kubernetesModel.resourceenvironment.Deployment;
import kubernetesModel.resourceenvironment.ResourceenvironmentPackage;
import kubernetesModel.resourceenvironment.RunningPodNestedResourceContainer;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kubernetesModel.resourceenvironment.impl.DeploymentImpl#getName <em>Name</em>}</li>
 *   <li>{@link kubernetesModel.resourceenvironment.impl.DeploymentImpl#getReplicas <em>Replicas</em>}</li>
 *   <li>{@link kubernetesModel.resourceenvironment.impl.DeploymentImpl#getPodImageReference <em>Pod Image Reference</em>}</li>
 *   <li>{@link kubernetesModel.resourceenvironment.impl.DeploymentImpl#getAllocatedPods <em>Allocated Pods</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeploymentImpl extends CDOObjectImpl implements Deployment {
    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The default value of the '{@link #getReplicas() <em>Replicas</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReplicas()
     * @generated
     * @ordered
     */
    protected static final int REPLICAS_EDEFAULT = 1;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DeploymentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ResourceenvironmentPackage.Literals.DEPLOYMENT;
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
    public String getName() {
        return (String)eDynamicGet(ResourceenvironmentPackage.DEPLOYMENT__NAME, ResourceenvironmentPackage.Literals.DEPLOYMENT__NAME, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        eDynamicSet(ResourceenvironmentPackage.DEPLOYMENT__NAME, ResourceenvironmentPackage.Literals.DEPLOYMENT__NAME, newName);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getReplicas() {
        return (Integer)eDynamicGet(ResourceenvironmentPackage.DEPLOYMENT__REPLICAS, ResourceenvironmentPackage.Literals.DEPLOYMENT__REPLICAS, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReplicas(int newReplicas) {
        eDynamicSet(ResourceenvironmentPackage.DEPLOYMENT__REPLICAS, ResourceenvironmentPackage.Literals.DEPLOYMENT__REPLICAS, newReplicas);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Pod getPodImageReference() {
        return (Pod)eDynamicGet(ResourceenvironmentPackage.DEPLOYMENT__POD_IMAGE_REFERENCE, ResourceenvironmentPackage.Literals.DEPLOYMENT__POD_IMAGE_REFERENCE, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Pod basicGetPodImageReference() {
        return (Pod)eDynamicGet(ResourceenvironmentPackage.DEPLOYMENT__POD_IMAGE_REFERENCE, ResourceenvironmentPackage.Literals.DEPLOYMENT__POD_IMAGE_REFERENCE, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPodImageReference(Pod newPodImageReference) {
        eDynamicSet(ResourceenvironmentPackage.DEPLOYMENT__POD_IMAGE_REFERENCE, ResourceenvironmentPackage.Literals.DEPLOYMENT__POD_IMAGE_REFERENCE, newPodImageReference);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<RunningPodNestedResourceContainer> getAllocatedPods() {
        return (EList<RunningPodNestedResourceContainer>)eDynamicGet(ResourceenvironmentPackage.DEPLOYMENT__ALLOCATED_PODS, ResourceenvironmentPackage.Literals.DEPLOYMENT__ALLOCATED_PODS, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ResourceenvironmentPackage.DEPLOYMENT__ALLOCATED_PODS:
                return ((InternalEList<?>)getAllocatedPods()).basicRemove(otherEnd, msgs);
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
            case ResourceenvironmentPackage.DEPLOYMENT__NAME:
                return getName();
            case ResourceenvironmentPackage.DEPLOYMENT__REPLICAS:
                return getReplicas();
            case ResourceenvironmentPackage.DEPLOYMENT__POD_IMAGE_REFERENCE:
                if (resolve) return getPodImageReference();
                return basicGetPodImageReference();
            case ResourceenvironmentPackage.DEPLOYMENT__ALLOCATED_PODS:
                return getAllocatedPods();
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
            case ResourceenvironmentPackage.DEPLOYMENT__NAME:
                setName((String)newValue);
                return;
            case ResourceenvironmentPackage.DEPLOYMENT__REPLICAS:
                setReplicas((Integer)newValue);
                return;
            case ResourceenvironmentPackage.DEPLOYMENT__POD_IMAGE_REFERENCE:
                setPodImageReference((Pod)newValue);
                return;
            case ResourceenvironmentPackage.DEPLOYMENT__ALLOCATED_PODS:
                getAllocatedPods().clear();
                getAllocatedPods().addAll((Collection<? extends RunningPodNestedResourceContainer>)newValue);
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
            case ResourceenvironmentPackage.DEPLOYMENT__NAME:
                setName(NAME_EDEFAULT);
                return;
            case ResourceenvironmentPackage.DEPLOYMENT__REPLICAS:
                setReplicas(REPLICAS_EDEFAULT);
                return;
            case ResourceenvironmentPackage.DEPLOYMENT__POD_IMAGE_REFERENCE:
                setPodImageReference((Pod)null);
                return;
            case ResourceenvironmentPackage.DEPLOYMENT__ALLOCATED_PODS:
                getAllocatedPods().clear();
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
            case ResourceenvironmentPackage.DEPLOYMENT__NAME:
                return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
            case ResourceenvironmentPackage.DEPLOYMENT__REPLICAS:
                return getReplicas() != REPLICAS_EDEFAULT;
            case ResourceenvironmentPackage.DEPLOYMENT__POD_IMAGE_REFERENCE:
                return basicGetPodImageReference() != null;
            case ResourceenvironmentPackage.DEPLOYMENT__ALLOCATED_PODS:
                return !getAllocatedPods().isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //DeploymentImpl
