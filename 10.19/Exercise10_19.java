import java.math.BigInteger;

public class Exercise10_19{

	public static BigInteger mersennePrime(BigInteger n) {
		BigInteger two = new BigInteger("2");
		BigInteger x = new BigInteger("2");
		for (BigInteger i = new BigInteger("1"); i.compareTo(n) < 0; 
			i = i.add(new BigInteger("1"))) {
			x = x.multiply(two);
		}
		return x.subtract(new BigInteger("1")); 
	}

	public static boolean isPrime(BigInteger n) {
		for (BigInteger d = new BigInteger("2"); 
			  d.compareTo(n.divide(new BigInteger("2"))) <= 0; 
			  d = d.add(new BigInteger("1"))) {
			if (n.remainder(d).compareTo(new BigInteger("0")) == 0) { 
				return false; 
			}
		}
		return true; 
	}

	public static void main(String[] args) {
		System.out.println("p       2^p - 1");

		for (BigInteger p = new BigInteger("2"); 
			p.compareTo(new BigInteger("100")) <= 0; 
			p = p.add(new BigInteger("1"))) {
			if (isPrime(p)) {
				System.out.printf("%-3d", p);
				System.out.println("       " + mersennePrime(p));
			}
		}
	}
}

/*
	p       2^p - 1
	2         3
	3         7
	5         31
	7         127
	11        2047
	13        8191
	17        131071
	19        524287
	23        8388607
	29        536870911
	31        2147483647
	37        137438953471
	41        2199023255551
	43        8796093022207
	47        140737488355327
	53        9007199254740991
	59        576460752303423487
	61        2305843009213693951
	67        147573952589676412927
	71        2361183241434822606847
	73        9444732965739290427391
	79        604462909807314587353087
	83        9671406556917033397649407
	89        618970019642690137449562111
	97        158456325028528675187087900671

 */