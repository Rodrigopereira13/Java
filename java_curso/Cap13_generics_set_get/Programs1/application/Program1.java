package java_curso.Cap13_generics_set_get.Programs1.application;

import java.util.Scanner;

import java_curso.Cap13_generics_set_get.Programs1.services.PrintService;

public class Program1 {
    	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PrintService<Integer> ps = new PrintService<>(); //para mudar o tipo para String mudar o <>
		                                            //usando generics é melhor para reuso, type safety e permance
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			Integer value = sc.nextInt();
			ps.addValue(value);
		}

		ps.print();
		Integer x = ps.first();
		System.out.println("First: " + x);
		
		sc.close();
	}
}
