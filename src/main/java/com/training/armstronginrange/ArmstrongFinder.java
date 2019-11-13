package com.training.armstronginrange;

import java.util.ArrayList;

public class ArmstrongFinder {

	/**
	 * Method to find all Armstrong numbers between 100 and 999
	 * 
	 * @return Returns an ArrayList containing the result
	 */
	public static ArrayList<Integer> find() {
		ArrayList<Integer> armstrongNumbers = new ArrayList<>();
		for (int i = 100; i <= 999; i++) {
			int temp = 0, result = 0, store = i;

			while (i != 0) {
				temp = i % 10;
				result = result + temp * temp * temp;
				i /= 10;
			}
			i = store;
			if (result == i)
				armstrongNumbers.add(result);
			else
				continue;
		}
		return armstrongNumbers;
	}
}
