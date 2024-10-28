// Chloe Becker
// COP 3330
// 9/14/2024
// Account

public class Account {
	
	private String name;
	private double intrest, balance;
	
	public Account(String name, double intrest) {
		this.name = name;
		this.intrest = intrest;
		this.balance = 0.00;
	}

	public boolean deposit(double money) {
		if (money > 0) {
			this.balance += money;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean withdraw(double money) {
		double test = (double) (this.balance - money);
		if ((test) < 0 || money <= 0) {
			return false;
		}
		else {
			this.balance -= money;
			return true;
		}
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void calcIntrest(int years) {
		if (years >= 1 && years <= 1000) {
			double InterestPeriod = (this.intrest*((double) years /12))/100;
			double newTotal = this.balance * (1 + InterestPeriod);
			this.balance = newTotal;
			System.out.println("Done.");
		}
		else {
			System.out.println("Invalid years.");
		}
	}
}
