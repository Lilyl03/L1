package com.company.d4;

public class WhileTest {
    public static void main(String[] args) {
        long previous = System.currentTimeMillis()/1000;
        long prev = previous;
        while(true){
            long current = System.currentTimeMillis()/1000;
            if(current - previous == 1){
                System.out.println(current-prev);
                previous = current;
            }

        }
    }
}
