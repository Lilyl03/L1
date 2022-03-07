package com.company.d17;

import org.junit.jupiter.api.TestFactory;

import java.util.Scanner;

public class IntSupplier {
    public int get(){
        return new Scanner(System.in).nextInt();
    }
}
