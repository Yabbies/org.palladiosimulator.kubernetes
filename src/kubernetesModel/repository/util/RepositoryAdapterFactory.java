/**
 */
package kubernetesModel.repository.util;

import de.uka.ipd.sdq.identifier.Identifier;

import kubernetesModel.repository.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.PCMBaseClass;
import org.palladiosimulator.pcm.PCMClass;

import org.palladiosimulator.pcm.core.composition.ComposedStructure;

import org.palladiosimulator.pcm.core.entity.ComposedProvidingRequiringEntity;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.core.entity.InterfaceProvidingEntity;
import org.palladiosimulator.pcm.core.entity.InterfaceProvidingRequiringEntity;
import org.palladiosimulator.pcm.core.entity.InterfaceRequiringEntity;
import org.palladiosimulator.pcm.core.entity.NamedElement;
import org.palladiosimulator.pcm.core.entity.ResourceInterfaceRequiringEntity;

import org.palladiosimulator.pcm.repository.CompositeComponent;
import org.palladiosimulator.pcm.repository.ImplementationComponentType;
import org.palladiosimulator.pcm.repository.RepositoryComponent;

import org.palladiosimulator.pcm.subsystem.SubSystem;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see kubernetesModel.repository.RepositoryPackage
 * @generated
 */
public class RepositoryAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static RepositoryPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RepositoryAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = RepositoryPackage.eINSTANCE;
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
    protected RepositorySwitch<Adapter> modelSwitch =
        new RepositorySwitch<Adapter>() {
            @Override
            public Adapter caseContainer(Container object) {
                return createContainerAdapter();
            }
            @Override
            public Adapter casePod(Pod object) {
                return createPodAdapter();
            }
            @Override
            public Adapter caseIdentifier(Identifier object) {
                return createIdentifierAdapter();
            }
            @Override
            public Adapter casePCMClass(PCMClass object) {
                return createPCMClassAdapter();
            }
            @Override
            public Adapter casePCMBaseClass(PCMBaseClass object) {
                return createPCMBaseClassAdapter();
            }
            @Override
            public Adapter caseNamedElement(NamedElement object) {
                return createNamedElementAdapter();
            }
            @Override
            public Adapter caseEntity(Entity object) {
                return createEntityAdapter();
            }
            @Override
            public Adapter caseComposedStructure(ComposedStructure object) {
                return createComposedStructureAdapter();
            }
            @Override
            public Adapter caseInterfaceProvidingEntity(InterfaceProvidingEntity object) {
                return createInterfaceProvidingEntityAdapter();
            }
            @Override
            public Adapter caseResourceInterfaceRequiringEntity(ResourceInterfaceRequiringEntity object) {
                return createResourceInterfaceRequiringEntityAdapter();
            }
            @Override
            public Adapter caseInterfaceRequiringEntity(InterfaceRequiringEntity object) {
                return createInterfaceRequiringEntityAdapter();
            }
            @Override
            public Adapter caseInterfaceProvidingRequiringEntity(InterfaceProvidingRequiringEntity object) {
                return createInterfaceProvidingRequiringEntityAdapter();
            }
            @Override
            public Adapter caseComposedProvidingRequiringEntity(ComposedProvidingRequiringEntity object) {
                return createComposedProvidingRequiringEntityAdapter();
            }
            @Override
            public Adapter caseRepositoryComponent(RepositoryComponent object) {
                return createRepositoryComponentAdapter();
            }
            @Override
            public Adapter caseImplementationComponentType(ImplementationComponentType object) {
                return createImplementationComponentTypeAdapter();
            }
            @Override
            public Adapter caseCompositeComponent(CompositeComponent object) {
                return createCompositeComponentAdapter();
            }
            @Override
            public Adapter caseSubSystem(SubSystem object) {
                return createSubSystemAdapter();
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
     * Creates a new adapter for an object of class '{@link kubernetesModel.repository.Container <em>Container</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see kubernetesModel.repository.Container
     * @generated
     */
    public Adapter createContainerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link kubernetesModel.repository.Pod <em>Pod</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see kubernetesModel.repository.Pod
     * @generated
     */
    public Adapter createPodAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.identifier.Identifier <em>Identifier</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.uka.ipd.sdq.identifier.Identifier
     * @generated
     */
    public Adapter createIdentifierAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.PCMClass <em>PCM Class</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.pcm.PCMClass
     * @generated
     */
    public Adapter createPCMClassAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.PCMBaseClass <em>PCM Base Class</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.pcm.PCMBaseClass
     * @generated
     */
    public Adapter createPCMBaseClassAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.core.entity.NamedElement <em>Named Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.pcm.core.entity.NamedElement
     * @generated
     */
    public Adapter createNamedElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.core.entity.Entity <em>Entity</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.pcm.core.entity.Entity
     * @generated
     */
    public Adapter createEntityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.core.composition.ComposedStructure <em>Composed Structure</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.pcm.core.composition.ComposedStructure
     * @generated
     */
    public Adapter createComposedStructureAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.core.entity.InterfaceProvidingEntity <em>Interface Providing Entity</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.pcm.core.entity.InterfaceProvidingEntity
     * @generated
     */
    public Adapter createInterfaceProvidingEntityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.core.entity.ResourceInterfaceRequiringEntity <em>Resource Interface Requiring Entity</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.pcm.core.entity.ResourceInterfaceRequiringEntity
     * @generated
     */
    public Adapter createResourceInterfaceRequiringEntityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.core.entity.InterfaceRequiringEntity <em>Interface Requiring Entity</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.pcm.core.entity.InterfaceRequiringEntity
     * @generated
     */
    public Adapter createInterfaceRequiringEntityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.core.entity.InterfaceProvidingRequiringEntity <em>Interface Providing Requiring Entity</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.pcm.core.entity.InterfaceProvidingRequiringEntity
     * @generated
     */
    public Adapter createInterfaceProvidingRequiringEntityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.core.entity.ComposedProvidingRequiringEntity <em>Composed Providing Requiring Entity</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.pcm.core.entity.ComposedProvidingRequiringEntity
     * @generated
     */
    public Adapter createComposedProvidingRequiringEntityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.repository.RepositoryComponent <em>Component</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.pcm.repository.RepositoryComponent
     * @generated
     */
    public Adapter createRepositoryComponentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.repository.ImplementationComponentType <em>Implementation Component Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.pcm.repository.ImplementationComponentType
     * @generated
     */
    public Adapter createImplementationComponentTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.repository.CompositeComponent <em>Composite Component</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.pcm.repository.CompositeComponent
     * @generated
     */
    public Adapter createCompositeComponentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.subsystem.SubSystem <em>Sub System</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.pcm.subsystem.SubSystem
     * @generated
     */
    public Adapter createSubSystemAdapter() {
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

} //RepositoryAdapterFactory
