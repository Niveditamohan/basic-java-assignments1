package com.training.squarenumber.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.squarenumber.NumberSquare;
import com.training.squarenumber.exception.OutOfRangeException;

public class TestNumberSquare {

	/**
	 * Method to test square() method of NumberSquare class for positive input
	 * @throws OutOfRangeException
	 */
	@Test
	public void testSquareOfANumberWhenInputIsPositive() throws OutOfRangeException {
		assertEquals(25, NumberSquare.square(5), 0.02);
	}
	
	/**
	 * Method to test square() method of NumberSquare class for negative input
	 * @throws OutOfRangeException
	 */
	@Test
	public void testSquareOfANumberWhenInputIsNegative() throws OutOfRangeException {
		assertEquals(49, NumberSquare.square(-7), 0.03);
	}
	
	/**
	 * Method to test square() method of NumberSquare class for negative input whose 
	 * result is out of range so it throws exception
	 * 
	 * @throws OutOfRangeException
	 */
	@Test(expected = OutOfRangeException.class)
	public void testSquareOfANumberWhenInputIsNegativeAndResultIsOutOfRange() throws OutOfRangeException {
		NumberSquare.square(-999999999);
	}
	
	/**
	 * Method to test square() method of NumberSquare class for positive input whose 
	 * result is out of range so it throws exception
	 * 
	 * @throws OutOfRangeException
	 */
	@Test(expected = OutOfRangeException.class)
	public void testSquareOfANumberWhenInputIsPositiveAndResultIsOutOfRange() throws OutOfRangeException {
		NumberSquare.square(999999999);
	}
}
