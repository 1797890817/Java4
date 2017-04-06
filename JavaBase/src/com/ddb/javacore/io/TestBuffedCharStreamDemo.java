package com.ddb.javacore.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestBuffedCharStreamDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("aa.txt");
		//FileReader fReader = new FileReader("aa.txt");
		FileReader fReader = new FileReader(file);
		FileWriter fWriter = new FileWriter("aaCopy.txt");
		
		BufferedReader bReader = new BufferedReader(fReader);
		BufferedWriter bWriter = new BufferedWriter(fWriter);

		String s = bReader.readLine();
		while (s != null) {
			bWriter.write(s);
			bWriter.newLine();
			s = bReader.readLine();
		}

		bReader.close();
		bWriter.close();
		System.out.println("Copy Ok!");

	}

}
