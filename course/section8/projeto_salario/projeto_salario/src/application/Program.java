package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        
        System.out.println("Enter employee data: ");
        System.out.print("Digit name of the employee: ");
        employee.name = sc.nextLine();

        System.out.printf("Digit the salary of the %s: ", employee.name);
        employee.grossSalary = sc.nextDouble();
        
        System.out.printf("Percent tax of %s's wage: ", employee.name);
        employee.tax = sc.nextDouble();

        System.out.println();
        System.out.printf("The %s data wage is:", employee.name);
        System.out.println(employee);

        System.out.printf("Digit the percent increase of the %s wage: ", employee.name);
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        
        System.out.println();
        System.out.printf("The %s data wage was updated to: ", employee.name);
        System.out.println(employee);
        
        sc.close();
    }
}
