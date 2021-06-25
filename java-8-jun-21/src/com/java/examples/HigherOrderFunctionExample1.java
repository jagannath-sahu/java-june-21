package com.java.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HigherOrderFunctionExample1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("One");
		list.add("Abc");
		list.add("BCD");

		//higher order function sort
		Collections.sort(list, (String a, String b) -> {
		    return a.compareTo(b);
		});

		System.out.println(list);

		//Because the reversed() method returns a lambda (function), the reversed() method is considered a higher order function.
		//Because the example sorts the List of Strings using the Collections.sort() method which is higher order function
		Comparator<String> comparator = (String a, String b) -> {
		    return a.compareTo(b);
		};

		Comparator<String> comparatorReversed = comparator.reversed();

		Collections.sort(list, comparatorReversed);

		System.out.println(list);

	}

}
