package org.bbaitap;

import java.io.BufferedReader;
import java.io.FileReader;

public class Circle implements Calculator{
    private int radius;

    public Circle(int radius) {
        super();
        this.radius = radius;
    }


    @Override
    public String toString() {
        return "dien tich hinh tron la; " + areaCalulation();
    }


    public double areaCalulation() {
        // TODO Auto-generated method stub
        return radius*radius*Math.PI;
    }


    public static void ReadFileCSV(String file) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("filecsv/Circle.csv"));
            String dong;
            while ((dong = br.readLine()) != null) {
                double r = Double.parseDouble(dong);
                double areaCircle = Math.PI * r * r;
                System.out.println("areaCircle: " + areaCircle);
            }

            br.close();
        } catch (Exception e) {
            System.out.println("eror");
        }
    }

}
