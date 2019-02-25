package com.company;

public class DrinkBuilder {
    public Drink prepareAmericano(){
        Drink americ = new Americano();
        return (new Drink(americ.getIngredients()));
    }
    public Drink prepareEspresso(){
        Drink espresso = new Espresso();
        return (new Drink(espresso.getIngredients()));
    }

}
