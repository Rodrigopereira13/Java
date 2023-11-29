package java_curso.Cap9_herança_polimorfismo.Classes_Abstratas.Programs5.Entities;

public class Individual extends TaxPayer{
    
    private Double heathExpenditures;

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.heathExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return heathExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.heathExpenditures = healthExpenditures;
	}

	@Override
	public Double tax() {
		if (getAnualIncome() < 20000.0) {
			return getAnualIncome() * 0.15 - heathExpenditures * 0.5;
		}
		else {
			return getAnualIncome() * 0.25 - heathExpenditures * 0.5;
		}
	}

}
