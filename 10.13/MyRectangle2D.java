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
		return (Math.abs(this.x - x) <= height / 2) && (Math.abs(this.y - y) <= width / 2);
	}

	public boolean contains(MyRectangle2D r){
		return (Math.abs(this.x - r.getX()) <= (height - r.getHeight()) / 2) && 
			   (Math.abs(this.y - r.getY()) <= (width - r.getWidth()) / 2);
	}

	public boolean overlaps(MyRectangle2D r){
		return (Math.abs(this.x - r.getX()) < (height + r.getHeight()) / 2) ||
			   (Math.abs(this.y - r.getY()) < (width + r.getWidth()) / 2); 	
	}
}