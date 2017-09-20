import java.math.BigInteger;

public class Exercise10_18{

	public static boolean isPrime(BigInteger i) {
		for (BigInteger d = new BigInteger("2"); 
			  d.compareTo(i.divide(new BigInteger("2"))) <= 0; 
			  d = d.add(new BigInteger("1"))) {
			if (i.remainder(d).compareTo(new BigInteger("0")) == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		BigInteger i = new BigInteger(Long.MAX_VALUE + "");
		int count = 0;
		final int NUMBER_OF_PRIMES = 5;

		System.out.println();
		while (count < NUMBER_OF_PRIMES) {
			i = i.add(new BigInteger("1"));
			if (isPrime(i)){
				count++;
				System.out.println(i);
			}
		}
	}
}