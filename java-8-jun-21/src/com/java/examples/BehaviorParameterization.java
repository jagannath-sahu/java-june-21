package com.java.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BehaviorParameterization {

	//using filter method
	public static void main(String[] args) {

		List<Book> books = new ArrayList<Book>();
		books.add(new Book("Java Book", 550, "Jagannath"));
		books.add(new Book("Spring Book", 500, "Ram"));
		books.add(new Book("Kubernetes Book", 650, "Lewis Carrol"));

		books.stream().filter(b -> "Lewis Carrol".equals(b.getAuthor()))
						.collect(Collectors.toList()).forEach(System.out::println);

		System.out.println("\n----------------------------------\n");

		books.stream().filter(b -> b.getPageCount() > 500).collect(Collectors.toList()).forEach(System.out::println);

	}

}
