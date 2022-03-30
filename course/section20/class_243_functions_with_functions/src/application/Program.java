
package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import entities.Product;
import util.ProductService;

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
        
        ProductService ps = new ProductService();
        double sum = ps.filteredSum(list);
        System.out.println("Sum = " + String.format("%.2f", sum));

    }
}