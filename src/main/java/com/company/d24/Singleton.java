package com.company.d24;

import java.util.Set;

public class Singleton {
    private static Singleton instance = null;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
       if(instance == null){
           instance = new Singleton();
       }
       return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Singleton.getInstance().hashCode());
                }
            }).start();
    }}
}
