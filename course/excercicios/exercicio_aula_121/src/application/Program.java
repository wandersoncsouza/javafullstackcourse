package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        
        System.out.println("Enter cliente data");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(name, email, birthDate);
        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), status, client);
        // new Date() -> Instancia a data e hora do sistema

        System.out.print("How many of items to this order: ");
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
                System.out.println("Enter the product data #"+(i+1)+": ");
                System.out.print("Enter the product name: ");
                sc.nextLine();
                String productName = sc.nextLine();
                System.out.print("Enter the product price: ");
                double productPrice = sc.nextDouble();
                System.out.print("Enter the product quantity: ");
                int quantity = sc.nextInt();

                Product product = new Product(productName, productPrice);
                OrderItem it = new OrderItem(quantity, productPrice, product);

                order.addItem(it);
        }
        System.out.println();
        System.out.println(order);
        sc.close();
    }
}
