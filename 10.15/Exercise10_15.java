import java.util.Scanner;

public class Exercise10_15{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] points = new double[5][2];

		System.out.print("Enter five points: ");
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points[0].length; j++) {
				points[i][j] = input.nextDouble();
			}
		}

		MyRectangle2D r1 = MyRectangle2D.getRectangle(points);
		System.out.println("The bounding rectangle's center (" + r1.getX() + ", " + 
			r1.getY() + "), width " + r1.getWidth() + ", height " + r1.getHeight());
	}
}

/*
	Enter five points: 1.0 2.5 3 4 5 6 7 8 9 10
	The bounding rectangle's center (5.0, 6.25), width 8.0, height 7.5

 */