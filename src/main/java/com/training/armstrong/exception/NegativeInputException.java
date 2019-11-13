package com.training.armstrong.exception;

public class NegativeInputException extends Exception {

	public NegativeInputException() {
	}
	
	/**
	 * Passes message to super class Exception
	 */
	public NegativeInputException(String message) {
		super(message);
	}
}
