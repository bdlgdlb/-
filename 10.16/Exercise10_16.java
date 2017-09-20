import java.math.*;

public class Exercise10_16{
	public static void main(String[] args) {
		int count = 0;
		BigInteger n = new BigInteger(
			"10000000000000000000000000000000000000000000000000");
		BigInteger z = new BigInteger("0");

		while (count < 10) {
			if (z.compareTo(n.remainder(new BigInteger("2"))) == 0 || 
				z.compareTo(n.remainder(new BigInteger("3"))) == 0) {
				System.out.println(n);
				count++;
			}
			n = n.add(new BigInteger("1"));
		}
	}
}
/*
	10000000000000000000000000000000000000000000000000
	10000000000000000000000000000000000000000000000002
	10000000000000000000000000000000000000000000000004
	10000000000000000000000000000000000000000000000005
	10000000000000000000000000000000000000000000000006
	10000000000000000000000000000000000000000000000008
	10000000000000000000000000000000000000000000000010
	10000000000000000000000000000000000000000000000011
	10000000000000000000000000000000000000000000000012
	10000000000000000000000000000000000000000000000014

 */