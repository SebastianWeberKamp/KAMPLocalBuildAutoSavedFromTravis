/**
 */
package edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.tests;

import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyReleaseDeviceResourceAction;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>BP Modify Release Device Resource Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BPModifyReleaseDeviceResourceActionTest extends BPModifyAbstractUserActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BPModifyReleaseDeviceResourceActionTest.class);
	}

	/**
	 * Constructs a new BP Modify Release Device Resource Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPModifyReleaseDeviceResourceActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this BP Modify Release Device Resource Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BPModifyReleaseDeviceResourceAction getFixture() {
		return (BPModifyReleaseDeviceResourceAction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BPModificationmarksFactory.eINSTANCE.createBPModifyReleaseDeviceResourceAction());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //BPModifyReleaseDeviceResourceActionTest
