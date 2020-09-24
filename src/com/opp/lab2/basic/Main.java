package com.opp.lab2.basic;

public class Main {
    public static void main(String[] args) {
        Box defaultSizeBox = new Box();
        Box equalSizeBox = new Box(2);
        Box customSizeBox = new Box(1, 2, 3);

        System.out.println("Surface area for the default size Box is " + defaultSizeBox.surfaceArea());
        System.out.println("Volume for the default size of Box is " + defaultSizeBox.volume());

        System.out.println("Surface area for the equal size Box is " + equalSizeBox.surfaceArea());
        System.out.println("Volume for the equal size Box is " + equalSizeBox.volume());

        System.out.println("Surface area for the custom size Box is " + customSizeBox.surfaceArea());
        System.out.println("Volume for the custom size Box is " + customSizeBox.volume());
    }
}
