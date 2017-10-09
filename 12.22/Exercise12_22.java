import java.io.*;
import java.util.*;

public class Exercise12_22{
	public static void main(String[] args) throws FileNotFoundException  {
		if (args.length != 3) {
			System.out.println("Usage: Java Exercise12_22 dir oldString newString");
			System.exit(1);
		}

		File file = new File(args[0]);
		if (!file.isDirectory()) {
			System.out.println("Directory " + args[1] + " does not exist");
			System.exit(2);
		}

		File[] files = file.listFiles();

		for (File e : files ) {
			replaceText(e, args);
		}
	}

	public static void replaceText(File file, String[] args)
				throws FileNotFoundException {
		ArrayList<String> list = new ArrayList<>();

		try(
			Scanner input = new Scanner(file);		
		){
			while (input.hasNext()) {
				String s1 = input.nextLine();
				list.add(s1.replaceAll(args[1], args[2]));
			}
		}

		try(
			PrintWriter output = new PrintWriter(file);
		){
			for (int i = 0; i < list.size(); i++) {
				output.println(list.get(i));
			}
		}
	}
}