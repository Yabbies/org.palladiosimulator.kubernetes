/**
 */
package kubernetesModel.repository.impl;

import kubernetesModel.repository.*;

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
public class RepositoryFactoryImpl extends EFactoryImpl implements RepositoryFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static RepositoryFactory init() {
        try {
            RepositoryFactory theRepositoryFactory = (RepositoryFactory)EPackage.Registry.INSTANCE.getEFactory(RepositoryPackage.eNS_URI);
            if (theRepositoryFactory != null) {
                return theRepositoryFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new RepositoryFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RepositoryFactoryImpl() {
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
            case RepositoryPackage.CONTAINER: return createContainer();
            case RepositoryPackage.POD: return createPod();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public kubernetesModel.repository.Container createContainer() {
        ContainerImpl container = new ContainerImpl();
        return container;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Pod createPod() {
        PodImpl pod = new PodImpl();
        return pod;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RepositoryPackage getRepositoryPackage() {
        return (RepositoryPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static RepositoryPackage getPackage() {
        return RepositoryPackage.eINSTANCE;
    }

} //RepositoryFactoryImpl
