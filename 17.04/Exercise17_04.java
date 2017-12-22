import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class Exercise17_04 {

	public static void main(String[] args) throws IOException {
		//1.检查命令行命令输入是否标准
		if (args.length != 2){
			System.out.println("Usage: java Exercise_17_04 SourceFile TargetFile");
			System.exit(1);
		}
		//2.检查源文件是否存在
		
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
