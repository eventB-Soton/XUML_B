/*
 * generated by Xtext 2.22.0
 */
package ac.soton.xumlb.serializer;

import ac.soton.eventb.classdiagrams.Association;
import ac.soton.eventb.classdiagrams.ClassAttribute;
import ac.soton.eventb.classdiagrams.ClassConstraint;
import ac.soton.eventb.classdiagrams.ClassMethod;
import ac.soton.eventb.classdiagrams.Classdiagram;
import ac.soton.eventb.classdiagrams.ClassdiagramsPackage;
import ac.soton.eventb.classdiagrams.SubtypeGroup;
import ac.soton.eventb.emf.core.extension.coreextension.CoreextensionPackage;
import ac.soton.eventb.emf.core.extension.coreextension.TypedParameter;
import ac.soton.eventb.emf.diagrams.DiagramsPackage;
import ac.soton.eventb.emf.diagrams.UMLB;
import ac.soton.eventb.statemachines.Any;
import ac.soton.eventb.statemachines.Final;
import ac.soton.eventb.statemachines.Fork;
import ac.soton.eventb.statemachines.Initial;
import ac.soton.eventb.statemachines.Junction;
import ac.soton.eventb.statemachines.State;
import ac.soton.eventb.statemachines.Statemachine;
import ac.soton.eventb.statemachines.StatemachinesPackage;
import ac.soton.eventb.statemachines.Transition;
import ac.soton.xumlb.services.XUmlbGrammarAccess;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.eventb.emf.core.CorePackage;
import org.eventb.emf.core.machine.Guard;
import org.eventb.emf.core.machine.Invariant;
import org.eventb.emf.core.machine.MachinePackage;
import org.eventb.emf.core.machine.Witness;

