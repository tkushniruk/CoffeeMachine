package com.company;

public abstract class Coffee implements Ingredient{
    protected String name;
    protected double weight;
    protected double cost;
    protected Coffee(AbstractFactory factory){
        this.name = factory.getName();
        this.weight = factory.getWeight();
        this.cost = factory.getCost();
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void doIt() {
        System.out.println((ground() + " " + boil() + " " + pour()));
    }

    private String  ground(){
        return getName() + ": is grounded.";
    }

    private String boil(){
        return getName() + ": is boiled.";
    }

    private String pour(){
        return getName() + ": is poured.";
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
