package com.javacodegeeks.patterns.visitorpattern;

public class HtmlTagVisitorImpl implements HtmlTagVisitor {

	@Override
	public void visit(HtmlElement htmlElement) {
		System.out.println(htmlElement.getStartTag()+""+htmlElement.getTagBody()+""+htmlElement.getEndTag());
	}

	@Override
	public void visit(HtmlParentElement htmlParentElement) {
		System.out.println(htmlParentElement.getStartTag());
		for(HtmlTag tag : htmlParentElement.getChildren()){
			tag.generateHtml();
		}
		System.out.println(htmlParentElement.getEndTag());
	}
}
