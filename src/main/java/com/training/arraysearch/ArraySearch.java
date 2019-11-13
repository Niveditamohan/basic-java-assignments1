package com.training.arraysearch;

import java.util.Arrays;

import com.training.arraysearch.exception.InvalidElementSearchException;

public class ArraySearch {

	/**
	 * Method to find the input element in the array
	 * @return Returns boolean result or throws exception if element not found
	 * @throws InvalidElementSearchException
	 */
	public static boolean search(int[] array, int number) throws InvalidElementSearchException {
		boolean answer = false;
		Arrays.sort(array);

		if (number > array[(array.length + 1) / 2]) {
			for (int i = (array.length + 1) / 2; i < array.length; i++) {
				if (array[i] == number) {
					answer = true;
					break;
				}
			}
		} else {
			for (int i = 0; i < (array.length + 1) / 2; i++) {
				if (array[i] == number) {
					answer = true;
					break;
				}
			}
		}

		if (answer == false)
			throw new InvalidElementSearchException("Invalid Input");
		else
			return answer;
	}

}
