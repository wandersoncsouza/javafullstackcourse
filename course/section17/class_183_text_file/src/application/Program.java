package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        File file = new File("/Users/wandersoncs/Desktop/Cursos/java/Udemy/nelioalves/javafullstackcourse/course/section17/class_183_text_file/src/file.txt");
        Scanner sc = null;

        try{
            sc = new Scanner(file);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }finally{
            if(sc != null){
                sc.close();
            }
        }
    }
}
