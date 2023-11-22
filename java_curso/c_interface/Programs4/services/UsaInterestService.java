package java_curso.c_interface.Programs4.services;

public class UsaInterestService implements InterestService{
    private double interestRate;

	public UsaInterestService(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}
}
