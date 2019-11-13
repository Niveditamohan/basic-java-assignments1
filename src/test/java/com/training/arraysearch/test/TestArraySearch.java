package com.training.arraysearch.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.training.arraysearch.ArraySearch;
import com.training.arraysearch.exception.InvalidElementSearchException;

public class TestArraySearch {

	int[] array = {11,45,23,76,86,3,97,2,10,89,53,72,93,7,1};
	
	/**
	 * Method to test search() method of ArraySearch class for valid input
	 * @throws InvalidElementSearchException
	 */
	@Test
	public void testArraySearchForValidInput() throws InvalidElementSearchException {
		assertEquals(true, ArraySearch.search(array,10));
	}
	
	/**
	 * Method to test search() method of ArraySearch class for invalid input
	 * @throws InvalidElementSearchException
	 */
	@Test(expected = InvalidElementSearchException.class)
	public void testArraySearchForInvalidInputThrowsException() throws InvalidElementSearchException {
		ArraySearch.search(array, 100);
	}
}
