import java.io.*;
import java.util.*;

public class Exercise12_17{
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);

		String play;
		do {
			// �������һ������
			char[] word = getWord();
			
			// ���Ǻ���ʾÿ����ĸ
			char[] asterisks = new char[word.length];
			fillAsterisks(asterisks);

			int missed = 0; // �´�Ĵ���
			do {
				// Prompt the user to guess one letter
				char guess = getGuess(asterisks);		
				
				// �����ĸ�Ƿ���ȷ
				if (!isCorrectGuess(word, asterisks, guess))
					missed++;
					
			} while (!isWordFinish(asterisks));
			
			// ��ӡ���
			print(word, missed);
			
			// ѯ���û��Ƿ�Ҫ������һ�βµ���
			System.out.println("Do you want to guess another word? Enter y or n>");
			play = input.next();

		} while (play.charAt(0) == 'y');
	}
	/** getWord ���ļ������ѡһ���������� */
	public static char[] getWord() throws FileNotFoundException {
		File file = openFile();
		
		ArrayList<String> list = new ArrayList<>();
		try(
			Scanner input = new Scanner(file);
		){
			while(input.hasNext()){
				list.add(input.next());
			}
		}

		//���ѡһ������
		String s = list.get((int) (Math.random()* list.size()));

		char[] word = s.toCharArray();
		return word;
	}

	/** �����ļ����� */
	public static File openFile() throws FileNotFoundException {
		File file = new File("hangman.txt");

		if (!file.exists()) {
			System.out.print("File " + file.getName() + " does not exist");
			System.exit(1);
		}
		return file;
	}

	/** fillAsterisks ���ǺŶԵ��ʳ�ʼ�� */
	public static void fillAsterisks(char[] array){
		for (int i = 0; i < array.length; i++) {
			array[i] = '*';
		}
	}

	/** ����û��Ƿ�¶� */
	public static boolean isCorrectGuess(char[] word, char[] blanks, char guess) {
		boolean correct = false;
		int message = 2;
		for (int i = 0; i < word.length; i++) {
			if (word[i] == guess) {
				correct = true;
				if (blanks[i] == guess)
					message = 1;
				else { 
					blanks[i] = guess; // ��ʵ�ʵ���ĸ��ʾ����
					message = 0;
				}
			}
		}
		if (message > 0)
			print(message, guess);
		return correct;
	}

	/** ��鵥���Ƿ���� */
	public static boolean isWordFinish(char[] blanks) {
		for (char e: blanks) {
			if (e == '*')
				return false;
		}
		return true;
	}

	/** print overloaded */
	public static void print(char[] word, int missed) {
		System.out.print("The word is ");
		System.out.print(word);
		System.out.println(" You missed " + missed + 
			(missed > 1 ? " times" : " time"));
	}

	/** print overloaded */
	public static void print(int m, char guess) {
		System.out.print("\t" + guess);
		switch (m) {
			case 1 : System.out.println(" is already in the word"); break;
			case 2 : System.out.println(" is not in the word");
		}
	}

	/** �û�ÿ��һ�����ʶ���ʾһ�� */
	public static char getGuess(char[] asterisks){
		Scanner input = new Scanner(System.in);
		System.out.print("(Guess) Enter a letter in word ");
		System.out.print(asterisks);
		System.out.print(" > ");
		String g = input.next();
		return g.charAt(0);
	}
}