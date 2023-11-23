package java_curso.c_interface.Programs4.services;

public class BrazilInterestService implements InterestService{
    private double interestRate;

	public BrazilInterestService(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}
}