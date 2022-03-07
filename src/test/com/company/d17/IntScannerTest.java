package com.company.d17;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class IntScannerTest {
    private IntScanner testSubject;


    @BeforeEach
    public void setUp() {
        testSubject = new IntScanner(new IntSupplierForTest());
    }

    @Test
    public void testGet5SizedArray() {
        int[] array = testSubject.get5SizedArray(new IntSupplierForTest());
        Assertions.assertEquals(9, array[0]);
        Assertions.assertEquals(10, array[1]);
        Assertions.assertEquals(4, array[2]);
    }
}