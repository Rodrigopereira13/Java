package java_curso.Cap14_funcional_lambda.P3Function.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import java_curso.Cap14_funcional_lambda.P3Function.entities.Product;

public class Program4 {
    
    public static void main(String[] args) {
        
        
		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		//List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
		//Function<Product, String> func = p -> p.getName().toUpperCase();

		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
        //map aplica a função upercase em todos os elementos de list

		names.forEach(System.out::println);
    }
}
