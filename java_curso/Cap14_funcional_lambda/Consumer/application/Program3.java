package java_curso.Cap14_funcional_lambda.Consumer.application;

import java.util.ArrayList;
import java.util.List;

import java_curso.Cap14_funcional_lambda.Consumer.entities.Product;

public class Program3 {
    
    public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		double factor = 1.1;
		
		list.forEach(p -> p.setPrice(p.getPrice() * factor)); //passa por todos os p, retorna o preço de p . 1.1 

		list.forEach(System.out::println); //refence metodo para println
	}
}

