import java.util.Date;

public class Exercise09_07{
	public static void main(String[] args) {
		Account account = new Account(1122,20000);

		account.setAnnualInterestRate(4.5);
		account.withdraw(2500);
		account.deposit(3000);

		System.out.println("\n          Account Statement");
		System.out.println("------------------------------------------");
		System.out.println("Account ID: " + account.getId());
		System.out.println("Date created: " + account.getDateCreated());
		System.out.printf("Balance: $%.2f\n", account.getBalance());
		System.out.printf("Monthly interest: $%.2f\n", 
			account.getBalance() * account.getMonthlyInterestRate());
	}
}
/*

	          Account Statement
	------------------------------------------
	Account ID: 1122
	Date created: Mon Sep 11 15:14:39 CST 2017
	Balance: $20500.00
	Monthly interest: $7687.50

 */


class Account{
	private int id ;
	private double balance;
	private double annualInterestRate ;
	private Date dateCreated;

	Account(){
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
	}
	Account(int id, double balance){
		this.id = id;
		this.balance = balance;
		dateCreated = new Date();
	}

	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id = id;
	}

	public double getBalance(){
		return balance;
	}

	public void setBalance(double balance){
		this.balance = balance;
	}

	public double getAnnualInterestRate(){
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	}

	public String getDateCreated(){
		return  dateCreated.toString();
	}

	public double getMonthlyInterestRate(){
		return annualInterestRate / 12;
	}

	public void withdraw(double amount){
		balance -= amount;
	}

	public void deposit(double amount){
		balance += amount;
	}
}