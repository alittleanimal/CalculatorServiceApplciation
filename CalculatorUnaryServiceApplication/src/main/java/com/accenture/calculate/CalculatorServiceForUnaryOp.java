package com.accenture.calculate;

/**
 * @author Rajitha.Paravastu
 * CalculatorServiceForSingleOp class is used to implement Calculator feature for the operation
   which will take single input number
 */

public class CalculatorServiceForUnaryOp {
	
	int number1;
	char opt;
	double output;
	int l;
	
	/**
	 * This method is use to handle calculator operations for which requires single input number
	 */
	public double calcSingle(int number, char opt) {

		switch (opt) {

		case 'r':
			output = Math.sqrt(number);
			l = (int) (output * 1000);
			output = l;
			output /= 1000;

			break;

		case 'i':
			output = 1.0 / number;
			l = (int) (output * 1000);
			output = l;
			output /= 1000;
			break;

		}

		return output;
	}

}
