package application;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installments;
import service.ContractService;
import service.PaypalService;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter the contract data: ");
        System.out.print("Insert the number: ");
        Integer number = sc.nextInt();
        System.out.print("Date (dd/MM/yyyy): ");
        Date date = sdf.parse(sc.next());
        System.out.print("Contract value: ");
        Double totalValue = sc.nextDouble();
        System.out.print("Enter the number of installments: ");
        int installments = sc.nextInt();

        Contract contract = new Contract(number, date, totalValue);
        ContractService cs = new ContractService(new PaypalService());
        cs.processContract(contract, installments);

        System.out.println();
        System.out.print("INSTALLMENTS:");
        System.out.println();
        for(Installments it : contract.getInstallments()){
            System.out.println(it);
        }
        sc.close();
        // CRÉDITS:
        // CURSO JAVA AVANÇADO - PROF. NÉLIO ALVES
        // GitHub: github.com/devsuperior/aulao008
    }
}
