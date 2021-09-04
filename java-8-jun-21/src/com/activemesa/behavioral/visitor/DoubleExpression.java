package com.activemesa.behavioral.visitor;

class DoubleExpression extends Expression {
	public double value;

	public DoubleExpression(double value) {
		this.value = value;
	}

	@Override
	public void print(StringBuilder sb) {
		ExpressionPrinter.print(this, sb);
	}
}