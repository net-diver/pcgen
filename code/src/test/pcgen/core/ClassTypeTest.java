package pcgen.core;

import junit.framework.TestCase;

/**
 * <code>ClassTypeTest</code> <strong>needs documentation</strong>.
 */
public class ClassTypeTest extends TestCase
{
	/**
	 * Constructs a new <code>ClassTypeTest</code>.
	 *
	 * @see pcgen.PCGenTestCase#PCGenTestCase()
	 */
	public ClassTypeTest()
	{
		// Do Nothing
	}

	/**
	 * Constructs a new <code>ClassTypeTest</code> with the given <var>name</var>.
	 *
	 * @param name the test case name
	 *
	 * @see pcgen.PCGenTestCase#PCGenTestCase(String)
	 */
	public ClassTypeTest(final String name)
	{
		super(name);
	}

	/**
	 * test clone.
	 */
	public void testClone()
	{
		final ClassType expected = new ClassType();
		final ClassType actual = expected.clone();

		assertEquals(expected.getCRFormula(), actual.getCRFormula());
		assertEquals(expected.getXPPenalty(), actual.getXPPenalty());
		assertEquals(expected.isMonster(), actual.isMonster());
	}
}
