package com.accenture.test;

import com.accenture.calculate.CalculatorServiceForUnaryOp;

import junit.framework.TestCase;

/**
 * @author Rajitha.Paravastu
 * CalculatorSingleOpTDD Class is used to Test the CaculatorService class using Junit
 *
 */

public class TestCalculatorSingleOpTDD extends TestCase {
	
	CalculatorServiceForUnaryOp calcTest = new CalculatorServiceForUnaryOp();
	
	/**
	 * This method is used to test the Square Root functionality of 
	 * 			Numerical Calculator Application using assertEquals method
	 */	
	public void testSqrt() {
		double result = 3.0;
		double sqrt = calcTest.calcSingle(9, 'r');
		assertEquals(sqrt, result);
	}
	
	/**
	 * This method is used to test the Failure Scenario of Square Root functionality of 
	 * 			Numerical Calculator Application using assertNotSame method
	 */
	public void testFailedSqrt() {
		double result = 3.0;
		double sqrt = calcTest.calcSingle(9, 'r');
		assertNotSame(sqrt, result);
		}
	
	/**
	 * This method is used to test the Inverse functionality of 
	 * 			Numerical Calculator Application using assertEquals method
	 */	
	public void testInv() {
		double result = 0.111;
		double inv = calcTest.calcSingle(9, 'i');
		assertEquals(inv, result);
	}
	
	/**
	 * This method is used to test the Failure Scenario of Inverse functionality of 
	 * 			Numerical Calculator Application using assertNotSame method
	 */
	public void testFailedInv() {
		double result = 0.111;
		double inv = calcTest.calcSingle(9, 'i');
		assertNotSame(inv, result);
		}

}
