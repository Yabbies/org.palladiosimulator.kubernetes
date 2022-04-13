/**
 */
package kubernetesModel.k8sconcepts.impl;

import kubernetesModel.k8sconcepts.*;

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
public class K8sconceptsFactoryImpl extends EFactoryImpl implements K8sconceptsFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static K8sconceptsFactory init() {
        try {
            K8sconceptsFactory theK8sconceptsFactory = (K8sconceptsFactory)EPackage.Registry.INSTANCE.getEFactory(K8sconceptsPackage.eNS_URI);
            if (theK8sconceptsFactory != null) {
                return theK8sconceptsFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new K8sconceptsFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public K8sconceptsFactoryImpl() {
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
            case K8sconceptsPackage.K8S_STANDARD_REQUEST_LIMIT: return (EObject)createK8sStandardRequestLimit();
            case K8sconceptsPackage.K8S_ADDITIONAL_REQUEST_LIMIT: return (EObject)createK8sAdditionalRequestLimit();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public K8sStandardRequestLimit createK8sStandardRequestLimit() {
        K8sStandardRequestLimitImpl k8sStandardRequestLimit = new K8sStandardRequestLimitImpl();
        return k8sStandardRequestLimit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public K8sAdditionalRequestLimit createK8sAdditionalRequestLimit() {
        K8sAdditionalRequestLimitImpl k8sAdditionalRequestLimit = new K8sAdditionalRequestLimitImpl();
        return k8sAdditionalRequestLimit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public K8sconceptsPackage getK8sconceptsPackage() {
        return (K8sconceptsPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static K8sconceptsPackage getPackage() {
        return K8sconceptsPackage.eINSTANCE;
    }

} //K8sconceptsFactoryImpl
