package java_curso.Cap13_generics_set_get.Programs3;

import java.util.Arrays;
import java.util.List;

public class Program3 {
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);

        List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
        printList(myStrs);
    }

    public static void printList(List<?> list) {    // tipo curinga ? 
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
