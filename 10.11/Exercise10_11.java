public class Exercise10_11{
	public static void main(String[] args) {
		Circle2D c1 = new Circle2D(2, 2, 5.5);

		System.out.println("The circle area is: " + c1.getArea());
		System.out.println("The circle perimeter is: " + c1.getPerimeter());
		System.out.println("Does circle1 contain the point (3, 3)?" + c1.contains(3, 3));
		System.out.println("Does circle1 contain the circle centered at (4, 5) and radius 10.5? " 
			+ c1.contains(new Circle2D(4, 5, 10.5)));
		System.out.println("Does circle1 overlap the circle centered at (3, 5) and radius 2.3? " 
			+ c1.overlaps(new Circle2D(3, 5, 2.3)));
	}
}

/*
		The circle area is: 95.03317777109123
		The circle perimeter is: 34.55751918948772
		Does circle1 contain the point (3, 3)?true
		Does circle1 contain the circle centered at (4, 5) and radius 10.5? false
		Does circle1 overlap the circle centered at (3, 5) and radius 2.3? false
 */