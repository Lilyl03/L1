package com.company.d3;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        String string = new Scanner(System.in).nextLine();
        System.out.println(indexOfString(string));
    }
    public static int indexOfString(String string){
        char k = string.charAt(0);

        char[] arr = {'a','b','c','d','e'};
        int index = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == k){
               return i;
            }}
            return -1;

        }
}
