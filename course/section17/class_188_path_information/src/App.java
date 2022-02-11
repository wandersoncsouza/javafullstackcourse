import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a file path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);
        System.out.println("Nome: " + path.getName());
        System.out.println("Nome: " + path.getParent());
        System.out.println("Nome: " + path.getPath());


        sc.close();
    }
}
