package com.java.examples;

import java.util.ArrayList;
import java.util.List;

public class FinalVarWork {

	public static void main(String[] args) {
		final List<String> someList = new ArrayList<String>();
		List<String> itemsToAdd = new ArrayList<String>();
		itemsToAdd.add("one");
		itemsToAdd.add("two");
		//final variable can not be assigned
		//someList = itemsToAdd;

		//but we can use addAll to overcome above problem
		someList.addAll(itemsToAdd);
		System.out.println(someList);

	}

}
