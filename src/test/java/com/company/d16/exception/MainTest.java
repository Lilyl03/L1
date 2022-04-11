package com.company.d16.exception;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void test(){
        Assertions.assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() {
              throw new RuntimeException();
            }
        });

    }

}