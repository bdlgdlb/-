import java.util.Scanner;

public class Exercise09_12{

	public static double[][] getPoints(){
		Scanner input = new Scanner(System.in);

		double[][] points = new double[4][2];
		for (int i = 0; i < points.length; i++){
			for (int j = 0; j < points[i].length; j++)
				points[i][j] = input.nextDouble();
		}
		return points;
	}

	public static double[] getArguments(double[][] points){
		double[] p = new double[6];
		p[0] = points[0][1] - points[1][1];
		p[1] = -1 * (points[0][0] - points[1][0]);
		p[2] = points[2][1] - points[3][1];
		p[3] = -1 * (points[2][0] - points[3][0]);
		p[4] = (points[0][1] - points[1][1]) * points[0][0] - 
					  (points[0][0] - points[1][0]) * points[0][1];
		p[5] = (points[2][1] - points[3][1]) * points[2][0] - 
					  (points[2][0] - points[3][0]) * points[2][1];
		return p;
	}
	public static void main(String[] args) {
		

		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4:");

		double[][] points = getPoints();
		double[] p = getArguments(points);

		LinearEquation l = new LinearEquation(p[0], p[1], p[2], p[3], p[4], p[5]);

		if (l.isSolvable()) {
			System.out.println("The intersecting point is at (" + 
				l.getX() + ", " + l.getY() + ")");
		}
		else
			System.out.println("The two lines are parallel");
	}
}

/*
	Enter x1, y1, x2, y2, x3, y3, x4, y4:2 2 5 -1.0 4.0 2.0 -1.0 -2.0
	The intersecting point is at (2.888888888888889, 1.1111111111111112)
	--------------------------------------------------------------------
	Enter x1, y1, x2, y2, x3, y3, x4, y4:2 2 7 6.0 4.0 2.0 -1.0 -2.0
	The two lines are parallel
 */