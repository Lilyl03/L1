package com.company.d12.buffer;

import com.company.d12.buffer.Buffer;

public class RandomPutter {
    private Buffer buffer;

    public RandomPutter(Buffer buffer) {
        this.buffer = buffer;
    }

    public void start() {
        for (int i = 0; ; i += 2) {
            buffer.put("text" + i);
            wait1sec();
            System.out.println(buffer.get());
            wait1sec();
        }
    }

    public void wait1sec() {
        long start = System.currentTimeMillis();
        while (System.currentTimeMillis() - start < 1000) {

        }
    }

}
