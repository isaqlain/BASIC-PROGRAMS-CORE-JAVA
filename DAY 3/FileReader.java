package P4;

import java.nio.file.*;
import java.io.IOException;

public class FileReader {

	public static void main(String[] args) {

		String file = "C:\\Users\\saqla\\Desktop\\";

		try {
			
			System.out.println(read(file));
		} catch (Exception o) {
			System.out.println("File not found");
		}
	}

	public static String read(String file) throws IOException {

		return new String(Files.readAllBytes(Paths.get(file)));
	}

}
