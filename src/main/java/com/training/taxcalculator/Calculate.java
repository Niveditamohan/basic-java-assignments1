package com.training.taxcalculator;

import com.training.taxcalculator.exception.InvalidSalaryException;

public class Calculate {

	/**
	 * Method to calculate tax for different salary ranges
	 * @return Returns calculated tax amount 
	 * and throws exception for invalid inputs
	 * @throws InvalidSalaryException
	 */
	public static double tax(double salary) throws InvalidSalaryException {
		if (salary >= 0 && salary <= 180000)
			return 0;
		else if (salary >= 180001 && salary <= 300000)
			return 0.1 * salary;
		else if (salary >= 300001 && salary <= 500000)
			return 0.2 * salary;
		else if (salary >= 500001 && salary <= 1000000)
			return 0.3 * salary;
		else
			throw new InvalidSalaryException("Enter salary in the range 0-1000000");
	}

}
