package com.example.simple.builder;

public class Drink {

	String DrinkItem;

	public String getDrinkItem() {
		return DrinkItem;
	}

	public void setDrinkItem(String drinkItem) {
		DrinkItem = drinkItem;
	}

	@Override
	public String toString() {
		return "Drink [DrinkItem=" + DrinkItem + "]";
	}
}
