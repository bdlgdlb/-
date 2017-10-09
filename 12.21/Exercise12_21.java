import java.io.*;
import java.util.*;

public class Exercise12_21{
	public static void main(String[] args) throws FileNotFoundException{
		File file = new File("SortedStrings.txt");

		if (!file.exists()) {
			System.out.println(file.getName() + " does not exist");
			System.exit(0);
		}

		System.out.println("File " + file.getName());
		boolean dataSorted = true;
		String s1 = ""; 
		String s2 = "";

		try(
			Scanner input = new Scanner(file);
		){
			if (input.hasNext()) {
				s1 = input.next();
			}
			while(input.hasNext() && dataSorted){
				s2 = input.next();

				if (s1.compareTo(s2) > 0) {
					System.out.println(
						"The strings " + s1 + " and " + s2 + 
						" are out of order");
					dataSorted = false;
				}
				s1 = s2;
			}
		}

		if (dataSorted) {
			System.out.println(
				"The strings in the file are stored in increasing order");
		}
	}
}