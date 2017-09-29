import java.util.Scanner;
import  java.util.ArrayList;

public class Exercise11_15{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of points: ");
    int n = input.nextInt();

    System.out.print("Enter the coordinates of the points: ");
    ArrayList<Double> x = new ArrayList<>();
    ArrayList<Double> y = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      x.add(input.nextDouble());
      y.add(input.nextDouble());
    }
      
    double total = 0;
    for (int i = 1; i < n - 1; i++) 
      total += getArea(x.get(0), y.get(0), x.get(i), y.get(i), x.get(i + 1), y.get(i + 1));
      
    System.out.print("The total area is " + total);
	}

	public static double getArea(double x1, double y1, double x2, double y2, double x3, double y3) {
    double s1 = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 -y2));
    double s2 = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 -y3));
    double s3 = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 -y2));
      
    double s = (s1 + s2 + s3) / 2;
    return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
  }
}

/*
	Enter the number of points: 7
	Enter the coordinates of the points: -12 0 -8.5 10 0 11.4 5.5 7.8 6 -5.5 0 -7 -3.5 -13.5
	The total area is 292.575

 */