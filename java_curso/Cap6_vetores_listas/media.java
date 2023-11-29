package java_curso.Cap6_vetores_listas;

import java.util.Locale;
import java.util.Scanner;

public class media {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("digite os numeros de vetores");
        int n = sc.nextInt();
        double[] vect = new double[n];
        
        for (int i = 0; i < vect.length; i++) {
            vect[i] = sc.nextDouble();
        }
        
        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i];
        }
        
        double avg = sum / vect.length;
        System.out.printf("AVERAGE PRICE = %.2f%n", avg);
        sc.close();
    }

}
