package com.company.d12.qa;

import javax.swing.*;

public class AbsTestExecution extends TestExecution{
    public AbsTestExecution() {
        super("Abs Test Execution");
    }

    @Override
    public Result execute() {
        if(Math.abs(-1000) == 1000){
            return Result.FAIL;
        }
        return Result.PASS;
    }
}
