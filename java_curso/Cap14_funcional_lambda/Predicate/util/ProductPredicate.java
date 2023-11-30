package java_curso.Cap14_funcional_lambda.Predicate.util;

import java.util.function.Predicate;

import java_curso.Cap14_funcional_lambda.Predicate.entities.Product;

public class ProductPredicate implements Predicate<Product>{
	//recebe um argumento e retorna um valor booleano, ou seja, é comumente usado para testar alguma condição.
    
	@Override
	public boolean test(Product p) {     //implimande uma classe com método
		return p.getPrice() >= 100.0;
	}
    
}
