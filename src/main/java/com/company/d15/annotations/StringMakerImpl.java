package com.company.d15.annotations;

import com.company.d15.stringmaker.StringMakerResult;

@LowPerformance
public class StringMakerImpl implements StringMaker {

    @Override
    public StringMakerResult make(int start, int end){
        long starter = System.currentTimeMillis();
        String string = "";
        for (int i = start; i <= end; i++) {
            string+=i;
        }
        return new StringMakerResult(System.currentTimeMillis()-starter, string);
    }
}
