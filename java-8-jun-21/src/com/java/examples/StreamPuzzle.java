package com.java.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamPuzzle {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("milk");
		list.add("bread");
		list.add("sausage");
		Stream<String> stream = list.stream();
		list.add("eggs, don't forget eggs!");
		stream.forEach(System.out::println);

		System.out.println("\n***********************\n");


		List<String> list1 = new ArrayList<>();
		list1.add("milk");
		list1.add("bread");
		list1.add("sausage");
		list1 = list1.subList(0, 2); //remove sausage
		Stream<String> stream1 = list1.stream();
		list1.add("eggs, don't forget eggs!");
		stream1.forEach(System.out::println);


	}

}
