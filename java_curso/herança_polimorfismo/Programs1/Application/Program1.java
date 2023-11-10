package java_curso.herança_polimorfismo.Programs1.Application;


import java_curso.herança_polimorfismo.Programs1.Enteties.Account;
import java_curso.herança_polimorfismo.Programs1.Enteties.BusinessAccount;
import java_curso.herança_polimorfismo.Programs1.Enteties.SavingsAccount;

public class Program1 {
    
    public static void main(String[] args) {

		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		// DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		// BusinessAccount acc5 = (BusinessAccount)acc3;
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
        
        //sobreposição é reescrever um método da super para a subclasse
        //com modificação no metódo.
        Account acc6 = new Account(1010, "Alex", 1000.0);
        acc6.withdraw(200.0);
        System.out.println(acc6.getBalance());

        Account acc7 = new SavingsAccount(1011, "Gold", 1000.0, 0.01);
        acc7.withdraw(200.0);
        System.out.println(acc7.getBalance());

        Account acc8 = new BusinessAccount(1012, "Platina", 1000.0, 500.0);
        acc8.withdraw(200.0);
        System.out.println(acc8.getBalance());


	}
}

