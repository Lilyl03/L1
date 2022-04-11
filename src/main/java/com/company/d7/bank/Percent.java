package com.company.d7.bank;

public class Percent {
    public static void main(String[] args) {
        countPercent(150000);
    }
    public static void countPercent(int k){
        double t= k;
        for(int i = 0; i< 365; i++){
            t = t + t/100;
        }
        System.out.println(t);
    }
}
