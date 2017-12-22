import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class Exercise17_03 {

	public static void main(String[] args) throws IOException {
		
		File file = new File("Exercise17_03.dat");
		
		try(
			DataOutputStream output = new DataOutputStream(new FileOutputStream(file,true));
		){
			for (int i = 0; i < 10; i++) {
				output.writeInt((int)(Math.random() * 100));
				output.flush();
			}
		}
		
		try(
			DataInputStream input = new DataInputStream(new FileInputStream(file));
		){
			int value;
			int sum = 0;
			try {
				while ((value = input.readInt()) != -1){
					sum += value;
					System.out.println(value);
				}
			} catch (IOException e) {
				System.out.println("¶ÁÈ¡½áÊø  sum = " + sum);
			}
			
		}
		
	}

}
