package com.capgemini.designpattern.builder;

public class Drink extends Item {

	private DrinkType drinkType;

	public Drink(DrinkType drinkType) {
		super(); // to get attributes of mother class Item
		this.drinkType = drinkType;
		this.packing = new Bottle();
		// define other attributes following drink type
		if (drinkType == DrinkType.Coke) {
			this.setPrice(1.50);
			this.setName("Coca-Cola");
		} 
		else if (drinkType == DrinkType.Pepsi) {
			this.setPrice(1.45);
			this.setName("Pepsi Cola");
		}
	}

}