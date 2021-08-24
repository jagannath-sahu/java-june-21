package com.java.collectors;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

import com.java.collectors.Dish.Type;

import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;
import static com.java.collectors.Dish.menu;

public class CollectorFeatures {

	public static void main(String... args) {
        System.out.println("Dishes grouped by type: " + groupDishesByType());
        System.out.println("Most caloric Dish by type: " + mostCaloricDishByType());
        Map<Type, Optional<Dish>> dishMap= mostCaloricDishByType1();
        Map<Type, Dish> dishMap1 = dishMap.entrySet().stream()
        		.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue().get()));
        System.out.println("Most caloric Dish by type: " + dishMap1);
    }

    private static Map<Dish.Type, List<Dish>> groupDishesByType() {
        return menu.stream().collect(groupingBy(Dish::getType));
    }

    private static Map<Dish.Type, Dish> mostCaloricDishByType() {
        //BinaryOperator<Dish> binOp = BinaryOperator.maxBy(comparingInt(Dish::getCalories));
        return menu.stream().collect(groupingBy(Dish::getType,
                collectingAndThen(
                        reducing(BinaryOperator.maxBy(comparingInt(Dish::getCalories))), Optional::get)));
    }

    private static Map<Type, Optional<Dish>> mostCaloricDishByType1() {
        return menu.stream().collect(groupingBy(Dish::getType,
                maxBy(Comparator.comparing(Dish::getCalories))));

    }
}
