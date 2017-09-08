/*找出所有最近的点对*/

import java.util.Scanner;

public class FindNearestPoints {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of points:");
		int numberOfPoints = input.nextInt();

		// Create an array to store points
		double[][] points = new double[numberOfPoints][2];
		System.out.println("Enter " + numberOfPoints + " points: ");
		for (int i = 0; i < points.length ; i++ ) {
			points[i][0] = input.nextDouble();
			points[i][1] = input.nextDouble();
		}
		for (int i = 0; i < points.length; i++) {
			System.out.println( "("+ points[i][0] + "," + points[i][1] + ")");
		}

		// p1 and p2 are the indices in the points' array
		int p1 = 0,p2 = 1;//Initial two points
		double shortestDistance = distance(points[p1][0], points[p1][1], points[p2][0], points[p2][1]);//Initialize shortestDistance

		//Comput distance for every teo pointd
		for (int i = 0; i < points.length; i++) {
		 	for (int j = i + 1; j < points.length;j++ ) {
		 		double distance = distance(points[i][0],points[i][1],points[j][0],points[j][1]);//Find distance
		 		if (shortestDistance > distance){
		 			p1 = i;//Update p1
		 			p2 = j;//Update p2
		 			shortestDistance = distance;//Update shortestDistance
		 		}
		 	}
		 } 
		 /*找出所有相同的点对*/
		 double shortest1Distance = distance(points[p1][0], points[p1][1], points[p2][0], points[p2][1]);
		 System.out.println("最近的点距离为: " + shortest1Distance);
		 for (int i = 0; i < points.length ; i++) {
		 	for (int j = i + 1; j < points.length; j++) {
		 		double distance = distance(points[i][0],points[i][1],points[j][0],points[j][1]);
		 		if (shortest1Distance == distance) {
		 			//Display result
					 System.out.println("The closest two points are" + "(" + points[i][0] + "," + 
					 	points[i][1] + ") and (" + points[j][0] + "," + points[j][1] + ")");
		 		}
		 	}
		 }

		 
	}

	/* Compute the distance between two points (x1, y1) and (x2, y2) */
	public static double distance ( double x1, double y1, double x2, double y2) {
		return Math.sqrt((x2 - x1) * (x2 -x1) + (y2 - y1) *(y2 - y1));
	}
}