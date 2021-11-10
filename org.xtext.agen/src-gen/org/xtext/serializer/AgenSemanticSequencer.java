/*
 * generated by Xtext 2.25.0
 */
package org.xtext.serializer;

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
import org.xtext.agen.AgenPackage;
import org.xtext.agen.AlterPacketFault;
import org.xtext.agen.BigPacketFault;
import org.xtext.agen.CPULoader;
import org.xtext.agen.CodeBlock;
import org.xtext.agen.Condition;
import org.xtext.agen.ExecParams;
import org.xtext.agen.Exit;
import org.xtext.agen.Fault;
import org.xtext.agen.FaultCond;
import org.xtext.agen.LeakFault;
import org.xtext.agen.Log;
import org.xtext.agen.Model;
import org.xtext.agen.Node;
import org.xtext.agen.Random;
import org.xtext.agen.RepeatExecution;
import org.xtext.agen.RunConfiguration;
import org.xtext.agen.Sleep;
import org.xtext.agen.Syncpoint;
import org.xtext.agen.What;
import org.xtext.agen.When;
import org.xtext.agen.Where;
import org.xtext.agen.betweenRounds;
import org.xtext.agen.betweenSeconds;
import org.xtext.agen.randomBetweenRound;
import org.xtext.services.AgenGrammarAccess;

