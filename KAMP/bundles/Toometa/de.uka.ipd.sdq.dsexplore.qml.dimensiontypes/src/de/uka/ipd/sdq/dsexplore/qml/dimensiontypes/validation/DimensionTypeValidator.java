/**
 *
 * $Id$
 */
package de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.validation;

import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.RelationSemantics;

/**
 * A sample validator interface for {@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DimensionTypeValidator {
	boolean validate();

	boolean validateRelationSemantics(RelationSemantics value);
}