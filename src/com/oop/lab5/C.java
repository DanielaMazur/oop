package com.oop.lab5;

public class C extends B {
    protected String c;

    public C(String a, X x) {
        super(a, x);
    }

    @Override
    public String toString() {
        return "C{" +
                "c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}
