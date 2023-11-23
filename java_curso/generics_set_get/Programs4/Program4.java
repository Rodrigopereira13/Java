package java_curso.generics_set_get.Programs4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program4 {
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObjs = new ArrayList<Object>();
        copy(myInts, myObjs);
        printList(myObjs);
        copy(myDoubles, myObjs);
        printList(myObjs);
    }

    public static void copy(List<? extends Number> source, List<? super Number> destiny) { //a lista de origem extende de qualquer subtipo number 
        for (Number number : source) {        //sendo subtipo de number posso acessar      //a lista de destino pode ser qualquer super tipo de number
            destiny.add(number);             //sendo o supertipo de number posso adcionar
        }
    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}