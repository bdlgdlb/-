public class Exercise09_09{
	public static void main(String[] args) {
		RegularPolygon a = new RegularPolygon();
		RegularPolygon b = new RegularPolygon(6,4);
		RegularPolygon c = new RegularPolygon(10,4,5.6,7.8);

		System.out.println("\n--------------------------------------------------");
		System.out.println("| Regular Polygon Objects |  Perimeter  |  Area  |");
		System.out.println("--------------------------------------------------");
		System.out.printf( "|       Object# 1         |%8.2f     |%6.2f  |\n", 
			a.getPerimeter(), a.getArea());
		System.out.printf( "|       Object# 2         |%8.2f     |%6.2f  |\n", 
			b.getPerimeter(), b.getArea());
		System.out.printf( "|       Object# 3         |%8.2f     |%6.2f  |\n", 
			c.getPerimeter(), c.getArea());
		System.out.println("--------------------------------------------------");
	}
}

class RegularPolygon{
	private int n;
	private double side;
	private double x;
	private double y;

	RegularPolygon(){
		n = 3;
		side = 1;
		x = 0;
		y = 0;
	}

	RegularPolygon(int n, double side){
		this.n = n;
		this.side = side;
		x = 0;
		y = 0;
	}

	RegularPolygon(int n, double side, double x, double y){
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}

	public int getN(){
		return n;
	}

	public void setN(int n){
		this.n = n;
	}

	public double getSide(){
		return side;
	}

	public void setSide(double side){
		this.side = side;
	}

	public double getX(){
		return x;
	}

	public void setX(double x){
		this.x = x;
	}

	public double getY(){
		return y;
	}

	public void setY(double y){
		this.y = y;
	}

	public double getPerimeter(){
		return n * side;
	}

	public double getArea(){
		return (n * side * side) / (4 * Math.tan(Math.PI / n));
	}
}

/*

	--------------------------------------------------
	| Regular Polygon Objects |  Perimeter  |  Area  |
	--------------------------------------------------
	|       Object# 1         |    3.00     |  0.43  |
	|       Object# 2         |   24.00     | 41.57  |
	|       Object# 3         |   40.00     |123.11  |
	--------------------------------------------------

 */