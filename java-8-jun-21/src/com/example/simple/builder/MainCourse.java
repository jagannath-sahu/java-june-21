package com.example.simple.builder;

import java.util.Arrays;

public class MainCourse {

	String[] mainCourse;

	public String[] getMainCourse() {
		return mainCourse;
	}

	public void setMainCourse(String[] mainCourse) {
		this.mainCourse = mainCourse;
	}

	@Override
	public String toString() {
		return "MainCourse [mainCourse=" + Arrays.toString(mainCourse) + "]";
	}
}
