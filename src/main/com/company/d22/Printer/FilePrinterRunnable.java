package com.company.d22.Printer;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FilePrinterRunnable implements Runnable {

    private final String filePath;

    public FilePrinterRunnable(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void run() {

        if(true) {
            throw new RuntimeException();
        }

        PrintWriter printWriter;
        try {
            printWriter = new PrintWriter(filePath);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("the file " + filePath + " not found");
        }
        for (int i = 0; i < 30000000; i++) {
            printWriter.println(i);
        }
        printWriter.close();
    }
}
