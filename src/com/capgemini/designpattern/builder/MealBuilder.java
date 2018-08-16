package com.capgemini.designpattern.builder;

import java.util.*;

public class MealBuilder {

	////////////
	// attributes
	////////////
	public ArrayList<Item> items;
	public double price;

	////////////
	// constructor
	////////////
	public MealBuilder() {
		this.items = new ArrayList<Item>();
		this.price = 0;
	}

	////////////
	// add items
	////////////
	
	// add one burger
	public MealBuilder addBurger(BurgerType burgertype) {
		this.items.add(new Burger(burgertype));
		return this;
	}

	// add several burgers
	public MealBuilder addBurger(BurgerType burgertype, int nb) {
		for (int i = 0; i < nb; i++) {
			this.items.add(new Burger(burgertype));
		}
		return this;
	}

	// add one drink
	public MealBuilder addDrink(DrinkType drinkType) {
		this.items.add(new Drink(drinkType));
		return this;
	}

	// add several drinks
	public MealBuilder addDrink(DrinkType drinkType, int nb) {
		for (int i = 0; i < nb; i++) {
			this.items.add(new Drink(drinkType));
		}
		return this;
	}

	// add one game
	// only one game per meal => no function to add several games
	public MealBuilder addGame(GameType gameType) {
		this.items.add(new Game(gameType));
		return this;
	}

	////////////
	// prepare specials meals
	////////////
	
	// vegetarian meal
	public MealBuilder prepareVegMeal() {
		this.items.add(new Burger(BurgerType.VegBurger));
		this.items.add(new Drink(DrinkType.Pepsi));
		this.items.add(new Game(GameType.Figurine));
		return this;
	}

	// non-vegetarian meal
	public MealBuilder prepareNoVegMeal() {
		this.items.add(new Burger(BurgerType.ChickenBurger));
		this.items.add(new Drink(DrinkType.Coke));
		return this;
	}

	////////////
	// build
	////////////
	public Meal build() {
		this.price = getCost(); // get sum of all items price
		return new Meal(this.items, this.price);
	}

	////////////
	// get meal cost (sum of items price)
	////////////
	public double getCost() {
		double sum = 0;
		for (Item item : this.items) {
			sum += item.price;
		}
		return sum;
	}
}
