import java.util.Scanner;

public class Exercise11_01{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter three side of the triangle: ");
		double side1 = input.nextDouble();		
		double side2 = input.nextDouble();		
		double side3 = input.nextDouble();

		System.out.print("Enter a color: ");
		String color = input.next();

		System.out.print("Is the triangle filled (true / false)? ");
		boolean filled = input.nextBoolean();

		Triangle triangle = new Triangle(side1, side2, side3);
		triangle.setColor(color);
		triangle.setFilled(filled);

		System.out.println(triangle.toString());
		System.out.println("Area: " + triangle.getArea());
		System.out.println("Perimeter: " + triangle.getPerimeter());
		System.out.println("Color: " + triangle.getColor());
		System.out.println("Triangle is" + (triangle.isFilled() ? "" : " not ") 
			+ "filled");
	}
}
/*
		Enter three side of the triangle: 3 4 5
		Enter a color: bule
		Is the triangle filled (true / false)? false
		Triangle: side1 = 3.0 side2 = 4.0 side3 = 5.0
		Area: 6.0
		Perimeter: 12.0
		Color: bule
		Triangle is not filled

 */