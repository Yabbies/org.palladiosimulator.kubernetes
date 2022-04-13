/**
 */
package kubernetesModel.k8sconcepts;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see kubernetesModel.k8sconcepts.K8sconceptsPackage
 * @generated
 */
public interface K8sconceptsFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    K8sconceptsFactory eINSTANCE = kubernetesModel.k8sconcepts.impl.K8sconceptsFactoryImpl.init();

    /**
     * Returns a new object of class '<em>K8s Standard Request Limit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>K8s Standard Request Limit</em>'.
     * @generated
     */
    K8sStandardRequestLimit createK8sStandardRequestLimit();

    /**
     * Returns a new object of class '<em>K8s Additional Request Limit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>K8s Additional Request Limit</em>'.
     * @generated
     */
    K8sAdditionalRequestLimit createK8sAdditionalRequestLimit();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    K8sconceptsPackage getK8sconceptsPackage();

} //K8sconceptsFactory
