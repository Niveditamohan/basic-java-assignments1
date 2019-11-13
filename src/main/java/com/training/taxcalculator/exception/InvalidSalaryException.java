package com.training.taxcalculator.exception;

public class InvalidSalaryException extends Exception {

	public InvalidSalaryException() {
	}
	
	/**
	 * Passes message to super class Exception
	 */
	public InvalidSalaryException(String message) {
		super(message);
	}
}
