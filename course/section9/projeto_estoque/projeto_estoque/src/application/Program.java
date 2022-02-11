package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {
    public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);

       Product product = new Product();
     
        System.out.println("Enter product data: ");
        System.out.print("Name of product: ");
        product.name = sc.nextLine();
        System.out.print("Price of product: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity of product: ");
        product.quantity = sc.nextInt();

        System.out.println();
        System.out.println("Product data is: " + product);

        System.out.println();
        System.out.print("Enter the number of products you'd like add in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Update product data is: " + product);

        System.out.println();
        System.out.print("Enter the number of products you'd like remove in stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Update product data is: " + product);

       
       sc.close();
    }
}
