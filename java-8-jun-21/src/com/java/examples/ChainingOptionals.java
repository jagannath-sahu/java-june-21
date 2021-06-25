package com.java.examples;

import java.util.Optional;
import java.util.stream.Stream;

public class ChainingOptionals {

	public static void main(String[] args) {
		Optional<String> found = Stream.of(getEmpty(), getHello(), getBye())
			      .filter(Optional::isPresent)
			      .map(Optional::get)
			      .findFirst();
		System.out.println(found);
		System.out.println(found.get() == getHello().get());

	}

	private static Optional<String> getEmpty() {
	    return Optional.empty();
	}

	private static Optional<String> getHello() {
	    return Optional.of("hello");
	}

	private static Optional<String> getBye() {
	    return Optional.of("bye");
	}

	private static Optional<String> createOptional(String input) {
	    if (input == null || "".equals(input) || "empty".equals(input)) {
	        return Optional.empty();
	    }
	    return Optional.of(input);
	}

}
