import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_04{
	public static Integer max(ArrayList<Integer> list){
		if (list.isEmpty()) {
			return null;
		}
		Integer[] array = new Integer[list.size()];
		list.toArray(array);

		int temp = 0;
		for (int i = 1; i < array.length; i++) {
			if(array[temp] < array[i]){
				temp = i;
			}
		}

		return list.get(temp);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<>();

		System.out.println("Enter integers (input ends with 0): ");
		int value;

		do{
			value = input.nextInt();

			if (!list.contains(value) && value != 0) {
				list.add(value);
			}
		}while (value != 0);

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

		System.out.println("\nThe max value is: " + max(list));
	}
}

/*
	Enter integers (input ends with 0):
	5 4 8 9 7 6 2 3 1
	The max value is: 9

 */