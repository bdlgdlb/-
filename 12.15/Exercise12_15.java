import java.io.*;
import java.util.*;

public class Exercise12_15{
	public static void main(String[] args) throws Exception {
		File file = new File("Exercise12_15.txt");

		if (file.exists()) {
			System.out.println("File already exists");
			System.exit(0);
		}

		try(
			PrintWriter output = new PrintWriter(file);
		){
			for (int i = 0; i < 100; i++) {
				int a = (int)(Math.random() * 200) + 1;
				output.print(a);
				output.print(" ");
			}
			
		}

		ArrayList<Integer> list = new ArrayList<>();

		try(
			Scanner input = new Scanner(file);
		){
			while(input.hasNext()){
				list.add(input.nextInt());
			}
		}

		Collections.sort(list);

		System.out.print(list.toString());
		System.out.println();
	}
}