package com.company.d3;

import java.util.Scanner;

public class ex1 {


    public static void main(String[] args) {
        boolean height = isHeightLowerThen180();
        boolean age = isAgeGT59();
        boolean weight = isWightEq50();
        if ((!height && weight) || (height && weight && !age)) {
            System.out.println("It satisfies the condition");
        }else{
            System.out.println("It doesn't satisfy the condition");
        }
    }
    public static boolean isHeightLowerThen180(){
        Scanner  input = new Scanner(System.in);
        System.out.println("Input your height:");
        int height = input.nextInt();
        return height < 180;

    }  public static boolean isAgeGT59(){
        Scanner  input = new Scanner(System.in);
        System.out.println("Input your age:");
        int age = input.nextInt();
        return age > 59;

    }  public static boolean isWightEq50(){
        Scanner  input = new Scanner(System.in);
        System.out.println("Input your weight:");
        int weight  = input.nextInt();
        return weight == 50;

    }
}
