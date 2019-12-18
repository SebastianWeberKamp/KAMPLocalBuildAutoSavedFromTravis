/**
 *
 * $Id$
 */
package relations.validation;

import org.eclipse.emf.common.util.EList;

import relations.AlternativeObject;

/**
 * A sample validator interface for {@link relations.AlternativeObject}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AlternativeObjectValidator {
	boolean validate();

	boolean validateAlternativeTo(EList<AlternativeObject> value);
	boolean validateHasAlternatives(EList<AlternativeObject> value);
}
