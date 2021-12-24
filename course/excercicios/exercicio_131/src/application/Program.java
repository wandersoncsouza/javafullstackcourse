package application;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of product(s):");
        int num = sc.nextInt();

        for(int i=1; i<= num; i++){
            System.out.println("Product #"+ i + " data:");
            System.out.print("Common, used or imported (c/u/i)?: ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            if(ch == 'u'){
                System.out.print("Manufactured Date (DD/MM/YYYY): ");
                Date date = sdf.parse(sc.next());
                list.add(new UsedProduct(name, price, date));
            }
            else if(ch == 'i'){
                System.out.print("Customs fee: ");
                Double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customsFee));
            }else{
                list.add(new Product(name, price));
            }
        }
        System.out.println();
        System.out.println("PRICE TAG");
        for(Product prod: list){
            System.out.println(prod.priceTag());
        }



        sc.close();
    }
}
