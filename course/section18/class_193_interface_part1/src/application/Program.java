package application;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.CarRental;
import entities.Vehicle;
import service.BrasilTaxService;
import service.RentalService;

public class Program {
    public static void main(String[] args) throws ParseException{
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");

        System.out.println("Enter rental data: ");
        System.out.print("Car model: ");
        String carModel = sc.nextLine();
        System.out.print("Pickup (dd/MM/yyyy hh:ss): ");
        Date start = sdf.parse(sc.nextLine());
        System.out.print("Return (dd/MM/yyyy hh:ss): ");
        Date finish = sdf.parse(sc.nextLine());

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        System.out.print("Insert the price per hour: ");
        Double pricePerHour = sc.nextDouble();
        System.out.print("Insert the price per day: ");
        Double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrasilTaxService());
        rentalService.processInvoice(cr);

        System.out.println();
        System.out.println("INVOICE: ");
        System.out.print("Basic Payment: " + String.format("%.2f%n", cr.getInvoice().getBasicPayment()));
        System.out.print("Tax: " + String.format("%.2f%n", cr.getInvoice().getTax()));
        System.out.print("Total Payment: " + String.format("%.2f%n", cr.getInvoice().getTotalPayment()));
    }
}
