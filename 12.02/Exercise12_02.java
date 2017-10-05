import java.util.*;

public class Exercise12_02{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter tow numbers: ");

		do{
			try{
				int number1 = input.nextInt();
				int number2 = input.nextInt();

				System.out.println("The sum is: " + (number1 + number2));
				break;
			}
			catch(InputMismatchException ex){
				System.out.println("Try again. (" + "Incorrect input: two integers are required) ");

				input.nextLine();
			}
		}while(true);
	}
}