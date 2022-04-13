/**
 */
package kubernetesModel.repository;

import java.math.BigInteger;

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
 *   <li>{@link kubernetesModel.repository.Container#getContainerMemoryRequest <em>Container Memory Request</em>}</li>
 *   <li>{@link kubernetesModel.repository.Container#getContainerMemoryLimit <em>Container Memory Limit</em>}</li>
 *   <li>{@link kubernetesModel.repository.Container#getContainerCPURequest <em>Container CPU Request</em>}</li>
 *   <li>{@link kubernetesModel.repository.Container#getContainerCPULimit <em>Container CPU Limit</em>}</li>
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

    /**
     * Returns the value of the '<em><b>Container Memory Request</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Container Memory Request</em>' attribute.
     * @see #setContainerMemoryRequest(BigInteger)
     * @see kubernetesModel.repository.RepositoryPackage#getContainer_ContainerMemoryRequest()
     * @model
     * @generated
     */
    BigInteger getContainerMemoryRequest();

    /**
     * Sets the value of the '{@link kubernetesModel.repository.Container#getContainerMemoryRequest <em>Container Memory Request</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Container Memory Request</em>' attribute.
     * @see #getContainerMemoryRequest()
     * @generated
     */
    void setContainerMemoryRequest(BigInteger value);

    /**
     * Returns the value of the '<em><b>Container Memory Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Container Memory Limit</em>' attribute.
     * @see #setContainerMemoryLimit(BigInteger)
     * @see kubernetesModel.repository.RepositoryPackage#getContainer_ContainerMemoryLimit()
     * @model
     * @generated
     */
    BigInteger getContainerMemoryLimit();

    /**
     * Sets the value of the '{@link kubernetesModel.repository.Container#getContainerMemoryLimit <em>Container Memory Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Container Memory Limit</em>' attribute.
     * @see #getContainerMemoryLimit()
     * @generated
     */
    void setContainerMemoryLimit(BigInteger value);

    /**
     * Returns the value of the '<em><b>Container CPU Request</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Container CPU Request</em>' attribute.
     * @see #setContainerCPURequest(int)
     * @see kubernetesModel.repository.RepositoryPackage#getContainer_ContainerCPURequest()
     * @model
     * @generated
     */
    int getContainerCPURequest();

    /**
     * Sets the value of the '{@link kubernetesModel.repository.Container#getContainerCPURequest <em>Container CPU Request</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Container CPU Request</em>' attribute.
     * @see #getContainerCPURequest()
     * @generated
     */
    void setContainerCPURequest(int value);

    /**
     * Returns the value of the '<em><b>Container CPU Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Container CPU Limit</em>' attribute.
     * @see #setContainerCPULimit(int)
     * @see kubernetesModel.repository.RepositoryPackage#getContainer_ContainerCPULimit()
     * @model
     * @generated
     */
    int getContainerCPULimit();

    /**
     * Sets the value of the '{@link kubernetesModel.repository.Container#getContainerCPULimit <em>Container CPU Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Container CPU Limit</em>' attribute.
     * @see #getContainerCPULimit()
     * @generated
     */
    void setContainerCPULimit(int value);

} // Container
