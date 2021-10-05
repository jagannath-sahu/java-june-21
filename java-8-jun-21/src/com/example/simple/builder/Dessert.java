package com.example.simple.builder;

public class Dessert {

	String dessert;

	public String getDessert() {
		return dessert;
	}

	public void setDessert(String dessert) {
		this.dessert = dessert;
	}

	@Override
	public String toString() {
		return "Dessert [dessert=" + dessert + "]";
	}
}
