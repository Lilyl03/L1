package com.company.d13.set;

public abstract class AbstractSet implements Set{
    @Override
    public boolean isEmpty() {
        return size() == 0;
    }
}
