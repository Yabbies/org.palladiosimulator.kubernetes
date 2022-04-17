/**
 */
package kubernetesModel.resourceenvironment.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import kubernetesModel.k8sconcepts.K8sconceptsPackage;

import kubernetesModel.k8sconcepts.impl.K8sconceptsPackageImpl;

import kubernetesModel.repository.RepositoryPackage;

import kubernetesModel.repository.impl.RepositoryPackageImpl;

import kubernetesModel.resourceenvironment.KubernetesNode;
import kubernetesModel.resourceenvironment.ResourceenvironmentFactory;
import kubernetesModel.resourceenvironment.ResourceenvironmentPackage;
import kubernetesModel.resourceenvironment.RunningPodNestedResourceContainer;

import kubernetesModel.system.SystemPackage;

import kubernetesModel.system.impl.SystemPackageImpl;

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
public class ResourceenvironmentPackageImpl extends EPackageImpl implements ResourceenvironmentPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass kubernetesNodeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass runningPodNestedResourceContainerEClass = null;

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
     * @see kubernetesModel.resourceenvironment.ResourceenvironmentPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ResourceenvironmentPackageImpl() {
        super(eNS_URI, ResourceenvironmentFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link ResourceenvironmentPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ResourceenvironmentPackage init() {
        if (isInited) return (ResourceenvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(ResourceenvironmentPackage.eNS_URI);

        // Obtain or create and register package
        Object registeredResourceenvironmentPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        ResourceenvironmentPackageImpl theResourceenvironmentPackage = registeredResourceenvironmentPackage instanceof ResourceenvironmentPackageImpl ? (ResourceenvironmentPackageImpl)registeredResourceenvironmentPackage : new ResourceenvironmentPackageImpl();

        isInited = true;

        // Initialize simple dependencies
        EcorePackage.eINSTANCE.eClass();
        IdentifierPackage.eINSTANCE.eClass();
        PcmPackage.eINSTANCE.eClass();
        ProbfunctionPackage.eINSTANCE.eClass();
        StoexPackage.eINSTANCE.eClass();
        UnitsPackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);
        RepositoryPackageImpl theRepositoryPackage = (RepositoryPackageImpl)(registeredPackage instanceof RepositoryPackageImpl ? registeredPackage : RepositoryPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(K8sconceptsPackage.eNS_URI);
        K8sconceptsPackageImpl theK8sconceptsPackage = (K8sconceptsPackageImpl)(registeredPackage instanceof K8sconceptsPackageImpl ? registeredPackage : K8sconceptsPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI);
        SystemPackageImpl theSystemPackage = (SystemPackageImpl)(registeredPackage instanceof SystemPackageImpl ? registeredPackage : SystemPackage.eINSTANCE);

        // Create package meta-data objects
        theResourceenvironmentPackage.createPackageContents();
        theRepositoryPackage.createPackageContents();
        theK8sconceptsPackage.createPackageContents();
        theSystemPackage.createPackageContents();

        // Initialize created meta-data
        theResourceenvironmentPackage.initializePackageContents();
        theRepositoryPackage.initializePackageContents();
        theK8sconceptsPackage.initializePackageContents();
        theSystemPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theResourceenvironmentPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ResourceenvironmentPackage.eNS_URI, theResourceenvironmentPackage);
        return theResourceenvironmentPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getKubernetesNode() {
        return kubernetesNodeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getKubernetesNode_IsMasterNode() {
        return (EAttribute)kubernetesNodeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getKubernetesNode_Memory() {
        return (EAttribute)kubernetesNodeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getKubernetesNode_Cpu() {
        return (EAttribute)kubernetesNodeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRunningPodNestedResourceContainer() {
        return runningPodNestedResourceContainerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRunningPodNestedResourceContainer_SelectorDeploymentReference() {
        return (EReference)runningPodNestedResourceContainerEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResourceenvironmentFactory getResourceenvironmentFactory() {
        return (ResourceenvironmentFactory)getEFactoryInstance();
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
        kubernetesNodeEClass = createEClass(KUBERNETES_NODE);
        createEAttribute(kubernetesNodeEClass, KUBERNETES_NODE__IS_MASTER_NODE);
        createEAttribute(kubernetesNodeEClass, KUBERNETES_NODE__MEMORY);
        createEAttribute(kubernetesNodeEClass, KUBERNETES_NODE__CPU);

        runningPodNestedResourceContainerEClass = createEClass(RUNNING_POD_NESTED_RESOURCE_CONTAINER);
        createEReference(runningPodNestedResourceContainerEClass, RUNNING_POD_NESTED_RESOURCE_CONTAINER__SELECTOR_DEPLOYMENT_REFERENCE);
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
        org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage theResourceenvironmentPackage_1 = (org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage.eNS_URI);
        EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
        K8sconceptsPackage theK8sconceptsPackage = (K8sconceptsPackage)EPackage.Registry.INSTANCE.getEPackage(K8sconceptsPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        kubernetesNodeEClass.getESuperTypes().add(theResourceenvironmentPackage_1.getResourceContainer());
        runningPodNestedResourceContainerEClass.getESuperTypes().add(theResourceenvironmentPackage_1.getResourceContainer());

        // Initialize classes and features; add operations and parameters
        initEClass(kubernetesNodeEClass, KubernetesNode.class, "KubernetesNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getKubernetesNode_IsMasterNode(), theEcorePackage.getEBoolean(), "isMasterNode", "false", 1, 1, KubernetesNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getKubernetesNode_Memory(), theEcorePackage.getEBigInteger(), "memory", null, 0, 1, KubernetesNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getKubernetesNode_Cpu(), theEcorePackage.getEInt(), "cpu", null, 0, 1, KubernetesNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(runningPodNestedResourceContainerEClass, RunningPodNestedResourceContainer.class, "RunningPodNestedResourceContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRunningPodNestedResourceContainer_SelectorDeploymentReference(), theK8sconceptsPackage.getDeployment(), null, "selectorDeploymentReference", null, 0, 1, RunningPodNestedResourceContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //ResourceenvironmentPackageImpl
