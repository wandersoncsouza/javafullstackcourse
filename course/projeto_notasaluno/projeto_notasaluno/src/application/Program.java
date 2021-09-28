package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        

        System.out.println("Entre com o nome do aluno: ");
        student.name = sc.nextLine();

        System.out.printf("Entre com a nota 1 do primeiro trimestre de %s: ", student.name);
        student.nota1 = sc.nextInt();

        System.out.printf("Entre com a nota 2 do primeiro trimestre de %s: ", student.name);
        student.nota2 = sc.nextInt();

        System.out.printf("Entre com a nota 3 do primeiro trimestre de %s: ", student.name);
        student.nota3 = sc.nextInt();

        System.out.println(student);
        student.passOrOver();

        sc.close();
    }
}
