package com.javacodegeeks.patterns.statepattern;

public class TestStatePattern {

	public static void main(String[] args) {
		Robot robot = new Robot();
		robot.walk();
		System.out.println("current state : " + robot.getState());
		robot.cook();
		System.out.println("current state : " + robot.getState());
		robot.walk();
		System.out.println("current state : " + robot.getState());
		robot.off();
		System.out.println("current state : " + robot.getState());

		robot.walk();
		System.out.println("current state : " + robot.getState());
		robot.off();
		System.out.println("current state : " + robot.getState());
		robot.cook();
		System.out.println("current state : " + robot.getState());
	}
}
