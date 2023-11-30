package java_curso.Cap14_funcional_lambda.P3Function.util;

import java.util.function.Function;

import java_curso.Cap14_funcional_lambda.P3Function.entities.Product;

public class UpperCaseName implements Function<Product, String>{  //product é o argumento e String é a saida ou novo resultado
    //aceita um argumento do tipo especificado e retorna um valor do tipo especificado.

    @Override
    public String apply(Product p) { //apply function
        return p.getName().toUpperCase();
    }
    

}
