package com.training.armstrong.exception;

public class InputOutOfRangeException extends Exception {

	public InputOutOfRangeException() {
	}
	
	/**
	 * Passes message to super class Exception
	 */
	public InputOutOfRangeException(String message) {
		super(message);
	}
}
