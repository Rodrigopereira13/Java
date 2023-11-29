package java_curso.Cap11_arquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        
        File file = new File("C:\\temp\\in.txt.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        finally{
            if(sc != null){
                sc.close();
            }
        }

    }
}
