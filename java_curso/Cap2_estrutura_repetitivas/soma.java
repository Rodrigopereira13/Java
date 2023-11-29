package java_curso.Cap2_estrutura_repetitivas;

import java.util.Scanner;

public class soma {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int somar = 0;

        System.out.println("Digite um numero: ");

        while (x != 0){
            somar += x;
            x = sc.nextInt();

        }

        System.out.println(somar);

        sc.close();


    }
}
