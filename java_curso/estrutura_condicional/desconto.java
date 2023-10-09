package java_curso.estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class desconto {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o preço da mercadoria: ");
        double preco = sc.nextDouble();
        double desc;

        desc = (preco < 20.00) ? preco * 0.01 : preco * 0.05;
        System.out.printf("O valor do desconto: %.2f%n", desc);

        sc.close();

    
    }
    
}
