public class MyRectangle2D{
	private double x;
	private double y;
	private double width;
	private double height;

	public MyRectangle2D(){
		x = 0;
		y = 0;
		width = 1;
		height = 1;
	}

	public MyRectangle2D(double x, double y, double width, double height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public static MyRectangle2D getRectangle(double[][] points){
		double maxX;
		double minX;
		double maxY;
		double minY;

		maxX = minX = points[0][0];
		maxY = minY = points[0][1];

		for (int i = 0; i < points.length; i++) {
			if (points[i][0] > maxX)
				maxX = points[i][0];
			if (points[i][0] < minX) 
				minX = points[i][0];
		}

		for (int i = 0; i < points.length; i++) {
			if (points[i][1] > maxY)
				maxY = points[i][1];
			if (points[i][1] < minY) 
				minY = points[i][1];
		}

		double x = (maxX + minX) / 2;
		double y = (maxY + minY) / 2;

		double width = Math.abs(maxX - minX);
		double height = Math.abs(maxY - minY);

		return new MyRectangle2D(x, y, width, height);
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

	public double getWidth(){
		return width;
	}

	public void setWidth(double width){
		this.width = width;
	}

	public double getHeight(){
		return height;
	}

	public void setHeight(double height){
		this.height = height;
	}

	public double getAreac(){
		return width * height;
	}

	public double getPerimeter(){
		return (width + height) * 2;
	}

	public boolean contains(double x, double y){
		return (Math.abs(this.x - x) <= width / 2) && (Math.abs(this.y - y) <= height / 2);
	}

	public boolean contains(MyRectangle2D r){
		return (Math.abs(this.x - r.getX()) <= (width - r.getWidth()) / 2) && 
			   (Math.abs(this.y - r.getY()) <= (height - r.getHeight()) / 2);
	}

	public boolean overlaps(MyRectangle2D r){
		return (Math.abs(this.x - r.getX()) < (width + r.getWidth()) / 2) ||
			   (Math.abs(this.y - r.getY()) < (height + r.getHeight()) / 2); 	
	}
}