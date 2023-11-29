package java_curso.Cap13_generics_set_get.ProgramTreeSet.application;

import java.util.Set;
import java.util.TreeSet;

import java_curso.Cap13_generics_set_get.ProgramTreeSet.entities.Product;

public class ProgramTreeSet {
    public static void main(String[] args) {
        
        Set<Product> set = new TreeSet<>();//no Tree set tem que implementar comparable na classe 
        
        set.add(new Product("TV", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));
        
        for (Product p : set) {
            System.out.println(p);
        }
    }
}
