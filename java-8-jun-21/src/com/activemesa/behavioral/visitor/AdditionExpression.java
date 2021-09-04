package com.activemesa.behavioral.visitor;

class AdditionExpression extends Expression {
	public Expression left, right;

	public AdditionExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public void print(StringBuilder sb) {
		ExpressionPrinter.print(this, sb);
	}
}