package java_curso.Cap11_arquivos;

import java.io.File;
import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a file path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        System.out.println("getName: " + path.getName());//o nome do arquivo no caminho
        System.out.println("getParent: " + path.getParent());//o caminho do arquivo
        System.out.println("getParent: " + path.getParent());//o caminho completo com arquivo.
        
        sc.close();
    }
}
