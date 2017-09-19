public class MyPoint{
	private double x;
	private double y;

	public MyPoint(){
		this(0,0);
	}

	public MyPoint(double x, double y){
		this.x = x;
		this.y = y;
	}

	public double getX(){
		return x;
	}

	public double getY(){
		return y;
	}

	//返回从该点到MyPoint类型的指定点的距离
	public double distance (MyPoint o){
		return Math.sqrt((x - o.getX()) * (x - o.getX()) + (y - o.getY()) * (y - o.getY()));
	}

	//返回从该点到指定点之间的距离
	public double distance(double x, double y){
		return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
	}
}