package com.oop.lab5;

public class B extends A{
    protected String b;

    public B(String a, X x) {
        super(a, x);
    }

    @Override
    public String toString() {
        return "B{" +
                "b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}
