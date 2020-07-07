/**
 */
package domijProject.tests;

import domijProject.DomijProjectFactory;
import domijProject.GlobalErrorHandler;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Global Error Handler</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GlobalErrorHandlerTest extends ProcessTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GlobalErrorHandlerTest.class);
	}

	/**
	 * Constructs a new Global Error Handler test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalErrorHandlerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Global Error Handler test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GlobalErrorHandler getFixture() {
		return (GlobalErrorHandler)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DomijProjectFactory.eINSTANCE.createGlobalErrorHandler());
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

} //GlobalErrorHandlerTest
