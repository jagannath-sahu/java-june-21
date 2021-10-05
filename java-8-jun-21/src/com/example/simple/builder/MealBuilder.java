package com.example.simple.builder;

import com.example.simple.builder.MealBuilder.MealByItems;

public class MealBuilder {
	MealByItems mealByItems;

	Meal meal;

	public Meal buildMeal(final String ... items) {
		mealByItems = new MealByItems();
		mealByItems.buildMealFromItems(items);

        return meal;
    }

	class MealByItems extends MealBuilderTemplate {

		public void buildMealFromItems(String[] items) {
			meal = new Meal();
			meal.setOtherItem("paneer");

			this.buildMain(items).buildDrink().buildDessert();
		}

		@Override
		public MealByItems buildDrink() {
			Drink drink = new Drink();
			drink.setDrinkItem("Yoghi-drink");
			meal.setDrink(drink);

			return this;
		}

		@Override
		public MealByItems buildMain(String[] items) {
			MainCourse mainCourse = new MainCourse();
			mainCourse.setMainCourse(items);
			meal.setMain(mainCourse);

			return this;
		}

		@Override
		public MealByItems buildDessert() {
			Dessert dessert = new Dessert();
			dessert.setDessert("Ice-cream");
			meal.setDessert(dessert);

			return this;
		}
	}
}

abstract class MealBuilderTemplate {

	public abstract MealByItems buildDrink();

	public abstract MealByItems buildMain(String[] items);

	public abstract MealByItems buildDessert();
}