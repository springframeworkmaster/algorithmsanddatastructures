package com.tasks.advanced.algorithms.euclid;

/**
 * Euclid's algorithm calculates the greatest common divisor between two numbers
 * 
 */
public class Euclid {

	public int gcd(int number, int divisor) {
		int remaining = (number%divisor);
		if (remaining == 0) {
			return divisor;
		} else {
			return gcd(divisor, remaining);
		}
	}
}
