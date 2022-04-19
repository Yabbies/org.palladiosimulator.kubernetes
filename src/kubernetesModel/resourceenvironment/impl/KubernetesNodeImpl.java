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
 *   <li>{@link kubernetesModel.resourceenvironment.impl.KubernetesNodeImpl#getCpu <em>Cpu</em>}</li>
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
     * The default value of the '{@link #getCpu() <em>Cpu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCpu()
     * @generated
     * @ordered
     */
    protected static final int CPU_EDEFAULT = 0;

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
    public int getCpu() {
        return (Integer)eDynamicGet(ResourceenvironmentPackage.KUBERNETES_NODE__CPU, ResourceenvironmentPackage.Literals.KUBERNETES_NODE__CPU, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCpu(int newCpu) {
        eDynamicSet(ResourceenvironmentPackage.KUBERNETES_NODE__CPU, ResourceenvironmentPackage.Literals.KUBERNETES_NODE__CPU, newCpu);
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
            case ResourceenvironmentPackage.KUBERNETES_NODE__CPU:
                return getCpu();
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
            case ResourceenvironmentPackage.KUBERNETES_NODE__CPU:
                setCpu((Integer)newValue);
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
            case ResourceenvironmentPackage.KUBERNETES_NODE__CPU:
                setCpu(CPU_EDEFAULT);
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
            case ResourceenvironmentPackage.KUBERNETES_NODE__CPU:
                return getCpu() != CPU_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} //KubernetesNodeImpl
