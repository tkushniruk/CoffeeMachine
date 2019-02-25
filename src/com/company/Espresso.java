package com.company;


import java.util.ArrayList;

public class Espresso extends Drink{
    public Espresso() throws NullPointerException {
        ingredients = new ArrayList<>();
        ingredients.add(new Arabica(new AbstractFactory("arabica",0.03, 5.00)));
        ingredients.add(new SimpleSugar(new AbstractFactory("simple sugar", 0.02, 0.50)));
    }

}

