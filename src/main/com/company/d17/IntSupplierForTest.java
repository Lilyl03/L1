package com.company.d17;

import java.util.InputMismatchException;

public class IntSupplierForTest extends IntSupplier {
    private int cnt = -1;

    @Override
    public int get() {
        cnt++;
        if (cnt == 0) {
            return 9;
        }
        if (cnt == 1) {
            return 10;
        }
        if (cnt == 2) {
            return 4;
        }
        if (cnt == 3) {
            return 5;
        }
        if (cnt == 4) {
            return 6;
        }
        return 0;
    }
}
