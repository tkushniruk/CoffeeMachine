package com.company;

public class Main {

    public static void main(String[] args) {
	    DrinkBuilder builder = new DrinkBuilder();
	    Drink americano = builder.prepareAmericano();
	    americano.doIt();
	    Drink espresso = builder.prepareEspresso();
	    espresso.doIt();
    }
}
