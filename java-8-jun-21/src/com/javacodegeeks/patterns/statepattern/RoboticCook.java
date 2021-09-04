package com.javacodegeeks.patterns.statepattern;

public class RoboticCook implements RoboticState{

	private final Robot robot;

	public RoboticCook(Robot robot){
		this.robot = robot;
	}

	@Override
	public void walk() {
		robot.setRoboticState(robot.getRoboticOn());
		System.out.println("Robot is Walking....");
		System.out.println("current state : " + robot.getState());
	}

	@Override
	public void cook() {
		System.out.println("Robot is Cooking....");
	}

	@Override
	public void off() {
		System.out.println("Cannot switched off while cooking....");
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "(cooking)";
	}
}
