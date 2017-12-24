import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.Scanner;


public class Exercise17_07 {

	public static void main(String[] args) throws IOException, ClassNotFoundException  {
		try(
			ObjectInputStream input = new ObjectInputStream(new 
					BufferedInputStream(new FileInputStream("Exercise17_07.dat")));
		){
			while (true){
				Loan loan = (Loan)input.readObject();
				System.out.println(loan);
				System.out.printf("Total loan amount: $%.2f\n", 
						loan.getTotalPayment());
				System.out.println();
				
			}
		}
		catch (EOFException ex){
			
		}
		
	}

}