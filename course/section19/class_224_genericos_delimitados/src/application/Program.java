package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import services.CalculationService;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        
        List<Product> list = new ArrayList<>();
        String path = "/Users/wandersoncs/Desktop/Cursos/java/Udemy/nelioalves/javafullstackcourse/course/section19/class_224_genericos_delimitados/src/text.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            
            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(",");
                //list.add(Integer.parseInt(line));
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            //Integer x = CalculationService.max(list);
            Product x = CalculationService.max(list);
            System.out.print("Max: ");
            System.out.print(x);
            System.out.println();
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
