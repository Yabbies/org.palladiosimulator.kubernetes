/**
 */
package kubernetesModel.k8sconcepts.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import kubernetesModel.k8sconcepts.AbstractK8sRequestLimit;
import kubernetesModel.k8sconcepts.K8sAdditionalRequestLimit;
import kubernetesModel.k8sconcepts.K8sStandardRequestLimit;
import kubernetesModel.k8sconcepts.K8sconceptsFactory;
import kubernetesModel.k8sconcepts.K8sconceptsPackage;

import kubernetesModel.repository.RepositoryPackage;

import kubernetesModel.repository.impl.RepositoryPackageImpl;

import kubernetesModel.resourceenvironment.ResourceenvironmentPackage;

import kubernetesModel.resourceenvironment.impl.ResourceenvironmentPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class K8sconceptsPackageImpl extends EPackageImpl implements K8sconceptsPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass abstractK8sRequestLimitEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass k8sStandardRequestLimitEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass k8sAdditionalRequestLimitEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see kubernetesModel.k8sconcepts.K8sconceptsPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private K8sconceptsPackageImpl() {
        super(eNS_URI, K8sconceptsFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     *
     * <p>This method is used to initialize {@link K8sconceptsPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static K8sconceptsPackage init() {
        if (isInited) return (K8sconceptsPackage)EPackage.Registry.INSTANCE.getEPackage(K8sconceptsPackage.eNS_URI);

        // Obtain or create and register package
        Object registeredK8sconceptsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        K8sconceptsPackageImpl theK8sconceptsPackage = registeredK8sconceptsPackage instanceof K8sconceptsPackageImpl ? (K8sconceptsPackageImpl)registeredK8sconceptsPackage : new K8sconceptsPackageImpl();

        isInited = true;

        // Initialize simple dependencies
        EcorePackage.eINSTANCE.eClass();
        IdentifierPackage.eINSTANCE.eClass();
        PcmPackage.eINSTANCE.eClass();
        ProbfunctionPackage.eINSTANCE.eClass();
        StoexPackage.eINSTANCE.eClass();
        UnitsPackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ResourceenvironmentPackage.eNS_URI);
        ResourceenvironmentPackageImpl theResourceenvironmentPackage = (ResourceenvironmentPackageImpl)(registeredPackage instanceof ResourceenvironmentPackageImpl ? registeredPackage : ResourceenvironmentPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);
        RepositoryPackageImpl theRepositoryPackage = (RepositoryPackageImpl)(registeredPackage instanceof RepositoryPackageImpl ? registeredPackage : RepositoryPackage.eINSTANCE);

        // Create package meta-data objects
        theK8sconceptsPackage.createPackageContents();
        theResourceenvironmentPackage.createPackageContents();
        theRepositoryPackage.createPackageContents();

        // Initialize created meta-data
        theK8sconceptsPackage.initializePackageContents();
        theResourceenvironmentPackage.initializePackageContents();
        theRepositoryPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theK8sconceptsPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(K8sconceptsPackage.eNS_URI, theK8sconceptsPackage);
        return theK8sconceptsPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAbstractK8sRequestLimit() {
        return abstractK8sRequestLimitEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getK8sStandardRequestLimit() {
        return k8sStandardRequestLimitEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getK8sStandardRequestLimit_Cpu() {
        return (EAttribute)k8sStandardRequestLimitEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getK8sStandardRequestLimit_Memory() {
        return (EAttribute)k8sStandardRequestLimitEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getK8sAdditionalRequestLimit() {
        return k8sAdditionalRequestLimitEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getK8sAdditionalRequestLimit_Specification() {
        return (EAttribute)k8sAdditionalRequestLimitEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public K8sconceptsFactory getK8sconceptsFactory() {
        return (K8sconceptsFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        abstractK8sRequestLimitEClass = createEClass(ABSTRACT_K8S_REQUEST_LIMIT);

        k8sStandardRequestLimitEClass = createEClass(K8S_STANDARD_REQUEST_LIMIT);
        createEAttribute(k8sStandardRequestLimitEClass, K8S_STANDARD_REQUEST_LIMIT__CPU);
        createEAttribute(k8sStandardRequestLimitEClass, K8S_STANDARD_REQUEST_LIMIT__MEMORY);

        k8sAdditionalRequestLimitEClass = createEClass(K8S_ADDITIONAL_REQUEST_LIMIT);
        createEAttribute(k8sAdditionalRequestLimitEClass, K8S_ADDITIONAL_REQUEST_LIMIT__SPECIFICATION);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        k8sStandardRequestLimitEClass.getESuperTypes().add(this.getAbstractK8sRequestLimit());
        k8sAdditionalRequestLimitEClass.getESuperTypes().add(this.getAbstractK8sRequestLimit());

        // Initialize classes and features; add operations and parameters
        initEClass(abstractK8sRequestLimitEClass, AbstractK8sRequestLimit.class, "AbstractK8sRequestLimit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(k8sStandardRequestLimitEClass, K8sStandardRequestLimit.class, "K8sStandardRequestLimit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getK8sStandardRequestLimit_Cpu(), theEcorePackage.getEInt(), "cpu", null, 0, -1, K8sStandardRequestLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getK8sStandardRequestLimit_Memory(), theEcorePackage.getEInt(), "memory", null, 0, -1, K8sStandardRequestLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(k8sAdditionalRequestLimitEClass, K8sAdditionalRequestLimit.class, "K8sAdditionalRequestLimit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getK8sAdditionalRequestLimit_Specification(), theEcorePackage.getEString(), "specification", null, 0, -1, K8sAdditionalRequestLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //K8sconceptsPackageImpl
