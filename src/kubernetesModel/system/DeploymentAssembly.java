/**
 */
package kubernetesModel.system;

import kubernetesModel.k8sconcepts.Deployment;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment Assembly</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kubernetesModel.system.DeploymentAssembly#getDeployment <em>Deployment</em>}</li>
 * </ul>
 *
 * @see kubernetesModel.system.SystemPackage#getDeploymentAssembly()
 * @model
 * @generated
 */
public interface DeploymentAssembly extends AssemblyContext {
    /**
     * Returns the value of the '<em><b>Deployment</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Deployment</em>' reference.
     * @see #setDeployment(Deployment)
     * @see kubernetesModel.system.SystemPackage#getDeploymentAssembly_Deployment()
     * @model
     * @generated
     */
    Deployment getDeployment();

    /**
     * Sets the value of the '{@link kubernetesModel.system.DeploymentAssembly#getDeployment <em>Deployment</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Deployment</em>' reference.
     * @see #getDeployment()
     * @generated
     */
    void setDeployment(Deployment value);

} // DeploymentAssembly
