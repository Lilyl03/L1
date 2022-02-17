package com.company.d2;

public class Main1 {
    public static void main(String[] args) {
        int n = 967;
        int firstDig = firstDig(n);
        int secondDig = secondDig(n);
        int lastDig = lastDig(n);
        System.out.println(firstDig + "\n" + secondDig + "\n" + lastDig);
        System.out.println(minMaxDif(firstDig, secondDig, lastDig));
    }
    public static int firstDig(int n){
        int n1 = n/100;
        return n1;
    }
    public static int secondDig(int n){
        int n1 = (n - firstDig(n) * 100 ) /10;
        return n1;
    }
    public static int lastDig(int n){
        int n1 = n - firstDig(n) * 100 - secondDig(n) * 10;
        return n1;
    }
    public static int minMaxDif(int a, int b, int c){
        int max;
        int min;
        if(a >= b && a >= c){
            max =a ;
        }else if(b >= a && b >= c){
            max = b;
        }
        else{
            max = c;
        }if(a <= b && a <= c){
            min =a ;
        }else if(b <= a && b <= c){
            min = b;
        }
        else{
            min = c;
        }
        return max - min;
    }
}
