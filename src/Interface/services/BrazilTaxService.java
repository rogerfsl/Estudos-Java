package Interface.services;

public class BrazilTaxService implements TaxService{
	
	public double tax(double amount) {
		if(amount <= 100) {
			return (amount * 20) / 100;
		}
		return (amount * 15) / 100;
	}

}
