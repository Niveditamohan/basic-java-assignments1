package com.training.squarenumber;

import com.training.squarenumber.exception.OutOfRangeException;

public class NumberSquare {

	/**
	 * Method to calculate square of a number
	 * @return Returns squared number if the result is in the range otherwise throws exception
	 * @throws OutOfRangeException
	 */
	public static int square(int number) throws OutOfRangeException {

		if (number*number > Math.sqrt(Integer.MAX_VALUE))
			throw new OutOfRangeException("The size of the square of this number is out of range.");
		
		else
			return number*number;
	}
}