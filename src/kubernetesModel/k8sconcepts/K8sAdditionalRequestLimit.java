/**
 */
package kubernetesModel.k8sconcepts;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>K8s Additional Request Limit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kubernetesModel.k8sconcepts.K8sAdditionalRequestLimit#getSpecification <em>Specification</em>}</li>
 * </ul>
 *
 * @see kubernetesModel.k8sconcepts.K8sconceptsPackage#getK8sAdditionalRequestLimit()
 * @model
 * @generated
 */
public interface K8sAdditionalRequestLimit extends AbstractK8sRequestLimit {
    /**
     * Returns the value of the '<em><b>Specification</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Specification</em>' attribute list.
     * @see kubernetesModel.k8sconcepts.K8sconceptsPackage#getK8sAdditionalRequestLimit_Specification()
     * @model
     * @generated
     */
    EList<String> getSpecification();

} // K8sAdditionalRequestLimit
