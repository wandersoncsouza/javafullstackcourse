/*
    Sobrecarga é disponibilizar varias versões do mesmo construtor
    Ex: linha 24 inicializando o construtor somente com 2 parâmetros
*/

package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {
    public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);
     
        System.out.println("Enter product data: ");
        System.out.print("Name of product: ");
        String name = sc.nextLine();

        System.out.print("Price of product: ");
        double price = sc.nextDouble();

        Product product = new Product(name, price);

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
