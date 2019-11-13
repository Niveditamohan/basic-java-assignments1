package com.training.arraybubblesort.test;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import com.training.arraybubblesort.BubbleSort;

public class TestArrayBubbleSort {

	static int[] array = {11,45,23,76,86,3,97,2,10,89,53,72,93,7,1};
	
	/**
	 * Method to check whether sort array is correct or not
	 */
	@Test
	public void testArrayBubbleSortForValidInput() {
		int[] expected = {1,2,3,7,10,11,23,45,53,72,76,86,89,93,97};
		int[] actual = (int[]) BubbleSort.sort(TestArrayBubbleSort.array);
		assertArrayEquals(expected,actual);
	}
}
