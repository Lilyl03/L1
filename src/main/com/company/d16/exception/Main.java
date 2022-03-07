package com.company.d16.exception;

public class Main {
    public static void main(String[] args) {
        try {
            createUser();
        }catch (IllegalArgumentException illegalArgumentException){
            illegalArgumentException.printStackTrace();
        }

    }
    public static User createUser(){
        return new User(null,"first name");
    }
}
