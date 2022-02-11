import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        //Listando pastas
        File path = new File(strPath);
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS:");
        for (File folder : folders){
            System.out.println(folder);
        }
        //Listando arquivos
        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES:");
        for(File file : files){
            System.out.println(file);
        }
        // Criando subpasta
        boolean success = new File(strPath + "/created").mkdir();
        System.out.println("Directory created with success: " + success);


        sc.close();
    }

}
