package com.company.d3;

public class ex2 {
    public static void main(String[] args) {
        int a [] = {78,98,0,1,-5} ;
        int max = a[0];
        for(int i =1 ; i<a.length; i++){
            max = max(max,a[i]);
        }
        System.out.println(max);
    }
    public static int max(int i1, int i2){
        return i1 > i2 ? i1 : i2;
    }

}
