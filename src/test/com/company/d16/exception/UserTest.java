package com.company.d16.exception;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    public void testWhenUsernameIsNull(){
        RuntimeException exception = assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                new User(null, "first name");
            }
        });
        System.out.println("The username is null");
        Assertions.assertEquals(exception.getMessage(),"Username is null");
    }
    @Test
    public void testWhenFirstNameIsNull(){
        RuntimeException exception = assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                new User("username", null);
            }
        });
        Assertions.assertEquals(exception.getMessage(),"FirstName is null");
    }
}