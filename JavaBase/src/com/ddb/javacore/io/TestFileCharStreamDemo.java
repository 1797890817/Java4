package com.ddb.javacore.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileCharStreamDemo {

	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		FileWriter fw;

		try {
			fr = new FileReader("aa.txt");
			fw = new FileWriter("aaCopy.txt");
			int read = fr.read();
			while (read != -1) {
				fw.write(read);
				read = fr.read();
			}
			fr.close();
			fw.close();
			System.out.println("File copy OK!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
