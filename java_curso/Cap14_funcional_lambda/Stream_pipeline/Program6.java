package java_curso.Cap14_funcional_lambda.Stream_pipeline;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program6 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

        Stream<Integer> st1 = list.stream().map(x -> x * 10);
        // pega cada um dos elementos e multiplica por 10
        System.out.println(Arrays.toString(st1.toArray()));

        Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
        // cria uma stream
        System.out.println(Arrays.toString(st2.toArray()));

        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
        // iterar uma stream somando + 2 no elemento
        System.out.println(Arrays.toString(st3.limit(10).toArray()));
        // limitar em 10 se nao vai pro infinito

        //PIPELINE
        int sum = list.stream().reduce(0, (x, y) -> x + y);
        System.out.println("Sum = " + sum);
        // reduce é operação terminal que pega o elementoinical 0 e depois uma função e
        // gera um resultado

        List<Integer> newList = list.stream()
                .filter(x -> x % 2 == 0) //filtra
                .map(x -> x * 10) //passa por todos e multiplica por 10
                .collect(Collectors.toList());
        System.out.println(Arrays.toString(newList.toArray()));
        //Cria um stream de list que filtra em par e depois multiplica por 10 em map e passa pra list
    }
}
