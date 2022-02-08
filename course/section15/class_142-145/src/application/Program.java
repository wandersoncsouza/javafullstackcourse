package application;

import java.util.Date;
import java.rmi.UnexpectedException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import entities.Reservation;
import exceptions.DomainException;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try{
            System.out.print("Enter the number of room: ");
            int roomNumber = sc.nextInt();
            System.out.print("Enter the date of check-in (dd/MM/yyyy): ");
            Date checkin = sdf.parse(sc.next());
            System.out.print("Enter the date of check-out (dd/MM/yyyy): ");
            Date checkout = sdf.parse(sc.next());

            Reservation reservation = new Reservation(roomNumber, checkin, checkout);
            System.out.println("Reservation " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.print("Enter the date of check-in (dd/MM/yyyy): ");
            checkin = sdf.parse(sc.next());
            System.out.print("Enter the date of check-out (dd/MM/yyyy): ");
            checkout = sdf.parse(sc.next());

            reservation.updateDates(checkin, checkout);
            System.out.println("Reservation: " + reservation);
        }
        catch(ParseException e){
            System.out.println("Invalid date format.");
        }
        catch(DomainException e){
            System.out.println("Error in reservation: " + e.getMessage());
        }catch(RuntimeException e){
            System.out.println("Unexpected Error");
        }
        sc.close();
    
    }
}
