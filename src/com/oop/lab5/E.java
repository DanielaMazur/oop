package com.oop.lab5;

public class E extends D {
    protected String e;

    public E(String a, X x) {
        super(a, x);
    }


    @Override
    public String toString() {
        return "E{" +
                "e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}
