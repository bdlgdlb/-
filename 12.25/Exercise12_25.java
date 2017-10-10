import java.io.*;
import java.util.*;

public class Exercise12_25{
	public static void main(String[] args) throws Exception {
		ArrayList<Double> assistant = new ArrayList<>();
		ArrayList<Double> associate = new ArrayList<>();
		ArrayList<Double> full = new ArrayList<>();

		try{
			java.net.URL url = new java.net.URL(
				"http://cs.armstrong.edu/liang/data/Salary.txt");
			Scanner input = new Scanner(url.openStream());
			while (input.hasNext()) {
				String[] line = (input.nextLine()).split(" ");
				processData(assistant, associate, full, line[2], 
					new Double(line[3]));
			}
		}
		catch (java.net.MalformedURLException ex) {
			System.out.println("Invalid URL");
			System.exit(0);
		}
		catch (java.io.IOException ex) {
			System.out.println("I/O Errors: no such file");
			System.exit(1);
		}

		double totalAssistant = getTotal(assistant);
		double totalAssociate = getTotal(associate);
		double totalFull = getTotal(full);
		double totalFaculty = (totalAssistant + totalAssociate + totalFull);

		System.out.println("\n   Total salary");
		System.out.println("---------------------");
		System.out.printf("Assistant professors: $%.2f\n", totalAssistant);
		System.out.printf("Associate professors: $%.2f\n", totalAssociate);
		System.out.printf("Full professors:      $%.2f\n", totalFull);
		System.out.printf("All faculty:          $%.2f\n", totalFaculty);

		System.out.println("\n   Average salary");
		System.out.println("---------------------");
		System.out.printf("Assistant professors: $%.2f\n", 
			(totalAssistant / assistant.size()));
		System.out.printf("Associate professors: $%.2f\n", 
			(totalAssociate / associate.size()));
		System.out.printf("Full professors:      $%.2f\n", 
			(totalFull / full.size()));
		System.out.printf("All faculty:          $%.2f\n", 
			(totalFaculty / (assistant.size() + associate.size() + full.size())));

	}

	public static double getTotal(ArrayList<Double> a){
		double sum = 0;
		for (int i = 0; i < a.size(); i++) {
			sum += a.get(i);
		}
		return sum;
	}

	public static void processData(ArrayList<Double> a, ArrayList<Double> b,
			 ArrayList<Double> c, String rank, double salary){
		if (rank.equals("assistant")) {
			a.add(salary);
		}
		else if(rank.equals("associate")){
			b.add(salary);
		}
		else{
			c.add(salary);
		}
	}
}

/*

	   Total salary
	---------------------
	Assistant professors: $20246511.91
	Associate professors: $28844146.58
	Full professors:      $35678051.41
	All faculty:          $84768709.90

	   Average salary
	---------------------
	Assistant professors: $65949.55
	Associate professors: $83849.26
	Full professors:      $102229.37
	All faculty:          $84768.71

 */