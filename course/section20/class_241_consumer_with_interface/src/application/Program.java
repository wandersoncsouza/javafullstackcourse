
package application;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import entities.Product;
import util.PriceUpdate;

public class Program{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 90.00));
        list.add(new Product("Teclado", 120.00));
        list.add(new Product("Monitor LCD", 1900.00));
        list.add(new Product("Tablet", 850.00));
        list.add(new Product("Cadeira Gamer", 700.00));
        list.add(new Product("HD Case", 80.90));
        
        // // Implementação com interface
        // list.forEach(new PriceUpdate());
        // // reference method para o println
        // list.forEach(System.out::println);


        // Referencia de metodo estatico
        // list.forEach(Product::staticPriceUpdate);
        // list.forEach(System.out::println);

        // Implementação com método não estatico
        // list.forEach(Product::nonStaticPriceUpdate);
        // list.forEach(System.out::println);


        // expressão lambda declarada
        // Consumer<Product> cons = p -> {
        //     p.setPrice(p.getPrice() * 1.1);
        // };

        // expressão lambda inline
        list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
        list.forEach(System.out::println);
    }
}