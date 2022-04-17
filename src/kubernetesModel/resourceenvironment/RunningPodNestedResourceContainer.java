/**
 */
package kubernetesModel.resourceenvironment;

import kubernetesModel.k8sconcepts.Deployment;

import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Running Pod Nested Resource Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kubernetesModel.resourceenvironment.RunningPodNestedResourceContainer#getSelectorDeploymentReference <em>Selector Deployment Reference</em>}</li>
 * </ul>
 *
 * @see kubernetesModel.resourceenvironment.ResourceenvironmentPackage#getRunningPodNestedResourceContainer()
 * @model
 * @generated
 */
public interface RunningPodNestedResourceContainer extends ResourceContainer {
    /**
     * Returns the value of the '<em><b>Selector Deployment Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Selector Deployment Reference</em>' containment reference.
     * @see #setSelectorDeploymentReference(Deployment)
     * @see kubernetesModel.resourceenvironment.ResourceenvironmentPackage#getRunningPodNestedResourceContainer_SelectorDeploymentReference()
     * @model containment="true"
     * @generated
     */
    Deployment getSelectorDeploymentReference();

    /**
     * Sets the value of the '{@link kubernetesModel.resourceenvironment.RunningPodNestedResourceContainer#getSelectorDeploymentReference <em>Selector Deployment Reference</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Selector Deployment Reference</em>' containment reference.
     * @see #getSelectorDeploymentReference()
     * @generated
     */
    void setSelectorDeploymentReference(Deployment value);

} // RunningPodNestedResourceContainer
