package com.javacodegeeks.patterns.visitorpattern;

public interface TagElement {
	public void accept(HtmlTagVisitor visitor);
}
