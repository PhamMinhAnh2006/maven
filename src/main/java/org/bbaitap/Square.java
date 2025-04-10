package org.bbaitap;

import java.io.BufferedReader;
import java.io.FileReader;

public class Square implements IAreaCalculable {
    private double edge;

    public Square(int edge) {
        super();
        this.edge = edge;
    }


    @Override
    public String toString() {
        return  "dien tich hinh vuong la:" + calculateArea();
    }


    public double calculateArea() {
        // TODO Auto-generated method stub
        return edge*edge;
    }

    public void ReadFileCSV() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("filecsv/Square.csv"));
            String line;
            while ((line = br.readLine()) != null) {
                double edge = Double.parseDouble(line);
                double areaSquare = edge * edge;
                System.out.println("areaSquare: " + areaSquare);
            }

            br.close();
        } catch (Exception e) {
            System.out.println("eror"+ e.getMessage());
        }
    }


}
