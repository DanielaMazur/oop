package com.oop.lab5;

public class D extends C {
    protected String d;
    protected X x = new X("Dx");

    public D(String a, X x) {
        super(a, x);
    }

    @Override
    public String toString() {
        return "D{" +
                "d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}
