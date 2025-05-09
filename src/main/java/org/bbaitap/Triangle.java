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
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@Data
@ToString
@NoArgsConstructor

public class Triangle implements IAreaCalculable {
    @CsvBindByName(column = "height")
    private double height;
    @CsvBindByName(column = "bottomlength")
    private double bottomLength;


    public double calculateArea() {
        // TODO Auto-generated method stub
        return (height * bottomLength) / 2;
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

    public static void readFileCSV() {
        try (Reader reader = new FileReader("filecsv/Triangle.csv")) {

            CsvToBean<Triangle> csvToBean = new CsvToBeanBuilder<Triangle>(reader)
                    .withType(Triangle.class).build();

            List<Triangle> triangles = csvToBean.parse();


            for (Triangle tg : triangles) {
                System.out.println("BottomLength: " + tg.getBottomLength() + "| Height; " + tg.getHeight() + " | Area: " + tg.calculateArea());
            }

        } catch (Exception e) {
            System.out.println("Error reading CSV: " + e.getMessage());
        }
    }
}


