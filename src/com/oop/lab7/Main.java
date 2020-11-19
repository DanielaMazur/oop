package com.oop.lab7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Figure> figures = new ArrayList<>();

        Rectangle rectangle = new Rectangle(2, 1);
        Square square = new Square(2);
        Triangle triangle = new Triangle(1,2,3);
        Figure circle = new Figure() {
            double r = 3;

            @Override
            double getArea() {
                return Math.PI * r * r;
            }

            @Override
            double getPerimeter() {
                return 2 * Math.PI * r;
            }

            @Override
            public String toString() {
                return "Circle{" +
                        "r=" + r +
                        '}';
            }
        };

        figures.add(rectangle);
        figures.add(square);
        figures.add(triangle);
        figures.add(circle);

        FigureController figureController = new FigureController();

        System.out.println(figureController.biggestAreaFigure(figures));
        System.out.println(figureController.biggestPerimeterFigure(figures));
    }
}
