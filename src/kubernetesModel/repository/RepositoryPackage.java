/**
 */
package kubernetesModel.repository;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.palladiosimulator.pcm.subsystem.SubsystemPackage;

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
 * @see kubernetesModel.repository.RepositoryFactory
 * @model kind="package"
 * @generated
 */
public interface RepositoryPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "repository";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "org.palladiosimulator.kubernetesModel.repository";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "repo";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    RepositoryPackage eINSTANCE = kubernetesModel.repository.impl.RepositoryPackageImpl.init();

    /**
     * The meta object id for the '{@link kubernetesModel.repository.impl.ContainerImpl <em>Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kubernetesModel.repository.impl.ContainerImpl
     * @see kubernetesModel.repository.impl.RepositoryPackageImpl#getContainer()
     * @generated
     */
    int CONTAINER = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINER__ID = org.palladiosimulator.pcm.repository.RepositoryPackage.COMPOSITE_COMPONENT__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINER__ENTITY_NAME = org.palladiosimulator.pcm.repository.RepositoryPackage.COMPOSITE_COMPONENT__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Assembly Contexts Composed Structure</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINER__ASSEMBLY_CONTEXTS_COMPOSED_STRUCTURE = org.palladiosimulator.pcm.repository.RepositoryPackage.COMPOSITE_COMPONENT__ASSEMBLY_CONTEXTS_COMPOSED_STRUCTURE;

    /**
     * The feature id for the '<em><b>Resource Required Delegation Connectors Composed Structure</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINER__RESOURCE_REQUIRED_DELEGATION_CONNECTORS_COMPOSED_STRUCTURE = org.palladiosimulator.pcm.repository.RepositoryPackage.COMPOSITE_COMPONENT__RESOURCE_REQUIRED_DELEGATION_CONNECTORS_COMPOSED_STRUCTURE;

    /**
     * The feature id for the '<em><b>Event Channel Composed Structure</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINER__EVENT_CHANNEL_COMPOSED_STRUCTURE = org.palladiosimulator.pcm.repository.RepositoryPackage.COMPOSITE_COMPONENT__EVENT_CHANNEL_COMPOSED_STRUCTURE;

    /**
     * The feature id for the '<em><b>Connectors Composed Structure</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINER__CONNECTORS_COMPOSED_STRUCTURE = org.palladiosimulator.pcm.repository.RepositoryPackage.COMPOSITE_COMPONENT__CONNECTORS_COMPOSED_STRUCTURE;

    /**
     * The feature id for the '<em><b>Provided Roles Interface Providing Entity</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINER__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY = org.palladiosimulator.pcm.repository.RepositoryPackage.COMPOSITE_COMPONENT__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY;

    /**
     * The feature id for the '<em><b>Resource Required Roles Resource Interface Requiring Entity</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINER__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY = org.palladiosimulator.pcm.repository.RepositoryPackage.COMPOSITE_COMPONENT__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY;

    /**
     * The feature id for the '<em><b>Required Roles Interface Requiring Entity</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINER__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY = org.palladiosimulator.pcm.repository.RepositoryPackage.COMPOSITE_COMPONENT__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY;

    /**
     * The feature id for the '<em><b>Repository Repository Component</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINER__REPOSITORY_REPOSITORY_COMPONENT = org.palladiosimulator.pcm.repository.RepositoryPackage.COMPOSITE_COMPONENT__REPOSITORY_REPOSITORY_COMPONENT;

    /**
     * The feature id for the '<em><b>Parent Complete Component Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINER__PARENT_COMPLETE_COMPONENT_TYPES = org.palladiosimulator.pcm.repository.RepositoryPackage.COMPOSITE_COMPONENT__PARENT_COMPLETE_COMPONENT_TYPES;

    /**
     * The feature id for the '<em><b>Component Parameter Usage Implementation Component Type</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINER__COMPONENT_PARAMETER_USAGE_IMPLEMENTATION_COMPONENT_TYPE = org.palladiosimulator.pcm.repository.RepositoryPackage.COMPOSITE_COMPONENT__COMPONENT_PARAMETER_USAGE_IMPLEMENTATION_COMPONENT_TYPE;

    /**
     * The feature id for the '<em><b>Component Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINER__COMPONENT_TYPE = org.palladiosimulator.pcm.repository.RepositoryPackage.COMPOSITE_COMPONENT__COMPONENT_TYPE;

    /**
     * The feature id for the '<em><b>Standard Limit</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINER__STANDARD_LIMIT = org.palladiosimulator.pcm.repository.RepositoryPackage.COMPOSITE_COMPONENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Standard Request</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINER__STANDARD_REQUEST = org.palladiosimulator.pcm.repository.RepositoryPackage.COMPOSITE_COMPONENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Additional Requests</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINER__ADDITIONAL_REQUESTS = org.palladiosimulator.pcm.repository.RepositoryPackage.COMPOSITE_COMPONENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Additional Limits</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINER__ADDITIONAL_LIMITS = org.palladiosimulator.pcm.repository.RepositoryPackage.COMPOSITE_COMPONENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Container</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINER_FEATURE_COUNT = org.palladiosimulator.pcm.repository.RepositoryPackage.COMPOSITE_COMPONENT_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '{@link kubernetesModel.repository.impl.PodImpl <em>Pod</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kubernetesModel.repository.impl.PodImpl
     * @see kubernetesModel.repository.impl.RepositoryPackageImpl#getPod()
     * @generated
     */
    int POD = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POD__ID = SubsystemPackage.SUB_SYSTEM__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POD__ENTITY_NAME = SubsystemPackage.SUB_SYSTEM__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Assembly Contexts Composed Structure</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POD__ASSEMBLY_CONTEXTS_COMPOSED_STRUCTURE = SubsystemPackage.SUB_SYSTEM__ASSEMBLY_CONTEXTS_COMPOSED_STRUCTURE;

    /**
     * The feature id for the '<em><b>Resource Required Delegation Connectors Composed Structure</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POD__RESOURCE_REQUIRED_DELEGATION_CONNECTORS_COMPOSED_STRUCTURE = SubsystemPackage.SUB_SYSTEM__RESOURCE_REQUIRED_DELEGATION_CONNECTORS_COMPOSED_STRUCTURE;

    /**
     * The feature id for the '<em><b>Event Channel Composed Structure</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POD__EVENT_CHANNEL_COMPOSED_STRUCTURE = SubsystemPackage.SUB_SYSTEM__EVENT_CHANNEL_COMPOSED_STRUCTURE;

    /**
     * The feature id for the '<em><b>Connectors Composed Structure</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POD__CONNECTORS_COMPOSED_STRUCTURE = SubsystemPackage.SUB_SYSTEM__CONNECTORS_COMPOSED_STRUCTURE;

    /**
     * The feature id for the '<em><b>Provided Roles Interface Providing Entity</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POD__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY = SubsystemPackage.SUB_SYSTEM__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY;

    /**
     * The feature id for the '<em><b>Resource Required Roles Resource Interface Requiring Entity</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POD__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY = SubsystemPackage.SUB_SYSTEM__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY;

    /**
     * The feature id for the '<em><b>Required Roles Interface Requiring Entity</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POD__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY = SubsystemPackage.SUB_SYSTEM__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY;

    /**
     * The feature id for the '<em><b>Repository Repository Component</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POD__REPOSITORY_REPOSITORY_COMPONENT = SubsystemPackage.SUB_SYSTEM__REPOSITORY_REPOSITORY_COMPONENT;

    /**
     * The feature id for the '<em><b>Containers</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POD__CONTAINERS = SubsystemPackage.SUB_SYSTEM_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Pod</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POD_FEATURE_COUNT = SubsystemPackage.SUB_SYSTEM_FEATURE_COUNT + 1;


    /**
     * Returns the meta object for class '{@link kubernetesModel.repository.Container <em>Container</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Container</em>'.
     * @see kubernetesModel.repository.Container
     * @generated
     */
    EClass getContainer();

    /**
     * Returns the meta object for the containment reference '{@link kubernetesModel.repository.Container#getStandardLimit <em>Standard Limit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Standard Limit</em>'.
     * @see kubernetesModel.repository.Container#getStandardLimit()
     * @see #getContainer()
     * @generated
     */
    EReference getContainer_StandardLimit();

    /**
     * Returns the meta object for the containment reference '{@link kubernetesModel.repository.Container#getStandardRequest <em>Standard Request</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Standard Request</em>'.
     * @see kubernetesModel.repository.Container#getStandardRequest()
     * @see #getContainer()
     * @generated
     */
    EReference getContainer_StandardRequest();

    /**
     * Returns the meta object for the containment reference list '{@link kubernetesModel.repository.Container#getAdditionalRequests <em>Additional Requests</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Additional Requests</em>'.
     * @see kubernetesModel.repository.Container#getAdditionalRequests()
     * @see #getContainer()
     * @generated
     */
    EReference getContainer_AdditionalRequests();

    /**
     * Returns the meta object for the containment reference list '{@link kubernetesModel.repository.Container#getAdditionalLimits <em>Additional Limits</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Additional Limits</em>'.
     * @see kubernetesModel.repository.Container#getAdditionalLimits()
     * @see #getContainer()
     * @generated
     */
    EReference getContainer_AdditionalLimits();

    /**
     * Returns the meta object for class '{@link kubernetesModel.repository.Pod <em>Pod</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Pod</em>'.
     * @see kubernetesModel.repository.Pod
     * @generated
     */
    EClass getPod();

    /**
     * Returns the meta object for the reference list '{@link kubernetesModel.repository.Pod#getContainers <em>Containers</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Containers</em>'.
     * @see kubernetesModel.repository.Pod#getContainers()
     * @see #getPod()
     * @generated
     */
    EReference getPod_Containers();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    RepositoryFactory getRepositoryFactory();

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
         * The meta object literal for the '{@link kubernetesModel.repository.impl.ContainerImpl <em>Container</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see kubernetesModel.repository.impl.ContainerImpl
         * @see kubernetesModel.repository.impl.RepositoryPackageImpl#getContainer()
         * @generated
         */
        EClass CONTAINER = eINSTANCE.getContainer();

        /**
         * The meta object literal for the '<em><b>Standard Limit</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTAINER__STANDARD_LIMIT = eINSTANCE.getContainer_StandardLimit();

        /**
         * The meta object literal for the '<em><b>Standard Request</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTAINER__STANDARD_REQUEST = eINSTANCE.getContainer_StandardRequest();

        /**
         * The meta object literal for the '<em><b>Additional Requests</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTAINER__ADDITIONAL_REQUESTS = eINSTANCE.getContainer_AdditionalRequests();

        /**
         * The meta object literal for the '<em><b>Additional Limits</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTAINER__ADDITIONAL_LIMITS = eINSTANCE.getContainer_AdditionalLimits();

        /**
         * The meta object literal for the '{@link kubernetesModel.repository.impl.PodImpl <em>Pod</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see kubernetesModel.repository.impl.PodImpl
         * @see kubernetesModel.repository.impl.RepositoryPackageImpl#getPod()
         * @generated
         */
        EClass POD = eINSTANCE.getPod();

        /**
         * The meta object literal for the '<em><b>Containers</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference POD__CONTAINERS = eINSTANCE.getPod_Containers();

    }

} //RepositoryPackage
