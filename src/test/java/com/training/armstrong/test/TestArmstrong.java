package com.training.armstrong.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.armstrong.ArmstrongFinder;
import com.training.armstrong.exception.InputOutOfRangeException;
import com.training.armstrong.exception.NegativeInputException;

public class TestArmstrong {

	/**
	 * Method to test calculate() method of ArmstrongFinder class for valid input
	 * 
	 * @throws InputOutOfRangeException
	 * @throws NegativeInputException
	 */
	@Test
	public void testPositiveNumberAndArmstrong() throws InputOutOfRangeException, NegativeInputException {
		assertEquals(true, ArmstrongFinder.calculate(153));
	}
	
	/**
	 * Method to test calculate() method of ArmstrongFinder class for valid input
	 * 
	 * @throws InputOutOfRangeException
	 * @throws NegativeInputException
	 */
	@Test
	public void testPositiveNumberAndNotArmstrong() throws NegativeInputException {
		assertEquals(true, ArmstrongFinder.calculate(100));
	}

	/**
	 * Method to test calculate() method of ArmstrongFinder class for negative input
	 * 
	 * @throws InputOutOfRangeException
	 * @throws NegativeInputException
	 */
	@Test(expected = NegativeInputException.class)
	public void testNegativeNumbers() throws NegativeInputException {
		ArmstrongFinder.calculate(-123);
	}
}
