public class Exercise10_28{
	public static void main(String[] args) {
		char[] chars = {'I', 'n', 's', 'e', 'r', 't'}; 

		MyStringBuilder2 str1 = new MyStringBuilder2("testString");
		MyStringBuilder2 str2 = new MyStringBuilder2(chars);

		System.out.print("\nInsert string 2 into string 1 at index 3: ");
		MyStringBuilder2 str3 = str1.insert(3, str2);
		System.out.println(str3);

		System.out.println("\nReverse string 1: " + str1.reverse());

		System.out.println("\nSubstring of string 3 beginning index 10: " + 
			str3.substring(10));

		System.out.println("\nString 2 to upper case: " + str2.toUpperCase());
	}
}
/*

	Insert string 2 into string 1 at index 3: tesInserttString

	Reverse string 1: gnirtStset

	Substring of string 3 beginning index 10: String

	String 2 to upper case: INSERT

 */