package com.company.d22.Printer;

public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    wait1sec();
                }
            }
        });
        thread.start();
    }

    public static void wait1sec() {
        long previous = System.currentTimeMillis() / 1000;
        while (true) {
            long current = System.currentTimeMillis() / 1000;
            if (current - previous == 1) {
                System.out.println(current - previous);
                previous = current;
            }
        }
    }
}
