package com.capgemini.designpattern.builder;

public class CardBoard extends Packing {

    public CardBoard() {
    	super(); // to get attributes of mother class Packing
    	this.setName("Petit carton");
    }
}