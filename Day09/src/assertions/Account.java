package assertions;

public class Account {
	private double balance = 0.0;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double deposit(double amount) {
		double oldBalance = balance;
		balance += amount;
		// more processing...
		// assert balance > oldBalance;
		assert balance == oldBalance;
		return balance;
	}
	
	public double withdraw(double amount) {
		double oldBalance = balance;
		balance -= amount;
		// more processing...
		assert balance < oldBalance;
		//assert false;
		return balance;
	}

	public static void main(String[] args) {
		Account account = new Account();
		
		// The program does not check assertions unless
		// 1. Run Configurations
		// 2. Click on Arguments Tab
		// 3. Type -ea into VM Arguments
		// 4. Run
		account.deposit(50.0);
		account.withdraw(100.0);

	}

}
