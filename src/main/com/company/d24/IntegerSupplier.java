package com.company.d24;

import java.util.function.Supplier;

public class IntegerSupplier implements Supplier<Integer> {
    @Override
    public Integer get() {
        //Auto-Boxing
        return 8;
    }
}
