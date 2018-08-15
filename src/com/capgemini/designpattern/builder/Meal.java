package com.capgemini.designpattern.builder;

import java.util.ArrayList;

public class Meal {

    public ArrayList<Item> items;
    public double price;

    public Meal(ArrayList<Item> items, double price) {
    	this.items = items;
    	this.price = price;
    }
}