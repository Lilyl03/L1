package com.company.d12.qa;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //System.setErr(new PrintStream(new FileOutputStream("./errors.txt")));
        //System.setOut(new PrintStream(new FileOutputStream("./out.txt")));
        startAll(new TestExecution[]{new MaxTestExecution(), new MinTestExecution(), new AbsTestExecution()});
    }

    public static void startAll(TestExecution[] testExecutions) {
        for (TestExecution execution: testExecutions) {
            execution.start();
        }
    }
}
