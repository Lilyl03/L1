package com.company.d23.Thread;

import com.company.d20.MulRunnable;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {
//        System.out.println(System.currentTimeMillis());
//        for (int i = 0; i < 160000; i++) {
//            new Thread(new MyRunnable()).start();
//        }
//        Executor executor = new Executor() {
//            @Override
//            public void execute(Runnable command) {
//                command.run();
//            }
//        };
 //       Executor executor = Executors.newCachedThreadPool();
 //       Executor executor = Executors.newFixedThreadPool(16);
//        for (int i = 0; i < 16000; i++) {
//            executor.execute(new MyRunnable());
//        }

        Thread thread = new Thread(new MyRunnable(45));
        for (int i = 0; i < 1600; i++) {
            for (int j = 0; j < 16; j++) {
                thread.start();

            }
            for (int j = 0; j < 16; j++) {
                thread.join();
            }

        }

    }

    private static class MyRunnable implements Runnable {
        private final int number;

        public MyRunnable(int number) {
            this.number = number;
        }

        @Override
        public void run() {
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(System.currentTimeMillis());
            final long start = System.currentTimeMillis();
            while (System.currentTimeMillis() - start <3000)
                System.out.println(System.currentTimeMillis());
            System.out.println(number);

        }
    }
}
