/**
 */
package kubernetesModel.resourceenvironment;

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
 * @see kubernetesModel.resourceenvironment.ResourceenvironmentFactory
 * @model kind="package"
 * @generated
 */
public interface ResourceenvironmentPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "resourceenvironment";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "org.palladiosimulator.kubernetesModel.resourceenvironment";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "resenv";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ResourceenvironmentPackage eINSTANCE = kubernetesModel.resourceenvironment.impl.ResourceenvironmentPackageImpl.init();

    /**
     * The meta object id for the '{@link kubernetesModel.resourceenvironment.impl.KubernetesNodeImpl <em>Kubernetes Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kubernetesModel.resourceenvironment.impl.KubernetesNodeImpl
     * @see kubernetesModel.resourceenvironment.impl.ResourceenvironmentPackageImpl#getKubernetesNode()
     * @generated
     */
    int KUBERNETES_NODE = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KUBERNETES_NODE__ID = org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage.RESOURCE_CONTAINER__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KUBERNETES_NODE__ENTITY_NAME = org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage.RESOURCE_CONTAINER__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Active Resource Specifications Resource Container</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KUBERNETES_NODE__ACTIVE_RESOURCE_SPECIFICATIONS_RESOURCE_CONTAINER = org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage.RESOURCE_CONTAINER__ACTIVE_RESOURCE_SPECIFICATIONS_RESOURCE_CONTAINER;

    /**
     * The feature id for the '<em><b>Resource Environment Resource Container</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KUBERNETES_NODE__RESOURCE_ENVIRONMENT_RESOURCE_CONTAINER = org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage.RESOURCE_CONTAINER__RESOURCE_ENVIRONMENT_RESOURCE_CONTAINER;

    /**
     * The feature id for the '<em><b>Nested Resource Containers Resource Container</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KUBERNETES_NODE__NESTED_RESOURCE_CONTAINERS_RESOURCE_CONTAINER = org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage.RESOURCE_CONTAINER__NESTED_RESOURCE_CONTAINERS_RESOURCE_CONTAINER;

    /**
     * The feature id for the '<em><b>Parent Resource Container Resource Container</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KUBERNETES_NODE__PARENT_RESOURCE_CONTAINER_RESOURCE_CONTAINER = org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage.RESOURCE_CONTAINER__PARENT_RESOURCE_CONTAINER_RESOURCE_CONTAINER;

    /**
     * The feature id for the '<em><b>Hdd Resource Specifications</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KUBERNETES_NODE__HDD_RESOURCE_SPECIFICATIONS = org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage.RESOURCE_CONTAINER__HDD_RESOURCE_SPECIFICATIONS;

    /**
     * The feature id for the '<em><b>Is Master Node</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KUBERNETES_NODE__IS_MASTER_NODE = org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage.RESOURCE_CONTAINER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Memory</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KUBERNETES_NODE__MEMORY = org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage.RESOURCE_CONTAINER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Cpu</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KUBERNETES_NODE__CPU = org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage.RESOURCE_CONTAINER_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Kubernetes Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KUBERNETES_NODE_FEATURE_COUNT = org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage.RESOURCE_CONTAINER_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link kubernetesModel.resourceenvironment.impl.DeploymentImpl <em>Deployment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kubernetesModel.resourceenvironment.impl.DeploymentImpl
     * @see kubernetesModel.resourceenvironment.impl.ResourceenvironmentPackageImpl#getDeployment()
     * @generated
     */
    int DEPLOYMENT = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPLOYMENT__NAME = 0;

    /**
     * The feature id for the '<em><b>Replicas</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPLOYMENT__REPLICAS = 1;

    /**
     * The feature id for the '<em><b>Pod Image Reference</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPLOYMENT__POD_IMAGE_REFERENCE = 2;

    /**
     * The feature id for the '<em><b>Allocated Pods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPLOYMENT__ALLOCATED_PODS = 3;

    /**
     * The number of structural features of the '<em>Deployment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPLOYMENT_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link kubernetesModel.resourceenvironment.impl.RunningPodNestedResourceContainerImpl <em>Running Pod Nested Resource Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kubernetesModel.resourceenvironment.impl.RunningPodNestedResourceContainerImpl
     * @see kubernetesModel.resourceenvironment.impl.ResourceenvironmentPackageImpl#getRunningPodNestedResourceContainer()
     * @generated
     */
    int RUNNING_POD_NESTED_RESOURCE_CONTAINER = 2;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RUNNING_POD_NESTED_RESOURCE_CONTAINER__ID = org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage.RESOURCE_CONTAINER__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RUNNING_POD_NESTED_RESOURCE_CONTAINER__ENTITY_NAME = org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage.RESOURCE_CONTAINER__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Active Resource Specifications Resource Container</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RUNNING_POD_NESTED_RESOURCE_CONTAINER__ACTIVE_RESOURCE_SPECIFICATIONS_RESOURCE_CONTAINER = org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage.RESOURCE_CONTAINER__ACTIVE_RESOURCE_SPECIFICATIONS_RESOURCE_CONTAINER;

    /**
     * The feature id for the '<em><b>Resource Environment Resource Container</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RUNNING_POD_NESTED_RESOURCE_CONTAINER__RESOURCE_ENVIRONMENT_RESOURCE_CONTAINER = org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage.RESOURCE_CONTAINER__RESOURCE_ENVIRONMENT_RESOURCE_CONTAINER;

    /**
     * The feature id for the '<em><b>Nested Resource Containers Resource Container</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RUNNING_POD_NESTED_RESOURCE_CONTAINER__NESTED_RESOURCE_CONTAINERS_RESOURCE_CONTAINER = org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage.RESOURCE_CONTAINER__NESTED_RESOURCE_CONTAINERS_RESOURCE_CONTAINER;

    /**
     * The feature id for the '<em><b>Parent Resource Container Resource Container</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RUNNING_POD_NESTED_RESOURCE_CONTAINER__PARENT_RESOURCE_CONTAINER_RESOURCE_CONTAINER = org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage.RESOURCE_CONTAINER__PARENT_RESOURCE_CONTAINER_RESOURCE_CONTAINER;

    /**
     * The feature id for the '<em><b>Hdd Resource Specifications</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RUNNING_POD_NESTED_RESOURCE_CONTAINER__HDD_RESOURCE_SPECIFICATIONS = org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage.RESOURCE_CONTAINER__HDD_RESOURCE_SPECIFICATIONS;

    /**
     * The feature id for the '<em><b>Selector Deployment Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RUNNING_POD_NESTED_RESOURCE_CONTAINER__SELECTOR_DEPLOYMENT_REFERENCE = org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage.RESOURCE_CONTAINER_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Running Pod Nested Resource Container</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RUNNING_POD_NESTED_RESOURCE_CONTAINER_FEATURE_COUNT = org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage.RESOURCE_CONTAINER_FEATURE_COUNT + 1;


    /**
     * Returns the meta object for class '{@link kubernetesModel.resourceenvironment.KubernetesNode <em>Kubernetes Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Kubernetes Node</em>'.
     * @see kubernetesModel.resourceenvironment.KubernetesNode
     * @generated
     */
    EClass getKubernetesNode();

    /**
     * Returns the meta object for the attribute '{@link kubernetesModel.resourceenvironment.KubernetesNode#isIsMasterNode <em>Is Master Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Master Node</em>'.
     * @see kubernetesModel.resourceenvironment.KubernetesNode#isIsMasterNode()
     * @see #getKubernetesNode()
     * @generated
     */
    EAttribute getKubernetesNode_IsMasterNode();

    /**
     * Returns the meta object for the attribute '{@link kubernetesModel.resourceenvironment.KubernetesNode#getMemory <em>Memory</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Memory</em>'.
     * @see kubernetesModel.resourceenvironment.KubernetesNode#getMemory()
     * @see #getKubernetesNode()
     * @generated
     */
    EAttribute getKubernetesNode_Memory();

    /**
     * Returns the meta object for the attribute '{@link kubernetesModel.resourceenvironment.KubernetesNode#getCpu <em>Cpu</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Cpu</em>'.
     * @see kubernetesModel.resourceenvironment.KubernetesNode#getCpu()
     * @see #getKubernetesNode()
     * @generated
     */
    EAttribute getKubernetesNode_Cpu();

    /**
     * Returns the meta object for class '{@link kubernetesModel.resourceenvironment.Deployment <em>Deployment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Deployment</em>'.
     * @see kubernetesModel.resourceenvironment.Deployment
     * @generated
     */
    EClass getDeployment();

    /**
     * Returns the meta object for the attribute '{@link kubernetesModel.resourceenvironment.Deployment#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see kubernetesModel.resourceenvironment.Deployment#getName()
     * @see #getDeployment()
     * @generated
     */
    EAttribute getDeployment_Name();

    /**
     * Returns the meta object for the attribute '{@link kubernetesModel.resourceenvironment.Deployment#getReplicas <em>Replicas</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Replicas</em>'.
     * @see kubernetesModel.resourceenvironment.Deployment#getReplicas()
     * @see #getDeployment()
     * @generated
     */
    EAttribute getDeployment_Replicas();

    /**
     * Returns the meta object for the reference '{@link kubernetesModel.resourceenvironment.Deployment#getPodImageReference <em>Pod Image Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Pod Image Reference</em>'.
     * @see kubernetesModel.resourceenvironment.Deployment#getPodImageReference()
     * @see #getDeployment()
     * @generated
     */
    EReference getDeployment_PodImageReference();

    /**
     * Returns the meta object for the containment reference list '{@link kubernetesModel.resourceenvironment.Deployment#getAllocatedPods <em>Allocated Pods</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Allocated Pods</em>'.
     * @see kubernetesModel.resourceenvironment.Deployment#getAllocatedPods()
     * @see #getDeployment()
     * @generated
     */
    EReference getDeployment_AllocatedPods();

    /**
     * Returns the meta object for class '{@link kubernetesModel.resourceenvironment.RunningPodNestedResourceContainer <em>Running Pod Nested Resource Container</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Running Pod Nested Resource Container</em>'.
     * @see kubernetesModel.resourceenvironment.RunningPodNestedResourceContainer
     * @generated
     */
    EClass getRunningPodNestedResourceContainer();

    /**
     * Returns the meta object for the containment reference '{@link kubernetesModel.resourceenvironment.RunningPodNestedResourceContainer#getSelectorDeploymentReference <em>Selector Deployment Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Selector Deployment Reference</em>'.
     * @see kubernetesModel.resourceenvironment.RunningPodNestedResourceContainer#getSelectorDeploymentReference()
     * @see #getRunningPodNestedResourceContainer()
     * @generated
     */
    EReference getRunningPodNestedResourceContainer_SelectorDeploymentReference();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ResourceenvironmentFactory getResourceenvironmentFactory();

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
         * The meta object literal for the '{@link kubernetesModel.resourceenvironment.impl.KubernetesNodeImpl <em>Kubernetes Node</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see kubernetesModel.resourceenvironment.impl.KubernetesNodeImpl
         * @see kubernetesModel.resourceenvironment.impl.ResourceenvironmentPackageImpl#getKubernetesNode()
         * @generated
         */
        EClass KUBERNETES_NODE = eINSTANCE.getKubernetesNode();

        /**
         * The meta object literal for the '<em><b>Is Master Node</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute KUBERNETES_NODE__IS_MASTER_NODE = eINSTANCE.getKubernetesNode_IsMasterNode();

        /**
         * The meta object literal for the '<em><b>Memory</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute KUBERNETES_NODE__MEMORY = eINSTANCE.getKubernetesNode_Memory();

        /**
         * The meta object literal for the '<em><b>Cpu</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute KUBERNETES_NODE__CPU = eINSTANCE.getKubernetesNode_Cpu();

        /**
         * The meta object literal for the '{@link kubernetesModel.resourceenvironment.impl.DeploymentImpl <em>Deployment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see kubernetesModel.resourceenvironment.impl.DeploymentImpl
         * @see kubernetesModel.resourceenvironment.impl.ResourceenvironmentPackageImpl#getDeployment()
         * @generated
         */
        EClass DEPLOYMENT = eINSTANCE.getDeployment();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DEPLOYMENT__NAME = eINSTANCE.getDeployment_Name();

        /**
         * The meta object literal for the '<em><b>Replicas</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DEPLOYMENT__REPLICAS = eINSTANCE.getDeployment_Replicas();

        /**
         * The meta object literal for the '<em><b>Pod Image Reference</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DEPLOYMENT__POD_IMAGE_REFERENCE = eINSTANCE.getDeployment_PodImageReference();

        /**
         * The meta object literal for the '<em><b>Allocated Pods</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DEPLOYMENT__ALLOCATED_PODS = eINSTANCE.getDeployment_AllocatedPods();

        /**
         * The meta object literal for the '{@link kubernetesModel.resourceenvironment.impl.RunningPodNestedResourceContainerImpl <em>Running Pod Nested Resource Container</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see kubernetesModel.resourceenvironment.impl.RunningPodNestedResourceContainerImpl
         * @see kubernetesModel.resourceenvironment.impl.ResourceenvironmentPackageImpl#getRunningPodNestedResourceContainer()
         * @generated
         */
        EClass RUNNING_POD_NESTED_RESOURCE_CONTAINER = eINSTANCE.getRunningPodNestedResourceContainer();

        /**
         * The meta object literal for the '<em><b>Selector Deployment Reference</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RUNNING_POD_NESTED_RESOURCE_CONTAINER__SELECTOR_DEPLOYMENT_REFERENCE = eINSTANCE.getRunningPodNestedResourceContainer_SelectorDeploymentReference();

    }

} //ResourceenvironmentPackage
