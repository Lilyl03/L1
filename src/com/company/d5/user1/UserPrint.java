package com.company.d5.user1;

import java.util.Scanner;

public class UserPrint {
    public static void main(String[] args) {
        String[] userName = new String[3];
        for(int i = 0; i< 3; i++){
            System.out.println("Plese enter the user name");
            userName[i] = new Scanner(System.in).nextLine();
        }
        for(String s : userName){
            long startTime =  (System.currentTimeMillis()/1000);
            long prev = startTime;
            while(true){
                long current = (System.currentTimeMillis()/1000);
                if(current - prev == 1){
                    System.out.println(s);
                    break;
                }
                prev = current;
            }
        }
    }
}
