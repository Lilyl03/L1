package com.company.d7.bank;

public class AccountTest {
    public static void main(String[] args) {
        Account[] array = new Account[5];
        array[0] = new Account();

        Account first = new Account();
        first.money = 111;

        Account second = new Account();
        second.money = 222;
        mutate(array);
    }
    public static void mutate(Account[] array){
        array[0] = null;
    }
    public static void mutateFirst(Account[] array){
        array[1].money = 999;
    }
    public static void mutateSecond(Account[] array){
        array[2] = new Account();
    }
}
