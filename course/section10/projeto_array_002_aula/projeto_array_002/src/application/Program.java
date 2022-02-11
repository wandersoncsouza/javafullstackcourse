package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert the quantites of product y'd like to insert: ");
        int n = sc.nextInt();                       // Inicia-se um inteiro informando as posições do vetor
        Product[] vect = new Product[n];            // Instancia-se o "vect" em Product[infomando o "n"]

        for(int i=0; i<vect.length; i++){           // Faz um loop (for) para ler as posições dos dados
            sc.nextLine();                          // Limpar a quebra de linha
            String name = sc.nextLine();            // Ler a string, sem indicação de posição
            double price = sc.nextDouble();         // Ler um double, tbm sem indicação de posição
            vect[i] = new Product(name, price);     // Insere no vect[posição] os dados colhidos
        }

        double sum = 0.0;
        for(int i=0; i<vect.length; i++){
            sum += vect[i].getPrice();
        }
        System.out.printf("The sum of %d products is: %.2f", vect.length, sum/vect.length);

        sc.close();
    }
}
