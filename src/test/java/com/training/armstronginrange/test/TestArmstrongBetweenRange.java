package com.training.armstronginrange.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import com.training.armstronginrange.ArmstrongFinder;

public class TestArmstrongBetweenRange {

	/**
	 * Method to test working of find() method in ArmstrongFinder class
	 */
	@Test
	public void testArmstrongInRange() {
		ArrayList<Integer> expected = new ArrayList<>();
		expected.add(153);
		expected.add(370);
		expected.add(371);
		expected.add(407);
		assertEquals(expected, ArmstrongFinder.find());
	}
}
