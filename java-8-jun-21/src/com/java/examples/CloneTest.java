package com.java.examples;

public class CloneTest {

	public static void main(String[] args) {
		String[] arr3 = new String[] { "one", "two", "three", "four" };
		String[] arr4 = (String[])arr3.clone(); //clone

		arr4[1] = "zero";

		System.out.println(arr3[1].toString() + ", " + arr4[1].toString());

		String[] arr1 = new String[] { "one", "two", "three", "four" };
		String[] arr2 = arr1;

		arr2[1] = "zero";

		System.out.println(arr1[1].toString() + ", " + arr2[1].toString());

	}

}
