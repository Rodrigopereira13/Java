package java_curso.generics_set_get.Programs2.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import java_curso.generics_set_get.Programs2.entities.Product;
import java_curso.generics_set_get.Programs2.services.CalculationService;

public class Program2 {
    public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();  //cria uma lista do tipo produto

		String path = "C:\\temp\\metgenerics.txt"; //coloca o caminho na variavel

		try (BufferedReader br = new BufferedReader(new FileReader(path))) { //lê o arquivo

			String line = br.readLine();  //lê a linha
			while (line != null) {      //quando a linha for diferente que null
				String[] fields = line.split(",");   //separar por virgula
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			Product x = CalculationService.max(list);
			System.out.println("Most expensive:");
			System.out.println(x);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} 
	}
}
