package org.bbaitap;

import java.io.BufferedReader;
import java.io.FileReader;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@Data
@ToString
public class Triangle implements IAreaCalculable {
    private double height;
    private double bottomLength;


    public double calculateArea() {
        // TODO Auto-generated method stub
        return (height* bottomLength)/2;
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
            System.out.println("eror" + e.getMessage());
        }
    }
}



