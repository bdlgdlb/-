import java.util.Scanner;

public class Exercise10_05{
	public static void main(String[] args) {
		StackOfIntegers stack = new StackOfIntegers();

		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");

		int number = input.nextInt();

		System.out.println("The factor for " + number + " is ");

		int factor = 2;
		while (factor <= number){
			if(number % factor == 0){
				number /= factor;
				stack.push(factor);
			}
			else{
				factor++;
			}
		}

		while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
	}
}

/*
	Enter an integer: 120
	The factor for 120 is
	5 3 2 2 2
 */