@SuppressWarnings("all")
public class AgenSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AgenGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == AgenPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case AgenPackage.ALTER_PACKET_FAULT:
				sequence_AlterPacketFault(context, (AlterPacketFault) semanticObject); 
				return; 
			case AgenPackage.BIG_PACKET_FAULT:
				sequence_BigPacketFault(context, (BigPacketFault) semanticObject); 
				return; 
			case AgenPackage.CPU_LOADER:
				sequence_CPULoader(context, (CPULoader) semanticObject); 
				return; 
			case AgenPackage.CODE_BLOCK:
				sequence_CodeBlock(context, (CodeBlock) semanticObject); 
				return; 
			case AgenPackage.CONDITION:
				sequence_Condition(context, (Condition) semanticObject); 
				return; 
			case AgenPackage.EXEC_PARAMS:
				sequence_ExecParams(context, (ExecParams) semanticObject); 
				return; 
			case AgenPackage.EXIT:
				sequence_Exit(context, (Exit) semanticObject); 
				return; 
			case AgenPackage.FAULT:
				sequence_Fault(context, (Fault) semanticObject); 
				return; 
			case AgenPackage.FAULT_COND:
				sequence_FaultCond(context, (FaultCond) semanticObject); 
				return; 
			case AgenPackage.LEAK_FAULT:
				sequence_LeakFault(context, (LeakFault) semanticObject); 
				return; 
			case AgenPackage.LOG:
				sequence_Log(context, (Log) semanticObject); 
				return; 
			case AgenPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case AgenPackage.NODE:
				sequence_Node(context, (Node) semanticObject); 
				return; 
			case AgenPackage.RANDOM:
				sequence_Random(context, (Random) semanticObject); 
				return; 
			case AgenPackage.REPEAT_EXECUTION:
				sequence_RepeatExecution(context, (RepeatExecution) semanticObject); 
				return; 
			case AgenPackage.RUN_CONFIGURATION:
				sequence_RunConfiguration(context, (RunConfiguration) semanticObject); 
				return; 
			case AgenPackage.SLEEP:
				sequence_Sleep(context, (Sleep) semanticObject); 
				return; 
			case AgenPackage.SYNCPOINT:
				sequence_Syncpoint(context, (Syncpoint) semanticObject); 
				return; 
			case AgenPackage.WHAT:
				sequence_What(context, (What) semanticObject); 
				return; 
			case AgenPackage.WHEN:
				sequence_When(context, (When) semanticObject); 
				return; 
			case AgenPackage.WHERE:
				sequence_Where(context, (Where) semanticObject); 
				return; 
			case AgenPackage.BETWEEN_ROUNDS:
				sequence_betweenRounds(context, (betweenRounds) semanticObject); 
				return; 
			case AgenPackage.BETWEEN_SECONDS:
				sequence_betweenSeconds(context, (betweenSeconds) semanticObject); 
				return; 
			case AgenPackage.RANDOM_BETWEEN_ROUND:
				sequence_randomBetweenRound(context, (randomBetweenRound) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AlterPacketFault returns AlterPacketFault
	 *
	 * Constraint:
	 *     (originalData=INT kindOfAlteration=AlterPacketFaultType)
	 */
	protected void sequence_AlterPacketFault(ISerializationContext context, AlterPacketFault semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AgenPackage.Literals.ALTER_PACKET_FAULT__ORIGINAL_DATA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AgenPackage.Literals.ALTER_PACKET_FAULT__ORIGINAL_DATA));
			if (transientValues.isValueTransient(semanticObject, AgenPackage.Literals.ALTER_PACKET_FAULT__KIND_OF_ALTERATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AgenPackage.Literals.ALTER_PACKET_FAULT__KIND_OF_ALTERATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAlterPacketFaultAccess().getOriginalDataINTTerminalRuleCall_2_0(), semanticObject.getOriginalData());
		feeder.accept(grammarAccess.getAlterPacketFaultAccess().getKindOfAlterationAlterPacketFaultTypeEnumRuleCall_4_0(), semanticObject.getKindOfAlteration());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     BigPacketFault returns BigPacketFault
	 *
	 * Constraint:
	 *     (originalData=INT timesLarger=INT)
	 */
	protected void sequence_BigPacketFault(ISerializationContext context, BigPacketFault semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AgenPackage.Literals.BIG_PACKET_FAULT__ORIGINAL_DATA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AgenPackage.Literals.BIG_PACKET_FAULT__ORIGINAL_DATA));
			if (transientValues.isValueTransient(semanticObject, AgenPackage.Literals.BIG_PACKET_FAULT__TIMES_LARGER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AgenPackage.Literals.BIG_PACKET_FAULT__TIMES_LARGER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBigPacketFaultAccess().getOriginalDataINTTerminalRuleCall_2_0(), semanticObject.getOriginalData());
		feeder.accept(grammarAccess.getBigPacketFaultAccess().getTimesLargerINTTerminalRuleCall_4_0(), semanticObject.getTimesLarger());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     CPULoader returns CPULoader
	 *
	 * Constraint:
	 *     amount=INT
	 */
	protected void sequence_CPULoader(ISerializationContext context, CPULoader semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AgenPackage.Literals.CPU_LOADER__AMOUNT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AgenPackage.Literals.CPU_LOADER__AMOUNT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCPULoaderAccess().getAmountINTTerminalRuleCall_2_0(), semanticObject.getAmount());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Types returns CodeBlock
	 *     CodeBlock returns CodeBlock
	 *
	 * Constraint:
	 *     (name=ID | (name=ID? imports=CODE_BOX? code=CODE_BOX))
	 */
	protected void sequence_CodeBlock(ISerializationContext context, CodeBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Types returns Condition
	 *     Condition returns Condition
	 *
	 * Constraint:
	 *     (name=ID | (name=ID? imports=CODE_BOX? code=CODE_BOX))
	 */
	protected void sequence_Condition(ISerializationContext context, Condition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExecParams returns ExecParams
	 *
	 * Constraint:
	 *     (name=ID | (name=ID? where=JOIN_TYPE when=When? what=What))
	 */
	protected void sequence_ExecParams(ISerializationContext context, ExecParams semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Exit returns Exit
	 *
	 * Constraint:
	 *     type=INT
	 */
	protected void sequence_Exit(ISerializationContext context, Exit semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AgenPackage.Literals.EXIT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AgenPackage.Literals.EXIT__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExitAccess().getTypeINTTerminalRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Types returns FaultCond
	 *     FaultCond returns FaultCond
	 *
	 * Constraint:
	 *     (name=ID | (name=ID? where=Where when=When? extraData=CodeBlock?))
	 */
	protected void sequence_FaultCond(ISerializationContext context, FaultCond semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Types returns Fault
	 *     Fault returns Fault
	 *
	 * Constraint:
	 *     (name=ID pointcut=STRING execParams+=ExecParams*)
	 */
	protected void sequence_Fault(ISerializationContext context, Fault semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LeakFault returns LeakFault
	 *
	 * Constraint:
	 *     nrofLeaks=INT
	 */
	protected void sequence_LeakFault(ISerializationContext context, LeakFault semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AgenPackage.Literals.LEAK_FAULT__NROF_LEAKS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AgenPackage.Literals.LEAK_FAULT__NROF_LEAKS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLeakFaultAccess().getNrofLeaksINTTerminalRuleCall_2_0(), semanticObject.getNrofLeaks());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Types returns Log
	 *     Log returns Log
	 *
	 * Constraint:
	 *     (name=ID faultCond=ID extraData=CodeBlock? stateBased=CodeBlock?)
	 */
	protected void sequence_Log(ISerializationContext context, Log semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     types+=Types+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Node returns Node
	 *
	 * Constraint:
	 *     (name=ID firstAttachPoint=STRING nodeLocation=STRING logLocations+=ID* faultIDs+=ID*)
	 */
	protected void sequence_Node(ISerializationContext context, Node semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Random returns Random
	 *
	 * Constraint:
	 *     chance=INT
	 */
	protected void sequence_Random(ISerializationContext context, Random semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AgenPackage.Literals.RANDOM__CHANCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AgenPackage.Literals.RANDOM__CHANCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRandomAccess().getChanceINTTerminalRuleCall_2_0(), semanticObject.getChance());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RepeatExecution returns RepeatExecution
	 *
	 * Constraint:
	 *     times=INT
	 */
	protected void sequence_RepeatExecution(ISerializationContext context, RepeatExecution semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AgenPackage.Literals.REPEAT_EXECUTION__TIMES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AgenPackage.Literals.REPEAT_EXECUTION__TIMES));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRepeatExecutionAccess().getTimesINTTerminalRuleCall_2_0(), semanticObject.getTimes());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Types returns RunConfiguration
	 *     RunConfiguration returns RunConfiguration
	 *
	 * Constraint:
	 *     (CoordinatorLocation=STRING nodes+=Node*)
	 */
	protected void sequence_RunConfiguration(ISerializationContext context, RunConfiguration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Sleep returns Sleep
	 *
	 * Constraint:
	 *     time=INT
	 */
	protected void sequence_Sleep(ISerializationContext context, Sleep semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AgenPackage.Literals.SLEEP__TIME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AgenPackage.Literals.SLEEP__TIME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSleepAccess().getTimeINTTerminalRuleCall_2_0(), semanticObject.getTime());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Types returns Syncpoint
	 *     Syncpoint returns Syncpoint
	 *
	 * Constraint:
	 *     (name=ID nodesDependant+=ID* type=syncpointType onFail=syncpointOnFail faultCond=FaultCond)
	 */
	protected void sequence_Syncpoint(ISerializationContext context, Syncpoint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     What returns What
	 *
	 * Constraint:
	 *     (
	 *         codeBlock=CodeBlock | 
	 *         sleep=Sleep | 
	 *         exit=Exit | 
	 *         bigPacketFault=BigPacketFault | 
	 *         leakFault=LeakFault | 
	 *         alterPacketFault=AlterPacketFault | 
	 *         cpuLoader=CPULoader | 
	 *         skipExecution=SkipExecution | 
	 *         repeatExecution=RepeatExecution
	 *     )
	 */
	protected void sequence_What(ISerializationContext context, What semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     When returns When
	 *
	 * Constraint:
	 *     (
	 *         betweenRounds=betweenRounds | 
	 *         betweenSeconds=betweenSeconds | 
	 *         random=Random | 
	 *         randomBetweenRound=randomBetweenRound | 
	 *         ifCondition=Condition | 
	 *         faultCond=FaultCond | 
	 *         syncpoint=ID
	 *     )
	 */
	protected void sequence_When(ISerializationContext context, When semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Types returns Where
	 *     Where returns Where
	 *
	 * Constraint:
	 *     (joinType=JOIN_TYPE? name=STRING)
	 */
	protected void sequence_Where(ISerializationContext context, Where semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     betweenRounds returns betweenRounds
	 *
	 * Constraint:
	 *     (start=INT end=INT interval=INT condition=Condition? random=Random?)
	 */
	protected void sequence_betweenRounds(ISerializationContext context, betweenRounds semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     betweenSeconds returns betweenSeconds
	 *
	 * Constraint:
	 *     (start=INT end=INT)
	 */
	protected void sequence_betweenSeconds(ISerializationContext context, betweenSeconds semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AgenPackage.Literals.BETWEEN_SECONDS__START) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AgenPackage.Literals.BETWEEN_SECONDS__START));
			if (transientValues.isValueTransient(semanticObject, AgenPackage.Literals.BETWEEN_SECONDS__END) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AgenPackage.Literals.BETWEEN_SECONDS__END));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBetweenSecondsAccess().getStartINTTerminalRuleCall_2_0(), semanticObject.getStart());
		feeder.accept(grammarAccess.getBetweenSecondsAccess().getEndINTTerminalRuleCall_4_0(), semanticObject.getEnd());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     randomBetweenRound returns randomBetweenRound
	 *
	 * Constraint:
	 *     (start=INT end=INT interval=INT chance=INT)
	 */
	protected void sequence_randomBetweenRound(ISerializationContext context, randomBetweenRound semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AgenPackage.Literals.RANDOM_BETWEEN_ROUND__START) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AgenPackage.Literals.RANDOM_BETWEEN_ROUND__START));
			if (transientValues.isValueTransient(semanticObject, AgenPackage.Literals.RANDOM_BETWEEN_ROUND__END) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AgenPackage.Literals.RANDOM_BETWEEN_ROUND__END));
			if (transientValues.isValueTransient(semanticObject, AgenPackage.Literals.RANDOM_BETWEEN_ROUND__INTERVAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AgenPackage.Literals.RANDOM_BETWEEN_ROUND__INTERVAL));
			if (transientValues.isValueTransient(semanticObject, AgenPackage.Literals.RANDOM_BETWEEN_ROUND__CHANCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AgenPackage.Literals.RANDOM_BETWEEN_ROUND__CHANCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRandomBetweenRoundAccess().getStartINTTerminalRuleCall_2_0(), semanticObject.getStart());
		feeder.accept(grammarAccess.getRandomBetweenRoundAccess().getEndINTTerminalRuleCall_4_0(), semanticObject.getEnd());
		feeder.accept(grammarAccess.getRandomBetweenRoundAccess().getIntervalINTTerminalRuleCall_6_0(), semanticObject.getInterval());
		feeder.accept(grammarAccess.getRandomBetweenRoundAccess().getChanceINTTerminalRuleCall_8_0(), semanticObject.getChance());
		feeder.finish();
	}
	
	
}