public class Circle2D{
	private double x;
	private double y;
	private double radius;

	public Circle2D(){
		x = 0;
		y = 0;
		radius = 1;
	}

	public Circle2D(double x, double y, double radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public double getX(){
		return x;
	}

	public double getY(){
		return y;
	}

	public double getRadius(){
		return radius;
	}

	public double getArea(){
		return Math.PI * radius * radius;
	}

	public double getPerimeter(){
		return 2 * Math.PI * radius;
	}

	//�����ĵ��Ƿ���Բ��
	public boolean contains(double x, double y){
		double l = Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));

		if(l <= radius){
			return true;
		}
		else {
			return false;
		}
	}

	//������Բ�Ƿ���Բ��
	public boolean contains(Circle2D circle){
		//����Բ��Բ��
		double a = circle.getX();
		double b = circle.getY();
		//����Բ��Բ�ĵ���ǰԲ��Բ�ĵľ���
		double l = Math.sqrt(Math.pow((x - a),2) + Math.pow((y - b),2));

		if (l <= radius - circle.getRadius()){
			return true;
		}
		else{
			return false;
		}
	}

	public boolean overlaps(Circle2D circle){
		return ((x == circle.getX()) && (y == circle.getY()));
	}
}