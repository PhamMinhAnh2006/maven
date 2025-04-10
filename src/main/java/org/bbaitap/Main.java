package org.bbaitap;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            Square square1 = new Square(20);
            Triangle triangle1 = new Triangle(2, 4);
            Circle circle1 = new Circle(5);

            System.out.println(square1.calculateArea());
            System.out.println(triangle1.calculateArea());
            System.out.println(circle1.calculateArea());

        triangle1.ReadFileCSV();
        square1.ReadFileCSV();
        circle1.ReadFileCSV();

        printCustomArea(square1);
        printCustomArea(triangle1);
        printCustomArea(circle1);

        ArrayList<String> circleList = new ArrayList<>();




        }

    public static void printCustomArea(IAreaCalculable shape) {
        System.out.println("Custom " + shape.calculateArea());

    }





}