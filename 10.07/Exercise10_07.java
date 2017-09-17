public class Exercise10_07{
	private static java.util.Scanner input = new java.util.Scanner(System.in);

	public static int getAChoice(){
		int choice;

		while (true) {
			System.out.println("Main menu ");
			System.out.println("1: check balance");
			System.out.println("2: withdraw");
			System.out.println("3: deposit");
			System.out.println("4: exit");
			System.out.println("Enter a choice: ");

			choice = input.nextInt();

			if (choice < 1 || choice > 4) {
				System.out.println("Wrong choice, try again ");
			}
			else{
				break;
			}
		}

		return choice;
	}

	public static void withdraw(Account amounts){
		System.out.println("Enter an amount to withdraw:");
		double amount = input.nextDouble();
		if(amount <= amounts.getBalance()){
			amounts.withdraw(amount);
		}
		else{
			System.out.println("The amount is too large, ignored");
		}

	}

	public static void deposit(Account amounts){
		System.out.println("Enter an amount to deposit:");

		double amount = input.nextDouble();
		if (amount >= 0) {
			amounts.deposit(amount);
		}
		else{
			System.out.println("The amount is negative, ignored");
		}
	}

	public static void main(String[] args) {
		Account[] amounts = new Account[10];

		for (int i = 0; i < amounts.length; i++) {
		 	amounts[i] = new Account(i, 100);
		 } 

		 while(true){
		 	boolean isTrue = true;

		 	System.out.print("Enter an id: ");
		 	int id = input.nextInt();

		 	if (id < 0 || id > 9) {
		 		System.out.println("Please enter a correct id ");
		 		continue;
		 	}

		 	while(isTrue){
		 		int choice = getAChoice();

		 		switch (choice) {
	 			case 1: 
	 				System.out.println("The balance is " + amounts[id].getBalance());
	 				break;
	 			case 2:
	 				withdraw(amounts[id]);
	 				break;
	 			case 3:
	 				deposit(amounts[id]);
	 				break;
	 			case 4:
	 				isTrue = false;
	 				break;
		 		}
		 	}

		 }
	}
}