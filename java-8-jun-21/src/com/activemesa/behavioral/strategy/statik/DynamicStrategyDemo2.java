package com.activemesa.behavioral.strategy.statik;

import java.util.List;

public class DynamicStrategyDemo2 {

	 public static void main(String[] args)
	  {
	    TextProcessor2<MarkdownListStrategy> tp = new TextProcessor2<>(MarkdownListStrategy::new);
	    tp.appendList(List.of("liberte", "egalite", "fraternite"));
	    System.out.println(tp);

	    TextProcessor2<HtmlListStrategy> tp2 = new TextProcessor2<>(HtmlListStrategy::new);
	    tp2.appendList(List.of("inheritance", "encapsulation", "polymorphism"));
	    System.out.println(tp2);
	  }

}
