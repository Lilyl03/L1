package com.company.d7.bank;

public class Account {
    double money;

    public static void main(String[] args) {
        Account account = new Account();
        account.money = 150_000;
        System.out.println();
        account.zeroMoney();
        System.out.println();
        for(int i = 0; i<365;i++){
            account.increase1Percent();
        }
    }
    public void zeroMoney(){
        this.money = 0;
    }

    public double increase1Percent() {
        return this.money * 1.01;
    }
}
