package com.company.d26;

public class WaitMain {
    public static void main(String[] args) throws InterruptedException {
        WaitMain waitMain = new WaitMain();
        synchronized (waitMain){
            waitMain.wait();
        }
    }
}
