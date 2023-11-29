package java_curso.Cap13_generics_set_get.ProgramsMap.Programs2.application;

import java.util.HashMap;
import java.util.Map;

import java_curso.Cap13_generics_set_get.ProgramsMap.Programs2.entities.Product;

public class Program2 {

    public static void main(String[] args) {
        
        Map<Product, Double> stock = new HashMap<>();
        
        Product p1 = new Product("Tv", 900.0);
        Product p2 = new Product("Notebook", 1200.0);
        Product p3 = new Product("Tablet", 400.0);
        
        stock.put(p1, 10000.0);
        stock.put(p2, 20000.0);
        stock.put(p3, 15000.0);
        
        Product ps = new Product("Tv", 900.0);
        
        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));

        System.out.println("ALL stock:");
        for (Product key : stock.keySet()) {
            System.out.println(key + ": " + stock.get(key)); //imprimindo todos as keys
        }
    }
}
