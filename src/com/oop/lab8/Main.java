package com.oop.lab8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cub cub = new Cub(2);
        Parallelepiped parallelepiped = new Parallelepiped(2,3,4);
        Sphere sphere = new Sphere(2);

        ArrayList<GeometricBody> geometricBodiesList = new ArrayList<>();

        geometricBodiesList.add(cub);
        geometricBodiesList.add(parallelepiped);
        geometricBodiesList.add(sphere);

        GeometricBodyController geometricBodyController = new GeometricBodyController();

        System.out.println("Body with the biggest Surface " + geometricBodyController.biggestSurfaceBody(geometricBodiesList));
        System.out.println("Body with the biggest Volume " + geometricBodyController.biggestVolumeBody(geometricBodiesList));
    }
}
