/**
 */
package kubernetesModel.k8sconcepts;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployments</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kubernetesModel.k8sconcepts.Deployments#getDeploymentInstances <em>Deployment Instances</em>}</li>
 * </ul>
 *
 * @see kubernetesModel.k8sconcepts.K8sconceptsPackage#getDeployments()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Deployments extends CDOObject {
    /**
     * Returns the value of the '<em><b>Deployment Instances</b></em>' containment reference list.
     * The list contents are of type {@link kubernetesModel.k8sconcepts.Deployment}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Deployment Instances</em>' containment reference list.
     * @see kubernetesModel.k8sconcepts.K8sconceptsPackage#getDeployments_DeploymentInstances()
     * @model containment="true"
     * @generated
     */
    EList<Deployment> getDeploymentInstances();

} // Deployments
