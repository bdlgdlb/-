 import java.util.Date;
 import java.util.ArrayList;
 
 public class Account{
	private int id ;
	private double balance;
	private double annualInterestRate ;
	private Date dateCreated;
	private String name;
	private  ArrayList<Transaction> transactions;

	public Account(){
		name = "";
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
		transactions = new ArrayList<Transaction>();
	}
	public  Account(int id, double balance){
		name = "";
		this.id = id;
		this.balance = balance;
		dateCreated = new Date();
				transactions = new ArrayList<Transaction>();
	}

	public Account(String name, int id, double balance){
		this.name = name;
		this.id = id;
		this.balance = balance;
		transactions = new ArrayList<Transaction>();
	}

	public String getName(){
		return name;
	}

	public void setName(){
		this.name = name;
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
		transactions.add(new Transaction('W', amount, balance, "Withdrawal from account"));
	}

	public void deposit(double amount){
		balance += amount;
		transactions.add(new Transaction('D', amount, balance, "Deposit to account"));
	}

	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}

	public String toString() {
		return "\nAccount ID: " + id + "\nDate created: " + getDateCreated()
			+ "\nBalance: $" + String.format("%.2f", balance);
	}
}