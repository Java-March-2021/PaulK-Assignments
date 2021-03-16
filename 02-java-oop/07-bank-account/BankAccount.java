package BankAccount;

import java.util.Random;
public class BankAccount {
	public static int numAccounts = 0;
	public static double totalHoldings = 0;

	private String accountNumber;
	private double checkingBalance;
	private double savingsBalance;

	public BankAccount() {
		BankAccount.numAccounts += 1;
		this.checkingBalance = 0;
		this.savingsBalance = 0;
		this.accountNumber = BankAccount.generateId();
	}
	
	private static String generateId() {
		String subst = "";
		Random r = new Random();
		for(int i = 0; i < 10; i++) {
			subst += r.nextInt(10);
		}
		return subst;
	}
	
	public double getCheckingBalance() {
		return this.checkingBalance;
	}

	public double getSavingsBalance() {
		return this.savingsBalance;
	}

	private String getID() {
		return this.accountNumber;
	}
	
	public static int getAccountCount() {
		return numAccounts;
	}

	public static double getTotalHoldings() {
		return totalHoldings;
	}
	
	public void depositMoney(double amount, String account) {
		if(account.equals("savings")) {
			this.savingsBalance += amount;
		}
		else if(account.equals("checking")) {
			this.checkingBalance += amount;
		}
		BankAccount.totalHoldings += amount;
	}

	public void withdrawMoney(double amount, String account) {
		boolean successful = false;
		if(account.equals("savings")) {
			// check if enough in account
			if(this.savingsBalance - amount >= 0) {
				successful = true;
				this.savingsBalance -= amount;
			}
		}
		else if(account.equals("checking")) {
			// check if enough in account
			if(this.checkingBalance - amount >= 0) {
				successful = true;
				this.checkingBalance -= amount;
			}
		}
		if(successful) {
			BankAccount.totalHoldings -= amount;
		}
	}

	public void displayAccountBalance() {
		// %.2f formats decimal to the 10s place (like for moniez)
		System.out.println(String.format("Savings: %.2f, Checking: %.2f", this.savingsBalance, this.checkingBalance));
	}
	
	public static void displayTotalHoldings() {
		// %.2f formats decimal to the 10s place (like for moniez)
		System.out.println(String.format("Total Holdings: %.2f", totalHoldings));
	}

}

