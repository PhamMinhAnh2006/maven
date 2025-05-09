package org.bbaitap;

import java.util.ArrayList;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        log.info("Program started.");

        Square Square1 = new Square(20);
        Triangle Triangle1 = new Triangle(2, 4);
        Circle Circle1 = new Circle(5);

        log.debug("Created shape instances: Square, Triangle, Circle.");

        double squareArea = Square1.calculateArea();
        double triangleArea = Triangle1.calculateArea();
        double circleArea = Circle1.calculateArea();

        log.info("Square area: {}", squareArea);
        log.info("Triangle area: {}", triangleArea);
        log.info("Circle area: {}", circleArea);

        try {
            Triangle1.ReadFileCSV();
            Square1.ReadFileCSV();
            Circle1.ReadFileCSV();
            log.info("CSV files read successfully.");
        } catch (Exception e) {
            log.error("Error reading CSV files: {}", e.getMessage(), e);
        }

        printCustomArea(Square1);
        printCustomArea(Triangle1);
        printCustomArea(Circle1);

        ArrayList<String> circleList = new ArrayList<>();
        log.warn("circleList is currently empty: {}", true);

        Square.readFileCSV();
        Circle.readFileCSV();
        Triangle.readFileCSV();
    }

    public static void printCustomArea(IAreaCalculable shape) {
        System.out.println("Custom " + shape.calculateArea());

        }





}