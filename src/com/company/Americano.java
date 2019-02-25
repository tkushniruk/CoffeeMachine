package com.company;

import java.util.AbstractList;
import java.util.ArrayList;

public class Americano extends Drink{
    public Americano() throws NullPointerException {
        ingredients = new ArrayList<>();
        ingredients.add(new Arabica(new AbstractFactory("arabica",0.03, 5.00)));
        ingredients.add(new SimpleSugar(new AbstractFactory("simple sugar", 0.02, 0.50)));
        ingredients.add(new Water(new AbstractFactory("water", 0.02, 0.25)));
    }

}
