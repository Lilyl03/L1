package com.company.d13.set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArraySetTest {
    private Set testSubject;
    public static void main(String[] args) {
        Set set = new ArraySet();
        set.add(new User("F", "L"));
        set.add(new User("F", "L"));
        set.add(new User("F", "L"));
        set.add(new User("F", "L"));

    }

    @BeforeEach
    public void setUp(){
        testSubject = new ArraySet();
    }
    @Test
    void testSizeWhenEmpty(){
        Assertions.assertEquals(0,testSubject.size());
    }
    @Test
    void testSizeForOneUser(){
        testSubject.add(new User("F", "L"));
        Assertions.assertEquals(1,testSubject.size());
    }
    @Test
    void testSizeForFiveUser(){
        testSubject.add(new User("F", "L"));
        testSubject.add(new User("F", "L"));
        testSubject.add(new User("F", "L"));
        testSubject.add(new User("F", "L"));
        testSubject.add(new User("F", "L"));
        Assertions.assertEquals(1,testSubject.size());
    }

}