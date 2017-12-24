import java.io.IOException;
import java.io.RandomAccessFile;


public class Exercise17_08 {

	public static void main(String[] args) throws IOException {
		try(
			RandomAccessFile inout = new RandomAccessFile("Exercise17_08.dat", "rw");
		){
			int count = 0;
			
			if(inout.length() > 0)
				count = inout.readInt();
			
			inout.seek(0);
			inout.writeInt(++count);
			System.out.println("Current count is " + count);
		}
	}

}
