package Interface.services;

public class UsalnterestService implements InterestService{

	private double interestRate;
	
	public UsalnterestService(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}

	
	
	
}
