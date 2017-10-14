public class Exercise13_12 {
	public static void main(String[] args) {
		GeometricObject[] array = {new Circle(5), new Circle(8),
			new Rectangle(3, 4), new Rectangle(4, 2)};

			System.out.println("Total area of elements in array: " + sumArea(array));
	}

	public static double sumArea(GeometricObject[] a) {
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i].getArea();
		}
		return sum;
	}
}