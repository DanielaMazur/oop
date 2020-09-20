package com.oop.lab1.monitor;

public class Monitor {
    String color;
    String resolution;
    int width;
    int height;


    public Monitor(String monitorColor, String monitorResolution, int monitorWidth, int monitorHeight) {
        color = monitorColor;
        resolution = monitorResolution;
        width = monitorWidth;
        height = monitorHeight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void printMonitorProperties(){
        System.out.println( "color: " + color +
                "\nheight: " + height +
                "\nwidth: " + width +
                "\nresolution: " + resolution);
    }
}
