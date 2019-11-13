package com.training.taxcalculator.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.training.taxcalculator.Calculate;
import com.training.taxcalculator.exception.InvalidSalaryException;

public class TestTaxCalculator {

	/**
	 * Tests the tax() method of Calculate class for valid input
	 * @throws InvalidSalaryException
	 */
	@Test
	public void testTaxCalculator() throws InvalidSalaryException {
		assertEquals(100000, Calculate.tax(500000),0.02);
	}
	
	/**
	 * Tests the tax() method of Calculate class for negative input
	 * @throws InvalidSalaryException
	 */
	@Test(expected = InvalidSalaryException.class)
	public void testTaxCalculatorForNegativeInput() throws InvalidSalaryException {
		Calculate.tax(-1000);
	}
	
	/**
	 * Tests the tax() method of Calculate class for larger input
	 * @throws InvalidSalaryException
	 */
	@Test(expected = InvalidSalaryException.class)
	public void testTaxCalculatorForLargeInput() throws InvalidSalaryException {
		Calculate.tax(1000001);
	}
}
