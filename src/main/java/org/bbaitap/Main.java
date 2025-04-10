package org.bbaitap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            Square Square1 = new Square(20);
            Triangle Triangle1 = new Triangle(2, 4);
            Circle Circle1 = new Circle(5);

            System.out.println(Square1.areaCalulation());
            System.out.println(Triangle1.areaCalulation());
            System.out.println(Circle1.areaCalulation());

        Triangle1.ReadFileCSV();
        Square1.ReadFileCSV();
        Circle1.ReadFileCSV();


        }



}