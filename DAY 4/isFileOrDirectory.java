package P4;

import java.io.File;

public class CheckFile {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\saqla\\Desktop\\p1.txt");

		System.out.println("C:\\\\Users\\\\saqla\\\\Desktop\\\\p1.txt is Directory " + file.isDirectory());
		System.out.println("C:\\\\Users\\\\saqla\\\\Desktop\\\\p1.txt is File " + file.isFile());
	}

}
