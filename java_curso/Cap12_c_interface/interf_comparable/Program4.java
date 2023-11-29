package java_curso.Cap12_c_interface.interf_comparable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java_curso.Cap12_c_interface.interf_comparable.entities.Employee;

public class Program4 {
    public static void main(String[] args) {
        
        List<Employee> list = new ArrayList<>();
        
        String path = "C:\\temp\\int.txt";
        
        try (BufferedReader br = new BufferedReader(new FileReader(path))) { 
            String employeeCsv = br.readLine(); //leitura do arquivo
            while (employeeCsv != null) { //quando name nao for nulo, add name a list
                String[] fields = employeeCsv.split(","); //recortar o string em 2 por meio da virgula, name e salary
                list.add(new Employee(fields[0], Double.parseDouble(fields[1]))); //add o name que ta na posição 0 e depois na posição 1 em formata double
                employeeCsv = br.readLine();//depois ler a proxima linha
            }
            
            Collections.sort(list); //coloca em ordem alfabetica
            for (Employee emp : list) { 
                System.out.println(emp.getName() + " , " + emp.getSalary());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
