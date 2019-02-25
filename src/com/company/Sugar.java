package com.company;

public abstract class Sugar implements Ingredient {
    protected String name;
    protected double cost;
    protected double weight;

    public Sugar(AbstractFactory factory) {
        this.name = factory.getName();
        this.weight = factory.getWeight();
        this.cost = factory.getCost();
    }

    @Override
    public void doIt() {
        System.out.println(getName() + " is added");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getCost() {
        return this.cost;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }
}
