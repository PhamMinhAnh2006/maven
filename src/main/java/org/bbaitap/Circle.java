package org.bbaitap;

import java.io.BufferedReader;
import java.io.FileReader;

public class Circle implements IAreaCalculable {
    private double radius;

    public Circle(int radius) {
        super();
        this.radius = radius;
    }


    @Override
    public String toString() {
        return "dien tich hinh tron la; " + calculateArea();
    }


    public double calculateArea() {
        // TODO Auto-generated method stub
        return radius*radius*Math.PI;
    }


    public void ReadFileCSV() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("filecsv/Circle.csv"));
            String line;
            while ((line = br.readLine()) != null) {
                double r = Double.parseDouble(line);
                double areaCircle = Math.PI * r * r;
                System.out.println("areaCircle: " + areaCircle);
            }

            br.close();
        } catch (Exception e) {
            System.out.println("eror" + e.getMessage());
        }
    }

}
