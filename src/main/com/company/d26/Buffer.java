package com.company.d26;

public interface Buffer<T> {
    T get() throws InterruptedException;
    void put(T t) throws InterruptedException;
}
