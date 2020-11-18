package com.oop.lab5;

public class I extends H{
    protected String i;

    public I(String a, X x) {
        super(a, x);
    }

    @Override
    public String toString() {
        return "I{" +
                "i='" + i + '\'' +
                ", h='" + h + '\'' +
                ", g='" + g + '\'' +
                ", f='" + f + '\'' +
                ", e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + ((G) this).x +
                '}';
    }
}
