package com.company.d22.Printer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\LUser\\IdeaProjects\\L1\\src\\main\\com\\company\\d22\\Printer\\";
        long current = System.currentTimeMillis();

        List<Runnable> runnableList = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            runnableList.add(new FilePrinterRunnable(filePath + "file" + i + ".txt"));
        }
        for (Runnable runnable : runnableList) {
            new Thread(runnable).start();
        }
        System.out.println(System.currentTimeMillis() - current);

    }
}
