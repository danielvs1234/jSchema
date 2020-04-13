/*
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.mydsl.services.JSchemaGrammarAccess;

@SuppressWarnings("all")
public class JSchemaSyntacticSequencer extends AbstractSyntacticSequencer {

	protected JSchemaGrammarAccess grammarAccess;
	protected AbstractElementAlias match_PrimitiveProperties___LengthKeyword_0_0_INTTerminalRuleCall_0_1_HyphenMinusKeyword_0_2_INTTerminalRuleCall_0_3___or___PatternKeyword_1_0_QuotationMarkKeyword_1_1_STRINGTerminalRuleCall_1_2_QuotationMarkKeyword_1_3__;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (JSchemaGrammarAccess) access;
		match_PrimitiveProperties___LengthKeyword_0_0_INTTerminalRuleCall_0_1_HyphenMinusKeyword_0_2_INTTerminalRuleCall_0_3___or___PatternKeyword_1_0_QuotationMarkKeyword_1_1_STRINGTerminalRuleCall_1_2_QuotationMarkKeyword_1_3__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getPrimitivePropertiesAccess().getLengthKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getPrimitivePropertiesAccess().getINTTerminalRuleCall_0_1()), new TokenAlias(false, false, grammarAccess.getPrimitivePropertiesAccess().getHyphenMinusKeyword_0_2()), new TokenAlias(false, false, grammarAccess.getPrimitivePropertiesAccess().getINTTerminalRuleCall_0_3())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getPrimitivePropertiesAccess().getPatternKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getPrimitivePropertiesAccess().getQuotationMarkKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getPrimitivePropertiesAccess().getSTRINGTerminalRuleCall_1_2()), new TokenAlias(false, false, grammarAccess.getPrimitivePropertiesAccess().getQuotationMarkKeyword_1_3())));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getINTRule())
			return getINTToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSTRINGRule())
			return getSTRINGToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal INT returns ecore::EInt: ('0'..'9')+;
	 */
	protected String getINTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal STRING:
	 * 			'"' ( '\\' .  | !('\\'|'"') )* '"' |
	 * 			"'" ( '\\' .  | !('\\'|"'") )* "'"
	 * 		;
	 */
	protected String getSTRINGToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_PrimitiveProperties___LengthKeyword_0_0_INTTerminalRuleCall_0_1_HyphenMinusKeyword_0_2_INTTerminalRuleCall_0_3___or___PatternKeyword_1_0_QuotationMarkKeyword_1_1_STRINGTerminalRuleCall_1_2_QuotationMarkKeyword_1_3__.equals(syntax))
				emit_PrimitiveProperties___LengthKeyword_0_0_INTTerminalRuleCall_0_1_HyphenMinusKeyword_0_2_INTTerminalRuleCall_0_3___or___PatternKeyword_1_0_QuotationMarkKeyword_1_1_STRINGTerminalRuleCall_1_2_QuotationMarkKeyword_1_3__(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('length' INT '-' INT) | ('pattern' '"' STRING '"')
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_PrimitiveProperties___LengthKeyword_0_0_INTTerminalRuleCall_0_1_HyphenMinusKeyword_0_2_INTTerminalRuleCall_0_3___or___PatternKeyword_1_0_QuotationMarkKeyword_1_1_STRINGTerminalRuleCall_1_2_QuotationMarkKeyword_1_3__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
