package java_curso.generics_set_get.ProgramSet.Programs1.application;

import java.util.HashSet;
import java.util.Set;

import java_curso.generics_set_get.ProgramSet.Programs1.entities.Product;

public class Program1 {

    public static void main(String[] args) {
        
        Set<Product> set = new HashSet<>();
        set.add(new Product("TV", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));
        
        Product prod = new Product("Notebook", 1200.0);//com hascode e equals fez a verificação por conteudo
        
        System.out.println(set.contains(prod));
    }
}
