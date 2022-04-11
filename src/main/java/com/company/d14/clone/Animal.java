package com.company.d14.clone;

public class Animal implements Cloneable{
    private AnimalType type;
    private String name;

    public Animal(AnimalType type, String name) {
        this.type = type;
        this.name = name;
    }

    @Override
    protected Animal clone() throws CloneNotSupportedException {
        return (Animal)super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Animal tiger = new Animal(AnimalType.PREDATOR, "Tiger");
        System.out.println(tiger.clone().getClass());
    }
}
