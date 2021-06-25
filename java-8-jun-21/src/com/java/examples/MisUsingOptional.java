package com.java.examples;

import java.util.Optional;
import java.util.stream.Stream;

public class MisUsingOptional {

	//https://blog.indrek.io/articles/misusing-java-optional/

	public static void main(String[] args) {
		//bad design
		greet(Optional.of("neighbor"));


		//bad design
		greet(Optional.empty());


		//Simpler and good design
		greet("neighbor");

		//Simpler and good design
		greet();


		//https://blog.indrek.io/articles/5-ways-to-create-a-stream-in-java-8/
		//A lambda expression of type UnaryOperator is used to produce the next even number by adding 2 to the previous number.
		Stream<Integer> evenNumbers = Stream.iterate(0, n -> n + 2).limit(10);
		evenNumbers.forEach(System.out::println);

		Stream<Double> randomNumbers = Stream.generate(Math::random).limit(10);
		randomNumbers.forEach(System.out::println);
	}

	//bad design
	public static void greet(Optional<String> name) {
		System.out.println("Hello " + name.orElse("world"));
	}

	//simpler and good design
	public static void greet(String name) {
		System.out.println("Hello " + name);
	}

	//simpler and good design
	public static void greet() {
		greet("world");
	}

}
