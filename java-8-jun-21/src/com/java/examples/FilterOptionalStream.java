package com.java.examples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterOptionalStream {

	public static void main(String[] args) {
		List<Optional<String>> listOfOptionals = Arrays.asList(
				  Optional.empty(), Optional.of("foo"), Optional.empty(), Optional.of("bar"));

		//using filter
		List<String> filteredList = listOfOptionals.stream()
				  .filter(Optional::isPresent)
				  .map(Optional::get)
				  .collect(Collectors.toList());

		filteredList.forEach(System.out::println);

		filteredList = listOfOptionals.stream()
				  .flatMap(o -> o.isPresent() ? Stream.of(o.get()) : Stream.empty())
				  .collect(Collectors.toList());

		filteredList.forEach(System.out::println);

		filteredList = listOfOptionals.stream()
				  .flatMap(o -> o.map(Stream::of).orElseGet(Stream::empty))
				  .collect(Collectors.toList());

		filteredList.forEach(System.out::println);


		/*
		 * All this will get quite simplified with the arrival of Java 9 that adds a stream() method to Optional.

		   This approach is similar to the one showed in section 3 but this time we are using a predefined method for converting
		   Optional instance into a Stream instance.

		   It will return a stream of either one or zero element(s) whether the Optional value is or isn't present:
		 */
		filteredList = listOfOptionals.stream()
				  .flatMap(Optional::stream)
				  .collect(Collectors.toList());

		filteredList.forEach(System.out::println);

	}

}
