/**
 */
package kubernetesModel.k8sconcepts;

import kubernetesModel.repository.Pod;

import kubernetesModel.resourceenvironment.RunningPodNestedResourceContainer;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kubernetesModel.k8sconcepts.Deployment#getReplicas <em>Replicas</em>}</li>
 *   <li>{@link kubernetesModel.k8sconcepts.Deployment#getPodReference <em>Pod Reference</em>}</li>
 *   <li>{@link kubernetesModel.k8sconcepts.Deployment#getAllocatedPods <em>Allocated Pods</em>}</li>
 *   <li>{@link kubernetesModel.k8sconcepts.Deployment#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see kubernetesModel.k8sconcepts.K8sconceptsPackage#getDeployment()
 * @model
 * @generated
 */
public interface Deployment extends Entity {
    /**
     * Returns the value of the '<em><b>Replicas</b></em>' attribute.
     * The default value is <code>"1"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Replicas</em>' attribute.
     * @see #setReplicas(int)
     * @see kubernetesModel.k8sconcepts.K8sconceptsPackage#getDeployment_Replicas()
     * @model default="1"
     * @generated
     */
    int getReplicas();

    /**
     * Sets the value of the '{@link kubernetesModel.k8sconcepts.Deployment#getReplicas <em>Replicas</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Replicas</em>' attribute.
     * @see #getReplicas()
     * @generated
     */
    void setReplicas(int value);

    /**
     * Returns the value of the '<em><b>Pod Reference</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pod Reference</em>' reference.
     * @see #setPodReference(Pod)
     * @see kubernetesModel.k8sconcepts.K8sconceptsPackage#getDeployment_PodReference()
     * @model
     * @generated
     */
    Pod getPodReference();

    /**
     * Sets the value of the '{@link kubernetesModel.k8sconcepts.Deployment#getPodReference <em>Pod Reference</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pod Reference</em>' reference.
     * @see #getPodReference()
     * @generated
     */
    void setPodReference(Pod value);

    /**
     * Returns the value of the '<em><b>Allocated Pods</b></em>' containment reference list.
     * The list contents are of type {@link kubernetesModel.resourceenvironment.RunningPodNestedResourceContainer}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Allocated Pods</em>' containment reference list.
     * @see kubernetesModel.k8sconcepts.K8sconceptsPackage#getDeployment_AllocatedPods()
     * @model containment="true"
     * @generated
     */
    EList<RunningPodNestedResourceContainer> getAllocatedPods();

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see kubernetesModel.k8sconcepts.K8sconceptsPackage#getDeployment_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link kubernetesModel.k8sconcepts.Deployment#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // Deployment
