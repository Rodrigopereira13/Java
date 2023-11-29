package java_curso.Cap14_funcional_lambda.Predicate.application;

import java.util.ArrayList;
import java.util.List;

import java_curso.Cap14_funcional_lambda.Predicate.entities.Product;

public class Program2 {
    
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		double min = 100.0;

		list.removeIf(p -> p.getPrice() >= min);   //lambda em line, remove p se o preço for > que 100

		for (Product p : list) {
			System.out.println(p);
		}
    }
}
