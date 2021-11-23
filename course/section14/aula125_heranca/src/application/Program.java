package application;

import entities.*;


public class Program {
    public static void main(String[] args) {
        
    //    Account acc = new Account(1001, "Wanderson", 0.0);
    //    BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);


    //    // UPCASTING 
    //    Account acc1 = bacc;
    //    Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
    //    Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        Account acc1 = new Account(1001, "Wanderson", 2495.0);
        acc1.withDraw(200.0);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        acc2.withDraw(200.0);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        acc3.withDraw(200.0);
        System.out.println(acc3.getBalance());
    }
}
