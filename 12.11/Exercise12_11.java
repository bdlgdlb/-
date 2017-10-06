import java.io.*;
import java.util.*;

public class Exercise12_11{
	public static void main(String[] args) throws Exception {
		if (args.length != 2) {
			System.out.println("Usage: java RemoveText filename");
			System.exit(1);
		}

		File file = new File(args[1]);
		if (!file.exists()) {
			System.out.println("File " + args[1] + " does not exist");
			System.exit(2);
		}
		ArrayList<String> s = new ArrayList<>();
		try(
			Scanner input = new Scanner(file);
			
			){
			while (input.hasNext()){
				String s1 = input.nextLine();
				String s2 = s1.replaceAll(args[0], "");
				if(s2.length() != 0 || s1.equals(args[0])){
					s.add(s2);
				}
				else{
					s.add(s1);
				}	
			}
		}

		try(
			PrintWriter output = new PrintWriter(file);
			){
			for (int i = 0; i < s.size(); i++) {
				output.println(s.get(i));
			}
		}
	}
}