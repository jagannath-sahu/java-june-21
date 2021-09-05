package com.javacodegeeks.patterns.visitorpattern;

public interface HtmlTagVisitor {
	public void visit(HtmlElement htmlElement);
	public void visit(HtmlParentElement htmlParentElement);
}
