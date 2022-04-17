/**
 */
package kubernetesModel.k8sconcepts;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requests Limits Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kubernetesModel.k8sconcepts.RequestsLimitsRepository#getRequestsLimitsRepo <em>Requests Limits Repo</em>}</li>
 * </ul>
 *
 * @see kubernetesModel.k8sconcepts.K8sconceptsPackage#getRequestsLimitsRepository()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface RequestsLimitsRepository extends CDOObject {
    /**
     * Returns the value of the '<em><b>Requests Limits Repo</b></em>' containment reference list.
     * The list contents are of type {@link kubernetesModel.k8sconcepts.AbstractK8sRequestLimit}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Requests Limits Repo</em>' containment reference list.
     * @see kubernetesModel.k8sconcepts.K8sconceptsPackage#getRequestsLimitsRepository_RequestsLimitsRepo()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<AbstractK8sRequestLimit> getRequestsLimitsRepo();

} // RequestsLimitsRepository
