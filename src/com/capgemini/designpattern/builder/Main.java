package com.capgemini.designpattern.builder;

import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
		///////////
		// vegetarian meal
		Meal vegMeal = new MealBuilder().prepareVegMeal().build();
		displayMeal("Menu végétarien", vegMeal);

		///////////
		// no vegetarian meal
		Meal noVegMeal = new MealBuilder().prepareNoVegMeal().build();
		displayMeal("Menu non végétarien", noVegMeal);

		///////////
		// empty meal = no product // just for testing
		Meal emptyMeal = new MealBuilder()
				.build();
		displayMeal("Menu vide", emptyMeal);
		
		///////////
		// big meal
		Meal bigMeal = new MealBuilder()
				.addBurger(BurgerType.VegBurger)
				.addBurger(BurgerType.ChickenBurger, 2)
				.addDrink(DrinkType.Coke, 3)
				.addGame(GameType.SetGame)
				.addGame(GameType.Figurine)
				.build();
		displayMeal("Menu super extra", bigMeal);
	}

	public static void displayMeal(String title, Meal meal) {
		// meal title
		System.out.println(title + " :");
		// meal composition
		if (meal.items.size() == 0) {
			System.out.println("Aucun produit");
		}
		else {
			for (Item item : meal.items) {
				System.out.println("- " + item.getName() + " (Packaging : " + item.getPacking().getName() + " - Prix : "
						+ item.getPrice() +")");
			}
		}
		// meal price
		DecimalFormat df = new DecimalFormat("0.00");      
		String totalPrice = df.format(meal.price); // to keep just 2 decimals
		System.out.println("Prix total du menu = " + totalPrice);
		System.out.println();
	}

}
