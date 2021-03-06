import java.util.Scanner;

public class Exercise12_07{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the binary number: ");
		String binary = input.nextLine();

		try{
			System.out.println("The decimal value for binary number " + binary + " is " + bin2Dec(binary));
		}
		catch(NumberFormatException ex){
			System.out.println(ex.getMessage());
		}
	}

	public static int bin2Dec(String binaryString) throws NumberFormatException {
		int decimal = 0;
		for (int i = 0, j = binaryString.length() - 1; 
			i < binaryString.length(); i++, j--) {
			if (binaryString.charAt(i) < '0' || binaryString.charAt(i) > '1')
				throw new NumberFormatException("The string is not a binary string");
			decimal += (Integer.parseInt(String.valueOf(binaryString.charAt(i)))) 
				* Math.pow(2, j);
		}
		return decimal;
	} 
}
/*
		Enter the binary number: 1001
		The decimal value for binary number 1001 is 9

 */