import java.io.*;
import java.util.*;

public class Exercise12_14{
	public static void main(String[] args) throws Exception {
		if (args.length != 1) {
			System.out.println("Usage: java Exercise12_14  sourceFile");
			System.exit(1);
		}

		File file = new File(args[0]);
		if (!file.exists()) {
			System.out.println("Source file " + args[0] + " does not exisit");
			System.exit(2);
		}

		double sum = 0;
		int count = 0;

		try(
			Scanner input = new Scanner(file);
		){
			while (input.hasNext()) {
				String s1 = input.next();
				String[] s2 = s1.split("/");
				Integer a = new Integer(s2[0]);
				Integer b = new Integer(s2[1]);
				sum += a.doubleValue() / b.doubleValue();
				count++;
			}
		}

		System.out.println("The sum is " + sum + " and average value is " + sum/count);

	}
}