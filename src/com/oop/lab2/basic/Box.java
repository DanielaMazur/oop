package com.oop.lab2.basic;

public class Box {
    int height;
    int width;
    int depth;

    public Box(){
        height = width = depth = 1;
    }

    public Box(int size){
        height = width = depth = size;
    }

    public Box(int height, int width, int depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    int surfaceArea(){
        return 2 * (depth * width + depth * height + width * height);
    }

    int volume(){
        return  height * width * depth;
    }
}
