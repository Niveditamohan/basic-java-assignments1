package com.training.armstrong;

import com.training.armstrong.exception.InputOutOfRangeException;
import com.training.armstrong.exception.NegativeInputException;

public class ArmstrongFinder {

	/**
	 * Function to calculate no. of digits in a number
	 * 
	 * @throws InputOutOfRangeException
	 * @throws NegativeInputException 
	 */
	public static boolean calculate(int number) throws NegativeInputException {
		int length = 0;
		int temp = 0, result = 0;
		boolean answer = false;
		
		if(number<0)
			throw new NegativeInputException("Number cannot be negative, please provide positive number!");
		
		else {
			while (number != 0) {
				number = number / 10;
				++length;
			}

			while (number != 0) {
				temp = number % 10;
				result = result + (int) Math.pow(temp, length);
				number /= 10;
			}

			if (result == number)
				answer = true;

			return answer;
		}
	}
}
