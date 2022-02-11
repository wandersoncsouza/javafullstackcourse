/*
    Repetição do projeto estoque com uso de contrutor
*/

package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {
    public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);

       // Quando executamos o comando abaixo (**), instanciamos um produto "product" com seus atributos "vazios"
       // name = "null", price = "0.0" e quantity = "0"
       //** Product product = new Product();
     
        System.out.println("Enter product data: ");
        System.out.print("Name of product: ");
        String name = sc.nextLine();

        System.out.print("Price of product: ");
        double price = sc.nextDouble();

        System.out.print("Quantity of product: ");
        int quantity = sc.nextInt();

        // Chamada do construtor abaixo, que já recebe as váriaveis com valores informados acima
        Product product = new Product(name, price, quantity);

        System.out.println();
        System.out.println("Product data is: " + product);
        
        System.out.println();
        System.out.print("Enter the number of products you'd like add in stock: ");
        quantity = sc.nextInt();
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
