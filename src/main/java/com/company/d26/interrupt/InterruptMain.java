package com.company.d26.interrupt;

public class InterruptMain {
    public static void main(String[] args) {
        final Thread thread = new Thread(()->{
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            doHeavyTasks();
            System.out.println("Finished");
        });
        thread.start();
        new Thread(()->{
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
               return;
            }
            thread.interrupt();

        }).start();

    }
    public static void doHeavyTasks(){
        for (int i = 0; i < 100; i++) {
            if(Thread.currentThread().isInterrupted()){
                return;
            }
            final long start = System.currentTimeMillis();
            while(System.currentTimeMillis()-start<100);
            System.out.println("Doing heavy task - " + i );

        }
    }
}
