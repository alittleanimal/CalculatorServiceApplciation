package com.accenture.test;

import com.accenture.calculate.CalculatorServiceForBinaryOp;

import junit.framework.TestCase;

/**
 * @author Rajitha.Paravastu
 * CalculatorTDD Class is used to Test the CaculatorService class using Junit
 *
 */

public class TestBinaryCalculatorTDD extends TestCase {

	CalculatorServiceForBinaryOp calcTest = new CalculatorServiceForBinaryOp();
		
	public TestBinaryCalculatorTDD(String testName) {
		super(testName);
	}

	/**
	 * This method is used to test the Addition functionality of 
	 * 			Numerical Calculator Application using assertEquals method
	 */
	public void testAdd() {
		int result = 30;
		int sum = calcTest.calc(20, 10, 'a');
		assertEquals(sum, result);
	}
	
	/**
	 * This method is used to test the Failure Scenario of Addition functionality of 
	 * 			Numerical Calculator Application using assertNotSame method
	 */
	public void testFailedAdd() {
		int result = 9;
		int sum = calcTest.calc(20, 10, 'a');
		assertNotSame(sum, result);
		}
	
	/**
	 * This method is used to test the Subtraction functionality of 
	 * 			Numerical Calculator Application using assertEquals method
	 */
	public void testSub() {
		int result = 10;
		int sub = calcTest.calc(20, 10, 's');
		assertEquals(sub, result);
	}
	
	/**
	 * This method is used to test the Failure Scenario of Subtraction functionality of 
	 * 			Numerical Calculator Application using assertNotSame method
	 */
	public void testFailedSub() {
		int result = 9;
		int sub = calcTest.calc(20, 10, 's');
		assertNotSame(sub, result);
		}
	
	/**
	 * This method is used to test the Multiplication functionality of 
	 * 			Numerical Calculator Application using assertEquals method
	 */	
	public void testMul() {
		int result = 200;
		int mul = calcTest.calc(20, 10, 'm');
		assertEquals(mul, result);
	}
	
	/**
	 * This method is used to test the Failure Scenario of Multiplication functionality of 
	 * 			Numerical Calculator Application using assertNotSame method
	 */	
	public void testFailedMul() {
		int result = 9;
		int mul = calcTest.calc(20, 10, 'm');
		assertNotSame(mul, result);
		}
	
	/**
	 * This method is used to test the Division functionality of 
	 * 			Numerical Calculator Application using assertEquals method
	 */	
	public void testDiv() {
		int result = 2;
		int div = calcTest.calc(20, 10, 'd');
		assertEquals(div, result);
	}
	
	/**
	 * This method is used to test the Failure Scenario of Division functionality of 
	 * 			Numerical Calculator Application using assertNotSame method
	 */	
	public void testFailedDiv() {
		int result = 9;
		int div = calcTest.calc(20, 10, 'd');
		assertNotSame(div, result);
		}
	
	

}
