package java_curso.Cap14_funcional_lambda.Programs1.application;

import java.util.Comparator;

import java_curso.Cap14_funcional_lambda.Programs1.entities.Product;

public class Mycomparator implements Comparator<Product>{
    @Override
	public int compare(Product p1, Product p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}
}
