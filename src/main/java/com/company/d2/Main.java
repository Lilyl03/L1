package com.company.d2;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        int n = 67;
//        System.out.println(firstDig(n) + "\n" + lastDig(n));

    }
//    public static int min(int a,int b){
//        return a < b ? a : b;
//
//    }
    public static int  minMax(int a, int b){
        int max = a > b ? a : b;
        return max;
    }
    public static int firstDig(int n){
        int n1 = n/10;
        return n1;
    }
    public static int lastDig( int n){
        int n1 = n - firstDig(n) * 10 ;
        return n1;
    }


}
