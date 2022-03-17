package com.company.d18.clone;

public class Car implements ConstructorCloneable<Car> {
    private final int age;

    public Car(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public Car doClone() {
        return new Car(this.age);
    }

    @Override
    public String toString() {
        return "Car " + this.age;
    }
}
