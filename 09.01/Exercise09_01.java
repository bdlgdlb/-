public class Exercise09_01{
	public static void main(String[] args) {
		Rectangle a = new Rectangle(4,40);
		Rectangle b = new Rectangle(3.5,35.9);
		System.out.println("The Rectangle width " + a.width + 
			" and height "+ a.height);
		System.out.println(" Area " + a.getArea() + 
			" and perimeter " + a.getPerimeter());

		System.out.println("The Rectangle width " + b.width + 
			" and height "+ b.height);
		System.out.println(" Area " + b.getArea() + 
			" and perimeter " + b.getPerimeter());
		/*
			The Rectangle width 4.0 and height 40.0
			Area 160.0 and perimeter 88.0
			The Rectangle width 3.5 and height 35.9
 			Area 125.64999999999999 and perimeter 78.8
		 */

	}
}




 class Rectangle{
	double width = 1;
	double height = 1;

	Rectangle(){}

	Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}

	public double getArea(){
		return width * height;
	}

	public double getPerimeter(){
		return (width + height) *2;
	}
}