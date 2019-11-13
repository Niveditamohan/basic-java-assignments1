package com.training.interestcalculator;

import com.training.interestcalculator.exception.InvalidInputException;

public class Interest {

	/**
	 * Method to calculate SI for the input values (principle, time, rate)
	 * @return Returns calculated SI
	 * @throws InvalidInputException
	 */
	public static double calculateSimpleInterest(double principal, double time, double rate)
			throws InvalidInputException {
		if (time <= 0 || rate <= 0)
			throw new InvalidInputException("Please enter a valid input.");
		else {
			double simpleInterest = (principal * time * rate) / 100;
			return simpleInterest;
		}
	}

	/**
	 * Method to calculate CI for the input values (principle, time, rate)
	 * @return Returns calculated CI
	 * @throws InvalidInputException
	 */
	public static double calculateCompoundInterest(double principal, double time, double rate) throws InvalidInputException {
		if (time <= 0 || rate <= 0)
			throw new InvalidInputException("Please enter a valid input.");
		else {
			double compoundInterest = principal * Math.pow(1 + rate / 100.0, time);
			return compoundInterest;
		}
	}
}
