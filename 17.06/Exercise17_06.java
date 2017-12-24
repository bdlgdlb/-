import java.io.*;

public class Exercise17_06 {


	public static void main(String[] args) throws IOException {
		Loan loan1 = new Loan();
		Loan loan2 = new Loan(8.25, 5, 120000.95);
		Loan loan3 = new Loan(4.5, 4, 5000);
		Loan loan4 = new Loan(5.0, 5, 10000);
		Loan loan5 = new Loan(5.75, 5, 10000);
		try(
			 ObjectOutputStream output = new ObjectOutputStream(
					new BufferedOutputStream(new FileOutputStream("Exercise17_06.dat")));
		){
			output.writeObject(loan1);
			output.writeObject(loan2);
			output.writeObject(loan3);
			output.writeObject(loan4);
			output.writeObject(loan5);
		}
	}
}