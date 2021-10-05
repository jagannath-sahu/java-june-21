package com.example.simple.builder;

public class Meal {
	private Drink drink;
	private MainCourse main;
	private Dessert dessert;

	private String otherItem;

	public String getOtherItem() {
		return otherItem;
	}

	public void setOtherItem(String otherItem) {
		this.otherItem = otherItem;
	}

	public Drink getDrink() {
		return drink;
	}

	public void setDrink(Drink drink) {
		this.drink = drink;
	}

	public MainCourse getMain() {
		return main;
	}

	public void setMain(MainCourse main) {
		this.main = main;
	}

	public Dessert getDessert() {
		return dessert;
	}

	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}

	@Override
	public String toString() {
		return "Meal [drink=" + drink + ", main=" + main + ", dessert=" + dessert + ", otherItem=" + otherItem + "]";
	}
}