/**
 */
package kubernetesModel.k8sconcepts;


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
     * Returns the value of the '<em><b>Specification</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Specification</em>' attribute.
     * @see #setSpecification(String)
     * @see kubernetesModel.k8sconcepts.K8sconceptsPackage#getK8sAdditionalRequestLimit_Specification()
     * @model
     * @generated
     */
    String getSpecification();

    /**
     * Sets the value of the '{@link kubernetesModel.k8sconcepts.K8sAdditionalRequestLimit#getSpecification <em>Specification</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Specification</em>' attribute.
     * @see #getSpecification()
     * @generated
     */
    void setSpecification(String value);

} // K8sAdditionalRequestLimit
