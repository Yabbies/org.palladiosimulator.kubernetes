/**
 */
package kubernetesModel.resourceenvironment.impl;

import kubernetesModel.resourceenvironment.KubernetesNode;
import kubernetesModel.resourceenvironment.ResourceenvironmentPackage;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.resourceenvironment.impl.ResourceContainerImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kubernetes Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kubernetesModel.resourceenvironment.impl.KubernetesNodeImpl#isIsMasterNode <em>Is Master Node</em>}</li>
 *   <li>{@link kubernetesModel.resourceenvironment.impl.KubernetesNodeImpl#getMemory <em>Memory</em>}</li>
 *   <li>{@link kubernetesModel.resourceenvironment.impl.KubernetesNodeImpl#getMillicores <em>Millicores</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KubernetesNodeImpl extends ResourceContainerImpl implements KubernetesNode {
    /**
     * The default value of the '{@link #isIsMasterNode() <em>Is Master Node</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsMasterNode()
     * @generated
     * @ordered
     */
    protected static final boolean IS_MASTER_NODE_EDEFAULT = false;

    /**
     * The default value of the '{@link #getMemory() <em>Memory</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMemory()
     * @generated
     * @ordered
     */
    protected static final long MEMORY_EDEFAULT = 0L;

    /**
     * The default value of the '{@link #getMillicores() <em>Millicores</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMillicores()
     * @generated
     * @ordered
     */
    protected static final int MILLICORES_EDEFAULT = 0;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected KubernetesNodeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ResourceenvironmentPackage.Literals.KUBERNETES_NODE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsMasterNode() {
        return (Boolean)eDynamicGet(ResourceenvironmentPackage.KUBERNETES_NODE__IS_MASTER_NODE, ResourceenvironmentPackage.Literals.KUBERNETES_NODE__IS_MASTER_NODE, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsMasterNode(boolean newIsMasterNode) {
        eDynamicSet(ResourceenvironmentPackage.KUBERNETES_NODE__IS_MASTER_NODE, ResourceenvironmentPackage.Literals.KUBERNETES_NODE__IS_MASTER_NODE, newIsMasterNode);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public long getMemory() {
        return (Long)eDynamicGet(ResourceenvironmentPackage.KUBERNETES_NODE__MEMORY, ResourceenvironmentPackage.Literals.KUBERNETES_NODE__MEMORY, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMemory(long newMemory) {
        eDynamicSet(ResourceenvironmentPackage.KUBERNETES_NODE__MEMORY, ResourceenvironmentPackage.Literals.KUBERNETES_NODE__MEMORY, newMemory);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getMillicores() {
        return (Integer)eDynamicGet(ResourceenvironmentPackage.KUBERNETES_NODE__MILLICORES, ResourceenvironmentPackage.Literals.KUBERNETES_NODE__MILLICORES, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMillicores(int newMillicores) {
        eDynamicSet(ResourceenvironmentPackage.KUBERNETES_NODE__MILLICORES, ResourceenvironmentPackage.Literals.KUBERNETES_NODE__MILLICORES, newMillicores);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ResourceenvironmentPackage.KUBERNETES_NODE__IS_MASTER_NODE:
                return isIsMasterNode();
            case ResourceenvironmentPackage.KUBERNETES_NODE__MEMORY:
                return getMemory();
            case ResourceenvironmentPackage.KUBERNETES_NODE__MILLICORES:
                return getMillicores();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case ResourceenvironmentPackage.KUBERNETES_NODE__IS_MASTER_NODE:
                setIsMasterNode((Boolean)newValue);
                return;
            case ResourceenvironmentPackage.KUBERNETES_NODE__MEMORY:
                setMemory((Long)newValue);
                return;
            case ResourceenvironmentPackage.KUBERNETES_NODE__MILLICORES:
                setMillicores((Integer)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case ResourceenvironmentPackage.KUBERNETES_NODE__IS_MASTER_NODE:
                setIsMasterNode(IS_MASTER_NODE_EDEFAULT);
                return;
            case ResourceenvironmentPackage.KUBERNETES_NODE__MEMORY:
                setMemory(MEMORY_EDEFAULT);
                return;
            case ResourceenvironmentPackage.KUBERNETES_NODE__MILLICORES:
                setMillicores(MILLICORES_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case ResourceenvironmentPackage.KUBERNETES_NODE__IS_MASTER_NODE:
                return isIsMasterNode() != IS_MASTER_NODE_EDEFAULT;
            case ResourceenvironmentPackage.KUBERNETES_NODE__MEMORY:
                return getMemory() != MEMORY_EDEFAULT;
            case ResourceenvironmentPackage.KUBERNETES_NODE__MILLICORES:
                return getMillicores() != MILLICORES_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} //KubernetesNodeImpl
