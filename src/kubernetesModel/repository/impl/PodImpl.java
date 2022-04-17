/**
 */
package kubernetesModel.repository.impl;

import java.util.Collection;

import kubernetesModel.repository.Pod;
import kubernetesModel.repository.RepositoryPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.subsystem.impl.SubSystemImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pod</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kubernetesModel.repository.impl.PodImpl#getContainers <em>Containers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PodImpl extends SubSystemImpl implements Pod {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PodImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RepositoryPackage.Literals.POD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<kubernetesModel.repository.Container> getContainers() {
        return (EList<kubernetesModel.repository.Container>)eDynamicGet(RepositoryPackage.POD__CONTAINERS, RepositoryPackage.Literals.POD__CONTAINERS, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case RepositoryPackage.POD__CONTAINERS:
                return getContainers();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case RepositoryPackage.POD__CONTAINERS:
                getContainers().clear();
                getContainers().addAll((Collection<? extends kubernetesModel.repository.Container>)newValue);
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
            case RepositoryPackage.POD__CONTAINERS:
                getContainers().clear();
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
            case RepositoryPackage.POD__CONTAINERS:
                return !getContainers().isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //PodImpl
