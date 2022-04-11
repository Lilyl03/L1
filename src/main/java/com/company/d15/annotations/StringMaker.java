package com.company.d15.annotations;

import com.company.d15.stringmaker.StringMakerResult;

public interface StringMaker {
    StringMakerResult make(int start, int end);
    static StringMaker ofBad(){
        return new StringMakerImpl();
    }
    static StringMaker ofGood(){
        return new GoodStringMaker();
    }
}
