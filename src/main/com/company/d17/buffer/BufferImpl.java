package com.company.d17.buffer;

public class BufferImpl<T> implements Buffer<T> {
    private T o;

    @Override
    public void put(T o) {
        this.o = o;
    }

    @Override
    public T get() {
        return this.o;
    }
}
