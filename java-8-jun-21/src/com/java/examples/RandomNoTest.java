package com.java.examples;

import java.util.Random;

public class RandomNoTest {

	public static void main(String[] args) {
		 Random rand = new Random();
		 for(int i =0 ; i < 20 ; i++) {
			 System.out.println("Random no Between 1 to 10 : " + rand.ints(1, 11).findAny().getAsInt());
		 }
	}
}
