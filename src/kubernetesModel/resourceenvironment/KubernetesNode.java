/**
 */
package kubernetesModel.resourceenvironment;

import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kubernetes Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kubernetesModel.resourceenvironment.KubernetesNode#isIsMasterNode <em>Is Master Node</em>}</li>
 *   <li>{@link kubernetesModel.resourceenvironment.KubernetesNode#getMemory <em>Memory</em>}</li>
 *   <li>{@link kubernetesModel.resourceenvironment.KubernetesNode#getMillicores <em>Millicores</em>}</li>
 * </ul>
 *
 * @see kubernetesModel.resourceenvironment.ResourceenvironmentPackage#getKubernetesNode()
 * @model
 * @generated
 */
public interface KubernetesNode extends ResourceContainer {
    /**
     * Returns the value of the '<em><b>Is Master Node</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Master Node</em>' attribute.
     * @see #setIsMasterNode(boolean)
     * @see kubernetesModel.resourceenvironment.ResourceenvironmentPackage#getKubernetesNode_IsMasterNode()
     * @model default="false" required="true"
     * @generated
     */
    boolean isIsMasterNode();

    /**
     * Sets the value of the '{@link kubernetesModel.resourceenvironment.KubernetesNode#isIsMasterNode <em>Is Master Node</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Master Node</em>' attribute.
     * @see #isIsMasterNode()
     * @generated
     */
    void setIsMasterNode(boolean value);

    /**
     * Returns the value of the '<em><b>Memory</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Memory</em>' attribute.
     * @see #setMemory(long)
     * @see kubernetesModel.resourceenvironment.ResourceenvironmentPackage#getKubernetesNode_Memory()
     * @model
     * @generated
     */
    long getMemory();

    /**
     * Sets the value of the '{@link kubernetesModel.resourceenvironment.KubernetesNode#getMemory <em>Memory</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Memory</em>' attribute.
     * @see #getMemory()
     * @generated
     */
    void setMemory(long value);

    /**
     * Returns the value of the '<em><b>Millicores</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Millicores</em>' attribute.
     * @see #setMillicores(int)
     * @see kubernetesModel.resourceenvironment.ResourceenvironmentPackage#getKubernetesNode_Millicores()
     * @model
     * @generated
     */
    int getMillicores();

    /**
     * Sets the value of the '{@link kubernetesModel.resourceenvironment.KubernetesNode#getMillicores <em>Millicores</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Millicores</em>' attribute.
     * @see #getMillicores()
     * @generated
     */
    void setMillicores(int value);

} // KubernetesNode
