package java_curso.Cap13_generics_set_get.ProgramSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProgramSet {
    public static void main(String[] args) {

        System.out.println("tipo HashSet");

        Set<String> set = new HashSet<>();// implementação mais rapida, nao garante a ordem

        set.add("Tv"); // adc 3 elementos no set tipo String
        set.add("Notebook");
        set.add("Tablet");
        System.out.println(set.contains("Notebook")); // teste se existe o elemtno notebook
        //set.removeIf(x -> x.length() >= 3) remove o elemento x tal que x for maior que 3
        
        for (String p : set) { // imprimir todos os elementos
            System.out.println(p);
        }
        System.out.println();
        System.out.println("tipo Treeset");
        
        Set<String> treeS = new TreeSet<>();// implementação mais lenta mas garante a ordenação

        set.add("Tv"); // adc 3 elementos
        set.add("Notebook");
        set.add("Tablet");

        for (String t : treeS) {
            System.out.println(t);
        }

        System.out.println();
        System.out.println("tipo Treeset");
        
        Set<String> linkedHash = new LinkedHashSet<>();// implementação mais lenta que Hash set mais mantém a ordem 

        set.add("Tv"); // adc 3 elementos
        set.add("Notebook");
        set.add("Tablet");

        for (String l : linkedHash) {
            System.out.println(l);
        }
    }
}
