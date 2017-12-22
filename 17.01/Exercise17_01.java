import java.io.File;
import java.io.IOException;
import java.util.Formatter;

public class Exercise17_01 {

	public static void main(String[] args) throws IOException {
		File file = new File("Exercise17_01.txt");
		
		try(
			Formatter output = new Formatter(file);
		){
			for (int i = 0; i < 100; i++) {
				output.format("%d ", ((int)(Math.random() * 100)));
				output.flush();
			}
			
		}
	}
}
