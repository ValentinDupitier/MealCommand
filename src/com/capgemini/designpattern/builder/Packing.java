package com.capgemini.designpattern.builder;

public abstract class Packing {

	protected String name;
	
    public Packing() {
    }

    // getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}