package java_curso.generics_set_get.ProgramXExerc.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import java_curso.generics_set_get.ProgramXExerc.entities.LogEntry;;

public class ProgramXExerc {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            
            Set<LogEntry> set = new HashSet<>();//tipo set pq nao importa a ordem e nao deixa repetir o dado

            String line = br.readLine();//lê cada linha do arquivo
            while (line != null){ //enquanto essa linha for diferente do nulo
                
                String[] fields = line.split(" "); //recortar a string no ""(espaço em branco)
                String username = fields[0];
                Date moment = Date.from(Instant.parse(fields[1]));

                set.add(new LogEntry(username, moment)); // o propria estrutura de dado set vai impedir o dado repetido
                line = br.readLine();
            }

            System.out.println("Total users: " + set.size()); //imprimir o tamanho do set que é o numero de usuario

        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }

        sc.close();
    }
}
