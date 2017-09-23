public class Exercise10_23{

	public static void print(MyString2 str) {
		print(str.toChars());
	}

	public static void print(char[] chars) {
		for (int i = 0; i < chars.length; i++) {
			System.out.print(chars[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		MyString2 str1 = new MyString2("test1");
		MyString2 str2 = new MyString2("abcdefghijklm");

		System.out.println("\nCompare str1 to \"test1\":");
		System.out.println(str1.compare("test1"));

		System.out.println("\nDisplay a substring if str2 beginning at index 5:");
		print(str2.substring(5));

		System.out.println("\nConvert str2 to upper case:");
		print(str2.toUpperCase());

		System.out.println("\nDisplay the boolean value true as a MyStirng2 object:");
		print(MyString2.valueOf(true)); 
	}
}

/*

	Compare str1 to "test1":
	0

	Display a substring if str2 beginning at index 5:
	fghijklm

	Convert str2 to upper case:
	ABCDEFGHIJKLM

	Display the boolean value true as a MyStirng2 object:
	true

 */