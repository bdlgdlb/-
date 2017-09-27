public class Exercise11_08{
	public static void main(String[] args) {
		Account account = new Account("George", 1122, 1000);

		account.setAnnualInterestRate(1.5);

		account.deposit(30);
		account.deposit(40);
		account.deposit(50);

		account.withdraw(5);
		account.withdraw(4);
		account.withdraw(2);

		System.out.println("       Account Summary"); 
		System.out.println("------------------------------------");
		System.out.println("Account holder name: " + account.getName());
		System.out.println("Interest rate: " + account.getAnnualInterestRate());
		System.out.printf("Balance: $%.2f\n", account.getBalance());
		System.out.println("\n     List of transactions");
		System.out.println("------------------------------------");
		for (int i = 0; i < account.getTransactions().size(); i++) {
			System.out.println("Date: " + 
				(account.getTransactions()).get(i).getDate());
			System.out.println("Type: " + 
				(account.getTransactions()).get(i).getType());
			System.out.println("Amount: " + 
				(account.getTransactions()).get(i).getAmount());
			System.out.println("Balance: " + 
				(account.getTransactions()).get(i).getBalance());
			System.out.println("Description: " + 
				(account.getTransactions()).get(i).getDescription());
			System.out.println();
		}
	}
}
/*
	       Account Summary
	------------------------------------
	Account holder name: George
	Interest rate: 1.5
	Balance: $1109.00

	     List of transactions
	------------------------------------
	Date: Wed Sep 27 11:48:20 GMT+08:00 2017
	Type: D
	Amount: 30.0
	Balance: 1030.0
	Description: Deposit to account

	Date: Wed Sep 27 11:48:20 GMT+08:00 2017
	Type: D
	Amount: 40.0
	Balance: 1070.0
	Description: Deposit to account

	Date: Wed Sep 27 11:48:20 GMT+08:00 2017
	Type: D
	Amount: 50.0
	Balance: 1120.0
	Description: Deposit to account

	Date: Wed Sep 27 11:48:20 GMT+08:00 2017
	Type: W
	Amount: 5.0
	Balance: 1115.0
	Description: Withdrawal from account

	Date: Wed Sep 27 11:48:20 GMT+08:00 2017
	Type: W
	Amount: 4.0
	Balance: 1111.0
	Description: Withdrawal from account

	Date: Wed Sep 27 11:48:20 GMT+08:00 2017
	Type: W
	Amount: 2.0
	Balance: 1109.0
	Description: Withdrawal from account


 */