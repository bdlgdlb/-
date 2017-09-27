import java.util.Scanner;
import java.util.ArrayList;

public class Exercise11_07{
	public static void shuffle(ArrayList<Integer> list){
		java.util.Collections.shuffle(list);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<>();
		System.out.print("Enter a list of integers ending with 0: ");
		Integer number = input.nextInt();

		while (number.intValue() != 0) {
			list.add(number);
			number = input.nextInt();
		}

		shuffle(list);

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
	}
}

/*
	Enter a list of integers ending with 0: 1 2 3 4 5 6 7 8 9 0
	1 9 8 6 7 2 3 5 4

 */