import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class App {
    public static void main(String[] args){
        String[] lines = new String[] {"Aula de Java Avançado", "Prof. Nélio Alves", "Aula 186 - FileWriter and BufferedWriter"};

        String path = "/Users/wandersoncs/Desktop/Cursos/java/Udemy/nelioalves/javafullstackcourse/course/section17/class_186_FileWriter_BufferedWriter/src/file.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){         // ... new FileWriter(path) - cria o arquivo / ... new FileWriter(path, true) - recria o arquivo com dados adcionais
            for(String line : lines){
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
