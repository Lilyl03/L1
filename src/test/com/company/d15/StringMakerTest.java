package com.company.d15;


import com.company.d15.stringmaker.LowPreformance;
import com.company.d15.stringmaker.StringMaker;

class StringMakerTest {
    public static void main(String[] args) {
        StringMaker badStringMaker = StringMaker.ofBad();
        System.out.println(badStringMaker.make(1,100000).getDuration());
        StringMaker goodStringMaker = StringMaker.ofGood();
        System.out.println(goodStringMaker.make(1,100000).getDuration());


        StringMaker[] stringMakers = new StringMaker[5];
        stringMakers[0] = StringMaker.ofBad();
        stringMakers[1] = StringMaker.ofBad();
        stringMakers[2] = StringMaker.ofGood();
        stringMakers[3] = StringMaker.ofGood();
        stringMakers[4] = StringMaker.ofGood();
        for (StringMaker stringMaker: stringMakers) {
            if(stringMaker instanceof LowPreformance){
                System.out.println("is low preformance");
            }
        }

    }

}