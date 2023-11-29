package java_curso.Cap14_funcional_lambda.Consumer.util;

import java.util.function.Consumer;

import java_curso.Cap14_funcional_lambda.Consumer.entities.Product;

public class PriceUpdate implements Consumer<Product>{ //interface com o método accept
    
    @Override
	public void accept(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}
}
