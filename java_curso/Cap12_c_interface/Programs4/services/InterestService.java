package java_curso.Cap12_c_interface.Programs4.services;

import java.security.InvalidParameterException;

public interface InterestService {
    double getInterestRate();

	default double payment(double amount, int months) { //metodo na interface para reaproveitar
		if (months < 1) {
			throw new InvalidParameterException("Months must be greater than zero");
		}
		return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);
	}
}
