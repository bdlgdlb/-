import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_14{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();

		System.out.print("Enter five integer for list1: ");
		
		for (int i = 0; i < 5; i++) {
			list1.add(input.nextInt());
		}

		System.out.print("Enter five integer for list2: ");

		for (int i = 0; i < 5; i++) {
			list2.add(input.nextInt());
		}

		list = union(list1, list2);

		System.out.print("The combined list is ");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}

	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){
		ArrayList<Integer> list = new ArrayList<>();

		list.addAll(list1);
		list.addAll(list2);
		return list;
	}
}

/*
	Enter five integer for list1: 1 1 1 1 1
	Enter five integer for list2: 2 2 2 2 2
	The combined list is 1 1 1 1 1 2 2 2 2 2
 */