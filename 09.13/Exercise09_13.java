import java.util.Scanner;

public class Exercise09_13{

	public static Location locateLargest(double[][] a){
		return new Location(a);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of rows and columns in the array: ");

		int row = input.nextInt();
		int column =input.nextInt();

		double[][] a = new double[row][column];
		for (int i = 0; i < a.length; i++){
			for (int j = 0; j < a[i].length; j++)
				a[i][j] = input.nextDouble();
		}
		Location max = locateLargest(a);
		System.out.println("The location of the largest element is " + max.maxValue + " at ("
		+ max.row + ", " + max.column + ")");
	}
}

/*
	Enter the number of rows and columns in the array: 3 4
	23.5 35 2 10
	4.5 3 45 3.5
	35 44 5.5 9.6
	The location of the largest element is 45.0 at (1, 2)
 */