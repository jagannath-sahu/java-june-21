package com.javacodegeeks.patterns.compositepattern;

import java.util.Objects;

public class HtmlElement extends HtmlTag{

	private String tagName;
	private String startTag;
	private String endTag;
	private String tagBody;

	public HtmlElement(String tagName){
		this.tagName = tagName;
		this.tagBody = "";
		this.startTag = "";
		this.endTag = "";
	}

	@Override
	public String getTagName() {
		return tagName;
	}

	@Override
	public void setStartTag(String tag) {
		this.startTag = tag;
	}

	@Override
	public void setEndTag(String tag) {
		this.endTag = tag;
	}

	@Override
	public void setTagBody(String tagBody){
		this.tagBody = tagBody;
	}

	@Override
	public void generateHtml() {
		System.out.println(startTag+""+tagBody+""+endTag);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HtmlElement other = (HtmlElement) obj;
		return Objects.equals(endTag, other.endTag) && Objects.equals(startTag, other.startTag)
				&& Objects.equals(tagBody, other.tagBody) && Objects.equals(tagName, other.tagName);
	}

	@Override
	public String toString() {
		return "HtmlElement [tagName=" + tagName + ", startTag=" + startTag + ", endTag=" + endTag + ", tagBody="
				+ tagBody + "]";
	}
}
