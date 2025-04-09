package org.bbaitap;

import java.io.BufferedReader;
import java.io.FileReader;

public class Square implements Calculator{
    private int edge;

    public Square(int edge) {
        super();
        this.edge = edge;
    }


    @Override
    public String toString() {
        return  "dien tich hinh vuong la:" + areaCalulation();
    }


    public double areaCalulation() {
        // TODO Auto-generated method stub
        return edge*edge;
    }

    public static void ReadFileCSV(String file) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("filecsv/Square.csv"));
            String dong;
            while ((dong = br.readLine()) != null) {
                double canh = Double.parseDouble(dong);
                double areaSquare = canh * canh;
                System.out.println("areaSquare: " + areaSquare);
            }

            br.close();
        } catch (Exception e) {
            System.out.println("eror");
        }
    }


}
