package com.example.simple.builder;

public class MealBuilderDemo {

	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();
		Meal meal = mealBuilder.buildMeal("rice", "dal", "sabji");
		System.out.println(meal);
	}
}
