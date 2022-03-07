package com.company.d15.concat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongConcatenatorTest {
    private LongConcatenator testSubject;

    public static void main(String[] args) {

    }

    @BeforeEach
    public void setUp() {
        testSubject = new LongConcatenator();
    }
    @Test
    void test2Numbers() {
        Assertions.assertEquals("10050",testSubject.concat(10,50));
    }
}