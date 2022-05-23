package inheritanceassignment;

public class Account {
	private double balance;

	public Account(double initialBalance) {
		if (initialBalance > 0.0) {
			balance = initialBalance;
		}
	}

	public void credit(double amount) {
		balance = balance + amount;
	}

	public void debit(double amount) {
		if (balance < amount) {
			System.out.println("!Debit amount exceeded account  balance");
		} else {
			balance = balance - amount;
		}
	}

	public double getBalance() {
		return balance;
	}

	public static void main(String args[]) {
		Account a1 = new Account(820000.0);
		System.out.println(a1.getBalance());
		a1.credit(1000);
		System.out.println(a1.getBalance());
		a1.debit(20000);
		System.out.println(a1.getBalance());
	}
}
