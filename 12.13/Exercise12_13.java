import java.io.*;
import java.util.*;

public class Exercise12_13{
	public static void main(String[] args) throws Exception {
		if(args.length != 1){
			System.out.println("Usage: java Exercise12_13  sourceFile");
			System.exit(1);
		}

		File file = new File(args[0]);
		if (!file.exists()) {
			System.out.println("Source file " + args[0] + " does not exisit");
			System.exit(2);
		}


		int characters = 0;
		int words = 0;
		int lines = 0;
		try(
			Scanner input = new Scanner(file); 
		){

			while(input.hasNext()){
				String s = input.nextLine();
				characters += s.length();
				lines++;
			}
		}

		try(
			Scanner input = new Scanner(file);
		){
			while (input.hasNext()) {
				String s = input.next();
				words++;
			}
		}
		System.out.println("File " + args[0] + " has ");		
		System.out.println(characters + " characters");
		System.out.println(words + " words");
		System.out.println(lines + " lines");
	}
}