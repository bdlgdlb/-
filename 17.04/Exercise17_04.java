import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class Exercise17_04 {

	public static void main(String[] args) throws IOException {
		//1.������������������Ƿ��׼
		if (args.length != 2){
			System.out.println("Usage: java Exercise_17_04 SourceFile TargetFile");
			System.exit(1);
		}
		//2.���Դ�ļ��Ƿ����
		
		File file = new File(args[0]);
		if (!file.exists()){
			System.out.println("The File " + args[0] + " does not exist.");
			System.exit(2);
		}
		
		try(
			Scanner input = new Scanner(file);
			DataOutputStream output = new DataOutputStream(new FileOutputStream(args[1]));
		){
			while (input.hasNext()){
				output.writeUTF(input.nextLine());
			}
		}
		
	}

}
