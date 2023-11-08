package java_curso.herança_polimorfismo.Programs1.Enteties;

public class BusinessAccount extends Account {
    
    private Double loanLimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}

    //sobrepor o método withdraw 
    @Override
    public void withdraw(double ammount){
        super.withdraw(ammount);
        balance -= 2.0;
    }
}
