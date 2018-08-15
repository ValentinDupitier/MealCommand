package com.capgemini.designpattern.builder;

public abstract class Item {
	
    protected double price;
    protected String name;
    protected Packing packing;

    public Item() {
    }

    // all getters and setters
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Packing getPacking() {
		return packing;
	}

	public void setPacking(Packing packing) {
		this.packing = packing;
	}
}