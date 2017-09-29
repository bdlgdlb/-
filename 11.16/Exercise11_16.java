import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_16{
	public static void main(String[] args) {
		int number1 = (int)(Math.random() * 100);
		int number2 = (int)(Math.random() * 100);

		Scanner input = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<>();

		System.out.print("What is " + number1 + " + " + number2 + "? ");

		int answer = input.nextInt();
		list.add(answer);

		while(number1 + number2 != answer){
			System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
			answer = input.nextInt();
			if (!list.contains(answer)) {
				list.add(answer);
			}
			else {
				System.out.println("You already entered " + answer);
			}
		}

		System.out.println("You got it!");
	}
}

/*
	What is 13 + 95? 98
	Wrong answer. Try again. What is 13 + 95? 64
	Wrong answer. Try again. What is 13 + 95? 98
	You already entered 98
	Wrong answer. Try again. What is 13 + 95? 108
	You got it!

 */