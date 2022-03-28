package com.company.d23.Timer;

import java.util.Scanner;

public class Timer {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.start();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please input a number");
            int number = scanner.nextInt();
            if(number == -1){
                timer.stop();
            }
        }
    }
    private boolean isRunning = true;

    public void start() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (isRunning) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(i++);
                }
            }
        }).start();
    }
    public void stop(){
        isRunning = false;
    }
}
