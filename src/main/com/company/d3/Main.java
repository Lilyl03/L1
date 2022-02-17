package com.company.d3;

public class Main {
    public static void main(String[] args) {
        boolean c1 = (isRedCar() || isBMW());
        boolean c2 = isOld();
        if(c1 && c2){
            System.out.println("text1");
        }
    }

    public static boolean isRedCar() {
        return false;
    }

    public static  boolean isBMW() {
        return true;
    }
    public static  boolean isOld() {
        return false;
    }

}
