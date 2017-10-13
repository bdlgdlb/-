public abstract class GeometricObject implements Comparable<GeometricObject>{
	private String color = "while";
	private boolean filled;
	private java.util.Date dateCreated;

	protected GeometricObject() {
		dateCreated = new java.util.Date();
	}

	protected GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	@Override
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color +
			" and filled: " + filled;
	}

	@Override
	public int compareTo(GeometricObject o){
		if (this.getArea() > o.getArea()) 
			return 1;
		else if (this.getArea() == o.getArea())
			return 0;
		else
			return -1;
	}

	public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
		return o1.compareTo(o2) == 1 ? o1 : o2;
	}

	public abstract double getArea();

	public abstract double getPerimeter();
}