package com.company.d20;

public class SumRunnable implements Runnable {
    long num1;
    long num2;

    public SumRunnable(long num1, long num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void run() {
        System.out.println("The sum is: " + (num1 + num2));
    }
}
