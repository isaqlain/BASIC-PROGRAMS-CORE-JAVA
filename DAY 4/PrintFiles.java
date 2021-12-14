package P4;

import java.io.File;
import java.util.Arrays;

public class PrintFiles {

	public static void main(String[] args) {

		File[] filesorted = PrintFiles.sortAll("C:\\Windows");

		// print the sorted values
		for (File file : filesorted) {
			if (file.isFile()) {
				print("File : " + file.getName());
			} else if (file.isDirectory()) {
				print("Directory : " + file.getName());
			} else {
				print("Unknown : " + file.getName());
			}

		}

	}

	public static File[] sortAll(String dirName) {

		File directory = new File(dirName);

		File[] filesArray = directory.listFiles();

		// sort all files
		Arrays.sort(filesArray);

		return filesArray;
	}

	public static void print(String string) {

		// Utility method
		System.out.println(string);
	}

}
