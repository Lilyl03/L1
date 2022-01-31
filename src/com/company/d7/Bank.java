package com.company.d7;

public class Bank {
        String name;
        Account[] accounts;

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.name = "HSBC";
        Account[] accounts = new Account[10];
        for(int l = 0; l<10; l++){
            Account account = new Account();
            account.money += 15000 * (l+1);
            accounts[l] = account;
        }
        bank.accounts = accounts;
        Account account = new Account();

        for(int i = 0; i <10; i++){
            for(int j = 0; j < 365; j++){
               accounts[i].money =  accounts[i].increase1Percent();
            }
            System.out.println(accounts[i].money);
        }

    }

}
