import java.awt.geom.Line2D;

public class Triangle2D{
	private MyPoint p1;
	private MyPoint p2;
	private MyPoint p3;

	public Triangle2D(){
		p1 = new MyPoint(0, 0);
		p2 = new MyPoint(1, 1);
		p3 = new MyPoint(2, 5);
	}

	public Triangle2D(double x1, double y1, double x2, double y2, double x3, double y3){
		p1 = new MyPoint(x1, y1);
		p2 = new MyPoint(x2, y2);
		p3 = new MyPoint(x3, y3);
	}

	public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3){
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	public MyPoint getP1(){
		return p1;
	}

	public void setP1(MyPoint p1){
		this.p1 = p1;
	}

	public void setP1(double x, double y){
		p1 = new MyPoint(x, y);
	}

	public MyPoint getP2(){
		return p2;
	}

	public void setP2(MyPoint p2){
		this.p2 = p2;
	}

	public void setP2(double x, double y){
		p2 = new MyPoint(x, y);
	}

	public MyPoint getP3(){
		return p2;
	}

	public void setP3(MyPoint p3){
		this.p3 = p3;
	}

	public void setP3(double x, double y){
		p3 = new MyPoint(x, y);
	}

	public double getArea(){
		double s;
		s = (p1.distance(p2) + p1.distance(p3) + p2.distance(p3)) / 2;
		return Math.sqrt(s * (s - p1.distance(p2)) * (s - p1.distance(p3)) * (s - p2.distance(p3)));
	}

	public double getPerimeter(){
		return (p1.distance(p2) + p1.distance(p3) + p2.distance(p3));
	}

	public boolean contains(double x, double y){
		double maxX = Math.max(p1.getX(), Math.max(p2.getX(), p3.getX()));
 		double minX = Math.min(p1.getX(), Math.min(p2.getX(), p3.getX()));
		double maxY = Math.max(p1.getY(), Math.max(p2.getY(), p3.getY()));
		double minY = Math.min(p1.getY(), Math.min(p2.getY(), p3.getY()));

		if (x < minX || x > maxX || y < minY || y > maxY) {
	      return false;  
	    }

	    Line2D side1 = new Line2D.Double(p1.getX(), p1.getY(), p2.getX(), p2.getY());
	    Line2D side2 = new Line2D.Double(p1.getX(), p1.getY(), p3.getX(), p3.getY());
	    Line2D side3 = new Line2D.Double(p2.getX(), p2.getY(), p3.getX(), p3.getY());

      	double topY = -10;
	    if (x == p1.getX()) {
	      topY = p1.getY();
	    } 
	    else if (x == p2.getX()) {
	      topY = p2.getY();
	    } 
	    else if (x == p3.getX()) {
	      topY = p3.getY();
	    } 
	    
	    Line2D line;
	    if (y < topY) 
	      line = new Line2D.Double(x, y, x, minY);
	    else  
	      line = new Line2D.Double(x, y, x, maxY);
	    
	    int hits = 0;
	    if (line.intersectsLine(side1))
	      hits++;
	    
	    if (line.intersectsLine(side2))
	      hits++;
	    
	    if (line.intersectsLine(side3))
	      hits++;
	    
	    if (hits % 2 == 0) 
	      return false;
	    else 
	      return true;
	}

	public boolean contains(MyPoint p){
		return contains(p.getX(), p.getY());
	}


	public boolean contains(Triangle2D t){
		return contains(t.getP1().getX(), t.getP1().getY()) &&
      		   contains(t.getP2().getX(), t.getP2().getY()) &&
      		   contains(t.getP3().getX(), t.getP3().getY());
	}


	public boolean overlaps(Triangle2D t){
		Line2D line1 = new Line2D.Double(t.p1.getX(), t.p1.getY(), t.p2.getX(), t.p2.getY());
		Line2D line2 = new Line2D.Double(t.p1.getX(), t.p1.getY(), t.p3.getX(), t.p3.getY());
		Line2D line3 = new Line2D.Double(t.p2.getX(), t.p2.getY(), t.p3.getX(), t.p3.getY());

		Line2D side1 = new Line2D.Double(p1.getX(), p1.getY(), p2.getX(), p2.getY());
		Line2D side2 = new Line2D.Double(p1.getX(), p1.getY(), p3.getX(), p3.getY());
		Line2D side3 = new Line2D.Double(p2.getX(), p2.getY(), p3.getX(), p3.getY());

		return  contains(t) || t.contains(this) ||
				line1.intersectsLine(side1) || 
		        line1.intersectsLine(side2) || 
		        line1.intersectsLine(side3) || 
		        line2.intersectsLine(side1) || 
		        line2.intersectsLine(side2) || 
		        line2.intersectsLine(side3) ||
		        line3.intersectsLine(side1) || 
		        line3.intersectsLine(side2) || 
		        line3.intersectsLine(side3);
		    
	}
}