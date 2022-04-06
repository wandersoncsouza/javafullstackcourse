package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the max value R$:");
        double max = sc.nextDouble();
        System.out.print("Informe uma letra em maiuscula (Ex:'M'):");
        String letter = sc.next();

        String path = "/Users/wandersoncs/Desktop/Cursos/java/Udemy/nelioalves/javafullstackcourse/course/section20/class_247_exerc/Employee.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            List<Employee> list = new ArrayList<>();

            String line = br.readLine();
            while(line != null){
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
            List<String> names  = list.stream()
                .filter(p -> p.getSalary() > max)
                .map(p -> p.getEmail())
                .sorted(comp)
                .collect(Collectors.toList());

            names.forEach(System.out::println);

            double sum = list.stream()
            .filter(p -> p.getName().charAt(0) == letter.charAt(0))
            .map(p -> p.getSalary())
            .reduce(0.0, (x,y) ->  x + y);
            

            System.out.println("The sum of the names that begins with " + letter + ", is: " + sum);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
