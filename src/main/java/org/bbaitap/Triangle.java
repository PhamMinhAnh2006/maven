package org.bbaitap;

import java.io.BufferedReader;
import java.io.FileReader;

public class Triangle implements Calculator{
    private int height;
    private int bottomlength;


    public Triangle(int height, int bottomlength) {
        super();
        this.height = height;
        this.bottomlength = bottomlength;
    }


    @Override
    public String toString() {
        return "dien tich hinh tam giac la" +areaCalulation();
    }


    public double areaCalulation() {
        // TODO Auto-generated method stub
        return (height*bottomlength)/2;
    }
    public void ReadFileCSV() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("filecsv/Triangle.csv"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] split = line.split(",");

                double h = Double.parseDouble(split[0]);
                double b = Double.parseDouble(split[1]);

                double area = (h * b) / 2;
                System.out.println("area: " + area);
            }

            br.close();
        } catch (Exception e) {
            System.out.println("eror"+ e.getMessage());
        }
    }
}



