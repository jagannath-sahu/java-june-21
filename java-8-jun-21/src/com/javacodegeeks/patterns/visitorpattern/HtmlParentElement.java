package com.javacodegeeks.patterns.visitorpattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HtmlParentElement extends HtmlTag {

	private String tagName;
	private String startTag;
	private String endTag;
	private List<HtmlTag>childrenTag; //this is the main important line

	public List<HtmlTag> getChildrenTag() {
		return childrenTag;
	}

	public void setChildrenTag(List<HtmlTag> childrenTag) {
		this.childrenTag = childrenTag;
	}

	public String getStartTag() {
		return startTag;
	}

	public String getEndTag() {
		return endTag;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public HtmlParentElement(String tagName){
		this.tagName = tagName;
		this.startTag = "";
		this.endTag = "";
		this.childrenTag = new ArrayList<>();
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
	public void addChildTag(HtmlTag htmlTag){
		childrenTag.add(htmlTag);
	}

	@Override
	public void addChildTagFirst(HtmlTag htmlTag){
		childrenTag.add(0, htmlTag);
	}

	@Override
	public void removeChildTag(HtmlTag htmlTag){
		this.childrenTag.remove(htmlTag);
		for(HtmlTag htmlTag1 : childrenTag) {
			htmlTag1.getChildren().remove(htmlTag);
		}
	}

	@Override
	public List<HtmlTag>getChildren(){
		return childrenTag;
	}

	@Override
	public void generateHtml() {
		System.out.println(startTag);
		for(HtmlTag tag : childrenTag){
			tag.generateHtml();
		}
		System.out.println(endTag);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HtmlParentElement other = (HtmlParentElement) obj;
		return Objects.equals(childrenTag, other.childrenTag) && Objects.equals(endTag, other.endTag)
				&& Objects.equals(startTag, other.startTag) && Objects.equals(tagName, other.tagName);
	}

	@Override
	public String toString() {
		return "HtmlParentElement [tagName=" + tagName + ", startTag=" + startTag + ", endTag=" + endTag
				+ ", childrenTag=" + childrenTag + "]";
	}

	@Override
	public void accept(HtmlTagVisitor visitor) {
		visitor.visit(this);
	}
}
