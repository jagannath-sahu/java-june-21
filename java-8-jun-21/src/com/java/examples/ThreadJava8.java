package com.java.examples;

public class ThreadJava8 {

	static ThreadJava8 threadJava8 = new ThreadJava8();

	public static void main(String[] args) {
		new Thread(threadJava8::sayHello).start();

	}

	public void sayHello() {
		System.out.println("Hello World!");
	}

}
