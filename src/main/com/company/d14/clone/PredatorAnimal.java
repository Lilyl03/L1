package com.company.d14.clone;

public class PredatorAnimal extends Animal{
    public PredatorAnimal( String name) {
        super(AnimalType.PREDATOR, name);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Animal tiger = new PredatorAnimal("tiger");
        Animal clonePredator = tiger.clone();
        System.out.println(clonePredator.getClass());
    }
}
