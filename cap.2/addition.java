import java.util.Scanner;

public class addition {

    public static void main(String[] args)
    {
        Scanner escreve = new Scanner(System.in);

        int number1;
        int number2;
        int sum;

        System.out.print("Enter first integer: ");
        number1 = escreve.nextInt();

        System.out.print("Enter second integer: ");
        number2  = escreve.nextInt();

        sum = number1 + number2;

        System.out.printf("Sum is %d%n", sum);

        escreve.close();
    }
    
}
