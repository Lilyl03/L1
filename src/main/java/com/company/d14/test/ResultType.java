package com.company.d14.test;

public enum ResultType {
    FAIL("execution failed"),
    PASS("execution passed");

    private  String message;

    ResultType(String message) {
        this.message = message;
    }
    public String getTestExecutionMessage(String testName){
        return testName + " " + message;
    }
}
