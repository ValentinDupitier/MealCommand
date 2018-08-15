package com.capgemini.designpattern.builder;

public class Bottle extends Packing {

    public Bottle() {
    	super(); // to get attributes of mother class Packing
    	this.setName("Bouteille");
    }

}