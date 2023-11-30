package java_curso.Cap14_funcional_lambda.Consumer.util;

import java.util.function.Consumer;

import java_curso.Cap14_funcional_lambda.Consumer.entities.Product;

public class PriceUpdate implements Consumer<Product>{ //interface com o método accept
	//recebe um argumento e realiza alguma operação sobre ele, no caso vai realizar uma ação no Product
    
    @Override
	public void accept(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}
}