@SuppressWarnings("all")
public class XUmlbSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private XUmlbGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ClassdiagramsPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ClassdiagramsPackage.ASSOCIATION:
				sequence_Association(context, (Association) semanticObject); 
				return; 
			case ClassdiagramsPackage.CLASS:
				sequence_Class(context, (ac.soton.eventb.classdiagrams.Class) semanticObject); 
				return; 
			case ClassdiagramsPackage.CLASS_ATTRIBUTE:
				sequence_ClassAttribute(context, (ClassAttribute) semanticObject); 
				return; 
			case ClassdiagramsPackage.CLASS_CONSTRAINT:
				sequence_ClassConstraint(context, (ClassConstraint) semanticObject); 
				return; 
			case ClassdiagramsPackage.CLASS_METHOD:
				sequence_ClassMethod(context, (ClassMethod) semanticObject); 
				return; 
			case ClassdiagramsPackage.CLASSDIAGRAM:
				sequence_Classdiagram(context, (Classdiagram) semanticObject); 
				return; 
			case ClassdiagramsPackage.SUBTYPE_GROUP:
				sequence_SubtypeGroup(context, (SubtypeGroup) semanticObject); 
				return; 
			}
		else if (epackage == CoreextensionPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case CoreextensionPackage.TYPED_PARAMETER:
				sequence_TypedParameter(context, (TypedParameter) semanticObject); 
				return; 
			}
		else if (epackage == DiagramsPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DiagramsPackage.UMLB:
				sequence_XUMLB(context, (UMLB) semanticObject); 
				return; 
			}
		else if (epackage == MachinePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MachinePackage.ACTION:
				sequence_Action(context, (org.eventb.emf.core.machine.Action) semanticObject); 
				return; 
			case MachinePackage.GUARD:
				sequence_Guard(context, (Guard) semanticObject); 
				return; 
			case MachinePackage.INVARIANT:
				sequence_Invariant(context, (Invariant) semanticObject); 
				return; 
			case MachinePackage.WITNESS:
				sequence_Witness(context, (Witness) semanticObject); 
				return; 
			}
		else if (epackage == StatemachinesPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case StatemachinesPackage.ANY:
				sequence_Any(context, (Any) semanticObject); 
				return; 
			case StatemachinesPackage.FINAL:
				sequence_Final(context, (Final) semanticObject); 
				return; 
			case StatemachinesPackage.FORK:
				sequence_Fork(context, (Fork) semanticObject); 
				return; 
			case StatemachinesPackage.INITIAL:
				sequence_Initial(context, (Initial) semanticObject); 
				return; 
			case StatemachinesPackage.JUNCTION:
				sequence_Junction(context, (Junction) semanticObject); 
				return; 
			case StatemachinesPackage.STATE:
				sequence_State(context, (State) semanticObject); 
				return; 
			case StatemachinesPackage.STATEMACHINE:
				sequence_Statemachine(context, (Statemachine) semanticObject); 
				return; 
			case StatemachinesPackage.TRANSITION:
				sequence_Transition(context, (Transition) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Action returns Action
	 *
	 * Constraint:
	 *     (name=XLABEL action=XFormula)
	 */
	protected void sequence_Action(ISerializationContext context, org.eventb.emf.core.machine.Action semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME));
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BACTION__ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BACTION__ACTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getActionAccess().getNameXLABELTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getActionAccess().getActionXFormulaParserRuleCall_1_0(), semanticObject.getAction());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractNode returns Any
	 *     Any returns Any
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Any(ISerializationContext context, Any semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAnyAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Association returns Association
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         dataKind=DataKind 
	 *         elaborates=[EventBNamed|QualifiedName]? 
	 *         functional?='functional'? 
	 *         total?='total'? 
	 *         surjective?='surjective'? 
	 *         injective?='injective'? 
	 *         initialValue=EString? 
	 *         source=[Class|QualifiedName] 
	 *         target=[Class|QualifiedName]
	 *     )
	 */
	protected void sequence_Association(ISerializationContext context, Association semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ClassAttribute returns ClassAttribute
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         dataKind=DataKind 
	 *         elaborates=[EventBNamed|QualifiedName]? 
	 *         functional?='functional'? 
	 *         total?='total'? 
	 *         surjective?='surjective'? 
	 *         injective?='injective'? 
	 *         initialValue=EString? 
	 *         target=EString
	 *     )
	 */
	protected void sequence_ClassAttribute(ISerializationContext context, ClassAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ClassConstraint returns ClassConstraint
	 *
	 * Constraint:
	 *     (theorem?='theorem'? name=ID predicate=XFormula component=[EventBNamedCommentedComponentElement|QualifiedName])
	 */
	protected void sequence_ClassConstraint(ISerializationContext context, ClassConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ClassMethod returns ClassMethod
	 *
	 * Constraint:
	 *     (
	 *         kind=MethodKind 
	 *         elaborates+=[Event|QualifiedName]* 
	 *         extended?='extended'? 
	 *         (parameters+=TypedParameter parameters+=TypedParameter*)? 
	 *         guards+=Guard* 
	 *         actions+=Action* 
	 *         witnesses+=Witness*
	 *     )
	 */
	protected void sequence_ClassMethod(ISerializationContext context, ClassMethod semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EventBSuperType returns Class
	 *     Class returns Class
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         dataKind=DataKind 
	 *         elaborates=[EventBNamed|QualifiedName]? 
	 *         selfName=EString? 
	 *         instances=EString? 
	 *         supertypes+=[EventBSuperType|ID]* 
	 *         refines=[Class|QualifiedName]? 
	 *         statemachines+=Statemachine* 
	 *         classAttributes+=ClassAttribute* 
	 *         constraints+=ClassConstraint* 
	 *         methods+=ClassMethod* 
	 *         subtypeGroups+=SubtypeGroup*
	 *     )
	 */
	protected void sequence_Class(ISerializationContext context, ac.soton.eventb.classdiagrams.Class semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     XDiagram returns Classdiagram
	 *     Classdiagram returns Classdiagram
	 *
	 * Constraint:
	 *     (name=ID refines=[Classdiagram|QualifiedName]? classes+=Class* associations+=Association*)
	 */
	protected void sequence_Classdiagram(ISerializationContext context, Classdiagram semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractNode returns Final
	 *     Final returns Final
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Final(ISerializationContext context, Final semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFinalAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractNode returns Fork
	 *     Fork returns Fork
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Fork(ISerializationContext context, Fork semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getForkAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Guard returns Guard
	 *
	 * Constraint:
	 *     (theorem?='theorem'? name=XLABEL predicate=XFormula)
	 */
	protected void sequence_Guard(ISerializationContext context, Guard semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractNode returns Initial
	 *     Initial returns Initial
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Initial(ISerializationContext context, Initial semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInitialAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Invariant returns Invariant
	 *
	 * Constraint:
	 *     (theorem?='theorem'? name=XLABEL predicate=XFormula)
	 */
	protected void sequence_Invariant(ISerializationContext context, Invariant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractNode returns Junction
	 *     Junction returns Junction
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Junction(ISerializationContext context, Junction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getJunctionAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractNode returns State
	 *     State returns State
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         refines=[State|QualifiedName]? 
	 *         (statemachines+=Statemachine statemachines+=Statemachine*)? 
	 *         invariants+=Invariant* 
	 *         entryActions+=Action* 
	 *         exitActions+=Action*
	 *     )
	 */
	protected void sequence_State(ISerializationContext context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     XDiagram returns Statemachine
	 *     Statemachine returns Statemachine
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         translation=TranslationKind 
	 *         refines=[Statemachine|QualifiedName]? 
	 *         (instances=[EventBNamedCommentedElement|QualifiedName] selfName=EString)? 
	 *         nodes+=AbstractNode* 
	 *         transitions+=Transition*
	 *     )
	 */
	protected void sequence_Statemachine(ISerializationContext context, Statemachine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EventBSuperType returns SubtypeGroup
	 *     SubtypeGroup returns SubtypeGroup
	 *
	 * Constraint:
	 *     (name=ID cover?='cover'? disjoint?='disjoint'?)
	 */
	protected void sequence_SubtypeGroup(ISerializationContext context, SubtypeGroup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Transition returns Transition
	 *
	 * Constraint:
	 *     (
	 *         elaborates+=[Event|QualifiedName]* 
	 *         extended?='extended'? 
	 *         source=[AbstractNode|QualifiedName] 
	 *         target=[AbstractNode|QualifiedName] 
	 *         (parameters+=TypedParameter parameters+=TypedParameter*)? 
	 *         guards+=Guard* 
	 *         actions+=Action* 
	 *         witnesses+=Witness*
	 *     )
	 */
	protected void sequence_Transition(ISerializationContext context, Transition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TypedParameter returns TypedParameter
	 *
	 * Constraint:
	 *     (name=ID type=XType)
	 */
	protected void sequence_TypedParameter(ISerializationContext context, TypedParameter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME));
			if (transientValues.isValueTransient(semanticObject, CoreextensionPackage.Literals.TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CoreextensionPackage.Literals.TYPE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTypedParameterAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTypedParameterAccess().getTypeXTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Witness returns Witness
	 *
	 * Constraint:
	 *     (name=XLABEL predicate=XFormula)
	 */
	protected void sequence_Witness(ISerializationContext context, Witness semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME));
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BPREDICATE__PREDICATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BPREDICATE__PREDICATE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWitnessAccess().getNameXLABELTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getWitnessAccess().getPredicateXFormulaParserRuleCall_1_0(), semanticObject.getPredicate());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     XUMLB returns UMLB
	 *
	 * Constraint:
	 *     (name=ID elaborates=[EventBNamedCommentedComponentElement|QualifiedName]? refines=[UMLB|QualifiedName]? diagrams+=XDiagram*)
	 */
	protected void sequence_XUMLB(ISerializationContext context, UMLB semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
