package com.company.d26;

public final class UnsafeBuffer<T> implements Buffer<T>{

    private T value;

    @Override
    public T get() throws InterruptedException {
        if(value == null){
            throw new IllegalStateException("The buffer is empty");
        }
        T valueToReturn = null;
        value =null;
        return valueToReturn;
    }

    @Override
    public void put(T t) throws InterruptedException {
        if(t == null){
            throw new IllegalArgumentException("Provided value is null");
        }
        if(value != null){
            throw new IllegalStateException("The buffer is full");
        }
        this.value = t;
    }
}
