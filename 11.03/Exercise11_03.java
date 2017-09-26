public class Exercise11_03{
	public static void main(String[] args) {
		Account account = new Account(1122, 20000);
		SavingAccount savings = new SavingAccount(1001, 20000);
		CheckingAccount checking = new CheckingAccount(1004, 20000, -20);

		account.setAnnualInterestRate(4.5);
		savings.setAnnualInterestRate(4.5);
		checking.setAnnualInterestRate(4.5);

		account.withDraw(2500);
		savings.withDraw(2500);
		checking.withDraw(2500);

		account.deposit(3000);
		savings.deposit(3000);
		checking.deposit(3000);

		System.out.println(account.toString());
		System.out.println(savings.toString());
		System.out.println(checking.toString());
	}
}
/*

		Account ID: 1122
		Date created: Tue Sep 26 18:15:43 GMT+08:00 2017
		Balance: $20500.00

		Account ID: 1001
		Date created: Tue Sep 26 18:15:43 GMT+08:00 2017
		Balance: $20500.00

		Account ID: 1004
		Date created: Tue Sep 26 18:15:43 GMT+08:00 2017
		Balance: $20500.00
		Overdraft limit: $-20.00

 */