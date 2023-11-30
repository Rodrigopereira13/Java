package java_curso.Cap14_funcional_lambda.Programs5.model.service;

import java.util.List;
import java.util.function.Predicate;

import java_curso.Cap14_funcional_lambda.Programs5.model.entities.Product;

public class ProductService {
    
    public double filteredSum(List<Product> list, Predicate<Product> criteria) {
		//usando predicate na função porque tem uma condição que testa p

		double sum = 0.0;
		
		for (Product p : list) {
			if (criteria.test(p)) {
				sum += p.getPrice();
			}
		}
		return sum;
	}
}
