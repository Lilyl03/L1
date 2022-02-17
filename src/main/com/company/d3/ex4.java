package com.company.d3;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Scanner input = new Scanner(System.in);
        int k = 0;
        for(int i = 0 ; i< 3; i++){
           numbers[i] = input.nextInt();
        }
        for(int i = 0; i< 3; i++){
            if(numbers[i] == 75){
                System.out.println(i);
            }
    }
        System.out.println(indexOf(75,numbers));


    }
    public static int indexOf(int nums,int[] numbers){
        for(int i = 0; i< 3; i++){
            if(numbers[i] == 75){
               return i;
            }
        }
        return -1;
    }
}
