package java_curso.Cap2_estrutura_repetitivas;

import java.util.Scanner;

public class prefer {
    public static void main(String[] args) {
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        while (x != 4) {
            if (x == 1) {
                alcool = alcool + 1;
            } else if (x == 2) {
                gasolina = gasolina + 1;
            } else if (x == 3) {
                diesel = diesel + 1;
            }

            x = sc.nextInt();

        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();

    }

}
