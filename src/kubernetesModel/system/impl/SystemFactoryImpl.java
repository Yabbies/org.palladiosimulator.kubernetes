/**
 */
package kubernetesModel.system.impl;

import kubernetesModel.system.*;

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
public class SystemFactoryImpl extends EFactoryImpl implements SystemFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SystemFactory init() {
        try {
            SystemFactory theSystemFactory = (SystemFactory)EPackage.Registry.INSTANCE.getEFactory(SystemPackage.eNS_URI);
            if (theSystemFactory != null) {
                return theSystemFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new SystemFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SystemFactoryImpl() {
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
            case SystemPackage.DEPLOYMENT_ASSEMBLY: return createDeploymentAssembly();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DeploymentAssembly createDeploymentAssembly() {
        DeploymentAssemblyImpl deploymentAssembly = new DeploymentAssemblyImpl();
        return deploymentAssembly;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SystemPackage getSystemPackage() {
        return (SystemPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static SystemPackage getPackage() {
        return SystemPackage.eINSTANCE;
    }

} //SystemFactoryImpl
