package com.company;

public class CoffeeMachine {
    public Drink getAmericano(){
        return (new DrinkBuilder()).prepareAmericano();
    }
}
