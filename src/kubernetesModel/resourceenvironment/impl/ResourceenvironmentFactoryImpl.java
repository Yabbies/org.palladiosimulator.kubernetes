/**
 */
package kubernetesModel.resourceenvironment.impl;

import kubernetesModel.resourceenvironment.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceenvironmentFactoryImpl extends EFactoryImpl implements ResourceenvironmentFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ResourceenvironmentFactory init() {
        try {
            ResourceenvironmentFactory theResourceenvironmentFactory = (ResourceenvironmentFactory)EPackage.Registry.INSTANCE.getEFactory(ResourceenvironmentPackage.eNS_URI);
            if (theResourceenvironmentFactory != null) {
                return theResourceenvironmentFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ResourceenvironmentFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResourceenvironmentFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case ResourceenvironmentPackage.KUBERNETES_NODE: return createKubernetesNode();
            case ResourceenvironmentPackage.RUNNING_POD_NESTED_RESOURCE_CONTAINER: return createRunningPodNestedResourceContainer();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KubernetesNode createKubernetesNode() {
        KubernetesNodeImpl kubernetesNode = new KubernetesNodeImpl();
        return kubernetesNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RunningPodNestedResourceContainer createRunningPodNestedResourceContainer() {
        RunningPodNestedResourceContainerImpl runningPodNestedResourceContainer = new RunningPodNestedResourceContainerImpl();
        return runningPodNestedResourceContainer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResourceenvironmentPackage getResourceenvironmentPackage() {
        return (ResourceenvironmentPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ResourceenvironmentPackage getPackage() {
        return ResourceenvironmentPackage.eINSTANCE;
    }

} //ResourceenvironmentFactoryImpl
