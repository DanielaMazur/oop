package com.oop.lab8;

public class Parallelepiped implements GeometricBody {
    int h, l , L;

    public Parallelepiped(int h, int l, int L) {
        this.h = h;
        this.l = l;
        this.L = L;
    }

    @Override
    public double getSurface() {
        return 2 * h * l + 2 * h * L + 2 * L * l;
    }

    @Override
    public double getVolume() {
        return h * l * L;
    }

    @Override
    public String toString() {
        return "Parallelepiped{" +
                "h=" + h +
                ", l=" + l +
                ", L=" + L +
                '}';
    }
}
