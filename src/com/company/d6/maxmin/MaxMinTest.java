package com.company.d6.maxmin;

import com.company.d6.maxmin.MaxMin;

import java.util.Scanner;

public class MaxMinTest {

    public static void main(String[] args) {
        MaxMin[] maxMin =  get3MaxMin();
        printMaxMin(maxMin);
    }

    public static MaxMin[] get3MaxMin(){
       MaxMin[] maxMinArray = new MaxMin[3];
        for(int i = 0; i<3; i++){
            System.out.println("Enter a number");
            long num1 = new  Scanner(System.in).nextInt();
            System.out.println("Enter a number");
            long num2 = new  Scanner(System.in).nextInt();
            MaxMin maxMin = createMaxMin(num1, num2);
            maxMinArray[i] = maxMin;
        }
    return  maxMinArray;
    }

    public static MaxMin createMaxMin(long i,long l){
        MaxMin maxMin = new MaxMin();
        if(i>l){
            maxMin.max = i;
            maxMin.min = l;
        }else{
            maxMin.max = l;
            maxMin.min = i;
        }
        return maxMin;
    }

    public static void printMaxMin(MaxMin[] maxmin){
        for(int i = 0; i<3; i++ ){
            System.out.println("max:" +  maxmin[i].max + " min: " + maxmin[i].min);
        }

    }
}
