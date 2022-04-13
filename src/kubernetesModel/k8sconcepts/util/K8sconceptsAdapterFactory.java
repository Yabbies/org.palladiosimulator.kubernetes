/**
 */
package kubernetesModel.k8sconcepts.util;

import kubernetesModel.k8sconcepts.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see kubernetesModel.k8sconcepts.K8sconceptsPackage
 * @generated
 */
public class K8sconceptsAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static K8sconceptsPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public K8sconceptsAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = K8sconceptsPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected K8sconceptsSwitch<Adapter> modelSwitch =
        new K8sconceptsSwitch<Adapter>() {
            @Override
            public Adapter caseAbstractK8sRequestLimit(AbstractK8sRequestLimit object) {
                return createAbstractK8sRequestLimitAdapter();
            }
            @Override
            public Adapter caseK8sStandardRequestLimit(K8sStandardRequestLimit object) {
                return createK8sStandardRequestLimitAdapter();
            }
            @Override
            public Adapter caseK8sAdditionalRequestLimit(K8sAdditionalRequestLimit object) {
                return createK8sAdditionalRequestLimitAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link kubernetesModel.k8sconcepts.AbstractK8sRequestLimit <em>Abstract K8s Request Limit</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see kubernetesModel.k8sconcepts.AbstractK8sRequestLimit
     * @generated
     */
    public Adapter createAbstractK8sRequestLimitAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link kubernetesModel.k8sconcepts.K8sStandardRequestLimit <em>K8s Standard Request Limit</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see kubernetesModel.k8sconcepts.K8sStandardRequestLimit
     * @generated
     */
    public Adapter createK8sStandardRequestLimitAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link kubernetesModel.k8sconcepts.K8sAdditionalRequestLimit <em>K8s Additional Request Limit</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see kubernetesModel.k8sconcepts.K8sAdditionalRequestLimit
     * @generated
     */
    public Adapter createK8sAdditionalRequestLimitAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //K8sconceptsAdapterFactory
