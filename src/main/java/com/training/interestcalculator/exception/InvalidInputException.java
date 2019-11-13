package com.training.interestcalculator.exception;

public class InvalidInputException extends Exception {

	public InvalidInputException() {
	}
	
	/**
	 * Passes message to super class Exception
	 */
	public InvalidInputException(String message) {
		super(message);
	}
}
