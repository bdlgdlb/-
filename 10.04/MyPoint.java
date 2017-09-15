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

	//���شӸõ㵽MyPoint���͵�ָ����ľ���
	public double distance (MyPoint o){
		return Math.sqrt((x - o.getX()) * (x - o.getX()) + (y - o.getY()) * (y - o.getY()));
	}

	//���شӸõ㵽ָ����֮��ľ���
	public double distance(double x, double y){
		return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
	}
}