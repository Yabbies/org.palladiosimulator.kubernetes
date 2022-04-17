/**
 */
package kubernetesModel.system;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.palladiosimulator.pcm.core.composition.CompositionPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see kubernetesModel.system.SystemFactory
 * @model kind="package"
 * @generated
 */
public interface SystemPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "system";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "org.palladiosimulator.kubernetes.kubernetesModel.system";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "sys";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    SystemPackage eINSTANCE = kubernetesModel.system.impl.SystemPackageImpl.init();

    /**
     * The meta object id for the '{@link kubernetesModel.system.impl.DeploymentAssemblyImpl <em>Deployment Assembly</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kubernetesModel.system.impl.DeploymentAssemblyImpl
     * @see kubernetesModel.system.impl.SystemPackageImpl#getDeploymentAssembly()
     * @generated
     */
    int DEPLOYMENT_ASSEMBLY = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPLOYMENT_ASSEMBLY__ID = CompositionPackage.ASSEMBLY_CONTEXT__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPLOYMENT_ASSEMBLY__ENTITY_NAME = CompositionPackage.ASSEMBLY_CONTEXT__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Parent Structure Assembly Context</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPLOYMENT_ASSEMBLY__PARENT_STRUCTURE_ASSEMBLY_CONTEXT = CompositionPackage.ASSEMBLY_CONTEXT__PARENT_STRUCTURE_ASSEMBLY_CONTEXT;

    /**
     * The feature id for the '<em><b>Encapsulated Component Assembly Context</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPLOYMENT_ASSEMBLY__ENCAPSULATED_COMPONENT_ASSEMBLY_CONTEXT = CompositionPackage.ASSEMBLY_CONTEXT__ENCAPSULATED_COMPONENT_ASSEMBLY_CONTEXT;

    /**
     * The feature id for the '<em><b>Config Parameter Usages Assembly Context</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPLOYMENT_ASSEMBLY__CONFIG_PARAMETER_USAGES_ASSEMBLY_CONTEXT = CompositionPackage.ASSEMBLY_CONTEXT__CONFIG_PARAMETER_USAGES_ASSEMBLY_CONTEXT;

    /**
     * The feature id for the '<em><b>Deployment</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPLOYMENT_ASSEMBLY__DEPLOYMENT = CompositionPackage.ASSEMBLY_CONTEXT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Deployment Assembly</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPLOYMENT_ASSEMBLY_FEATURE_COUNT = CompositionPackage.ASSEMBLY_CONTEXT_FEATURE_COUNT + 1;


    /**
     * Returns the meta object for class '{@link kubernetesModel.system.DeploymentAssembly <em>Deployment Assembly</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Deployment Assembly</em>'.
     * @see kubernetesModel.system.DeploymentAssembly
     * @generated
     */
    EClass getDeploymentAssembly();

    /**
     * Returns the meta object for the reference '{@link kubernetesModel.system.DeploymentAssembly#getDeployment <em>Deployment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Deployment</em>'.
     * @see kubernetesModel.system.DeploymentAssembly#getDeployment()
     * @see #getDeploymentAssembly()
     * @generated
     */
    EReference getDeploymentAssembly_Deployment();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    SystemFactory getSystemFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link kubernetesModel.system.impl.DeploymentAssemblyImpl <em>Deployment Assembly</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see kubernetesModel.system.impl.DeploymentAssemblyImpl
         * @see kubernetesModel.system.impl.SystemPackageImpl#getDeploymentAssembly()
         * @generated
         */
        EClass DEPLOYMENT_ASSEMBLY = eINSTANCE.getDeploymentAssembly();

        /**
         * The meta object literal for the '<em><b>Deployment</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DEPLOYMENT_ASSEMBLY__DEPLOYMENT = eINSTANCE.getDeploymentAssembly_Deployment();

    }

} //SystemPackage
