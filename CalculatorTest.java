package com.ryan.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator newCalc = new Calculator();
		newCalc.setOperandOne(10.5);
		newCalc.setOperation('/');
		newCalc.setOperandTwo(5.2);
		newCalc.performOperation();
		System.out.println(newCalc.getResults());
	}

}
