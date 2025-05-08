package org.bbaitap;

import java.io.BufferedReader;
import java.io.FileReader;

import lombok.Data;
import lombok.ToString;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@ToString
@Data

public class Circle implements IAreaCalculable {
    private double radius;

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
