package com.activemesa.behavioral.strategy.statik;

import java.util.List;

public class DynamicStrategyDemo {

	public static void main(String[] args){
	    TextProcessor tp = new TextProcessor();
	    tp.appendItems(List.of("liberte", "egalite", "fraternite"));
	    tp.process(Format.HTML);
	    System.out.println(tp);

	    TextProcessor tp1 = new TextProcessor();
	    tp1.appendItems(List.of("Ram", "Shyam", "Radha"));
	    tp1.process(Format.List);
	    System.out.println(tp1);
	}
}
