package exceptionPrograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throws_Exception_1 {
	public static void main(String[] args) throws FileNotFoundException {
		try {
			readfile("example.txt");
		} catch (Exception ex) {
			System.out.println("File not found");
		} finally {
			System.out.println("main finally");
		}
	}

	public static void readfile(String filename) throws FileNotFoundException {
		FileReader filereader = new FileReader(filename);
	}
}