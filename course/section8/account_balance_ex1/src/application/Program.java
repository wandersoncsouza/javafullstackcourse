package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Balance;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Balance account;

            System.out.println("Enter account data below: ");
            System.out.print("Enter of the number account: ");
            int number = sc.nextInt();

            System.out.print("Enter the name of account " + number + ": ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print(name + " , is this the initial deposit (y/n)? ");
            char initial = sc.next().charAt(0);
        
            if(initial == 'y'){
                System.out.print("Enter the initial value: ");
                double initialSaldo = sc.nextDouble();
                account = new Balance(number, name, initialSaldo);
            }else{
                account = new Balance(number, name);
            }

            System.out.println();
            System.out.println("Acconunt data is: " + account);

            System.out.print(name + " Enter a deposit value in the account " + number + ": ");
            double depositValue = sc.nextDouble();
            account.deposit(depositValue);
            System.out.println("Acconunt data was updated: " + account);

            System.out.print(name + " Enter a value withdraw in the account " + number + ": ");
            double valueWithdraw = sc.nextDouble();
            account.withdraw(valueWithdraw);
            System.out.println("Acconunt data was uodated: " + account);

        sc.close();
    }
}
