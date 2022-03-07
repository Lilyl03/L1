package com.company.d17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IntScanner {

    private IntSupplier intSupplier;

    public IntScanner(IntSupplier intSupplier) {
        this.intSupplier = intSupplier;
    }

    public int[] get5SizedArray(IntSupplier intSupplier){
        int[] array = new int[5];
       for (int i = 0; i < 5; i++) {
           try {
               array[i] = intSupplier.get();
           }catch (InputMismatchException e){
                e.printStackTrace();
                i--;
           }
          }
        return array;
    }
    public int getMax(int[] array){
        int max = array[0];
        for (int a: array) {
            max = Math.max(max, a);
        }
        return max;
    }
}
