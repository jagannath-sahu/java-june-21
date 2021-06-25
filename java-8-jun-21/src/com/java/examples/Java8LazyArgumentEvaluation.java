package com.java.examples;

import java.util.function.Supplier;

public class Java8LazyArgumentEvaluation {

	//https://www.rapid7.com/blog/post/2017/01/13/java-8-lazy-argument-evaluation/

	public static void main(String[] args) {

		System.out.println(eagerMatch(compute("aa"), compute("bb")));

		System.out.println("\n------------------------------\n");

		System.out.println(lazyMatch(() -> compute("bb"), () -> compute("aa")));

	}

	static boolean compute(String str) {
	    System.out.println("executing...");
	    // expensive computation here
	    return str.contains("a");
	}

	static String eagerMatch(boolean b1, boolean b2) {
	    return b1 && b2 ? "match" : "incompatible!";
	}

	static String lazyMatch(Supplier<Boolean> a, Supplier<Boolean> b) {
	    if (a.get() && b.get())
			return "match";
		else
			return "incompatible!";
	}

}
