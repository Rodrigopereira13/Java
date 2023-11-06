package java_curso.herança.Programs1.Application;

import java_curso.herança.Programs1.Enteties.BusinessAccount;

public class Program1 {
    
    public static void main(String[] args) {

		BusinessAccount account = new BusinessAccount(8010, "Bob Brown", 0.0, 500.0);

		System.out.println(account.getBalance());
	}
}
