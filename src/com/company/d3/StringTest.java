package com.company.d3;

public class StringTest {
    public static void main(String[] args) {
        String s = "1|2|3|4|5|6";

        String k = String.valueOf('|');
        String s1 = s.replace(k,"");
        for(int i = 0; i<s.length();i++){

        }
        System.out.println(s1);
    }

}
