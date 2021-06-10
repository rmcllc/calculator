package com.ryan.calculator;

public class Calculator {
	private Double operandOne;
	private Double operandTwo;
	private Character operation;
	private Double result = 0.0;
	
	public Calculator() {
		}
	
	public Double performOperation() {
		Double output=null;
		if (this.operation.equals('+')) {
			output = (this.operandOne + this.operandTwo);
			setResults(output);
		}	
		if(this.operation.equals('-')) {
			output = (this.operandOne - this.operandTwo);
			setResults(output);
		}
		if(this.operation.equals('/')) {
			output = (this.operandOne / this.operandTwo);
			setResults(output);
		}
		if(this.operation.equals('*')) {
			output = (this.operandOne * this.operandTwo);
			setResults(output);
		}
		return output;
	}
	
	public void setOperandOne(Double number) {
		this.operandOne = number;
	}
	
	public void setOperation(Character operation) {
		this.operation = operation;
	}
	
	public void setOperandTwo(Double number) {
		this.operandTwo = number;
	}
	
	public void setResults(Double result) {
		this.result = result;
	}
	
	public Double getResults() {
		return this.result;
		
	}
	
}
