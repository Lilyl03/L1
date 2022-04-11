package com.company.d25.Printer;

public class TextPrinterMain {
    public static void main(String[] args) {
        TextPrinterRunnable textPrinterRunnable = new TextPrinterRunnable(new SystemPrinter(),"Hello World!");
        Thread thread1 = new Thread(textPrinterRunnable);
        thread1.start();
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(10_000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                textPrinterRunnable.stop();
            }
        });
        thread2.start();
    }
}
