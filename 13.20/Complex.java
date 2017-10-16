public class Complex implements Cloneable {
	
	private double a;
	private double b;

	public Complex() {
		this(0, 0);
	}

	public Complex(double a) {
		this(a, 0);
	}

	public Complex(double a, double b) {
		this.a = a;
		this.b = b;
	}

	/** Return real part of complex number */
	public double getRealPart() {
		return a;
	}

	/** Return imaginary part of complex number */
	public double getImaginaryPart() {
		return b;
	}

	/** Add a complex number to this complex number */
	public Complex add(Complex secondComplex) {
		return new Complex(a + secondComplex.a, b + secondComplex.b);
	}

	/** Subtract a complex number from this complex number */
	public Complex subtract(Complex secondComplex) {
		return new Complex(a - secondComplex.a, b - secondComplex.b); 
	}

	/** Multiply a complex number by this complex number */
	public Complex multiply(Complex secondComplex) {
		return new Complex(a * secondComplex.a - b * secondComplex.b,
			b * secondComplex.a + a * secondComplex.b);
	}

	/** Divide a complex number by this complex number */
	public Complex divide(Complex secondComplex) {
		return new Complex((a * secondComplex.a + b * secondComplex.b) /
			(Math.pow(secondComplex.a, 2) + Math.pow(secondComplex.b, 2)),
			(b * secondComplex.a - a * secondComplex.b) /
			(Math.pow(secondComplex.a, 2) +  Math.pow(secondComplex.b, 2)));
	}

	/** Returns the absolute value of this complex number */
	public double abs() {
		return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
	}

	@Override /** Override the protectec clone method defined in
		the Object class, and strengthen its accexxibility */
	public Complex clone() throws CloneNotSupportedException {
		return (Complex)super.clone();
	}


	@Override /** Retrun a string description 
		of this complex number */
	public String toString() {
		return b == 0 ? a + "" : "(" + a + " + " + b + "i)";
	}
}