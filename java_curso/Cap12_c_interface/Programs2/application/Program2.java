package java_curso.Cap12_c_interface.Programs2.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import java_curso.Cap12_c_interface.Programs2.entities.Contract;
import java_curso.Cap12_c_interface.Programs2.entities.Installment;
import java_curso.Cap12_c_interface.Programs2.services.ContractService;
import java_curso.Cap12_c_interface.Programs2.services.PaypalService;


public class Program2 {
    
    public static void main(String[] args) {
        
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);


       DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato:");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.print("Valor do contrato: ");
		double totalValue = sc.nextDouble();
		
		Contract obj = new Contract(number, date, totalValue);//cria o objeto contrato
		
		System.out.print("Entre com o numero de parcelas: ");
		int n = sc.nextInt();
		
        ContractService contractService = new ContractService(new PaypalService()); //cria serviço contractservice com o paypalservice(logica dos juros e taxas)
		
		contractService.processContract(obj, n); //processa o contrato com obj e a parcelaa
		
		System.out.println("Parcelas:");     //passa dos todas as installment criadas
		for (Installment installment : obj.getInstalments()) {
			System.out.println(installment);
		}
	
       sc.close();
    }
}
