package com.company.d12.qa;

public class MinTestExecution extends TestExecution{
    public MinTestExecution() {
        super("Min function test");
    }

    @Override
    public Result execute() {
        if(Math.min(9, 99) == 9){
            return Result.PASS;
        }else{
            return Result.FAIL;
        }
    }
}
