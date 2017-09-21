public class Exercise10_22{
	public static void main(String[] args) {
		char[] test = {'T', 'e', 'S', 't'};
		char[] test2 = {'T', 'e', 'S', 't', '2'};

		MyString1 str = new MyString1(test);
		MyString1 str2 = new MyString1(test2);

		System.out.println("\nCharacter at index 1 of MyString1 object 1: " 
			+ str.charAt(1));

		System.out.println("\nLength of MyString1 object 1: " + str.length());

		System.out.println("\nSubstring from index 2 to 4 of MyString1 object 1: ");
		MyString1 substr = str.substring(2,4);
		for (int i = 0; i < substr.length(); i++) {
			System.out.print(substr.charAt(i));		
		}
		System.out.println();

		System.out.println("\nMyString1 object 1 to lowercase:");
		MyString1 lower = str.toLowerCase();
		for (int i = 0; i < lower.length(); i++) {
			System.out.print(lower.charAt(i));		
		}
		System.out.println();

		System.out.println("\nMyString1 object 1 is equal to MyString1 object 2? " 
			+ str.equals(str2));

		System.out.println("\nDisplay the integer 145 as a MyString1 object: ");
		MyString1 value = str.valueOf(145);
		for (int i = 0; i < value.length(); i++) {
			System.out.print(value.charAt(i));		
		}
		System.out.println();

	}
}

/*

		Character at index 1 of MyString1 object 1: e

		Length of MyString1 object 1: 4

		Substring from index 2 to 4 of MyString1 object 1:
		St

		MyString1 object 1 to lowercase:
		test

		MyString1 object 1 is equal to MyString1 object 2? false

		Display the integer 145 as a MyString1 object:
		145

 */