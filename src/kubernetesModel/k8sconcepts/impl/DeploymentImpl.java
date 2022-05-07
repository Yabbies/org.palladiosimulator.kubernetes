/**
 */
package kubernetesModel.k8sconcepts.impl;

import kubernetesModel.k8sconcepts.Deployment;
import kubernetesModel.k8sconcepts.K8sconceptsPackage;

import kubernetesModel.repository.Pod;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kubernetesModel.k8sconcepts.impl.DeploymentImpl#getReplicas <em>Replicas</em>}</li>
 *   <li>{@link kubernetesModel.k8sconcepts.impl.DeploymentImpl#getPodReference <em>Pod Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeploymentImpl extends EntityImpl implements Deployment {
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
        return K8sconceptsPackage.Literals.DEPLOYMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getReplicas() {
        return (Integer)eDynamicGet(K8sconceptsPackage.DEPLOYMENT__REPLICAS, K8sconceptsPackage.Literals.DEPLOYMENT__REPLICAS, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReplicas(int newReplicas) {
        eDynamicSet(K8sconceptsPackage.DEPLOYMENT__REPLICAS, K8sconceptsPackage.Literals.DEPLOYMENT__REPLICAS, newReplicas);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Pod getPodReference() {
        return (Pod)eDynamicGet(K8sconceptsPackage.DEPLOYMENT__POD_REFERENCE, K8sconceptsPackage.Literals.DEPLOYMENT__POD_REFERENCE, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Pod basicGetPodReference() {
        return (Pod)eDynamicGet(K8sconceptsPackage.DEPLOYMENT__POD_REFERENCE, K8sconceptsPackage.Literals.DEPLOYMENT__POD_REFERENCE, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPodReference(Pod newPodReference) {
        eDynamicSet(K8sconceptsPackage.DEPLOYMENT__POD_REFERENCE, K8sconceptsPackage.Literals.DEPLOYMENT__POD_REFERENCE, newPodReference);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case K8sconceptsPackage.DEPLOYMENT__REPLICAS:
                return getReplicas();
            case K8sconceptsPackage.DEPLOYMENT__POD_REFERENCE:
                if (resolve) return getPodReference();
                return basicGetPodReference();
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
            case K8sconceptsPackage.DEPLOYMENT__REPLICAS:
                setReplicas((Integer)newValue);
                return;
            case K8sconceptsPackage.DEPLOYMENT__POD_REFERENCE:
                setPodReference((Pod)newValue);
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
            case K8sconceptsPackage.DEPLOYMENT__REPLICAS:
                setReplicas(REPLICAS_EDEFAULT);
                return;
            case K8sconceptsPackage.DEPLOYMENT__POD_REFERENCE:
                setPodReference((Pod)null);
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
            case K8sconceptsPackage.DEPLOYMENT__REPLICAS:
                return getReplicas() != REPLICAS_EDEFAULT;
            case K8sconceptsPackage.DEPLOYMENT__POD_REFERENCE:
                return basicGetPodReference() != null;
        }
        return super.eIsSet(featureID);
    }

} //DeploymentImpl
