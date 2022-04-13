/**
 */
package kubernetesModel.k8sconcepts.util;

import kubernetesModel.k8sconcepts.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see kubernetesModel.k8sconcepts.K8sconceptsPackage
 * @generated
 */
public class K8sconceptsSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static K8sconceptsPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public K8sconceptsSwitch() {
        if (modelPackage == null) {
            modelPackage = K8sconceptsPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case K8sconceptsPackage.ABSTRACT_K8S_REQUEST_LIMIT: {
                AbstractK8sRequestLimit abstractK8sRequestLimit = (AbstractK8sRequestLimit)theEObject;
                T result = caseAbstractK8sRequestLimit(abstractK8sRequestLimit);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case K8sconceptsPackage.K8S_STANDARD_REQUEST_LIMIT: {
                K8sStandardRequestLimit k8sStandardRequestLimit = (K8sStandardRequestLimit)theEObject;
                T result = caseK8sStandardRequestLimit(k8sStandardRequestLimit);
                if (result == null) result = caseAbstractK8sRequestLimit(k8sStandardRequestLimit);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case K8sconceptsPackage.K8S_ADDITIONAL_REQUEST_LIMIT: {
                K8sAdditionalRequestLimit k8sAdditionalRequestLimit = (K8sAdditionalRequestLimit)theEObject;
                T result = caseK8sAdditionalRequestLimit(k8sAdditionalRequestLimit);
                if (result == null) result = caseAbstractK8sRequestLimit(k8sAdditionalRequestLimit);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract K8s Request Limit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract K8s Request Limit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractK8sRequestLimit(AbstractK8sRequestLimit object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>K8s Standard Request Limit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>K8s Standard Request Limit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseK8sStandardRequestLimit(K8sStandardRequestLimit object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>K8s Additional Request Limit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>K8s Additional Request Limit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseK8sAdditionalRequestLimit(K8sAdditionalRequestLimit object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //K8sconceptsSwitch
