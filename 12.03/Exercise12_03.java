import java.util.*;

public class Exercise12_03{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] a = new int[100];

		for (int i = 0; i < a.length; i++) {
		 	a[i] = (int)(Math.random() * 100);
		 } 

		 System.out.print("Enter index to array: ");
		 
	 	try{
	 		System.out.println("The corresponding element value is " + a[input.nextInt()]);
	 	}
	 	catch(ArrayIndexOutOfBoundsException ex){
	 		System.out.println("Out of Bounds");
		 
		}
	}		
}