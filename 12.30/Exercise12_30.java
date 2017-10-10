import java.io.*;
import java.util.*;

public class Exercise12_30{
	public static void main(String[] args) throws Exception {
		File file = new File(getFileName());

		if (!file.exists()) {
			System.out.println("File " + file.getName() + " does not exist");
			System.exit(0);
		}
		int[] count = new int[26];

		try (
			Scanner input = new Scanner(file);
		) {
			while (input.hasNext()) {
				String line = (input.nextLine()).toUpperCase();
				countLetters(count, line);
			}
		}

		for (int i = 0; i < count.length; i++) {
			System.out.println("Number of " + (char)('A' + i) + "\'s: " + count[i]);
		}
	}

	public static void countLetters(int[] count, String str) {
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i)))
				count[(int)(str.charAt(i) - 'A')]++;
		}
	}

	public static String getFileName() {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a filename: ");
		return input.next();
	}
}
/*
	Enter a filename: Lincoln.txt
	Number of A's: 102
	Number of B's: 14
	Number of C's: 31
	Number of D's: 58
	Number of E's: 165
	Number of F's: 27
	Number of G's: 28
	Number of H's: 80
	Number of I's: 68
	Number of J's: 0
	Number of K's: 3
	Number of L's: 42
	Number of M's: 13
	Number of N's: 77
	Number of O's: 92
	Number of P's: 15
	Number of Q's: 1
	Number of R's: 79
	Number of S's: 43
	Number of T's: 126
	Number of U's: 21
	Number of V's: 24
	Number of W's: 28
	Number of X's: 0
	Number of Y's: 10
	Number of Z's: 0

 */