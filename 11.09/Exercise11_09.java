import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_09{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the array size n: ");
		int n = input.nextInt();

		int[][] array = new int[n][n];

		fill(array);

		print(array);

		System.out.print("The largest row index: ");
		print(largestRow(array));
		System.out.print("The largest column index: ");
		print(largestColumn(array));
	}

	/** Fill array randomly with 0s and 1s */
	public static void fill(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int)(Math.random() * 2);
			}
		}
	}

	/** Display matrix */
	public static void print(int[][] array){
		System.out.println("The random array is");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}

	/** Display the integers in an list */
	public static void print(ArrayList<Integer> list){
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
	}

	/** Return a list of the row indices with the most 1 */
	public static ArrayList<Integer> largestRow(int[][] array){
		ArrayList<Integer> index = new ArrayList<>();
		int[] count = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if(array[i][j] == 1){
					count[i]++;
				}
			}
		}

		int max = max(count);
		getIndex(index, count, max);
		return index;
	}

	/** Return a list of the column indices with the most 1 */
	public static ArrayList<Integer> largestColumn(int[][] array){
		ArrayList<Integer> index = new ArrayList<>();
		int[] count = new int[array.length];

		for (int i = 0; i < array[0].length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if(array[j][i] == 1){
					count[i]++;
				}
			}
		}

		int max = max(count);
		getIndex(index, count, max);
		return index;
	}

	/** Return the maximum integer in the array */
	public static int max(int[] a){
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}

		return max;
	}

	/** Adds the indices of x in count to the list */
	public static void getIndex(ArrayList<Integer> list, int[] a, int max){
		for (int i = 0; i < a.length; i++) {
			if (a[i] == max) {
				list.add(i);
			}
		}
	}
}

/*
	Enter the array size n: 4
	The random array is
	1111
	1111
	1001
	0010
	The largest row index: 0 1
	The largest column index: 0 2 3

 */