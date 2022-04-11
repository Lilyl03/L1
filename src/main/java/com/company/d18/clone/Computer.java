package com.company.d18.clone;

public class Computer implements ConstructorCloneable<Computer> {
    private final String brand;

    public Computer(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public Computer doClone() {
        return new Computer(this.brand);
    }

    @Override
    public String toString() {
        return "Computer " + brand;
    }
}
