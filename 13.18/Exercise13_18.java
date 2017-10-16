import java.math.BigInteger;

public class Exercise13_18 {
	public static void main(String[] args) {
		Rational r = new Rational(BigInteger.ONE, new BigInteger("2"));

		// Add a series of Rationol objects to r
		for (BigInteger i = r.getNumerator().add(BigInteger.ONE);
			  i.compareTo(new BigInteger("100")) <= 0;
			  i = i.add(BigInteger.ONE)) {
			r = r.add(new Rational(i, i.add(BigInteger.ONE)));
		}

		// Display results
		System.out.println(r);
	}
}