/**
 */
package kubernetesModel.repository;

import kubernetesModel.k8sconcepts.AbstractK8sRequestLimit;
import kubernetesModel.k8sconcepts.K8sStandardRequestLimit;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link kubernetesModel.repository.Container#getAdditionalRequests <em>Additional Requests</em>}</li>
 *   <li>{@link kubernetesModel.repository.Container#getAdditionalLimits <em>Additional Limits</em>}</li>
 * </ul>
 *
 * @see kubernetesModel.repository.RepositoryPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends CompositeComponent {
    /**
     * Returns the value of the '<em><b>Standard Limit</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Standard Limit</em>' containment reference.
     * @see #setStandardLimit(K8sStandardRequestLimit)
     * @see kubernetesModel.repository.RepositoryPackage#getContainer_StandardLimit()
     * @model containment="true"
     * @generated
     */
    K8sStandardRequestLimit getStandardLimit();

    /**
     * Sets the value of the '{@link kubernetesModel.repository.Container#getStandardLimit <em>Standard Limit</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Standard Limit</em>' containment reference.
     * @see #getStandardLimit()
     * @generated
     */
    void setStandardLimit(K8sStandardRequestLimit value);

    /**
     * Returns the value of the '<em><b>Standard Request</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Standard Request</em>' containment reference.
     * @see #setStandardRequest(K8sStandardRequestLimit)
     * @see kubernetesModel.repository.RepositoryPackage#getContainer_StandardRequest()
     * @model containment="true"
     * @generated
     */
    K8sStandardRequestLimit getStandardRequest();

    /**
     * Sets the value of the '{@link kubernetesModel.repository.Container#getStandardRequest <em>Standard Request</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Standard Request</em>' containment reference.
     * @see #getStandardRequest()
     * @generated
     */
    void setStandardRequest(K8sStandardRequestLimit value);

    /**
     * Returns the value of the '<em><b>Additional Requests</b></em>' containment reference list.
     * The list contents are of type {@link kubernetesModel.k8sconcepts.AbstractK8sRequestLimit}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Additional Requests</em>' containment reference list.
     * @see kubernetesModel.repository.RepositoryPackage#getContainer_AdditionalRequests()
     * @model containment="true"
     * @generated
     */
    EList<AbstractK8sRequestLimit> getAdditionalRequests();

    /**
     * Returns the value of the '<em><b>Additional Limits</b></em>' containment reference list.
     * The list contents are of type {@link kubernetesModel.k8sconcepts.AbstractK8sRequestLimit}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Additional Limits</em>' containment reference list.
     * @see kubernetesModel.repository.RepositoryPackage#getContainer_AdditionalLimits()
     * @model containment="true"
     * @generated
     */
    EList<AbstractK8sRequestLimit> getAdditionalLimits();

} // Container
