package com.arithmetic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Test coverage to capture simple calculator {@link Calculator} operations.
 * 
 * @author Sabby Anandan
 * 
 */
public class CalculatorTest {
	Calculator cal;

	@Before
	public void setUp() throws Exception {
		this.cal = new Calculator();
	}

	@After
	public void tearDown() throws Exception {
		this.cal = null;
	}

	@Test
	public void test_createObject_isSuccessful() {
		assertNotNull(this.cal);
	}

	@Test
	public void test_addTwoNumbers_returnsSum() {
		final int sum = this.cal.add(1, 2);
		assertEquals(sum, 3);
	}

	@Test
	public void test_divideTwoNumbers_returnsResult() {
		final int result = this.cal.divide(10, 2);
		assertEquals(result, 5);
	}

	@Test(expected = ArithmeticException.class)
	public void test_divideByZero_throwException() {
		final int result = this.cal.divide(10, 0);
	}
}
