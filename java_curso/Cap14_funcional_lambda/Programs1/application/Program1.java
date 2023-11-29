package java_curso.Cap14_funcional_lambda.Programs1.application;

import java.util.ArrayList;
import java.util.List;

import java_curso.Cap14_funcional_lambda.Programs1.entities.Product;

class Program1 {

    public static void main(String[] args) {
        

            List<Product> list = new ArrayList<>();
    
            list.add(new Product("TV", 900.00));
            list.add(new Product("Notebook", 1200.00));
            list.add(new Product("Tablet", 450.00));
            list.add(new Product("Tablet", 450.00));
            list.add(new Product("Tablet", 450.00));
    
            list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));//função anônima de primeira classe lambda
            //sort para colocar em ordem alfabetica os produtos(p1, p2) usando lambda
    
            for (Product p : list) {
                System.out.println(p);
            }
        
    }
}