public class Account{
	private int id;
	private double balance;

	public Account(){

	}

	public Account(int id,double balance){
		this.id = id;
		this.balance = balance;
	}

	public void setId(int id){
		this.id = id;
	}

	public double getBalance(){
		return balance;
	}

	public void withdraw(double amount){
		balance -= amount;
	}

	public void deposit(double amount){
		balance += amount;
	}
}