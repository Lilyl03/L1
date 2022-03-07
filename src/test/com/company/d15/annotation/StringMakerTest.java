package com.company.d15.annotation;

import com.company.d15.annotations.HighPreformance;
import com.company.d15.annotations.StringMaker;

import java.lang.annotation.Annotation;

public class StringMakerTest {

    public static void main(String[] args) {
//        StringMaker bad = StringMaker.ofBad();
//
//        StringMaker good = StringMaker.ofGood();
//
//        System.out.println(bad.getClass().getDeclaredAnnotations()[0].annotationType());

        StringMaker[] stringMakers = {StringMaker.ofBad(),StringMaker.ofGood()};
        for (StringMaker stringmaker: stringMakers) {
            Annotation[] declaredAnnotations = stringmaker.getClass().getDeclaredAnnotations();
            if(declaredAnnotations.length>0 && declaredAnnotations[0].annotationType() == HighPreformance.class){
                System.out.println(stringmaker.make(1,100000).getDuration());
            }
        }
    }
}
