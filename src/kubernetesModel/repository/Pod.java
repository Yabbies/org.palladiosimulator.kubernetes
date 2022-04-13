/**
 */
package kubernetesModel.repository;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.repository.CompositeComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pod</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kubernetesModel.repository.Pod#getContainers <em>Containers</em>}</li>
 * </ul>
 *
 * @see kubernetesModel.repository.RepositoryPackage#getPod()
 * @model
 * @generated
 */
public interface Pod extends CompositeComponent {
    /**
     * Returns the value of the '<em><b>Containers</b></em>' reference list.
     * The list contents are of type {@link kubernetesModel.repository.Container}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Containers</em>' reference list.
     * @see kubernetesModel.repository.RepositoryPackage#getPod_Containers()
     * @model
     * @generated
     */
    EList<Container> getContainers();

} // Pod
