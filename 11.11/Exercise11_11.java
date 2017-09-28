import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_11{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<>();
		System.out.print("Enter five integers for list: ");
		int a;
		for (int i = 0; i < 5; i++) {
			a = input.nextInt();
			list.add(a);
		}

		sort(list);

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
	}

	public static void sort(ArrayList<Integer> list){
		int[] a = new int[list.size()];

		for (int i = 0; i < list.size(); i++) {
			a[i] = list.get(i);
		}

		int temp ;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if(a[j] < a[j + 1]){
					temp = a[j]; 
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		list.clear();
		for (int i = 0; i < a.length; i++) {
			list.add(a[i]);
		}

		
	}
}

/*
	Enter five integers for list: 9 5 4 8 2
	9 8 5 4 2

 */