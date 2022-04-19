/**
 */
package kubernetesModel.k8sconcepts;


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
     * Returns the value of the '<em><b>Cpu</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cpu</em>' attribute.
     * @see #setCpu(int)
     * @see kubernetesModel.k8sconcepts.K8sconceptsPackage#getK8sStandardRequestLimit_Cpu()
     * @model
     * @generated
     */
    int getCpu();

    /**
     * Sets the value of the '{@link kubernetesModel.k8sconcepts.K8sStandardRequestLimit#getCpu <em>Cpu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cpu</em>' attribute.
     * @see #getCpu()
     * @generated
     */
    void setCpu(int value);

    /**
     * Returns the value of the '<em><b>Memory</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Memory</em>' attribute.
     * @see #setMemory(long)
     * @see kubernetesModel.k8sconcepts.K8sconceptsPackage#getK8sStandardRequestLimit_Memory()
     * @model
     * @generated
     */
    long getMemory();

    /**
     * Sets the value of the '{@link kubernetesModel.k8sconcepts.K8sStandardRequestLimit#getMemory <em>Memory</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Memory</em>' attribute.
     * @see #getMemory()
     * @generated
     */
    void setMemory(long value);

} // K8sStandardRequestLimit
