import java.util.*;

public class Exercise12_04{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean continueInput = true;

		do {
			// Enter annual interest rate
			System.out.print(
				"Enter annual interest rate, for example, 8.25: ");
			double annualInterestRate = input.nextDouble();
	
			// Enter number of years
			System.out.print("Enter number of years as an integer: ");
			int numberOfYeras = input.nextInt();
	
			// Enter loan amount
			System.out.print("Enter loan amount, for example, 120000.95: ");
			double loanAmount = input.nextDouble();
	

			try {
				// Create a Loan object
				Loan loan =
					new Loan(annualInterestRate, numberOfYeras, loanAmount);	
				continueInput = false;

				// Display loan date, monthly payment, and total payment
				System.out.printf("The loan was created on %s\n" + 
					"The monthly payment is %.2f\nTne total payment is %.2f\n",
					loan.getLoanDate().toString(), loan.getMonthlyPayment(),
					loan.getTotalPayment());
			}
			catch (IllegalArgumentException ex) {
				System.out.println(ex.getMessage());
			}
		} while (continueInput);
	}
}