/**
 */
package kubernetesModel.system;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see kubernetesModel.system.SystemPackage
 * @generated
 */
public interface SystemFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    SystemFactory eINSTANCE = kubernetesModel.system.impl.SystemFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Deployment Assembly</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Deployment Assembly</em>'.
     * @generated
     */
    DeploymentAssembly createDeploymentAssembly();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    SystemPackage getSystemPackage();

} //SystemFactory
