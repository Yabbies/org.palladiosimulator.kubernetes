/**
 */
package kubernetesModel.k8sconcepts;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
     * The meta object id for the '{@link kubernetesModel.k8sconcepts.impl.AbstractK8sRequestLimitImpl <em>Abstract K8s Request Limit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kubernetesModel.k8sconcepts.impl.AbstractK8sRequestLimitImpl
     * @see kubernetesModel.k8sconcepts.impl.K8sconceptsPackageImpl#getAbstractK8sRequestLimit()
     * @generated
     */
    int ABSTRACT_K8S_REQUEST_LIMIT = 0;

    /**
     * The number of structural features of the '<em>Abstract K8s Request Limit</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_K8S_REQUEST_LIMIT_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link kubernetesModel.k8sconcepts.impl.K8sStandardRequestLimitImpl <em>K8s Standard Request Limit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see kubernetesModel.k8sconcepts.impl.K8sStandardRequestLimitImpl
     * @see kubernetesModel.k8sconcepts.impl.K8sconceptsPackageImpl#getK8sStandardRequestLimit()
     * @generated
     */
    int K8S_STANDARD_REQUEST_LIMIT = 1;

    /**
     * The feature id for the '<em><b>Cpu</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int K8S_STANDARD_REQUEST_LIMIT__CPU = ABSTRACT_K8S_REQUEST_LIMIT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Memory</b></em>' attribute list.
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
    int K8S_ADDITIONAL_REQUEST_LIMIT = 2;

    /**
     * The feature id for the '<em><b>Specification</b></em>' attribute list.
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
     * Returns the meta object for the attribute list '{@link kubernetesModel.k8sconcepts.K8sStandardRequestLimit#getCpu <em>Cpu</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Cpu</em>'.
     * @see kubernetesModel.k8sconcepts.K8sStandardRequestLimit#getCpu()
     * @see #getK8sStandardRequestLimit()
     * @generated
     */
    EAttribute getK8sStandardRequestLimit_Cpu();

    /**
     * Returns the meta object for the attribute list '{@link kubernetesModel.k8sconcepts.K8sStandardRequestLimit#getMemory <em>Memory</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Memory</em>'.
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
     * Returns the meta object for the attribute list '{@link kubernetesModel.k8sconcepts.K8sAdditionalRequestLimit#getSpecification <em>Specification</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Specification</em>'.
     * @see kubernetesModel.k8sconcepts.K8sAdditionalRequestLimit#getSpecification()
     * @see #getK8sAdditionalRequestLimit()
     * @generated
     */
    EAttribute getK8sAdditionalRequestLimit_Specification();

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
         * The meta object literal for the '<em><b>Cpu</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute K8S_STANDARD_REQUEST_LIMIT__CPU = eINSTANCE.getK8sStandardRequestLimit_Cpu();

        /**
         * The meta object literal for the '<em><b>Memory</b></em>' attribute list feature.
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
         * The meta object literal for the '<em><b>Specification</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute K8S_ADDITIONAL_REQUEST_LIMIT__SPECIFICATION = eINSTANCE.getK8sAdditionalRequestLimit_Specification();

    }

} //K8sconceptsPackage
