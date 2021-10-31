package com.basicsstrong.functional.higherorderfunctionexample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

//core java for the impatient(chapter-3 exercises-13)

/*
 * Q1.Write a run method that takes an array of Runnable instances and returns a Runnable whose run method
 * executes them in order.Return a lambda expression.
 *
 * Q.core java for the impatient(chapter-8, Q-13)
 * join all elements in a Stream<ArrayList<T>> to one ArrayList<T>.Show how to do this with each of the 3 forms of reduce.
 */

public class HigherOrderFuncExamp {
	static Runnable runArrayOfRunnable(Runnable[] runnableArray) {
		return () ->{
			for (Runnable runnable : runnableArray) {
				runnable.run();
			}
		};
	}

	public static void main(String[] args) {
		Runnable runnable1 = () -> System.out.println("runnable 1");
		Runnable runnable2 = () -> System.out.println("runnable 2");
		Runnable runnable3 = () -> System.out.println("runnable 3");
		Runnable runnable4 = () -> System.out.println("runnable 4");

		Runnable[] runnableArray = {runnable1, runnable2, runnable3, runnable4};

		Runnable runnableRef = HigherOrderFuncExamp.runArrayOfRunnable(runnableArray);
		runnableRef.run();


		//join all elements in a Stream<ArrayList<T>> to one ArrayList<T>.Show how to do this with each of the 3 forms of reduce.

		BinaryOperator<List<Integer>> func2 = (List<Integer> list1, List<Integer> list2) -> {
			List<Integer> numbers1 = new ArrayList<>();
			numbers1.addAll(list1);
			numbers1.addAll(list2);
			return numbers1;
		};

		BiFunction<List<Integer>, List<Integer>, List<Integer>> func = (List<Integer> list1, List<Integer> list2) -> {
			List<Integer> numbers1 = new ArrayList<>();
			numbers1.addAll(list1);
			numbers1.addAll(list2);
			return numbers1;
		};

		List<Integer> numbers1 = new ArrayList<Integer>();
		numbers1.add(1);
		numbers1.add(2);
		numbers1.add(3);

		List<Integer> numbers2 = new ArrayList<Integer>();
		numbers2.add(4);
		numbers2.add(5);
		numbers2.add(6);

		List<Integer> numbers3 = new ArrayList<Integer>();
		numbers3.add(7);
		numbers3.add(8);
		numbers3.add(9);

		Stream<List<Integer>> streamTemp = Stream.of(numbers1, numbers2, numbers3);

		List<Integer> list1 = streamTemp.reduce(func2).get();

		System.out.println(list1);

		ArrayList<Integer> newList = new ArrayList<Integer>();
		newList.add(15);

		list1 = Stream.of(numbers1, numbers2, numbers3).reduce(newList, func2);

		System.out.println(list1);

		newList = new ArrayList<Integer>();

		list1 = Stream.of(numbers1, numbers2, numbers3).reduce(newList, func, func2);

		System.out.println(list1);
	}
}
