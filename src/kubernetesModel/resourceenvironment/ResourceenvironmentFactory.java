/**
 */
package kubernetesModel.resourceenvironment;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see kubernetesModel.resourceenvironment.ResourceenvironmentPackage
 * @generated
 */
public interface ResourceenvironmentFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ResourceenvironmentFactory eINSTANCE = kubernetesModel.resourceenvironment.impl.ResourceenvironmentFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Kubernetes Node</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Kubernetes Node</em>'.
     * @generated
     */
    KubernetesNode createKubernetesNode();

    /**
     * Returns a new object of class '<em>Running Pod Nested Resource Container</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Running Pod Nested Resource Container</em>'.
     * @generated
     */
    RunningPodNestedResourceContainer createRunningPodNestedResourceContainer();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ResourceenvironmentPackage getResourceenvironmentPackage();

} //ResourceenvironmentFactory
