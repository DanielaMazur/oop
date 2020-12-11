package com.oop.lab8;

public class Cub implements GeometricBody {
    int cubeEdge;

    public Cub(int cubeEdge) {
        this.cubeEdge = cubeEdge;
    }

    @Override
    public double getSurface() {
        return 6 * Math.pow(cubeEdge, 2);
    }

    @Override
    public double getVolume() {
        return Math.pow(cubeEdge, 3);
    }

    @Override
    public String toString() {
        return "Cub{" +
                "cubeEdge=" + cubeEdge +
                '}';
    }
}
