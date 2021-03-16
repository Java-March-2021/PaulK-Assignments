public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount();
		
		account1.depositMoney(500, "checking");
		account1.depositMoney(1000, "savings");
		account1.withdrawMoney(500, "savings");
		account1.displayAccountBalance();
		
		account2.depositMoney(1500, "checking");
		account2.depositMoney(10000, "savings");
		account2.withdrawMoney(500, "savings");
		account2.withdrawMoney(500, "checking");
		account2.displayAccountBalance();
		
		BankAccount.displayTotalHoldings();

	}

}