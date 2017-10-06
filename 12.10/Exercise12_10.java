public class Exercise12_10{
	public static void main(String[] args) {
		int length = 1200000000;
		try {
			byte[] array = new byte[length];
		}
		catch (OutOfMemoryError ex) { 
			System.out.println(ex.getMessage());
		}
		
		System.out.println("Error handled program continues... ");
	}
}

/*
	Java heap space
	Error handled program continues...

 */