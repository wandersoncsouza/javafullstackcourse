import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite uma certa quantidade de nomes:");
            String [] vect = sc.nextLine().split(" ");
            System.out.print("Informe uma posição para buscar o nome: ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Você informou uma posição inválida! Favor confira.");
        } catch (InputMismatchException e){
            System.out.println("Você informou um dado inválido! Favor confira.");
        }
        System.out.println("Fim do programa.");

    }
}
