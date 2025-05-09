package org.bbaitap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.util.List;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@Data
@ToString

public class Square implements IAreaCalculable {
    @CsvBindByName(column = "edge")
    private double edge;

 feature-add-functionv6
    public Square() {

    }

main

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

    //parse object
    public static void readFileCSV() {
        try (Reader reader = new FileReader("filecsv/Square.csv")) {

            CsvToBean<Square> csvToBean = new CsvToBeanBuilder<Square>(reader)
                    .withType(Square.class).build();

            List<Square> squares = csvToBean.parse();


            for (Square sq : squares) {
                System.out.println("Edge: " + sq.getEdge() + " | Area: " + sq.calculateArea());
            }

        } catch (Exception e) {
            System.out.println("Error reading CSV: " + e.getMessage());
        }


    }

}




