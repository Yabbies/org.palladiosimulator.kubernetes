/**
 */
package kubernetesModel.system.impl;

import kubernetesModel.k8sconcepts.Deployment;

import kubernetesModel.system.DeploymentAssembly;
import kubernetesModel.system.SystemPackage;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.core.composition.impl.AssemblyContextImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment Assembly</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kubernetesModel.system.impl.DeploymentAssemblyImpl#getDeployment <em>Deployment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeploymentAssemblyImpl extends AssemblyContextImpl implements DeploymentAssembly {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DeploymentAssemblyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SystemPackage.Literals.DEPLOYMENT_ASSEMBLY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Deployment getDeployment() {
        return (Deployment)eDynamicGet(SystemPackage.DEPLOYMENT_ASSEMBLY__DEPLOYMENT, SystemPackage.Literals.DEPLOYMENT_ASSEMBLY__DEPLOYMENT, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Deployment basicGetDeployment() {
        return (Deployment)eDynamicGet(SystemPackage.DEPLOYMENT_ASSEMBLY__DEPLOYMENT, SystemPackage.Literals.DEPLOYMENT_ASSEMBLY__DEPLOYMENT, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDeployment(Deployment newDeployment) {
        eDynamicSet(SystemPackage.DEPLOYMENT_ASSEMBLY__DEPLOYMENT, SystemPackage.Literals.DEPLOYMENT_ASSEMBLY__DEPLOYMENT, newDeployment);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SystemPackage.DEPLOYMENT_ASSEMBLY__DEPLOYMENT:
                if (resolve) return getDeployment();
                return basicGetDeployment();
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
            case SystemPackage.DEPLOYMENT_ASSEMBLY__DEPLOYMENT:
                setDeployment((Deployment)newValue);
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
            case SystemPackage.DEPLOYMENT_ASSEMBLY__DEPLOYMENT:
                setDeployment((Deployment)null);
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
            case SystemPackage.DEPLOYMENT_ASSEMBLY__DEPLOYMENT:
                return basicGetDeployment() != null;
        }
        return super.eIsSet(featureID);
    }

} //DeploymentAssemblyImpl
