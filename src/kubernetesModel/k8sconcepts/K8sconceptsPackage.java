/**
 */
package kubernetesModel.k8sconcepts;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.palladiosimulator.pcm.core.entity.EntityPackage;

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
 * @see kubernetesModel.k8sconcepts.K8sconceptsFactory
 * @model kind="package"
 * @generated
 */
public interface K8sconceptsPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "k8sconcepts";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "org.palladiosimulator.kubernetesModel.k8sconcepts";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "k8s";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    K8sconceptsPackage eINSTANCE = kubernetesModel.k8sconcepts.impl.K8sconceptsPackageImpl.init();

    /**
     * The meta object id for the '{@link kubernetesModel.k8sconcepts.impl.DeploymentImpl <em>Deployment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kubernetesModel.k8sconcepts.impl.DeploymentImpl
     * @see kubernetesModel.k8sconcepts.impl.K8sconceptsPackageImpl#getDeployment()
     * @generated
     */
    int DEPLOYMENT = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPLOYMENT__ID = EntityPackage.ENTITY__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPLOYMENT__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Replicas</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPLOYMENT__REPLICAS = EntityPackage.ENTITY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Pod Reference</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPLOYMENT__POD_REFERENCE = EntityPackage.ENTITY_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Allocated Pods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPLOYMENT__ALLOCATED_PODS = EntityPackage.ENTITY_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Deployment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPLOYMENT_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link kubernetesModel.k8sconcepts.impl.AbstractK8sRequestLimitImpl <em>Abstract K8s Request Limit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kubernetesModel.k8sconcepts.impl.AbstractK8sRequestLimitImpl
     * @see kubernetesModel.k8sconcepts.impl.K8sconceptsPackageImpl#getAbstractK8sRequestLimit()
     * @generated
     */
    int ABSTRACT_K8S_REQUEST_LIMIT = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_K8S_REQUEST_LIMIT__ID = EntityPackage.ENTITY__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_K8S_REQUEST_LIMIT__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

    /**
     * The number of structural features of the '<em>Abstract K8s Request Limit</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_K8S_REQUEST_LIMIT_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link kubernetesModel.k8sconcepts.impl.K8sStandardRequestLimitImpl <em>K8s Standard Request Limit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kubernetesModel.k8sconcepts.impl.K8sStandardRequestLimitImpl
     * @see kubernetesModel.k8sconcepts.impl.K8sconceptsPackageImpl#getK8sStandardRequestLimit()
     * @generated
     */
    int K8S_STANDARD_REQUEST_LIMIT = 2;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int K8S_STANDARD_REQUEST_LIMIT__ID = ABSTRACT_K8S_REQUEST_LIMIT__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int K8S_STANDARD_REQUEST_LIMIT__ENTITY_NAME = ABSTRACT_K8S_REQUEST_LIMIT__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Cpu</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int K8S_STANDARD_REQUEST_LIMIT__CPU = ABSTRACT_K8S_REQUEST_LIMIT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Memory</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int K8S_STANDARD_REQUEST_LIMIT__MEMORY = ABSTRACT_K8S_REQUEST_LIMIT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>K8s Standard Request Limit</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int K8S_STANDARD_REQUEST_LIMIT_FEATURE_COUNT = ABSTRACT_K8S_REQUEST_LIMIT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link kubernetesModel.k8sconcepts.impl.K8sAdditionalRequestLimitImpl <em>K8s Additional Request Limit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kubernetesModel.k8sconcepts.impl.K8sAdditionalRequestLimitImpl
     * @see kubernetesModel.k8sconcepts.impl.K8sconceptsPackageImpl#getK8sAdditionalRequestLimit()
     * @generated
     */
    int K8S_ADDITIONAL_REQUEST_LIMIT = 3;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int K8S_ADDITIONAL_REQUEST_LIMIT__ID = ABSTRACT_K8S_REQUEST_LIMIT__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int K8S_ADDITIONAL_REQUEST_LIMIT__ENTITY_NAME = ABSTRACT_K8S_REQUEST_LIMIT__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Specification</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int K8S_ADDITIONAL_REQUEST_LIMIT__SPECIFICATION = ABSTRACT_K8S_REQUEST_LIMIT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>K8s Additional Request Limit</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int K8S_ADDITIONAL_REQUEST_LIMIT_FEATURE_COUNT = ABSTRACT_K8S_REQUEST_LIMIT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link kubernetesModel.k8sconcepts.impl.RequestsLimitsRepositoryImpl <em>Requests Limits Repository</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kubernetesModel.k8sconcepts.impl.RequestsLimitsRepositoryImpl
     * @see kubernetesModel.k8sconcepts.impl.K8sconceptsPackageImpl#getRequestsLimitsRepository()
     * @generated
     */
    int REQUESTS_LIMITS_REPOSITORY = 4;

    /**
     * The feature id for the '<em><b>Requests Limits Repo</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REQUESTS_LIMITS_REPOSITORY__REQUESTS_LIMITS_REPO = 0;

    /**
     * The number of structural features of the '<em>Requests Limits Repository</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REQUESTS_LIMITS_REPOSITORY_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link kubernetesModel.k8sconcepts.impl.DeploymentsImpl <em>Deployments</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kubernetesModel.k8sconcepts.impl.DeploymentsImpl
     * @see kubernetesModel.k8sconcepts.impl.K8sconceptsPackageImpl#getDeployments()
     * @generated
     */
    int DEPLOYMENTS = 5;

    /**
     * The feature id for the '<em><b>Deployment Instances</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPLOYMENTS__DEPLOYMENT_INSTANCES = 0;

    /**
     * The number of structural features of the '<em>Deployments</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEPLOYMENTS_FEATURE_COUNT = 1;


    /**
     * Returns the meta object for class '{@link kubernetesModel.k8sconcepts.Deployment <em>Deployment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Deployment</em>'.
     * @see kubernetesModel.k8sconcepts.Deployment
     * @generated
     */
    EClass getDeployment();

    /**
     * Returns the meta object for the attribute '{@link kubernetesModel.k8sconcepts.Deployment#getReplicas <em>Replicas</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Replicas</em>'.
     * @see kubernetesModel.k8sconcepts.Deployment#getReplicas()
     * @see #getDeployment()
     * @generated
     */
    EAttribute getDeployment_Replicas();

    /**
     * Returns the meta object for the reference '{@link kubernetesModel.k8sconcepts.Deployment#getPodReference <em>Pod Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Pod Reference</em>'.
     * @see kubernetesModel.k8sconcepts.Deployment#getPodReference()
     * @see #getDeployment()
     * @generated
     */
    EReference getDeployment_PodReference();

    /**
     * Returns the meta object for the containment reference list '{@link kubernetesModel.k8sconcepts.Deployment#getAllocatedPods <em>Allocated Pods</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Allocated Pods</em>'.
     * @see kubernetesModel.k8sconcepts.Deployment#getAllocatedPods()
     * @see #getDeployment()
     * @generated
     */
    EReference getDeployment_AllocatedPods();

    /**
     * Returns the meta object for class '{@link kubernetesModel.k8sconcepts.AbstractK8sRequestLimit <em>Abstract K8s Request Limit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract K8s Request Limit</em>'.
     * @see kubernetesModel.k8sconcepts.AbstractK8sRequestLimit
     * @generated
     */
    EClass getAbstractK8sRequestLimit();

    /**
     * Returns the meta object for class '{@link kubernetesModel.k8sconcepts.K8sStandardRequestLimit <em>K8s Standard Request Limit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>K8s Standard Request Limit</em>'.
     * @see kubernetesModel.k8sconcepts.K8sStandardRequestLimit
     * @generated
     */
    EClass getK8sStandardRequestLimit();

    /**
     * Returns the meta object for the attribute '{@link kubernetesModel.k8sconcepts.K8sStandardRequestLimit#getCpu <em>Cpu</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Cpu</em>'.
     * @see kubernetesModel.k8sconcepts.K8sStandardRequestLimit#getCpu()
     * @see #getK8sStandardRequestLimit()
     * @generated
     */
    EAttribute getK8sStandardRequestLimit_Cpu();

    /**
     * Returns the meta object for the attribute '{@link kubernetesModel.k8sconcepts.K8sStandardRequestLimit#getMemory <em>Memory</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Memory</em>'.
     * @see kubernetesModel.k8sconcepts.K8sStandardRequestLimit#getMemory()
     * @see #getK8sStandardRequestLimit()
     * @generated
     */
    EAttribute getK8sStandardRequestLimit_Memory();

    /**
     * Returns the meta object for class '{@link kubernetesModel.k8sconcepts.K8sAdditionalRequestLimit <em>K8s Additional Request Limit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>K8s Additional Request Limit</em>'.
     * @see kubernetesModel.k8sconcepts.K8sAdditionalRequestLimit
     * @generated
     */
    EClass getK8sAdditionalRequestLimit();

    /**
     * Returns the meta object for the attribute '{@link kubernetesModel.k8sconcepts.K8sAdditionalRequestLimit#getSpecification <em>Specification</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Specification</em>'.
     * @see kubernetesModel.k8sconcepts.K8sAdditionalRequestLimit#getSpecification()
     * @see #getK8sAdditionalRequestLimit()
     * @generated
     */
    EAttribute getK8sAdditionalRequestLimit_Specification();

    /**
     * Returns the meta object for class '{@link kubernetesModel.k8sconcepts.RequestsLimitsRepository <em>Requests Limits Repository</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Requests Limits Repository</em>'.
     * @see kubernetesModel.k8sconcepts.RequestsLimitsRepository
     * @generated
     */
    EClass getRequestsLimitsRepository();

    /**
     * Returns the meta object for the containment reference list '{@link kubernetesModel.k8sconcepts.RequestsLimitsRepository#getRequestsLimitsRepo <em>Requests Limits Repo</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Requests Limits Repo</em>'.
     * @see kubernetesModel.k8sconcepts.RequestsLimitsRepository#getRequestsLimitsRepo()
     * @see #getRequestsLimitsRepository()
     * @generated
     */
    EReference getRequestsLimitsRepository_RequestsLimitsRepo();

    /**
     * Returns the meta object for class '{@link kubernetesModel.k8sconcepts.Deployments <em>Deployments</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Deployments</em>'.
     * @see kubernetesModel.k8sconcepts.Deployments
     * @generated
     */
    EClass getDeployments();

    /**
     * Returns the meta object for the containment reference list '{@link kubernetesModel.k8sconcepts.Deployments#getDeploymentInstances <em>Deployment Instances</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Deployment Instances</em>'.
     * @see kubernetesModel.k8sconcepts.Deployments#getDeploymentInstances()
     * @see #getDeployments()
     * @generated
     */
    EReference getDeployments_DeploymentInstances();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    K8sconceptsFactory getK8sconceptsFactory();

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
         * The meta object literal for the '{@link kubernetesModel.k8sconcepts.impl.DeploymentImpl <em>Deployment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see kubernetesModel.k8sconcepts.impl.DeploymentImpl
         * @see kubernetesModel.k8sconcepts.impl.K8sconceptsPackageImpl#getDeployment()
         * @generated
         */
        EClass DEPLOYMENT = eINSTANCE.getDeployment();

        /**
         * The meta object literal for the '<em><b>Replicas</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DEPLOYMENT__REPLICAS = eINSTANCE.getDeployment_Replicas();

        /**
         * The meta object literal for the '<em><b>Pod Reference</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DEPLOYMENT__POD_REFERENCE = eINSTANCE.getDeployment_PodReference();

        /**
         * The meta object literal for the '<em><b>Allocated Pods</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DEPLOYMENT__ALLOCATED_PODS = eINSTANCE.getDeployment_AllocatedPods();

        /**
         * The meta object literal for the '{@link kubernetesModel.k8sconcepts.impl.AbstractK8sRequestLimitImpl <em>Abstract K8s Request Limit</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see kubernetesModel.k8sconcepts.impl.AbstractK8sRequestLimitImpl
         * @see kubernetesModel.k8sconcepts.impl.K8sconceptsPackageImpl#getAbstractK8sRequestLimit()
         * @generated
         */
        EClass ABSTRACT_K8S_REQUEST_LIMIT = eINSTANCE.getAbstractK8sRequestLimit();

        /**
         * The meta object literal for the '{@link kubernetesModel.k8sconcepts.impl.K8sStandardRequestLimitImpl <em>K8s Standard Request Limit</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see kubernetesModel.k8sconcepts.impl.K8sStandardRequestLimitImpl
         * @see kubernetesModel.k8sconcepts.impl.K8sconceptsPackageImpl#getK8sStandardRequestLimit()
         * @generated
         */
        EClass K8S_STANDARD_REQUEST_LIMIT = eINSTANCE.getK8sStandardRequestLimit();

        /**
         * The meta object literal for the '<em><b>Cpu</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute K8S_STANDARD_REQUEST_LIMIT__CPU = eINSTANCE.getK8sStandardRequestLimit_Cpu();

        /**
         * The meta object literal for the '<em><b>Memory</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute K8S_STANDARD_REQUEST_LIMIT__MEMORY = eINSTANCE.getK8sStandardRequestLimit_Memory();

        /**
         * The meta object literal for the '{@link kubernetesModel.k8sconcepts.impl.K8sAdditionalRequestLimitImpl <em>K8s Additional Request Limit</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see kubernetesModel.k8sconcepts.impl.K8sAdditionalRequestLimitImpl
         * @see kubernetesModel.k8sconcepts.impl.K8sconceptsPackageImpl#getK8sAdditionalRequestLimit()
         * @generated
         */
        EClass K8S_ADDITIONAL_REQUEST_LIMIT = eINSTANCE.getK8sAdditionalRequestLimit();

        /**
         * The meta object literal for the '<em><b>Specification</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute K8S_ADDITIONAL_REQUEST_LIMIT__SPECIFICATION = eINSTANCE.getK8sAdditionalRequestLimit_Specification();

        /**
         * The meta object literal for the '{@link kubernetesModel.k8sconcepts.impl.RequestsLimitsRepositoryImpl <em>Requests Limits Repository</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see kubernetesModel.k8sconcepts.impl.RequestsLimitsRepositoryImpl
         * @see kubernetesModel.k8sconcepts.impl.K8sconceptsPackageImpl#getRequestsLimitsRepository()
         * @generated
         */
        EClass REQUESTS_LIMITS_REPOSITORY = eINSTANCE.getRequestsLimitsRepository();

        /**
         * The meta object literal for the '<em><b>Requests Limits Repo</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REQUESTS_LIMITS_REPOSITORY__REQUESTS_LIMITS_REPO = eINSTANCE.getRequestsLimitsRepository_RequestsLimitsRepo();

        /**
         * The meta object literal for the '{@link kubernetesModel.k8sconcepts.impl.DeploymentsImpl <em>Deployments</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see kubernetesModel.k8sconcepts.impl.DeploymentsImpl
         * @see kubernetesModel.k8sconcepts.impl.K8sconceptsPackageImpl#getDeployments()
         * @generated
         */
        EClass DEPLOYMENTS = eINSTANCE.getDeployments();

        /**
         * The meta object literal for the '<em><b>Deployment Instances</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DEPLOYMENTS__DEPLOYMENT_INSTANCES = eINSTANCE.getDeployments_DeploymentInstances();

    }

} //K8sconceptsPackage
