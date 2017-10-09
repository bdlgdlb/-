import java.io.*;
import java.util.*;

public class Exercise12_17{
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);

		String play;
		do {
			// 随机生成一个单词
			char[] word = getWord();
			
			// 用星号显示每个字母
			char[] asterisks = new char[word.length];
			fillAsterisks(asterisks);

			int missed = 0; // 猜错的次数
			do {
				// Prompt the user to guess one letter
				char guess = getGuess(asterisks);		
				
				// 检查字母是否正确
				if (!isCorrectGuess(word, asterisks, guess))
					missed++;
					
			} while (!isWordFinish(asterisks));
			
			// 打印结果
			print(word, missed);
			
			// 询问用户是否要进行下一次猜单词
			System.out.println("Do you want to guess another word? Enter y or n>");
			play = input.next();

		} while (play.charAt(0) == 'y');
	}
	/** getWord 从文件中随机选一个单词生成 */
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

		//随机选一个单词
		String s = list.get((int) (Math.random()* list.size()));

		char[] word = s.toCharArray();
		return word;
	}

	/** 返回文件对象 */
	public static File openFile() throws FileNotFoundException {
		File file = new File("hangman.txt");

		if (!file.exists()) {
			System.out.print("File " + file.getName() + " does not exist");
			System.exit(1);
		}
		return file;
	}

	/** fillAsterisks 用星号对单词初始化 */
	public static void fillAsterisks(char[] array){
		for (int i = 0; i < array.length; i++) {
			array[i] = '*';
		}
	}

	/** 检查用户是否猜对 */
	public static boolean isCorrectGuess(char[] word, char[] blanks, char guess) {
		boolean correct = false;
		int message = 2;
		for (int i = 0; i < word.length; i++) {
			if (word[i] == guess) {
				correct = true;
				if (blanks[i] == guess)
					message = 1;
				else { 
					blanks[i] = guess; // 将实际的字母显示出来
					message = 0;
				}
			}
		}
		if (message > 0)
			print(message, guess);
		return correct;
	}

	/** 检查单词是否猜完 */
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

	/** 用户每猜一个单词都提示一遍 */
	public static char getGuess(char[] asterisks){
		Scanner input = new Scanner(System.in);
		System.out.print("(Guess) Enter a letter in word ");
		System.out.print(asterisks);
		System.out.print(" > ");
		String g = input.next();
		return g.charAt(0);
	}
}