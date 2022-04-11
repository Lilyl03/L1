package com.company.d22;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PrinterMain {
    public static void main(String[] args) throws FileNotFoundException {
        String filename = ".\\file.txt";
        PrintWriter printWriter = new PrintWriter(new FileOutputStream(filename,true));
        printWriter.print("12");
        printWriter.close();
    }
}

