package com.company.d12.qa;

import javax.swing.*;
import java.awt.*;

public abstract class TestExecution {
    private String description;
    public TestExecution(String description){
        this.description = description;
    }
    public void start(){
        printTestDescription();
        Result result = execute();
        printResult(result);
    }

    private void printResult(Result result) {
        if(result.equals(Result.FAIL)) {;
            System.err.println("The result of " + description + " is " + result);
        }else{
            System.out.println("The result of " + description + " is " + result);
        }
    }

    private void printTestDescription() {
        System.out.println("Starting the test " + description);
    }
    public abstract Result execute();
}
