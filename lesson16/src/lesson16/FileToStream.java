package lesson16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileToStream {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("src/lesson16/FileToStream.java");
		
		Files.lines(path).forEach(System.out :: println);
		System.out.println("=====================");
		
//		new BufferedReader(new FileReader(path.toFile())).lines().forEach(System.out :: println); 
		
		FileReader fr = new FileReader(path.toFile());
		BufferedReader br = new BufferedReader(fr);
		br.lines().forEach(System.out :: println);
		br.close();
		
	}
}
