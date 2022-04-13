/**
 */
package kubernetesModel.repository;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see kubernetesModel.repository.RepositoryPackage
 * @generated
 */
public interface RepositoryFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    RepositoryFactory eINSTANCE = kubernetesModel.repository.impl.RepositoryFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Container</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Container</em>'.
     * @generated
     */
    Container createContainer();

    /**
     * Returns a new object of class '<em>Pod</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Pod</em>'.
     * @generated
     */
    Pod createPod();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    RepositoryPackage getRepositoryPackage();

} //RepositoryFactory
