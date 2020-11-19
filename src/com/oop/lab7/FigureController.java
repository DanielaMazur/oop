package com.oop.lab7;

import java.util.ArrayList;

public class FigureController {
    Figure biggestAreaFigure(ArrayList<Figure> figures){
        Figure maxAreaFigure = figures.get(0);

        for(Figure figure : figures){
            if(figure.getArea() > maxAreaFigure.getArea()){
                maxAreaFigure = figure;
            }
        }

        return maxAreaFigure;
    }

    Figure biggestPerimeterFigure(ArrayList<Figure> figures){
        Figure maxPerimeterFigure = figures.get(0);

        for(Figure figure : figures){
            if(figure.getPerimeter() > maxPerimeterFigure.getPerimeter()){
                maxPerimeterFigure = figure;
            }
        }

        return maxPerimeterFigure;
    }
}
