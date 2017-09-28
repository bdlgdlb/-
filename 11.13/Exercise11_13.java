import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_13{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<>();

		System.out.print("Enter ten integer: ");
		
		for (int i = 0; i < 10; i++) {
			list.add(input.nextInt());
		}

		removeDuplicate(list);
		System.out.print("The distinct integer are ");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
	}

	public static void removeDuplicate(ArrayList<Integer> list){
		
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) == list.get(j)) {
					list.remove(j);
				}
			}
		}
	}
}

/*
	Enter ten integer: 34 5 3 5 6 4 33 2 2 4
	The distinct integer are 34 5 3 6 4 33 2

 */