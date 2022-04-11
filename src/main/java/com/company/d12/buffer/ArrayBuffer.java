package com.company.d12.buffer;

public class ArrayBuffer implements Buffer {
    private String[] array = new String[1];

    @Override
    public void put(String value) {
        System.out.println("ArrayBuffer put " + value);
        array[0] = value;
    }

    @Override
    public String get() {
        return array[0];
    }

//    public static void main(String[] args) {
//        ArrayBuffer buffer1 = new ArrayBuffer();
//        buffer1.put("text 1");
//        ArrayBuffer buffer2 = new ArrayBuffer();
//        buffer1.put("text 2222");
//        System.out.println(buffer1.get());
//    }
}
