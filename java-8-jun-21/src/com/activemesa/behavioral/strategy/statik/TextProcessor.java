package com.activemesa.behavioral.strategy.statik;

import java.util.List;

class TextProcessor
{
  private StringBuilder sb = new StringBuilder();

  private ListStrategy listStrategy;

  List<String> items;

  Format format;

  public void appendItems(List<String> items) {
	  this.items = items;
  }

  public void process(Format format) {
	  switch(format) {

	  	case HTML:
	  		listStrategy = new HtmlListStrategy();
	  		listStrategy.start(sb);
	  	    for (String item : items)
	  	      listStrategy.addListItem(sb, item);
	  	    listStrategy.end(sb);
	  	    break;

	  	case List:
	  		listStrategy = new MarkdownListStrategy();
	  		for (String item : items)
	  			listStrategy.addListItem(sb, item);
	  		break;

	  }
  }

  public void clear()
  {
    sb.setLength(0);
  }

  @Override
  public String toString()
  {
    return sb.toString();
  }
}