package com.company;

public class AbstractFactory {
    private String name;
    private double weight;
    private double cost;

    public AbstractFactory(String name, double weight, double cost) {
        this.name = name;
        this.weight = weight;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getCost() {
        return cost;
    }
}
