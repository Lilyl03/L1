package com.company.d12.buffer;

import java.util.Scanner;

public class RandomPutterTest {
    public static void main(String[] args) {

    }
    public static Buffer getBuffer(){
        int input = new Scanner(System.in).nextInt();
       return input == 0 ? new MyBuffer(): new ArrayBuffer();
    }
}
