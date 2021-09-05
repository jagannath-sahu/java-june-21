package com.javacodegeeks.patterns.visitorpattern;

public class TestCompositePattern {

	public static void main(String[] args) {
		HtmlTag parentTag = new HtmlParentElement("<html>");
		HtmlTagVisitor cssClassVisitor = new CssClassVisitor();
		parentTag.setStartTag("<html>");
		parentTag.setEndTag("</html>");

		HtmlTag p1 = new HtmlParentElement("<body>");
		p1.setStartTag("<body>");
		p1.setEndTag("</body>");

		parentTag.addChildTag(p1);

		HtmlTag child1 = new HtmlElement("<p>");
		child1.setStartTag("<p>");
		child1.setEndTag("</p>");
		child1.setTagBody("Testing html tag library");
		child1.accept(cssClassVisitor);
		p1.addChildTag(child1);
		p1.accept(cssClassVisitor);

		HtmlTag child2 = new HtmlElement("<p>");
		child2.setStartTag("<p>");
		child2.setEndTag("</p>");
		child2.setTagBody("Paragraph 2");
		child2.accept(cssClassVisitor);
		p1.addChildTag(child2);

		//parentTag.generateHtml();

		parentTag.accept(cssClassVisitor);

		HtmlTagVisitor visitor = new HtmlTagVisitorImpl();
		parentTag.accept(visitor);



	}

}
