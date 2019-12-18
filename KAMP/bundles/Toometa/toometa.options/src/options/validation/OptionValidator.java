/**
 *
 * $Id$
 */
package options.validation;

import effects.Effect;

import glossary.GlossaryTerm;

import java.util.Date;

import options.DecisionStatusEnum;
import options.OptionRepository;
import options.TextRationale;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link options.Option}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface OptionValidator {
	boolean validate();

	boolean validateDescription(String value);
	boolean validateStatus(DecisionStatusEnum value);
	boolean validateKeywords(EList<String> value);
	boolean validateRepository(OptionRepository value);
	boolean validateRationale(EList<TextRationale> value);
	boolean validateIsSelected(boolean value);
	boolean validateIsModelled(boolean value);
	boolean validateIsImplemented(boolean value);
	boolean validateTimeStamp(Date value);
	boolean validateTitle(String value);
	boolean validateEffects(EList<Effect> value);
	boolean validateUsedTerms(EList<GlossaryTerm> value);
}