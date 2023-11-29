package java_curso.Cap11_arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program3 {
    
    public static void main(String[] args) {
        

        String[] lines = new String[]{"good morning", "good afternoon", "good night"};
        String path = "C:\\temp\\out.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {//true para nao recriar o arquivo, apresenta mais strings
            for (String line : lines){ //para string line contida no vetor lines
                bw.write(line); //escreve a string no arquivo
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
