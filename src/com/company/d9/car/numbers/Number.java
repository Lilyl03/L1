package com.company.d9.car.numbers;

public class Number {
    private int number1;
    private int number2;
    public Number(){

    }
    public Number(int number1,int number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public static void main(String[] args) {
        Number number = new Number();
        number.setNumber1(50);
        number.setNumber2(10);
    }
}
