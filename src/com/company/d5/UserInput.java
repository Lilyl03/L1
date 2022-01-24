package com.company.d5;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        String[] userName = new String[3];
        String[] userLastName = new String[3];
        int[] userAge = new int[3];
        inputUsers(userName,userLastName,userAge);

        for(int i = 0; i< 3;i++){
            printUserData(userName, userLastName, userAge,i);
            wait1sec();
        }

        System.out.println("Input the search name");
        String name = new Scanner(System.in).nextLine();
        for(int i = 0;i<3;i++){
            if(userName[i].equals(name)){
                System.out.println(
                        "Name " +userName[i] + "\n" +
                        "Last Name " +userLastName[i] + "\n" +
                        "Age " + userAge[i] + "\n"
                );
            }
        }
    }
    public static void wait1sec(){
        long start = System.currentTimeMillis();
        while (System.currentTimeMillis() - start < 1000 ){

        }
    }
    public static void inputUsers(String[] userName, String[] userLastName, int[] userAge){
        for(int i = 0; i< 3;i++){
            System.out.println("Please enter the user name");
            userName[i] = new Scanner(System.in).nextLine();

            System.out.println("Please enter the user lastname");
            userLastName[i] = new Scanner(System.in).nextLine();

            System.out.println("Please enter the user age");
            userAge[i] = new Scanner(System.in).nextInt();

        }
    }
    public static void printUserData(String[] userName,String[] userLastName, int[] userAge, int i){
        System.out.println(
                System.currentTimeMillis() + " "
                        + userName[i] + " "
                        + userLastName[i] + " "
                        + userAge[i] + " "

        );
    }
}
