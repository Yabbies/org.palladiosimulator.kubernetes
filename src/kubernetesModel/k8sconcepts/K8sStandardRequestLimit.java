/**
 */
package kubernetesModel.k8sconcepts;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>K8s Standard Request Limit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kubernetesModel.k8sconcepts.K8sStandardRequestLimit#getCpu <em>Cpu</em>}</li>
 *   <li>{@link kubernetesModel.k8sconcepts.K8sStandardRequestLimit#getMemory <em>Memory</em>}</li>
 * </ul>
 *
 * @see kubernetesModel.k8sconcepts.K8sconceptsPackage#getK8sStandardRequestLimit()
 * @model
 * @generated
 */
public interface K8sStandardRequestLimit extends AbstractK8sRequestLimit {
    /**
     * Returns the value of the '<em><b>Cpu</b></em>' attribute list.
     * The list contents are of type {@link java.lang.Integer}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cpu</em>' attribute list.
     * @see kubernetesModel.k8sconcepts.K8sconceptsPackage#getK8sStandardRequestLimit_Cpu()
     * @model
     * @generated
     */
    EList<Integer> getCpu();

    /**
     * Returns the value of the '<em><b>Memory</b></em>' attribute list.
     * The list contents are of type {@link java.lang.Integer}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Memory</em>' attribute list.
     * @see kubernetesModel.k8sconcepts.K8sconceptsPackage#getK8sStandardRequestLimit_Memory()
     * @model
     * @generated
     */
    EList<Integer> getMemory();

} // K8sStandardRequestLimit
