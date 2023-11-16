package java_curso.arquivos;

import java.io.File;
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
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        finally{
            if(sc != null){
                sc.close();
            }
        }

    }
}
