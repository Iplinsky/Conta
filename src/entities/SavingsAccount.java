package entities;

public class SavingsAccount extends Account {
	
	private double interesRate;
	
	public SavingsAccount(Integer number, String holder, Double balance, double interesRate) {
		super(number, holder, balance);
		this.interesRate = interesRate;
	}

	public double getInteresRate() {
		return interesRate;
	}

	public void setInteresRate(double interestRate) {
		this.interesRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interesRate;
	}
	
	@Override
	public final void withdraw(double amount) {
		balance -= amount;
	}

}
