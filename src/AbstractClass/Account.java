package AbstractClass;

public abstract class Account {
	
	private int number;
	private String holder;
	protected double balance;


	public Account(int number, String holder, double balance) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalace() {
		return balance;
	}

	public void setBalace(double balance) {
		this.balance = balance;
	}
	
	public void withdraw(double amount) {
		if(amount + 5 <= balance) {
			balance -= amount + 5;
		}else {
			System.out.println("Insufficient funds.");
		}
	}
	
	public void deposit(double amount) {
		balance += amount;
		
	}

}
