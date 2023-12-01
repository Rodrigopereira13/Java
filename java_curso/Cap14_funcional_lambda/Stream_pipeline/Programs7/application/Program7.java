package java_curso.Cap14_funcional_lambda.Stream_pipeline.Programs7.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import java_curso.Cap14_funcional_lambda.Stream_pipeline.Programs7.entities.Product;

public class Program7 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter full file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Product> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            double avg = list.stream()
                    .map(p -> p.getPrice()) // pega os preços
                    .reduce(0.0, (x, y) -> x + y) / list.size();// faz a sumatoria

            System.out.println("Average price: " + String.format("%.2f", avg));
        
            
            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase()); //comparar 2 string
            List<String> names = list.stream()
                        .filter(p -> p.getPrice() < avg)//filtra se o preço for menor que avg
                        .map(p -> p.getName()) //pega os nomes
                        .sorted(comp.reversed())//em ordem decresente 
                        .collect(Collectors.toList());//stream para list
            names.forEach(System.out::println);
        
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
