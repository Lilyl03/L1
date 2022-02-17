package com.company.d5.user;

import java.util.Scanner;

public class UserTest {
    public static void main(String[] args) {

       User users[] = new User[3];
       User user = new User();
       //inputUsers(users);
//       printUserData(users);
        System.out.println("Please enter the user name");
        user.name = new Scanner(System.in).nextLine();
        System.out.println("Please enter the user lastname");
        user.lastName = new Scanner(System.in).nextLine();
        System.out.println("Please enter the user age");
        user.age = new Scanner(System.in).nextInt();
        printUser(user);
    }
    public static void inputUsers(User users[]){
        for(int i = 0; i< 3;i++){
            User user = new User();
            System.out.println("Please enter the user name");
            user.name = new Scanner(System.in).nextLine();

            System.out.println("Please enter the user lastname");
            user.lastName = new Scanner(System.in).nextLine();

            System.out.println("Please enter the user age");
            user.age =  new Scanner(System.in).nextInt();
            users[i] = user;
        }

    }
    public static void wait1sec(){
        long start = System.currentTimeMillis();
        while (System.currentTimeMillis() - start < 1000 ){

        }}
    public static void printUserData(User[] users ){
        for(int i = 0; i<3; i++){
            System.out.println(users[i].name + " " +users[i].lastName + " " + users[i].age);
        }
    }
    public static void printUser(User user){
        System.out.println(user.name + " " + user.lastName + " " + user.age);
    }
}
