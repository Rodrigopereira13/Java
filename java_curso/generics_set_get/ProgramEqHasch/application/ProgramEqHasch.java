package java_curso.generics_set_get.ProgramEqHasch.application;

import java_curso.generics_set_get.ProgramEqHasch.entities.Client;

public class ProgramEqHasch {
    public static void main(String[] args) {
        
        Client c1 = new Client ("Maria", "maria@gmail.com");
        Client c2 = new Client ("Maria", "maria@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2)); //comparar o conteudo do objeto
        System.out.println(c1 == c2); //vai da false pq sao 2 objetos diferentes alocado na memória
    }

}
