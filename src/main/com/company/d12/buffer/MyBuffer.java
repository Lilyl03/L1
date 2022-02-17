package com.company.d12.buffer;

import com.company.d12.buffer.Buffer;

public class MyBuffer implements Buffer {
    private String value;
    @Override
    public void put(String value) {
        this.value = value;
    }

    @Override
    public String get() {
        return value;
    }
}
