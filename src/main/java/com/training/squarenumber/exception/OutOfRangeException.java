package com.training.squarenumber.exception;

public class OutOfRangeException extends Exception {

	public OutOfRangeException() {
	}
	
	/**
	 * Method that passes exception message to super class Exception
	 */
	public OutOfRangeException(String message) {
		super(message);
	}
}
