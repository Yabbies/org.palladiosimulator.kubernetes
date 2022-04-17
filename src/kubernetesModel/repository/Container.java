/**
 */
package kubernetesModel.repository;

import kubernetesModel.k8sconcepts.K8sStandardRequestLimit;

import org.palladiosimulator.pcm.repository.CompositeComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kubernetesModel.repository.Container#getStandardLimit <em>Standard Limit</em>}</li>
 *   <li>{@link kubernetesModel.repository.Container#getStandardRequest <em>Standard Request</em>}</li>
 * </ul>
 *
 * @see kubernetesModel.repository.RepositoryPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends CompositeComponent {
    /**
     * Returns the value of the '<em><b>Standard Limit</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Standard Limit</em>' reference.
     * @see #setStandardLimit(K8sStandardRequestLimit)
     * @see kubernetesModel.repository.RepositoryPackage#getContainer_StandardLimit()
     * @model
     * @generated
     */
    K8sStandardRequestLimit getStandardLimit();

    /**
     * Sets the value of the '{@link kubernetesModel.repository.Container#getStandardLimit <em>Standard Limit</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Standard Limit</em>' reference.
     * @see #getStandardLimit()
     * @generated
     */
    void setStandardLimit(K8sStandardRequestLimit value);

    /**
     * Returns the value of the '<em><b>Standard Request</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Standard Request</em>' reference.
     * @see #setStandardRequest(K8sStandardRequestLimit)
     * @see kubernetesModel.repository.RepositoryPackage#getContainer_StandardRequest()
     * @model
     * @generated
     */
    K8sStandardRequestLimit getStandardRequest();

    /**
     * Sets the value of the '{@link kubernetesModel.repository.Container#getStandardRequest <em>Standard Request</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Standard Request</em>' reference.
     * @see #getStandardRequest()
     * @generated
     */
    void setStandardRequest(K8sStandardRequestLimit value);

} // Container
