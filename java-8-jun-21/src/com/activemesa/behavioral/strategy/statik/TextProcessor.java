package com.activemesa.behavioral.strategy.statik;

import java.util.List;

class TextProcessor {
	private StringBuilder sb = new StringBuilder();

	private ListStrategy listStrategy;

	List<String> items;

	Format format;

	public TextProcessor(Format format) {
		setOutputFormat(format);
	}

	public void setOutputFormat(Format format) {
		switch (format) {
		case HTML:
			listStrategy = new HtmlListStrategy();
			break;

		case MARKDOWN:
			listStrategy = new MarkdownListStrategy();
			break;
		}
	}

	public void appendList(List<String> items) {
		listStrategy.start(sb);
		for (String item : items)
			listStrategy.addListItem(sb, item);
		listStrategy.end(sb);
	}

	public void clear() {
		sb.setLength(0);
	}

	@Override
	public String toString() {
		return sb.toString();
	}
}