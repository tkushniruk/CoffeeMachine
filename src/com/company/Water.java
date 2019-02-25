package com.company;

public class Water implements Ingredient{
    private String name;
    private double weight;
    private double cost;

    public Water(AbstractFactory factory) {
        this.cost = factory.getCost();
        this.name = factory.getName();
        this.weight = factory.getWeight();
    }

    @Override
    public void doIt() {
        System.out.println(getName() + " is poured");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
