package org.bbaitap;

import java.io.BufferedReader;
import java.io.FileReader;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@Data
@ToString
public class Square implements IAreaCalculable {
    private double edge;


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
