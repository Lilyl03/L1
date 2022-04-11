package com.company.d12.buffer;

public class BufferTest {
    public static void main(String[] args) {
        Buffer buffer = new MyBuffer();
//        buffer.put("text");
//        System.out.println(buffer.get());
//        putInBuffer(buffer, "text");
//        printBufferValue(buffer);
    }
    public static void putInBuffer(Buffer buffer, String value){
        buffer.put(value);
    }
    public static void printBufferValue(Buffer buffer){
        System.out.println(buffer.get());
    }
}
