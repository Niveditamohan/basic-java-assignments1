package com.training.interestcalculator.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.interestcalculator.Interest;
import com.training.interestcalculator.exception.InvalidInputException;

public class TestInterestCalculator {

	/**
	 * Method to test calculateSimpleInterest() method for Interest class for valid inputs 
	 * @throws InvalidInputException
	 */
	@Test
	public void testSimpleInterestCalculatorForValidInput() throws InvalidInputException {
		assertEquals(5000, Interest.calculateSimpleInterest(20000, 5, 5),0.02);
	}
	
	/**
	 * Method to test calculateCompoundInterest() method for Interest class for valid inputs
	 * @throws InvalidInputException
	 */
	@Test
	public void testCompoundInterestCalculatorForValidInput() throws InvalidInputException {
		assertEquals(23185.48, Interest.calculateCompoundInterest(20000, 5, 3),0.02);
	}
	
	/**
	 * Method to test calculateSimpleInterest() method for Interest class 
	 * when time input is invalid
	 * @throws InvalidInputException
	 */
	@Test(expected = InvalidInputException.class)
	public void testSimpleInterestCalculatorForInvalidYearInput() throws InvalidInputException {
		assertEquals(1000, Interest.calculateCompoundInterest(20000, -5, 4),0.02);
	}
	
	/**
	 * Method to test calculateCompoundInterest() method for Interest class
	 * when time input is invalid
	 * @throws InvalidInputException
	 */
	@Test(expected = InvalidInputException.class)
	public void testCompoundInterestCalculatorForInvalidYearInput() throws InvalidInputException {
		assertEquals(1000, Interest.calculateCompoundInterest(20000, 0, 3),0.02);
	}
	
	/**
	 * Method to test calculateSimpleInterest() method for Interest class
	 * when rate of interest is invalid 
	 * @throws InvalidInputException
	 */
	@Test(expected = InvalidInputException.class)
	public void testSimpleInterestCalculatorForInvalidRateInput() throws InvalidInputException {
		assertEquals(1000, Interest.calculateCompoundInterest(20000, 5, -3),0.02);
	}
	
	/**
	 * Method to test calculateCompoundInterest() method for Interest class
	 * when rate is invalid
	 * @throws InvalidInputException
	 */
	@Test(expected = InvalidInputException.class)
	public void testCompoundInterestCalculatorForInvalidRateInput() throws InvalidInputException {
		assertEquals(1000, Interest.calculateCompoundInterest(20000, 5, 0),0.02);
	}
}
