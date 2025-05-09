package org.bbaitap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.util.List;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import lombok.Data;
import lombok.ToString;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@ToString
@Data
public class Circle implements IAreaCalculable {
 feature-add-functionv6
    @CsvBindByName(column = "radius")
 main
    private double radius;

    public double calculateArea() {
        // TODO Auto-generated method stub
        return radius*radius*Math.PI;
    }

    public Circle() {

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
    public static void readFileCSV() {
        try (Reader reader = new FileReader("filecsv/Circle.csv")) {

            CsvToBean<Circle> csvToBean = new CsvToBeanBuilder<Circle>(reader)
                    .withType(Circle.class).build();

            List<Circle> circles = csvToBean.parse();


            for (Circle cl : circles) {
                System.out.println("Radius: " + cl.getRadius() + " | Area: " + cl.calculateArea());
            }

        } catch (Exception e) {
            System.out.println("Error reading CSV: " + e.getMessage());
        }


    }

}
