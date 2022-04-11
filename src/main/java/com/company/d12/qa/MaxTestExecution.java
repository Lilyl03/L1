package com.company.d12.qa;

public class MaxTestExecution extends TestExecution{

    public MaxTestExecution() {
        super("Maximum function test");
    }

    @Override
    public Result execute() {
        if(Math.max(9, 99) == 99){
            return Result.PASS;
        }else{
            return Result.FAIL;
        }
    }
}
