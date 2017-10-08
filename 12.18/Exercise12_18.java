import java.io.*;
import java.util.*;

public class Exercise12_18{
	public static void main(String[] args) throws Exception {
		if (args.length != 1) {
			System.out.println("Usage java Exercise12_18 srcRootDirectory");
			System.exit(1);
		}

		File rootDir = new File(args[0]);
		if (!rootDir.isDirectory()) {
			System.out.println("Directory " + args[0] + " does not exist");
			System.exit(2);
		}

		ArrayList<File> chapters = getDirectories(rootDir);
		
		while (!chapters.isEmpty()) {
			ArrayList<File> files = getFiles(chapters);

			insertStatement(files, chapters.get(0));

			chapters.remove(0);
		}
	}

	/** �ڱ��������ļ���һ�������� */
	public static void insertStatement(ArrayList<File> list, File dir) 
			throws Exception {
		for (int i = 0; i < list.size(); i++) {
			ArrayList<String> lines = new ArrayList<>();
			lines.add("package " + dir.getName() + ";");
			
			try (
				Scanner input = new Scanner(list.get(i));
			) {
				while (input.hasNext()) {
					lines.add(input.nextLine());
				}
			}

			try (
				PrintWriter output = new PrintWriter(list.get(i));
			) {
				for (int j = 0; j < lines.size(); j++) {
					output.println(lines.get(j));
				}
			}
		}
	}

	/** �����е�java�ļ����뵽���� */
	public static ArrayList<File> getFiles(ArrayList<File> dir) {
		if (!dir.get(0).isDirectory()) {
			System.exit(0);
		}
		ArrayList<File> list = 
				new ArrayList<>(Arrays.asList(dir.get(0).listFiles()));
		

		filterJavaFiles(list);
		return list;
	}

	/** �ѷ�java�ļ��ӱ����Ƴ� */
	public static void filterJavaFiles(ArrayList<File> list) {
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i).getName();
			boolean isjavaCode = str.substring(str.lastIndexOf('.')).equals(".java");
			if (!isjavaCode)
				list.remove(i);
		}
	}

	/** ��ȡ�ļ� */
	public static ArrayList<File> getDirectories(File root) {
		ArrayList<File> directories = new ArrayList<>();
		for (int i = 1; i < 34; i++) {
			directories.add(new File(root, "chapter" + i));
		}
		return directories;
	}
}