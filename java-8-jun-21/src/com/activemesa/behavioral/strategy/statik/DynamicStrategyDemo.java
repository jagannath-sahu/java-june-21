package com.activemesa.behavioral.strategy.statik;

import java.util.List;

public class DynamicStrategyDemo {

	public static void main(String[] args){
	    TextProcessor tp = new TextProcessor(Format.HTML);
	    tp.appendList(List.of("liberte", "egalite", "fraternite"));
	    System.out.println(tp);

	    tp.clear();

	    tp.setOutputFormat(Format.MARKDOWN);
	    tp.appendList(List.of("Ram", "Shyam", "Radha"));
	    System.out.println(tp);
	}
}
