package com.accenture.calculate;

/**
 * @author Rajitha.Paravastu
 * CalculatorService class is use to implement numerical Calculator feature for the operation
   which will take two input numbers
 */
public class CalculatorServiceForBinaryOp {

	int number1, number2;
	char opt;
	int result;
	double output;
	int l;

	/**
	 * This method is use to handle calculator operations for which requires 2 input numbers
	 */
	public int calc(int number1, int number2, char opt) {

		switch (opt) {

		case 'a':
			result = number1 + number2;
			break;

		case 's':
			result = number1 - number2;
			break;

		case 'm':
			result = number1 * number2;
			break;

		case 'd':
			result = number1 / number2;
			break;

		}

		return result;

	}
	
	public double calcDiv(int number1, int number2, char opt) {
		
		switch (opt) {

		

		case 'd':
			output = number1 / number2;
			l = (int) (output * 1000);
			output = l;
			output /= 1000;
			break;

		}
		
		return output;
	}

	

}
