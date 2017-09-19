public class Exercise10_12{
	public static void main(String[] args) {
		Triangle2D t1 = new Triangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3), new MyPoint(5, 3.5));
		System.out.print("The triangle area of t1 is:" + t1.getArea());
		System.out.println(" perimeter is : " + t1.getPerimeter());
		System.out.println(t1.contains(3, 3));
		System.out.println(t1.contains(new Triangle2D(new MyPoint(2.9, 2), new MyPoint(4, 1), new MyPoint(1, 3.4))));
		System.out.println(t1.overlaps(new Triangle2D(new MyPoint(2, 5.5), new MyPoint(4, -3), new MyPoint(2, 6.5))));
	}
}
/*
		The triangle area of t1 is:0.02500000000000299 perimeter is : 5.831182352959913
		false
		false
		true
 */