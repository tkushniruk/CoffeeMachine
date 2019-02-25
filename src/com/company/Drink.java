package com.company;

import java.util.ArrayList;

public class Drink {
    ArrayList<Ingredient> ingredients;

    public Drink() {
    }

    protected Drink(ArrayList<Ingredient> items)throws NullPointerException{
        ingredients = new ArrayList<>();
        ingredients.addAll(items);
    }

    public double getCost(){
        double cost = 0.00;
        for(Ingredient item : ingredients){
            cost += item.getCost();
        }
        return cost;
    }

    public void doIt(){
        for(Ingredient item : ingredients){
            item.doIt();
        }
    }

    public ArrayList<Ingredient> getIngredients(){
        return ingredients;
    }
}
