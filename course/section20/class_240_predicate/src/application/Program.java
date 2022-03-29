package application;

import java.util.ArrayList;
import java.util.List;
import entities.Product;

public class Program {
    public static void main(String[] args) {
        // Fazer um programa que, a partir de uma lista de produtos, remova da lista somente
        // aqueles cujo preço seja 100

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD Case", 80.90));

        // Implementado por instanciação de uma interface funcional
        //list.removeIf(new ProductPredicate());

        // Implementando usando method reference (referencia para método)
        list.removeIf(Product::staticProductPredicate);

        // Predicato por meio de expresão lambda
        //list.removeIf(p -> p.getPrice() >= 100);

        for(Product p : list){
            System.out.println(p);
        }
    }
}
