import java.util.Scanner;

public class Exercise09_11{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a, b, c, d, e, f:");

		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();

		LinearEquation l = new LinearEquation(a, b, c, d, e, f);

		if(l.isSolvable()){
			System.out.println("x is " + l.getX() + " y is " + l.getY());
		}
		else{
			System.out.println("The equation hasno solution.");
		}		
	}
}
/*
	Enter a, b, c, d, e, f:9.0 4.0 3.0 -5.0 -6.0 -21.0
	x is -2.0 y is 3.0
-------------------------------------------------------
	Enter a, b, c, d, e, f:9.0 4.0 3.0 -5.0 -6.0 -21.0
	x is -2.0 y is 3.0
 */