package com.javacodegeeks.patterns.statepattern;

public class RoboticOff implements RoboticState{

	private final Robot robot;

	public RoboticOff(Robot robot){
		this.robot = robot;
	}

	@Override
	public void walk() {
		robot.setRoboticState(robot.getRoboticOn());
		System.out.println("Robot is Walking...");
		System.out.println("current state : " + robot.getState());
	}

	@Override
	public void cook() {
		System.out.println("Cannot cook at Off state.");
	}

	@Override
	public void off() {
		System.out.println("Already switched off.....");
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "(off)";
	}
}
