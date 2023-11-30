package java_curso.Cap14_funcional_lambda.Programs5.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import java_curso.Cap14_funcional_lambda.Programs5.model.entities.Product;
import java_curso.Cap14_funcional_lambda.Programs5.model.service.ProductService;

public class Program5 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		ProductService ps = new ProductService();
		
		double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
        //chama a função que vai testar se p começa com T irá somar os prices
		
        System.out.println("Sum = " + String.format("%.2f", sum));
    }
}
