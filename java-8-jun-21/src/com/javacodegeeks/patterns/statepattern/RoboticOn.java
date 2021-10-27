package com.javacodegeeks.patterns.statepattern;

public class RoboticOn implements RoboticState{

	private final Robot robot;

	public RoboticOn(Robot robot){
		this.robot = robot;
	}

	@Override
	public void walk() {
		System.out.println("Robot is Walking...");
	}

	@Override
	public void cook() {
		robot.setRoboticState(robot.getRoboticCook());
		System.out.println("Robot is Cooking...");
	}

	@Override
	public void off() {
		robot.setState(robot.getRoboticOff());
		System.out.println("Robot is switched off");
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "(Walking)";
	}

}
