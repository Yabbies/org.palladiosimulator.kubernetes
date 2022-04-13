/**
 */
package kubernetesModel.repository.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import kubernetesModel.k8sconcepts.K8sconceptsPackage;

import kubernetesModel.k8sconcepts.impl.K8sconceptsPackageImpl;

import kubernetesModel.repository.Pod;
import kubernetesModel.repository.RepositoryFactory;
import kubernetesModel.repository.RepositoryPackage;

import kubernetesModel.resourceenvironment.ResourceenvironmentPackage;

import kubernetesModel.resourceenvironment.impl.ResourceenvironmentPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RepositoryPackageImpl extends EPackageImpl implements RepositoryPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass containerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass podEClass = null;

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
     * @see kubernetesModel.repository.RepositoryPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private RepositoryPackageImpl() {
        super(eNS_URI, RepositoryFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link RepositoryPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static RepositoryPackage init() {
        if (isInited) return (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);

        // Obtain or create and register package
        Object registeredRepositoryPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        RepositoryPackageImpl theRepositoryPackage = registeredRepositoryPackage instanceof RepositoryPackageImpl ? (RepositoryPackageImpl)registeredRepositoryPackage : new RepositoryPackageImpl();

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
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(K8sconceptsPackage.eNS_URI);
        K8sconceptsPackageImpl theK8sconceptsPackage = (K8sconceptsPackageImpl)(registeredPackage instanceof K8sconceptsPackageImpl ? registeredPackage : K8sconceptsPackage.eINSTANCE);

        // Create package meta-data objects
        theRepositoryPackage.createPackageContents();
        theResourceenvironmentPackage.createPackageContents();
        theK8sconceptsPackage.createPackageContents();

        // Initialize created meta-data
        theRepositoryPackage.initializePackageContents();
        theResourceenvironmentPackage.initializePackageContents();
        theK8sconceptsPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theRepositoryPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(RepositoryPackage.eNS_URI, theRepositoryPackage);
        return theRepositoryPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getContainer() {
        return containerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getContainer_StandardLimit() {
        return (EReference)containerEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getContainer_StandardRequest() {
        return (EReference)containerEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getContainer_ContainerMemoryRequest() {
        return (EAttribute)containerEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getContainer_ContainerMemoryLimit() {
        return (EAttribute)containerEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getContainer_ContainerCPURequest() {
        return (EAttribute)containerEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getContainer_ContainerCPULimit() {
        return (EAttribute)containerEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPod() {
        return podEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPod_Containers() {
        return (EReference)podEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RepositoryFactory getRepositoryFactory() {
        return (RepositoryFactory)getEFactoryInstance();
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
        containerEClass = createEClass(CONTAINER);
        createEReference(containerEClass, CONTAINER__STANDARD_LIMIT);
        createEReference(containerEClass, CONTAINER__STANDARD_REQUEST);
        createEAttribute(containerEClass, CONTAINER__CONTAINER_MEMORY_REQUEST);
        createEAttribute(containerEClass, CONTAINER__CONTAINER_MEMORY_LIMIT);
        createEAttribute(containerEClass, CONTAINER__CONTAINER_CPU_REQUEST);
        createEAttribute(containerEClass, CONTAINER__CONTAINER_CPU_LIMIT);

        podEClass = createEClass(POD);
        createEReference(podEClass, POD__CONTAINERS);
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
        org.palladiosimulator.pcm.repository.RepositoryPackage theRepositoryPackage_1 = (org.palladiosimulator.pcm.repository.RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(org.palladiosimulator.pcm.repository.RepositoryPackage.eNS_URI);
        K8sconceptsPackage theK8sconceptsPackage = (K8sconceptsPackage)EPackage.Registry.INSTANCE.getEPackage(K8sconceptsPackage.eNS_URI);
        EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        containerEClass.getESuperTypes().add(theRepositoryPackage_1.getCompositeComponent());
        podEClass.getESuperTypes().add(theRepositoryPackage_1.getCompositeComponent());

        // Initialize classes and features; add operations and parameters
        initEClass(containerEClass, kubernetesModel.repository.Container.class, "Container", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getContainer_StandardLimit(), theK8sconceptsPackage.getK8sStandardRequestLimit(), null, "standardLimit", null, 0, 1, kubernetesModel.repository.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getContainer_StandardRequest(), theK8sconceptsPackage.getK8sStandardRequestLimit(), null, "standardRequest", null, 0, 1, kubernetesModel.repository.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getContainer_ContainerMemoryRequest(), theEcorePackage.getEBigInteger(), "containerMemoryRequest", null, 0, 1, kubernetesModel.repository.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getContainer_ContainerMemoryLimit(), theEcorePackage.getEBigInteger(), "containerMemoryLimit", null, 0, 1, kubernetesModel.repository.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getContainer_ContainerCPURequest(), theEcorePackage.getEInt(), "containerCPURequest", null, 0, 1, kubernetesModel.repository.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getContainer_ContainerCPULimit(), theEcorePackage.getEInt(), "containerCPULimit", null, 0, 1, kubernetesModel.repository.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(podEClass, Pod.class, "Pod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPod_Containers(), this.getContainer(), null, "Containers", null, 0, -1, Pod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //RepositoryPackageImpl
