package com.company.d26;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class BlockingBuffer<T> implements Buffer<T>{

    private final ArrayBlockingQueue<T> queue = new ArrayBlockingQueue<>(1);

    @Override
    public T get() throws InterruptedException {
        return queue.take();
    }

    @Override
    public void put(T t) throws InterruptedException {
        queue.put(t);
    }
}
