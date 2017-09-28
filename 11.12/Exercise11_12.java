import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_12{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<Double> list = new ArrayList<>();

		System.out.print("Enter five numbers for list: ");

		double a;
		for (int i = 0; i < 5; i++) {
			a = input.nextDouble();
			list.add(a);
		}

		System.out.println("The sum of list: " + sum(list));
	}

	public static double sum(ArrayList<Double> list){
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}

		return sum;
	}
}

/*
	Enter five numbers for list: 1 2 3 4 5
	The sum of list: 15.0

 */