package com.company.d16.exception;

public class CheckedMain {
    public static void main(String[] args) {
        try {
            createUser();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //kam main@ throw kani Exception
        //kam try/catch;
    }

    public static void createUser() throws Exception {
        throw new Exception();
    }
}
