package java_curso.Cap6_vetores_listas.Programs1;

import java.util.Locale;
import java.util.Scanner;

public class Program1 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }

        double avg = sum / vect.length;

        System.out.println(avg);

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            if (vect[0].getPrice() > vect[1].getPrice() && vect[0].getPrice() > vect[2].getPrice()){
                System.out.printf("O price maior foi de %.2f%n", vect[0].getPrice());
                
            } else if (vect[1].getPrice() > vect[0].getPrice() && vect[1].getPrice() > vect[2].getPrice()){
                System.out.printf("O price maior foi de %.2f%n", vect[1].getPrice());
            
            }else {
                System.out.printf("O price maior foi de %.2f%n", vect[2].getPrice());
            }
        }
        sc.close();
    }
}
