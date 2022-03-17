package com.company.d20.map;

public class HashTest {
    private  int a;
    private  int b;
    private  int c;

    public HashTest(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public int hashCode() {
        int result = a;
        result = 31 * result + b;
        result = 31 * result + c;
        return result;
    }
}
