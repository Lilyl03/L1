package com.company.d15.stringmaker;

public interface StringMaker {
    StringMakerResult make(int start, int end);
    static StringMaker ofBad(){
        return new BadStringMaker();
    }
    static StringMaker ofGood(){
        return new GoodStringMaker();
    }
}
