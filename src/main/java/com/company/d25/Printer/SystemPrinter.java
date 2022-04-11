package com.company.d25.Printer;

public class SystemPrinter implements Printer{
    @Override
    public void print(String text) {
        System.out.println(text+ Thread.currentThread().getName());
    }
}
