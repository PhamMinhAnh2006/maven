package org.bbaitap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            Square hinhvuong = new Square(20);
            Triangle hinhtamgiac = new Triangle(2, 4);
            Circle hinhtron = new Circle(5);

            System.out.println(hinhvuong.areaCalulation());
            System.out.println(hinhtamgiac.areaCalulation());
            System.out.println(hinhtron.areaCalulation());

        }



}