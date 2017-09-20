import java.math.BigDecimal;

public class Exercise10_20{

	public static BigDecimal getE(BigDecimal v){
		BigDecimal one = new BigDecimal("1");
		BigDecimal e = new BigDecimal("0.0");
		for (BigDecimal i = one; i.compareTo(v) <= 0; i = i.add(one)) {
			BigDecimal denominator = i;
			for (BigDecimal k = i.subtract(one); 
				k.compareTo(one) >= 1; 
				k = k.subtract(one)) {
				denominator = denominator.multiply(k);
			}
			
			e = e.add(one.divide(denominator, 25, BigDecimal.ROUND_UP));  
		}
		return e;
	}
	
	public static void main(String[] args) {
		System.out.println("\n The e values for i = 100 to 1000:");
		System.out.println("-----------------------------------");
		System.out.println(" i                e");
		System.out.println("-----------------------------------");
		for (BigDecimal i = new BigDecimal("100"); i.compareTo(new BigDecimal("1000")) <= 0; i = i.add(new BigDecimal("100"))) {
			System.out.println(i + "    " + getE(i));
		}
	}
}
/*

		 The e values for i = 100 to 1000:
		-----------------------------------
		 i                e
		-----------------------------------
		100    1.7182818284590452353602960
		200    1.7182818284590452353603060
		300    1.7182818284590452353603160
		400    1.7182818284590452353603260
		500    1.7182818284590452353603360
		600    1.7182818284590452353603460
		700    1.7182818284590452353603560
		800    1.7182818284590452353603660
		900    1.7182818284590452353603760
		1000    1.7182818284590452353603860

 */