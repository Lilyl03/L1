package com.company.d3;

import java.util.Scanner;

public class MineTest {
    public static void main(String[] args) {
        char[] arr = new char[6];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i< arr.length; i++){
            System.out.println("Is there a  mine at " + i + " position");
            if(input.nextInt() == 1){
                arr[i] = '*';
            }}
            System.out.println("Where do you wanna stand ");
            int standInt = input.nextInt();
            if(arr[standInt] == ('*')){
                System.out.println("Boom!!");
            }else{
                System.out.println("You are alive");
            }

    }

}

