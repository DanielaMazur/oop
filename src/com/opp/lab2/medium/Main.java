package com.opp.lab2.medium;

public class Main {
    public static void main(String[] args) {
        Queue Animals = new Queue();
        Animals.push("Zebra");
        Animals.push("Dog");
        Animals.push("Cat");

        Animals.pop();

        System.out.println(Animals.QueueValues);

        Queue Colors = new Queue(3);

        Colors.push("red");
        Colors.push("blue");
        Colors.push("yellow");

        Colors.pop();

        System.out.println(Colors.QueueValues);

        System.out.println(Animals.isFull());
        System.out.println(Animals.isEmpty());
        System.out.println(Colors.isFull());
        System.out.println(Colors.isEmpty());
    }
}
