/**
 */
package kubernetesModel.repository;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
     * The feature id for the '<em><b>Standard Limit</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINER__STANDARD_LIMIT = org.palladiosimulator.pcm.repository.RepositoryPackage.COMPOSITE_COMPONENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Standard Request</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINER__STANDARD_REQUEST = org.palladiosimulator.pcm.repository.RepositoryPackage.COMPOSITE_COMPONENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Container Memory Request</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINER__CONTAINER_MEMORY_REQUEST = org.palladiosimulator.pcm.repository.RepositoryPackage.COMPOSITE_COMPONENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Container Memory Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINER__CONTAINER_MEMORY_LIMIT = org.palladiosimulator.pcm.repository.RepositoryPackage.COMPOSITE_COMPONENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Container CPU Request</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINER__CONTAINER_CPU_REQUEST = org.palladiosimulator.pcm.repository.RepositoryPackage.COMPOSITE_COMPONENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Container CPU Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINER__CONTAINER_CPU_LIMIT = org.palladiosimulator.pcm.repository.RepositoryPackage.COMPOSITE_COMPONENT_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Container</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINER_FEATURE_COUNT = org.palladiosimulator.pcm.repository.RepositoryPackage.COMPOSITE_COMPONENT_FEATURE_COUNT + 6;

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
    int POD__ID = org.palladiosimulator.pcm.repository.RepositoryPackage.COMPOSITE_COMPONENT__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POD__ENTITY_NAME = org.palladiosimulator.pcm.repository.RepositoryPackage.COMPOSITE_COMPONENT__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Assembly Contexts Composed Structure</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POD__ASSEMBLY_CONTEXTS_COMPOSED_STRUCTURE = org.palladiosimulator.pcm.repository.RepositoryPackage.COMPOSITE_COMPONENT__ASSEMBLY_CONTEXTS_COMPOSED_STRUCTURE;

    /**
     * The feature id for the '<em><b>Resource Required Delegation Connectors Composed Structure</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POD__RESOURCE_REQUIRED_DELEGATION_CONNECTORS_COMPOSED_STRUCTURE = org.palladiosimulator.pcm.repository.RepositoryPackage.COMPOSITE_COMPONENT__RESOURCE_REQUIRED_DELEGATION_CONNECTORS_COMPOSED_STRUCTURE;

    /**
     * The feature id for the '<em><b>Event Channel Composed Structure</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POD__EVENT_CHANNEL_COMPOSED_STRUCTURE = org.palladiosimulator.pcm.repository.RepositoryPackage.COMPOSITE_COMPONENT__EVENT_CHANNEL_COMPOSED_STRUCTURE;

    /**
     * The feature id for the '<em><b>Connectors Composed Structure</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POD__CONNECTORS_COMPOSED_STRUCTURE = org.palladiosimulator.pcm.repository.RepositoryPackage.COMPOSITE_COMPONENT__CONNECTORS_COMPOSED_STRUCTURE;

    /**
     * The feature id for the '<em><b>Provided Roles Interface Providing Entity</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POD__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY = org.palladiosimulator.pcm.repository.RepositoryPackage.COMPOSITE_COMPONENT__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY;

    /**
     * The feature id for the '<em><b>Resource Required Roles Resource Interface Requiring Entity</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POD__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY = org.palladiosimulator.pcm.repository.RepositoryPackage.COMPOSITE_COMPONENT__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY;

    /**
     * The feature id for the '<em><b>Required Roles Interface Requiring Entity</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POD__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY = org.palladiosimulator.pcm.repository.RepositoryPackage.COMPOSITE_COMPONENT__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY;

    /**
     * The feature id for the '<em><b>Repository Repository Component</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POD__REPOSITORY_REPOSITORY_COMPONENT = org.palladiosimulator.pcm.repository.RepositoryPackage.COMPOSITE_COMPONENT__REPOSITORY_REPOSITORY_COMPONENT;

    /**
     * The feature id for the '<em><b>Parent Complete Component Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POD__PARENT_COMPLETE_COMPONENT_TYPES = org.palladiosimulator.pcm.repository.RepositoryPackage.COMPOSITE_COMPONENT__PARENT_COMPLETE_COMPONENT_TYPES;

    /**
     * The feature id for the '<em><b>Component Parameter Usage Implementation Component Type</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POD__COMPONENT_PARAMETER_USAGE_IMPLEMENTATION_COMPONENT_TYPE = org.palladiosimulator.pcm.repository.RepositoryPackage.COMPOSITE_COMPONENT__COMPONENT_PARAMETER_USAGE_IMPLEMENTATION_COMPONENT_TYPE;

    /**
     * The feature id for the '<em><b>Component Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POD__COMPONENT_TYPE = org.palladiosimulator.pcm.repository.RepositoryPackage.COMPOSITE_COMPONENT__COMPONENT_TYPE;

    /**
     * The feature id for the '<em><b>Containers</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POD__CONTAINERS = org.palladiosimulator.pcm.repository.RepositoryPackage.COMPOSITE_COMPONENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Pod</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POD_FEATURE_COUNT = org.palladiosimulator.pcm.repository.RepositoryPackage.COMPOSITE_COMPONENT_FEATURE_COUNT + 1;


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
     * Returns the meta object for the reference '{@link kubernetesModel.repository.Container#getStandardLimit <em>Standard Limit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Standard Limit</em>'.
     * @see kubernetesModel.repository.Container#getStandardLimit()
     * @see #getContainer()
     * @generated
     */
    EReference getContainer_StandardLimit();

    /**
     * Returns the meta object for the reference '{@link kubernetesModel.repository.Container#getStandardRequest <em>Standard Request</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Standard Request</em>'.
     * @see kubernetesModel.repository.Container#getStandardRequest()
     * @see #getContainer()
     * @generated
     */
    EReference getContainer_StandardRequest();

    /**
     * Returns the meta object for the attribute '{@link kubernetesModel.repository.Container#getContainerMemoryRequest <em>Container Memory Request</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Container Memory Request</em>'.
     * @see kubernetesModel.repository.Container#getContainerMemoryRequest()
     * @see #getContainer()
     * @generated
     */
    EAttribute getContainer_ContainerMemoryRequest();

    /**
     * Returns the meta object for the attribute '{@link kubernetesModel.repository.Container#getContainerMemoryLimit <em>Container Memory Limit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Container Memory Limit</em>'.
     * @see kubernetesModel.repository.Container#getContainerMemoryLimit()
     * @see #getContainer()
     * @generated
     */
    EAttribute getContainer_ContainerMemoryLimit();

    /**
     * Returns the meta object for the attribute '{@link kubernetesModel.repository.Container#getContainerCPURequest <em>Container CPU Request</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Container CPU Request</em>'.
     * @see kubernetesModel.repository.Container#getContainerCPURequest()
     * @see #getContainer()
     * @generated
     */
    EAttribute getContainer_ContainerCPURequest();

    /**
     * Returns the meta object for the attribute '{@link kubernetesModel.repository.Container#getContainerCPULimit <em>Container CPU Limit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Container CPU Limit</em>'.
     * @see kubernetesModel.repository.Container#getContainerCPULimit()
     * @see #getContainer()
     * @generated
     */
    EAttribute getContainer_ContainerCPULimit();

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
         * The meta object literal for the '<em><b>Standard Limit</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTAINER__STANDARD_LIMIT = eINSTANCE.getContainer_StandardLimit();

        /**
         * The meta object literal for the '<em><b>Standard Request</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTAINER__STANDARD_REQUEST = eINSTANCE.getContainer_StandardRequest();

        /**
         * The meta object literal for the '<em><b>Container Memory Request</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONTAINER__CONTAINER_MEMORY_REQUEST = eINSTANCE.getContainer_ContainerMemoryRequest();

        /**
         * The meta object literal for the '<em><b>Container Memory Limit</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONTAINER__CONTAINER_MEMORY_LIMIT = eINSTANCE.getContainer_ContainerMemoryLimit();

        /**
         * The meta object literal for the '<em><b>Container CPU Request</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONTAINER__CONTAINER_CPU_REQUEST = eINSTANCE.getContainer_ContainerCPURequest();

        /**
         * The meta object literal for the '<em><b>Container CPU Limit</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONTAINER__CONTAINER_CPU_LIMIT = eINSTANCE.getContainer_ContainerCPULimit();

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
