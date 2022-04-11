package com.company.d25.Printer;

public class TextPrinterRunnable implements Runnable{
    private final String name;
    Printer printer;
    private boolean isRunning = true;

    public TextPrinterRunnable(Printer printer, String name) {
        this.name = name;
        this.printer = printer;
    }

    @Override
    public void run() {
        while(isRunning){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            printer.print(name);
        }
    }
    public  void stop(){
        printer.print("Stopping...");
        isRunning = false;
    }
}
