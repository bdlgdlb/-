import java.util.Scanner;

public class Exercise13_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a, b and c and 
		// create three Rational objects form input
		System.out.print("Enter a, b, c: ");
		int a = input.nextInt();
	    int b = input.nextInt();
	    int c = input.nextInt();

		// Compute h and k
		// h = -b / 2a
		Rational h = new Rational(-b, 2 * a);

		// k = f(h) = a * h^2 + b * h + c
		Rational k = new Rational(4 * a * c - b * b, 4 * a);

		// Display results
		System.out.println("h is " + h + " k is " + k);
	}
}