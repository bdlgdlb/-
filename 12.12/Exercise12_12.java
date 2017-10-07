import java.io.*;
import java.util.*;

public class Exercise12_12{
	public static void main(String[] args) throws Exception{
		if (args.length != 1) {
			System.out.println("Usage: java Exercise12_12  sourceFile");
			System.exit(1);
		}

		File file = new File(args[0]);
		if (! file.exists()) {
			System.out.println("Source file " + args[0] + " does not exisit");
			System.exit(2);
		}

		ArrayList<String> list = new ArrayList<>();
		try(
			Scanner input = new Scanner(file);
			){
			String s1 = input.nextLine();
			while (input.hasNext()) {
				
				String s2 = input.nextLine();
				if (s2.length() > 0 && s2.charAt(s2.length() - 1) == '{') {
					list.add(s1.concat(" {"));
					s1 = input.nextLine();
				}
				else{
				 list.add(s1);
				 s1 = s2;
				}
			}
			list.add(s1);
		}

		try(
			PrintWriter output = new PrintWriter(args[0]);
			){
			for (int i = 0; i < list.size(); i++) {
				output.println(list.get(i));
			}
		}
	}
}