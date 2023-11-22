package java_curso.c_interface.Programs4.application;

import java.util.Locale;
import java.util.Scanner;

import java_curso.c_interface.Programs4.services.BrazilInterestService;
import java_curso.c_interface.Programs4.services.InterestService;

public class Program4 {
    public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();
		
		InterestService is = new BrazilInterestService(2.0);
		double payment = is.payment(amount, months);
		
		System.out.println("Payment after " + months + " months:");
		System.out.println(String.format("%.2f", payment));
		
		sc.close();
	}
}
