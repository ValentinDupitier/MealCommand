package com.capgemini.designpattern.builder;

public class Burger extends Item {

	private BurgerType burgerType;

	public Burger(BurgerType burgertype) {
		super(); // to get attributes of mother class Item
		this.burgerType = burgertype;
		this.packing = new Wrapper();
		// define other attributes following burger type
		if (burgertype == BurgerType.VegBurger) {
			this.setPrice(5.10);
			this.setName("Mc Veget Burger");
		} 
		else if (burgertype == BurgerType.ChickenBurger) {
			this.setPrice(4.10);
			this.setName("Mc Chicken Burger");
		}
	}

}