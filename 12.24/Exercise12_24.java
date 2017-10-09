import java.io.*;
import java.util.*;

public class Exercise12_24{
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("Salary.txt");
		if (file.exists()) {
			System.out.println("File " + file.getName() + " already exists");
			System.exit(0);
		}

		String rank = "";
		double salary;

		try(
			PrintWriter output = new PrintWriter(file);
		){
			for (int i = 0; i < 1000; i++) {
				output.print("FirstName" + i + " LastName" + i + " ");
				rank = getRank();
				salary = getSalary(rank);
				output.printf(" " + rank + " %.2f\n", salary);
			}
		}
	}

	public static String getRank(){
		String[] rank = {"assistant", "associate", "full"};
		return rank[(int)(Math.random() * rank.length)];
	}

	public static double getSalary(String rank){
		if (rank.equals("assistant")) {
			return 50000 + (double)(Math.random() * 30001);
		}
		else if (rank.equals("associate")) {
			return 60000 + (double)(Math.random() * 50001);
		}
		else{
			return 75000 + (double)(Math.random() * 55001);
		}
	}
}