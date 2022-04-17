/**
 */
package kubernetesModel.system.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import kubernetesModel.k8sconcepts.K8sconceptsPackage;

import kubernetesModel.k8sconcepts.impl.K8sconceptsPackageImpl;

import kubernetesModel.repository.RepositoryPackage;

import kubernetesModel.repository.impl.RepositoryPackageImpl;

import kubernetesModel.resourceenvironment.ResourceenvironmentPackage;

import kubernetesModel.resourceenvironment.impl.ResourceenvironmentPackageImpl;

import kubernetesModel.system.DeploymentAssembly;
import kubernetesModel.system.SystemFactory;
import kubernetesModel.system.SystemPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcm.core.composition.CompositionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemPackageImpl extends EPackageImpl implements SystemPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass deploymentAssemblyEClass = null;

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
     * @see kubernetesModel.system.SystemPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private SystemPackageImpl() {
        super(eNS_URI, SystemFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link SystemPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static SystemPackage init() {
        if (isInited) return (SystemPackage)EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI);

        // Obtain or create and register package
        Object registeredSystemPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        SystemPackageImpl theSystemPackage = registeredSystemPackage instanceof SystemPackageImpl ? (SystemPackageImpl)registeredSystemPackage : new SystemPackageImpl();

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
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(K8sconceptsPackage.eNS_URI);
        K8sconceptsPackageImpl theK8sconceptsPackage = (K8sconceptsPackageImpl)(registeredPackage instanceof K8sconceptsPackageImpl ? registeredPackage : K8sconceptsPackage.eINSTANCE);

        // Create package meta-data objects
        theSystemPackage.createPackageContents();
        theResourceenvironmentPackage.createPackageContents();
        theRepositoryPackage.createPackageContents();
        theK8sconceptsPackage.createPackageContents();

        // Initialize created meta-data
        theSystemPackage.initializePackageContents();
        theResourceenvironmentPackage.initializePackageContents();
        theRepositoryPackage.initializePackageContents();
        theK8sconceptsPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theSystemPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(SystemPackage.eNS_URI, theSystemPackage);
        return theSystemPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDeploymentAssembly() {
        return deploymentAssemblyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDeploymentAssembly_Deployment() {
        return (EReference)deploymentAssemblyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SystemFactory getSystemFactory() {
        return (SystemFactory)getEFactoryInstance();
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
        deploymentAssemblyEClass = createEClass(DEPLOYMENT_ASSEMBLY);
        createEReference(deploymentAssemblyEClass, DEPLOYMENT_ASSEMBLY__DEPLOYMENT);
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
        CompositionPackage theCompositionPackage = (CompositionPackage)EPackage.Registry.INSTANCE.getEPackage(CompositionPackage.eNS_URI);
        K8sconceptsPackage theK8sconceptsPackage = (K8sconceptsPackage)EPackage.Registry.INSTANCE.getEPackage(K8sconceptsPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        deploymentAssemblyEClass.getESuperTypes().add(theCompositionPackage.getAssemblyContext());

        // Initialize classes and features; add operations and parameters
        initEClass(deploymentAssemblyEClass, DeploymentAssembly.class, "DeploymentAssembly", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDeploymentAssembly_Deployment(), theK8sconceptsPackage.getDeployment(), null, "deployment", null, 0, 1, DeploymentAssembly.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //SystemPackageImpl
