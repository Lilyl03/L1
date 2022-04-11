package com.company.d16.exception;

public class UserCreationException extends RuntimeException{
    public UserCreationException(String message) {
        super(message);
    }

    public UserCreationException() {
        this("message");
    }

    //2rd@ this-i ognutyamb kanchela 1in;
}
