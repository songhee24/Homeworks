package com.company;


abstract class AbstractAnimal implements CanSelect {
    private double weight;;
    private String name;

    public AbstractAnimal(double weight, String name) {
        this.weight = weight;
        this.name = name;
    }


    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return  name ;
    }

    public String getName(){
        return name;
    }
}
