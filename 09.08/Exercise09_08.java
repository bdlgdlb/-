public class Exercise09_08{
	public static void main(String[] args) {
		final int SLOW = 1;
		final int MEDIUM = 2;
		final int FAST = 3;
		
		Fan fan1 = new Fan();

		fan1.setSpeed(FAST);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.turnOn();
		System.out.println(fan1.toString());

		Fan fan2 = new Fan();
		fan2.setSpeed(MEDIUM);
		fan2.setRadius(5);
		fan2.setColor("blue");
		fan2.turnOff();
		System.out.println(fan2.toString());
	}
}

class Fan{
	final static int SLOW = 1;
	final static int MEDIUM = 2;
	final static int FAST = 3;
	private int speed;
	private boolean on;
	private double radius;
	private String color;

	Fan(){
		speed = SLOW;
		on = false;
		radius = 5;
		color = "blue";
	}
	public String getSpeed(){
		String s = "";
		switch (speed) {
			case SLOW: s = "SLOW"; break;
			case MEDIUM: s = "MEDIUM"; break;
			case FAST: s = "FAST";
		}
		return s;
	}

	public void setSpeed(int speed){
		this.speed = speed;
	}

	public boolean isOn(){
		return on;
	}

	public void turnOn(){
		on = true;
	}

	public void turnOff(){
		on = false;
	}

	public double getRadius(){
		return radius;
	}

	public void setRadius(double radius){
		this.radius = radius;
	}

	public String getColor(){
		return color;
	}

	public void setColor(String color){
		this.color = color;
	}

	public String toString() {
		if (on == true) {
			return ("\nFan speed: " + getSpeed() + ", color: " + color + 
					 ", radius: " + radius + "\n");
		}
		else{
			return ("\nFan color: " + color + ", radius: " + radius +
					 "\nfan is off\n");
		}
	}
}

/*

	Fan speed: FAST, color: yellow, radius: 10.0


	Fan color: blue, radius: 5.0
	fan is off

 */