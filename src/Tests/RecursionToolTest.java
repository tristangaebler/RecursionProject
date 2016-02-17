package Tests;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Model.RecursionTool;

/**
 * @author Cody Henrichsen
 * @version 0.x Feb 17, 2016
 */
public class RecursionToolTest
{
	private RecursionTool testTool;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception
	{
		testTool = new RecursionTool();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception
	{
		testTool = null;
	}

	/**
	 * Test method for {@link ctec.model.RecursionTool#getFibNumber(double)}.
	 */
	@Test
	public void testGetFibNumber()
	{
		assertTrue(1 == testTool.getFibNum(0));
		assertFalse(0 == testTool.getFibNum(3));
		assertTrue(Integer.MIN_VALUE == testTool.getFibNum(-5));
	}

	/**
	 * Test method for {@link ctec.model.RecursionTool#getFactorialNumber(double)}.
	 */
	@Test
	public void testGetFactorialNumber()
	{
		assertTrue(1 == testTool.getFactorial(0));
		assertTrue(120 == testTool.getFactorial(5));
		assertFalse(5 == testTool.getFactorial(3));
		assertTrue(Integer.MIN_VALUE == testTool.getFactorial(-5));
	}

}
