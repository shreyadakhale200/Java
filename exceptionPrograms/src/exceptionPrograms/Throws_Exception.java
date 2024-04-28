package exceptionPrograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throws_Exception {
	public static void main(String[] args) throws FileNotFoundException {
//		try {
//			readfile("example.txt");
//		} catch (Exception ex) {
//			System.out.println("File not found");
//		} finally {
//			System.out.println("main finally");
//		}
			readfile("example.txt");
	}

	public static void readfile(String filename) throws FileNotFoundException {
		FileReader filereader = new FileReader(filename);
	}
}
