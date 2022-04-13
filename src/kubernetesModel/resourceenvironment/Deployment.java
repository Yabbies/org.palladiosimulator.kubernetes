/**
 */
package kubernetesModel.resourceenvironment;

import kubernetesModel.repository.Pod;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kubernetesModel.resourceenvironment.Deployment#getName <em>Name</em>}</li>
 *   <li>{@link kubernetesModel.resourceenvironment.Deployment#getReplicas <em>Replicas</em>}</li>
 *   <li>{@link kubernetesModel.resourceenvironment.Deployment#getPodImageReference <em>Pod Image Reference</em>}</li>
 *   <li>{@link kubernetesModel.resourceenvironment.Deployment#getAllocatedPods <em>Allocated Pods</em>}</li>
 * </ul>
 *
 * @see kubernetesModel.resourceenvironment.ResourceenvironmentPackage#getDeployment()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Deployment extends CDOObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see kubernetesModel.resourceenvironment.ResourceenvironmentPackage#getDeployment_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link kubernetesModel.resourceenvironment.Deployment#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Replicas</b></em>' attribute.
     * The default value is <code>"1"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Replicas</em>' attribute.
     * @see #setReplicas(int)
     * @see kubernetesModel.resourceenvironment.ResourceenvironmentPackage#getDeployment_Replicas()
     * @model default="1"
     * @generated
     */
    int getReplicas();

    /**
     * Sets the value of the '{@link kubernetesModel.resourceenvironment.Deployment#getReplicas <em>Replicas</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Replicas</em>' attribute.
     * @see #getReplicas()
     * @generated
     */
    void setReplicas(int value);

    /**
     * Returns the value of the '<em><b>Pod Image Reference</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pod Image Reference</em>' reference.
     * @see #setPodImageReference(Pod)
     * @see kubernetesModel.resourceenvironment.ResourceenvironmentPackage#getDeployment_PodImageReference()
     * @model
     * @generated
     */
    Pod getPodImageReference();

    /**
     * Sets the value of the '{@link kubernetesModel.resourceenvironment.Deployment#getPodImageReference <em>Pod Image Reference</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pod Image Reference</em>' reference.
     * @see #getPodImageReference()
     * @generated
     */
    void setPodImageReference(Pod value);

    /**
     * Returns the value of the '<em><b>Allocated Pods</b></em>' containment reference list.
     * The list contents are of type {@link kubernetesModel.resourceenvironment.RunningPodNestedResourceContainer}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Allocated Pods</em>' containment reference list.
     * @see kubernetesModel.resourceenvironment.ResourceenvironmentPackage#getDeployment_AllocatedPods()
     * @model containment="true"
     * @generated
     */
    EList<RunningPodNestedResourceContainer> getAllocatedPods();

} // Deployment
